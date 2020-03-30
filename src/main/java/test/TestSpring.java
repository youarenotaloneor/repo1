package test;/*
 *@author lenovo
 *@date 2020/3/23 14:19 :04
 *@description
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;


public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //获取对象
        AccountService as =(AccountService)
                ac.getBean("accountService");

        //调动方法
        as.findAll();

    }
}
