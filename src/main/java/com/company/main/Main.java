package com.company.main;

import com.company.address.Address;
import com.company.address.Studio;
import com.company.address.StudioType;
import com.company.person.Customer;
import com.company.person.Owner;
import com.company.person.Photographer;

public class Main {

    public static void main(String[] args) {
        final Owner owner = new Owner("John", "Doe");
        final Studio lensQueenStudio = new Studio("Lens Queen", new Address("Chernivtsi", "Kobilyanska. 10", "Ukraine", "58000"), StudioType.PHOTO);
        final Studio ambientPortraitureStudio = new Studio("Ambient Portraiture", new Address("Ternopil", "Holovna, 11", "Ukraine", "58000"), StudioType.PHOTO);


        //show owners info
        System.out.print("*************OWNER*************\n");
        System.out.println(owner);
        System.out.print("*******************************\n\n");


        final Customer customer1 = new Customer("Mr", "Proper");
        final Customer customer2 = new Customer("Dom", "Estos");
        final Photographer photographer = new Photographer("Alex", "McLean");


        System.out.print("*******LENS QUEEN STUDIO*******\n");
        System.out.println(lensQueenStudio);
        System.out.print("*******************************\n\n");

    }
    }
