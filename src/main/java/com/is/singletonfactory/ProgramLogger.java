package com.is.singletonfactory;

public class ProgramLogger {
    private static ProgramLogger instance;
    private static String logFile = "This  \n\n";

    private ProgramLogger() {

    }

    public static synchronized ProgramLogger getInstance() {
        if (instance == null) {
            return new ProgramLogger();
        }
        return instance;
    }

    public void writeToLogFile(String st){
        logFile += st + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
