package com.masai.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
  @GetMapping("/app/api/user/dashboard")
  public String userDashboard() {
    return "User Dashboard";
  }

  @GetMapping("/app/api/admin/dashboard")
  public String adminDashboard() {
    return "Admin Dashboard";
  }

  @PostMapping("/app/api/admin/new")
  public String createAdmin() {
    return "Admin created";
  }

  @GetMapping("/app/api/user/{userid}")
  public String getUser(@PathVariable("userid") String userid) {
    return "User with ID: " + userid;
  }
}
