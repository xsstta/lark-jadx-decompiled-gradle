package com.ss.android.lark.search.redesign.filter;

import com.ss.android.lark.widget.searchfilter.FilterData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/DocMyOwnFilterData;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "myOwnDoc", "", "getMyOwnDoc", "()Z", "setMyOwnDoc", "(Z)V", "isUsable", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.e */
public final class DocMyOwnFilterData extends FilterData {

    /* renamed from: a */
    private boolean f132705a;

    /* renamed from: b */
    public final boolean mo183354b() {
        return this.f132705a;
    }

    /* renamed from: a */
    public final boolean mo183353a() {
        return this.f132705a;
    }

    /* renamed from: a */
    public final void mo183352a(boolean z) {
        this.f132705a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocMyOwnFilterData(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
