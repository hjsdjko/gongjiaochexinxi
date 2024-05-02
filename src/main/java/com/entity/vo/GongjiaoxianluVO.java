package com.entity.vo;

import com.entity.GongjiaoxianluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公交线路
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongjiaoxianlu")
public class GongjiaoxianluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
