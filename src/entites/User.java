package entities;

public class User {
	private String name;
	private String email;
	private String adress;
	private Long number;

	public User() {
	}

	public User(String name, String email, String adress, Long num) {
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.number = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String toString() {
		return "Nome = " + name + "\nEmail = " + email + "\nEndereço = " + adress + "\nNúmero de telefone = " + number;
	}

}