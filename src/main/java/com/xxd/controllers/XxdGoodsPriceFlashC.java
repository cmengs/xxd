package com.xxd.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxd.models.XxdGoodsPriceFlash;
import com.xxd.services.impls.XxdGoodsPriceFlashSI;
import com.xxd.utils.Constans;

@Controller
@RequestMapping(value = "/XxdGoodsPriceFlash")
public class XxdGoodsPriceFlashC {

	@Autowired
	private XxdGoodsPriceFlashSI serviceImpl;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public HashMap<String, Object> insert(XxdGoodsPriceFlash model){
		Integer con = serviceImpl.insert(model);
		return Constans.returnCon(con, null);
	}

	@RequestMapping(value = "/deleteByPrimaryKey")
	@ResponseBody
	public HashMap<String, Object> deleteByPrimaryKey(Integer primaryKey){
		Integer con = serviceImpl.deleteByPrimaryKey(primaryKey);
		return Constans.returnCon(con, null);
	}

	@RequestMapping(value = "/updateByPrimaryKeySelective")
	@ResponseBody
	public HashMap<String, Object> updateByPrimaryKeySelective(XxdGoodsPriceFlash model){
		Integer con = serviceImpl.updateByPrimaryKeySelective(model);
		return Constans.returnCon(con, null);
	}

	@RequestMapping(value = "/selectByPrimaryKey")
	@ResponseBody
	public HashMap<String, Object> selectByPrimaryKey(Integer primaryKey){
		XxdGoodsPriceFlash con = serviceImpl.selectByPrimaryKey(primaryKey);
		return Constans.returnCon(null == con ? 1 : -1, con);
	}

	@RequestMapping(value = "/selectAll")
	@ResponseBody
	public HashMap<String, Object> selectAll(){
		ArrayList<XxdGoodsPriceFlash> con = serviceImpl.selectAll();
		return Constans.returnCon(null == con ? 1 : -1, con);
	}

}
