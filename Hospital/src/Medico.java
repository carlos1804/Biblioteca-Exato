import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Medico implements Identificavel {
	@Id
	private Long Id;
	private int CRM;
	private String nome;
	private int telefone_celular;
	private String especialidade;
	@GeneratedValue(generator = "Medico_Bebe", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Medico_Bebe", sequenceName = "Medico_Bebe")
	@ManyToMany
	@JoinTable(name = "Medico_Bebe", joinColumns = @JoinColumn(name = "id_medico"), inverseJoinColumns = @JoinColumn(name = "id_bebe"))
	private Set<Bebe> bebe;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(int telefone_celular) {
		this.telefone_celular = telefone_celular;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Medico [Id=" + Id + ", CRM=" + CRM + ", nome=" + nome + ", telefone_celular=" + telefone_celular
				+ ", especialidade=" + especialidade + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (CRM != other.CRM)
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone_celular != other.telefone_celular)
			return false;
		return true;
	}

}
