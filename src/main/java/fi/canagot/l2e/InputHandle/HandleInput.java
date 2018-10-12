package fi.canagot.l2e.InputHandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandleInput {
    public String getUserInput(){
        String str_userInput="";
        try{
            BufferedReader bufferreader=
                    new BufferedReader(new InputStreamReader(System.in));
            str_userInput=bufferreader.readLine();

        }
        catch (IOException e){
            System.out.println(e);
        }
        return str_userInput;
    }
}
