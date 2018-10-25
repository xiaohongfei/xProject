package com.proper.material.business.service;

import java.util.List;
import java.util.Map;

import com.proper.material.business.pojo.MaterialSearchBean;

public interface MaterialSearchService {

	public List<MaterialSearchBean> selectMaterialSearchList(Map<String, Object> map);

	public int selectMaterialSearchCount(Map<String, Object> map);

}
