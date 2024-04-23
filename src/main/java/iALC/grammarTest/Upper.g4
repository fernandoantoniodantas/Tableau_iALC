grammar Upper;

@header {
   package iALC.grammarTest;
} 

s : condition EOF;
condition
   :formula (ENDLINE formula)* ENDLINE* EOF
   ;

// Regra para identificar nomes de strings começando com letra maiúscula
formula : Role'.'Concept;

// Definindo as regras para caracteres
//Role : 'A'[a-z]+;
//Concept : [A-Z]+;
Role : [a-z]+[A-Z]?[a-z]+; //Começa com n letras minuscula seguida de 1 letra maiscula e m letras minusculas
Concept : [A-Z]+;
ENDLINE
   :('\r'|'\n')+
   ;