//package cn.ddw.userServiceConsumerImpl;
//
//import cn.ddw.apiService.Service.UserClientService;
//import cn.ddw.apiService.entity.Buyuser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author ZYF
// * @date 2019/6/10 10:04
// * @Description :
// */
//@RestController
//@RequestMapping("/consumer/buyuser")
//public class UserController_Consumer {
//
//    @Autowired
//    private UserClientService userClientService;
//
//
//    @GetMapping("/get/{id}")
//    public Buyuser get(@PathVariable("id") Integer id)
//    {
//        return userClientService.getUserById(id);
//    }
//
//
//}
