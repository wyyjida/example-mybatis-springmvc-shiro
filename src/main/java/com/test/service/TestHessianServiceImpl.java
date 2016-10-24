package com.test.service;

import com.caucho.hessian.server.HessianServlet;
import org.springframework.stereotype.Service;

/**
 * Created by Acting on 2016/10/19.
 */
@Service("testHessianService")
public class TestHessianServiceImpl extends HessianServlet implements TestHessianService {
    @Override
    public String say(String msg) {
        System.out.println("Hello: "+msg);
        return "Hello: "+msg;
    }

    @Override
    public int say(int msg) {
        System.out.println("  overload  method");
        return msg;
    }

    @Override
    public String hello(String name) {
        System.out.println("Hello!  "+name);
        return "Hello!  "+name;
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("a+b = "+a+b);
        return a+b;
    }
}
