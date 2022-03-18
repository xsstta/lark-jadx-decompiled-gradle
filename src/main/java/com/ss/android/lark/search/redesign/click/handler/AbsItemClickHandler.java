package com.ss.android.lark.search.redesign.click.handler;

import android.app.Activity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "getContextProvider", "()Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "mChatDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IChatDependency;", "getMChatDependency", "()Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IChatDependency;", "mFeedDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IFeedDependency;", "getMFeedDependency", "()Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IFeedDependency;", "peakFeedCard", "", "feedId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/searchcommon/constant/SearchCommonConstants$FeedType;", "showToast", "string", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.a */
public abstract class AbsItemClickHandler implements SearchResultViewAdapter.IOnItemClickHandler {

    /* renamed from: a */
    private final ISearchModuleDependency.AbstractC53324j f132468a;

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53317e f132469b;

    /* renamed from: c */
    private final IContextProvider f132470c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ISearchModuleDependency.AbstractC53317e mo183085a() {
        return this.f132469b;
    }

    /* renamed from: b */
    public final IContextProvider mo183088b() {
        return this.f132470c;
    }

    /* renamed from: a */
    public final void mo183086a(String str) {
        IContextProvider eVar;
        Activity C;
        if (str != null && (eVar = this.f132470c) != null && (C = eVar.mo183099C()) != null) {
            LKUIToast.show(C, str);
        }
    }

    public AbsItemClickHandler(IContextProvider eVar) {
        this.f132470c = eVar;
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        ISearchModuleDependency.AbstractC53324j i = a.mo181760i();
        Intrinsics.checkExpressionValueIsNotNull(i, "SearchModule.getDependency().feedDependency");
        this.f132468a = i;
        ISearchModuleDependency a2 = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
        ISearchModuleDependency.AbstractC53317e f = a2.mo181756f();
        Intrinsics.checkExpressionValueIsNotNull(f, "SearchModule.getDependency().chatDependency");
        this.f132469b = f;
    }

    /* renamed from: a */
    public final void mo183087a(String str, SearchCommonConstants.FeedType feedType) {
        this.f132468a.mo181814a(str, feedType);
    }
}
