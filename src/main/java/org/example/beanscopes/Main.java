package org.example.beanscopes;

import org.example.pojo.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes/beans.xml");
        // singleton
        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("XXXXXXX");
        Account accountSingleton2 = applicationContext.getBean("account1", Account.class);
        System.out.println("account1: " + accountSingleton2.getOwnerName());
        // prototype
        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("YYYYYYY");
        Account accountPrototype2 = applicationContext.getBean("account2", Account.class);
        System.out.println("account2: " + accountPrototype2.getOwnerName());



    }
}
