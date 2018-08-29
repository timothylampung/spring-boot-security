package com.springsecurity.server.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/first-floor")
public class FirstFloorEndPoint {

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

}
