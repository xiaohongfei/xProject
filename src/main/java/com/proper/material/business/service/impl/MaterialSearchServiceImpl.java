package com.proper.material.business.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.proper.material.business.mapper.MaterialSearchMapper;
import com.proper.material.business.pojo.MaterialSearchBean;
import com.proper.material.business.service.MaterialSearchService;

@Service
public class MaterialSearchServiceImpl implements MaterialSearchService {
	
	@Resource
	private MaterialSearchMapper mapper;
	
	public List<MaterialSearchBean> selectMaterialSearchList(Map<String, Object> map) {
		
		return null;
	}

	public int selectMaterialSearchCount(Map<String, Object> map) {
		
		return 0;
	}

}
