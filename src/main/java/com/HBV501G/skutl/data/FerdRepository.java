package com.HBV501G.skutl.data;

import com.HBV501G.skutl.model.Ferd;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Siggigauti on 14/09/2016.
 */

@Component
public class FerdRepository {
    private static final String[] temp = {"Páll","Halli"}; //passengers
    private static final List<Ferd> ALL_FERDIR = Arrays.asList(
        new Ferd(1, Date.valueOf("2015-05-06"),Date.valueOf("2015-05-06"), "Jón", temp, "RVK", "AK", 4, 4000 ),
        new Ferd(2, Date.valueOf("2015-06-06"),Date.valueOf("2015-06-06"), "Kalli", temp, "AK", "HÚS", 2, 2000 ),
        new Ferd(3, Date.valueOf("2015-07-06"),Date.valueOf("2015-08-06"), "Siggi", temp, "RVK", "ÞOR", 1, 1500 ),
        new Ferd(4, Date.valueOf("2015-08-06"),Date.valueOf("2015-08-06"), "Óðinn", temp, "ÍSF", "SIGL", 3, 3000 ),
        new Ferd(5, Date.valueOf("2015-09-06"),Date.valueOf("2015-11-06"), "Sindri", temp, "RVK", "EGI", 2, 4000 )
    );

    public Ferd findById(int id){

        for(Ferd ferd : ALL_FERDIR) {
            if(ferd.getFerdId() == id){
                return ferd;
            }
        }
        return null;
    }

    public List<Ferd> getAllFerdir() {
        return ALL_FERDIR;
    }
}
