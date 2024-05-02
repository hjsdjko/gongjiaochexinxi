package com.entity.vo;

import com.entity.GongjiaocheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongjiaoche")
public class GongjiaocheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
