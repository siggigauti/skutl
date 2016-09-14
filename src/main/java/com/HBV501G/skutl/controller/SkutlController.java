package com.HBV501G.skutl.controller;

import com.HBV501G.skutl.data.FerdRepository;
import com.HBV501G.skutl.model.Ferd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;


/**
 * Created by Siggigauti on 06/09/2016.
 */

//Notum fleiri en 1 controller, t.d. 1 fyrir display á öllum eða sérstökum skutl ferðum
//Annan fyrir notendur, t.d. homepage fyrir notanda, login, create e.t.c.
//Svo annan fyrir Categories eða eitthvað
//Þessi controller er fyrir display á öllum skult ferðum í gangi og Main page.
@Controller
public class SkutlController {

    @Autowired
    private FerdRepository ferdRepository;

    @RequestMapping("/")
    public String listSkutlFerdir(ModelMap modelMap) {
        //Þetta home er nafn á html skjali undir resources/templates. Öll html skjöl verða þar.
        List<Ferd> allFerdir = ferdRepository.getAllFerdir();
        modelMap.put("ferdir",allFerdir);
        return "allFerdir";
    }

    @RequestMapping("/from/{id}")
    public String ferdDetails(@PathVariable int id, ModelMap modelMap) {
        Ferd ferd = ferdRepository.findById(id);
        modelMap.put("ferd", ferd);
        return "ferd-details";
    }
}
