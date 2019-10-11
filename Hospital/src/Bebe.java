import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Bebe implements Identificavel {
	@Id
	private Long Id;
	private String nome;
	private Long peso;
	private int data_nascimento;
	private Double altura;
	private String nome_da_mae;
	private String Medico_responsavel;

	@OneToMany(mappedBy = "hospital")
	Hospital hospital;

	@ManyToMany(mappedBy = "bebe")
	private Set<Medico> medico;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public int getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNome_da_mae() {
		return nome_da_mae;
	}

	public void setNome_da_mae(String nome_da_mae) {
		this.nome_da_mae = nome_da_mae;
	}

	public String getMedico_responsavel() {
		return Medico_responsavel;
	}

	public void setMedico_responsavel(String medico_responsavel) {
		Medico_responsavel = medico_responsavel;
	}

	@Override
	public String toString() {
		return "Bebe [Id=" + Id + ", nome=" + nome + ", peso=" + peso + ", data_nascimento=" + data_nascimento
				+ ", altura=" + altura + ", nome_da_mae=" + nome_da_mae + ", Medico_responsavel=" + Medico_responsavel
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebe other = (Bebe) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Medico_responsavel == null) {
			if (other.Medico_responsavel != null)
				return false;
		} else if (!Medico_responsavel.equals(other.Medico_responsavel))
			return false;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (data_nascimento != other.data_nascimento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nome_da_mae == null) {
			if (other.nome_da_mae != null)
				return false;
		} else if (!nome_da_mae.equals(other.nome_da_mae))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		return true;
	}

}
