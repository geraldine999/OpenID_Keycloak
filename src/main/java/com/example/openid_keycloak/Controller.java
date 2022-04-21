package com.example.openid_keycloak;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class Controller {

    @GetMapping("/admin")
    @RolesAllowed("ADMIN")
    public String adminAccess(){
        return "ADMIN";
    }

    @GetMapping("/user")
    @RolesAllowed("USER")
    public String userAccess(){
        return "USER";
    }
}
