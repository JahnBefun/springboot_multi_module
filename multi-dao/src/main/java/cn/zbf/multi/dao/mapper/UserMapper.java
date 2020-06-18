package cn.zbf.multi.dao.mapper;

import cn.zbf.multi.common.model.UserDo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserDo selectById(@Param("id") int id);
}
