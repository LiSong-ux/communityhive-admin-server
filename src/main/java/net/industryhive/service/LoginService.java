package net.industryhive.service;

import net.industryhive.bean.Login;
import net.industryhive.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 未央
 * @create 2019-12-23 16:27
 */
@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public void addLogin(Login newLogin) {
        loginMapper.insert(newLogin);
    }

}
