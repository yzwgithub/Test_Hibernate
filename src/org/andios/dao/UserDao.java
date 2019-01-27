package org.andios.dao;

import org.andios.antity.User;
import org.andios.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


/**
 * Created by ZheWenYang on 2019/1/24
 */
public class UserDao {
    public void save(){
        Session session=null;
        Transaction transaction=null;
        try{
            //获取Session对象
            session=HibernateUtil.getSessionObject();
            //开启事务
            transaction=session.beginTransaction();
            Query query =session.createQuery("from User ");
            List<User>list=query.list();
            for (User user:list){
                System.out.println(user);
            }

            transaction.commit();

        }catch (Exception e){
            transaction.rollback();
        }finally {
//            session.close();
        }






    }
}
