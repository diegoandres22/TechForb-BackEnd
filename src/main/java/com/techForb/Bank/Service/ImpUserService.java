package com.techForb.Bank.Service;

import com.techForb.Bank.Entity.User;
import com.techForb.Bank.Interface.IUserService;
import com.techForb.Bank.Repository.IUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUserService implements IUserService {

    @Autowired
    IUserRepository iuserRepository;

    @Override
    public List<User> getUser() {
        List<User> user = iuserRepository.findAll();
        return user;
    }

    @Override
    public void saveUser(User user) {
        iuserRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        iuserRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        User user = iuserRepository.findById(id).orElse(null);
        return user;
    }

}
