package com.tdi.hackathon.dementia.controller;

import com.tdi.hackathon.dementia.model.SMSSendRequest;
import com.tdi.hackathon.dementia.service.SMSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MessageRestController {

    @Autowired
    SMSService smsService;

    @PostMapping("/processMessage")
    public String processMessage(@RequestBody SMSSendRequest sendRequest){
        log.info("/processSMS started:" + sendRequest.toString());
        return smsService.sendSMS(sendRequest.getDestinationSMSNumber(),sendRequest.getSmsMessage());
    }

    @GetMapping("/screen")
    public String viewScreen(){
        return "firstScreen";
    }


    @PostMapping("/register")
    public String registerUser(){
        
        return null;
    }



}
