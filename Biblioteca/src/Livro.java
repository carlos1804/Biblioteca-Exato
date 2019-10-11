import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Livro implements Identificavel {
	@Id
	private String titulo;
	private Long Id;
	private int ano;
	private String editora;
	private long ISBN;
	private String autores;

	@GeneratedValue(generator = "Livros_Autores", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Livros_Autores", sequenceName = "Livros_Autores")
	@ManyToMany
	@JoinTable(name = "Livros_Autores", joinColumns = @JoinColumn(name = "id_livros"), inverseJoinColumns = @JoinColumn(name = "cpf_autores"))
	private Set<Autores> autoress;


	@OneToMany(mappedBy = "categoria")
	Categoria categoria;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public Long getId() {
		return Id;
	}

	@Override
	public void setId(Long id) {
		Id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (ISBN != other.ISBN)
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (ano != other.ano)
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", Id=" + Id + ", ano=" + ano + ", editora=" + editora + ", ISBN=" + ISBN
				+ ", autores=" + autores + "]";
	}

}
