package com.huanghongxi.chiguoguoservice.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SearchLog {

    private String searchKey;
    private Date searchTime;
    private Integer count;
}
