package com.enderdevelopment.female_piglins.personality;

import java.util.Random;

public class FemalePiglinPersonality {
    
    private static final String[] PERSONALITIES = {
            "Shy",
            "Outgoing",
            "Playful",
            "Serious",
            "Mysterious"
    };
    
    public static String getRandomPersonality() {
        Random random = new Random();
        return PERSONALITIES[random.nextInt(PERSONALITIES.length)];
    }
}