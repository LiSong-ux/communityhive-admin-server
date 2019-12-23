package net.industryhive.service;

import net.industryhive.bean.User;
import net.industryhive.bean.UserExample;
import net.industryhive.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理Service
 *
 * @author 未央
 * @create 2019-12-23 10:06
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取全部用户信息
     * <p>
     * id,account,username,email,gender,
     * topicCount,replyCount,loginCount,registerTime
     *
     * @param page
     * @return
     */
    public List<User> getAllUser(int page) {
        int startRow = (page - 1) * 100;
        List<User> userList = userMapper.selectAllUser(startRow);
        return userList;
    }

    /**
     * 根据用户账号获取用户信息
     *
     * @param account
     * @return
     */
    public User getUserByAccount(String account) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return null;
        }
        User user = userList.get(0);
        return user;
    }

    public void updateUser(User updatedUser) {
        userMapper.updateByPrimaryKeySelective(updatedUser);
    }

}
