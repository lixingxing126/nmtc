package com.example.nmtc.controller;

import com.example.nmtc.entity.NmtcUser;
import com.example.nmtc.service.NmtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private NmtcService nmtcService;

    @RequestMapping("/1")
    public String test () {
        return "ces";
    }

    @PostMapping("/insert")
    public boolean insertNmtc (NmtcUser nmtcUser){
        return nmtcService.gitNmtc(nmtcUser);
    }

    @GetMapping
    public NmtcUser gitNmtcId(int id){
        return nmtcService.gitNmtcId(id);
    }

    @GetMapping("/getById")
    @ResponseBody
    public NmtcUser getById (int id) {
        return nmtcService.getById(id);
    }

}

