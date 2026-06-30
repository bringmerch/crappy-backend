package bringmerch.crappy.backend.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 * Package Name: bringmerch.crappy.backend.service
 * File Name: MyServlet
 * Description:
 * author: munke
 *
 * @version 1.0
 * @see bringmerch.crappy.backend.servlet
 * @since 2026-06-30
 * <p>
 * Modification Information
 * 수정일          수정자                    수정내용
 * --------- ------------------- -------------------------------
 * 2026-06-30        munke                   최초개정
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Type", "application/json; charset=UTF-8");

        String json = "[{\"id\":1, \"name\":\"홍길동\"}, {\"id\":2, \"name\":\"이순신\"}]";

        response.getWriter().write(json);
    }
}
