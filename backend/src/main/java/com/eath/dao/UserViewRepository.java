package com.eath.dao;

import com.eath.entite.UserView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserViewRepository extends JpaRepository<UserView, Integer> {
    UserView findByEmail(String email);
}
