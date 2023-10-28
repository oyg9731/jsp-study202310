package com.jsp.chap01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//역할: HTTP요청 응답 처리에서 필요한 공통적인 부분을 쉽게 해결해주는 자바 API
@WebServlet("/hello") // 우리 웹서버에 /hello라는 URL로 요청이 오면 이 서블릿을 실행시켜라
public class HelloServlet extends HttpServlet {

    // 기본생성자
    public HelloServlet(){
        System.out.println("\n\n\n헬로 서블릿 작동시작!\n\n\n");
    }

    // 파싱된 요청정보 얻는 방법

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 클라이언트 요청방식
        String method = req.getMethod();

        //요청 URL
        String requestURI = req.getRequestURI();

        // 요청 헤더 읽기
        String header = req.getHeader("Cache-Control");

        System.out.println("method = " + method);
        System.out.println("requestURI = " + requestURI);
        System.out.println("header = " + header);

        // 쿼리 파라미터 읽기
        String keyword = req.getParameter("keyword");
        System.out.println("keyword = " + keyword);
        String age = req.getParameter("age");
        System.out.println("age = " + age);

    }
}
