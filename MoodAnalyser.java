package com.user.mood.analyser;

public class MoodAnalyser {
    String message;
    
    public MoodAnalyser(){
        this.message = null;
    }
    
    public MoodAnalyser(String message){
        this.message = message;
    }


    public String analyseMood() {
        try {
            if(message.contains(("sad"))){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(NullPointerException e) {
            return "HAPPY";
        }
    }

}

