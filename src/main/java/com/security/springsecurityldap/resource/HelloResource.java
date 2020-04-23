package com.security.springsecurityldap.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping("/auth")
    public String check() {

        return "Local LDAP Working: using local ldif file test-server.ldif";
    }
}
