package fi.canagot.l2e.Main;

import fi.canagot.l2e.Countries.Country;
import fi.canagot.l2e.InputHandle.HandleInput;

import java.util.HashMap;
import java.util.Map;

public class RunApp {

    public  RunApp(){
        System.out.println("Valitse jokin maa allaolevista nyt");
        HandleInput handleInput=new HandleInput();
        Map<String, Country> map=new HashMap<String, Country>();
        map.put("Suomi",new Country("Niinistö, Sauli","5M"));
        map.put("Ruotsi", new Country("Kalle, Kustaa","16M"));
        map.put("Norja", new Country("Hagon,kung","4M"));
        map.put("Tanska", new Country("Margaret, Queen", "9M"));
        map.put("Saksa", new Country("Merkeli,Angeli","87M"));
        map.put("Venäjä", new Country("Putin,Valamir","360M"));
        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey());
        }
        while(true) {
            String str_UserInput =
                    handleInput.getUserInput();
            System.out.println("Vastauksesi: "+str_UserInput);
            if (str_UserInput.equals("exit")) {
                return;

            }
        }
    }
}
