package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void  testanalyserMood() {
		String actual;
		MoodAnalyser moodanalyser=new MoodAnalyser("sad");
		actual=moodanalyser.analyserMood();
		assertEquals("sad", actual);
	}

}
