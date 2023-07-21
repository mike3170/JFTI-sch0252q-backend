package com.stit.controller;

import com.stit.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jay
 */
@RestController
@RequestMapping("/api/test")

public class TestControl {


    @GetMapping("test1")//output json
    public ApiResponse findViewSch0251qScNo() {
        try {
            
            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    
}
