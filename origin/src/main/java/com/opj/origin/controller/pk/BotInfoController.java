package com.opj.origin.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pk/")
public class BotInfoController {
    @RequestMapping("getbotinfoc/")
    public List<Integer> bic(){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(i);
        return list;
    }
}
