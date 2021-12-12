package com.company.person;

import com.company.interfaces.Assistant;

public class AssistantImpl extends Person implements Assistant {
    private String givenName;
    private String familyName;
    public int budget;
    public int coffeeMachine;

    public AssistantImpl ( String givenName, String familyName, int budget, int coffeeMachine){
        this.givenName = givenName;
        this.familyName = familyName;
        this.budget = budget;
        this.coffeeMachine = coffeeMachine;
    }
    public void help() {
    }
    public void buyPaper(){
        System.out.println("Some sorts of paper");
    }
    public void makeCoffee(){
        System.out.println("Coffee for customers");
    }

    @Override
    public String getGivenName() {
        return givenName;
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String getFamilyName() {
        return familyName;
    }

    @Override
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(int coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public String toString() {
        return "AssistantImpl{" +
                "givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", budget=" + budget +
                ", coffeeMachine=" + coffeeMachine +
                '}';
    }
}
