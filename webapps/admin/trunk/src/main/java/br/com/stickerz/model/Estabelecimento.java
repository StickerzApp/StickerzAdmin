package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estabelecimento database table.
 * 
 */
@Entity
@NamedQuery(name="Estabelecimento.findAll", query="SELECT e FROM Estabelecimento e")
public class Estabelecimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEstabelecimento;

	private byte bolAtivo;

	private String descCidade;

	private String descEndereco;

	private String descGeolocalizacao;

	private String descUf;

	private int idRede;

	private String nomeFantasia;

	private String numCep;

	private String numCnpj;

	//bi-directional many-to-one association to Adesaocampanha
	@OneToMany(mappedBy="estabelecimento")
	private List<AdesaoCampanha> adesaocampanhas;

	//bi-directional many-to-one association to Terminal
	@OneToMany(mappedBy="estabelecimento")
	private List<Terminal> terminals;

	//bi-directional many-to-one association to Usuarioestabelecimento
	@OneToMany(mappedBy="estabelecimento")
	private List<UsuarioEstabelecimento> usuarioestabelecimentos;

	public Estabelecimento() {
	}

	public int getIdEstabelecimento() {
		return this.idEstabelecimento;
	}

	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public byte getBolAtivo() {
		return this.bolAtivo;
	}

	public void setBolAtivo(byte bolAtivo) {
		this.bolAtivo = bolAtivo;
	}

	public String getDescCidade() {
		return this.descCidade;
	}

	public void setDescCidade(String descCidade) {
		this.descCidade = descCidade;
	}

	public String getDescEndereco() {
		return this.descEndereco;
	}

	public void setDescEndereco(String descEndereco) {
		this.descEndereco = descEndereco;
	}

	public String getDescGeolocalizacao() {
		return this.descGeolocalizacao;
	}

	public void setDescGeolocalizacao(String descGeolocalizacao) {
		this.descGeolocalizacao = descGeolocalizacao;
	}

	public String getDescUf() {
		return this.descUf;
	}

	public void setDescUf(String descUf) {
		this.descUf = descUf;
	}

	public int getIdRede() {
		return this.idRede;
	}

	public void setIdRede(int idRede) {
		this.idRede = idRede;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNumCep() {
		return this.numCep;
	}

	public void setNumCep(String numCep) {
		this.numCep = numCep;
	}

	public String getNumCnpj() {
		return this.numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	public List<AdesaoCampanha> getAdesaocampanhas() {
		return this.adesaocampanhas;
	}

	public void setAdesaocampanhas(List<AdesaoCampanha> adesaocampanhas) {
		this.adesaocampanhas = adesaocampanhas;
	}

	public AdesaoCampanha addAdesaocampanha(AdesaoCampanha adesaocampanha) {
		getAdesaocampanhas().add(adesaocampanha);
		adesaocampanha.setEstabelecimento(this);

		return adesaocampanha;
	}

	public AdesaoCampanha removeAdesaocampanha(AdesaoCampanha adesaocampanha) {
		getAdesaocampanhas().remove(adesaocampanha);
		adesaocampanha.setEstabelecimento(null);

		return adesaocampanha;
	}

	public List<Terminal> getTerminals() {
		return this.terminals;
	}

	public void setTerminals(List<Terminal> terminals) {
		this.terminals = terminals;
	}

	public Terminal addTerminal(Terminal terminal) {
		getTerminals().add(terminal);
		terminal.setEstabelecimento(this);

		return terminal;
	}

	public Terminal removeTerminal(Terminal terminal) {
		getTerminals().remove(terminal);
		terminal.setEstabelecimento(null);

		return terminal;
	}

	public List<UsuarioEstabelecimento> getUsuarioestabelecimentos() {
		return this.usuarioestabelecimentos;
	}

	public void setUsuarioestabelecimentos(List<UsuarioEstabelecimento> usuarioestabelecimentos) {
		this.usuarioestabelecimentos = usuarioestabelecimentos;
	}

	public UsuarioEstabelecimento addUsuarioestabelecimento(UsuarioEstabelecimento usuarioestabelecimento) {
		getUsuarioestabelecimentos().add(usuarioestabelecimento);
		usuarioestabelecimento.setEstabelecimento(this);

		return usuarioestabelecimento;
	}

	public UsuarioEstabelecimento removeUsuarioestabelecimento(UsuarioEstabelecimento usuarioestabelecimento) {
		getUsuarioestabelecimentos().remove(usuarioestabelecimento);
		usuarioestabelecimento.setEstabelecimento(null);

		return usuarioestabelecimento;
	}

}