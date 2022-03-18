package com.bytedance.ee.bear.drive.loader.download.platform.api.imfile;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class PreviewGetV2Puller extends BasePuller<Params, Result> {

    public static class Content implements Serializable {
        @JSONField(name = "transcode_urls")
        public LinkedHashMap<String, String> transcodeUrls;
        public int type;

        public String toString() {
            return "Content{type=" + this.type + ", transcodeUrls=" + this.transcodeUrls + '}';
        }
    }

    public static class Params extends BasePuller.Params {
        public String app_file_id;
        public String app_id;
        public String auth_extra;
        public int preview_type;

        public String toString() {
            return "Params{app_id='" + C13721c.m55650d(this.app_id) + '\'' + ", app_file_id='" + C13721c.m55650d(this.app_file_id) + '\'' + ", auth_extra='" + C13721c.m55650d(this.auth_extra) + '\'' + ", preview_type=" + this.preview_type + '}';
        }

        public Params(String str, String str2, int i, String str3) {
            this.app_id = str;
            this.app_file_id = str2;
            this.preview_type = i;
            this.auth_extra = str3;
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

    public PreviewGetV2Puller(NetService netService) {
        super(netService, "/api/box/sdk/preview/get/");
    }
}
