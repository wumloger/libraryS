package com.librarys.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class admin {

    private Integer adminId;
    private String adminName;
    private String adminPwd;
    private String adminEmail;

}
