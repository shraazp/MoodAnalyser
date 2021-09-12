package com.user.mood.analyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    
    @Test
    /*Method to check if 
     * sentance contains word sad
     */
    public void sadCheck()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalyserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /*Method to check if 
     * sentance contains word happy
     */
    @Test
    public void happyCheck() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Test
    public void givenMoodNullShouldHandleException()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
            
        } catch (MoodAnalyserException e) {
            // TODO Auto-generated catch block
            Assert.assertEquals("Please enter proper message", e.getMessage());
        }
    }
    
    @Test
    public void givenMoodEmptyShouldHandleException()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood();         
        } catch (MoodAnalyserException e) {
            // TODO Auto-generated catch block
            Assert.assertEquals("Please enter proper message", e.getMessage());
        }
    }
    
}