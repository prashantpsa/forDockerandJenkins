package com.postEx.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/postEx")
public class PostEx {

    @GetMapping()
    public ResponseEntity<String> postexample(){

        return new ResponseEntity<>("testing with prashantAnkushkani",HttpStatus.OK);
    }
}
