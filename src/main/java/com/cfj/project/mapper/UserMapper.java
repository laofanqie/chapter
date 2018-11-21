package com.cfj.project.mapper;

import com.cfj.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * Created by Administrator on 2018/11/21.
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    int countByUsername(String username);
}
