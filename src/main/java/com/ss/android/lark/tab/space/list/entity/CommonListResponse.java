package com.ss.android.lark.tab.space.list.entity;

import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J=\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "", "items", "", "totalCount", "", "hasMore", "", "requestId", "", "(Ljava/util/List;IZLjava/lang/String;)V", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "getRequestId", "()Ljava/lang/String;", "getTotalCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.entity.a */
public final class CommonListResponse<T extends BaseListViewData> {

    /* renamed from: a */
    private final List<T> f136451a;

    /* renamed from: b */
    private final int f136452b;

    /* renamed from: c */
    private final boolean f136453c;

    /* renamed from: d */
    private final String f136454d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonListResponse)) {
            return false;
        }
        CommonListResponse aVar = (CommonListResponse) obj;
        return Intrinsics.areEqual(this.f136451a, aVar.f136451a) && this.f136452b == aVar.f136452b && this.f136453c == aVar.f136453c && Intrinsics.areEqual(this.f136454d, aVar.f136454d);
    }

    public int hashCode() {
        List<T> list = this.f136451a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f136452b) * 31;
        boolean z = this.f136453c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str = this.f136454d;
        if (str != null) {
            i = str.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "CommonListResponse(items=" + this.f136451a + ", totalCount=" + this.f136452b + ", hasMore=" + this.f136453c + ", requestId=" + this.f136454d + ")";
    }

    /* renamed from: a */
    public final List<T> mo188474a() {
        return this.f136451a;
    }

    /* renamed from: b */
    public final boolean mo188475b() {
        return this.f136453c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T extends com.ss.android.lark.tab.space.list.entity.BaseListViewData> */
    /* JADX WARN: Multi-variable type inference failed */
    public CommonListResponse(List<? extends T> list, int i, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        this.f136451a = list;
        this.f136452b = i;
        this.f136453c = z;
        this.f136454d = str;
    }
}
