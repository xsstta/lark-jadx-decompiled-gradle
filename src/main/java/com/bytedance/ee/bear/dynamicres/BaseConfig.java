package com.bytedance.ee.bear.dynamicres;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/dynamicres/BaseConfig;", "", "context", "Landroid/content/Context;", "appId", "", "deviceId", "", "domain", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "getAppId", "()I", "getContext", "()Landroid/content/Context;", "getDeviceId", "()Ljava/lang/String;", "getDomain", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "dynamic-resource_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.dynamicres.a */
public final class BaseConfig {

    /* renamed from: a */
    private final Context f20595a;

    /* renamed from: b */
    private final int f20596b;

    /* renamed from: c */
    private final String f20597c;

    /* renamed from: d */
    private final String f20598d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BaseConfig) {
                BaseConfig aVar = (BaseConfig) obj;
                if (Intrinsics.areEqual(this.f20595a, aVar.f20595a)) {
                    if (!(this.f20596b == aVar.f20596b) || !Intrinsics.areEqual(this.f20597c, aVar.f20597c) || !Intrinsics.areEqual(this.f20598d, aVar.f20598d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Context context = this.f20595a;
        int i = 0;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + this.f20596b) * 31;
        String str = this.f20597c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20598d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "BaseConfig(context=" + this.f20595a + ", appId=" + this.f20596b + ", deviceId=" + this.f20597c + ", domain=" + this.f20598d + ")";
    }

    /* renamed from: a */
    public final Context mo29835a() {
        return this.f20595a;
    }

    /* renamed from: b */
    public final int mo29836b() {
        return this.f20596b;
    }

    /* renamed from: c */
    public final String mo29837c() {
        return this.f20597c;
    }

    /* renamed from: d */
    public final String mo29838d() {
        return this.f20598d;
    }

    public BaseConfig(Context context, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "deviceId");
        Intrinsics.checkParameterIsNotNull(str2, "domain");
        this.f20595a = context;
        this.f20596b = i;
        this.f20597c = str;
        this.f20598d = str2;
    }
}
