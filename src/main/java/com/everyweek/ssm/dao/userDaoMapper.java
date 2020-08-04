package com.everyweek.ssm.dao;

import com.everyweek.ssm.entrty.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface userDaoMapper {

    User getUserByUserId(@Param("id") String id);
}
