package net.webservicex;

public class FirstWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GlobalWeather globalWeather = new GlobalWeather();
		
		GlobalWeatherSoap  getGlobalWeatherSoap  = globalWeather.getGlobalWeatherSoap();
		System.out.println(getGlobalWeatherSoap.getWeather("Florida", "United states"));
		//getGlobalWeatherSoap.getWeather("Florida", "United states");
		System.out.println(getGlobalWeatherSoap.getCitiesByCountry("India"));
	}

}
