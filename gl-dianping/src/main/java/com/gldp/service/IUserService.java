package com.gldp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gldp.dto.LoginFormDTO;
import com.gldp.dto.Result;
import com.gldp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gl
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
