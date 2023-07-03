package com.anataarisa.pimtool.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Your Project Number is duplicated")
public class IDOrProjectIDDuplicateException extends Exception {

    public IDOrProjectIDDuplicateException(String error) {
        super(error);
    }
}
