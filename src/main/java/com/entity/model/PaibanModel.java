package com.entity.model;

import com.entity.PaibanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 排班信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PaibanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String paibanName;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date paibanATime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date paibanBTime;


    /**
     * 司机
     */
    private Integer sijiId;


    /**
     * 排班详情
     */
    private String paibanContent;


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
	 * 获取：标题
	 */
    public String getPaibanName() {
        return paibanName;
    }


    /**
	 * 设置：标题
	 */
    public void setPaibanName(String paibanName) {
        this.paibanName = paibanName;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getPaibanATime() {
        return paibanATime;
    }


    /**
	 * 设置：开始时间
	 */
    public void setPaibanATime(Date paibanATime) {
        this.paibanATime = paibanATime;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getPaibanBTime() {
        return paibanBTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setPaibanBTime(Date paibanBTime) {
        this.paibanBTime = paibanBTime;
    }
    /**
	 * 获取：司机
	 */
    public Integer getSijiId() {
        return sijiId;
    }


    /**
	 * 设置：司机
	 */
    public void setSijiId(Integer sijiId) {
        this.sijiId = sijiId;
    }
    /**
	 * 获取：排班详情
	 */
    public String getPaibanContent() {
        return paibanContent;
    }


    /**
	 * 设置：排班详情
	 */
    public void setPaibanContent(String paibanContent) {
        this.paibanContent = paibanContent;
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
