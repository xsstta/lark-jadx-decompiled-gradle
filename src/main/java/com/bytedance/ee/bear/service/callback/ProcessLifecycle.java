package com.bytedance.ee.bear.service.callback;

import java.io.Serializable;

public final class ProcessLifecycle implements Serializable {
    private int processID;
    private String processName;
    private ProcessSate processSate;

    public enum ProcessSate {
        START,
        DIED
    }

    public int getProcessID() {
        return this.processID;
    }

    public String getProcessName() {
        return this.processName;
    }

    public ProcessSate getProcessSate() {
        return this.processSate;
    }

    public String toString() {
        return "ProcessLifecycle{processName='" + this.processName + '\'' + ", processID=" + this.processID + ", processSate=" + this.processSate + '}';
    }

    public void setProcessID(int i) {
        this.processID = i;
    }

    public void setProcessName(String str) {
        this.processName = str;
    }

    public void setProcessSate(ProcessSate processSate2) {
        this.processSate = processSate2;
    }
}
