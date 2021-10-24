package com.company.main;

import com.company.adress.Adress;
import com.company.adress.Studio;
import com.company.adress.StudioType;
import com.company.money.Money;
import com.company.person.Customer;
import com.company.person.Owner;
import com.company.person.Photographer;
import com.company.service.PhotoSession;

public class Main {

    public static void main(String[] args) {
        final Owner owner = new Owner("John", "Doe");
        final Studio lensQueenStudio = new Studio("Lens Queen", new Adress("Chernivtsi", "Kobilyanska. 10", "Ukraine", "58000"), StudioType.PHOTO);
        final Studio ambientPortraitureStudio = new Studio("Ambient Portraiture", new Adress("Ternopil", "Holovna, 11", "Ukraine", "58000"), StudioType.PHOTO);

        owner.assignStudio(lensQueenStudio);
        owner.assignStudio(ambientPortraitureStudio);

        //show owners info
        System.out.print("*************OWNER*************\n");
        System.out.println(owner);
        System.out.print("*******************************\n\n");


        final Customer customer1 = new Customer("Mr", "Proper");
        final Customer customer2 = new Customer("Dom", "Estos");
        final Photographer photographer = new Photographer("Alex", "McLean");
        final PhotoSession session = new PhotoSession(10, Arrays.asList(customer1, customer2), Money.eur(100), photographer);


        System.out.print("*******LENS QUEEN STUDIO*******\n");
        System.out.println(lensQueenStudio);
        System.out.print("*******************************\n\n");

    }


    private static class Arrays{
        public static int asList(Customer customer1, Customer customer2) {
        }
    }
}

