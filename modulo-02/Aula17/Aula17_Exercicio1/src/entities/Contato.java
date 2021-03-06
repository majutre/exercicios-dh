package entities;



public class Contato  {
	
	private Integer id;
	private String name;
	private Integer age;
	private String telephone;
	private Endereco address = new Endereco();
	
	public Contato() {
		
	}
	public Contato(int id, String name, int age, String telephone, Endereco address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.telephone = telephone;
		this.address = address;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Endereco getAddress() {
		return address;
	}
	public void setAddress(Endereco address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", telephone=" + telephone + address + "]";
	}
}