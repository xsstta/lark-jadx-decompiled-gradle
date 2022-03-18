package com.bytedance.common.wschannel;

import com.bytedance.common.utility.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelInfo {
    int aid;
    String appKey;
    final int channelId;
    String deviceId;
    Map<String, String> extra = new HashMap();
    int fpid;
    String installId;
    int updateVersionCode;
    List<String> urls;

    public static class Builder {
        private int aid;
        private int appVersion;
        private String appkey;
        private final int channelId;
        private String deviceId;
        Map<String, String> extra = new HashMap();
        private int fpid;
        private String installId;
        List<String> urls = new ArrayList();

        public ChannelInfo builder() {
            return new ChannelInfo(this.fpid, this.aid, this.appVersion, this.appkey, this.channelId, this.deviceId, this.installId, this.urls, this.extra);
        }

        public Builder setAid(int i) {
            this.aid = i;
            return this;
        }

        public Builder setAppKey(String str) {
            this.appkey = str;
            return this;
        }

        public Builder setAppVersion(int i) {
            this.appVersion = i;
            return this;
        }

        public Builder setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder setFPID(int i) {
            this.fpid = i;
            return this;
        }

        public Builder setInstallId(String str) {
            this.installId = str;
            return this;
        }

        public static Builder create(int i) {
            return new Builder(i);
        }

        public Builder extras(Map<String, String> map) {
            if (map != null) {
                this.extra.putAll(map);
            }
            return this;
        }

        public Builder urls(List<String> list) {
            if (list != null) {
                this.urls.addAll(list);
            }
            return this;
        }

        Builder(int i) {
            this.channelId = i;
        }

        public Builder extra(String str, String str2) {
            if (!StringUtils.isEmpty(str)) {
                this.extra.put(str, str2);
            }
            return this;
        }
    }

    public String toString() {
        return "ChannelInfo{channelId = " + this.channelId + ", deviceId = " + this.installId + ", installId = " + this.installId + ", fpid = " + this.fpid + ", aid = " + this.aid + ", updateVersionCode = " + this.updateVersionCode + ", appKey = " + this.appKey + ", extra = " + this.extra + ", urls = " + this.urls + "}";
    }

    public ChannelInfo(ChannelInfo channelInfo) {
        ArrayList arrayList = new ArrayList();
        this.urls = arrayList;
        this.channelId = channelInfo.channelId;
        this.deviceId = channelInfo.deviceId;
        this.installId = channelInfo.installId;
        List<String> list = channelInfo.urls;
        if (list != null) {
            arrayList.addAll(list);
        }
        Map<String, String> map = channelInfo.extra;
        if (map != null) {
            this.extra.putAll(map);
        }
        this.fpid = channelInfo.fpid;
        this.aid = channelInfo.aid;
        this.appKey = channelInfo.appKey;
        this.updateVersionCode = channelInfo.updateVersionCode;
    }

    public ChannelInfo(int i, int i2, int i3, String str, int i4, String str2, String str3, List<String> list, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        this.urls = arrayList;
        this.channelId = i4;
        this.deviceId = str2;
        this.installId = str3;
        this.updateVersionCode = i3;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            this.extra.putAll(map);
        }
        this.fpid = i;
        this.aid = i2;
        this.appKey = str;
    }
}
