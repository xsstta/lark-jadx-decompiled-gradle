package com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.importresultmodel;

import java.io.Serializable;
import java.util.List;

public class ImportFileResult implements Serializable {
    private int code;
    private String status;
    private String ticket;
    private List<String> tokens;
    private String type;
    private String url;

    public int getCode() {
        return this.code;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTicket() {
        return this.ticket;
    }

    public List<String> getTokens() {
        return this.tokens;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setTokens(List<String> list) {
        this.tokens = list;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
