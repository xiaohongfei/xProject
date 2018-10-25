package com.proper.material.business.service;

import java.util.List;
import java.util.Map;

import com.proper.material.business.pojo.MaterialBaseBean;

public interface MaterialBaseService {

	public List<MaterialBaseBean> selectMaterialApplyList(Map<String, Object> map);

	public int selectMaterialBaseBeanCount(Map<String, Object> map);

}
