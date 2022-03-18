package com.ss.android.lark.biz.im.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/biz/im/api/ShareAppCardLink;", "", "href", "", "androidHref", "iOSHref", "pcHref", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidHref", "()Ljava/lang/String;", "setAndroidHref", "(Ljava/lang/String;)V", "getHref", "setHref", "getIOSHref", "setIOSHref", "getPcHref", "setPcHref", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.ab */
public final class ShareAppCardLink {

    /* renamed from: a */
    private String f74166a;

    /* renamed from: b */
    private String f74167b;

    /* renamed from: c */
    private String f74168c;

    /* renamed from: d */
    private String f74169d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareAppCardLink)) {
            return false;
        }
        ShareAppCardLink abVar = (ShareAppCardLink) obj;
        return Intrinsics.areEqual(this.f74166a, abVar.f74166a) && Intrinsics.areEqual(this.f74167b, abVar.f74167b) && Intrinsics.areEqual(this.f74168c, abVar.f74168c) && Intrinsics.areEqual(this.f74169d, abVar.f74169d);
    }

    public int hashCode() {
        String str = this.f74166a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74167b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f74168c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f74169d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ShareAppCardLink(href=" + this.f74166a + ", androidHref=" + this.f74167b + ", iOSHref=" + this.f74168c + ", pcHref=" + this.f74169d + ")";
    }

    /* renamed from: a */
    public final String mo106649a() {
        return this.f74166a;
    }

    /* renamed from: b */
    public final String mo106650b() {
        return this.f74167b;
    }

    /* renamed from: c */
    public final String mo106651c() {
        return this.f74168c;
    }

    /* renamed from: d */
    public final String mo106652d() {
        return this.f74169d;
    }

    public ShareAppCardLink(String str, String str2, String str3, String str4) {
        this.f74166a = str;
        this.f74167b = str2;
        this.f74168c = str3;
        this.f74169d = str4;
    }
}
