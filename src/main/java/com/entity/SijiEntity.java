package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 司机
 *
 * @author 
 * @email
 */
@TableName("siji")
public class SijiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SijiEntity() {

	}

	public SijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 工号
     */
    @TableField(value = "siji_uuid_number")

    private String sijiUuidNumber;


    /**
     * 司机姓名
     */
    @TableField(value = "siji_name")

    private String sijiName;


    /**
     * 手机号
     */
    @TableField(value = "siji_phone")

    private String sijiPhone;


    /**
     * 司机工龄
     */
    @TableField(value = "siji_number")

    private String sijiNumber;


    /**
     * 电子邮箱
     */
    @TableField(value = "siji_email")

    private String sijiEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 假删
     */
    @TableField(value = "siji_delete")

    private Integer sijiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：工号
	 */
    public String getSijiUuidNumber() {
        return sijiUuidNumber;
    }
    /**
	 * 获取：工号
	 */

    public void setSijiUuidNumber(String sijiUuidNumber) {
        this.sijiUuidNumber = sijiUuidNumber;
    }
    /**
	 * 设置：司机姓名
	 */
    public String getSijiName() {
        return sijiName;
    }
    /**
	 * 获取：司机姓名
	 */

    public void setSijiName(String sijiName) {
        this.sijiName = sijiName;
    }
    /**
	 * 设置：手机号
	 */
    public String getSijiPhone() {
        return sijiPhone;
    }
    /**
	 * 获取：手机号
	 */

    public void setSijiPhone(String sijiPhone) {
        this.sijiPhone = sijiPhone;
    }
    /**
	 * 设置：司机工龄
	 */
    public String getSijiNumber() {
        return sijiNumber;
    }
    /**
	 * 获取：司机工龄
	 */

    public void setSijiNumber(String sijiNumber) {
        this.sijiNumber = sijiNumber;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getSijiEmail() {
        return sijiEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setSijiEmail(String sijiEmail) {
        this.sijiEmail = sijiEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：假删
	 */
    public Integer getSijiDelete() {
        return sijiDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setSijiDelete(Integer sijiDelete) {
        this.sijiDelete = sijiDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Siji{" +
            "id=" + id +
            ", sijiUuidNumber=" + sijiUuidNumber +
            ", sijiName=" + sijiName +
            ", sijiPhone=" + sijiPhone +
            ", sijiNumber=" + sijiNumber +
            ", sijiEmail=" + sijiEmail +
            ", sexTypes=" + sexTypes +
            ", sijiDelete=" + sijiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
