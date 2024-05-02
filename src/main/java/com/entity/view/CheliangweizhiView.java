package com.entity.view;

import com.entity.CheliangweizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 位置信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cheliangweizhi")
public class CheliangweizhiView extends CheliangweizhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gongjiaoche
			/**
			* 车辆编号
			*/
			private String gongjiaocheName;
			/**
			* 车辆类型
			*/
			private Integer gongjiaocheTypes;
				/**
				* 车辆类型的值
				*/
				private String gongjiaocheValue;
			/**
			* 车辆详情
			*/
			private String gongjiaocheContent;

	public CheliangweizhiView() {

	}

	public CheliangweizhiView(CheliangweizhiEntity cheliangweizhiEntity) {
		try {
			BeanUtils.copyProperties(this, cheliangweizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}











				//级联表的get和set gongjiaoche

					/**
					* 获取： 车辆编号
					*/
					public String getGongjiaocheName() {
						return gongjiaocheName;
					}
					/**
					* 设置： 车辆编号
					*/
					public void setGongjiaocheName(String gongjiaocheName) {
						this.gongjiaocheName = gongjiaocheName;
					}

					/**
					* 获取： 车辆类型
					*/
					public Integer getGongjiaocheTypes() {
						return gongjiaocheTypes;
					}
					/**
					* 设置： 车辆类型
					*/
					public void setGongjiaocheTypes(Integer gongjiaocheTypes) {
						this.gongjiaocheTypes = gongjiaocheTypes;
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

					/**
					* 获取： 车辆详情
					*/
					public String getGongjiaocheContent() {
						return gongjiaocheContent;
					}
					/**
					* 设置： 车辆详情
					*/
					public void setGongjiaocheContent(String gongjiaocheContent) {
						this.gongjiaocheContent = gongjiaocheContent;
					}












}
