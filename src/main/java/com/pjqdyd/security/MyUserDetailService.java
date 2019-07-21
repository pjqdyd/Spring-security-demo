package com.pjqdyd.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**   
 * @Description:  [向spring security提供用户数据的实现类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

public class MyUserDetailService implements UserDetailsService {

    /**
     * 根据用户名读取用户信息
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        //UserDetails是一个接口(封装用户数据的接口), 在我们定义用户实体类时就要实现这个接口

        //spring security默认实现的实体类(开发中可以是从dao层读取)
        User user = new User("pjq", "123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));

        return user;
    }

    //在5.0版本以上的定义userDetailService类时，需要自己调用passWordEncoder 编码器对密码进行编码
}
