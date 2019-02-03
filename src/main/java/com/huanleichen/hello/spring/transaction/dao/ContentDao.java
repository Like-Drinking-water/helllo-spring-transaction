package com.huanleichen.hello.spring.transaction.dao;

import com.huanleichen.hello.spring.transaction.domain.Content;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentDao {
    void insert(Content content);
}
