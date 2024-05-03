package com.entity.vo;

import com.entity.ZhuanyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专业信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
public class ZhuanyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 专业类别
	 */
	
	private String zhuanyeleibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 招录人数
	 */
	
	private String zhaolurenshu;
		
	/**
	 * 招录要求
	 */
	
	private String zhaoluyaoqiu;
		
	/**
	 * 招录状态
	 */
	
	private String zhaoluzhuangtai;
				
	
	/**
	 * 设置：专业名称
	 */
	 
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
				
	
	/**
	 * 设置：专业类别
	 */
	 
	public void setZhuanyeleibie(String zhuanyeleibie) {
		this.zhuanyeleibie = zhuanyeleibie;
	}
	
	/**
	 * 获取：专业类别
	 */
	public String getZhuanyeleibie() {
		return zhuanyeleibie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：招录人数
	 */
	 
	public void setZhaolurenshu(String zhaolurenshu) {
		this.zhaolurenshu = zhaolurenshu;
	}
	
	/**
	 * 获取：招录人数
	 */
	public String getZhaolurenshu() {
		return zhaolurenshu;
	}
				
	
	/**
	 * 设置：招录要求
	 */
	 
	public void setZhaoluyaoqiu(String zhaoluyaoqiu) {
		this.zhaoluyaoqiu = zhaoluyaoqiu;
	}
	
	/**
	 * 获取：招录要求
	 */
	public String getZhaoluyaoqiu() {
		return zhaoluyaoqiu;
	}
				
	
	/**
	 * 设置：招录状态
	 */
	 
	public void setZhaoluzhuangtai(String zhaoluzhuangtai) {
		this.zhaoluzhuangtai = zhaoluzhuangtai;
	}
	
	/**
	 * 获取：招录状态
	 */
	public String getZhaoluzhuangtai() {
		return zhaoluzhuangtai;
	}
			
}
