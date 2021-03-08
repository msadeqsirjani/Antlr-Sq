grammar Sq;

parse
 : block EOF
 ;

block
 : stat*
 ;

class
 : CLASS ID OPAR variable CPAR stat_block
 | CLASS ID IMPLEMENTS (expr ',')* expr OPAR variable CPAR stat_block
 | CLASS ID EXTEND expr OPAR variable CPAR stat_block
 | CLASS ID EXTEND expr IMPLEMENTS (expr ',')* expr OPAR variable CPAR stat_block
 ;

lib
 : IMPORT ID ('.' ID)* (AS ID)*
 | IMPORT ID '.' OBRACE ID ('.' ID)* (AS ID)* CBRACE
 | IMPORT ID '.' OBRACE (ID ('.' ID)* (AS ID)* SEP)* expr CBRACE
 ;

func
 : DEF ID OPAR variable CPAR RES data_type stat_block
 ;

call
 : ID OPAR (expr SEP)* expr CPAR
 | ID OPAR expr CPAR
 ;

var
 : int_var_declaration
 | double_var_declaration
 | str_var_declaration
 | arr_decl_var_declaration
 | arr_init_var_declaration
 | cls_var_declaration
 ;

stat
 : assignment
 | var
 | call
 | comment
 | if_stat
 | while_stat
 | for_stat
 | print
 | lib
 | func
 | class
 | match
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

int_var_declaration
 : VAR ID COLON INTEGER
 | VAR ID COLON INTEGER ASSIGN INT
 ;

double_var_declaration
 : VAR ID COLON DOUBLE
 | VAR ID COLON DOUBLE ASSIGN FLOAT
 ;

str_var_declaration
 : VAR ID COLON STR
 | VAR ID COLON STR ASSIGN STRING
 ;

cls_var_declaration
 : VAR ID COLON expr
 | VAR ID COLON expr ASSIGN NEW expr OPAR series expr CPAR
 | VAR ID COLON expr ASSIGN NEW expr OPAR expr CPAR
 | VAR ID COLON expr ASSIGN NEW expr OPAR  CPAR
 ;

arr_decl_var_declaration
 : VAR ID COLON ARRAY_DEC OPAR INT CPAR
 ;

arr_init_var_declaration
 : VAR ID COLON ARRAY_INIT OPAR expr CPAR
 | VAR ID COLON ARRAY_INIT OPAR series expr CPAR
 ;

series
 : (expr SEP)*
 ;

assignment
 : ID ASSIGN expr
 | ID ASSIGN NEW expr OPAR CPAR
 | ID ASSIGN NEW expr OPAR (expr)* CPAR
 ;

variable
 : ID COLON data_type (SEP ID COLON data_type)*
 |
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE (lib)* block CBRACE
 | OBRACE block CBRACE
 | OBRACE block RETURN expr CBRACE
 | func
 | stat
 ;

comment
 : SINGLE_COMMENT
 | MULTI_COMMENT
 ;

while_stat
 : WHILE expr stat_block
 ;

for_stat
 : FOR OPAR expr INIT expression STEP expr SCOLON CPAR stat_block
 | FOR OPAR (expr INIT expression STEP expr SCOLON CPAR)* CPAR stat_block
 | FOR OPAR expr INIT expr CPAR stat_block
 ;

match
 : expr MATCH OBRACE (m_series)+ CBRACE
 ;

m_series
 : CASE expr RES expr BREAK?
 ;

expression
 : OPAR INT SEP INT CPAR
 | OPAR INT CPAR
 | OPAR FLOAT CPAR
 ;

print
 : PRINT (atom)*
 ;

expr
 : expr POW2 expr                       #powerExpr
 | REV expr                             #unaryExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | expr SAND expr                       #ampersandExpr
 | expr SHIFTRIGHT expr                 #rightshiftExpr
 | expr SHIFTLEFT expr                  #leftshiftExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

data_type
 : INTEGER
 | STR
 | DOUBLE
 | ARRAY_DEC
 | ID
 ;

OR : '||' | 'or';
AND : '&&' | 'and';
EQ : '==';
SAND : '&';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';
DOT : '.';
POW2 : '**';
SHIFTLEFT : '<<';
SHIFTRIGHT : '>>';
REV : '~';
PLUSPLUS: '++';
MINUSMINUS: '--';

ASSIGN : '=';
COLON: ':';
SCOLON: ';';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
SEP: ',';
SCI: 'e';
RES: '=>';
INIT: '<-';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR: 'for';
PRINT : 'print';
VAR: 'var';
DEF: 'def';
IMPORT: 'import';
AS: 'as';
RETURN: 'return';
NEW: 'new';
STEP: 'step';
CLASS: 'class';
IMPLEMENTS: 'implements';
EXTEND: 'extend';
MATCH: 'match';
CASE: 'case';
BREAK: 'break';

INTEGER: 'int';
DOUBLE: 'double';
STR: 'string';
ARRAY_DEC: 'Array[double]' | 'Array[int]' | 'Array[string]';
ARRAY_INIT: 'Array';

ID
 : [a-zA-Z_$] [a-zA-Z_0-9$]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 | [1-9] '.'[0-9]* SCI [0-9]+
 | [1-9] '.'[0-9]* SCI '-' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

SINGLE_COMMENT
 : '#' ~[\r\n]* -> skip
 ;

MULTI_COMMENT
 : '/*' .*? '*/' -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;