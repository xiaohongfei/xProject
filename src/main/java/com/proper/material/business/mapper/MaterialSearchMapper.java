package com.proper.material.business.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.proper.material.business.pojo.MaterialSearchBean;

@MapperScan
public interface MaterialSearchMapper {
	
	public List<MaterialSearchBean> selectMaterialSearchList(Map<String, Object> map);

	public int selectMaterialSearchCount(Map<String, Object> map);

}
