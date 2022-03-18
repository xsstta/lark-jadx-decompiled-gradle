package com.bytedance.ee.bear.drive.loader.download.platform.api.drive;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class PreviewGetV1Puller extends BasePuller<Params, Result> {

    public static class Content implements Serializable {
        @JSONField(name = "transcode_urls")
        public LinkedHashMap<String, String> transcodeUrls;
        public int type;

        public String toString() {
            return "Content{type=" + this.type + ", transcodeUrls=" + this.transcodeUrls + '}';
        }
    }

    public static class Params extends BasePuller.Params {
        public String extra;
        public String file_token;
        public String mount_node_token;
        public String mount_point;
        public int preview_type;
        public int regenerate;
        public String version;

        public String toString() {
            return "Params{file_token='" + C13721c.m55650d(this.file_token) + '\'' + ", mount_node_token='" + C13721c.m55650d(this.mount_node_token) + '\'' + ", mount_point='" + this.mount_point + '\'' + ", preview_type=" + this.preview_type + ", regenerate=" + this.regenerate + ", version='" + this.version + '\'' + ", extra='" + C13721c.m55650d(this.extra) + '\'' + '}';
        }

        public Params(String str, String str2, String str3, int i, boolean z, String str4, String str5) {
            this.file_token = str;
            this.preview_type = i;
            this.regenerate = z ? 1 : 0;
            this.version = str4;
            if (!TextUtils.isEmpty(str2)) {
                this.mount_node_token = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.mount_point = str3;
            }
            if (!TextUtils.isEmpty(str5)) {
                this.extra = str5;
            }
        }
    }

    public static class Result extends BasePuller.Result {
        public Content content;
        public String extra;
        public int interval;
        public boolean linearized;
        @JSONField(name = "long_push_retry_interval")
        public int longPushRetryInterval;
        @JSONField(name = "preview_file_size")
        public long previewFileSize;
        @JSONField(name = "preview_url")
        public String previewUrl;
        public int status;

        public String toString() {
            return "Result{status=" + this.status + ", interval=" + this.interval + ", longPushRetryInterval=" + this.longPushRetryInterval + ", previewUrl='" + C13721c.m55650d(this.previewUrl) + '\'' + ", content=" + this.content + ", linearized=" + this.linearized + ", previewFileSize=" + this.previewFileSize + ", extra='" + C13721c.m55650d(this.extra) + '\'' + '}';
        }
    }

    public PreviewGetV1Puller(NetService netService) {
        super(netService, "/api/box/preview/get/");
    }
}
