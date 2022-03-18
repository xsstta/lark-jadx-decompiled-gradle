package com.ss.android.lark.search.redesign.filter;

import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/DocInChatFilterData;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "chatIds", "", "getChatIds", "()Ljava/util/List;", "id2AvatarMap", "Ljava/util/LinkedHashMap;", "getId2AvatarMap", "()Ljava/util/LinkedHashMap;", "clear", "", "isUsable", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.d */
public final class DocInChatFilterData extends FilterData {

    /* renamed from: a */
    private final LinkedHashMap<String, String> f132703a = new LinkedHashMap<>();

    /* renamed from: b */
    private final List<String> f132704b = new ArrayList();

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo183348a() {
        return this.f132703a;
    }

    /* renamed from: b */
    public final List<String> mo183349b() {
        return this.f132704b;
    }

    /* renamed from: c */
    public final boolean mo183350c() {
        return !this.f132703a.isEmpty();
    }

    /* renamed from: d */
    public final void mo183351d() {
        this.f132703a.clear();
        this.f132704b.clear();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocInChatFilterData(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
