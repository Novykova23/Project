package com.company.person;

import com.company.interfaces.Assistant;

public class AssistantImpl extends Person implements Assistant {
    protected AssistantImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }

    public String givenName;
    public String familyName;
    public int budget;
    public int coffeeMachine;

    public AssistantImpl ( String givenName, String familyName, int budget, int coffeeMachine){
        this.budget = budget;
        this.coffeeMachine = coffeeMachine;
    }
    public AssistantImpl(String givenName) {
        super(givenName);
    }
    public void help() {
    }
    public void buyPaper(){
        System.out.println("Some sorts of paper");
    }
    public void makeCoffee(){
        System.out.println("Coffee for customers");
    }
}
