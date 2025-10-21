package com.newsdot.newsdot.service.implementation;

import com.newsdot.newsdot.dto.FeedBackDTO;
import com.newsdot.newsdot.dto.contactus;
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
        mailService.mainSender(dto.getContent(), dto.getEmail(),{"s"});
        return "Feedback submit done";
    }

    @Override
    public String submitcontactus(contactus dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submitcontactus'");
    }
}
