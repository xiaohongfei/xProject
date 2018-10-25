package com.proper.material.business.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.proper.material.business.mapper.MaterialStockMapper;
import com.proper.material.business.pojo.MaterialStockBean;
import com.proper.material.business.service.MaterialStockService;

@Service
public class MaterialStockServiceImpl implements MaterialStockService {
	
	@Resource
	private MaterialStockMapper mapper;
	
	public List<MaterialStockBean> selectMaterialStockList(Map<String, Object> map) {
		
		return null;
	}

	public int selectMaterialStockCount(Map<String, Object> map) {
		
		return 0;
	}

}
