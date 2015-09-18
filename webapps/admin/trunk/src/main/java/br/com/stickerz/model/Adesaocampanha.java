package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the adesaocampanha database table.
 * 
 */
@Entity
@NamedQuery(name="Adesaocampanha.findAll", query="SELECT a FROM Adesaocampanha a")
public class Adesaocampanha implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AdesaocampanhaPK id;

	private byte bolAtivo;

	//bi-directional many-to-one association to Campanha
	@ManyToOne
	@JoinColumn(name="IdCampanha")
	private Campanha campanha;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="IdEstabelecimento")
	private Estabelecimento estabelecimento;

	public Adesaocampanha() {
	}

	public AdesaocampanhaPK getId() {
		return this.id;
	}

	public void setId(AdesaocampanhaPK id) {
		this.id = id;
	}

	public byte getBolAtivo() {
		return this.bolAtivo;
	}

	public void setBolAtivo(byte bolAtivo) {
		this.bolAtivo = bolAtivo;
	}

	public Campanha getCampanha() {
		return this.campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}