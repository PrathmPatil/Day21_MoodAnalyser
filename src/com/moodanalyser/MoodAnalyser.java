package com.moodanalyser;

public class MoodAnalyser {
 String analyserMood(String mood)
 {
	 if(mood.contains("sad"))
		 return "sad";
	 else if(mood.contains("happy"))
		 return "happy";
	 else
		 return "Plese enter valid mood";
 }
}
