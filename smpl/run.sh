
cd syntax
jflex SMPLLexer.jflex
cup -parser SMPLParser SMPLParser.cup
cd ..

javac -classpath ".:/user/share/java/cup.jar" Repl.java
java -classpath ".:/user/share/java/cup.jar" Repl
