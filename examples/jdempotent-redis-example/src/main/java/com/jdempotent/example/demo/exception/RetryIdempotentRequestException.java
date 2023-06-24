package com.jdempotent.example.demo.exception;

import jakarta.mail.MessagingException;

public class RetryIdempotentRequestException extends RuntimeException {
    public RetryIdempotentRequestException(MessagingException e) {
    }
}
