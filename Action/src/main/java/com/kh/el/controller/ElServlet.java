package com.kh.el.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/El.do")
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ElServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// request와 session에 동일한 키값으로 Attribute추가
				request.setAttribute("key", "reques Key");
				session.setAttribute("key", "session Key");
				
				// DB에서 작업한 요청 처리 결과
				
				//숫자값
				request.setAttribute("small", 3);
				request.setAttribute("big", 10);
				
				// 문자열
				request.setAttribute("strOne", "안녕");
				request.setAttribute("strTwo", new String("안녕"));
				
				// 객체
				request.setAttribute("obj", new Person("콩쥐", 20, "콩쥐네집"));
				
				// 리스트
				request.setAttribute("list", new ArrayList());
				
				// 응답 뷰 배정 -> 포워딩
				request.getRequestDispatcher("/WEB-INF/views/01_el.jsp")
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
