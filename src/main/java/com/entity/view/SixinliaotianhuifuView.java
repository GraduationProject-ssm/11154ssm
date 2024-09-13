package com.entity.view;

import com.entity.SixinliaotianhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 私信聊天回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@TableName("sixinliaotianhuifu")
public class SixinliaotianhuifuView  extends SixinliaotianhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SixinliaotianhuifuView(){
	}
 
 	public SixinliaotianhuifuView(SixinliaotianhuifuEntity sixinliaotianhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, sixinliaotianhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
