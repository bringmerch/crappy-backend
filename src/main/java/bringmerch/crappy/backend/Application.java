package bringmerch.crappy.backend;

import bringmerch.crappy.backend.servlet.MyServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 *
 * Package Name: bringmerch.crappy.backend
 * File Name: Application
 * Description:
 * author: munke
 *
 * @version 1.0
 * @see bringmerch.crappy.backend
 * @since 2026-06-29
 * <p>
 * Modification Information
 * 수정일          수정자                    수정내용
 * --------- ------------------- -------------------------------
 * 2026-06-29        munke                   최초개정
 */
public class Application {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9999);
        tomcat.getConnector();
        // api 서버로 쓸 거라 정적자원 디렉토리 명시 안 함
        Context context = tomcat.addContext("/backend", null);
        Tomcat.addServlet(context,"MyServlet", new MyServlet()); // 서블릿 등록
        context.addServletMappingDecoded("/my", "MyServlet"); // path <-> 서블릿 매핑 추가
        tomcat.start();
        tomcat.getServer().await();
    }
}
