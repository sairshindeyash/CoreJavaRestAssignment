package com.yash.assignment;

public class Series {

	
	public int oddNumberFromSeries(Integer[] sList) {
	
		for(int i=0,j=i+1;i<sList.length;i=+1,j=j+1)
			if((sList[i+2])-sList[i] !=5) {
				System.out.println("sList[i+1] :-"+sList[i+1]);
				return sList[i+1];
			}
			else if(sList[j+2]-sList[j] !=10) {
				System.out.println("sList[j+2] :-"+sList[j+2]);
				return sList[j+2];
			}
		return 0;
	}
	public static void main(String[] args) {
		Series series=new Series();
		Integer[] num=new Integer[] {3,12,8,19,13,32,18,42,23,52};
				System.out.println(series.oddNumberFromSeries(num));
}
}
