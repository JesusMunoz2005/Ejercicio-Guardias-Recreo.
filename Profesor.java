package guardias.recreo;

public class Profesor {
	private String id;
	private String email;
	private String nombre;
	
	public Profesor(String id, String em, String nomC) {
		this.setId(id);
		this.setEmail(em);
		this.setNombre(nomC);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
