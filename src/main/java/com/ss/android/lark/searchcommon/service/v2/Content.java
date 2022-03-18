package com.ss.android.lark.searchcommon.service.v2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/Content;", "", "content", "", "start", "", "(Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getStart", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a */
public final class Content {

    /* renamed from: a */
    private final String f133209a;

    /* renamed from: b */
    private final int f133210b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content aVar = (Content) obj;
        return Intrinsics.areEqual(this.f133209a, aVar.f133209a) && this.f133210b == aVar.f133210b;
    }

    public int hashCode() {
        String str = this.f133209a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f133210b;
    }

    public String toString() {
        return "Content(content=" + this.f133209a + ", start=" + this.f133210b + ")";
    }

    /* renamed from: a */
    public final String mo184316a() {
        return this.f133209a;
    }

    /* renamed from: b */
    public final int mo184317b() {
        return this.f133210b;
    }

    public Content(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f133209a = str;
        this.f133210b = i;
    }
}
