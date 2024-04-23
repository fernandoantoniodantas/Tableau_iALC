/*
* iALC written for Antlr4 by Fernando;Hermann
* Detect if formula is Modal
*/


grammar iALCGrammarModal;

@header {
   package iALC.grammar_modal;
} 

s : formula EOF;

//s : formula ;

//condition
//   :formula (ENDLINE formula)* ENDLINE* EOF
//   ;

formula
   //: modal RELATION'.'(LPAREN* bin=bin_connective RPAREN*) ENDLINE* EOF  #modalFormula
   : modal Role'.'LPAREN NOT* Concept bin_connective NOT* Concept RPAREN 
   ;

BOL 
   : [\r\n\f]+ 
   ;

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

Role : [a-z]+[A-Z]?[a-z]+; //Começa com n letras minuscula seguida de 1 letra maiscula e m letras minusculas

Concept : [A-Z]+;

CHARACTER
   //:('0' .. '9' | 'a' .. 'z' | 'A' .. 'Z')
   :[0-9a-zA-Z]+
   ;

RELATION
   :('0' .. '9' | 'a' .. 'z' | 'A' .. 'Z')
   ;

ENDLINE
   :('\r'|'\n')+
   ;
WHITESPACE
   :(' '|'\t')+->skip
   //: (' ' |'\n'|'\t'|'\r')+
   ;
