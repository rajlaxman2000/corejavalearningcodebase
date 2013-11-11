package wallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WalletTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
			
		Wallet wallet = new Wallet();
		
		String coinName;
		String coinValue;
		do{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Coin name ::");
	        coinName = br.readLine();
	        if (coinName.isEmpty()){
	        	System.out.println("**  Coin name can't be empty, I am terminating program **");
	        	break;
	        }
	        System.out.println("Enter Coin value::");
	        coinValue = br.readLine();
	        if (coinValue.isEmpty()){
	        	System.out.println("** Coin value can't be empty, I am terminating program **");
	        	break;
	        }else{
	        	Coin coin = new Coin(coinName, coinValue);
	        	wallet.addCoin(coin);
	        	wallet.printContent(wallet);
	        }
        	
		}while (true);
	}
	
}
