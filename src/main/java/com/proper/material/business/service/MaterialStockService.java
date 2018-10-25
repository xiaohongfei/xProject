package com.proper.material.business.service;

import java.util.List;
import java.util.Map;

import com.proper.material.business.pojo.MaterialStockBean;

public interface MaterialStockService {
	
	public List<MaterialStockBean> selectMaterialStockList(Map<String, Object> map);

	public int selectMaterialStockCount(Map<String, Object> map);

}
