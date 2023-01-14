package com.moodanalyser;

public class MoodAnalyser {
	
	private String mood;
	// defalut constuctor
	MoodAnalyser(){}
	//parameterised constuctor
	MoodAnalyser(String mood)
	{
		this.mood=mood;
	}
 String analyserMood()
 {
	 if(mood.contains("sad"))
		 return "sad";
	 else
		 return "happy";
	
 }
}
