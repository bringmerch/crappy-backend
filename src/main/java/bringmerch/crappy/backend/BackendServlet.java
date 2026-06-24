package bringmerch.crappy.backend;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "backendServlet", value = "/") // "/" = 디폴트서블릿으로 작동
public class BackendServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.addCookie(new Cookie("age", "31"));
        String sb = """
                <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <title>Purple Background Example</title>
                        <style>
                            body {
                                background-color: purple;
                                color: white; /* Makes text easier to read on a dark background */
                                font-family: sans-serif;
                                padding: 20px;
                            }
                        </style>
                    </head>
                    <body>
                        <h1>roger that.</h1>
                    </body>
                    </html>
            """;
        response.getWriter().write(sb);
    }

}