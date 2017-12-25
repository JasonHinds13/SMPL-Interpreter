/* Specification for SMPL tokens */

// user customisations
import java_cup.runtime.*;

// Jlex directives
%%

%cup
%public

%class Lexer

%type java_cup.runtime.Symbol

%eofval{
	return new Symbol(sym.EOF);
%eofval}

%eofclose	false

%char
%line

%{
    public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }
%}

nl = [\n\r]

cc = ([\b\f]|{nl})

ws = {cc}|[\t ]

alpha = [a-zA-Z_]

num = [0-9]

special = [-?+]

alphanum = {alpha}|{num}
charset = {alphanum}|{special}

%%

<YYINITIAL>	{nl}	{
                        //skip newline, but reset char counter
			yycolumn = 0;
			}
<YYINITIAL>	{ws}	{
                        //skip whitespace
			}
<YYINITIAL>	"+"	{return new Symbol(sym.PLUS);}
<YYINITIAL>	"-"	{return new Symbol(sym.MINUS);}
<YYINITIAL>	"*"	{return new Symbol(sym.MUL);}
<YYINITIAL>	"/"	{return new Symbol(sym.DIV);}
<YYINITIAL>	"%"	{return new Symbol(sym.MOD);}

<YYINITIAL>	"="	{return new Symbol(sym.EQUAL);}

<YYINITIAL> "<" {return new Symbol(sym.COMMA);}
<YYINITIAL> ">" {return new Symbol(sym.COMMA);}
<YYINITIAL> "<=" {return new Symbol(sym.COMMA);}
<YYINITIAL> ">=" {return new Symbol(sym.COMMA);}
<YYINITIAL> "!=" {return new Symbol(sym.COMMA);}

<YYINITIAL> "&" {return new Symbol(sym.AMP);}
<YYINITIAL> "|" {return new Symbol(sym.PIPE);}
<YYINITIAL> "~" {return new Symbol(sym.TILDE);}

<YYINITIAL> "@" {return new Symbol(sym.AT);}

<YYINITIAL> "and" {return new Symbol(sym.AND);}
<YYINITIAL> "or" {return new Symbol(sym.OR);}
<YYINITIAL> "not" {return new Symbol(sym.NOT);}

<YYINITIAL>	"("	{return new Symbol(sym.LPAREN);}
<YYINITIAL>	")"	{return new Symbol(sym.RPAREN);}

<YYINITIAL>	"{"	{return new Symbol(sym.LBRACE);}
<YYINITIAL> "}" {return new Symbol(sym.RBRACE);}

<YYINITIAL>	"["	{return new Symbol(sym.LSQUARE);}
<YYINITIAL> "]" {return new Symbol(sym.RSQUARE);}

<YYINITIAL> ":" {return new Symbol(sym.COLON);}
<YYINITIAL> "," {return new Symbol(sym.COMMA);}

<YYINITIAL> "proc" {return new Symbol(sym.PROC);}
<YYINITIAL> "call" {return new Symbol(sym.CALL);}
<YYINITIAL> "def" {return new Symbol(sym.DEF);}
<YYINITIAL> "if" {return new Symbol(sym.IF);}
<YYINITIAL> "else" {return new Symbol(sym.ELSE);}
<YYINITIAL> "lazy" {return new Symbol(sym.LAZY);}
<YYINITIAL> "let" {return new Symbol(sym.LET);}
<YYINITIAL> "case" {return new Symbol(sym.CASE);}
<YYINITIAL> "print" {return new Symbol(sym.PRINT);}
<YYINITIAL> "println" {return new Symbol(sym.PRINTLN);}
<YYINITIAL> "read" {return new Symbol(sym.READ);}
<YYINITIAL> "readint" {return new Symbol(sym.READINT);}

<YYINITIAL>    {num}+ {
	       // INTEGER
	       return new Symbol(sym.INTEGER,
				 new Integer(yytext()));
	       }

<YYINITIAL>    {alpha}{charset}* {
	       // VARIABLE
	       return new Symbol(sym.VARIABLE, yytext());
	       }
