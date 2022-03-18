package com.ss.android.common.applog;

public class EstrBean {
    private String estr;
    private int next_heartbeat;

    public String getEstr() {
        return this.estr;
    }

    public int getNext_heartbeat() {
        return this.next_heartbeat;
    }

    public void setEstr(String str) {
        this.estr = str;
    }

    public void setNext_heartbeat(int i) {
        this.next_heartbeat = i;
    }
}
