package com.newsdot.newsdot.mapper;

import com.newsdot.newsdot.dto.newsdto;
import com.newsdot.newsdot.entity.news;

public class newsmapper 
{
   public static newsdto toNewsDto(news news)
   {
       return new newsdto
         (
              news.getNews_id(),
              news.getNews_headline(),
              news.getNews_details(),
              news.getNews_location(),
              news.getNews_date(),
              news.getNews_img()
         );
   }

   public static news toNews(newsdto newsdto)
   {
       return new news
         (
            newsdto.getNews_id(),
            newsdto.getNews_headline(),
            newsdto.getNews_details(),
            newsdto.getNews_location(),
            newsdto.getNews_img(),
            newsdto.getNews_date()
         );
   }
}
