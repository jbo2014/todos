package com.bam.todos.model;

import lombok.Data;

@Data
public class JResult<T> {
    private int code;
    private String msg;
    private T data;
}
