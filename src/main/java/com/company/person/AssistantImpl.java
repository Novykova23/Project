package com.company.person;

import com.company.interfaces.Assistant;

public class AssistantImpl extends Person implements Assistant {
    public int budget;
    public int coffeeMachine;

    public AssistantImpl ( int budget, int coffeeMachine){
        this.budget = budget;
        this.coffeeMachine = coffeeMachine;
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

    public void help() {
    }
    public void buyPaper(){
        System.out.println("Some sorts of paper");
    }
    public void makeCoffee(){
        System.out.println("Coffee for customers");
    }

    @Override
    public String toString() {
        return "AssistantImpl{" +
                ", budget=" + budget +
                ", coffeeMachine=" + coffeeMachine +
                '}';
    }
}
