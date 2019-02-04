package com.example.gateway.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginManagementResource {

    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {

        if (!session.isNew()) {
            session.invalidate();
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
