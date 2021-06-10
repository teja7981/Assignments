package springbasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {
	
	@Value("apj abdul kaalam")
	private String authName;
	
	@Value("110")
	private int noOfBooksWrtten;
	
	@Value("english")
	private String lanaguage;

	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String authName, int noOfBooksWrtten, String lanaguage) {
		super();
		this.authName = authName;
		this.noOfBooksWrtten = noOfBooksWrtten;
		this.lanaguage = lanaguage;
	}
	@Override
	public String toString() {
		return "Author [authName=" + authName + ", noOfBooksWrtten=" + noOfBooksWrtten + ", lanaguage=" + lanaguage
				+ "]";
	}
	
	
	
}
