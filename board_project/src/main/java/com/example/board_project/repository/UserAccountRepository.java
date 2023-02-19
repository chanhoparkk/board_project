package com.example.board_project.repository;

import com.example.board_project.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {

    @Override
    UserAccount getReferenceById(String s);


}