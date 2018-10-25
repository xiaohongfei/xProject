package com.proper.material.business.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.proper.material.business.pojo.MaterialStockBean;

@MapperScan
public interface MaterialStockMapper {
	
	public List<MaterialStockBean> selectMaterialStockList(Map<String, Object> map);

	public int selectMaterialStockCount(Map<String, Object> map);

}
