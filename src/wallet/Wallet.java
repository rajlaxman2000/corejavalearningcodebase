package wallet;

import java.util.*;

public class Wallet {
	
	HashMap<String, Integer> coinsCountMap;
	ArrayList<Coin> colOfCoins ;
	
	public Wallet(){
		this.colOfCoins= new ArrayList<Coin>();
		this.coinsCountMap= new HashMap<String, Integer>();
	}
	
	public void addCoin(Coin coin){
		if(colOfCoins.isEmpty()){
			this.colOfCoins.add(coin);
			this.coinsCountMap.put(coin.name,new Integer(1));
		}else{
			if(coinsCountMap.containsKey(coin.name)){
				this.coinsCountMap.put(coin.name,coinsCountMap.get(coin.name) + 1);
			}else{
				this.colOfCoins.add(coin);
				this.coinsCountMap.put(coin.name,new Integer(1));
			}
		}
	}

	public boolean sameCoin(Coin coin1, Coin coin2) {
		
		if (coin1.name.equals(coin2.name) && coin1.value.equals(coin2.value)){
			return true;
		}else{
			return false;
		}
	}
	
	public void printContent(Wallet wallet){
		
		System.out.println("*********Conent of wallaet ***************");
		System.out.println("start: ");
		//Collections.sort(wallet.getColOfCoins());
		
		for (Coin item :  wallet.getColOfCoins()) {
			 System.out.println(item.name+"("+item.value+")"+":"+this.coinsCountMap.get(item.name));
		}
		System.out.println("end: ");
	}

	public HashMap<String, Integer> getCoinsCountMap() {
		return coinsCountMap;
	}

	public void setCoinsCountMap(HashMap<String, Integer> coinsCountMap) {
		this.coinsCountMap = coinsCountMap;
	}

	public ArrayList<Coin> getColOfCoins() {
		return colOfCoins;
	}

	public void setColOfCoins(ArrayList<Coin> colOfCoins) {
		this.colOfCoins = colOfCoins;
	}

}
