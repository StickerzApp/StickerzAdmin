package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the campanha database table.
 * 
 */
@Entity
@NamedQuery(name="Campanha.findAll", query="SELECT c FROM Campanha c")
public class Campanha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCampanha;

	@Lob
	private String descCampanha;

	private int idRede;

	private String nomeCampanha;

	private int numCampanha;

	private String pathImagemFundo;

	//bi-directional many-to-one association to Adesaocampanha
	@OneToMany(mappedBy="campanha")
	private List<Adesaocampanha> adesaocampanhas;

	//bi-directional many-to-one association to Campanhaadesivo
	@OneToMany(mappedBy="campanha")
	private List<Campanhaadesivo> campanhaadesivos;

	public Campanha() {
	}

	public int getIdCampanha() {
		return this.idCampanha;
	}

	public void setIdCampanha(int idCampanha) {
		this.idCampanha = idCampanha;
	}

	public String getDescCampanha() {
		return this.descCampanha;
	}

	public void setDescCampanha(String descCampanha) {
		this.descCampanha = descCampanha;
	}

	public int getIdRede() {
		return this.idRede;
	}

	public void setIdRede(int idRede) {
		this.idRede = idRede;
	}

	public String getNomeCampanha() {
		return this.nomeCampanha;
	}

	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}

	public int getNumCampanha() {
		return this.numCampanha;
	}

	public void setNumCampanha(int numCampanha) {
		this.numCampanha = numCampanha;
	}

	public String getPathImagemFundo() {
		return this.pathImagemFundo;
	}

	public void setPathImagemFundo(String pathImagemFundo) {
		this.pathImagemFundo = pathImagemFundo;
	}

	public List<Adesaocampanha> getAdesaocampanhas() {
		return this.adesaocampanhas;
	}

	public void setAdesaocampanhas(List<Adesaocampanha> adesaocampanhas) {
		this.adesaocampanhas = adesaocampanhas;
	}

	public Adesaocampanha addAdesaocampanha(Adesaocampanha adesaocampanha) {
		getAdesaocampanhas().add(adesaocampanha);
		adesaocampanha.setCampanha(this);

		return adesaocampanha;
	}

	public Adesaocampanha removeAdesaocampanha(Adesaocampanha adesaocampanha) {
		getAdesaocampanhas().remove(adesaocampanha);
		adesaocampanha.setCampanha(null);

		return adesaocampanha;
	}

	public List<Campanhaadesivo> getCampanhaadesivos() {
		return this.campanhaadesivos;
	}

	public void setCampanhaadesivos(List<Campanhaadesivo> campanhaadesivos) {
		this.campanhaadesivos = campanhaadesivos;
	}

	public Campanhaadesivo addCampanhaadesivo(Campanhaadesivo campanhaadesivo) {
		getCampanhaadesivos().add(campanhaadesivo);
		campanhaadesivo.setCampanha(this);

		return campanhaadesivo;
	}

	public Campanhaadesivo removeCampanhaadesivo(Campanhaadesivo campanhaadesivo) {
		getCampanhaadesivos().remove(campanhaadesivo);
		campanhaadesivo.setCampanha(null);

		return campanhaadesivo;
	}

}