package com.ss.android.lark.readstate.impl.detail.vo;

import com.ss.android.lark.readstate.impl.detail.C53123f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/readstate/impl/detail/vo/SearchReadStateResult;", "", "key", "", "readList", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "(Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getReadList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.detail.a.a */
public final class SearchReadStateResult {

    /* renamed from: a */
    private final String f131347a;

    /* renamed from: b */
    private final List<C53123f> f131348b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchReadStateResult)) {
            return false;
        }
        SearchReadStateResult aVar = (SearchReadStateResult) obj;
        return Intrinsics.areEqual(this.f131347a, aVar.f131347a) && Intrinsics.areEqual(this.f131348b, aVar.f131348b);
    }

    public int hashCode() {
        String str = this.f131347a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C53123f> list = this.f131348b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SearchReadStateResult(key=" + this.f131347a + ", readList=" + this.f131348b + ")";
    }

    /* renamed from: a */
    public final List<C53123f> mo181420a() {
        return this.f131348b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.readstate.impl.detail.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchReadStateResult(String str, List<? extends C53123f> list) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(list, "readList");
        this.f131347a = str;
        this.f131348b = list;
    }
}
