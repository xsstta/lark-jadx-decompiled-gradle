package com.ss.ttvideoengine.source;

import com.ss.ttvideoengine.source.Source;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class DirectUrlSource implements Source {
    private final List<UrlItem> urlItems;
    private final String vid;

    public static class UrlItem {
        public final String cacheKey;
        public final String encodeType;
        public final String playAuth;
        public final String url;

        public static class Builder {
            public String cacheKey;
            public String encodeType;
            public String playAuth;
            public String url;

            public Builder() {
            }

            public UrlItem build() {
                Objects.requireNonNull(this.url, "url = null");
                if (this.encodeType == null) {
                    this.encodeType = "h264";
                }
                return new UrlItem(this);
            }

            public Builder setCacheKey(String str) {
                this.cacheKey = str;
                return this;
            }

            public Builder setEncodeType(String str) {
                this.encodeType = str;
                return this;
            }

            public Builder setPlayAuth(String str) {
                this.playAuth = str;
                return this;
            }

            public Builder setUrl(String str) {
                Objects.requireNonNull(str, "url = null");
                this.url = str;
                return this;
            }

            public Builder(UrlItem urlItem) {
                this.url = urlItem.url;
                this.cacheKey = urlItem.cacheKey;
                this.playAuth = urlItem.playAuth;
                this.encodeType = urlItem.encodeType;
            }
        }

        public String getCacheKey() {
            return this.cacheKey;
        }

        public String getEncodeType() {
            return this.encodeType;
        }

        public String getPlayAuth() {
            return this.playAuth;
        }

        public String getUrl() {
            return this.url;
        }

        public String toString() {
            return "UrlItem{url='" + this.url + '\'' + ", cacheKey='" + this.cacheKey + '\'' + ", playAuth='" + this.playAuth + '\'' + ", encodeType='" + this.encodeType + '\'' + '}';
        }

        private UrlItem(Builder builder) {
            this.url = builder.url;
            this.cacheKey = builder.cacheKey;
            this.playAuth = builder.playAuth;
            this.encodeType = builder.encodeType;
        }
    }

    @Override // com.ss.ttvideoengine.source.Source
    public Source.Type type() {
        return Source.Type.DIRECT_URL_SOURCE;
    }

    @Override // com.ss.ttvideoengine.source.Source
    public String vid() {
        return this.vid;
    }

    public List<UrlItem> allItems() {
        return Collections.unmodifiableList(this.urlItems);
    }

    public boolean isEmpty() {
        return this.urlItems.isEmpty();
    }

    public static class Builder {
        public final List<UrlItem> items = new ArrayList();
        public String vid;

        public DirectUrlSource build() {
            if (!this.items.isEmpty()) {
                return new DirectUrlSource(this);
            }
            throw new IllegalArgumentException("items is empty");
        }

        public Builder setVid(String str) {
            this.vid = str;
            return this;
        }

        public Builder addItem(UrlItem urlItem) {
            Objects.requireNonNull(urlItem, "urlItem = null");
            this.items.add(urlItem);
            return this;
        }
    }

    public String toString() {
        return "DirectUrlSource{vid='" + this.vid + '\'' + ", urlItems=" + this.urlItems + '}';
    }

    private DirectUrlSource(Builder builder) {
        String str;
        ArrayList arrayList = new ArrayList();
        this.urlItems = arrayList;
        if (builder.vid == null) {
            str = UUID.randomUUID().toString();
        } else {
            str = builder.vid;
        }
        this.vid = str;
        arrayList.addAll(builder.items);
    }
}
