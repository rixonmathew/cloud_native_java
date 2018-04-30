package com.rixon.cloudnative.zuulserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import static com.netflix.zuul.context.RequestContext.getCurrentContext;

@Component
public class HostNameCheckFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = getCurrentContext();
        return ctx.getRequest().getParameter("port") != null;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = getCurrentContext();
        return null;
    }
}
