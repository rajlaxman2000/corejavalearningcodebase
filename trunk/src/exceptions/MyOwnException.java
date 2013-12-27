package exceptions;

public class MyOwnException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public Integer appExCode;
	
	public MyOwnException(String message, Integer code) {		
		
	}
	
	public MyOwnException(String message) {		
		super(message);
	}

	/**
	 * @return the appExCode
	 */
	public Integer getAppExCode() {
		return appExCode;
	}

	/**
	 * @param appExCode the appExCode to set
	 */
	public void setAppExCode(Integer appExCode) {
		this.appExCode = appExCode;
	}
	

}
