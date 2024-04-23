/*
* iALC written for Antlr4 by Fernando;Hermann
*
*/


grammar iALCGrammar;

@header {
   package iALC.grammar;
} 


s : condition ;

condition
   :formula (ENDLINE formula)* ENDLINE* EOF
   ;

formula
     : 
     left=formula op=bin_connective right=formula #opFormula
  	 | LPAREN formula RPAREN #parenFormula
  // | NOT formula op=bin_connective formula #opFormula
     | NOT formula #notFormula
   | FORALL (LPAREN* asser RPAREN*) (formula)* #forallFormula
   | EXISTS (LPAREN* asser RPAREN*) (formula)* #existFormula
   | atom=asser1                           #atomFormula
   ;

asser
   //: CHARACTER*'.'CHARACTER*
   : CHARACTER*'.'formula   
   ;

asser1
   //: CHARACTER*'.'CHARACTER*
   : (FORALL|EXISTS)(CHARACTER)*'.'LPAREN*(CHARACTER)* bin_connective (CHARACTER)*RPAREN* rest_of_line
   //?R.(A ? B)
   ;

rest_of_line
 : NL* // match any token other than a line break zero or more times
 ;

LPAREN
   :'('
   ;
RPAREN
   :')'
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
   :('0' .. '9' | 'a' .. 'z' | 'A' .. 'Z')
   ;

ENDLINE
   :('\r'|'\n')+
   ;
WHITESPACE
   :(' '|'\t')+->skip
   //: (' ' |'\n'|'\t'|'\r')+
   ;

NL      : '\r'? '\n' | '\r';