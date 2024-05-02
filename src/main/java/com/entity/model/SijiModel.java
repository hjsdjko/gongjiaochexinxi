package com.entity.model;

import com.entity.SijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 司机
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SijiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 假删
     */
    private Integer sijiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：工号
	 */
    public String getSijiUuidNumber() {
        return sijiUuidNumber;
    }


    /**
	 * 设置：工号
	 */
    public void setSijiUuidNumber(String sijiUuidNumber) {
        this.sijiUuidNumber = sijiUuidNumber;
    }
    /**
	 * 获取：司机姓名
	 */
    public String getSijiName() {
        return sijiName;
    }


    /**
	 * 设置：司机姓名
	 */
    public void setSijiName(String sijiName) {
        this.sijiName = sijiName;
    }
    /**
	 * 获取：手机号
	 */
    public String getSijiPhone() {
        return sijiPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setSijiPhone(String sijiPhone) {
        this.sijiPhone = sijiPhone;
    }
    /**
	 * 获取：司机工龄
	 */
    public String getSijiNumber() {
        return sijiNumber;
    }


    /**
	 * 设置：司机工龄
	 */
    public void setSijiNumber(String sijiNumber) {
        this.sijiNumber = sijiNumber;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getSijiEmail() {
        return sijiEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setSijiEmail(String sijiEmail) {
        this.sijiEmail = sijiEmail;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：假删
	 */
    public Integer getSijiDelete() {
        return sijiDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setSijiDelete(Integer sijiDelete) {
        this.sijiDelete = sijiDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
