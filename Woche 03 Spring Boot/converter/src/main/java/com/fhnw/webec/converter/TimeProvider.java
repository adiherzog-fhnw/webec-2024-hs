package com.fhnw.webec.converter;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class TimeProvider {

    private int count;

    public LocalTime getTime() {
        count++;
        return LocalTime.now();
    }

    public int getCount() {
        return count;
    }
}
