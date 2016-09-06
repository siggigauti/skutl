package com.HBV501G.skutl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Siggigauti on 06/09/2016.
 */

//Notum fleiri en 1 controller, t.d. 1 fyrir display á öllum eða sérstökum skutl ferðum
//Annan fyrir notendur, t.d. homepage fyrir notanda, login, create e.t.c.
//Svo annan fyrir Categories eða eitthvað
//Þessi controller er fyrir display á öllum skult ferðum í gangi og Main page.
@Controller
public class SkutlController {
    @RequestMapping("/")
    public String listSkutlFerdir() {
        return "home";
    }
}
