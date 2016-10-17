package com.qinguangfeng823.dao;

import com.qinguangfeng823.entity.Tblstudent;

import java.io.Serializable;
import java.util.List;


/**这是一个 接口，定义了各种 对 mysqll数据库 的增删查改 的抽象方法
 * Created by Administrator on 2016/8/23.
 */
public interface TblstuDao {
    /**
     * 查询所有 学生信息的方法
     */
    List<Tblstudent> selectAll();


/**
 * 查询指定 UUID的  学生信息的方法
 */
    Tblstudent selectId(String stuid);

    /**
     * 删除 学生的方法
     */

int delete(Serializable stuid);


    /**
     * 修改 更新，学生信息的方法
     */
    int update(Tblstudent tblstudent);


    /**
     * 增加学生信息的方法
     */
int insert(Tblstudent tblstudent);



}
