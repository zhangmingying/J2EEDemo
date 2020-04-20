package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleDao {


    List<Role> findRoleByUserId(String userId) throws Exception;
}
