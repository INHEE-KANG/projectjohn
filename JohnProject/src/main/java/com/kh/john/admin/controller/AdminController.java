package com.kh.john.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.john.admin.model.service.AdminService;
import com.kh.john.board.model.vo.Board;
import com.kh.john.common.page.PageBarFactory;
import com.kh.john.member.model.vo.Member;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/admin/adminPage")
	public String adminPage() {
		return "/admin/adminPage";
	}
	
	@RequestMapping("/customer/customerPage")
	public String customerPage() {
		return "/customer/customerPage";
	}
	
	//멤버 리스트 불러오기
	@RequestMapping("/admin/adminMember")
	public ModelAndView adminMember(ModelAndView mv, @RequestParam(value="cPage",required=false, defaultValue="1") int cPage,
																						@RequestParam(value="numPerPage",required=false, defaultValue="10")int numPerPage) {
		List<Member> list = service.selectMemberList(cPage, numPerPage);
		int totalData = service.selectMemberCount();
		
		mv.addObject("pageBar",PageBarFactory.getPageBar(totalData, cPage, numPerPage, "adminMember"));
		
		mv.addObject("totalData",totalData);
		
		mv.addObject("list",list);
		mv.setViewName("admin/adminMember");
		return mv;
	}
	
	@RequestMapping("/admin/adminBoard")
	public ModelAndView adminBoard(ModelAndView mv, 
			@RequestParam(value="cPage",required=false, defaultValue="1")int cPage,
			@RequestParam(value="numPerPage",required=false, defaultValue="10")int numPerPage) {
		
		List<Board> list = service.selectBoardList(cPage, numPerPage);
		int totalData = service.selectBoardCount(); 
		
		mv.addObject("pageBar",PageBarFactory.getPageBar(totalData, cPage, numPerPage, "adminBoard")); //페이지바 PageBarFactory에서 가져오기
		
		mv.addObject("totalData",totalData);
		
		mv.addObject("list", list);
		mv.setViewName("admin/adminBoard");
		return mv;
	}
	
	
	

	
	
	
	
}