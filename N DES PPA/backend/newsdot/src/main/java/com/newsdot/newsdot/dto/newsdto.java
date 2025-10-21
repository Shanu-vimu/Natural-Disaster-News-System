package com.newsdot.newsdot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class newsdto 
{
    private Long news_id;
    private String news_headline;
    private String news_details;
    private String news_location;
    private String news_date;
    private String news_img;
}
