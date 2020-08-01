package com.liu.shop.config;


import org.springframework.beans.factory.annotation.Configurable;

import javax.servlet.*;
import java.io.IOException;
@Configurable

public class FilterRequest implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
