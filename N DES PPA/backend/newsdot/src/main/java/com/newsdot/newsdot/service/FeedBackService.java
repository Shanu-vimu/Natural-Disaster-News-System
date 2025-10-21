package com.newsdot.newsdot.service;

import com.newsdot.newsdot.dto.ContactUsDTO;
import com.newsdot.newsdot.dto.FeedBackDTO;

public interface FeedBackService {
    String submitFeedBack(FeedBackDTO dto);
    String submitContactUs(ContactUsDTO dto);
}
