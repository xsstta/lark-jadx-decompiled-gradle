package com.bytedance.ee.bear.notification.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class Notification implements NonProguard {
    private boolean close;
    private ContentBean content;
    private long end_time;
    private String id = "";
    private List<String> products;
    private long start_time;
    private int status;
    private List<VersionBean> version;

    public static class ContentBean implements NonProguard {
        private String en;
        private String ja;
        private String zh;

        public String getEn() {
            return this.en;
        }

        public String getJa() {
            return this.ja;
        }

        public String getZh() {
            return this.zh;
        }

        public String toString() {
            return "ContentBean{en='" + this.en + '\'' + ", ja='" + this.ja + '\'' + ", zh='" + this.zh + '\'' + '}';
        }

        public void setEn(String str) {
            this.en = str;
        }

        public void setJa(String str) {
            this.ja = str;
        }

        public void setZh(String str) {
            this.zh = str;
        }
    }

    public static class VersionBean implements NonProguard {
        private String end;
        private String start;

        public String getEnd() {
            return this.end;
        }

        public String getStart() {
            return this.start;
        }

        public void setEnd(String str) {
            this.end = str;
        }

        public void setStart(String str) {
            this.start = str;
        }
    }

    public ContentBean getContent() {
        return this.content;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getProducts() {
        return this.products;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int getStatus() {
        return this.status;
    }

    public List<VersionBean> getVersion() {
        return this.version;
    }

    public boolean isClose() {
        return this.close;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return "Notification{id='" + this.id + '\'' + ", content=" + this.content + '}';
    }

    public void setClose(boolean z) {
        this.close = z;
    }

    public void setContent(ContentBean contentBean) {
        this.content = contentBean;
    }

    public void setEnd_time(long j) {
        this.end_time = j;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProducts(List<String> list) {
        this.products = list;
    }

    public void setStart_time(long j) {
        this.start_time = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setVersion(List<VersionBean> list) {
        this.version = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        return getId().equals(((Notification) obj).getId());
    }
}
