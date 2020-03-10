package net.industryhive.service;

import net.industryhive.bean.User;
import net.industryhive.bean.UserExample;
import net.industryhive.dao.UserMapper;
import net.industryhive.entity.UnifiedResult;
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

    public long getUserCount() {
        UserExample example = new UserExample();
        long userCount = userMapper.countByExample(example);
        return userCount;
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

    /**
     * 对用户执行封禁或解封操作
     *
     * @param id
     * @param locked
     * @return
     */
    public UnifiedResult lockUser(int id, int locked) {
        if (id == 1) {
            return UnifiedResult.build(400, "权限不足", null);
        }
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null || user.getDeleted() == true) {
            return UnifiedResult.build(400, "用户不存在", null);
        }
        if (user.getLocked() == false && locked == 1) {
            user.setLocked(true);
        } else if (user.getLocked() == true && locked == 0) {
            user.setLocked(false);
        } else {
            if (user.getLocked() == false && locked == 0) {
                return UnifiedResult.build(400, "用户已解封", null);
            } else {
                return UnifiedResult.build(400, "用户已封禁", null);
            }
        }
        userMapper.updateByPrimaryKeySelective(user);
        return UnifiedResult.ok();
    }
}
