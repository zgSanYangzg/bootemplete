package yijiahu.RemoteConsultation.service.impl;

import org.springframework.stereotype.Service;
import yijiahu.RemoteConsultation.dao.UsersMapper;
import yijiahu.RemoteConsultation.model.Users;
import yijiahu.RemoteConsultation.service.IUserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UsersMapper usersMapper;

    public boolean login(String username, String passwd) {
        Users users = usersMapper.findByUsernameAndPasswd(username, passwd);
        return users != null;
    }

    public boolean register(String username, String passwd) {
        Users users = new Users();
        users.setUsername(username);
        users.setPasswd(passwd);
        int cnt = usersMapper.insertSelective(users);
        return cnt > 0;
    }
}
