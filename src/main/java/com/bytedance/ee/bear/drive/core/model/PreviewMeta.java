package com.bytedance.ee.bear.drive.core.model;

import com.bytedance.ee.bear.drive.loader.download.platform.api.FileInfoMeta;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.LinkedHashMap;

public final class PreviewMeta implements NonProguard {
    private final Content content;
    private final String extra;
    private final int interval;
    private boolean linearized;
    private final int longPushRetryInterval;
    private final long previewFileSize;
    private final int status;

    public Content getContent() {
        return this.content;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getInterval() {
        return this.interval;
    }

    public int getLongPushRetryInterval() {
        return this.longPushRetryInterval;
    }

    public long getPreviewFileSize() {
        return this.previewFileSize;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isLinearized() {
        return this.linearized;
    }

    public static class Content implements Serializable {
        public final LinkedHashMap<String, String> transcodeUrls;
        public final int type;

        public String toString() {
            return "Content{type=" + this.type + ", transcodeUrls=" + this.transcodeUrls + '}';
        }

        public Content(int i, LinkedHashMap<String, String> linkedHashMap) {
            this.type = i;
            this.transcodeUrls = linkedHashMap;
        }
    }

    public String toString() {
        return "Result{status=" + this.status + ", interval=" + this.interval + ", longPushRetryInterval=" + this.longPushRetryInterval + ", content=" + this.content + ", linearized=" + this.linearized + ", previewFileSize=" + this.previewFileSize + ", extra='" + C13721c.m55650d(this.extra) + '\'' + '}';
    }

    public void setLinearized(boolean z) {
        this.linearized = z;
    }

    public PreviewMeta(FileInfoMeta fileInfoMeta) {
        Content content2;
        this.status = fileInfoMeta.status;
        this.interval = fileInfoMeta.interval;
        this.longPushRetryInterval = fileInfoMeta.longPushRetryInterval;
        if (fileInfoMeta.content == null) {
            content2 = null;
        } else {
            content2 = new Content(fileInfoMeta.content.type, fileInfoMeta.content.transcodeUrls);
        }
        this.content = content2;
        this.linearized = fileInfoMeta.linearized;
        this.previewFileSize = fileInfoMeta.previewFileSize;
        this.extra = fileInfoMeta.extra;
    }
}
