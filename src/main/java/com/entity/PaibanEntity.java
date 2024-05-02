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
 * 排班信息
 *
 * @author 
 * @email
 */
@TableName("paiban")
public class PaibanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PaibanEntity() {

	}

	public PaibanEntity(T t) {
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
     * 标题
     */
    @TableField(value = "paiban_name")

    private String paibanName;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "paiban_a_time")

    private Date paibanATime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "paiban_b_time")

    private Date paibanBTime;


    /**
     * 司机
     */
    @TableField(value = "siji_id")

    private Integer sijiId;


    /**
     * 排班详情
     */
    @TableField(value = "paiban_content")

    private String paibanContent;


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
	 * 设置：标题
	 */
    public String getPaibanName() {
        return paibanName;
    }
    /**
	 * 获取：标题
	 */

    public void setPaibanName(String paibanName) {
        this.paibanName = paibanName;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getPaibanATime() {
        return paibanATime;
    }
    /**
	 * 获取：开始时间
	 */

    public void setPaibanATime(Date paibanATime) {
        this.paibanATime = paibanATime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getPaibanBTime() {
        return paibanBTime;
    }
    /**
	 * 获取：结束时间
	 */

    public void setPaibanBTime(Date paibanBTime) {
        this.paibanBTime = paibanBTime;
    }
    /**
	 * 设置：司机
	 */
    public Integer getSijiId() {
        return sijiId;
    }
    /**
	 * 获取：司机
	 */

    public void setSijiId(Integer sijiId) {
        this.sijiId = sijiId;
    }
    /**
	 * 设置：排班详情
	 */
    public String getPaibanContent() {
        return paibanContent;
    }
    /**
	 * 获取：排班详情
	 */

    public void setPaibanContent(String paibanContent) {
        this.paibanContent = paibanContent;
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
        return "Paiban{" +
            "id=" + id +
            ", paibanName=" + paibanName +
            ", paibanATime=" + paibanATime +
            ", paibanBTime=" + paibanBTime +
            ", sijiId=" + sijiId +
            ", paibanContent=" + paibanContent +
            ", createTime=" + createTime +
        "}";
    }
}
