package iALC.vetInvet;


/*
 * Para marcar as posições nos eixos X e Y da tree view.
 */
public class NodeTreeViewPosition implements Comparable<NodeTreeViewPosition> {
	private int id;
	private int x;
	private int y;
	private char tipo; //A Alfa ou Beta
	private char ativo; //Se 'S' vale na branch, se 'N' nao vale (corte)
	
	@Override
	public String toString() {
		return "NodeTreeViewPosition [id=" + id + ", x=" + x + ", y=" + y + ", tipo=" + tipo + ", ativo=" + ativo + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getAtivo() {
		return ativo;
	}
	public void setAtivo(char ativo) {
		this.ativo = ativo;
	}

	/*
	 * @Override public int compareTo(NodeTreeViewPosition o) { // TODO
	 * Auto-generated method stub return 0; }
	 */	
	@Override public int compareTo(NodeTreeViewPosition o) { 
		if (this.id > o.getId()) { 
		  return 1; 
		  } if (this.id < o.getId()) { 
		  return -1; 
		  } 
		  return 0; 
		 }
	
	
	

}
