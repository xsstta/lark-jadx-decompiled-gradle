package com.bytedance.ies.bullet.service.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "", "channel", "", "bundlePath", "valid", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBundlePath", "()Ljava/lang/String;", "setBundlePath", "(Ljava/lang/String;)V", "getChannel", "setChannel", "getValid", "()Z", "setValid", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "provideChannel", "providerBundlePath", "toString", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a */
public final class ChannelBundleModel {

    /* renamed from: a */
    private String f37841a;

    /* renamed from: b */
    private String f37842b;

    /* renamed from: c */
    private boolean f37843c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBundleModel)) {
            return false;
        }
        ChannelBundleModel aVar = (ChannelBundleModel) obj;
        return Intrinsics.areEqual(this.f37841a, aVar.f37841a) && Intrinsics.areEqual(this.f37842b, aVar.f37842b) && this.f37843c == aVar.f37843c;
    }

    public int hashCode() {
        String str = this.f37841a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37842b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f37843c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "ChannelBundleModel(channel=" + this.f37841a + ", bundlePath=" + this.f37842b + ", valid=" + this.f37843c + ")";
    }

    /* renamed from: c */
    public final boolean mo52625c() {
        return this.f37843c;
    }

    /* renamed from: a */
    public final String mo52620a() {
        if (this.f37843c) {
            return this.f37841a;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo52623b() {
        if (this.f37843c) {
            return this.f37842b;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo52622a(boolean z) {
        this.f37843c = z;
    }

    /* renamed from: a */
    public final void mo52621a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37841a = str;
    }

    /* renamed from: b */
    public final void mo52624b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37842b = str;
    }

    public ChannelBundleModel(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Intrinsics.checkParameterIsNotNull(str2, "bundlePath");
        this.f37841a = str;
        this.f37842b = str2;
        this.f37843c = z;
    }
}
