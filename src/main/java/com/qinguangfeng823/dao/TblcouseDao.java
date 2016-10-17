package com.qinguangfeng823.dao;

import com.qinguangfeng823.entity.Tblcourse;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblcouseDao {

    /**
     * 查询所有 课程信息的方法
     */
    List<Tblcourse> selectCousAll();


    /**
     * 查询指定 UUID的  课程信息的方法
     */
    Tblcourse selectCousId(Serializable courseId );


    /**
     * 删除课程的方法
     */

    int deleteCous(Serializable courseId);


    /**
     * 修改 更新，课程信息的方法
     */
    int updateCous(Tblcourse tblcourse);



    /**
     * 增加课程信息的方法
     */
    int insertCous(Tblcourse tblcourse);




}
