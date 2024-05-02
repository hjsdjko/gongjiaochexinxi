package com.entity.vo;

import com.entity.PaibanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 排班信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("paiban")
public class PaibanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
