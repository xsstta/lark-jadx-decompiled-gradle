package com.ss.android.lark.biz.im.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/biz/im/api/TopicGroupsResponse;", "", "groupList", "", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "nextCursor", "", "(Ljava/util/List;Ljava/lang/String;)V", "getGroupList", "()Ljava/util/List;", "setGroupList", "(Ljava/util/List;)V", "getNextCursor", "()Ljava/lang/String;", "setNextCursor", "(Ljava/lang/String;)V", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.ag */
public final class TopicGroupsResponse {

    /* renamed from: a */
    private List<C29607af> f74210a;

    /* renamed from: b */
    private String f74211b;

    public TopicGroupsResponse() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final List<C29607af> mo106685a() {
        return this.f74210a;
    }

    /* renamed from: b */
    public final String mo106688b() {
        return this.f74211b;
    }

    /* renamed from: a */
    public final void mo106686a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74211b = str;
    }

    /* renamed from: a */
    public final void mo106687a(List<C29607af> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f74210a = list;
    }

    public TopicGroupsResponse(List<C29607af> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "groupList");
        Intrinsics.checkParameterIsNotNull(str, "nextCursor");
        this.f74210a = list;
        this.f74211b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopicGroupsResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
    }
}
