package com.newsdot.newsdot.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newsdot.newsdot.dto.newsdto;
import com.newsdot.newsdot.entity.news;
import com.newsdot.newsdot.exception.nodatafound;
import com.newsdot.newsdot.mapper.newsmapper;
import com.newsdot.newsdot.service.newsservice;
import com.newsdot.newsdot.repository.newsrepository;
import java.util.List;
import java.util.stream.Collectors;

@Service 
public class newsserviceimpl implements newsservice {

    private final newsrepository newsrepository;

    @Autowired 
    public newsserviceimpl(newsrepository newsrepository) {
        this.newsrepository = newsrepository;
    }

    @Override
    public newsdto addnews(newsdto newsdto) {
        news news = newsmapper.toNews(newsdto);
        news saved = newsrepository.save(news);
        return newsmapper.toNewsDto(saved);
    }

    @Override
    public newsdto getnewsbyid(long news_id) {
        news news = newsrepository.findById(news_id)
                .orElseThrow(() -> new nodatafound("No news found with given id : " + news_id));
        return newsmapper.toNewsDto(news);
    }

    @Override
    public List<newsdto> getallnews() {
        List<news> getallNews = newsrepository.findAll();
        return getallNews.stream().map(newsmapper::toNewsDto).collect(Collectors.toList());
    }

    @Override
    public newsdto updatenews (long news_id, newsdto updatednews)
    {
        news news = newsrepository.findById(news_id).orElseThrow(() -> new nodatafound("No news found with given id : " + news_id));
        
        news.setNews_headline(updatednews.getNews_headline());
        news.setNews_details(updatednews.getNews_details());
        news.setNews_location(updatednews.getNews_location());
        news.setNews_date(updatednews.getNews_date());
        news.setNews_img(updatednews.getNews_img());

        news updatenewsobj = newsrepository.save(news);
        return newsmapper.toNewsDto(updatenewsobj);
    }

    @Override
    public void deletenews(long news_id) 
    {
       news news = newsrepository.findById(news_id).orElseThrow(() -> new nodatafound("News found with given id : " +news_id));
       newsrepository.deleteById(news_id);
    }
}
