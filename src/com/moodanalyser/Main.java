package com.moodanalyser;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MoodAnalyseException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mood: ");
		String mood=sc.nextLine();
		String moodCase=mood.toLowerCase();
		MoodAnalyser moodanalyser=new MoodAnalyser();
		try {
		System.out.println(moodanalyser.analyserMood(moodCase));
		}catch(MoodAnalyseException e) {
			System.out.println("This is a customException block");
			System.out.println("happy");
		}
		
		
	}

}
