package com.entity.view;

import com.entity.LuqutongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 录取通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
@TableName("luqutongzhi")
public class LuqutongzhiView  extends LuqutongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuqutongzhiView(){
	}
 
 	public LuqutongzhiView(LuqutongzhiEntity luqutongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, luqutongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
