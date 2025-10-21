package com.newsdot.newsdot.service;

import com.newsdot.newsdot.dto.FeedBackDTO;
import com.newsdot.newsdot.dto.contactus;

public interface FeedBackService {
    String submitFeedBack(FeedBackDTO dto);
    String submitcontactus(contactus dto);
}
