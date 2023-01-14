package com.moodanalyser;

public class MoodAnalyser {
	
	
String analyserMood(String mood) throws MoodAnalyseException
 {
	 
		if(mood.contains("sad")) {
			return "sad";
		}
		else {
			throw new MoodAnalyseException(mood);}
 }
}
