package com.huanleichen.hello.spring.transaction.service.impl;

import com.huanleichen.hello.spring.transaction.dao.ContentCategoryDao;
import com.huanleichen.hello.spring.transaction.domain.Content;
import com.huanleichen.hello.spring.transaction.domain.ContentCategory;
import com.huanleichen.hello.spring.transaction.service.ContentCategoryService;
import com.huanleichen.hello.spring.transaction.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContentCategoryImpl implements ContentCategoryService {
    @Autowired
    private ContentCategoryDao contentCategoryDao;

    @Autowired
    private ContentService contentService;

    @Override
    public void save(Content content, ContentCategory contentCategory) {
        contentCategoryDao.insert(contentCategory);
        if (true) {
            throw new RuntimeException();
        }
        contentService.save(content);
    }
}
