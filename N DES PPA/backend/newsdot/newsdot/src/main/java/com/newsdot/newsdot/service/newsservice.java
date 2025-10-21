package com.newsdot.newsdot.service;

import com.newsdot.newsdot.dto.newsdto;
import java.util.List;

public interface newsservice 
{
    newsdto addnews(newsdto newsdto);
    newsdto getnewsbyid (long news_id);
    List<newsdto> getallnews();
    newsdto updatenews(long news_id, newsdto updatednews);
    void deletenews (long news_id);
}
