package com.proper.material.business.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.proper.material.business.mapper.MaterialBaseMapper;
import com.proper.material.business.pojo.MaterialBaseBean;
import com.proper.material.business.service.MaterialBaseService;

@Service
public class MaterialBaseServiceImpl implements MaterialBaseService {
	
	@Resource
	private MaterialBaseMapper mapper;
	
	public List<MaterialBaseBean> selectMaterialApplyList(Map<String, Object> map) {
		
		return null;
	}

	public int selectMaterialBaseBeanCount(Map<String, Object> map) {
		
		return 0;
	}

}
