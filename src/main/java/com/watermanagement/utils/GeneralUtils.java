package com.watermanagement.utils;

import java.util.UUID;

public class GeneralUtils {
    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
