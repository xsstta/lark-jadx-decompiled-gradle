package com.ss.android.lark.search.redesign.filter;

import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/MessageChatterFilter;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "chatterId2AvatarMap", "Ljava/util/LinkedHashMap;", "getChatterId2AvatarMap", "()Ljava/util/LinkedHashMap;", "isUsable", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.k */
public final class MessageChatterFilter extends FilterData {

    /* renamed from: a */
    private final LinkedHashMap<String, String> f132712a = new LinkedHashMap<>();

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo183369a() {
        return this.f132712a;
    }

    /* renamed from: b */
    public final boolean mo183370b() {
        return !this.f132712a.isEmpty();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageChatterFilter(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
