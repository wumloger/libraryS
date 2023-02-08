package com.librarys.entity;

import lombok.Data;

import java.util.Date;
@Data
public class BookHistory {
    private Integer id;
    private Integer userId  ;
    private Integer bookId;
    private Date dateTime;
    //操作类型
    private Integer type;

}
