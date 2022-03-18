package com.bytedance.ee.bear.atfinder;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Map;

public class AtFinderJsCallbackData implements NonProguard {
    protected Map<String, String> bizCommonParams;
    protected String content;
    protected String id;
    protected Mention mention;
    protected String mentionPanel;
    protected int show;
    protected int source;
    protected String token;
    protected String type;

    public static class Mention implements NonProguard {
        public int file_type;
        public String source;
        public String zone;

        public Mention() {
        }

        public int getFileType() {
            return this.file_type;
        }

        public String getSource() {
            return this.source;
        }

        public String getZone() {
            return this.zone;
        }

        public void setFileType(int i) {
            this.file_type = i;
        }

        public void setSource(String str) {
            this.source = str;
        }

        public void setZone(String str) {
            this.zone = str;
        }

        public Mention(String str, String str2, int i) {
            this.zone = str;
            this.source = str2;
            this.file_type = i;
        }
    }

    public AtFinderJsCallbackData() {
    }

    public Map<String, String> getBizCommonParams() {
        return this.bizCommonParams;
    }

    public String getContent() {
        return this.content;
    }

    public String getId() {
        return this.id;
    }

    public Mention getMention() {
        return this.mention;
    }

    public String getMentionPanel() {
        return this.mentionPanel;
    }

    public int getShow() {
        return this.show;
    }

    public int getSource() {
        return this.source;
    }

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "AtFinderJsCallbackData{source=" + this.source + ", id='" + this.id + '\'' + ", show=" + this.show + ", type='" + this.type + '\'' + ", mentionPanel='" + this.mentionPanel + '\'' + ", token='" + C13598b.m55197d(this.token) + '\'' + '}';
    }

    public void setBizCommonParams(Map<String, String> map) {
        this.bizCommonParams = map;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMention(Mention mention2) {
        this.mention = mention2;
    }

    public void setMentionPanel(String str) {
        this.mentionPanel = str;
    }

    public void setShow(int i) {
        this.show = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public AtFinderJsCallbackData(String str, int i, int i2, String str2, String str3, String str4, Mention mention2) {
        this.id = str;
        this.source = i;
        this.show = i2;
        this.content = str2;
        this.type = str3;
        this.token = str4;
        this.mention = mention2;
    }
}
