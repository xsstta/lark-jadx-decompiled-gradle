package com.bytedance.ee.bear.middleground.like.export;

import java.io.Serializable;

public class AddLikeResponse implements Serializable {
    private int code;
    private DATA data;
    private String msg;

    public static class DATA implements Serializable {
        private String id;

        public String getId() {
            return this.id;
        }

        public String toString() {
            return "DATA{id='" + this.id + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public DATA getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        return "AddLikeResponse{code=" + this.code + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(DATA data2) {
        this.data = data2;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
