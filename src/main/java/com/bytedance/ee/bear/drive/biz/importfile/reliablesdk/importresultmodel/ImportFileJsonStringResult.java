package com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.importresultmodel;

import java.io.Serializable;

public class ImportFileJsonStringResult implements Serializable {
    private String business;
    private Data data;

    public static class Body implements Serializable {
        private String data;

        public String getData() {
            return this.data;
        }

        public void setData(String str) {
            this.data = str;
        }
    }

    public static class Data implements Serializable {
        private Body body;

        public Body getBody() {
            return this.body;
        }

        public void setBody(Body body2) {
            this.body = body2;
        }
    }

    public String getBusiness() {
        return this.business;
    }

    public Data getData() {
        return this.data;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
