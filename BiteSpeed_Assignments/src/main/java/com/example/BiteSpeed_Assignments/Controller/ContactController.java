package com.example.BiteSpeed_Assignments.Controller;

import com.example.BiteSpeed_Assignments.Model.ContactRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @PostMapping("/identify")
    public ResponseEntity<?> identify(@RequestBody ContactRequest request){

    }
}
