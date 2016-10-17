package Junit_Test;


import com.qinguangfeng823.entity.Tblcourse;
import com.qinguangfeng823.entity.Tblstudent;
import com.qinguangfeng823.impl.ImplCous;
import com.qinguangfeng823.impl.ImplStu;
import org.junit.After;
import org.junit.Test;

import java.util.List;

/**
 * 这里是  专门用来 测试 的类
 * Created by Administrator on 2016/8/23.
 */


public class Test_Juint_Cour {


    Tblcourse tblcourse = new Tblcourse();


    /**
     * 测试 查询全部的 方法
     */
    @Test
    public void testSelectCousAll() {
        ImplCous implCous = new ImplCous();

       List<Tblcourse> list = implCous.selectCousAll();
        for(Tblcourse tblcour: list){

            System.out.println(tblcour.getCourseId()+"\t"+tblcour.getCourseName()+"\t"+tblcour.getTeaId());
        }


    }


    /**
     * 测试 ==查询 单个学生
     */
    @Test
    public void testSelectCousId() {

        ImplCous implCous = new ImplCous();

        Tblcourse   str= implCous.selectCousId("001");

        System.out.println(str.getCourseId()+"\t"+str.getCourseName()+"\t"+str.getTeaId());


    }


    /**
     * 测试 //==删除学生信息
     */
    @Test
    public void testDeleteCous() {

        ImplCous implCous = new ImplCous();

        int result = implCous.deleteCous("018");
        System.out.println("受影响"+result+"行！");

    }


    /**
     * 测试 ==修改学生信息
     */
    @Test
    public void testupdateCous() {

        ImplCous implCous = new ImplCous();


        tblcourse.setCourseId("018");
        tblcourse.setCourseName("陆小凤");
        tblcourse.setTeaId("002");



        int result = implCous.updateCous(tblcourse);

        System.out.println("受影响"+result+"行！");
    }


    /**
     * 测试增加学生信息
     */
    @Test
    public void testInsertCous() {

        ImplCous implCous = new ImplCous();
        tblcourse.setCourseId("018");
        tblcourse.setCourseName("苏小小");
        tblcourse.setTeaId("20");


       int result= implCous.insertCous(tblcourse);
        System.out.println("受影响"+result+"行！");

    }


    @After
    public void end() {

        System.out.println("程序结束了");
    }


}
