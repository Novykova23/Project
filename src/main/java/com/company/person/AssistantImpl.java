package com.company.person;

import com.company.interfaces.Assistant;

public class AssistantImpl extends Person implements Assistant {
    protected AssistantImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public AssistantImpl(String givenName) {
        super(givenName);
    }
    public void help() {
    }
    public void buyPaper(){
        System.out.println("Фотопапір, ватмани, холсти");
    }
    public void makeCoffee(){
        System.out.println("Американо, латте, еспресо для клієнтів");
    }
}
