package com.atguigu.springboot.entity;

import javax.persistence.*;

//配置JPA注解映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "tbl_user")  //@Table 指定和哪个数据表对应；如果省略，默认表名就是类名的小写
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column(name = "last_name",length = 50) //和数据表对应的列
    private String lastName;
    @Column //省略默认列名就是属性名
    private String Email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
