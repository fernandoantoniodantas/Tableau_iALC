/*
* iALC written for Antlr4 by Fernando;Hermann
*
*/


grammar iALCGrammar;

@header {
   package iALC.grammar;
} 

//s : formula EOF;

s : condition EOF;
condition
   :formula (ENDLINE formula)* ENDLINE* EOF
   ;



formula
   : LPAREN* atom=CHARACTER RPAREN*                          #atomFormula
   | left=formula op=bin_connective right=formula #opFormula
   | LPAREN formula RPAREN #parenFormula
   | NOT formula #notFormula
   | FORALL Role'.'(LPAREN* Concept bin_connective* Concept* RPAREN*)  #forallFormula
   | EXISTS Role'.'(LPAREN* Concept bin_connective* Concept* RPAREN*)  #existFormula
   | modal #forallAtomico
   | NOT* Concept #ConceptAtomico
   ;

/**
formula
   :  LPAREN* atom=CHARACTER RPAREN*                          #atomFormula
   | left=formula op=bin_connective right=formula #opFormula
   | LPAREN formula RPAREN                         #parenFormula
   | NOT formula                                   #notFormula
   | FORALL Role'.'(LPAREN* Concept bin_connective* Concept* RPAREN*)  #forallFormula 
   | EXISTS Role'.'(LPAREN* Concept bin_connective* Concept* RPAREN*)  #existFormula
   | modal #forallAtomico
   | NOT* Concept #ConceptAtomico   
   ;

 */







   //| FORALL (LPAREN* asser RPAREN*) (formula)* #forallFormula
   //| EXISTS (LPAREN* asser RPAREN*) (formula)* #existFormula


//String expression = "?R.(A ? B)";

//(?emLotacao.SEMPMA ? ~?temGrupo.GI) ? (?temScore.SCORE60 ? ?temScore.SCORE100)
//Exemplo de modal
//formula
//       : atomicFormula #atomFormula
 //      | LPAREN formula RPAREN
 //      | NOT formula #notFormula
 //      | left=formula op=bin_connective right=formula #opFormula
 //      | FORALL formula #forallFormula
 //      | EXISTS formula #existFormula
 //      ;


//atomicFormula: ID; //exemplo modal

asser
   //: CHARACTER*'.'CHARACTER*
   : CHARACTER*'.'formula   
   ;


//ID //exemplo modal
//   : [a-zA-Z]+;

Role : [a-z]+[A-Z]?[a-z]+; //Começa com n letras minuscula seguida de 1 letra maiscula e m letras minusculas
Concept : [A-Z]+;

STRING :[a-zA-Z]+;

LPAREN
   :'('
   ;
RPAREN
   :')'
   ;

modal
  :FORALL
  |EXISTS
  ;


FORALL
   :'\u2200'
   ;
EXISTS
   : '\u018E'
   ;
bin_connective
   : CONJ
   | DISJ
   | IMPL
   ;

NOT
   :'~'
   ;

CONJ
   : '\u2293'
   ;

DISJ
   :'\u2294'
   ;
IMPL
   : '\u226B'
   ;

CHARACTER
   //:('0' .. '9' | 'a' .. 'z' | 'A' .. 'Z')
   :[0-9a-zA-Z]+
   ;

ENDLINE
   :('\r'|'\n')+
   ;
WHITESPACE
   :(' '|'\t')+->skip
   //: (' ' |'\n'|'\t'|'\r')+
   ;
