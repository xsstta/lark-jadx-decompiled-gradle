package com.bytedance.geckox.statistic.model;

import android.os.Build;
import com.bytedance.geckox.C14218d;
import com.google.gson.annotations.SerializedName;

public class SyncEventModel {
    @SerializedName("aid")
    private long aid;
    @SerializedName("app_version")
    private String appVersion;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("device_model")
    private String deviceModel = Build.MODEL;
    @SerializedName("os")
    private int os;
    @SerializedName("os_version")
    public String osVersion = (Build.VERSION.SDK_INT + "");
    @SerializedName("params_for_special")
    private String params = "gecko";
    @SerializedName("region")
    private String region;
    @SerializedName("sdk_version")
    private String sdkVersion = "2.4.1";
    @SerializedName("sync_stats_type")
    private int syncStatsType;
    @SerializedName("sync_task_id")
    private int syncTaskId;
    @SerializedName("sync_task_type")
    private int syncTaskType;

    public void setSyncStatsType(int i) {
        this.syncStatsType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setSyncTaskType(int i) {
        this.syncTaskType = i;
    }

    public SyncEventModel(C14218d dVar) {
        this.aid = dVar.mo52145k();
        this.appVersion = dVar.mo52149o();
        this.region = dVar.mo52147m();
        this.deviceId = dVar.mo52150p();
    }
}
