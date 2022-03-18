package com.bytedance.ee.bear.drive.biz.cache.manual.model;

import java.io.Serializable;

public class ManualOfflineSyncData implements Serializable {
    private static final long serialVersionUID = -4013248832365144741L;
    private DataBean data;
    private String token;
    private int type;

    public static class DataBean implements Serializable {
        private String channel;
        private int revision;
        private String token;
        private String type;

        public String getChannel() {
            return this.channel;
        }

        public int getRevision() {
            return this.revision;
        }

        public String getToken() {
            return this.token;
        }

        public String getType() {
            return this.type;
        }

        public void setChannel(String str) {
            this.channel = str;
        }

        public void setRevision(int i) {
            this.revision = i;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
