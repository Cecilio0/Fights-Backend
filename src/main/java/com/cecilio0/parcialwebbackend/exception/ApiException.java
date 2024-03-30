package com.cecilio0.parcialwebbackend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public record ApiException(@Getter String message, @Getter HttpStatus httpStatus) { }
