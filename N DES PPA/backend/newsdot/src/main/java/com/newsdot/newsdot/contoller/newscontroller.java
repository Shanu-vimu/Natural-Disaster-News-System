package com.newsdot.newsdot.contoller;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newsdot.newsdot.dto.newsdto;
import com.newsdot.newsdot.service.newsservice;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/news")
public class newscontroller 
{
    private newsservice newsservice;

    @PostMapping
    public ResponseEntity<newsdto> addnews(@RequestBody newsdto newsdto) {
        newsdto savedto = newsservice.addnews(newsdto);
        return new ResponseEntity<>(savedto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<newsdto> getnewsbyid(@PathVariable("id") long news_id) {
        newsdto newsdto = newsservice.getnewsbyid(news_id);
        return ResponseEntity.ok(newsdto);
    }

    @GetMapping
    public ResponseEntity<List<newsdto>> getallnews() 
    {
        List<newsdto> news = newsservice.getallnews();
        return ResponseEntity.ok(news);
    }

    @PutMapping("{id}")
    public ResponseEntity<newsdto> updateNews(@PathVariable("id") long news_id, @RequestBody newsdto updatednews) {
        System.out.println(updatednews);
        newsdto updatedNewsDto = newsservice.updatenews(news_id, updatednews);
        return ResponseEntity.ok(updatedNewsDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletenews(@PathVariable("id") long news_id) {
        newsservice.deletenews(news_id);
        return ResponseEntity.ok("news delete successfully !");
    }  
}
