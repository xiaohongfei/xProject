package com.proper.material.business.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proper.material.business.service.MaterialApplyService;

@Controller
@RequestMapping(value = "/base")
public class MaterialBaseController {
	
	@Resource
	private MaterialApplyService service;
	
	@RequestMapping(value = "/show")
	public String show(HttpServletRequest request, HttpServletResponse response) {
		service.selectMaterialApplyList(null);
		return "home";
	}

}
