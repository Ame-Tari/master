
package cn.zpeace.blog;

import cn.zpeace.blog.pojo.User;
import cn.zpeace.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void updateUserInfo() {
        User user = new User();
        user.setPassword("1");
        user.setUsername("aming");
        user.setUuid("1");
        user.setEmail("878027460@qq.com");
        user.setAvatar("http://localhost/user/ceacf0537dde42fc9abde14e166d92d7/avatar/2019100814082830.jpg");
        user.setId(5);
        user.setNickname("黄铭涛");
        userService.updateUserInfo(user);
    }

    @Test
    public void checkPassword() {
        Integer user = userService.updatePassword(5, "mz111152");
        System.out.println(user);
    }
}
