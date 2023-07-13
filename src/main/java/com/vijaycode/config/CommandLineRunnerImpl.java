package com.vijaycode.config;

import com.vijaycode.entity.Permission;
import com.vijaycode.entity.Role;
import com.vijaycode.entity.RoleEnum;
import com.vijaycode.repo.RoleRepo;
import com.vijaycode.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@RequiredArgsConstructor
public class CommandLineRunnerImpl implements org.springframework.boot.CommandLineRunner {

    private final RoleRepo roleRepo;


    @Override
    public void run(String... args) throws Exception {

        Role adminRole = new Role();
        adminRole.setName(RoleEnum.ADMIN);
        adminRole.setDescription("Admin Role");

        Permission permission=new Permission();
        permission.setName("PRODUCT_CREATION");
        permission.setDescription("Product creation");

        Permission permission2=new Permission();
        permission2.setName("PRODUCT_UPDATE");
        permission2.setDescription("Product creation");

        Permission permission3=new Permission();
        permission3.setName("PRODUCT_DELETE");
        permission3.setDescription("Product creation");

        Permission permission4=new Permission();
        permission4.setName("PRODUCT_INFO");
        permission4.setDescription("Product creation");
        adminRole.setPermissions(new HashSet(Arrays.asList(permission,permission2,permission3,permission4)));

        Role userRole = new Role();
        userRole.setName(RoleEnum.USER);
        userRole.setDescription("User Role");
        userRole.setPermissions(new HashSet(Arrays.asList(permission4)));

        Role salesRole = new Role();
        salesRole.setName(RoleEnum.SALES);
        salesRole.setDescription("Sales Role");
        salesRole.setPermissions(new HashSet(Arrays.asList(permission,permission2,permission4)));

        roleRepo.saveAll(Arrays.asList(adminRole,userRole,salesRole));

    }
}
