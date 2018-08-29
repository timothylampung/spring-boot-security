package com.springsecurity.server.endpoint;

import com.springsecurity.server.security.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.header.Header;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("v1/first-floor")
public class FirstFloorEndPoint {

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @GetMapping("/office1")
    @PreAuthorize("hasAnyRole('USER')")
    public ResponseEntity<?> enterOffice1() {
        return new ResponseEntity<>("you are inside office 1", HttpStatus.OK);
    }

    @GetMapping("/office2")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<?> enterOffice2() {
        return new ResponseEntity<>("you are inside office 2", HttpStatus.OK);
    }

    @GetMapping("/current-user")
    @PreAuthorize("hasAnyRole('USER')")
    public ResponseEntity<?> currentUser() {
        return new ResponseEntity<>(customUserDetailService.getCurrentUser(), HttpStatus.OK);
    }

}
