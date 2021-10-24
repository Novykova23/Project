package com.company.idutill;

import java.util.UUID;

class IdUtil {
    public static String generateRandom() {
        return UUID.randomUUID().toString();
    }
}
