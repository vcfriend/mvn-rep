package com.example.swagger2demo.Controller;

import com.example.swagger2demo.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 向亚林
 * 2018/9/3 下午3:25
 */
@RestController
@RequestMapping("/users2")
public class UserController2 {
  static Map<Long, User> map = new ConcurrentHashMap<Long, User>();
//  {
//    {
//      User user1 = new User(1L, "向亚林", "亚林", 18);
//      User user2 = new User(2L, "张三丰", "三丰", 28);
//      map.put(user1.getId(), user1);
//      map.put(user2.getId(), user2);
//    }
//  };

  @ApiOperation(value = "获取用户列表")
  @RequestMapping(value = "",method = RequestMethod.GET)
  public List<User> list(){
    List<User> list = new ArrayList<>(map.values());
    return list;
  }

}
