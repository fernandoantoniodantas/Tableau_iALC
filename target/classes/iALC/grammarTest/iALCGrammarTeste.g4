/*
* iALC written for Antlr4 by Fernando;Hermann
*
*/


grammar iALCGrammarTeste;

@header {
   package iALC.grammarTest;
} 

//s : formula EOF;

s : condition EOF;
condition
   :formula (ENDLINE formula)* ENDLINE* EOF
   ;

//formula
   //: lp=lparen* atom=atomic rp=rparen* #atomFormula   
//   : lp=lparen* left=formula op=bin_connective right=formula rp=rparen* #opFormula                         
//   | (modal) role'.'lparen* concept rparen* #modalFormula //EOF; //'('?CONCEPT')'?;
//   | NOT lparen* formula rparen* #notFormula //Remover esses parenteses caso problema 
//   ;

formula : lp=lparen* formula_1;

formula_1
   : left=formula op=bin_connective right=formula rp=rparen* #opFormula
   | modalFormula #md
   | notFormula  #mn
   ;

modalFormula
   : (modal) role'.'lparen* concept rparen* #modalFormulas
   ;

notFormula
   : NOT lparen* formula rparen* #notFormulas
   ;

role : STRING+;

concept : STRING+;

atomic : STRING+;

lparen : LPAREN;
rparen : RPAREN;

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
   :[0-9a-zA-Z]+
   ;

ENDLINE
   :('\r'|'\n')+
   ;
WHITESPACE
   :(' '|'\t')+->skip
   //: (' ' |'\n'|'\t'|'\r')+
   ;
