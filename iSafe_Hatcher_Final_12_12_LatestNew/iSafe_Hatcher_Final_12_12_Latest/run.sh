javac -sourcepath src:Tests -d bin -cp './ext/*:./ext/*' ./src/iSAFE/TestDriver.java ./Tests/TestCases/TestCases.java

java -cp 'bin:./ext/*:./ext/*' iSAFE.TestDriver