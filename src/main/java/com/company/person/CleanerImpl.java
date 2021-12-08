package com.company.person;

import com.company.interfaces.Cleaner;

public class CleanerImpl extends Person implements Cleaner {
    protected CleanerImpl(String givenName, String familyName) {
        super(givenName);
    }
         public String givenName;
         public String familyName;
         public int vaccuumCleaner;
         public int washingMachine;

            public CleanerImpl(String givenName, String familyName, int vaccuumCleaner, int washingMachine) {
                this.vaccuumCleaner = vaccuumCleaner;
                this.washingMachine = washingMachine;
            }

        public void clean () {

        }
        public void washTowels () {

        }
        public void waterPots () {

        }
    }
