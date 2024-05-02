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
 * 车辆信息
 *
 * @author 
 * @email
 */
@TableName("gongjiaoche")
public class GongjiaocheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongjiaocheEntity() {

	}

	public GongjiaocheEntity(T t) {
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
     * 车辆编号
     */
    @TableField(value = "gongjiaoche_name")

    private String gongjiaocheName;


    /**
     * 车辆类型
     */
    @TableField(value = "gongjiaoche_types")

    private Integer gongjiaocheTypes;


    /**
     * 车辆详情
     */
    @TableField(value = "gongjiaoche_content")

    private String gongjiaocheContent;


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
	 * 设置：车辆编号
	 */
    public String getGongjiaocheName() {
        return gongjiaocheName;
    }
    /**
	 * 获取：车辆编号
	 */

    public void setGongjiaocheName(String gongjiaocheName) {
        this.gongjiaocheName = gongjiaocheName;
    }
    /**
	 * 设置：车辆类型
	 */
    public Integer getGongjiaocheTypes() {
        return gongjiaocheTypes;
    }
    /**
	 * 获取：车辆类型
	 */

    public void setGongjiaocheTypes(Integer gongjiaocheTypes) {
        this.gongjiaocheTypes = gongjiaocheTypes;
    }
    /**
	 * 设置：车辆详情
	 */
    public String getGongjiaocheContent() {
        return gongjiaocheContent;
    }
    /**
	 * 获取：车辆详情
	 */

    public void setGongjiaocheContent(String gongjiaocheContent) {
        this.gongjiaocheContent = gongjiaocheContent;
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
        return "Gongjiaoche{" +
            "id=" + id +
            ", gongjiaocheName=" + gongjiaocheName +
            ", gongjiaocheTypes=" + gongjiaocheTypes +
            ", gongjiaocheContent=" + gongjiaocheContent +
            ", createTime=" + createTime +
        "}";
    }
}
