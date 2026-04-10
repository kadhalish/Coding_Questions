package com.test.hacker;

import java.util.ArrayList;
import java.util.List;

public class MrXAndShots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> shot1 = new ArrayList<>();
		shot1.add(1);
		shot1.add(2);
		List<Integer> shot2 = new ArrayList<>();
		shot2.add(2);
		shot2.add(3);
		List<Integer> shot3 = new ArrayList<>();
		shot3.add(4);
		shot3.add(5);
		List<Integer> shot4 = new ArrayList<>();
		shot4.add(6);
		shot4.add(7);
		List<List<Integer>> shots = new ArrayList<>();
		shots.add(shot1);
		shots.add(shot2);
		shots.add(shot3);
		shots.add(shot4);
		
		List<Integer> player1 = new ArrayList<>();
		player1.add(1);
		player1.add(5);
		List<Integer> player2 = new ArrayList<>();
		player2.add(2);
		player2.add(3);
		List<Integer> player3 = new ArrayList<>();
		player3.add(4);
		player3.add(7);
		List<Integer> player4 = new ArrayList<>();
		player4.add(5);
		player4.add(7);
		List<List<Integer>> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		System.out.println(solve(shots, players));
	}

	public static int solve(List<List<Integer>> shots, List<List<Integer>> players) {
		int sum = 0;
		for (List<Integer> player : players) {
			int count = 0;
			int C = player.get(0);
			int D = player.get(1);
			for (List<Integer> shot : shots) {
				int B = shot.get(1);
				int A = shot.get(0);
				if(B>=C && A<=D) {
					count++;
				}
			}
			sum += count;
		}
		return sum;
	}
}
