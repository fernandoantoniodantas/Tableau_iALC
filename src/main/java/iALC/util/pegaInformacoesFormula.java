package iALC.util;

import java.util.Iterator;
import java.util.ListIterator;

import graph.TableauxTree;

import iALC.vetInvet.Node;
import iALC.vetInvet.NodeTreeViewPosition;
import iALC.vetInvet.PrincipalNew;

public class pegaInformacoesFormula {
	
	String formula=null;
	char expansao;
	char signal;
	String mundo;
	int X;
	int Y;
	
	public String getFormula(int idNo) {
		Iterator<Node> iterator = PrincipalNew.mainList.iterator();
		while (iterator.hasNext()) {
			Node no = iterator.next();
			if (no.getIndice()==idNo){
				formula = no.getFormula();
			}
		}
		return formula;
	}

	public char getExpansao(int idNo) {
		Iterator<Node> iterator = PrincipalNew.mainList.iterator();
		while (iterator.hasNext()) {
			Node no = iterator.next();
			if (no.getIndice()==idNo){
				expansao = no.getTipoExpansao();
			}
		}
		return expansao;
	}
	
	public char getSignal(int idNo) {
		Iterator<Node> iterator = PrincipalNew.mainList.iterator();
		while (iterator.hasNext()) {
			Node no = iterator.next();
			if (no.getIndice()==idNo){
				signal = no.getSignal();
			}
		}
		return signal;
	}	
	
	public String getMundo(int idNo) {
		Iterator<Node> iterator = PrincipalNew.mainList.iterator();
		while (iterator.hasNext()) {
			Node no = iterator.next();
			if (no.getIndice()==idNo){
				mundo = no.getWorld();
			}
		}
		return mundo;
	}
	
	public int getX(int idNo) {
		Iterator<NodeTreeViewPosition> iterator = TableauxTree.listNodeView.iterator();
        while(iterator.hasNext()){
        	NodeTreeViewPosition no = iterator.next();
			if (no.getId()==idNo){
				X = no.getX();
			}
		}
		return X;
	}	

	public int getY(int idNo) {
		Iterator<NodeTreeViewPosition> iterator = TableauxTree.listNodeView.iterator();
        while(iterator.hasNext()){
        	NodeTreeViewPosition no = iterator.next();
			if (no.getId()==idNo){
				Y = no.getY();
			}
		}
		return Y;
	}	

	
}
