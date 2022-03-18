package com.ss.android.lark.larkconfig.larksetting.handler.fd;

import android.os.Build;
import com.bytedance.apm6.util.C3358h;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\r\u0010\u0019\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/fd/FDFeatureSchema;", "", "didDisable", "", "romBlackList", "", "", "minSdkVersion", "", "(ZLjava/util/List;Ljava/lang/Integer;)V", "getDidDisable", "()Z", "getMinSdkVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRomBlackList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ZLjava/util/List;Ljava/lang/Integer;)Lcom/ss/android/lark/larkconfig/larksetting/handler/fd/FDFeatureSchema;", "equals", "other", "hashCode", "isFDEnabled", "isFDEnabled$larksetting_release", "toString", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.h.b */
public final class FDFeatureSchema {
    @SerializedName("didDisable")

    /* renamed from: a */
    private final boolean f104973a;
    @SerializedName("romBlackList")

    /* renamed from: b */
    private final List<String> f104974b;
    @SerializedName("minSdkVersion")

    /* renamed from: c */
    private final Integer f104975c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FDFeatureSchema)) {
            return false;
        }
        FDFeatureSchema bVar = (FDFeatureSchema) obj;
        return this.f104973a == bVar.f104973a && Intrinsics.areEqual(this.f104974b, bVar.f104974b) && Intrinsics.areEqual(this.f104975c, bVar.f104975c);
    }

    public int hashCode() {
        boolean z = this.f104973a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<String> list = this.f104974b;
        int i5 = 0;
        int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f104975c;
        if (num != null) {
            i5 = num.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "FDFeatureSchema(didDisable=" + this.f104973a + ", romBlackList=" + this.f104974b + ", minSdkVersion=" + this.f104975c + ")";
    }

    /* renamed from: a */
    public final boolean mo148488a() {
        String a;
        if (this.f104973a) {
            return false;
        }
        Integer num = this.f104975c;
        if (num != null && Build.VERSION.SDK_INT < num.intValue()) {
            return false;
        }
        List<String> list = this.f104974b;
        if (list == null || (a = C3358h.m13969a()) == null || !list.contains(a)) {
            return true;
        }
        return false;
    }
}
