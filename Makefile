make: NURunner.java
	rm -rf *.class
	javac NURunner.java
	rm -rf Solution.zip
	zip Solution.zip *.java
