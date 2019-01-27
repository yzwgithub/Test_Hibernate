package org.andios.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by ZheWenYang on 2019/1/24
 */
public class HibernateUtil {
    private static final Configuration cfg;
    private static final SessionFactory factory;
    static {
        cfg=new Configuration();
        cfg.configure();
        factory=cfg.buildSessionFactory();
    }

    public static Session getSessionObject(){
        return factory.getCurrentSession();
    }
    public static SessionFactory getFactory(){
        return factory;
    }
}
