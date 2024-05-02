package com.entity.view;

import com.entity.PaibanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 排班信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("paiban")
public class PaibanView extends PaibanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 siji
			/**
			* 工号
			*/
			private String sijiUuidNumber;
			/**
			* 司机姓名
			*/
			private String sijiName;
			/**
			* 手机号
			*/
			private String sijiPhone;
			/**
			* 司机工龄
			*/
			private String sijiNumber;
			/**
			* 电子邮箱
			*/
			private String sijiEmail;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 假删
			*/
			private Integer sijiDelete;

	public PaibanView() {

	}

	public PaibanView(PaibanEntity paibanEntity) {
		try {
			BeanUtils.copyProperties(this, paibanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set siji

					/**
					* 获取： 工号
					*/
					public String getSijiUuidNumber() {
						return sijiUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setSijiUuidNumber(String sijiUuidNumber) {
						this.sijiUuidNumber = sijiUuidNumber;
					}

					/**
					* 获取： 司机姓名
					*/
					public String getSijiName() {
						return sijiName;
					}
					/**
					* 设置： 司机姓名
					*/
					public void setSijiName(String sijiName) {
						this.sijiName = sijiName;
					}

					/**
					* 获取： 手机号
					*/
					public String getSijiPhone() {
						return sijiPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setSijiPhone(String sijiPhone) {
						this.sijiPhone = sijiPhone;
					}

					/**
					* 获取： 司机工龄
					*/
					public String getSijiNumber() {
						return sijiNumber;
					}
					/**
					* 设置： 司机工龄
					*/
					public void setSijiNumber(String sijiNumber) {
						this.sijiNumber = sijiNumber;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getSijiEmail() {
						return sijiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setSijiEmail(String sijiEmail) {
						this.sijiEmail = sijiEmail;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 假删
					*/
					public Integer getSijiDelete() {
						return sijiDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setSijiDelete(Integer sijiDelete) {
						this.sijiDelete = sijiDelete;
					}




}
