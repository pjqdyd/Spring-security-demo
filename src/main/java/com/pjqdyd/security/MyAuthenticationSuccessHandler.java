package com.pjqdyd.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**   
 * @Description:  [登录或认证成功后的处理逻辑]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //工具类转换对象为json字符串
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        //返回Json字符串
        Map result = new HashMap();
        result.put("success", true);
        String json = objectMapper.writeValueAsString(result);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);

    }
}
