package com.proper.material.business.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.proper.material.business.pojo.MaterialApplyBean;

@MapperScan
public interface MaterialApplyMapper {

	public List<MaterialApplyBean> selectMaterialApplyList(Map<String, Object> map);

	public int selectMaterialApplyCount(Map<String, Object> map);
	
}
