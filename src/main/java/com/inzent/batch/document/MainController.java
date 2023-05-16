package com.inzent.batch.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    IntegratedService integratedService;

    @GetMapping("/test")
    @ResponseBody
    public String setDeleteState(){

        integratedService.deleteExpiredDocument();
        return "done";
    }
}
