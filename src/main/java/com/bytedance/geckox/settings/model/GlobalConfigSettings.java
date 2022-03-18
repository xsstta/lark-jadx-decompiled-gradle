package com.bytedance.geckox.settings.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;

public class GlobalConfigSettings {
    @SerializedName("settings_config")
    private GlobalConfig globalConfig;
    @SerializedName("req_meta")
    private ReqMeta reqMeta;
    @SerializedName("resource_meta")
    private ResourceMeta resourceMeta;
    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)
    private int version;

    public static class AccessKeyMetaInfo {
        @SerializedName("channels")
        private Map<String, ChannelMetaInfo> channels;
        @SerializedName("config")
        private CurrentLevelConfig config;

        public Map<String, ChannelMetaInfo> getChannels() {
            return this.channels;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CDNFallBackConfig {
        @SerializedName("domains")
        private List<String> domains;
        @SerializedName("max_attempts")
        private int maxAttempts;
        @SerializedName("shuffle")
        private int shuffle;

        public List<String> getDomains() {
            return this.domains;
        }

        public int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int getShuffle() {
            return this.shuffle;
        }
    }

    public static class ChannelMetaInfo {
        @SerializedName("config")
        private CurrentLevelConfig config;

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CurrentLevelConfig {
        @SerializedName("cdn_fallback")
        private CDNFallBackConfig cdnFallback;
        @SerializedName("pipeline")
        private List<PipelineStep> pipeline;
        @SerializedName("prefix_2_ak")
        private Map<String, String> prefix2AccessKey;

        public CDNFallBackConfig getCdnFallback() {
            return this.cdnFallback;
        }

        public List<PipelineStep> getPipeline() {
            return this.pipeline;
        }

        public Map<String, String> getPrefix2AccessKey() {
            return this.prefix2AccessKey;
        }
    }

    public static class GeckoPollingConfig {
        @SerializedName("combine")
        private List<SyncItem> combine;
        @SerializedName("interval")
        private int interval;

        public List<SyncItem> getCombine() {
            return this.combine;
        }

        public int getInterval() {
            return this.interval;
        }
    }

    public static class GlobalConfig {
        @SerializedName("check_update")
        private SettingsPollingConfig checkUpdate;
        @SerializedName("host_app_id")
        private List<String> hostAppId;
        @SerializedName("poll_enable")
        private int pollEnable;

        public SettingsPollingConfig getCheckUpdate() {
            return this.checkUpdate;
        }

        public List<String> getHostAppId() {
            return this.hostAppId;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }
    }

    public static class LazyItem {
        @SerializedName("channels")
        private List<String> channels;
        @SerializedName("groups")
        private List<String> groups;

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }
    }

    public static class PipelineStep {
        @SerializedName("no_cache")
        private int noCache;
        @SerializedName(ShareHitPoint.f121869d)
        private int type;
        @SerializedName("update")
        private int update;

        public int getNoCache() {
            return this.noCache;
        }

        public int getType() {
            return this.type;
        }

        public int getUpdate() {
            return this.update;
        }
    }

    public enum PipelineType {
        GECKO(1),
        CDN(2),
        BUILTIN(3);
        
        private int val;

        public int getVal() {
            return this.val;
        }

        private PipelineType(int i) {
            this.val = i;
        }
    }

    public static class ReqMeta {
        @SerializedName("aks")
        private List<String> aks;
        @SerializedName("check_update")
        private Map<String, GeckoPollingConfig> checkUpdate;
        @SerializedName("enable")
        private int enable;
        @SerializedName("fre_control_enable")
        private int freControlEnable;
        @SerializedName("lazy")
        private Map<String, LazyItem> lazy;
        @SerializedName("poll_enable")
        private int pollEnable;
        @SerializedName("queue")
        private List<RequestConfig> queue;

        public List<String> getAks() {
            return this.aks;
        }

        public Map<String, GeckoPollingConfig> getCheckUpdate() {
            return this.checkUpdate;
        }

        public int getEnable() {
            return this.enable;
        }

        public int getFreControlEnable() {
            return this.freControlEnable;
        }

        public Map<String, LazyItem> getLazy() {
            return this.lazy;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }

        public List<RequestConfig> getQueue() {
            return this.queue;
        }
    }

    public static class RequestConfig {
        @SerializedName("delay")
        private long delay;
        @SerializedName("sync")
        private List<SyncItem> sync;

        public long getDelay() {
            return this.delay;
        }

        public List<SyncItem> getSync() {
            return this.sync;
        }
    }

    public static class ResourceMeta {
        @SerializedName("access_keys")
        private Map<String, AccessKeyMetaInfo> accessKeys;
        @SerializedName("config")
        private CurrentLevelConfig config;

        public Map<String, AccessKeyMetaInfo> getAccessKeys() {
            return this.accessKeys;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class SettingsPollingConfig {
        @SerializedName("interval")
        private long interval;

        public long getInterval() {
            return this.interval;
        }
    }

    public static class SyncItem {
        @SerializedName("ak")
        private String ak;
        @SerializedName("group")
        private List<String> group;
        @SerializedName("target")
        private List<String> target;

        public SyncItem() {
        }

        public String getAccessKey() {
            return this.ak;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getTarget() {
            return this.target;
        }

        public SyncItem(String str, List<String> list, List<String> list2) {
            this.ak = str;
            this.group = list;
            this.target = list2;
        }
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public ReqMeta getReqMeta() {
        return this.reqMeta;
    }

    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public int getVersion() {
        return this.version;
    }
}
