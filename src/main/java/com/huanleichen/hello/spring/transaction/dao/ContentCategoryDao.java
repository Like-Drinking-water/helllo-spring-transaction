package com.huanleichen.hello.spring.transaction.dao;

import com.huanleichen.hello.spring.transaction.domain.ContentCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentCategoryDao {
    void insert(ContentCategory contentCategory);
}
