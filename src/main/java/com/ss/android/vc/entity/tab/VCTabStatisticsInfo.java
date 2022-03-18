package com.ss.android.vc.entity.tab;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/entity/tab/VCTabStatisticsInfo;", "", UpdateKey.STATUS, "", "statisticsUrl", "", "statisticsFileTitle", "meetingId", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMeetingId", "()Ljava/lang/String;", "getStatisticsFileTitle", "getStatisticsUrl", "getStatus", "()I", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ss/android/vc/entity/tab/VCTabStatisticsInfo;", "equals", "", "other", "hashCode", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.e */
public final class VCTabStatisticsInfo {

    /* renamed from: a */
    private final int f152820a;

    /* renamed from: b */
    private final String f152821b;

    /* renamed from: c */
    private final String f152822c;

    /* renamed from: d */
    private final String f152823d;

    /* renamed from: e */
    private final Integer f152824e;

    public VCTabStatisticsInfo() {
        this(0, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCTabStatisticsInfo)) {
            return false;
        }
        VCTabStatisticsInfo eVar = (VCTabStatisticsInfo) obj;
        return this.f152820a == eVar.f152820a && Intrinsics.areEqual(this.f152821b, eVar.f152821b) && Intrinsics.areEqual(this.f152822c, eVar.f152822c) && Intrinsics.areEqual(this.f152823d, eVar.f152823d) && Intrinsics.areEqual(this.f152824e, eVar.f152824e);
    }

    public int hashCode() {
        int i = this.f152820a * 31;
        String str = this.f152821b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f152822c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152823d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f152824e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VCTabStatisticsInfo(status=" + this.f152820a + ", statisticsUrl=" + this.f152821b + ", statisticsFileTitle=" + this.f152822c + ", meetingId=" + this.f152823d + ", version=" + this.f152824e + ")";
    }

    /* renamed from: a */
    public final int mo210433a() {
        return this.f152820a;
    }

    /* renamed from: b */
    public final String mo210434b() {
        return this.f152821b;
    }

    /* renamed from: c */
    public final String mo210435c() {
        return this.f152822c;
    }

    /* renamed from: d */
    public final String mo210436d() {
        return this.f152823d;
    }

    /* renamed from: e */
    public final Integer mo210437e() {
        return this.f152824e;
    }

    public VCTabStatisticsInfo(int i, String str, String str2, String str3, Integer num) {
        this.f152820a = i;
        this.f152821b = str;
        this.f152822c = str2;
        this.f152823d = str3;
        this.f152824e = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VCTabStatisticsInfo(int i, String str, String str2, String str3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num);
    }
}
