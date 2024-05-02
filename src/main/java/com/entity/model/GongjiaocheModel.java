package com.entity.model;

import com.entity.GongjiaocheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongjiaocheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆编号
     */
    private String gongjiaocheName;


    /**
     * 车辆类型
     */
    private Integer gongjiaocheTypes;


    /**
     * 车辆详情
     */
    private String gongjiaocheContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：车辆编号
	 */
    public String getGongjiaocheName() {
        return gongjiaocheName;
    }


    /**
	 * 设置：车辆编号
	 */
    public void setGongjiaocheName(String gongjiaocheName) {
        this.gongjiaocheName = gongjiaocheName;
    }
    /**
	 * 获取：车辆类型
	 */
    public Integer getGongjiaocheTypes() {
        return gongjiaocheTypes;
    }


    /**
	 * 设置：车辆类型
	 */
    public void setGongjiaocheTypes(Integer gongjiaocheTypes) {
        this.gongjiaocheTypes = gongjiaocheTypes;
    }
    /**
	 * 获取：车辆详情
	 */
    public String getGongjiaocheContent() {
        return gongjiaocheContent;
    }


    /**
	 * 设置：车辆详情
	 */
    public void setGongjiaocheContent(String gongjiaocheContent) {
        this.gongjiaocheContent = gongjiaocheContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
