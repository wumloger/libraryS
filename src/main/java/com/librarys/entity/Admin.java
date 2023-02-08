package com.librarys.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Admin {

    private Integer adminId;
    private String adminName;
    private String adminPwd;
    private String adminEmail;

}
