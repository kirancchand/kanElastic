package com.kan.kanElastic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kan.kanElastic.service.UserESService;
import com.kan.kanElastic.vo.UserES;


@RestController
@RequestMapping("/esuser")
public class UserESController {

	
    @Autowired
    private UserESService userESService;
    
    
    @PostMapping("/create")
    public UserES createUser(@RequestBody UserES userES) {
        return userESService.save(userES);
    }
    
//  @GetMapping("/{id}")
//  public Optional<Employee> findById(@PathVariable String id) {
//      return repository.findById(id);
//  }
//
  @GetMapping("/getAll")
  @ResponseBody
  public Iterable<UserES> getAllUser() {
      return userESService.findAll();
  }
//  @PutMapping("/{id}")
//  public Employee update(@PathVariable String id, @RequestBody Employee employee) {
//      employee.setId(id);
//      return repository.save(employee);
//  }
//
//  @DeleteMapping("/{id}")
//  public void delete(@PathVariable String id) {
//      repository.deleteById(id);
//  }
    
}
