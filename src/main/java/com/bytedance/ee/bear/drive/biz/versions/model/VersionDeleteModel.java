package com.bytedance.ee.bear.drive.biz.versions.model;

import java.io.Serializable;

public class VersionDeleteModel implements Serializable {
    private DataBean data;

    public static class DataBean implements Serializable {
        private int code;
        private String edit_user_id;
        private int source;
        private String token;
        private String type;
        private String version;

        public int getCode() {
            return this.code;
        }

        public String getEdit_user_id() {
            return this.edit_user_id;
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

        public String getVersion() {
            return this.version;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setEdit_user_id(String str) {
            this.edit_user_id = str;
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

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
