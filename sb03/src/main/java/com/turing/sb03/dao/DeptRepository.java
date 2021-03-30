package com.turing.sb03.dao;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */

import com.turing.sb03.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Dao层接口
 * 泛型：第一个是实体类的类型，第二个是实体类主键的类型
 */

public interface DeptRepository extends JpaRepository<Dept,Integer> {
}
