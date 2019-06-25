package cn.ddw.apiService.userService.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable {
    private  Integer id;
    private  String name;
    private  String code;
    private  String pwd;
    private  String nickname;
    private  String sex;
    private  Date birthday;
    private  String phone;
    private  String email;
    private  String titleimg;


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", titleimg='" + titleimg + '\'' +
                '}';
    }
}
