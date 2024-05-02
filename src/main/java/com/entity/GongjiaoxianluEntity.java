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
 * 公交线路
 *
 * @author 
 * @email
 */
@TableName("gongjiaoxianlu")
public class GongjiaoxianluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongjiaoxianluEntity() {

	}

	public GongjiaoxianluEntity(T t) {
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
     * 线路名称
     */
    @TableField(value = "gongjiaoxianlu_name")

    private String gongjiaoxianluName;


    /**
     * 线路类型
     */
    @TableField(value = "gongjiaoxianlu_types")

    private Integer gongjiaoxianluTypes;


    /**
     * 发车时间
     */
    @TableField(value = "gongjiaoxianlu_shijian")

    private String gongjiaoxianluShijian;


    /**
     * 全程
     */
    @TableField(value = "quancheng")

    private String quancheng;


    /**
     * 票价
     */
    @TableField(value = "gongjiaoxianlu_numbe")

    private Integer gongjiaoxianluNumbe;


    /**
     * 线路详情
     */
    @TableField(value = "gongjiaoxianlu_content")

    private String gongjiaoxianluContent;


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
	 * 设置：线路名称
	 */
    public String getGongjiaoxianluName() {
        return gongjiaoxianluName;
    }
    /**
	 * 获取：线路名称
	 */

    public void setGongjiaoxianluName(String gongjiaoxianluName) {
        this.gongjiaoxianluName = gongjiaoxianluName;
    }
    /**
	 * 设置：线路类型
	 */
    public Integer getGongjiaoxianluTypes() {
        return gongjiaoxianluTypes;
    }
    /**
	 * 获取：线路类型
	 */

    public void setGongjiaoxianluTypes(Integer gongjiaoxianluTypes) {
        this.gongjiaoxianluTypes = gongjiaoxianluTypes;
    }
    /**
	 * 设置：发车时间
	 */
    public String getGongjiaoxianluShijian() {
        return gongjiaoxianluShijian;
    }
    /**
	 * 获取：发车时间
	 */

    public void setGongjiaoxianluShijian(String gongjiaoxianluShijian) {
        this.gongjiaoxianluShijian = gongjiaoxianluShijian;
    }
    /**
	 * 设置：全程
	 */
    public String getQuancheng() {
        return quancheng;
    }
    /**
	 * 获取：全程
	 */

    public void setQuancheng(String quancheng) {
        this.quancheng = quancheng;
    }
    /**
	 * 设置：票价
	 */
    public Integer getGongjiaoxianluNumbe() {
        return gongjiaoxianluNumbe;
    }
    /**
	 * 获取：票价
	 */

    public void setGongjiaoxianluNumbe(Integer gongjiaoxianluNumbe) {
        this.gongjiaoxianluNumbe = gongjiaoxianluNumbe;
    }
    /**
	 * 设置：线路详情
	 */
    public String getGongjiaoxianluContent() {
        return gongjiaoxianluContent;
    }
    /**
	 * 获取：线路详情
	 */

    public void setGongjiaoxianluContent(String gongjiaoxianluContent) {
        this.gongjiaoxianluContent = gongjiaoxianluContent;
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
        return "Gongjiaoxianlu{" +
            "id=" + id +
            ", gongjiaoxianluName=" + gongjiaoxianluName +
            ", gongjiaoxianluTypes=" + gongjiaoxianluTypes +
            ", gongjiaoxianluShijian=" + gongjiaoxianluShijian +
            ", quancheng=" + quancheng +
            ", gongjiaoxianluNumbe=" + gongjiaoxianluNumbe +
            ", gongjiaoxianluContent=" + gongjiaoxianluContent +
            ", createTime=" + createTime +
        "}";
    }
}
