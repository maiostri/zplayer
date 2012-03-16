all:
	javac -cp ./build/ src/*.java -d ./build/

run:
	java -cp ./build/: Zplayer 
