package com.ss.android.lark.search.impl.func.chatinside.entity;

import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/entity/ChatInsideSearchData;", "", "chatId", "", "searchType", "", "(Ljava/lang/String;I)V", "getChatId", "()Ljava/lang/String;", "items", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "loadMore", "", "getLoadMore", "()Z", "setLoadMore", "(Z)V", "pageToken", "getPageToken", "setPageToken", "(Ljava/lang/String;)V", "refresh", "getRefresh", "setRefresh", "searchKey", "getSearchKey", "setSearchKey", "getSearchType", "()I", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatinside.entity.b */
public final class ChatInsideSearchData {

    /* renamed from: a */
    private String f132223a = "";

    /* renamed from: b */
    private List<? extends SearchBaseInfo> f132224b = new ArrayList();

    /* renamed from: c */
    private boolean f132225c;

    /* renamed from: d */
    private boolean f132226d;

    /* renamed from: e */
    private String f132227e = "";

    /* renamed from: f */
    private final String f132228f;

    /* renamed from: g */
    private final int f132229g;

    /* renamed from: a */
    public final String mo182741a() {
        return this.f132223a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo>, java.util.List<com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo> */
    /* renamed from: b */
    public final List<SearchBaseInfo> mo182745b() {
        return this.f132224b;
    }

    /* renamed from: c */
    public final boolean mo182748c() {
        return this.f132225c;
    }

    /* renamed from: d */
    public final boolean mo182749d() {
        return this.f132226d;
    }

    /* renamed from: e */
    public final String mo182750e() {
        return this.f132227e;
    }

    /* renamed from: f */
    public final String mo182751f() {
        return this.f132228f;
    }

    /* renamed from: g */
    public final int mo182752g() {
        return this.f132229g;
    }

    /* renamed from: a */
    public final void mo182742a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f132223a = str;
    }

    /* renamed from: b */
    public final void mo182746b(String str) {
        this.f132227e = str;
    }

    /* renamed from: a */
    public final void mo182743a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f132224b = list;
    }

    /* renamed from: b */
    public final void mo182747b(boolean z) {
        this.f132226d = z;
    }

    /* renamed from: a */
    public final void mo182744a(boolean z) {
        this.f132225c = z;
    }

    public ChatInsideSearchData(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f132228f = str;
        this.f132229g = i;
    }
}
