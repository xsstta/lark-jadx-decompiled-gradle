package com.ss.android.lark.diskmanage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/diskmanage/RemoteConfig;", "", "global", "Lcom/ss/android/lark/diskmanage/GlobalConfig;", "cacheConfig", "", "(Lcom/ss/android/lark/diskmanage/GlobalConfig;Ljava/lang/String;)V", "getCacheConfig", "()Ljava/lang/String;", "setCacheConfig", "(Ljava/lang/String;)V", "getGlobal", "()Lcom/ss/android/lark/diskmanage/GlobalConfig;", "setGlobal", "(Lcom/ss/android/lark/diskmanage/GlobalConfig;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.d */
public final class RemoteConfig {

    /* renamed from: a */
    private GlobalConfig f94609a;

    /* renamed from: b */
    private String f94610b;

    public RemoteConfig() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig dVar = (RemoteConfig) obj;
        return Intrinsics.areEqual(this.f94609a, dVar.f94609a) && Intrinsics.areEqual(this.f94610b, dVar.f94610b);
    }

    public int hashCode() {
        GlobalConfig cVar = this.f94609a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f94610b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RemoteConfig(global=" + this.f94609a + ", cacheConfig=" + this.f94610b + ")";
    }

    /* renamed from: a */
    public final GlobalConfig mo135639a() {
        return this.f94609a;
    }

    /* renamed from: b */
    public final String mo135641b() {
        return this.f94610b;
    }

    /* renamed from: a */
    public final void mo135640a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f94610b = str;
    }

    public RemoteConfig(GlobalConfig cVar, String str) {
        Intrinsics.checkParameterIsNotNull(cVar, "global");
        Intrinsics.checkParameterIsNotNull(str, "cacheConfig");
        this.f94609a = cVar;
        this.f94610b = str;
    }

    public /* synthetic */ RemoteConfig(GlobalConfig cVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        GlobalConfig cVar2;
        String str2;
        RemoteConfig dVar;
        if ((i & 1) != 0) {
            cVar2 = new GlobalConfig(0, 0, 0, 0, 0, 0, 63, null);
        } else {
            cVar2 = cVar;
        }
        if ((i & 2) != 0) {
            str2 = "";
            dVar = this;
        } else {
            dVar = this;
            str2 = str;
        }
        new RemoteConfig(cVar2, str2);
    }
}
