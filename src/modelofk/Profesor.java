package modelofk;
// Generated 21:08:45, 9 de mar. de 2023 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

/**
 * Profesor generated by hbm2java
 */
@Entity
@Table(name = "profesor", catalog = "instituto")
public class Profesor implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String ape1;
	private String ape2;
	private String tipoFuncionario;
	private ContactInfo contactInfo;
	private Set<Modulo> modulos = new HashSet<Modulo>(0);

	public Profesor() {
	}

	public Profesor(String nombre, String ape1, String ape2) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
	}

	public Profesor(String nombre, String ape1, String ape2, 
			String tipoFuncionario, ContactInfo contactInfo,
			Set<Modulo> modulos) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.tipoFuncionario = tipoFuncionario;
		this.contactInfo = contactInfo;
		this.modulos = modulos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ape1", nullable = false)
	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	@Column(name = "ape2", nullable = false)
	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	@Column(name = "tipoFuncionario", length = 100)
	public String getTipoFuncionario() {
		return this.tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "profesor", optional=false)
	public ContactInfo getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "profesormodulo", catalog = "instituto", joinColumns = {
			@JoinColumn(name = "idProfesor", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idModulo", nullable = false, updatable = false) })
	
	public Set<Modulo> getModulos() {
		return this.modulos;
	}

	public void setModulos(Set<Modulo> modulos) {
		this.modulos = modulos;
	}

}
