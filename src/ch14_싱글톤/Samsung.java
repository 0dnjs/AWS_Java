package ch14_싱글톤;

import java.time.LocalDate;

public class Samsung {
	private static Samsung instance; // 인스턴스
	
	
	private String companyName;
	private int autoIncrementSerialNumber = LocalDate.now().getYear() * 10000;
	
	private Samsung() { // 프라이빗
		companyName = Samsung.class.getSimpleName().toUpperCase();
	}
	
	public static Samsung getInstance() { // 겟인스턴스
		if(instance == null) {
			instance = new Samsung();
		}
		return instance;
	}
	
	public int getAutoIncrementSerialNumber() {
		return autoIncrementSerialNumber;
	}
	public void setAutoIncrementSerialNumber(int autoIncrementSerialNumber) {
		this.autoIncrementSerialNumber = autoIncrementSerialNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	
}
