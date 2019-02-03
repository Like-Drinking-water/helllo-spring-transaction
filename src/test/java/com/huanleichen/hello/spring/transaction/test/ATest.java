package com.huanleichen.hello.spring.transaction.test;

import com.huanleichen.hello.spring.transaction.domain.Content;
import com.huanleichen.hello.spring.transaction.domain.ContentCategory;
import com.huanleichen.hello.spring.transaction.service.ContentCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class ATest {
    @Autowired
    private ContentCategoryService service;

    @Test
    public void testService() {
        Content content = new Content();
        content.setContentCategory(new ContentCategory());
        content.getContentCategory().setId(2L);
        content.setContent("sdasd");
        content.setTitle("sasdasd");
        ContentCategory contentCategory = new ContentCategory();
        contentCategory.setParent(new ContentCategory());
        contentCategory.getParent().setId(12L);
        contentCategory.setName("sdasdas");
        service.save(content, contentCategory);
    }
}
