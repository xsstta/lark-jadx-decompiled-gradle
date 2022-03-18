package com.bytedance.ee.bear.notification.bean;

import com.bytedance.ee.util.io.NonProguard;

public class NotificationPushData implements NonProguard {
    private String business;
    private DataBean data;

    public static class DataBean implements NonProguard {
        private BodyBean body;
        private String operation;

        public static class BodyBean implements NonProguard {
            private String data;

            public String getData() {
                return this.data;
            }

            public void setData(String str) {
                this.data = str;
            }
        }

        public BodyBean getBody() {
            return this.body;
        }

        public String getOperation() {
            return this.operation;
        }

        public void setBody(BodyBean bodyBean) {
            this.body = bodyBean;
        }

        public void setOperation(String str) {
            this.operation = str;
        }
    }

    public String getBusiness() {
        return this.business;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
