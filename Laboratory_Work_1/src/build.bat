@echo off
set /p class_name="Enter the name of the Java class: "
javac *.java
java %class_name%.java