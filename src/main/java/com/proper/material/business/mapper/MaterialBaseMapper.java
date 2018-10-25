package com.proper.material.business.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.proper.material.business.pojo.MaterialBaseBean;

@MapperScan
public interface MaterialBaseMapper {
	
	public List<MaterialBaseBean> selectMaterialApplyList(Map<String, Object> map);

	public int selectMaterialBaseBeanCount(Map<String, Object> map);

}
