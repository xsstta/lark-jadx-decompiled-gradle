package com.ss.android.lark.todo.dependency.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/dependency/entity/SearchChatterResult;", "", "key", "", "total", "", "hasMore", "", "list", "", "Lcom/ss/android/lark/todo/dependency/entity/SearchInfo;", "(Ljava/lang/String;IZLjava/util/List;)V", "getHasMore", "()Z", "getKey", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.entity.a */
public final class SearchChatterResult {

    /* renamed from: a */
    private final String f139245a;

    /* renamed from: b */
    private final int f139246b;

    /* renamed from: c */
    private final boolean f139247c;

    /* renamed from: d */
    private final List<SearchInfo> f139248d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChatterResult)) {
            return false;
        }
        SearchChatterResult aVar = (SearchChatterResult) obj;
        return Intrinsics.areEqual(this.f139245a, aVar.f139245a) && this.f139246b == aVar.f139246b && this.f139247c == aVar.f139247c && Intrinsics.areEqual(this.f139248d, aVar.f139248d);
    }

    public int hashCode() {
        String str = this.f139245a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f139246b) * 31;
        boolean z = this.f139247c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        List<SearchInfo> list = this.f139248d;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "SearchChatterResult(key=" + this.f139245a + ", total=" + this.f139246b + ", hasMore=" + this.f139247c + ", list=" + this.f139248d + ")";
    }

    /* renamed from: a */
    public final List<SearchInfo> mo191748a() {
        return this.f139248d;
    }

    public SearchChatterResult(String str, int i, boolean z, List<SearchInfo> list) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f139245a = str;
        this.f139246b = i;
        this.f139247c = z;
        this.f139248d = list;
    }
}
