package com.huanleichen.hello.spring.transaction.domain;

import lombok.Data;
import java.util.Date;

@Data
public class ContentCategory {
    private Long id;
    private Date created;
    private Date updated;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private ContentCategory parent;
    private Boolean isParent;
}