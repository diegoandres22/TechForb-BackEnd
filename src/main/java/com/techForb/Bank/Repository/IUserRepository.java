package com.techForb.Bank.Repository;

import com.techForb.Bank.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserRepository extends JpaRepository< User, Long> {

    public User findAllById(Long id);

 
}
