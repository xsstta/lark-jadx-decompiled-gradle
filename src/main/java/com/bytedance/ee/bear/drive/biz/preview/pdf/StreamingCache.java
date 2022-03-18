package com.bytedance.ee.bear.drive.biz.preview.pdf;

import android.webkit.URLUtil;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.io.File;

public class StreamingCache implements NonProguard {
    private String filePath;
    private long previewFileSize;
    private String streamingUrl;

    public StreamingCache() {
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getPreviewFileSize() {
        return this.previewFileSize;
    }

    public String getStreamingUrl() {
        return this.streamingUrl;
    }

    public boolean check() {
        File file = new File(this.filePath);
        if (URLUtil.isNetworkUrl(this.streamingUrl) && file.exists()) {
            long j = this.previewFileSize;
            if (j <= 0 || j != file.length()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return "StreamingCache{streamingUrl='" + C13598b.m55197d(this.streamingUrl) + '\'' + ", filePath='" + C13598b.m55197d(this.filePath) + '\'' + ", previewFileSize=" + this.previewFileSize + '}';
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setPreviewFileSize(long j) {
        this.previewFileSize = j;
    }

    public void setStreamingUrl(String str) {
        this.streamingUrl = str;
    }

    public StreamingCache(String str, String str2, long j) {
        this.streamingUrl = str;
        this.filePath = str2;
        this.previewFileSize = j;
    }
}
