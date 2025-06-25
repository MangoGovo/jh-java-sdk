package org.jh.usercenter.client;

import org.apache.dubbo.config.annotation.DubboReference;
import org.jh.usercenter.api.LoginRequest;
import org.jh.usercenter.api.Response;
import org.jh.usercenter.api.UserService;
import org.springframework.stereotype.Component;

/**
 * @author MangoGovo
 */
@Component
public class UserCenterClient {

    @DubboReference
    UserService userService;

    /**
     * @param studentId 学号
     * @param password  密码
     */
    public void oauthLogin(String studentId, String password) {
        Response resp = userService.login(LoginRequest
                .newBuilder()
                .setStudentId(studentId)
                .setPassword(password)
                .build());
        System.out.println(resp);
    }
}
