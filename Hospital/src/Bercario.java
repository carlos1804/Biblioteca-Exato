import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bercario implements Identificavel {
	@Id
	private Long Id;
	private String nome;
	private int telefone;
	private int data_nascinento_bebe;
	private String endereco;

	@OneToMany(mappedBy = "hospital")
	Hospital hospital;

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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getData_nascinento_bebe() {
		return data_nascinento_bebe;
	}

	public void setData_nascinento_bebe(int data_nascinento_bebe) {
		this.data_nascinento_bebe = data_nascinento_bebe;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Bercario [Id=" + Id + ", nome=" + nome + ", telefone=" + telefone + ", data_nascinento_bebe="
				+ data_nascinento_bebe + ", endereco=" + endereco + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bercario other = (Bercario) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (data_nascinento_bebe != other.data_nascinento_bebe)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}

}
