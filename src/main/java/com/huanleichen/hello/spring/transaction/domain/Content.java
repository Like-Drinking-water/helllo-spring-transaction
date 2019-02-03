package com.huanleichen.hello.spring.transaction.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Content {
    private Long id;
    private Date created;
    private Date updated;
    private String title;

    private String subTitle;

    private String titleDesc;
    private String url;
    private String pic;
    private String pic2;

    private String content;

    private ContentCategory contentCategory;
}
