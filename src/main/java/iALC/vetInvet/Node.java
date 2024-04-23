package iALC.vetInvet;

public class Node {

	private int indice;
	private String formula;
	private char signal;
	private int positionConectivoPrincipal;
	private char ConectivoPrincipal;
	private char tipoExpansao; //alpha ou beta
	private String tipodaformula; //Se LP ou LPO
	private String world;
	private String branch;
	private char checked;
	private String indiceFilho;
	private String indicePai;
	private int nivel; 
	private int antecedente;
	private String Relacao;
    //private World world;
	
	

	 


	@Override
	public String toString() {
		return "Node [indice=" + indice + ", formula=" + formula + ", signal=" + signal
				+ ", positionConectivoPrincipal=" + positionConectivoPrincipal + ", ConectivoPrincipal="
				+ ConectivoPrincipal + ", tipoExpansao=" + tipoExpansao + ", tipodaformula=" + tipodaformula
				+ ", world=" + world + ", branch=" + branch + ", checked=" + checked + ", indiceFilho=" + indiceFilho
				+ ", indicePai=" + indicePai + ", nivel=" + nivel + ", antecedente=" + antecedente + ", Relacao="
				+ Relacao + "]";
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}

	public char getSignal() {
		return signal;
	}


	public void setSignal(char signal) {
		this.signal = signal;
	}


	public String getFormula() {
		return formula;
	}


	public void setFormula(String formula) {
		this.formula = formula;
	}


	public int getpositionConectivoPrincipal() {
		return positionConectivoPrincipal;
	}


	public void setpositionConectivoPrincipal(int positionConectivoPrincipal) {
		this.positionConectivoPrincipal = positionConectivoPrincipal;
	}

	public char getConectivoPrincipal() {
		return ConectivoPrincipal;
	}


	public void setConectivoPrincipal(char ConectivoPrincipal) {
		this.ConectivoPrincipal = ConectivoPrincipal;
	}

	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public char getChecked() {
		return checked;
	}


	public void setChecked(char checked) {
		this.checked = checked;
	}


	public String getIndiceFilho() {
		return indiceFilho;
	}


	public void setIndiceFilho(String indiceFilho) {
		this.indiceFilho = indiceFilho;
	}


	public String getIndicePai() {
		return indicePai;
	}


	public void setIndicePai(String indicePai) {
		this.indicePai = indicePai;
	}


	public int getPositionConectivoPrincipal() {
		return positionConectivoPrincipal;
	}


	public void setPositionConectivoPrincipal(int positionConectivoPrincipal) {
		this.positionConectivoPrincipal = positionConectivoPrincipal;
	}


	public char getTipoExpansao() {
		return tipoExpansao;
	}


	public void setTipoExpansao(char tipoExpansao) {
		this.tipoExpansao = tipoExpansao;
	}


	public String getTipodaformula() {
		return tipodaformula;
	}


	public void setTipodaformula(String tipodaformula) {
		this.tipodaformula = tipodaformula;
	}


	public String getWorld() {
		return world;
	}


	public void setWorld(String world) {
		this.world = world;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getAntecedente() {
		return antecedente;
	}


	public void setAntecedente(int antecedente) {
		this.antecedente = antecedente;
	}


	public String getRelacao() {
		return Relacao;
	}


	public void setRelacao(String relacao) {
		Relacao = relacao;
	}



	
}