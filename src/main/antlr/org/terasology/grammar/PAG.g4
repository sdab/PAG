grammar PAG;

pag : header 'grammar' ID ':' section+
	;

header 
	: declaration*
	;

declaration 
	: '#'? ID ':=' expr ';'
	;

section
	: 'Priority' NUMBER ':' ruleStatement+
	;

ruleStatement
	: predecessor (':' expr)? '->' successor (':' expr)? ('->' successor (':' expr)?)* ';'
	;

predecessor
	: ID
	;

successor
	: ID
	| baseRule
	| '{' (ID | baseRule)* '}'
	;

baseRule
	: setRule
	| divideRule
	| splitRule
	| repeatRule
	| snapRule
	| instantiationRule
	| transformationRule
	;

setRule
	: 'Set' '(' expr (':' expr)* ')'
	;

divideRule
	: 'Divide' expr '{' ('[' expr 'r'? ']' successor)+ '}'
	;

splitRule
	: 'Split' '{' ('[' expr ']' successor)+ '}'
	;

repeatRule
	: 'Repeat' expr '[' expr ']' successor
	;

snapRule
	: 'Snap' '(' expr (',' expr)? ')'
	;

instantiationRule
	: 'I' '(' expr ')'
	;

transformationRule
	: scaleRule
	| translateRule
	| rotateRule
	;

scaleRule
	: 'S' '(' expr (',' expr ',' expr)? ')'
	;

translateRule
	: 'T' '(' expr ',' expr ',' expr ')'
	;

rotateRule
	: ('Rx' | 'Ry' | 'Rz') '(' expr ')'
	;

exprList
	: expr (',' expr)*
	;

rangeExpr
	: expr '..' expr
	;
	
expr: primary
	| functionCall
	| ('Shape' | 'Scope') '.' ('occ' | 'visible') '(' expr ')'
	| '[' exprList? ']'
	| ('+' | '-')	expr			
	| '!' expr					
	| expr ('*' | '/' | '%') expr
	| expr ('+' | '-') expr
	| expr ('>=' | '<=' |'>' | '<') expr
	| expr ('==' | '!=') expr
	| expr '&&' expr
	| expr '||' expr
	;

functionCall
	: randomSelection
	;

randomSelection
	: 'Random' '(' exprList ')'
	| 'Random' '(' rangeExpr ')'
	;

primary
	: '(' expr ')'
	| literal 'r'?
	| ID
	;

literal
	: NUMBER
	| STRING
	| BOOLEAN_LITERAL
	;

BOOLEAN_LITERAL
	: 'true'
	| 'false'
	;

NUMBER 
	: '-'? INT? '.' INT
	| '-'? INT
	;

fragment INT 
	: '0' 
	| [1-9][0-9]*
	;

STRING : '"' (ESC | . )*? '"';
fragment ESC : '\\' [btnr"\\];

ID : ID_LETTER (ID_LETTER  | DIGIT)*;   // C-like identifiers
fragment ID_LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip;    // skip spaces, tabs and newlines (and \r Windows)
