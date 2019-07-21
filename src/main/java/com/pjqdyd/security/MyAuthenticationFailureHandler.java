package com.pjqdyd.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**   
 * @Description:  [认证或登录失败的处理方式]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */


public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

    //工具类转换对象为json字符串
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

        //返回Json字符串
        Map result = new HashMap();
        result.put("error", false);
        String json = objectMapper.writeValueAsString(result);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);

    }
}
