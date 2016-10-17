package com.qinguangfeng823.entity;

import java.io.Serializable;

/**
 * 
 * @author qinguangfeng
 */
public class Tblscore implements Serializable {
	/**
	 *  
	 */
	private String stuId;
	/**
	 *  
	 */
	private String courseId;
	/**
	 *  
	 */
	private Float score;
	/**
	 *  
	 */
	private Integer pkScore;
	/**
	 * 
	 * @param stuId
	 */
	public void setStuId(String stuId){
		this.stuId = stuId;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuId(){
    	return stuId;
    }
	/**
	 * 
	 * @param courseId
	 */
	public void setCourseId(String courseId){
		this.courseId = courseId;
	}
	
    /**
     * 
     * @return
     */	
    public String getCourseId(){
    	return courseId;
    }
	/**
	 * 
	 * @param score
	 */
	public void setScore(Float score){
		this.score = score;
	}
	
    /**
     * 
     * @return
     */	
    public Float getScore(){
    	return score;
    }
	/**
	 * 
	 * @param pkScore
	 */
	public void setPkScore(Integer pkScore){
		this.pkScore = pkScore;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getPkScore(){
    	return pkScore;
    }
}