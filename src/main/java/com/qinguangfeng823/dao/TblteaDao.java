package com.qinguangfeng823.dao;


import com.qinguangfeng823.entity.Tblteacher;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblteaDao {


    /**
     * 查询所有 老师信息的方法
     */
    List<Tblteacher> selectTeaAll();


    /**
     * 查询指定 UUID的   老师信息的方法
     */
    Tblteacher selectTeaId(Serializable teaid );


    /**
     * 删除 老师的方法
     */

    int deleteTea(Serializable teaid);


    /**
     * 修改 更新， 老师信息的方法
     */
    int updateTea(Tblteacher tblteacher);



    /**
     * 增加 老师信息的方法
     */
    int insertTea(Tblteacher tblteacher);


}
