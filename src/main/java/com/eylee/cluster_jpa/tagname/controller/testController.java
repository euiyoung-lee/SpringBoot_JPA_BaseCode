package com.eylee.cluster_jpa.tagname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class testController {
    @GetMapping(path = "/api")
    public String getParam(
            @RequestParam(name="param1", defaultValue="true") String param1,
            @RequestParam(name="param2", defaultValue="false") String param2
    ) {

        return "param1: "+param1+", param2: ";
    }


}
