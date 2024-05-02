package com.dao;

import com.entity.GongjiaocheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongjiaocheView;

/**
 * 车辆信息 Dao 接口
 *
 * @author 
 */
public interface GongjiaocheDao extends BaseMapper<GongjiaocheEntity> {

   List<GongjiaocheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
