package com.proper.material.business.service;

import java.util.List;
import java.util.Map;

import com.proper.material.business.pojo.MaterialApplyBean;

public interface MaterialApplyService {
	
	public List<MaterialApplyBean> selectMaterialApplyList(Map<String,Object> map);
	
	public int selectMaterialApplyCount(Map<String,Object> map);

}
