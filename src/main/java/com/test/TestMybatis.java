package com.test;

import com.mine.entity.User;
import com.mine.service.ArticleServiceImpl;
import com.mine.service.ResourcesService;
import com.mine.service.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Acting on 2016/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
public class TestMybatis {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Resource
    private ArticleServiceImpl articleServiceImpl;

    @Resource
    private ResourcesService resourcesService;


    @Test
    public void test() {
        Logger logger = LogManager.getLogger("mylog");
//        for(int i = 0; i < 50000; i++) {
//            logger.trace("trace level");
//            logger.debug("debug level");
//            logger.info("info level");
//            logger.warn("warn level");
//            logger.error("error level");
//            logger.fatal("fatal level");
//        }
//        try {
//            Thread.sleep(1000 * 61);
//        } catch (InterruptedException e) {
//
//        }
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

//        User user = userService.selectByPrimaryKey(1);
//        System.out.println(user.getUsername());

        User user = new User();
        user.setUsername("Ada");
        user.setUseraddress("Nanda");
        user.setUserage(45);
        logger.info("保存user:  ----");
        System.out.println(this.userServiceImpl.insert(user));

//
//        Article a = this.articleService.selectByPrimaryKey(1);
//        System.out.println(a.getTitle());
//
//        System.out.println(this.resourcesService.selectByPrimaryKey(1).getContent());
    }
}
