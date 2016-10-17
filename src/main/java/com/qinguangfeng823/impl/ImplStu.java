package com.qinguangfeng823.impl;

import com.qinguangfeng823.dao.TblstuDao;
import com.qinguangfeng823.entity.Tblstudent;
import com.qinguangfeng823.dao.Utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.util.List;


/**
 * 这是 实现 接类口 的实现
 * 具体 写怎么 增删查改
 * Created by Administrator on 2016/8/23.
 */
public class ImplStu extends Utils implements TblstuDao {





    @Override//==查询全部学生
    public List<Tblstudent> selectAll() {
        try {

            String str = "select * from tblstudent";

            getConnection();//打开连接

            queryRunner = new QueryRunner();



            return  queryRunner.query(connection, str, new BeanListHandler<Tblstudent>(Tblstudent.class));

            /*  Tblstudent tblstudent = new Tblstudent();
            for(Tblstudent tblstu :list ){

                System.out.println(tblstu.getStuId()+"\t"+tblstu.getStuName()+"\t"+tblstu.getStuAge()+"\t"+tblstu.getStuSex());

            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }

        return null;

    }

    @Override//==查询 单个学生
    public Tblstudent selectId(String stuid) {

        try {
            getConnection();
            String str = "SELECT * FROM `tblstudent` where StuId=?";
            queryRunner = new QueryRunner();
            return queryRunner.query(connection, str, new BeanHandler<Tblstudent>(Tblstudent.class), stuid);

            // System.out.println(tblstudent.getStuId().toString()+"\t"+tblstudent.getStuName()+"\t"+tblstudent.getStuAge()+"\t"+tblstudent.getStuSex());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }


        return null;
    }

    @Override//==删除学生信息
    public int delete(Serializable stuid) {

        try {
            getConnection();
            String str = "delete from tblstudent where stuid=?";

            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, stuid);


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }


        return -1;
    }

    @Override//==修改学生信息
    public int update(Tblstudent tblstudent) {

        try {
            getConnection();
            String str = "update  tblstudent set stuname=?, stuage=?, stusex=?  where stuid=?";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblstudent.getStuName(), tblstudent.getStuAge(), tblstudent.getStuSex(), tblstudent.getStuId());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {

            close(connection, null, null);
        }
        return -1;
    }

    @Override//==增加学生信息
    public int insert(Tblstudent tblstudent) {
        try {
            getConnection();
            String str = "INSERT INTO tblstudent (stuid, StuName,StuAge,StuSex) VALUES(?,?,?,?)";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblstudent.getStuId(), tblstudent.getStuName(), tblstudent.getStuAge(), tblstudent.getStuSex());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }

        return -1;
    }
}