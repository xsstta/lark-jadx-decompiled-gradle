package com.ss.android.lark.opmonitor.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u000eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR \u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ss/android/lark/opmonitor/config/TraceConfig;", "Lcom/ss/android/lark/opmonitor/config/IMonitorFilter;", "()V", "batchBlackListEnabled", "", "getBatchBlackListEnabled", "()Z", "setBatchBlackListEnabled", "(Z)V", "batchWhiteListEnabled", "getBatchWhiteListEnabled", "setBatchWhiteListEnabled", "bizBlackList", "", "", "getBizBlackList", "()Ljava/util/List;", "setBizBlackList", "(Ljava/util/List;)V", "blackFilter", "Lcom/ss/android/lark/opmonitor/config/TraceFilter;", "getBlackFilter", "()Lcom/ss/android/lark/opmonitor/config/TraceFilter;", "setBlackFilter", "(Lcom/ss/android/lark/opmonitor/config/TraceFilter;)V", "logEnabled", "getLogEnabled", "setLogEnabled", "reportEnabled", "getReportEnabled", "setReportEnabled", "whiteFilter", "getWhiteFilter", "setWhiteFilter", "filter", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "isInBizBlackList", "bizName", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.config.g */
public final class TraceConfig {
    @SerializedName("logEnabled")
    @Expose

    /* renamed from: a */
    private boolean f122874a;
    @SerializedName("reportEnabled")
    @Expose

    /* renamed from: b */
    private boolean f122875b;
    @SerializedName("batchBlackListEnabled")
    @Expose

    /* renamed from: c */
    private boolean f122876c;
    @SerializedName("batchWhiteListEnabled")
    @Expose

    /* renamed from: d */
    private boolean f122877d;
    @SerializedName("bizBlackList")
    @Expose

    /* renamed from: e */
    private List<String> f122878e = new ArrayList();
    @SerializedName("batchBlackList")
    @Expose

    /* renamed from: f */
    private TraceFilter f122879f;
    @SerializedName("batchWhiteList")
    @Expose

    /* renamed from: g */
    private TraceFilter f122880g;

    /* renamed from: a */
    public final boolean mo170776a() {
        return this.f122874a;
    }

    /* renamed from: b */
    public final boolean mo170779b() {
        return this.f122875b;
    }

    /* renamed from: a */
    public final boolean mo170778a(String str) {
        if (str != null) {
            return this.f122878e.contains(str);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo170777a(OPMonitor oPMonitor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        if (!this.f122875b) {
            return false;
        }
        boolean z2 = this.f122876c;
        if (!z2 && !this.f122877d) {
            return true;
        }
        if (z2) {
            TraceFilter hVar = this.f122879f;
            if (hVar != null) {
                z = hVar.mo170780a(oPMonitor);
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        if (!this.f122877d) {
            return true;
        }
        TraceFilter hVar2 = this.f122880g;
        if (hVar2 != null) {
            return hVar2.mo170780a(oPMonitor);
        }
        return false;
    }
}
