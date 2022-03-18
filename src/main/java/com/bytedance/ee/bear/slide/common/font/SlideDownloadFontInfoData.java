package com.bytedance.ee.bear.slide.common.font;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;
import java.util.Objects;

public class SlideDownloadFontInfoData implements BaseJSModel {
    private List<Config> config;

    public static class Config implements BaseJSModel, Comparable<Config> {
        private boolean isCurrentSlide;
        private String key;
        private String md5;
        private int priority;
        private String size;
        private String type;
        private String url;

        public String getKey() {
            return this.key;
        }

        public String getMd5() {
            return this.md5;
        }

        public int getPriority() {
            return this.priority;
        }

        public String getSize() {
            return this.size;
        }

        public String getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public boolean isCurrentSlide() {
            return this.isCurrentSlide;
        }

        public int hashCode() {
            return Objects.hash(this.url, this.key, this.md5);
        }

        public String toString() {
            return "Config{url='" + this.url + '\'' + ", size='" + this.size + '\'' + ", type='" + this.type + '\'' + ", key='" + this.key + '\'' + ", md5='" + this.md5 + '\'' + ", priority=" + this.priority + ", isCurrentSlide=" + this.isCurrentSlide + '}';
        }

        public void setCurrentSlide(boolean z) {
            this.isCurrentSlide = z;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setPriority(int i) {
            this.priority = i;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public int compareTo(Config config) {
            if (isCurrentSlide() == config.isCurrentSlide()) {
                return getPriority() - config.getPriority();
            }
            if (isCurrentSlide()) {
                return -1;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Config config = (Config) obj;
            if (!Objects.equals(this.url, config.url) || !Objects.equals(this.key, config.key) || !Objects.equals(this.md5, config.md5)) {
                return false;
            }
            return true;
        }
    }

    public List<Config> getConfig() {
        return this.config;
    }

    public String toString() {
        return "SlideDownloadFontInfoData{configs=" + this.config + '}';
    }

    public void setConfig(List<Config> list) {
        this.config = list;
    }
}
