package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Logger {


    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;
    private int id = 0;
    private String speakLogger = "output";

    public void speakLogger() {
        System.out.println(id + ":" + speakLogger);
    }

    @Inject
    public void setId(@Value("1138") int id) {
        this.id = id;
    }

    @Inject
    public void setSpeakLogger(@Value("ChangedOutput") String speakLogger) {
        this.speakLogger = speakLogger;
    }

    /*@Autowired
    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }*/

    @Inject
    public void setConsoleWriter(ConsoleWriter writer) {
        this.consoleWriter = writer;
    }

    @Inject
    @Named(value = "fileWriter")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        if (consoleWriter != null)
        consoleWriter.write(text);
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

}
