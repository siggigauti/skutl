package com.HBV501G.skutl.controller;

import com.HBV501G.skutl.model.Ferd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;


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
        //Þetta home er nafn á html skjali undir resources/templates. Öll html skjöl verða þar.
        return "home";
    }

    @RequestMapping("/ferd")
    public String ferdDetails(ModelMap modelMap) {
        String[] temp = {"Siggi","halli"};
        Ferd ferd = new Ferd(1, Date.valueOf("2015-05-06"),Date.valueOf("2015-05-06"), "Jón", temp, "RVK", "AK", 4, 4000 );
        modelMap.put("ferd", ferd);
        return "ferd-details";
    }
}
