package com.guohuawei.website.controller;

import com.guohuawei.website.domain.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {
    @RequestMapping("/getuser")
    public String getUserName(Model model){
        UserModel userModel = new UserModel();
        List<UserModel> userModelList = new ArrayList<UserModel>();
        userModel.setId(1);
        userModel.setName("guohuawei");
        userModel.setAge("6");
        userModel.setAddress("ddddddd");
        userModelList.add(userModel);

        model.addAttribute("users", userModelList);

        return "/user/Index";
    }
}
