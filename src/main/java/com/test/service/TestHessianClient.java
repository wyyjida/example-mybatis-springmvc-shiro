package com.test.service;

import com.caucho.hessian.client.HessianProxyFactory;
import com.mine.entity.User;

import java.net.MalformedURLException;

/**
 * Created by Acting on 2016/10/19.
 */
public class TestHessianClient {
    interface Hello {
        String hello(Object name);
        User selectByPrimaryKey(Integer id);
    }

    interface SumSay {
        String say(String msg);

        int sum(int a, int b);

        int hi(String hi);
    }

    public static void main(String[] args) throws MalformedURLException {
        //TODO 根据实际地址修改
        String url = "http://localhost:8080/hessianServer/userService";
        HessianProxyFactory factory = new HessianProxyFactory();
        Hello basic = (Hello) factory.create(Hello.class, url);
//        System.out.println(basic.hello(123));

        System.out.println(basic.selectByPrimaryKey(1).getUsername());
    }

}
