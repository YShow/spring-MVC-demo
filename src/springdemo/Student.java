package springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;

	public final String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public final void setFavoriteLanguage(final String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	private final LinkedHashMap<String, String> countryOptions;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
	}

	public final LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public final String getCountry() {
		return country;
	}

	public final void setCountry(final String country) {
		this.country = country;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
