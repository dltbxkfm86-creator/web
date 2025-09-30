package com.kh.java.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.java.member.model.service.MemberService;
import com.kh.java.member.model.vo.Member;

@WebServlet("/Login.me")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * <HttpServletRequest, HttpServletResponse>
		 * 
		 * - request : 서버로 요청 보낼 때의 정보(요청 시 전달값, 요청 전송방식, 사용자 정보)
		 * - response : 요청에 대한 응답데이터를 만들 때 사용
		 * 
		 */
		// 절차
		// 1) GET? POST? => 요청 방식이 POST방식이라면 인코딩 작업
		request.setCharacterEncoding("UTF-8");
		
		// 2) 요청 시 전달값이 있나 없나
		// request.getParameter("키값") : String
		// request.getParameterValue("키값") : String[]
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Member member = new Member();
		member.setUserId(userId);
		member.setUserPwd(userPwd);
		//System.out.println(member);
		
		Member loginMember = new MemberService().login(member);
		//System.out.println(loginMember);
		if(loginMember != null) {
			
			// 스텝 1. session의 Attribute로 사용자 정보 추가
			// session의 타입 : HttpSession
			// => 현재 요청 보내는 Client의 Session : request.getSession
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", loginMember);
			
			// 2
			/*
			request.getRequestDispatcher("/index.jsp")
			       .forward(request, response);
			*/
			session.setAttribute("alertMsg", "로그인 성공");
			response.sendRedirect("/kh");
		} else {
			request.setAttribute("msg", "로그인에 실패했습니다");
			request.getRequestDispatcher("/WEB-INF/views/common/result_page.jsp")
			       .forward(request, response);
		}
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
