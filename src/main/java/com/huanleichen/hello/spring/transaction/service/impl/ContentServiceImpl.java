package com.huanleichen.hello.spring.transaction.service.impl;

import com.huanleichen.hello.spring.transaction.dao.ContentDao;
import com.huanleichen.hello.spring.transaction.domain.Content;
import com.huanleichen.hello.spring.transaction.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentDao dao;

    @Override
    public void save(Content content) {
        dao.insert(content);
    }
}
