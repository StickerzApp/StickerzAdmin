package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarioestabelecimento database table.
 * 
 */
@Entity
@NamedQuery(name="Usuarioestabelecimento.findAll", query="SELECT u FROM Usuarioestabelecimento u")
public class Usuarioestabelecimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioestabelecimentoPK id;

	private byte bolAtivo;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="IdEstabelecimento")
	private Estabelecimento estabelecimento;

	public Usuarioestabelecimento() {
	}

	public UsuarioestabelecimentoPK getId() {
		return this.id;
	}

	public void setId(UsuarioestabelecimentoPK id) {
		this.id = id;
	}

	public byte getBolAtivo() {
		return this.bolAtivo;
	}

	public void setBolAtivo(byte bolAtivo) {
		this.bolAtivo = bolAtivo;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}