package com.tt.refer.impl.business.file.log;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00062"}, d2 = {"Lcom/tt/refer/impl/business/file/log/LogItem;", "", "path", "", "ttfilePath", "size", "", "createTime", "modifyTime", "userId", "tenantId", "appId", "appType", "tag", "primitiveApi", "timestamp", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAppId", "()Ljava/lang/String;", "getAppType", "getCreateTime", "()J", "getModifyTime", "getPath", "getPrimitiveApi", "getSize", "getTag", "getTenantId", "getTimestamp", "getTtfilePath", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.log.b */
public final class LogItem {

    /* renamed from: a */
    private final String f171139a;

    /* renamed from: b */
    private final String f171140b;

    /* renamed from: c */
    private final long f171141c;

    /* renamed from: d */
    private final long f171142d;

    /* renamed from: e */
    private final long f171143e;

    /* renamed from: f */
    private final String f171144f;

    /* renamed from: g */
    private final String f171145g;

    /* renamed from: h */
    private final String f171146h;

    /* renamed from: i */
    private final String f171147i;

    /* renamed from: j */
    private final String f171148j;

    /* renamed from: k */
    private final String f171149k;

    /* renamed from: l */
    private final long f171150l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogItem)) {
            return false;
        }
        LogItem bVar = (LogItem) obj;
        return Intrinsics.areEqual(this.f171139a, bVar.f171139a) && Intrinsics.areEqual(this.f171140b, bVar.f171140b) && this.f171141c == bVar.f171141c && this.f171142d == bVar.f171142d && this.f171143e == bVar.f171143e && Intrinsics.areEqual(this.f171144f, bVar.f171144f) && Intrinsics.areEqual(this.f171145g, bVar.f171145g) && Intrinsics.areEqual(this.f171146h, bVar.f171146h) && Intrinsics.areEqual(this.f171147i, bVar.f171147i) && Intrinsics.areEqual(this.f171148j, bVar.f171148j) && Intrinsics.areEqual(this.f171149k, bVar.f171149k) && this.f171150l == bVar.f171150l;
    }

    public int hashCode() {
        String str = this.f171139a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f171140b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f171141c;
        long j2 = this.f171142d;
        long j3 = this.f171143e;
        int i2 = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str3 = this.f171144f;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f171145g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f171146h;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f171147i;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f171148j;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f171149k;
        if (str8 != null) {
            i = str8.hashCode();
        }
        long j4 = this.f171150l;
        return ((hashCode7 + i) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "LogItem(path=" + this.f171139a + ", ttfilePath=" + this.f171140b + ", size=" + this.f171141c + ", createTime=" + this.f171142d + ", modifyTime=" + this.f171143e + ", userId=" + this.f171144f + ", tenantId=" + this.f171145g + ", appId=" + this.f171146h + ", appType=" + this.f171147i + ", tag=" + this.f171148j + ", primitiveApi=" + this.f171149k + ", timestamp=" + this.f171150l + ")";
    }

    /* renamed from: a */
    public final String mo235696a() {
        return this.f171139a;
    }

    /* renamed from: b */
    public final String mo235697b() {
        return this.f171140b;
    }

    /* renamed from: c */
    public final String mo235698c() {
        return this.f171144f;
    }

    /* renamed from: d */
    public final String mo235699d() {
        return this.f171145g;
    }

    /* renamed from: e */
    public final String mo235700e() {
        return this.f171146h;
    }

    /* renamed from: f */
    public final String mo235702f() {
        return this.f171147i;
    }

    /* renamed from: g */
    public final String mo235703g() {
        return this.f171148j;
    }

    /* renamed from: h */
    public final String mo235704h() {
        return this.f171149k;
    }

    /* renamed from: i */
    public final long mo235706i() {
        return this.f171150l;
    }

    public LogItem(String str, String str2, long j, long j2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j4) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str2, "ttfilePath");
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        Intrinsics.checkParameterIsNotNull(str4, "tenantId");
        Intrinsics.checkParameterIsNotNull(str5, "appId");
        Intrinsics.checkParameterIsNotNull(str6, "appType");
        Intrinsics.checkParameterIsNotNull(str7, "tag");
        Intrinsics.checkParameterIsNotNull(str8, "primitiveApi");
        this.f171139a = str;
        this.f171140b = str2;
        this.f171141c = j;
        this.f171142d = j2;
        this.f171143e = j3;
        this.f171144f = str3;
        this.f171145g = str4;
        this.f171146h = str5;
        this.f171147i = str6;
        this.f171148j = str7;
        this.f171149k = str8;
        this.f171150l = j4;
    }
}
