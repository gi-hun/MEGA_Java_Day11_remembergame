/*
 * # 기억력 게임
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 0
 * 입력2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */

package day_11;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// 셔플(shuffle)-> 랜던으로 숫자 바꾸는 역활
		int i = 0;
		while(i < 1000) {
		int r = ran.nextInt(10);
		int temp = front[0];
		front[0] = front[r];
		front[r] = temp;
						
		i += 1;
		}
		
		int count = 0;
		
		while(true)
		{
			System.out.println("<front>");
			for(int j=0; j<10; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			
			System.out.println("<back>");
			for(int j=0; j<10; j++) {
				System.out.print(back[j] + " ");
			}
			System.out.println();
			
			System.out.println("입력1:");
			int data1 = sc.nextInt();
			System.out.println("입력2:");
			int data2 = sc.nextInt();
			
			int check =0;
			
			if(front[data1] == front[data2])
			{
				back[data1] = front[data1];
				back[data2] = front[data2];
				count++;
			}
			
			if(count == 5)
			{
				System.out.println("모든 숫자를 다 맞혔습니다.");
				break;
				
			}
			
			
		}

	}
}
