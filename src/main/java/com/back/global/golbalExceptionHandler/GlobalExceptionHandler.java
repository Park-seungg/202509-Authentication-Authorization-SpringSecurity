package com.back.global.golbalExceptionHandler;

import com.back.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    // NoSuchElementException 요류일때만 작동
    @ResponseBody
    public RsData<Void> handle() {
        return new RsData<>(
                "404-1",
                "헤당 데이터가 존재하지 않습니다."
        );
    }
}
