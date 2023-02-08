package com.librarys.entity;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublish;
    private String bookCategory;
    private String bookPrice;
    private String bookIntroduction;

}
