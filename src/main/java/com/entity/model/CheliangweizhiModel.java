package com.entity.model;

import com.entity.CheliangweizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 位置信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangweizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆
     */
    private Integer gongjiaocheId;


    /**
     * 大体位置
     */
    private String cheliangweizhiDati;


    /**
     * 行驶方向
     */
    private String cheliangweizhiFangxiang;


    /**
     * 下一站名称
     */
    private String cheliangweizhiMingcheng;


    /**
     * 路线详情
     */
    private String cheliangweizhiContent;


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
	 * 获取：车辆
	 */
    public Integer getGongjiaocheId() {
        return gongjiaocheId;
    }


    /**
	 * 设置：车辆
	 */
    public void setGongjiaocheId(Integer gongjiaocheId) {
        this.gongjiaocheId = gongjiaocheId;
    }
    /**
	 * 获取：大体位置
	 */
    public String getCheliangweizhiDati() {
        return cheliangweizhiDati;
    }


    /**
	 * 设置：大体位置
	 */
    public void setCheliangweizhiDati(String cheliangweizhiDati) {
        this.cheliangweizhiDati = cheliangweizhiDati;
    }
    /**
	 * 获取：行驶方向
	 */
    public String getCheliangweizhiFangxiang() {
        return cheliangweizhiFangxiang;
    }


    /**
	 * 设置：行驶方向
	 */
    public void setCheliangweizhiFangxiang(String cheliangweizhiFangxiang) {
        this.cheliangweizhiFangxiang = cheliangweizhiFangxiang;
    }
    /**
	 * 获取：下一站名称
	 */
    public String getCheliangweizhiMingcheng() {
        return cheliangweizhiMingcheng;
    }


    /**
	 * 设置：下一站名称
	 */
    public void setCheliangweizhiMingcheng(String cheliangweizhiMingcheng) {
        this.cheliangweizhiMingcheng = cheliangweizhiMingcheng;
    }
    /**
	 * 获取：路线详情
	 */
    public String getCheliangweizhiContent() {
        return cheliangweizhiContent;
    }


    /**
	 * 设置：路线详情
	 */
    public void setCheliangweizhiContent(String cheliangweizhiContent) {
        this.cheliangweizhiContent = cheliangweizhiContent;
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
