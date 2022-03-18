package com.ss.android.lark.search.redesign.filter;

import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.widget.searchfilter.FilterData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/ChatFilterData;", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "id", "", "(Ljava/lang/String;)V", "groupTypes", "", "Lcom/ss/android/lark/searchcommon/service/entity/ChatType;", "getGroupTypes", "()Ljava/util/List;", "memberId2AvatarMap", "Ljava/util/LinkedHashMap;", "getMemberId2AvatarMap", "()Ljava/util/LinkedHashMap;", "isUsable", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.a */
public final class ChatFilterData extends FilterData {

    /* renamed from: a */
    private final List<ChatType> f132699a = new ArrayList();

    /* renamed from: b */
    private final LinkedHashMap<String, String> f132700b = new LinkedHashMap<>();

    /* renamed from: a */
    public final List<ChatType> mo183340a() {
        return this.f132699a;
    }

    /* renamed from: b */
    public final LinkedHashMap<String, String> mo183341b() {
        return this.f132700b;
    }

    /* renamed from: c */
    public final boolean mo183342c() {
        if ((!this.f132699a.isEmpty()) || (!this.f132700b.isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFilterData(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
