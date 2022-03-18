package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class MessageResultBean implements NonProguard {
    private int code;
    private Data data;
    private String msg;
    private boolean noSetValue;

    public static class Data implements NonProguard {
        private Badge badge;
        private List<MessageBean> message;
        private int newMessageNum;

        public static class Badge implements NonProguard {
            private long count;
            private long ver;

            public long getCount() {
                return this.count;
            }

            public long getVer() {
                return this.ver;
            }

            public void setCount(long j) {
                this.count = j;
            }

            public void setVer(long j) {
                this.ver = j;
            }
        }

        public Badge getBadge() {
            return this.badge;
        }

        public List<MessageBean> getMessage() {
            return this.message;
        }

        public int getNewMessageNum() {
            return this.newMessageNum;
        }

        public void setBadge(Badge badge2) {
            this.badge = badge2;
        }

        public void setMessage(List<MessageBean> list) {
            this.message = list;
        }

        public void setNewMessageNum(int i) {
            this.newMessageNum = i;
        }
    }

    public int getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public boolean isNoSetValue() {
        return this.noSetValue;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setNoSetValue(boolean z) {
        this.noSetValue = z;
    }
}
