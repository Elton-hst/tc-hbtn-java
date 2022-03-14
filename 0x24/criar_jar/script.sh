#!/bin/bash
mkdir "build"
cd com/holbertonschool/matematica/Aritmeticos.java
javac -d ../../../ build Aritmeticos.java
cd ../../../
cd build
jar -cf matematica.jar Aritmeticos.class
