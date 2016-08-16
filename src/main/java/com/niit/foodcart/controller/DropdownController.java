package com.niit.foodcart.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.foodcart.model.Foodproducts;
import com.niit.foodcart.service.impl.FoodproductsService;

@Controller
public class DropdownController {

	@Autowired
	private FoodproductsService foodproductsservice;
	
	@RequestMapping(value="/veg")
	public String getCategory(Map<String, Object>map)
	{
		Foodproducts foodproducts = new Foodproducts();
		map.put("foodproducts", foodproducts);
		map.put("foodproductsList", foodproductsservice.getAllvegetarianproducts());
		return "category";
	}
	
	@RequestMapping(value="/nonveg")
	public String getCategory1(Map<String, Object>map)
	{
		Foodproducts foodproducts = new Foodproducts();
		map.put("foodproducts", foodproducts);
		map.put("foodproductsList", foodproductsservice.getAllnonvegetarianproducts());
		return "category";
	}
	@RequestMapping(value="/snack")
	public String getCategory2(Map<String, Object>map)
	{
		Foodproducts foodproducts = new Foodproducts();
		map.put("foodproducts", foodproducts);
		map.put("foodproductsList", foodproductsservice.getAllsnacksproducts());
		return "category";
	}
	@RequestMapping(value="/bev")
	public String getCategory3(Map<String, Object>map)
	{
		Foodproducts foodproducts = new Foodproducts();
		map.put("foodproducts", foodproducts);
		map.put("foodproductsList", foodproductsservice.getAllbeveragesproducts());
		return "category";
	}
}

