package com.example.koinonia1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Message {
    String message = "";
    String href= "";

    public Message(String message, String href){
        this.message = message;
        this.href = href;
    }
}
