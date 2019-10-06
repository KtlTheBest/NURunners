make: NURunner.java
	rm -rf *.class
	javac NURunner.java
	rm -rf Assignment.zip
	zip Assignment.zip *.java
