package com.dao;

import com.entity.GongjiaoxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongjiaoxianluView;

/**
 * 公交线路 Dao 接口
 *
 * @author 
 */
public interface GongjiaoxianluDao extends BaseMapper<GongjiaoxianluEntity> {

   List<GongjiaoxianluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
