package com.ss.android.lark.search.impl.func.chatinside.statistics;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/statistics/ChatInsideSearchStatistics;", "", "()V", "mChatInsideSearchPageArray", "Landroid/util/SparseArray;", "", "initChatInsideSearchPageArray", "", "sendSearchChatHistoryEvent", "resultType", "", "request", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatinside.c.a */
public final class ChatInsideSearchStatistics {

    /* renamed from: a */
    public static final Companion f132017a = new Companion(null);

    /* renamed from: b */
    private final SparseArray<String> f132018b = new SparseArray<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/statistics/ChatInsideSearchStatistics$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChatInsideSearchStatistics() {
        m206841a();
    }

    /* renamed from: a */
    private final void m206841a() {
        this.f132018b.put(3, "message");
        this.f132018b.put(6, "doc");
        this.f132018b.put(10000001, "file");
        this.f132018b.put(13, "link");
    }

    /* renamed from: a */
    public final void mo182444a(int i, String str) {
        String str2 = this.f132018b.get(i);
        if (TextUtils.isEmpty(str2)) {
            Log.m165383e("LarkSearch.Search.ChatInsideSearchStatistics", "result type is unknown");
            return;
        }
        SearchHitPoint.Companion aVar = SearchHitPoint.f131886a;
        Intrinsics.checkExpressionValueIsNotNull(str2, "page");
        aVar.mo182014a(str2, str);
    }
}
