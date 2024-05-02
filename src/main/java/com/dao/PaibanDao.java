package com.dao;

import com.entity.PaibanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PaibanView;

/**
 * 排班信息 Dao 接口
 *
 * @author 
 */
public interface PaibanDao extends BaseMapper<PaibanEntity> {

   List<PaibanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
