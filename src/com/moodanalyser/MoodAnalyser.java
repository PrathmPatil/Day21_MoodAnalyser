package com.moodanalyser;

public class MoodAnalyser {
	
	
 

String analyserMood(String mood)
 {
	 
		if(mood.contains("sad"))
			 return "sad";
		 else
			try {
				if(mood.contains("sad"))
					return "sad";
				else
					return "happy";
			}catch(NullPointerException e) {
		return "happy";
			}
 }
}
