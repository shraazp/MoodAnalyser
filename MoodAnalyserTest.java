package com.user.mood.analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
     @Test
    /*test method to check if 
     * Sentence contains word sad
     */
    public void sadCheck() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertEquals(mood,"SAD");
    }

    /* test method to check if 
     * Sentence contains word happy
     */
     @Test
    public void happyCheck() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy message");
        Assert.assertEquals(mood,"HAPPY");
    }
}
