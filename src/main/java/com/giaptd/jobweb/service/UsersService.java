package com.giaptd.jobweb.service;

import com.giaptd.jobweb.entity.Users;
import com.giaptd.jobweb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
