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
            System.out.println("get maa lue tiedot, set maa aseta: ");
            String str_UserInput =
                    handleInput.getUserInput();
            if (str_UserInput.equals("exit")) {
                return;
            }
            else {
                String[] strOsat = str_UserInput.split(" ");
                if(strOsat.length!=2)
                {
                    System.out.println("Oletko nyt ainan varma mitä haluat!");
                }
                else {
                    System.out.println("Haluat: " + strOsat[0] + " Maasta " + strOsat[1]);
                    if (strOsat[0].equals("get")) {
                        System.out.println("Haluat: " +strOsat[1]+" tiedot");
                        if(map.containsKey(strOsat[1])){
                            System.out.println(strOsat[1]+ " JH: "+
                                    map.get(strOsat[1]).getStrLeader()+" P: "+
                                    map.get(strOsat[1]).getStrPopulation());
                        }
                    } else if(strOsat[0].equals("set")){
                        System.out.println("Muutat: " +strOsat[1]+" tiedot");

                    } else{

                                System.out.println("Oletko nyt ainan varma mitä haluat!");
                    }
                }
            }
        }
    }
}
