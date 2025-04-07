package com.is.singletonfactory;

public class ProgramClient {
    public static void main(String[] args) {
        ProgramLogger.getInstance().writeToLogFile("First log...");
        ProgramLogger.getInstance().writeToLogFile("Seccond log...");
        ProgramLogger.getInstance().writeToLogFile("Third log...");

        ProgramLogger.getInstance().showLogFile();
    }
}
