package com.newsdot.newsdot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class contactus {
    private String name;
    private String email;
    private String subject;
    private String message;
}
