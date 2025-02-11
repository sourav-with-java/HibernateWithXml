package com.androjavatech4u;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.androjavatech4u.bean.Emp;
import com.mysql.cj.Session;


public class App 
{
    public static void main( String[] args )
    {
        
        Emp emp=new Emp();
       
        emp.setName("hitesh ");
        emp.setCmp("Microsoft");
        Configuration configuration =new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
 SessionFactory sessionFactory=configuration.buildSessionFactory();
 System.out.println(sessionFactory);
org.hibernate.Session openSession =sessionFactory.openSession();
  Transaction biengTransaction =openSession.beginTransaction();
openSession.persist(emp);
biengTransaction.commit();  
    }
    }
