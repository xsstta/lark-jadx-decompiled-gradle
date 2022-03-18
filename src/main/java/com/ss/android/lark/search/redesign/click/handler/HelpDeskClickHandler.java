package com.ss.android.lark.search.redesign.click.handler;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\rH\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/HelpDeskClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "mLoginDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "getOnCallChatId", "", "onCallId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onItemClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.c */
public final class HelpDeskClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132485a = new Companion(null);

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53328n f132486b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/HelpDeskClickHandler$Companion;", "", "()V", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpDeskClickHandler(IContextProvider eVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132486b = a.mo181761j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/HelpDeskClickHandler$onItemClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatId", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.c$b */
    public static final class C53686b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ HelpDeskClickHandler f132487a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f132488b;

        /* renamed from: a */
        public void onSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f132487a.mo183085a().mo181793b(str, -1);
            } else {
                this.f132487a.mo183086a(UIHelper.getString(R.string.Lark_HelpDesk_HelpDesksfail));
            }
            Log.m165389i("LarkSearch.Search.V2.HelpDeskClickListener", "getOnCallChatId success helpDeskId: " + ((SearchHelpDeskInfo) this.f132488b).getId());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.HelpDeskClickListener", "getOnCallChatId failed: " + errorResult.getDebugMsg() + " helpDeskId: " + ((SearchHelpDeskInfo) this.f132488b).getId());
            this.f132487a.mo183086a(UIHelper.getString(R.string.Lark_HelpDesk_HelpDesksfail));
        }

        C53686b(HelpDeskClickHandler cVar, SearchBaseInfo searchBaseInfo) {
            this.f132487a = cVar;
            this.f132488b = searchBaseInfo;
        }
    }

    /* renamed from: a */
    private final void m207831a(String str, IGetDataCallback<String> iGetDataCallback) {
        ISearchModuleDependency.AbstractC53328n nVar = this.f132486b;
        Intrinsics.checkExpressionValueIsNotNull(nVar, "mLoginDependency");
        String a = nVar.mo181815a();
        if (!TextUtils.isEmpty(a)) {
            C53258a.m205939a().mo181742a(a, str, iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("login user id is empty"));
        }
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchBaseInfo instanceof SearchHelpDeskInfo) {
            m207831a(((SearchHelpDeskInfo) searchBaseInfo).getId(), new UIGetDataCallback(new C53686b(this, searchBaseInfo)));
        }
    }
}
