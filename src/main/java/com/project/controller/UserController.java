package com.project.controller;

import com.project.model.User;
import com.project.model.UserDTO;
import com.project.service.UserLoginService;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService uService;

    @Autowired
    private UserLoginService ulogService;

    @PostMapping("/regisrtration")

    public ResponseEntity<User> saveUserController(@Valid @RequestBody User user) {
        User responseUser = uService.saveUer(user);
        return new ResponseEntity<User>(responseUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> userLoginController(@Valid @RequestBody UserDTO userDto) {
        String msg = ulogService.userLogin(userDto);
        return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateUser/{key}")
    public ResponseEntity<User> updateUserCredentialController(@Valid @RequestBody User user, @PathVariable String key) {
        User responseUser = uService.updateUserCredential(user, key);
        return new ResponseEntity<User>(responseUser, HttpStatus.ACCEPTED);
    }

    @PostMapping("/logout/{key}")
    public ResponseEntity<String> userLogoutController(@Valid @PathVariable String key) {
        String msg = uService.userLogout(key);
        return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);
    }

}
