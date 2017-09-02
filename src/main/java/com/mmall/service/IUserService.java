package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Service;

/**
 * Created by Qiansan on 2017/8/8.
 */

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String qustion,String answer);

    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String fogetToken);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> get_information(Integer userId);
}
