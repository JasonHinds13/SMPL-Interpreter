
cd syntax
jflex SMPLLexer.jflex
cup -parser SMPLParser SMPLParser.cup
cd ..

export CLASSPATH=".:/home/jason/Desktop/SMPL-Interpreter/:/usr/share/java/cup.jar"

#javac semantics/*.java
#javac syntax/*.java
javac values/*.java

#javac sys/Repl.java
#java sys.Repl
