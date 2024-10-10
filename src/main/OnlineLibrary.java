package main;

import java.util.ArrayList;
import java.util.List;

public class OnlineLibrary {
	public int tome1,tome2,tome3,tome4,tome5;
	public float basePrice = 8f;
	public float reduction2tome = 0.05f;
	public float reduction3tome=0.1f;
	public float reduction4tome=0.2f;
	public float reduction5tome=0.25f;
	
	 public static double amountSeries(int nbTome1, int nbTome2, int
			 nbTome3, int nbTome4, int nbTome5) {
		 
		 if(nbTome1 <=0 && nbTome2<=0 && nbTome3<=0 && nbTome4<=0 && nbTome5<=0) {
			 return 0;
		 }
		 List<Integer> nbTomes = new ArrayList<>();
		 nbTomes.add(nbTome1);
		 nbTomes.add(nbTome2);
		 nbTomes.add(nbTome3);
		 nbTomes.add(nbTome4);
		 nbTomes.add(nbTome5);
		 int cpt = 0;
		 for(Integer tome : nbTomes) {
			 if(tome>0) {
				 cpt++;
			 }
			 tome--;
		 }
		 return cpt;
		 
	 }
			 
	

}
