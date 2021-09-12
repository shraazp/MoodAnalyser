package com.user.mood.analyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.hamcrest.CoreMatchers;

public class MoodAnalyserTest {
    
    @Test
    /*Method to check if 
     * sentance contains word sad
     */
    public void sadCheck() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
    
    /*Method to check if 
     * sentance contains word happy
     */
    @Test
    public void happyCheck() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    
    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
        
    }

    
}