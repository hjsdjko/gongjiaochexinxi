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
 * 位置信息
 *
 * @author 
 * @email
 */
@TableName("cheliangweizhi")
public class CheliangweizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangweizhiEntity() {

	}

	public CheliangweizhiEntity(T t) {
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
     * 车辆
     */
    @TableField(value = "gongjiaoche_id")

    private Integer gongjiaocheId;


    /**
     * 大体位置
     */
    @TableField(value = "cheliangweizhi_dati")

    private String cheliangweizhiDati;


    /**
     * 行驶方向
     */
    @TableField(value = "cheliangweizhi_fangxiang")

    private String cheliangweizhiFangxiang;


    /**
     * 下一站名称
     */
    @TableField(value = "cheliangweizhi_mingcheng")

    private String cheliangweizhiMingcheng;


    /**
     * 路线详情
     */
    @TableField(value = "cheliangweizhi_content")

    private String cheliangweizhiContent;


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
	 * 设置：车辆
	 */
    public Integer getGongjiaocheId() {
        return gongjiaocheId;
    }
    /**
	 * 获取：车辆
	 */

    public void setGongjiaocheId(Integer gongjiaocheId) {
        this.gongjiaocheId = gongjiaocheId;
    }
    /**
	 * 设置：大体位置
	 */
    public String getCheliangweizhiDati() {
        return cheliangweizhiDati;
    }
    /**
	 * 获取：大体位置
	 */

    public void setCheliangweizhiDati(String cheliangweizhiDati) {
        this.cheliangweizhiDati = cheliangweizhiDati;
    }
    /**
	 * 设置：行驶方向
	 */
    public String getCheliangweizhiFangxiang() {
        return cheliangweizhiFangxiang;
    }
    /**
	 * 获取：行驶方向
	 */

    public void setCheliangweizhiFangxiang(String cheliangweizhiFangxiang) {
        this.cheliangweizhiFangxiang = cheliangweizhiFangxiang;
    }
    /**
	 * 设置：下一站名称
	 */
    public String getCheliangweizhiMingcheng() {
        return cheliangweizhiMingcheng;
    }
    /**
	 * 获取：下一站名称
	 */

    public void setCheliangweizhiMingcheng(String cheliangweizhiMingcheng) {
        this.cheliangweizhiMingcheng = cheliangweizhiMingcheng;
    }
    /**
	 * 设置：路线详情
	 */
    public String getCheliangweizhiContent() {
        return cheliangweizhiContent;
    }
    /**
	 * 获取：路线详情
	 */

    public void setCheliangweizhiContent(String cheliangweizhiContent) {
        this.cheliangweizhiContent = cheliangweizhiContent;
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
        return "Cheliangweizhi{" +
            "id=" + id +
            ", gongjiaocheId=" + gongjiaocheId +
            ", cheliangweizhiDati=" + cheliangweizhiDati +
            ", cheliangweizhiFangxiang=" + cheliangweizhiFangxiang +
            ", cheliangweizhiMingcheng=" + cheliangweizhiMingcheng +
            ", cheliangweizhiContent=" + cheliangweizhiContent +
            ", createTime=" + createTime +
        "}";
    }
}
