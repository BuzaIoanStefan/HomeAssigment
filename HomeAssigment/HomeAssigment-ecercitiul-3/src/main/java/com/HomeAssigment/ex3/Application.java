package com.HomeAssigment.ex3;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = {130, 191, 200, 10};
		System.out.println("Max sum: " + solution.solution(A));
	}
}
