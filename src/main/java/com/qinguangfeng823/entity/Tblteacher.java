package com.qinguangfeng823.entity;

import java.io.Serializable;

/**
 * 
 * @author qinguangfeng
 */
public class Tblteacher  implements Serializable {
	/**
	 *  
	 */
	private String teaId;
	/**
	 *  
	 */
	private String teaName;
	/**
	 * 
	 * @param teaId
	 */
	public void setTeaId(String teaId){
		this.teaId = teaId;
	}
	
    /**
     * 
     * @return
     */	
    public String getTeaId(){
    	return teaId;
    }
	/**
	 * 
	 * @param teaName
	 */
	public void setTeaName(String teaName){
		this.teaName = teaName;
	}
	
    /**
     * 
     * @return
     */	
    public String getTeaName(){
    	return teaName;
    }
}