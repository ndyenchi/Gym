package com.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gym.entity.*;
import com.gym.service.KhachHangService;
@Controller
public class TestController {
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	// khách hàng
	@Autowired
	private KhachHangService customerService;
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
		public ModelAndView customerPage() {
			ModelAndView mav = new ModelAndView("hello1");
			List<KhachHang> customerServices = customerService.listAll();
			mav.addObject("customerServices", customerServices);
			return mav;
		}

}
