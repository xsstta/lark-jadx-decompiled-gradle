package com.bytedance.geckox.statistic.model;

import com.bytedance.geckox.model.Common;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class StatisticModel {
    @SerializedName("common")
    public Common common;
    @SerializedName("packages")
    public List<PackageStatisticModel> packages = new ArrayList();

    public static class PackageStatisticModel {
        @SerializedName("ac")
        public String ac;
        @SerializedName("access_key")
        public String accessKey;
        @SerializedName("active_check_duration")
        public Long activeCheckDuration;
        @SerializedName("api_version")
        public String apiVersion;
        @SerializedName("apply_duration")
        public Long applyDuration;
        @SerializedName("channel")
        public String channel;
        @SerializedName("clean_duration")
        public Long cleanDuration;
        @SerializedName("clean_strategy")
        public Integer cleanStrategy;
        @SerializedName("clean_type")
        public Integer cleanType;
        @SerializedName("download_duration")
        public Long downloadDuration;
        @SerializedName("download_fail_records")
        public List<DownloadFailRecords> downloadFailRecords;
        @SerializedName("download_retry_times")
        public Integer downloadRetryTimes;
        @SerializedName("download_url")
        public String downloadUrl;
        @SerializedName("err_code")
        public String errCode;
        @SerializedName("err_msg")
        public String errMsg;
        @SerializedName("expire_age")
        public Integer expireAge;
        @SerializedName("group_name")
        public String groupName;
        @SerializedName("id")
        public Long id;
        @SerializedName("log_id")
        public String logId;
        @SerializedName("patch_id")
        public Long patchId;
        @SerializedName("req_type")
        public int reqType;
        @SerializedName("stats_type")
        public Integer statsType;
        @SerializedName("sync_task_id")
        public int syncTaskId;
        @SerializedName("total_duration")
        public Long totalDuration;
        @SerializedName("update_priority")
        public int updatePriority;

        public PackageStatisticModel() {
        }

        public static class DownloadFailRecords {
            @SerializedName("domain")
            public String domain;
            @SerializedName("duration")
            public Long duration;
            @SerializedName("reason")
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }

            public DownloadFailRecords(String str, String str2, Long l) {
                this.domain = str;
                this.reason = str2;
                this.duration = l;
            }
        }

        public PackageStatisticModel(String str, String str2, Long l, Integer num, Integer num2) {
            this.accessKey = str;
            this.channel = str2;
            this.cleanDuration = l;
            this.statsType = num;
            this.expireAge = num2;
        }

        public PackageStatisticModel(String str, String str2, Integer num, Integer num2, Long l, String str3, String str4, Long l2, Integer num3, int i) {
            this.channel = str2;
            this.accessKey = str;
            this.cleanType = num;
            this.cleanStrategy = num3;
            this.cleanDuration = l2;
            this.statsType = num2;
            this.errCode = str3;
            this.errMsg = str4;
            this.id = l;
            this.reqType = i;
        }
    }
}
