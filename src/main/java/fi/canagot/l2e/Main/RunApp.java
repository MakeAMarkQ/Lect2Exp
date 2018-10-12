package fi.canagot.l2e.Main;

import fi.canagot.l2e.InputHandle.HandleInput;

public class RunApp {

    public  RunApp(){
        System.out.println("Me startar nyt");
        HandleInput handleInput=new HandleInput();
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
