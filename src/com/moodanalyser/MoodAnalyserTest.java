package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void  testanalyserMood() {
		
		MoodAnalyser moodanalyser=new MoodAnalyser();
		String mood=" ";
		String actual;
		try {
			actual = moodanalyser.analyserMood(mood);
			assertEquals("happy", actual);
		} catch (MoodAnalyseException e) {
			
		}
		
	}

}
