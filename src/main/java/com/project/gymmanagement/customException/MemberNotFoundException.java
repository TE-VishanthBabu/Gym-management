package com.project.gymmanagement.customException;

import lombok.Data;

@Data
public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException(String message) {
        super(message);
    }

}
