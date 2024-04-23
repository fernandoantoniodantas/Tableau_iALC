package iALC.vetInvet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import graph.Modelos;
import graph.TableauxTree;

import iALC.prefixa.FormulaPrefixa;
import iALC.rules.Rules;
import iALC.util.AlphaBeta;
import iALC.util.CountSymbol;
import iALC.util.FormulaModal;
import iALC.util.ListaSeusAdjacentes;
import iALC.util.PegaConectivoPorIndice;
//import iALC.util.RemocaoParentesesExtras;
import iALC.util.PegaFolha2;
import iALC.util.PegarIndiceConectivo;
import iALC.util.GFG;
import iALC.grammar.*;

public class PrincipalNew {

	public static LinkedList<Node> mainList = new LinkedList<Node>();
    public static List<List<Integer>> listaAdj = new ArrayList<>();
    public static Map<Integer, List<Integer>> hashMap = new HashMap<>();
    public static List<Integer> listaAdj2 = new ArrayList<>();
    public static Map<Integer, Integer> hashSiblings = new HashMap<>();

	static boolean loop = true;
	public static List<Integer> celula;
	
	public static List<Integer> waysNovo = new ArrayList<>();

	public Node searchNotChecked(LinkedList<Node> lista) {
		Iterator<Node> iteracao = lista.iterator();		
		while (iteracao.hasNext()) {
			Node no = iteracao.next();	
			System.out.println("Consultando Nó ->"+no.getIndice()+"     ["+no.getWorld()+"]   "+no.getSignal()+" "+no.getFormula()+" Conectivo: "+no.getConectivoPrincipal()+"["+no.getpositionConectivoPrincipal()+"]"+" Tipo da Expansão: "+no.getTipoExpansao()+" Nó Pai: "+no.getIndicePai()+" Checked:"+no.getChecked());
			if (no.getChecked()=='N') {
				loop = true;
				no.setChecked('N'); 
				return no;
			}
		}loop = false; return null;
	}
	
	
	public int qtdFolhas(List<List<Integer>> listaAdj, int id) {
		int count = 0;
		List<Integer> lista = listaAdj.get(id-1);
		for (int j = 0; j < lista.size(); j++) {
			count++;
			System.out.println("ID->"+(id-1)+" qtd->"+count);
		}
		System.out.println("ID->"+(id-1)+" qtd->"+count);	
	return count-1; //-1 porque 1 é o próprio nó
	}

	public int idsFolhas(List<List<Integer>> listaAdj, int id) {
		int count = 0;
		List<Integer> lista = listaAdj.get(id-1);
		for (int j = 0; j < lista.size(); j++) {
			count++;
			System.out.println("ID->"+(id-1)+" qtd->"+count);
		}
		System.out.println("ID->"+(id-1)+" qtd->"+count);	
	return count;
	}	
	
	
	
	//Devolve  caminho de uma folha até a raiz do grafo
	public List<Integer> WayToRoot(int idNo) {
    
		for (Entry<Integer, List<Integer>> entry : PrincipalNew.hashMap.entrySet()) {
            Integer root = entry.getKey();
            List<Integer> leaves = entry.getValue();

            for (int i=0; i<leaves.size(); i++) {

            	if (leaves.get(i) == idNo) {//Existe uma raiz da subarvore
            		waysNovo.add(root);	
            		WayToRoot(root);	
            	}
            }
          
        }
		return waysNovo;
	}
	
		
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FormulaPrefixa objFPre = new FormulaPrefixa();
		PrincipalNew objPrincipal = new PrincipalNew();
		
		
		////// CQs TESE //////////
		
		
		//CQ1
		//String formulaInfixa = "(∀tipoFunc.APOSENT ⊓ ∀tipoDoenca.INCAPAC) ≫ ~(ƎtemDesconto.IRPF)"; 
		


		//CQ2		
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR ⊓ ∀temCargo.COMISSIONADO) ≫ ~(ƎtemPrev.RPPS)"; //∀temCargo.COMISSIONADO é de um cargo em específico
		
	
		//CQ3
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR ⊓ (~ ∀temVinculo.EST)) ≫ (ƎtemPrev.RGPS)";

	
		
		//CQ4
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR ⊓ (~ ∀temVinculo.EST)) ≫ (ƎtemVinculo.CEL ⊓ (ƎtemPrev.RGPS))";	
		

		//CQ5
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR ⊓ (~ ∀temVinculo.CEL)) ≫ (ƎtemVinculo.EST ⊓ (ƎtemPrev.RPPS))";
				
		
		//CQ6 (MUDAR RDF E TESTAR)OK
		//String formulaInfixa = "(∀temClasse.TECNICOA ⊓ ∀temParecer.ACUMULAR) ≫ (∀temClasse.TECNICOA ⊓ ~ ∀temClasse.TECNICOB)";
		
		//CQ7 
		//String formulaInfixa = "(∀temClasse.TECNICOA ⊓ ∀temClasse.TECNICOB) ≫ (~ ∀temParecer.ACUMULAR)";
		
		//CQ8 regra de conformidade 
		//String formulaInfixa = "(∀temClasse.MAGISTERIOA ⊓ ∀temClasse.TECNICOA) ≫ (ƎtemParecer.ACUMULAR)";

		
		//CQ9  
		//String formulaInfixa = "(∀frmIngresso.CONCURSADO ⊓ ∀temTempo.MENOR2ANOS) ≫ (~ ƎtemSituacao.EFETIVO)";
		
		
		
		//CQ10		
		//String formulaInfixa = "((~ ∀temExper.DEZANOS) ⊓ (~ ∀trabalhouComo.PESQUISADOR)) ≫ (~ ƎstaAtividade.ATIVO)";
		
		//CQ11		
		//String formulaInfixa = "(∀trabalhouOnde.EMPPUBLICA ⊓ ∀tempDecorrido.MENOS3ANOS) ≫ (~ ƎstaAtividade.ATIVO)";

		
		//CQ12		
		//String formulaInfixa = "(∀trabalhouOnde.EMPPUBLICA ⊓ ∀staAtividade.ATIVO ≫ (~ ƎtempDecorrido.MENOS3ANOS)";
		
		
		
		
		//CQ13		
		//String formulaInfixa = "(~ ∀possuiUma.DATAHORA ⊔ ~ ∀temIp.IPESTACAO) ≫ ~ ƎtipoProcesso.VALIDO";//OK
		
		//String formulaInfixa = "(∀possuiUma.DATAHORA ⊔ ∀temIp.IPESTACAO) ≫ ∀tipoProcesso.VALIDO";//VER COM HERMANN
		//String formulaInfixa = "(∀possuiUma.DATAHORA ⊔ ∀temIp.IPESTACAO) ⊓ ∀temDocumento.PETICAO ≫ ƎtipoProcesso.VALIDO";
		//String formulaInfixa = "∀posUa.DATAHORA ⊔ ∀temIp.IPESTACAO";
		
		
		//CQ14
		//String formulaInfixa = "∀emLotacao.SEMPMA ⊓ ∀temGrupo.GI ≫ (~ ƎtemScore.SCORE100 ⊓ ~ ƎtemScore.SCORE60)"; //ok
		
		//CQ15
		//String formulaInfixa = "((∀emLotacao.SEMPMA) ⊓ (~∀temGrupo.GI)) ≫ ((ƎtemScore.SCORE60) ⊓ (ƎtemScore.SCORE100))";//OK

		//CQ16
		//String formulaInfixa = "((∀emLotacao.SEMGE) ⊓ (∀emEscala.ESCALAA)) ≫ ((ƎtemScore.SCORE25))";//OK

		
		//CQ17
		//String formulaInfixa = "((∀tipoEmpresa.ASSDESP ⊓ ~ ∀temRegistro.LEGAL) ≫ ~ ƎtemBeneficio.ISENCAO)"; //OK
		//String formulaInfixa = "((∀tipoEmpresa.ASSDESP ⊓ ƎtemRegistro.LEGAL) ≫ ~ ƎtemBeneficio.ISENCAO)"; //ERRADO POIS NAO É A REGRA DA LEI
		
		//CQ18 uma outra abordagem para a CQ17
		//String formulaInfixa = "((∀tipoEmpresa.ASSDESP ⊓ ∀temRegistro.LEGAL) ≫ ƎtemBeneficio.ISENCAO)"; //OK
			
		
		//CQ19 // usamos o conjunção pois é o mesmo tipo de papel (temFinalidade).
		//String formulaInfixa = "((∀tipoEmpresa.ASSSOCIAL) ⊓ (~ ∀temFinalidade.FILANTROPO ⊓ ~ ∀temFinalidade.BENEFICENTE)) ≫ ~ ƎtemBeneficio.ISENCAO"; 
	
		
		
		//CQ20
		//String formulaInfixa = "(∀tipoEmpresa.EMPPUBLICA ⊓ ~ ∀estaOrganograma.ADMDIRETA) ≫ ~ ƎtemBeneficio.ISENCAO"; 

		
		//CQ21
		//String formulaInfixa = "∀temCargo.CC ≫ (ƎtemCargo.CC ⊓ ~ ƎtemCargo.FG)";
		
		
		
		//Axiomas
		//String formulaInfixa = "(ƎeReal.(AA ⊔ BB)) ≫ (ƎeReal.AA ⊔ ƎeReal.BB)"; //Axioma Dist (testando)
		//String formulaInfixa = "(∀eReal.(AA ≫ BB)) ≫ (ƎeReal.AA ≫ ƎeReal.BB)"; //Axioma Dist (testando)
		//String formulaInfixa = "(ƎeReal.(AA ⊔ BB)) ≫ (ƎeReal.AA ⊔ ƎeReal.BB)"; //Axioma Dist (testando)
		//String formulaInfixa = "(ƎeReal.AA ≫ ƎeReal.BB) ≫ (∀eReal.(AA ≫ BB))"; //Axioma Dist (testando)

		
		
		
		
		
		
		
		/////NAO INSERIDOS NO EXPERIMENTO ////////////
		//String formulaInfixa = "((∀tipoEmpresa.AssSocial) ⊓ (~ ƎtemFinalidade.FILANTROPO ⊔ ~ ƎtemFinalidade.BENEFICENTE)) ≫ ~ ƎtemBeneficio.ISENCAO"; // ok
		
		
		//String formulaInfixa = "∀tipoFunc.SERVIDOR ≫ (∀temCargo.PROFMAGSA ⊓ ∀temCargo.PROFMAGSB ⊓ ƎtemParecer.ACUMULAR)";
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR) ≫ ((∀temCargo.PROFMAGSA) ⊓ (∀temCargo.PROFMAGSB) ≫ (ƎtemParecer.ACUMULAR))";
		

		//\noindent$\vdash_{iALC}(w:(\forall tipoFunc.SERV ~\sqcap~(\exists temCargo.PROFMAGSA~\sqcap~\exists )~\intthen~\forall )$\\
		
		
		
		//CQ7 OBS: (CQ7 E CQ8 TEM OS MESMOS CONTRA-EXEMPLOS)
		//String formulaInfixa = "∀temCargo.CC ≫ (ƎtemCargo.CC ⊓ ~ ƎtemCargo.FG ⊓ ~ ƎtemCargo.BOL)"; 
		
		//CQ8
		//String formulaInfixa = "∀temCargo.CC ≫ ((ƎtemCargo.CC ⊓ ~ ƎtemCargo.FG) ⊓ (ƎtemCargo.CC ⊓ ~ ƎtemCargo.BOL))"; 
		
		
		
		//CQ9
		//String formulaInfixa = "∀temCargo.CC ≫ (ƎtemCargo.CC ⊓ ~ ƎtemCargo.(FG ⊓ BOL))"; //PROBLEMA NO GRAMATICA MODAL (NEGACAO)
				
		
		 
		//CQ2-old		
		//String formulaInfixa = "(∀tipoFunc.SERVIDOR ⊓ ∀temVinculo.CEL) ≫ ~(∀temPrev.RPPS)";
		
		
		
		

		//String formulaInfixa = " ( XR.(A & B) > XR.(A) ) ";	
		//String formulaInfixa = " ( ~ A ≫ ~ B ) > ( ~ C ⊓ ~ D ) ";	
		//String formulaInfixa = " ( ~ A ≫ ~ B ) & ( ~ C ≫ ~ D ) "; 
		//String formulaInfixa = " ( ~ A ⊓ ~ B ) ≫ ( ~ C ⊓ ~ D ) ";
		//String formulaInfixa = "A ≫ ( B ≫ ( A ⊓ B ) )";//Tableaux fechado okok
		//String formulaInfixa = "A ≫ B ≫ ( A ⊓ B )";//okok (exemplo interessante).
		//String formulaInfixa = " ( ~ A ≫ B ) ≫ ( A ⊓ D ) ";//testando VER COM HERMANN o contra-exemplo deste caso
		//String formulaInfixa = " ( ~ A ⊔ ~ B ) ";
		//String formulaInfixa = " ( A ≫ ( A & ~ B) )";
		//String formulaInfixa = " ( A \u226B ( A ⊔ A ) )"; //indice do conectivo = 3
		//String formulaInfixa = " ( A ⊓ B ⊓ C )"; //indice do conectivo = 3 ok 
		//String formulaInfixa = "A ⊓ ( B ⊔ C )"; //indice do conectivo = 3 PROBLEMA (okok)
		//String formulaInfixa = "( B ⊔ C ) ⊓ A"; //okok
		
		//String formulaInfixa = "( A ⊔ B ) ⊓ C"; //okok
		//String formulaInfixa = " A ⊓ (B ⊓ C)"; //okok
		//String formulaInfixa = " A ⊓ (~B ⊓ C)"; //okok
		
		//String formulaInfixa = " ( ( A ⊔ B ) ⊓ C )"; //ok
		//String formulaInfixa = " ( ( A ⊓ B ) ⊔ C )"; //ok
		//String formulaInfixa = " ( ( A ⊔ B ) ⊓ C )"; //ok
		//String formulaInfixa = "( A ⊓ B ) ≫ C"; //okok
		//String formulaInfixa = "( A ⊓ B ) ≫ ~ C"; //okok
		
		//String formulaInfixa = "(∀R.Servidor ⊔ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)"; //Modelar com a intenção negativa (nao quer x)
		//String formulaInfixa = "(∀R.Servidor ⊓ (ƎR.ProfessorA ⊓ ƎR.ProfessorB)) ≫ (∀R.PodeAcumular)"; //okok
		//String formulaInfixa = "(ƎR.ProfessorA ⊓ ƎR.ProfessorB) ≫ ∀R.PodeAcumular";//okok
		//String formulaInfixa = "ƎR.ProfessorA ⊓ ƎR.ProfessorB"; okok
		//String formulaInfixa = "∀R.ProfessorA ⊓ ∀R.ProfessorB"; // okok
		//String formulaInfixa = "∀R.PrA ≫ (∀R.PrB ≫ (∀R.PrA ⊓ ∀R.PrB))"; //ok -> Aplicar este ordem de parenteses
		
			
		//String formulaInfixa = "∀R.PrA ≫ ∀R.PrB ≫ (∀R.PrA ⊓ ∀R.PrB)"; // okok 
		//String formulaInfixa = "ƎR.ProfessorA ≫ (ƎR.ProfessorB ≫ (ƎR.ProfessorA ⊓ ƎR.ProfessorB))"; // okok
		//String formulaInfixa = "ƎR.ProfessorA ≫ ƎR.ProfessorB";//okok
		//String formulaInfixa = "ƎR.ProfessorA ≫ ƎR.ProfessorB ≫ ƎR.ProfessorC";//okok
		
		
		
		//String formulaInfixa = " ( A > ( A ⊓ A ) )"; //indice do conectivo = 3 (qual modelo escolher? ver com Hermann)
		//String formulaInfixa = "( A ≫ B ) ≫ C";
		
		//String formulaInfixa = "( A ⊓ B ) ⊓ C"; //ok (estava com problema na renderização (resolvido com a nova versão do calcula X e Y)
		//String formulaInfixa = "∀R.Servidor ⊓ ∀R.Estatutario ≫ ((∀R.Servidor ⊓ ∀R.RPPS) ⊔ (∀R.Servidor ⊓ ~∀R.RGPS))"; //problema render
		
		
		
		//String formulaInfixa = "(~ A ⊔ ~ B) ≫ ~(A ⊓ B)"; //Lemma intuicionista (Dirk van Dalan pag.162 (problema)
		
		
		
	    //String formulaInfixa = "∀R.A ≫ B"; //ok
		//String formulaInfixa = "∀R.(A ≫ B) ≫ ∀R.(A ⊓ B)"; //problema
		
		
		/// Exemplos na tese:
		//String formulaInfixa = "∀R.CC ≫ (ƎR.CC ⊓ ~ ƎR.FG)"; //OKOK
		
	
		/// Teste contra-modelo
		//String formulaInfixa = "∀hasRole.CC ≫ (ƎhasRole.CC ⊓ ~ ƎhasRole.FG)"; //OKOK
		//String formulaInfixa = "∀R.AA ⊓ ∀R.BB ≫ ~ ƎR.C"; //OKOK
		//String formulaInfixa = "∀R.AA ⊓ ∀R.BB ≫( ∀R.AA ⊓ ∀R.BB) ⊓ ~ ƎR.C"; //OKOK
		//String formulaInfixa = "∀R.AA ⊓ ƎR.BB ≫( ∀R.AA ⊓ ƎR.BB) ⊓ ~ ƎR.C"; //OKOK
		
		
		
		
		
		
		
		

		//QC1
		//String formulaInfixa = "(ƎR.RemMenorPiso ⊔ ƎR.DoencaInc) ≫ ~ƎR.DedIRPF"; //okok 

		
		//QC2
		//String formulaInfixa = "(ChasVinculo.SERVIDOR ⊓ ∀hasVinculo.ESTATUTARIO) ≫ ~ƎhasRegime.RGPS"; //OKOK
		//String formulaInfixa = "(∀hasVinculo.SERVIDOR ⊓ ∀hasVinculo.CELETISTA) ≫ ~∀hasRegime.RPPS"; //OKOK
		
		//String formulaInfixa = "(∀hasVinculo.SERVIDOR ⊓ ~ ∀hasVinculo.ESTATUTARIO) ≫ ∀hasVinculo.(RPPS)"; //OKOK
		//String formulaInfixa = "(∀hasFunc.SERVIDOR ⊓ ~∀hasFunc.ESTATUTARIO ≫ ∀hasFunc.RPPS)";
		
		//String formulaInfixa = "(∀R.Servidor ⊓ ~∀R.Estatutario) ≫ ∀R.RGPS"; //okok
		
		
		
		//QC8
		//String formulaInfixa = "(∀R.EmployeeProduces ⊓ ∀R.EmployeeSEMPMA ⊓ ∀R.ServidorGroupI) ≫ (∀R.EmployeeProduces ⊓ ∀R.EmployeeSEMPMA ⊓ ∀R.ServidorGroupI)  ⊓ (~ƎR.Score60)"; 
		
		
		//String formulaInfixa = "∀hasGroup.SGROUPI ≫ (ƎhasGroup.SGROUPI ⊓ (~ ƎhasScore.SCORE60 ⊓ ~ ƎhasScore.SCORE30)))"; //ok
		//String formulaInfixa = "∀hasGroup.SGROUPI ≫ (ƎhasGroup.SGROUPI ⊓ (ƎhasScore.(~ SCORES ⊓ ~ SCORET)))"; //ok (exemplo para mostrar ao hermann (sparql com OU)
		//String formulaInfixa = "(ƎhasScore.(SCORES ⊓ SCORET))";//ok
		
		//String formulaInfixa = "(AA ⊓ BB)";//ok
		//String formulaInfixa = "∀R.ServidorGroupII ≫ (~ ƎR.Score100 ⊔ ~ ƎR.Score30))"; //ok (apenas contra-exemplos)
		//String formulaInfixa = "∀R.ServidorGroupII ≫ (ƎR.ServidorGroupII ⊓ (~ ƎR.Score100 ⊔ ~ ƎR.Score30))"; //ok
		//String formulaInfixa = "∀R.ServidorGroupIII ≫ (ƎR.ServidorGroupIII ⊓ (~ ƎR.Score100 ⊔ ~ ƎR.Score60))"; //ok		
		//String formulaInfixa = "∀R.ServidorGroupIII ≫ (~ ƎR.Score100 ⊔ ~ ƎR.Score60)"; //ok	
		
		
		//String formulaInfixa = "(∀R.EmployeeProduces ⊓ ∀R.EmployeeSEMPMA  ⊓ ∀R.ServidorGroupI) ≫ (ƎR.EmployeeProduces ⊓ ƎR.EmployeeSEMPMA  ⊓ ƎR.ServidorGroupI ⊓ ~ƎR.Score200)"; //Errando o fechamento (nó não é folha).
		
		// teste
		//String formulaInfixa = "((∀R.A ⊓ ƎR.B) ≫ ƎR.C ⊔ ƎR.A)"; // ok
		
		
		//CQ10
		//String formulaInfixa = "((∀R.AssDesp ⊓ ~ ƎR.Legal) ≫ ~ ƎR.Isencao)"; // ok
		
		//QC11
		//String formulaInfixa = "((∀R.AssSocial) ⊓ (~ ƎR.Filantro ⊔ ~ ƎR.Beneficente)) ≫ ~ ƎR.Isencao"; // ok
	
		

//  Entidades de assistência social, filantrópicas ou beneficentes, desde que legalmente constituídas e reconhecidas de utilidade pública pelas leis municipais:
		//String formulaInfixa = "(∀R.EmpPublica ⊓ ƎR.AdmDireta) ≫ (∀R.EmpPublica ⊓ ƎR.AdmDireta ⊓ ~ ƎR.Isencao)"; //ok USAR ESTE FORMATO
		//String formulaInfixa = "(∀R.EmpPublica) ≫ ƎR.AdmDireta ⊓ ~ ƎR.Isencao"; 
		
		//(∀R.EmpPublica) ⊓ (¬(∃R.AdmDireta)) (¬(∃R.Isencao))
		
		//String formulaInfixa = "∀R.A ≫ B"; // nao ok
		//String formulaInfixa = "∀R.(As ≫ Bs)"; // ok Formula Modal
		//String formulaInfixa = "As ≫ Bs"; //ok
		//String formulaInfixa = "∀R.(AA0 ⊔ AA0)";//ok
		//String formulaInfixa = "∀R.(AA0 ≫ AA0)";//ok
		//String formulaInfixa = "∀R.(AA0 ≫ AA0) ⊔ (∀R.CC)";
		
		//String formulaInfixa = "(∀R.(Aa ≫ Bb)) ≫ (∀R.Aa ≫ ∀R.Bb)"; //Axioma ∀K (nao está fechando o no)
		//String formulaInfixa = "(∀R.(Aa ≫ Bb)) ≫ (ƎR.Aa ≫ ƎR.Bb)"; //Axioma Ǝk
		//String formulaInfixa = "(ƎR.(Aa ⊔ Bb)) ≫ (ƎR.Aa ⊔ ƎR.Bb)"; //Axioma Dist (testando)
		//String formulaInfixa = "ƎR.Aa ≫ ƎR.Bb ≫ ∀R.(Aa ≫ Bb)"; //Axioma Distm
		
		
		//String formulaInfixa ="∀R.(Aa ≫ Bb)"; //ok
		//String formulaInfixa ="(∀R.(Aa ≫ Bb))"; //ok
		
		
		//String formulaInfixa = "(AA0 ⊔ AA0)"; //ok
		//String formulaInfixa = "AA0 ⊔ AA0"; //ok
		//String formulaInfixa = "∀R.CC ≫ (ƎR.CC ⊓ ~ ƎR.FG)"; //OKOK--------------------------------------------------------------
		//String formulaInfixa = "(∀R.CC ⊓ (~ ∀R.FG)) ≫ (ƎR.CC ⊓ ~ ∀R.FG)"; //teste aleatório OK
		
		//String formulaInfixa = "( Ǝ R . C C ⊓ ~ Ǝ R . F G )"; //ok
		//String formulaInfixa = "(ƎR.CC ⊓ ~ƎR.FG)"; //ok 
		//String formulaInfixa = "∀R.(CC)";problema
		
		//String formulaInfixa = "(∀R.A ⊔ ~ ∀R.A)";
		
		
		
		
		//------------------------------ EXEMPLOS EM DL ----
		//Actor ⊔ Actress ⊑ ∃hasFilmed.(Movie ⊔ TelevisionSeries)
		
		
		
		
		
   	
		
		//Aqui implementar a chamada da função
		FormulaModal objIsModal = new FormulaModal();	
		
		
		//Remover parenteses mais externos
		formulaInfixa = formulaInfixa.replaceAll("^\\((.*)\\)$", "$1");
		
		
		PegarIndiceConectivo objIndiceNovo = new PegarIndiceConectivo();	

		////////////////////////formulaInfixa = RemocaoParentesesExtras.trataParenteses(formulaInfixa);
		
		
		//Remove espaços na formula
		formulaInfixa = formulaInfixa.replace(" ", "");
		
		boolean isModal = objIsModal.IsModal(formulaInfixa); 
		
		Integer indiceConectivoPrincipal=0;
		
		if (isModal==false){
		iALCGrammarIn ObjiALCGrammar = new iALCGrammarIn();
		indiceConectivoPrincipal = objIndiceNovo.pegarIndice(ObjiALCGrammar.IndiceSimboloPrincipal(formulaInfixa));//MEXI AQUI (12/12)
		}
		
		
		
		//Integer indiceConectivoPrincipal = Integer.parseInt(objFPre.obterPrefixa(formulaInfixa));
		PegaConectivoPorIndice objPCI_A = new PegaConectivoPorIndice();
		AlphaBeta objAlpBet_A = new AlphaBeta();
	
		Node objNode = new Node();
		objNode.setIndice(1);
		objNode.setFormula(formulaInfixa);
		objNode.setSignal('T');
		objNode.setpositionConectivoPrincipal(indiceConectivoPrincipal);//
		objNode.setTipoExpansao(' ');
		objNode.setTipodaformula("LP"); 
		objNode.setWorld("w");
		objNode.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld());
		objNode.setBranch("0");
		objNode.setChecked('S');
		objNode.setIndicePai(null);
		objNode.setIndiceFilho("2");
		objNode.setNivel(0);
		objNode.setAntecedente(0);
		mainList.add(objNode);
		
		Node objNode1 = new Node();		
		objNode1.setIndice(2);
		objNode1.setFormula(formulaInfixa);		
		objNode1.setSignal('F');
		objNode1.setpositionConectivoPrincipal(indiceConectivoPrincipal);
		if (indiceConectivoPrincipal!=0){
			String simbolo = String.valueOf(objPCI_A.SimbolRestore(indiceConectivoPrincipal,formulaInfixa));
			objNode1.setTipoExpansao(objAlpBet_A.define(simbolo.charAt(0),'F'));//MUDAR AQUI PARA DEIXAR AUTOMATICO
		}else {String simbolo="@";}		
		objNode1.setTipodaformula("LP");
		objNode1.setWorld("w");
		objNode1.setRelacao(objNode.getWorld()+"\u227C"+objNode.getWorld()); //u227C -> ≼
		objNode1.setBranch("0");
		objNode1.setChecked('N');
		objNode1.setIndicePai("1"); 
		objNode1.setIndiceFilho("3"); 
		objNode1.setNivel(1);
		objNode1.setAntecedente(1);
		mainList.add(objNode1);
			
		PrincipalNew.listaAdj.add(Arrays.asList(1, 2));
		
		PrincipalNew.listaAdj2.add(2);
		hashMap.put(1, Arrays.asList(2));//"1 é a chave e 2 é a lista de adjacencia (do tipo asList)
		
		/*
		 * if (objNode1.getTipoExpansao() == 'A') {
		 * 
		 * }else {
		 * 
		 * }
		 */	
		
		while (loop == true) {
			Node noLocal = objPrincipal.searchNotChecked(mainList);

			String formula = noLocal.getFormula();
			
			///////////////formula = RemocaoParentesesExtras.trataParenteses(formula);
			
			//Remove espaços na formula
			formula = formula.replace(" ", "");

			//Remover parenteses mais externos
			formula = formula.replaceAll("^\\((.*)\\)$", "$1");	
			noLocal.setFormula(formula);
			
			
			//Verifica se é Modal
			//boolean isModal2 = objIsModal.IsModal(noLocal.getFormula()); 

			

			///Veirifca a quantidade de conectivos da fórmula
		    CountSymbol objUtil = new CountSymbol();
		    int qtdConectivos = objUtil.count(noLocal.getFormula()); 
			
			if (qtdConectivos == 0 || qtdConectivos == 1) {			
				GFG objGFG = new GFG(); //Util que trata os parenteses extras (Novo)
				noLocal.setFormula(objGFG.testeParenteses(noLocal.getFormula()));
			}
			
			
			boolean isModal2 = objIsModal.IsModal(noLocal.getFormula()); 


		    //////////////////////////// Regra de qtdConectivos == 1  (excluir parenteses externos) ////////////////////
		    if (qtdConectivos==1) {
		    	//System.out.println("Esq->"+noLocal.getFormula().charAt(0)+" Dir->"+noLocal.getFormula().charAt(noLocal.getFormula().length()-1));
		    	
		    	if ((noLocal.getFormula().charAt(0) == '(') && (noLocal.getFormula().charAt(noLocal.getFormula().length()-1) == ')')){ 
		    		char[] newFormula = noLocal.getFormula().toCharArray();
		    		newFormula[0] = ' ';
		    		newFormula[noLocal.getFormula().length()-1] = ' ';
		    		noLocal.setFormula(String.valueOf(newFormula).trim());
		    	}		    	
		    }
		    //////////////////////////////// Fim de qtdConectivos == 1 ////////////////////////////////

			
			if (qtdConectivos > 0) {
			  	if ((noLocal.getFormula().charAt(0) == '(') && (noLocal.getFormula().charAt(noLocal.getFormula().length()-1) == ')')){ 
		    		char[] newFormula = noLocal.getFormula().toCharArray();
		    		newFormula[0] = ' ';
		    		newFormula[noLocal.getFormula().length()-1] = ' ';
		    		noLocal.setFormula(String.valueOf(newFormula).trim());
		    	}		    	
		  	
			  	
			//Verifica se é Modal
			//boolean isModal2 = objIsModal.IsModal(noLocal.getFormula()); 	
			
			if (isModal2==false) {//////////2
				//Remove espaços na formula
				formula = formula.replace(" ", "");
				iALCGrammarIn ObjiALCGrammar2 = new iALCGrammarIn();
				//Integer indiceConectivoPrincipal2 = objIndiceNovo.pegarIndice(ObjiALCGrammar2.IndiceSimboloPrincipal(noLocal.getFormula()));//MEXI AQUI (31/01)
				Integer indiceConectivoPrincipal2 = objIndiceNovo.pegarIndice(ObjiALCGrammar2.IndiceSimboloPrincipal(formula));//MEXI AQUI (31/01)
				
				
				PegaConectivoPorIndice objPCI = new PegaConectivoPorIndice();		
				String simboloPrincipal = objPCI.SimbolRestoreNew(indiceConectivoPrincipal2,noLocal.getFormula());
				char sygnal = noLocal.getSignal();

				AlphaBeta objAlpBet = new AlphaBeta();
			    char AlphaBeta = objAlpBet.define(simboloPrincipal.charAt(0),sygnal);///MEXI AQUI TESTAR------

			    noLocal.setTipoExpansao(AlphaBeta);
			    noLocal.setpositionConectivoPrincipal(indiceConectivoPrincipal2);
			    noLocal.setConectivoPrincipal(simboloPrincipal.charAt(0));
			    noLocal.setFormula(noLocal.getFormula().trim());///////Aqui///////////
			}
			
			if (isModal2==true){
			    noLocal.setTipoExpansao('A');
			    noLocal.setpositionConectivoPrincipal(0);
			    noLocal.setConectivoPrincipal('@');
			    //noLocal.setFormula(noLocal.getFormula().trim());
			    noLocal.setFormula(formula.trim());
			
			}
			  	
				

			}
			
		   ///////////////////////////// Regra Modal ///////
			
			if (isModal2==true) {				
    			noLocal.setChecked('S'); 
    			if (noLocal.getFormula().charAt(0)==('\u018E')) {//Existencial	    				
	    			noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
					
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_modal_existencial(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}
	    		}
    			if (noLocal.getFormula().charAt(0)==('\u2200')) {//universal
    				noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);

					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_modal_universal(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}

	    		}	
		    			    	
	    	System.out.println(hashMap.toString());
				
			}
			///////////fim modal
			/*
			 * if ( ((qtdConectivos==1) && (noLocal.getFormula().charAt(0) == 'Ǝ') &&
			 * (noLocal.getFormula().charAt(3) == '(') ) && ((qtdConectivos==0) &&
			 * (noLocal.getFormula().charAt(0) == '∀') && (noLocal.getFormula().charAt(3) ==
			 * '(')) ) {
			 * 
			 * }
			 */		
			////////////////////////////////
		    
		    //////////////////////////// Regra de qtdConectivos == 0 Atomicas ////////////////////
		    System.out.println("Formula->"+noLocal.getFormula()+"   Primeiro->"+noLocal.getFormula().charAt(0));
			if (   ((qtdConectivos==0) && (isModal2==false) && (noLocal.getFormula().charAt(0) != 'Ǝ'))
					
			 &&	
				   ((qtdConectivos==0) && (isModal2==false) && (noLocal.getFormula().charAt(0) != '∀'))
			  )  { 
    			
				if (noLocal.getFormula().charAt(0)!=('~')) { 
					System.out.println("#################################Entrou na regra de MUNDOS#################################");
					String filename = "file.txt";
					PrincipalNew wayatual = new PrincipalNew();

	                wayatual.WayToRoot(noLocal.getIndice());
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
			            writer.write("ID-> "+noLocal.getIndice()+" Sinal-> "+noLocal.getSignal()+"  Formula-> "+noLocal.getFormula()+" Mundo-> "+noLocal.getWorld()+" Checked-> "+noLocal.getChecked()+" Lista Adj-> "+"Caminhos->"+waysNovo.toString());
			            writer.newLine();
			            Modelos objModelo = new Modelos();
			            
			            
			            objModelo.gerarModelo(waysNovo, noLocal, mainList);
			            waysNovo.clear();
			            
			            System.out.println();
			          
			            
			            
			            System.out.println("Texto gravado com sucesso no arquivo: " + filename);
			        } catch (IOException e) {
			            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
			        }
				}
				
			
				noLocal.setChecked('S'); 
		    	//Regra Atomica - FORMULAS NÃO-REDUTÍVEIS
	    		//if (simboloPrincipal.charAt(0)==('~')) {
    			if (noLocal.getFormula().charAt(0)==('~')) {
	    			noLocal.setTipoExpansao('A');///Mudei aqui (Alpha a expansao da negacao?)
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
					//ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_neg(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}
	    		}else{ //Fim da negação	
	    			noLocal.setTipoExpansao('U');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
	    			
	    		}	
		    			    	
	    	System.out.println(hashMap.toString());
		    }
		    ////////////////////////Fim QtdConectivos == 0 ////////////////////////////////////
		    

		    //////////////////////////// Regra de qtdConectivos == 0 (Quantificadores) ////////////////////
		    System.out.println("Formula->"+noLocal.getFormula()+"   Primeiro->"+noLocal.getFormula().charAt(0));
		    if ((qtdConectivos==0) && (isModal2==false) && ((noLocal.getFormula().charAt(0) == '\u018E') || (noLocal.getFormula().charAt(0) == '\u2200')))  { 
    			noLocal.setChecked('S'); 
    			if (noLocal.getFormula().charAt(0)==('\u018E')) {//Existencial	    				
	    			noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);
					//ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						
						objRules.iALC_existencial(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao

						//objRules.iALC_existencial(noLocal, mainList, 'Z', hashMap, noLocal.getIndice()); //Esse Z é a direcao

						//Map<Integer, int idFolha) {

					}
	    		}
    			if (noLocal.getFormula().charAt(0)==('\u2200')) {//universal
    				noLocal.setTipoExpansao('A');
	    			Rules objRules = new Rules();
					System.out.println("NO ATUAL->"+noLocal.getIndice());
					System.out.println("Lista de Adj->"+listaAdj);

					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
						
						//objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, noLocal.getIndice()); //Esse Z é a direcao
						
						//objRules.iALC_universal(noLocal, mainList, 'Z', hashMap, leaves.get(j)); //Esse Z é a direcao
					}

	    		}	
		    			    	
	    	System.out.println(hashMap.toString());
		    }
		    ////////////////////////Fim QtdConectivos == 0 ////////////////////////////////////
		    
		    
		    
		    
		    Rules objRules = new Rules();

		    ////////////////////////// INICIO DE APLICAÇÃO DAS REGRAS - FORMULAS REDUTÍVEIS //////////////

		    //Regra Alfa (prioridade 1 dos alphas)
			if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('⊓') && (qtdConectivos>0) && (isModal2==false))) { //T &
			    noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				//ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
				//celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal, listaAdj); //Está em uso?
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////				
				
				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_and(noLocal, mainList, 'F', 1, hashMap, leaves.get(j)); //Esse Z é a direcao
					objRules.iIALC_and(noLocal, mainList, 'S', 1, hashMap, leaves.get(j)); //Esse Z é a direcao

				}

			}
			//Regra Alfa (prioridade 2 dos alphas)
			else if  ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('≫') && (qtdConectivos>0) && (isModal2==false))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				//Integer indiceAtualLista = listaAdj.size()-1;
				//List<Integer> celulaAtualLista = listaAdj.get(indiceAtualLista); ////adicionado na segunda (estava comentado)
				//System.out.println(celulaAtualLista.get(0));
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////	
				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_imp(noLocal, mainList, 'F', 1, hashMap, leaves.get(j));  
					objRules.iIALC_imp(noLocal, mainList, 'S', 1, hashMap,  leaves.get(j));  
				}
			}
		
			else if  ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('⊔') && (qtdConectivos>0) && (isModal2==false))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na  //adicionado domingo
				System.out.println("NO ATUAL->"+noLocal.getIndice()); ////adicionado domingo
				System.out.println("Lista de Adj->"+listaAdj); ////adicionado domingo
				//Integer indiceAtualLista = listaAdj.size()-1;
				//List<Integer> celulaAtualLista = listaAdj.get(indiceAtualLista); ////adicionado na segunda (estava comentado)
				//System.out.println(celulaAtualLista.get(0));
				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
				///////////////////////////	

				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_or(noLocal, mainList, 'F', 1, hashMap, leaves.get(j));  
					objRules.iIALC_or(noLocal, mainList, 'S', 1, hashMap, leaves.get(j));
				}
			}

			
			
			
			
			
			
			////////////////////////Regra Beta
			else if ((noLocal.getSignal()==('F')) && (noLocal.getConectivoPrincipal()==('⊓') && (qtdConectivos>0) && (isModal2==false))) {//F ⊓
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na 
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);
				if (noLocal.getIndice()==2) {
					objRules.iIALC_and(noLocal, mainList, 'L',1, hashMap, noLocal.getIndice()); 
					objRules.iIALC_and(noLocal, mainList, 'R',1, hashMap, noLocal.getIndice());
				}else {

					ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal.getIndice(), listaAdj);
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////	

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iIALC_and(noLocal, mainList, 'L',1, hashMap, leaves.get(j));
						objRules.iIALC_and(noLocal, mainList, 'R',1, hashMap, leaves.get(j));
					}

					
					

				}
			}
			else if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('≫') && (qtdConectivos>0) && (isModal2==false))) {
				noLocal.setChecked('S');
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);

				/////////DFS Folhas //////
				PegaFolha2 objPegaFolha = new PegaFolha2();
				List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice()-1);
				///////////////////////////	
				for (int j = 0; j < leaves.size(); j++) {
					objRules.iIALC_imp(noLocal, mainList, 'L', 1, hashMap, leaves.get(j));
					objRules.iIALC_imp(noLocal, mainList, 'R', 1, hashMap, leaves.get(j));
				}
			}
				
	            // MODIFICACOES EM 29/11/2023 - APLICACAO DA DISJUNCAO////
			
			else if ((noLocal.getSignal()==('T')) && (noLocal.getConectivoPrincipal()==('⊔') && (qtdConectivos>0) && (isModal2==false))) {
				noLocal.setChecked('S');
				//Tem que retornar o ID das folhas para poder passar nos parametros (usado na 
				System.out.println("NO ATUAL->"+noLocal.getIndice());
				System.out.println("Lista de Adj->"+listaAdj);
				if (noLocal.getIndice()==2) {
					objRules.iIALC_or(noLocal, mainList, 'L',1, hashMap, noLocal.getIndice()); 
					objRules.iIALC_or(noLocal, mainList, 'R',1, hashMap, noLocal.getIndice());
				}else {

					ListaSeusAdjacentes objListaSeusAdjacentes = new ListaSeusAdjacentes();
					celula = objListaSeusAdjacentes.listarSeusAdjacentes(noLocal.getIndice(), listaAdj);
					/////////DFS Folhas //////
					PegaFolha2 objPegaFolha = new PegaFolha2();
					List<Integer> leaves = objPegaFolha.findLeaves(hashMap, noLocal.getIndice());
					///////////////////////////	

					for (int j = 0; j < leaves.size(); j++) {
						objRules.iIALC_or(noLocal, mainList, 'L',1, hashMap, leaves.get(j));
						objRules.iIALC_or(noLocal, mainList, 'R',1, hashMap, leaves.get(j));
					}
				}
			}

			
			//// fIM DA APLICACAO DA REGRA DA DISJUNCAO

			loop = true; 
			if (objPrincipal.searchNotChecked(mainList) != null)   {
				//tem que existir para o ultimo NULL lop = false?
			}else {
				System.out.println("Terminou");
				System.out.println(mainList.toString());

		        // Itere sobre os valores do HashMap
		        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
		            Integer chave = entry.getKey();
		            List<Integer> lista = entry.getValue();
		            System.out.println("Chave: " + chave + ", Valores: " + lista);
		            //prepara lista de irmãos
		            if (lista.size()>1) {
		            	hashSiblings.put(lista.get(0), lista.get(1));	
		            }
		           
		        }
		        // Itera sobre os hashmap dos irmaos
		        for (Map.Entry<Integer, Integer> entry : hashSiblings.entrySet()) {
		            Integer chave = entry.getKey();
		            Integer valor = entry.getValue();
		            System.out.println("Irmao de: " + chave + ", é: " + valor);
		        }
				
				
				TableauxTree objTree = new TableauxTree();
				//objTree.renderTree();
				objTree.renderTreeNew();
				//objTree.renderTreeNew2();
				
		        
			}
		    
		}//Fim do while loop == true
	
	
	}//fim método main
	
	
	
	
	
	
	
	
	
}

