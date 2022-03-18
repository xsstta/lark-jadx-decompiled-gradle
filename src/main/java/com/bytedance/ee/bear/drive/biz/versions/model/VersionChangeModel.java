package com.bytedance.ee.bear.drive.biz.versions.model;

import java.io.Serializable;

public class VersionChangeModel implements Serializable {
    private Body body;
    private Identifier identifier;
    private String operation;

    public static class Body implements Serializable {
        private Data data;

        public static class Data implements Serializable {
            private String version;

            public String getVersion() {
                return this.version;
            }

            public void setVersion(String str) {
                this.version = str;
            }
        }

        public Data getData() {
            return this.data;
        }

        public void setData(Data data2) {
            this.data = data2;
        }
    }

    public static class Identifier implements Serializable {
        private String token;
        private int type;

        public String getToken() {
            return this.token;
        }

        public int getType() {
            return this.type;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public Body getBody() {
        return this.body;
    }

    public Identifier getIdentifier() {
        return this.identifier;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setBody(Body body2) {
        this.body = body2;
    }

    public void setIdentifier(Identifier identifier2) {
        this.identifier = identifier2;
    }

    public void setOperation(String str) {
        this.operation = str;
    }
}
