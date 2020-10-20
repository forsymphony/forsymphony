package web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class CharacterFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String servletPath = httpServletRequest.getServletPath();  //获取客户端所请求的脚本文件的文件路径

        //不过滤处理登录页面、JS和CSS文件
        if (!servletPath.endsWith(".js") && !servletPath.endsWith(".css"))
        {
//            //省略校验代码...
            servletRequest.setCharacterEncoding("utf-8");
            servletResponse.setContentType("text/html;charset=utf-8");
//            filterChain.doFilter(servletRequest,servletResponse);
        }
        // 传递给下一过滤器
        filterChain.doFilter(servletRequest,servletResponse);
//            servletRequest.setCharacterEncoding("utf-8");
//           servletResponse.setContentType("text/html;charset=utf-8");
//            filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
