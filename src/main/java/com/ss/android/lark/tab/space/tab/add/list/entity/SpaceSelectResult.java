package com.ss.android.lark.tab.space.tab.add.list.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectResult;", "", "hasMore", "", "list", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.entity.b */
public final class SpaceSelectResult {

    /* renamed from: a */
    private final boolean f136592a;

    /* renamed from: b */
    private final List<SpaceSelectViewData> f136593b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceSelectResult)) {
            return false;
        }
        SpaceSelectResult bVar = (SpaceSelectResult) obj;
        return this.f136592a == bVar.f136592a && Intrinsics.areEqual(this.f136593b, bVar.f136593b);
    }

    public int hashCode() {
        boolean z = this.f136592a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<SpaceSelectViewData> list = this.f136593b;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SpaceSelectResult(hasMore=" + this.f136592a + ", list=" + this.f136593b + ")";
    }

    /* renamed from: a */
    public final boolean mo188668a() {
        return this.f136592a;
    }

    /* renamed from: b */
    public final List<SpaceSelectViewData> mo188669b() {
        return this.f136593b;
    }

    public SpaceSelectResult(boolean z, List<SpaceSelectViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f136592a = z;
        this.f136593b = list;
    }
}
