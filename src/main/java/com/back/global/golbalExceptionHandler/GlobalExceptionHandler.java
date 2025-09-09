package com.back.global.golbalExceptionHandler;

import com.back.global.rsData.RsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<RsData<Void>> handle() {
        return new ResponseEntity<>(
                new RsData<>(
                "404-1",
                "헤당 데이터가 존재하지 않습니다."
             ),
                NOT_FOUND
        );
    }
}
