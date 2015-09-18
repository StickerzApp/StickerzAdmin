package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the terminal database table.
 * 
 */
@Entity
@NamedQuery(name="Terminal.findAll", query="SELECT t FROM Terminal t")
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTerminal;

	private byte bolAtivo;

	private String descChaveTerminal;

	private String descEndrecoMac;

	private int numTerminal;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="IdEstabelecimento")
	private Estabelecimento estabelecimento;

	public Terminal() {
	}

	public int getIdTerminal() {
		return this.idTerminal;
	}

	public void setIdTerminal(int idTerminal) {
		this.idTerminal = idTerminal;
	}

	public byte getBolAtivo() {
		return this.bolAtivo;
	}

	public void setBolAtivo(byte bolAtivo) {
		this.bolAtivo = bolAtivo;
	}

	public String getDescChaveTerminal() {
		return this.descChaveTerminal;
	}

	public void setDescChaveTerminal(String descChaveTerminal) {
		this.descChaveTerminal = descChaveTerminal;
	}

	public String getDescEndrecoMac() {
		return this.descEndrecoMac;
	}

	public void setDescEndrecoMac(String descEndrecoMac) {
		this.descEndrecoMac = descEndrecoMac;
	}

	public int getNumTerminal() {
		return this.numTerminal;
	}

	public void setNumTerminal(int numTerminal) {
		this.numTerminal = numTerminal;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}