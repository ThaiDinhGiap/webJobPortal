package com.giaptd.jobweb.repository;

import com.giaptd.jobweb.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
