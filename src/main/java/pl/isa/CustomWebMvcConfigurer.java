package pl.isa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingInterceptor());
	}

	private static class LoggingInterceptor extends HandlerInterceptorAdapter {

		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
			System.out.println("Handling the request. Headers: " + request.getHeaderNames().toString());
			return true;
		}
	}
}