package com.baeldung.struts;

public class CarMessageService {

    public String getMessage(String Name) {
        System.out.println("inside getMessage()" + Name);
        if (Name.equalsIgnoreCase("ferrari"))
            return "Ferrari Fan!";
        else if (Name.equalsIgnoreCase("bmw"))
            return "BMW Fan!";
        else
            return "please choose ferrari Or bmw";
    }

}
