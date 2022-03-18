package com.larksuite.component.blockit.hashtag.list;

import com.larksuite.component.blockit.hashtag.HashTagViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/InitData;", "", "hashTagList", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "(Ljava/util/List;)V", "getHashTagList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.h */
public final class InitData {

    /* renamed from: a */
    private final List<HashTagViewData> f59624a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InitData) && Intrinsics.areEqual(this.f59624a, ((InitData) obj).f59624a);
        }
        return true;
    }

    public int hashCode() {
        List<HashTagViewData> list = this.f59624a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "InitData(hashTagList=" + this.f59624a + ")";
    }

    /* renamed from: a */
    public final List<HashTagViewData> mo86543a() {
        return this.f59624a;
    }

    public InitData(List<HashTagViewData> list) {
        this.f59624a = list;
    }
}
