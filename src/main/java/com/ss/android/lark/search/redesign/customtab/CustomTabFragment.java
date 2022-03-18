package com.ss.android.lark.search.redesign.customtab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.pb.searches.PutUserSearchTabsResponse;
import com.ss.android.lark.pb.searches.SearchTab;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.search.service.customtab.CustomTabService;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/CustomTabFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "customTabView", "Lcom/ss/android/lark/search/redesign/customtab/CustomTabView;", "Lcom/ss/android/lark/search/redesign/customtab/SearchTabItem;", "getCustomTabView", "()Lcom/ss/android/lark/search/redesign/customtab/CustomTabView;", "setCustomTabView", "(Lcom/ss/android/lark/search/redesign/customtab/CustomTabView;)V", "mSaveView", "Landroid/view/View;", "mTabManager", "Lcom/ss/android/lark/search/redesign/customtab/TabManager;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "initCustomTabView", "", "initTitleBar", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateCustomTabView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "moreData", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.b */
public final class CustomTabFragment extends BaseFragment {

    /* renamed from: d */
    public static final Companion f132642d = new Companion(null);

    /* renamed from: a */
    public CommonTitleBar f132643a;

    /* renamed from: b */
    public CustomTabView<SearchTabItem> f132644b;

    /* renamed from: c */
    public final TabManager f132645c = new TabManager();

    /* renamed from: e */
    private View f132646e;

    /* renamed from: f */
    private HashMap f132647f;

    /* renamed from: b */
    public void mo183280b() {
        HashMap hashMap = this.f132647f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183280b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/CustomTabFragment$Companion;", "", "()V", "DATA_KEY_FOR_CUSTOM_TAB", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final CustomTabView<SearchTabItem> mo183278a() {
        CustomTabView<SearchTabItem> customTabView = this.f132644b;
        if (customTabView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customTabView");
        }
        return customTabView;
    }

    /* renamed from: d */
    private final void m208050d() {
        List<TabInfo> a = this.f132645c.mo183289a();
        mo183279a(a, new ArrayList());
        CustomTabService.f131788a.mo181916b(new C53735b(this, a));
    }

    /* renamed from: c */
    private final void m208049c() {
        CommonTitleBar commonTitleBar = this.f132643a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        CommonTitleBar commonTitleBar2 = this.f132643a;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setTitle(UIHelper.getString(R.string.Lark_Search_SearchCategorySettings));
        CommonTitleBar commonTitleBar3 = this.f132643a;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC53736c(this));
        CommonTitleBar commonTitleBar4 = this.f132643a;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        View addAction = commonTitleBar4.addAction(new C53737d(this, UIHelper.getString(R.string.Lark_Legacy_Save), R.color.lkui_B500));
        this.f132646e = addAction;
        if (addAction != null) {
            addAction.setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/redesign/customtab/CustomTabFragment$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.b$d */
    public static final class C53737d extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ CustomTabFragment f132651a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/customtab/CustomTabFragment$initTitleBar$2$performAction$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/searches/PutUserSearchTabsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.b$d$a */
        public static final class C53738a implements IGetDataCallback<PutUserSearchTabsResponse> {

            /* renamed from: a */
            final /* synthetic */ C53737d f132652a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C53738a(C53737d dVar) {
                this.f132652a = dVar;
            }

            /* renamed from: a */
            public void onSuccess(PutUserSearchTabsResponse putUserSearchTabsResponse) {
                LKUIToast.show(this.f132652a.f132651a.mContext, UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                LKUIToast.show(this.f132652a.f132651a.mContext, UIHelper.getString(R.string.Lark_Legacy_SaveFail));
            }
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            List<SearchTabItem> myFiltersSelections = this.f132651a.mo183278a().getMyFiltersSelections();
            ArrayList arrayList = new ArrayList();
            for (T t : myFiltersSelections) {
                if (t.mo183288m() != null) {
                    arrayList.add(t.mo183288m());
                }
            }
            ArrayList arrayList2 = arrayList;
            CustomTabService.f131788a.mo181912a(arrayList2, new C53738a(this));
            ArrayList<TabInfo> b = CustomTabService.f131788a.mo181915b(arrayList2);
            int number = Scene.Type.SEARCH_GLOBAL.getNumber();
            String string = UIHelper.getString(R.string.Lark_Search_TopResults);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
            b.add(0, new TabInfo(number, string, null, null, null, 28, null));
            this.f132651a.f132645c.mo183291a(b);
            this.f132651a.setResult(-1, new Intent().putExtra("tab_info_list", b));
            this.f132651a.finish();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53737d(CustomTabFragment bVar, String str, int i) {
            super(str, i);
            this.f132651a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.b$c */
    public static final class View$OnClickListenerC53736c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CustomTabFragment f132650a;

        View$OnClickListenerC53736c(CustomTabFragment bVar) {
            this.f132650a = bVar;
        }

        public final void onClick(View view) {
            this.f132650a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/search/redesign/customtab/CustomTabFragment$initCustomTabView$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "onErrored", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.b$b */
    public static final class C53735b extends UIGetDataCallback<List<? extends TabInfo>> {

        /* renamed from: a */
        final /* synthetic */ CustomTabFragment f132648a;

        /* renamed from: b */
        final /* synthetic */ List f132649b;

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void onSuccessed(List<TabInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            linkedHashSet.removeAll(this.f132649b);
            this.f132648a.mo183279a(this.f132649b, CollectionsKt.toList(linkedHashSet));
        }

        C53735b(CustomTabFragment bVar, List list) {
            this.f132648a = bVar;
            this.f132649b = list;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_bar)");
        this.f132643a = (CommonTitleBar) findViewById;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        CustomTabView<SearchTabItem> customTabView = new CustomTabView<>(context, null, 0, 6, null);
        this.f132644b = customTabView;
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (customTabView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customTabView");
            }
            linearLayout.addView(customTabView, new LinearLayout.LayoutParams(-1, -1));
            CustomTabView<SearchTabItem> customTabView2 = this.f132644b;
            if (customTabView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customTabView");
            }
            customTabView2.setPadding(C57582a.m223600a(16), 0, C57582a.m223600a(16), 0);
        }
        m208049c();
        m208050d();
    }

    /* renamed from: a */
    public final void mo183279a(List<TabInfo> list, List<TabInfo> list2) {
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Lark_Search_TopResults);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
        arrayList.add(new SearchTabItem(null, string, null, true, true, true, true, 4, null));
        for (T t : list) {
            SearchTab searchTab = t.toSearchTab();
            if (searchTab != null) {
                String str = searchTab.mlabel;
                Intrinsics.checkExpressionValueIsNotNull(str, "searchTab.mlabel");
                arrayList.add(new SearchTabItem(searchTab, str, null, !CustomTabService.f131788a.mo181913a((TabInfo) t), false, CustomTabService.f131788a.mo181914a(t.getType()), true, 4, null));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : list2) {
            SearchTab searchTab2 = t2.toSearchTab();
            if (searchTab2 != null) {
                String str2 = searchTab2.mlabel;
                Intrinsics.checkExpressionValueIsNotNull(str2, "searchTab.mlabel");
                arrayList2.add(new SearchTabItem(searchTab2, str2, null, !CustomTabService.f131788a.mo181913a((TabInfo) t2), false, CustomTabService.f131788a.mo181914a(t2.getType()), false, 4, null));
            }
        }
        View view = this.f132646e;
        if (view != null) {
            view.setEnabled(true);
        }
        CustomTabView<SearchTabItem> customTabView = this.f132644b;
        if (customTabView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customTabView");
        }
        customTabView.mo183230a(arrayList, arrayList2);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_custom_search_tab, viewGroup, false);
    }
}
