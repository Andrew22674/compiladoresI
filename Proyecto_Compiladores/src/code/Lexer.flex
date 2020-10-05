package code;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%unicode
%class Lexer
%int
%cup
%line
%column
%full
%char

%state comment, onelinecomment
spaces = [" "\n\r\t]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private void error(String message) {
                errores.add("Error léxico en línea "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
		System.err.println("Lexical Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
	}

    ArrayList<String> errores = new ArrayList();

%}

// Operators
mod = "%"
Rel_Op= ("=="|">="|"<="|"!="|">"|"<")
Sum_Op=("+"|"-")
Mult_Op=("*"|"/")
Log_Op=("and"|"or")



vartype = int | char | bool | arr{l_bra}({num}|{digit}){r_bra}| arr{l_bra}({num}|{digit}){r_bra}{l_bra}({num}|{digit}){r_bra}
mmain = "main"
endmain ="endmain"

switch="switch"
break="break"
letter = [a-zA-Z]
word = letter+
digit = [0-9]
num = {digit}+
//boolean 

bool=("true"|"false")



//other characters
//quotation = "\""
l_key="{"
r_key="}"
l_par="("
r_par=")"
l_bra="["
r_bra="]"
dot="."
comma=","
colon=":"
semicolon=";"
//_str = "\"[" "a-zA-Z\n]+"\"
pipe="|"
ASSIGN= "~"
ID=({letter})+({digit}|{letter})*
STEP = "<"{digit}+">"
_char = "'"{letter}"'"



// Comments
COMMENT_LINE ="#"
START_COMMENT="/#"
END_COMMENT="#/"
%%
<YYINITIAL>{  
    // reserved words
    "int"       {return symbol(sym.INT, yytext());}
    "char"      {return symbol(sym.CHAR, yytext());}
    "bool"      {return symbol(sym.BOOLEAN, yytext());}
    //"str"       {return symbol(sym.STR, yytext());}
    "func"      {return symbol(sym.FUNC, yytext());}
    "switch"    {return symbol(sym.SWITCH, yytext());}
    "for"       {return symbol(sym.FOR, yytext());}
    "break"     {return symbol(sym.BREAK, yytext());}
    "case"      {return symbol(sym.CASE, yytext());}
    "default"   {return symbol(sym.DEFAULT, yytext());}
    "break"     {return symbol(sym.BREAK, yytext());}
    "if"        {return symbol(sym.IF, yytext());}
    "or"        {return symbol(sym.OR, yytext());}
    "else"      {return symbol(sym.ELSE, yytext());}
    "endif"     {return symbol(sym.ENDIF, yytext());}
    "while"     {return symbol(sym.WHILE, yytext());}
    "return"    {return symbol(sym.RETURN, yytext());}
    "true"      {return symbol(sym.TRUE, yytext());}
    "false"     {return symbol(sym.FALSE, yytext());}
    "!"         {return symbol(sym.NOT, yytext());}
    "print"     {return symbol(sym.PRINT, yytext());}
    "=="        {return symbol(sym.EQ, yytext());}
    "\""        {return symbol(sym.QUOTATION, yytext());}
    "\'"        {return symbol(sym.QUOTE, yytext());}
    "run"       {return symbol(sym.RUN, yytext());}
    "end"       {return symbol(sym.END, yytext());}
    "none"      {return symbol(sym.NONE, yytext());}
    
    //variables
    {mmain}         {return symbol(sym.MAIN, yytext());}     
    {endmain}       {return symbol(sym.ENDMAIN, yytext());}
    {letter}        {return symbol(sym.LETTER, yytext());}
    {digit}         {return symbol(sym.DIGIT, new Integer(yytext()));}
    {num}           {return symbol(sym.NUM, new Integer(yytext()));}
    {bool}          {return symbol(sym.BOOL, yytext());}
    //{_str}          {return symbol(sym.STRING, yytext());}
    {word}          {return symbol(sym.WORD, yytext());}
    {mod}           {return symbol(sym.MOD, yytext());}
    {Log_Op}        {return symbol(sym.LOGOP, yytext());}
    {Sum_Op}        {return symbol(sym.SUMOP, yytext());}
    {Mult_Op}       {return symbol(sym.MULTOP, yytext());}
    {Rel_Op}        {return symbol(sym.RELOP, yytext());}
    {vartype}       {return symbol(sym.VARTYPE, yytext());}
    {l_key}         {return symbol(sym.LKEY, yytext());}
    {r_key}         {return symbol(sym.RKEY, yytext());}
    {l_bra}         {return symbol(sym.LBRA, yytext());}
    {r_bra}         {return symbol(sym.RBRA, yytext());}
    {l_par}         {return symbol(sym.LPAR, yytext());}
    {r_par}         {return symbol(sym.RPAR, yytext());}
    {dot}           {return symbol(sym.DOT, yytext());}
    {comma}         {return symbol(sym.COMMA, yytext());}
    {semicolon}     {return symbol(sym.SEMICOLON, yytext());}
    {pipe}          {return symbol(sym.PIPE, yytext());}
    {colon}         {return symbol(sym.COLON, yytext());}
    {ASSIGN}         {return symbol(sym.ASSIGN, yytext());}
    {STEP}          {return symbol(sym.STEP, yytext());}
    {COMMENT_LINE}  {yybegin(onelinecomment);}
    
    {ID}            {return symbol(sym.ID,yytext());}
    
    {spaces}        {}
    {START_COMMENT} {System.out.println("start comment");yybegin(comment);}
    .               { error("Caracter no reconocido <"+ yytext()+">");}
    

}

<comment>{
    {END_COMMENT}   {System.out.println("end comment");
                    yybegin(YYINITIAL);}
    {spaces}        {}
    . {}
}

<onelinecomment>{
   [\n]+ {yybegin(YYINITIAL);}
   . {}
}




