package com.practise;

import java.util.ArrayList;
import java.util.List;

public class RegexExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> input = new ArrayList<String>();
		input.add("etears_A1_12-17-2007_12:30:00_.PDF");
		input.add("etears_A2_12-17-2007_12:31:01_.PDF");
		input.add("etears_A3_12-17-2007_12:32:02_.PDF");
		input.add("etears_A1");
	System.out.println("aaa");
		for (String test : input){
//			if(test.matches("^(etears_A\\d+)$")){
			if(test.matches("^(etears_A\\d+_12-17-2007_\\d{2}:\\d{2}:\\d{2}_.PDF)$")){
				System.out.println(test);	
			}
			else
				System.out.println("Test failed");
		}
	}

}
