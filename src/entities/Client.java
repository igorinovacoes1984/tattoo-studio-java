package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private String phone;
	private String address;
	private String email;
	private String cpf;
	private String observations;
	private LocalDate birthDate;

	private List<Scheduling> schedulings = new ArrayList<>();

	public Client() {

	}

	public Client(String name, String phone, String address, String email, String cpf, String observations,
			LocalDate birthDate) {

		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.cpf = cpf;
		this.observations = observations;
		this.birthDate = birthDate;

	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getObservations() {
		return observations;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public List<Scheduling> getSchedulings() {
		return schedulings;
	}
	
	public void addScheduling(Scheduling scheduling) {
		schedulings.add(scheduling);
	}
	
	public void removeScheduling(Scheduling scheduling) {
		schedulings.remove(scheduling);
	}

	@Override
	public String toString() {
		return "CLIENTE: " + name + ", TELEFONE: " + phone;
	}

}
