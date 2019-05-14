package yijiahu.RemoteConsultation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yijiahu.RemoteConsultation.dao.UsersMapper;
import yijiahu.RemoteConsultation.model.Users;

import javax.annotation.Resource;

@SpringBootTest(classes = {RemoteConsultationApplication.class})
@RunWith(SpringRunner.class)
public class UsersTest {
    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testAdd() {
        Users user = new Users() ;
        user.setPasswd("123");
        user.setUsername("enjoy");
        usersMapper.insertSelective(user);
    }

    @Test
    public void testFindUser() {
        Users enjoy = usersMapper.findByUsernameAndPasswd("enjoy", "123");
        System.out.println(enjoy);
    }
}
