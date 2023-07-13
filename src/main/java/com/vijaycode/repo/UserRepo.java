package com.vijaycode.repo;

import com.vijaycode.entity.Role;
import com.vijaycode.entity.UserBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserBasicInfo,Integer> {
}
