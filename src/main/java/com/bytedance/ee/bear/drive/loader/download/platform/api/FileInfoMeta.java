package com.bytedance.ee.bear.drive.loader.download.platform.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class FileInfoMeta implements NonProguard {
    public Content content;
    public String extra;
    public int interval;
    public boolean linearized;
    @JSONField(name = "long_push_retry_interval")
    public int longPushRetryInterval;
    @JSONField(name = "preview_file_size")
    public long previewFileSize;
    public int status;

    public static class Content implements Serializable {
        @JSONField(name = "transcode_urls")
        public LinkedHashMap<String, String> transcodeUrls;
        public int type;

        public String toString() {
            return "Content{type=" + this.type + ", transcodeUrls=" + this.transcodeUrls + '}';
        }
    }

    public String toString() {
        return "FileInfoMeta{status=" + this.status + ", interval=" + this.interval + ", longPushRetryInterval=" + this.longPushRetryInterval + ", content=" + this.content + ", linearized=" + this.linearized + ", previewFileSize=" + this.previewFileSize + ", extra='" + C13721c.m55650d(this.extra) + '\'' + '}';
    }
}
