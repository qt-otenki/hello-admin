package top.glkj.teacherEvaluation.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {
    @Resource
//    @Autowired
    UserMapper userMapper;
    @Test
    void getUerById() {
//        User user =  userMapper.getUerByName(1);
//        System.out.println(user);
    }
}