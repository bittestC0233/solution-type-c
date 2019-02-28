package problem04;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[][] gugudan = new int[10][2];
		int[][] time = new int[10][2];
		
		for(int i = 1; i < 10; ++i) {
			for(int j = 0; j < 2; ++j) {
				gugudan[i][j] = new Random().nextInt(9) + 1;
			}
		}
	}
}