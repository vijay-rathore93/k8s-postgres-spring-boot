package com.vijaycode.repo;

import com.vijaycode.entity.Role;
import com.vijaycode.entity.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
    Role findByName(RoleEnum role);
}
