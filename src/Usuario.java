
public class Usuario {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String cidade;
	private String senha;

	public Usuario() {

	}

	public Usuario(String nome, String cpf, String email, String cidade, String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cidade = cidade;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [Nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", cidade=" + cidade + ", senha="
				+ senha + "]";
	}
	
	

}
