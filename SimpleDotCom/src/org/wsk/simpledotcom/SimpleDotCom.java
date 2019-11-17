package org.wsk.simpledotcom;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = 0;
		try {
			guess = Integer.parseInt(stringGuess);
		}catch(Exception e) {
			e.printStackTrace();
			guess = (int) (Math.random() * 5);
		}
		String result = "miss";
		for (int cell : locationCells) {
			if(guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}


}
