package com.company.main;

import com.company.address.Address;
import com.company.address.Studio;
import com.company.address.StudioType;
import com.company.person.Owner;

public class Main {

    public static void main(String[] args) {
        final Owner owner;
        final Studio lensQueenStudio = new Studio("Lens Queen", new Address("Chernivtsi", "Kobilyanska. 10", "Ukraine", "58000"), StudioType.PHOTO);
        final Studio ambientPortraitureStudio = new Studio("Ambient Portraiture", new Address("Ternopil", "Holovna, 11", "Ukraine", "58000"), StudioType.PHOTO);
    }
}




