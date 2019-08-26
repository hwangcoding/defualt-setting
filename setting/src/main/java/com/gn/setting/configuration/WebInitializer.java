package com.gn.setting.configuration;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

/**
 * @Class WebInitializer.java
 *	@Description WebInitializer
 * <pre>
 *
 *      수정일                  수정자                   수정내용
 * --------------  -------     ---------------------
 *  2019. 7. 5.          hgb             최초작성
 *
 * </pre>
 * @author hgb
 * @version 0.0  
 * @see
 *
 *	Servlet container(톰캣) 실행 >
 */
public class WebInitializer implements WebApplicationInitializer{

	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//웹 어플리케이션의 시작과 종료 리스너
		WebInitializerListener listener = new WebInitializerListener();
        servletContext.addListener(listener);
		        
		//context 설정
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(com.gn.setting.configuration.DispatcherServlet.class);
		//context.setConfigLocation("com.gn.setting.configuration");  패키지를 스캔해서 등록하는 방식.

		//dispatcher 설정
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setAsyncSupported(true);		//servlet 3.0 이상 사용시 설정
		dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("*.do");
        dispatcher.addMapping("/");
        
        // encoding 필터 적용
        FilterRegistration.Dynamic charaterEncodingFilter = servletContext.addFilter("charaterEncodingFilter", new CharacterEncodingFilter());
        charaterEncodingFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
        charaterEncodingFilter.setInitParameter("encoding", "UTF-8");
        charaterEncodingFilter.setInitParameter("forceEncoding", "true");
        

	}
	
	

}
