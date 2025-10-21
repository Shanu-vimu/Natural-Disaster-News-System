package com.newsdot.newsdot.service.implementation;

import com.newsdot.newsdot.dto.ContactUsDTO;
import com.newsdot.newsdot.dto.FeedBackDTO;
import com.newsdot.newsdot.service.FeedBackService;
import com.newsdot.newsdot.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    MailService mailService;

    @Override
    public String submitFeedBack(FeedBackDTO dto) {
        mailService.mainSender(dto.getContent(), dto.getEmail(),"Feed Back");
        return "Feedback submit done";
    }

    @Override
    public String submitContactUs(ContactUsDTO dto) {

        String message = "<h4>Hello, I am "+dto.getName()+"</h4><p>"+dto.getMessage()+"</p>";

        mailService.mainSender(message, dto.getEmail(),dto.getSubject());
        return null;
    }
}
