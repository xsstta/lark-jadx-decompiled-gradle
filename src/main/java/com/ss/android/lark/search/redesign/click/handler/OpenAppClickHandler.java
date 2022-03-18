package com.ss.android.lark.search.redesign.click.handler;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.entity.viewdata.SearchOpenAppViewData;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/OpenAppClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "mBrowserDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IBrowserDependency;", "kotlin.jvm.PlatformType", "onAppCanOpenOnPC", "", "onAppCannotOpen", "onItemClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "openApp", "abilityType", "appBusinessStr", "", "openBotChat", BottomDialog.f17198f, "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.h */
public final class OpenAppClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132492a = new Companion(null);

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53315c f132493b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/OpenAppClickHandler$Companion;", "", "()V", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final void m207843c() {
        mo183086a(UIHelper.getString(R.string.Lark_Search_EnterChatFailedError));
    }

    /* renamed from: d */
    private final void m207844d() {
        mo183086a(UIHelper.getString(R.string.Lark_Search_AppUnavailableInMobile));
    }

    /* renamed from: b */
    private final void m207842b(String str) {
        mo183085a().mo181794b(str, new C53688b(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/OpenAppClickHandler$openBotChat$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.h$b */
    public static final class C53688b implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ OpenAppClickHandler f132494a;

        /* renamed from: b */
        final /* synthetic */ String f132495b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            Log.m165383e("LarkSearch.Search.V2.OpenAppClickListener", "getP2pChatByChatterId failed: " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (C53258a.m205939a().mo181745a("lark.feed.openapp.v2")) {
                C53258a.m205939a().mo181748b(this.f132495b, true);
                return;
            }
            this.f132494a.mo183087a(chat.getId(), SearchCommonConstants.FeedType.CHAT);
            this.f132494a.mo183085a().mo181799c(this.f132495b);
        }

        C53688b(OpenAppClickHandler hVar, String str) {
            this.f132494a = hVar;
            this.f132495b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAppClickHandler(IContextProvider eVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132493b = a.mo181754e();
    }

    /* renamed from: a */
    private final void m207841a(int i, String str) {
        Activity C;
        IContextProvider b = mo183088b();
        if (b != null && (C = b.mo183099C()) != null) {
            if (i == 1) {
                m207842b(str);
            } else if (i == 2) {
                this.f132493b.mo181776c(C, str);
            } else if (i != 3) {
                C53241h.m205894a("LarkSearch.Search.V2.OpenAppClickListener", "openApp failed: abilityType is unknown");
            } else {
                C53258a.m205939a().mo181746b(C, str);
            }
        }
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Activity C;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IContextProvider b = mo183088b();
        if (!(b == null || (C = b.mo183099C()) == null || !(searchBaseInfo instanceof SearchOpenAppInfo))) {
            SearchOpenAppInfo searchOpenAppInfo = (SearchOpenAppInfo) searchBaseInfo;
            if (!searchOpenAppInfo.isAvailable()) {
                Activity activity = C;
                if (C53258a.m205939a().mo181755e(activity, searchOpenAppInfo.getAppStoreUrl())) {
                    C53258a.m205939a().mo181757f(activity, searchOpenAppInfo.getAppStoreUrl());
                    return;
                }
                C53241h.m205894a("LarkSearch.Search.V2.OpenAppClickListener", "appLink err: " + searchOpenAppInfo.getAppStoreUrl());
                m207843c();
                return;
            }
            HashMap hashMap = new HashMap();
            for (SearchOpenAppInfo.SearchOpenAppAbility searchOpenAppAbility : searchOpenAppInfo.getAbilities()) {
                Intrinsics.checkExpressionValueIsNotNull(searchOpenAppAbility, "ability");
                hashMap.put(Integer.valueOf(searchOpenAppAbility.getType()), new SearchOpenAppViewData.OpenAppAbilityViewData(searchOpenAppAbility.getType(), searchOpenAppAbility.getRequiredInfo()));
            }
            if (hashMap.isEmpty()) {
                C53241h.m205894a("LarkSearch.Search.V2.OpenAppClickListener", "handleClick failed: abilityArray is empty.");
                m207843c();
                return;
            }
            SearchOpenAppViewData.OpenAppAbilityViewData openAppAbilityViewData = (SearchOpenAppViewData.OpenAppAbilityViewData) hashMap.get(3);
            if (openAppAbilityViewData == null || TextUtils.isEmpty(openAppAbilityViewData.getRequiredInfo())) {
                SearchOpenAppViewData.OpenAppAbilityViewData openAppAbilityViewData2 = (SearchOpenAppViewData.OpenAppAbilityViewData) hashMap.get(2);
                if (openAppAbilityViewData2 == null || TextUtils.isEmpty(openAppAbilityViewData2.getRequiredInfo())) {
                    SearchOpenAppViewData.OpenAppAbilityViewData openAppAbilityViewData3 = (SearchOpenAppViewData.OpenAppAbilityViewData) hashMap.get(1);
                    if (openAppAbilityViewData3 == null || TextUtils.isEmpty(openAppAbilityViewData3.getRequiredInfo())) {
                        m207844d();
                        return;
                    }
                    int type = openAppAbilityViewData3.getType();
                    String requiredInfo = openAppAbilityViewData3.getRequiredInfo();
                    Intrinsics.checkExpressionValueIsNotNull(requiredInfo, "abilityViewData.requiredInfo");
                    m207841a(type, requiredInfo);
                    return;
                }
                int type2 = openAppAbilityViewData2.getType();
                String requiredInfo2 = openAppAbilityViewData2.getRequiredInfo();
                Intrinsics.checkExpressionValueIsNotNull(requiredInfo2, "abilityViewData.requiredInfo");
                m207841a(type2, requiredInfo2);
                return;
            }
            int type3 = openAppAbilityViewData.getType();
            String requiredInfo3 = openAppAbilityViewData.getRequiredInfo();
            Intrinsics.checkExpressionValueIsNotNull(requiredInfo3, "abilityViewData.requiredInfo");
            m207841a(type3, requiredInfo3);
        }
    }
}
