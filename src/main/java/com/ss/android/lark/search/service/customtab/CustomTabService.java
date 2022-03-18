package com.ss.android.lark.search.service.customtab;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.searches.PullAvailableSearchTabsRequest;
import com.ss.android.lark.pb.searches.PullAvailableSearchTabsResponse;
import com.ss.android.lark.pb.searches.PullUserSearchTabsRequest;
import com.ss.android.lark.pb.searches.PullUserSearchTabsResponse;
import com.ss.android.lark.pb.searches.PutUserSearchTabsRequest;
import com.ss.android.lark.pb.searches.PutUserSearchTabsResponse;
import com.ss.android.lark.pb.searches.SearchTab;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.search.impl.C53329a;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bH\u0002J(\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001aj\b\u0012\u0004\u0012\u00020\f`\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bH\u0016J\u001c\u0010\u001d\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J$\u0010\u001e\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001f0\nH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/search/service/customtab/CustomTabService;", "Lcom/ss/android/lark/search/service/customtab/ICustomTabService;", "()V", "mDefaultType", "Ljava/util/HashSet;", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "Lkotlin/collections/HashSet;", "fetchUserTabFromNet", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "filterTabInfo", "", "list", "getDefaultTabs", "isDefaultTab", "", ShareHitPoint.f121869d, "isUnSupportTab", "tabInfo", "mergeDataWithLocalTabs", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/searches/SearchTab;", "parseSearchTabToTabInfo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "searchTabs", "pullUserAvailableTab", "putUserTabToNet", "Lcom/ss/android/lark/pb/searches/PutUserSearchTabsResponse;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.b.a */
public final class CustomTabService {

    /* renamed from: a */
    public static final CustomTabService f131788a = new CustomTabService();

    /* renamed from: b */
    private static final HashSet<Scene.Type> f131789b;

    private CustomTabService() {
    }

    static {
        HashSet<Scene.Type> hashSet = new HashSet<>();
        hashSet.add(Scene.Type.SEARCH_GLOBAL);
        hashSet.add(Scene.Type.SEARCH_MESSAGES);
        hashSet.add(Scene.Type.SEARCH_OPEN_APP_SCENE);
        hashSet.add(Scene.Type.SEARCH_CHATTERS);
        hashSet.add(Scene.Type.SEARCH_CHATS);
        hashSet.add(Scene.Type.SEARCH_HELP_DESK);
        hashSet.add(Scene.Type.SEARCH_SPACE);
        f131789b = hashSet;
    }

    /* renamed from: a */
    public List<TabInfo> mo181909a() {
        ArrayList arrayList = new ArrayList();
        if (C53329a.m206412b()) {
            int number = Scene.Type.SEARCH_GLOBAL.getNumber();
            String string = UIHelper.getString(R.string.Lark_Search_TopResults);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
            arrayList.add(new TabInfo(number, string, null, null, null, 28, null));
            int number2 = Scene.Type.SEARCH_CHATTERS.getNumber();
            String string2 = UIHelper.getString(R.string.Lark_Legacy_Contact);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Legacy_Contact)");
            arrayList.add(new TabInfo(number2, string2, null, null, null, 28, null));
            int number3 = Scene.Type.SEARCH_CHATS.getNumber();
            String string3 = UIHelper.getString(R.string.Lark_Legacy_Group);
            Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.string.Lark_Legacy_Group)");
            arrayList.add(new TabInfo(number3, string3, null, null, null, 28, null));
        } else {
            int number4 = Scene.Type.SEARCH_GLOBAL.getNumber();
            String string4 = UIHelper.getString(R.string.Lark_Search_TopResults);
            Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
            arrayList.add(new TabInfo(number4, string4, null, null, null, 28, null));
            int number5 = Scene.Type.SEARCH_MESSAGES.getNumber();
            String string5 = UIHelper.getString(R.string.Lark_Search_TitleChatRecord);
            Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.str…k_Search_TitleChatRecord)");
            arrayList.add(new TabInfo(number5, string5, null, null, null, 28, null));
            int number6 = Scene.Type.SEARCH_SPACE.getNumber();
            String string6 = UIHelper.getString(R.string.Lark_Search_SpaceFragmentTitle);
            Intrinsics.checkExpressionValueIsNotNull(string6, "UIHelper.getString(R.str…earch_SpaceFragmentTitle)");
            arrayList.add(new TabInfo(number6, string6, null, null, null, 28, null));
            int number7 = Scene.Type.SEARCH_OPEN_APP_SCENE.getNumber();
            String string7 = UIHelper.getString(R.string.Lark_Search_Apps);
            Intrinsics.checkExpressionValueIsNotNull(string7, "UIHelper.getString(R.string.Lark_Search_Apps)");
            arrayList.add(new TabInfo(number7, string7, null, null, null, 28, null));
            int number8 = Scene.Type.SEARCH_CHATTERS.getNumber();
            String string8 = UIHelper.getString(R.string.Lark_Legacy_Contact);
            Intrinsics.checkExpressionValueIsNotNull(string8, "UIHelper.getString(R.string.Lark_Legacy_Contact)");
            arrayList.add(new TabInfo(number8, string8, null, null, null, 28, null));
            int number9 = Scene.Type.SEARCH_CHATS.getNumber();
            String string9 = UIHelper.getString(R.string.Lark_Legacy_Group);
            Intrinsics.checkExpressionValueIsNotNull(string9, "UIHelper.getString(R.string.Lark_Legacy_Group)");
            arrayList.add(new TabInfo(number9, string9, null, null, null, 28, null));
            if (C53339b.m206449i()) {
                int number10 = Scene.Type.SEARCH_HELP_DESK.getNumber();
                String string10 = UIHelper.getString(R.string.Lark_Search_HelpDesk);
                Intrinsics.checkExpressionValueIsNotNull(string10, "UIHelper.getString(R.string.Lark_Search_HelpDesk)");
                arrayList.add(new TabInfo(number10, string10, null, null, null, 28, null));
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/customtab/CustomTabService$fetchUserTabFromNet$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/searches/PullUserSearchTabsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$a */
    public static final class C53298a implements IGetDataCallback<PullUserSearchTabsResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f131790a;

        C53298a(IGetDataCallback iGetDataCallback) {
            this.f131790a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131790a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(PullUserSearchTabsResponse pullUserSearchTabsResponse) {
            List<SearchTab> list;
            CustomTabService aVar = CustomTabService.f131788a;
            if (pullUserSearchTabsResponse != null) {
                list = pullUserSearchTabsResponse.msearch_tabs;
            } else {
                list = null;
            }
            this.f131790a.onSuccess(aVar.mo181910a(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/customtab/CustomTabService$pullUserAvailableTab$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/searches/PullAvailableSearchTabsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$c */
    public static final class C53300c implements IGetDataCallback<PullAvailableSearchTabsResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f131792a;

        C53300c(IGetDataCallback iGetDataCallback) {
            this.f131792a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131792a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(PullAvailableSearchTabsResponse pullAvailableSearchTabsResponse) {
            List<SearchTab> list;
            CustomTabService aVar = CustomTabService.f131788a;
            if (pullAvailableSearchTabsResponse != null) {
                list = pullAvailableSearchTabsResponse.msearch_tabs;
            } else {
                list = null;
            }
            this.f131792a.onSuccess(aVar.mo181910a(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/customtab/CustomTabService$putUserTabToNet$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/searches/PutUserSearchTabsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$e */
    public static final class C53302e implements IGetDataCallback<PutUserSearchTabsResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f131794a;

        C53302e(IGetDataCallback iGetDataCallback) {
            this.f131794a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(PutUserSearchTabsResponse putUserSearchTabsResponse) {
            this.f131794a.onSuccess(putUserSearchTabsResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131794a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/searches/PullUserSearchTabsResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$b */
    static final class C53299b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C53299b f131791a = new C53299b();

        C53299b() {
        }

        /* renamed from: a */
        public final PullUserSearchTabsResponse parse(byte[] bArr) {
            return PullUserSearchTabsResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/searches/PullAvailableSearchTabsResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$d */
    static final class C53301d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C53301d f131793a = new C53301d();

        C53301d() {
        }

        /* renamed from: a */
        public final PullAvailableSearchTabsResponse parse(byte[] bArr) {
            return PullAvailableSearchTabsResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/searches/PutUserSearchTabsResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.b.a$f */
    static final class C53303f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C53303f f131795a = new C53303f();

        C53303f() {
        }

        /* renamed from: a */
        public final PutUserSearchTabsResponse parse(byte[] bArr) {
            return PutUserSearchTabsResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public boolean mo181914a(Scene.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return f131789b.contains(type);
    }

    /* renamed from: a */
    public void mo181911a(IGetDataCallback<List<TabInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(Command.PULL_USER_SEARCH_TABS, new PullUserSearchTabsRequest.C50032a(), new C53298a(iGetDataCallback), C53299b.f131791a);
    }

    /* renamed from: b */
    public void mo181916b(IGetDataCallback<List<TabInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(Command.PULL_AVAILABLE_SEARCH_TABS, new PullAvailableSearchTabsRequest.C50028a(), new C53300c(iGetDataCallback), C53301d.f131793a);
    }

    /* renamed from: c */
    public List<TabInfo> mo181917c(List<TabInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Iterator<TabInfo> it = list.iterator();
        while (it.hasNext()) {
            if (mo181913a(it.next())) {
                it.remove();
            }
        }
        return list;
    }

    /* renamed from: a */
    public final List<TabInfo> mo181910a(List<SearchTab> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int number = Scene.Type.SEARCH_GLOBAL.getNumber();
        String string = UIHelper.getString(R.string.Lark_Search_TopResults);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
        linkedHashSet.add(new TabInfo(number, string, null, null, null, 28, null));
        linkedHashSet.addAll(mo181915b(list));
        linkedHashSet.addAll(mo181909a());
        return CollectionsKt.toList(linkedHashSet);
    }

    /* renamed from: a */
    public boolean mo181913a(TabInfo tabInfo) {
        Intrinsics.checkParameterIsNotNull(tabInfo, "tabInfo");
        if (!C53339b.m206449i() && tabInfo.getType() == Scene.Type.SEARCH_HELP_DESK) {
            return true;
        }
        if (mo181914a(tabInfo.getType()) || tabInfo.getType() == Scene.Type.SEARCH_OPEN_SEARCH_SCENE) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x000f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.ss.android.lark.search.redesign.dto.TabInfo> mo181915b(java.util.List<com.ss.android.lark.pb.searches.SearchTab> r21) {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.service.customtab.CustomTabService.mo181915b(java.util.List):java.util.ArrayList");
    }

    /* renamed from: a */
    public void mo181912a(List<SearchTab> list, IGetDataCallback<PutUserSearchTabsResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "searchTabs");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(Command.PUT_USER_SEARCH_TABS, new PutUserSearchTabsRequest.C50036a().mo173873a(list), new C53302e(iGetDataCallback), C53303f.f131795a);
    }
}
