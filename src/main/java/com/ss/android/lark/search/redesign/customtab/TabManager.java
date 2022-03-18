package com.ss.android.lark.search.redesign.customtab;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.search.service.customtab.CustomTabService;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabManager;", "", "()V", "mTabList", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "getLocalUserTabInfo", "saveTabInfoToLocal", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "syncAndSaveTabsFromNet", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.f */
public final class TabManager {

    /* renamed from: a */
    public static final Companion f132656a = new Companion(null);

    /* renamed from: b */
    private final List<TabInfo> f132657b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabManager$Companion;", "", "()V", "SP_KEY_SEARCH_TABS", "", "TAG", "isTabListSame", "", "new", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "old", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo183292a(List<TabInfo> list, List<TabInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "new");
            Intrinsics.checkParameterIsNotNull(list2, "old");
            if (list == list2) {
                return true;
            }
            if (list.size() != list2.size()) {
                return false;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!Intrinsics.areEqual(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final List<TabInfo> mo183289a() {
        if (!this.f132657b.isEmpty()) {
            return this.f132657b;
        }
        List<TabInfo> jSONArray = UserSP.getInstance().getJSONArray("sp_key_search_tabs", TabInfo.class);
        if (jSONArray == null || jSONArray.isEmpty()) {
            jSONArray = CustomTabService.f131788a.mo181909a();
        }
        this.f132657b.addAll(jSONArray);
        return this.f132657b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/search/redesign/customtab/TabManager$syncAndSaveTabsFromNet$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.f$b */
    public static final class C53740b implements IGetDataCallback<List<? extends TabInfo>> {

        /* renamed from: a */
        final /* synthetic */ TabManager f132658a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f132659b;

        /* renamed from: a */
        public void onSuccess(List<TabInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f132658a.mo183291a(list);
            this.f132659b.onSuccess(list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f132659b.onError(errorResult);
        }

        C53740b(TabManager fVar, IGetDataCallback iGetDataCallback) {
            this.f132658a = fVar;
            this.f132659b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo183290a(IGetDataCallback<List<TabInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CustomTabService.f131788a.mo181911a(new C53740b(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo183291a(List<TabInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f132657b.clear();
        this.f132657b.addAll(list);
        UserSP.getInstance().putJSONArray("sp_key_search_tabs", list);
    }
}
