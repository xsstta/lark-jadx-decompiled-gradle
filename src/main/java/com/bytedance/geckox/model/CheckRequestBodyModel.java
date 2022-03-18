package com.bytedance.geckox.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRequestBodyModel {
    @SerializedName("common")
    private Common common;
    @SerializedName("custom")
    private Map<String, Map<String, Object>> custom;
    @SerializedName("deployment")
    private Map<String, List<ChannelInfo>> deployment;
    @SerializedName("deployments")
    private Map<String, Object> deployments;
    @SerializedName("local")
    private Map<String, Map<String, LocalChannel>> local;
    @SerializedName("req_meta")
    private RequestMeta requestMeta;

    public static class Channels {
        @SerializedName("channels")
        public List<Channel> channels = new ArrayList();
    }

    public static class Group {
        @SerializedName("group_name")
        public String groupName;
        @SerializedName("target_channels")
        public List<TargetChannel> targetChannels;
    }

    public static class LocalChannel {
        @SerializedName("l_v")
        public Long localVersion;
    }

    public static class ProcessorParams {
        @SerializedName("domain")
        public String domain;
    }

    public enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private GroupType(String str) {
            this.value = str;
        }
    }

    public static class RequestMeta {
        @SerializedName("combine_level")
        private String combineLevel;
        @SerializedName("req_type")
        private int reqType;
        @SerializedName("sync_task_id")
        private int syncTaskId;

        public String getCombineLevel() {
            return this.combineLevel;
        }

        public int getReqType() {
            return this.reqType;
        }

        public int getSyncTaskId() {
            return this.syncTaskId;
        }

        public void setCombineLevel(String str) {
            this.combineLevel = str;
        }

        public void setReqType(int i) {
            this.reqType = i;
        }

        public void setSyncTaskId(int i) {
            this.syncTaskId = i;
        }

        public RequestMeta(int i) {
            this.reqType = i;
        }
    }

    public static class TargetChannel {
        @SerializedName(C60375c.f150914a)
        public String channelName;
        @SerializedName("from")
        public List<String> from;
        @SerializedName("t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void setRequestMeta(RequestMeta requestMeta2) {
        this.requestMeta = requestMeta2;
    }

    public static class Channel {
        @SerializedName(C60375c.f150914a)
        String channelName;
        @SerializedName("l_v")
        public String localVersion;

        public Channel(String str) {
            this.channelName = str;
        }
    }

    public static class ChannelInfo {
        @SerializedName("channel")
        private String channel;
        @SerializedName("local_version")
        private long localVersion;

        public ChannelInfo(String str, long j) {
            this.channel = str;
            this.localVersion = j;
        }
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }
}
