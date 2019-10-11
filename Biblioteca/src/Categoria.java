import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class Categoria implements Identificavel {
	@Id
	private Long Id;
	private String descricao;
	private Long codigo_categoria;

	@OneToMany(mappedBy = "Livro")
	Set<Livro> livros;

	@Override
	public String toString() {
		return "Categoria [Id=" + Id + ", descricao=" + descricao + ", codigo_categoria=" + codigo_categoria + "]";
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCodigo_categoria() {
		return codigo_categoria;
	}

	public void setCodigo_categoria(Long codigo_categoria) {
		this.codigo_categoria = codigo_categoria;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (codigo_categoria == null) {
			if (other.codigo_categoria != null)
				return false;
		} else if (!codigo_categoria.equals(other.codigo_categoria))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

}
