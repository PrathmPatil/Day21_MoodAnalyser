package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void  testanalyserMood() {
		MoodAnalyser moodanalyser=new MoodAnalyser();
		String mood="sad";
		String actual=moodanalyser.analyserMood(mood);
		assertEquals("sad", actual);
	}

}
