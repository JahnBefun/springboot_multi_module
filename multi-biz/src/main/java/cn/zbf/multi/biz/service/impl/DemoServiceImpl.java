package cn.zbf.multi.biz.service.impl;

import cn.zbf.multi.biz.service.DemoService;
import cn.zbf.multi.common.model.UserDo;
import cn.zbf.multi.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhanbf
 * @date 2020/06/18
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        UserDo user = userMapper.selectById(1);
        return user.toString();
    }
}