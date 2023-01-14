package com.moodanalyser;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MoodAnalyser moodanalyser=new MoodAnalyser();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mood: ");
		String mood=sc.nextLine();
		String moodCase=mood.toLowerCase();
		System.out.println(moodanalyser.analyserMood(moodCase));
		
	}

}
