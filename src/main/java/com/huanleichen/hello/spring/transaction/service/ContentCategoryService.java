package com.huanleichen.hello.spring.transaction.service;

import com.huanleichen.hello.spring.transaction.domain.Content;
import com.huanleichen.hello.spring.transaction.domain.ContentCategory;

public interface ContentCategoryService {
    void save(Content content, ContentCategory contentCategory);
}
