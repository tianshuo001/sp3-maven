package cn.tt.sp3.controller;

import cn.tt.sp3.entity.Employee;
import cn.tt.sp3.mapper.EmployeeMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: sp3
 * @ClassName DemoController
 * @description: TODO
 * @author: tianshuo
 * @create: 2024-11-01 16:18
 * @Version 1.0
 **/


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private EmployeeMapper emloyeeMapper;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/FindEmployees")
    public List<Employee> FindEmployeeS(){
        QueryWrapper<Employee> employeeQuery = new QueryWrapper<>();
        List<Employee> employees = emloyeeMapper.selectList(employeeQuery);
        return employees;
    }
}
