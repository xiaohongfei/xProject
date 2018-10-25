package com.proper.material.business.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.proper.material.business.mapper.MaterialApplyMapper;
import com.proper.material.business.pojo.MaterialApplyBean;
import com.proper.material.business.service.MaterialApplyService;

@Service
public class MaterialApplyServiceImpl implements MaterialApplyService {
	
	@Resource
	private MaterialApplyMapper mapper;
	
	public List<MaterialApplyBean> selectMaterialApplyList(Map<String, Object> map) {
		
		return null;
	}

	public int selectMaterialApplyCount(Map<String, Object> map) {

		return 0;
	}

}
