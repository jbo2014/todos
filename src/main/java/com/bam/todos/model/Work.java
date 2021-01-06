package com.bam.todos.model;

import lombok.Data;

import java.util.Date;

@Data
public class Work {
     private int id;
     private int source;
     private String title;
     private String description;
     private double planHour;
     private Date planTime;
     private double actualHour;
     private Date actualTime;
     private short status;
}
