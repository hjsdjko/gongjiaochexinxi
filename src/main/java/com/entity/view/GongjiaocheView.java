package com.entity.view;

import com.entity.GongjiaocheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车辆信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongjiaoche")
public class GongjiaocheView extends GongjiaocheEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 车辆类型的值
		*/
		private String gongjiaocheValue;



	public GongjiaocheView() {

	}

	public GongjiaocheView(GongjiaocheEntity gongjiaocheEntity) {
		try {
			BeanUtils.copyProperties(this, gongjiaocheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 车辆类型的值
			*/
			public String getGongjiaocheValue() {
				return gongjiaocheValue;
			}
			/**
			* 设置： 车辆类型的值
			*/
			public void setGongjiaocheValue(String gongjiaocheValue) {
				this.gongjiaocheValue = gongjiaocheValue;
			}











}
