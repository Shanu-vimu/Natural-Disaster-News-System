package com.newsdot.newsdot.contoller;

import com.newsdot.newsdot.dto.FeedBackDTO;
import com.newsdot.newsdot.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;

    @PostMapping
    public ResponseEntity<?> submitFeedBack(@RequestBody FeedBackDTO dto){
        String s = feedBackService.submitFeedBack(dto);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

}
