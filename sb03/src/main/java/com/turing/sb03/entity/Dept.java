package com.turing.sb03.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
@Data
@Entity //标识为实体类
@Table(name = "dept") //关联哪个表
public class Dept {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自动增长的策略
    @Column(name = "deptno")
    private Integer deptno;//部门编号

    @Column(name = "dname")
    private String dname;//部门名称

    //如果表中的列名和属性名一样，可以省略@Column注解
    private String loc;//地址
}
