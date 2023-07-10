package org.aptech.t2109e.springdemo.controller;


import org.aptech.t2109e.springdemo.entity.Employee;
import org.aptech.t2109e.springdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("")
    public String index(
        @RequestParam(required = false, defaultValue = "0") Integer page,
        @RequestParam(required = false, defaultValue = "5") Integer limit,
        Model model
    ){
        Pageable pageable = PageRequest.of(page, limit);
        List<Employee> employeeList = employeeService.findAll(pageable);
        model.addAttribute("employeeList", employeeList);
        return "index";
    }


    @GetMapping("create")
    public String create(){
        return "create";
    }

    @PostMapping("")
    public String create(@ModelAttribute Employee employee){
        employeeService.create(employee);
        return "redirect:/employees";
    }
}
