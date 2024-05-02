package com.entity.model;

import com.entity.GongjiaoxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公交线路
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongjiaoxianluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 线路名称
     */
    private String gongjiaoxianluName;


    /**
     * 线路类型
     */
    private Integer gongjiaoxianluTypes;


    /**
     * 发车时间
     */
    private String gongjiaoxianluShijian;


    /**
     * 全程
     */
    private String quancheng;


    /**
     * 票价
     */
    private Integer gongjiaoxianluNumbe;


    /**
     * 线路详情
     */
    private String gongjiaoxianluContent;


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
	 * 获取：线路名称
	 */
    public String getGongjiaoxianluName() {
        return gongjiaoxianluName;
    }


    /**
	 * 设置：线路名称
	 */
    public void setGongjiaoxianluName(String gongjiaoxianluName) {
        this.gongjiaoxianluName = gongjiaoxianluName;
    }
    /**
	 * 获取：线路类型
	 */
    public Integer getGongjiaoxianluTypes() {
        return gongjiaoxianluTypes;
    }


    /**
	 * 设置：线路类型
	 */
    public void setGongjiaoxianluTypes(Integer gongjiaoxianluTypes) {
        this.gongjiaoxianluTypes = gongjiaoxianluTypes;
    }
    /**
	 * 获取：发车时间
	 */
    public String getGongjiaoxianluShijian() {
        return gongjiaoxianluShijian;
    }


    /**
	 * 设置：发车时间
	 */
    public void setGongjiaoxianluShijian(String gongjiaoxianluShijian) {
        this.gongjiaoxianluShijian = gongjiaoxianluShijian;
    }
    /**
	 * 获取：全程
	 */
    public String getQuancheng() {
        return quancheng;
    }


    /**
	 * 设置：全程
	 */
    public void setQuancheng(String quancheng) {
        this.quancheng = quancheng;
    }
    /**
	 * 获取：票价
	 */
    public Integer getGongjiaoxianluNumbe() {
        return gongjiaoxianluNumbe;
    }


    /**
	 * 设置：票价
	 */
    public void setGongjiaoxianluNumbe(Integer gongjiaoxianluNumbe) {
        this.gongjiaoxianluNumbe = gongjiaoxianluNumbe;
    }
    /**
	 * 获取：线路详情
	 */
    public String getGongjiaoxianluContent() {
        return gongjiaoxianluContent;
    }


    /**
	 * 设置：线路详情
	 */
    public void setGongjiaoxianluContent(String gongjiaoxianluContent) {
        this.gongjiaoxianluContent = gongjiaoxianluContent;
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
