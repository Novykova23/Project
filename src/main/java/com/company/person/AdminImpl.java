package com.company.person;

import com.company.interfaces.Admin;

public class AdminImpl extends Person implements Admin {
    protected AdminImpl(String givenName, String familyName) {
        super(givenName, familyName);
    }
    void acceptOrders() {
    }
    public void getCalls(){
        System.out.println("Приймаємо дзвінки на робочий номер 12-34-56");
    }
    public void sendMessages(){
        System.out.println("Відправляємо нагадувння про запис");
    }

}
