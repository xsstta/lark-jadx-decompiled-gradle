package com.ss.android.lark.search.redesign;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.impl.func.global.SearchActivity;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.search.impl.func.global.search.order.SearchOrderManager;
import com.ss.android.lark.search.redesign.customtab.CustomTabActivity;
import com.ss.android.lark.search.redesign.customtab.TabManager;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.search.redesign.viewmodel.SearchFragmentViewModel;
import com.ss.android.lark.search.redesign.viewmodel.TabType;
import com.ss.android.lark.search.service.customtab.CustomTabService;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\"\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\"\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020$H\u0016J\u0012\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u00105\u001a\u00020$2\u0006\u00106\u001a\u0002002\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u00107\u001a\u00020$2\b\u00108\u001a\u0004\u0018\u00010\u0010J\u000e\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0010J\u0016\u0010;\u001a\u00020$2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/search/redesign/SearchFragment;", "Lcom/ss/android/lark/search/redesign/BaseVMFragment;", "Lcom/ss/android/lark/search/impl/func/global/SearchActivity$IBackPressListener;", "()V", "mAdapter", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "mCommonNavigatorAdapter", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "mCurrentTabInfo", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "mFragments", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "mIndicator", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "mInitSearchKey", "", "mIsFinishing", "", "mSearchCancel", "Landroid/widget/TextView;", "mSearchFragmentViewModel", "Lcom/ss/android/lark/search/redesign/viewmodel/SearchFragmentViewModel;", "mSearchInputView", "Lcom/ss/android/lark/searchcommon/view/SearchInputView;", "mTabManager", "Lcom/ss/android/lark/search/redesign/customtab/TabManager;", "mTabsInfo", "", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "newPosition", "", "oldPosition", "getCurrentFragment", "initTabs", "", "jumpToTargetTab", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setSearchText", SearchIntents.EXTRA_QUERY, "switchToOpenSearchTap", "appId", "updateTabInfo", "tabInfoList", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.m */
public final class SearchFragment extends BaseVMFragment implements SearchActivity.AbstractC53625a {

    /* renamed from: i */
    public static final Companion f132844i = new Companion(null);

    /* renamed from: a */
    public SearchFragmentViewModel f132845a;

    /* renamed from: b */
    public List<TabInfo> f132846b = new ArrayList();

    /* renamed from: c */
    public final SparseArray<Fragment> f132847c = new SparseArray<>();

    /* renamed from: d */
    public SearchInputView f132848d;

    /* renamed from: e */
    public ViewPager f132849e;

    /* renamed from: f */
    public int f132850f;

    /* renamed from: g */
    public int f132851g = this.f132850f;

    /* renamed from: h */
    public TabInfo f132852h;

    /* renamed from: j */
    private boolean f132853j;

    /* renamed from: k */
    private String f132854k;

    /* renamed from: l */
    private final TabManager f132855l = new TabManager();

    /* renamed from: m */
    private TextView f132856m;

    /* renamed from: n */
    private MagicIndicator f132857n;

    /* renamed from: o */
    private AbstractC1045n f132858o;

    /* renamed from: p */
    private final AbstractC69621a f132859p = new C53813e(this);

    /* renamed from: q */
    private HashMap f132860q;

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132860q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/redesign/SearchFragment$Companion;", "", "()V", "INDICATOR_HEIGHT", "", "INDICATOR_TITLE_MARGIN_IN_DP", "", "INDICATOR_TITLE_TEXT_SIZE", "KEY_PARAMS_SEARCH_RESULT_TYPE_ORDER", "", "KEY_PARAMS_TAB_INFO", "REQUEST_KEY_FOR_CUSTOM_TAB", "TAG_V2", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$k */
    static final class RunnableC53823k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f132878a;

        RunnableC53823k(SearchInputView searchInputView) {
            this.f132878a = searchInputView;
        }

        public final void run() {
            this.f132878a.mo184580a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$initTabs$1", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getItemPosition", "object", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$b */
    public static final class C53810b extends AbstractC1045n {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132861a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f132861a.f132846b.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            Fragment fragment = this.f132861a.f132846b.get(i).fragment();
            this.f132861a.f132847c.put(i, fragment);
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            Intrinsics.checkExpressionValueIsNotNull(arguments, "fragment.arguments ?: Bundle()");
            arguments.putSerializable("tab_info", this.f132861a.f132846b.get(i));
            fragment.setArguments(arguments);
            return fragment;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53810b(SearchFragment mVar, FragmentManager fragmentManager, int i) {
            super(fragmentManager, i);
            this.f132861a = mVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$onViewCreated$1$3", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnClearBtnClick;", "onClick", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$i */
    public static final class C53821i implements SearchInputView.IOnClearBtnClick {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132876a;

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnClearBtnClick
        /* renamed from: a */
        public void mo183466a() {
            SearchFragment.m208305a(this.f132876a).mo184580a();
        }

        C53821i(SearchFragment mVar) {
            this.f132876a = mVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$p */
    public static final class RunnableC53828p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132883a;

        /* renamed from: b */
        final /* synthetic */ int f132884b;

        RunnableC53828p(SearchFragment mVar, int i) {
            this.f132883a = mVar;
            this.f132884b = i;
        }

        public final void run() {
            SearchFragment.m208306b(this.f132883a).setCurrentItem(this.f132884b, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$q */
    public static final class RunnableC53829q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f132885a;

        RunnableC53829q(Context context) {
            this.f132885a = context;
        }

        public final void run() {
            UDToast.show(this.f132885a, (int) R.string.Lark_ASL_AddSearchCategory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$onCreate$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$f */
    public static final class C53817f implements IGetDataCallback<List<? extends TabInfo>> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132871a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.m$f$a */
        public static final class RunnableC53818a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53817f f132872a;

            /* renamed from: b */
            final /* synthetic */ List f132873b;

            RunnableC53818a(C53817f fVar, List list) {
                this.f132872a = fVar;
                this.f132873b = list;
            }

            public final void run() {
                SearchFragment mVar = this.f132872a.f132871a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f132873b);
                mVar.mo183458a(arrayList);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53817f(SearchFragment mVar) {
            this.f132871a = mVar;
        }

        /* renamed from: a */
        public void onSuccess(List<TabInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            UICallbackExecutor.execute(new RunnableC53818a(this, list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$mCommonNavigatorAdapter$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "index", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$e */
    public static final class C53813e extends AbstractC69621a {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132864a;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            if (C53339b.m206442b()) {
                return this.f132864a.f132846b.size();
            }
            return this.f132864a.f132846b.size() + 1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53813e(SearchFragment mVar) {
            this.f132864a = mVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.m$e$a */
        static final class View$OnClickListenerC53814a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53813e f132865a;

            /* renamed from: b */
            final /* synthetic */ int f132866b;

            View$OnClickListenerC53814a(C53813e eVar, int i) {
                this.f132865a = eVar;
                this.f132866b = i;
            }

            public final void onClick(View view) {
                SearchFragment.m208306b(this.f132865a.f132864a).setCurrentItem(this.f132866b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.m$e$b */
        static final class View$OnClickListenerC53815b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53813e f132867a;

            /* renamed from: b */
            final /* synthetic */ Context f132868b;

            View$OnClickListenerC53815b(C53813e eVar, Context context) {
                this.f132867a = eVar;
                this.f132868b = context;
            }

            public final void onClick(View view) {
                int currentItem = SearchFragment.m208306b(this.f132867a.f132864a).getCurrentItem();
                if (currentItem > 0 && currentItem < this.f132867a.f132864a.f132846b.size()) {
                    this.f132867a.f132864a.f132852h = this.f132867a.f132864a.f132846b.get(currentItem);
                }
                this.f132867a.f132864a.startActivityForResult(new Intent(this.f132868b, CustomTabActivity.class), 2048);
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69625a aVar = new C69625a(context);
            aVar.setColors(Integer.valueOf(UIUtils.getColor(context, R.color.lkui_B500)));
            aVar.setMode(1);
            aVar.setLineHeight((float) C57582a.m223600a(4));
            aVar.setRoundRadius((float) C57582a.m223600a(2));
            aVar.setYOffset(((float) C57582a.m223600a(2)) * ((float) -1));
            return aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$mCommonNavigatorAdapter$1$getTitleView$colorTransitionPagerTitleView$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/ColorTransitionPagerTitleView;", "mTypeface", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "onDeselected", "", "index", "", "totalCount", "onSelected", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.m$e$c */
        public static final class C53816c extends C69627a {

            /* renamed from: a */
            final /* synthetic */ Context f132869a;

            /* renamed from: d */
            private Typeface f132870d = Typeface.DEFAULT;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C53816c(Context context, Context context2) {
                super(context2);
                this.f132869a = context;
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: a */
            public void mo31041a(int i, int i2) {
                if (!Intrinsics.areEqual(this.f132870d, Typeface.DEFAULT_BOLD)) {
                    Typeface typeface = Typeface.DEFAULT_BOLD;
                    this.f132870d = typeface;
                    setTypeface(typeface);
                }
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: b */
            public void mo31043b(int i, int i2) {
                if (!Intrinsics.areEqual(this.f132870d, Typeface.DEFAULT)) {
                    Typeface typeface = Typeface.DEFAULT;
                    this.f132870d = typeface;
                    setTypeface(typeface);
                }
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (i < this.f132864a.f132846b.size()) {
                C53816c cVar = new C53816c(context, context);
                cVar.setTextSize(14.0f);
                cVar.setNormalColor(UIUtils.getColor(context, R.color.text_caption));
                cVar.setSelectedColor(UIUtils.getColor(context, R.color.primary_pri_500));
                cVar.setOnClickListener(new View$OnClickListenerC53814a(this, i));
                cVar.setPadding(UIHelper.dp2px(12.0f), 0, UIHelper.dp2px(12.0f), 0);
                cVar.setText(this.f132864a.f132846b.get(i).title());
                return cVar;
            }
            C69628b bVar = new C69628b(context);
            bVar.setContentView(R.layout.layout_custom_tab_more);
            bVar.setOnClickListener(new View$OnClickListenerC53815b(this, context));
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$onViewCreated$1$2", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnQueryClear;", "onQueryClear", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$h */
    public static final class C53820h implements SearchInputView.IOnQueryClear {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132875a;

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnQueryClear
        /* renamed from: a */
        public void mo162384a() {
            C1177w<String> queryString;
            SearchFragmentViewModel bVar = this.f132875a.f132845a;
            if (bVar != null && (queryString = bVar.getQueryString()) != null) {
                queryString.mo5929b("");
            }
        }

        C53820h(SearchFragment mVar) {
            this.f132875a = mVar;
        }
    }

    @Override // com.ss.android.lark.search.impl.func.global.SearchActivity.AbstractC53625a
    /* renamed from: a */
    public void mo182928a() {
        if (!this.f132853j) {
            this.f132853j = true;
            finish();
        }
    }

    /* renamed from: b */
    public final Fragment mo183459b() {
        SparseArray<Fragment> sparseArray = this.f132847c;
        ViewPager viewPager = this.f132849e;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return sparseArray.get(viewPager.getCurrentItem());
    }

    /* renamed from: d */
    private final void m208308d() {
        TabInfo tabInfo = this.f132852h;
        if (tabInfo != null) {
            int indexOf = this.f132846b.indexOf(tabInfo);
            if (indexOf < 0 || indexOf >= this.f132846b.size()) {
                ViewPager viewPager = this.f132849e;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                viewPager.setCurrentItem(0, false);
                return;
            }
            ViewPager viewPager2 = this.f132849e;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            viewPager2.setCurrentItem(indexOf, false);
        }
    }

    /* renamed from: c */
    private final void m208307c() {
        C1177w<TabType> tabType;
        this.f132858o = new C53810b(this, getChildFragmentManager(), 1);
        ViewPager viewPager = this.f132849e;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        AbstractC1045n nVar = this.f132858o;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        viewPager.setAdapter(nVar);
        C69619a aVar = new C69619a(this.mContext);
        aVar.setAdapter(this.f132859p);
        MagicIndicator magicIndicator = this.f132857n;
        if (magicIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIndicator");
        }
        magicIndicator.setNavigator(aVar);
        MagicIndicator magicIndicator2 = this.f132857n;
        if (magicIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIndicator");
        }
        ViewPager viewPager2 = this.f132849e;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        C69634c.m267483a(magicIndicator2, viewPager2);
        SearchFragmentViewModel bVar = this.f132845a;
        if (!(bVar == null || (tabType = bVar.getTabType()) == null)) {
            tabType.mo5923a(getViewLifecycleOwner(), new C53811c(this));
        }
        ViewPager viewPager3 = this.f132849e;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager3.addOnPageChangeListener(new C53812d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$initTabs$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$d */
    public static final class C53812d implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132863a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53812d(SearchFragment mVar) {
            this.f132863a = mVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            String str;
            SearchFragment mVar = this.f132863a;
            mVar.f132851g = mVar.f132850f;
            this.f132863a.f132850f = i;
            if (this.f132863a.f132851g >= 0 && this.f132863a.f132851g < this.f132863a.f132846b.size() && this.f132863a.f132850f >= 0 && this.f132863a.f132850f < this.f132863a.f132846b.size()) {
                TabInfo tabInfo = this.f132863a.f132846b.get(this.f132863a.f132851g);
                TabInfo tabInfo2 = this.f132863a.f132846b.get(this.f132863a.f132850f);
                Fragment fragment = this.f132863a.f132847c.get(this.f132863a.f132851g);
                String reporterLocation = tabInfo.reporterLocation();
                String mapp_id = tabInfo.getMapp_id();
                String reporterLocation2 = tabInfo2.reporterLocation();
                String mapp_id2 = tabInfo2.getMapp_id();
                String query = SearchFragment.m208305a(this.f132863a).getQuery();
                if (fragment instanceof BaseSearchTabFragment) {
                    str = ((BaseSearchTabFragment) fragment).mo183118D();
                } else {
                    str = "";
                }
                SearchClickReporter.m208838a(reporterLocation, mapp_id, reporterLocation2, mapp_id2, "main", query, str, tabInfo.getSessionSnapshot() + '_' + tabInfo.getSeqIdSnapshot());
            }
            Log.m165379d("LarkSearch.Search.V2.SearchFragment", "onPageSelected: oldPosition: " + this.f132863a.f132851g + ", newPosition: " + this.f132863a.f132850f);
            KeyboardUtils.hideKeyboard(this.f132863a.mContext);
            int i2 = 0;
            Iterator<T> it = this.f132863a.f132846b.iterator();
            while (it.hasNext()) {
                it.next();
                if (i2 != i) {
                    Fragment fragment2 = this.f132863a.f132847c.get(i2);
                    if (fragment2 instanceof BaseSearchTabFragment) {
                        ((BaseSearchTabFragment) fragment2).mo183143b("tab");
                    }
                }
                i2++;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$onViewCreated$1$1", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "onSearch", "", SearchIntents.EXTRA_QUERY, "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$g */
    public static final class C53819g implements SearchInputView.IOnSearch {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132874a;

        C53819g(SearchFragment mVar) {
            this.f132874a = mVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
        /* renamed from: a */
        public void mo162383a(String str) {
            C1177w<String> queryString;
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            SearchFragmentViewModel bVar = this.f132874a.f132845a;
            if (bVar != null && (queryString = bVar.getQueryString()) != null) {
                queryString.mo5929b(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/SearchFragment$onViewCreated$1$5", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnFilter;", "onFilter", "", "filterInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$j */
    public static final class C53822j implements SearchInputView.IOnFilter {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132877a;

        C53822j(SearchFragment mVar) {
            this.f132877a = mVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnFilter
        /* renamed from: a */
        public void mo183467a(SearchOpenSearchInfo searchOpenSearchInfo) {
            Fragment b;
            if (searchOpenSearchInfo == null && (b = this.f132877a.mo183459b()) != null && (b instanceof OpenSearchFragment)) {
                ((OpenSearchFragment) b).mo183455T();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$l */
    static final class View$OnClickListenerC53824l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132879a;

        View$OnClickListenerC53824l(SearchFragment mVar) {
            this.f132879a = mVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f132879a.mContext);
            this.f132879a.finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchInputView m208305a(SearchFragment mVar) {
        SearchInputView searchInputView = mVar.f132848d;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        return searchInputView;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewPager m208306b(SearchFragment mVar) {
        ViewPager viewPager = mVar.f132849e;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return viewPager;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$n */
    static final class C53826n<T> implements AbstractC1178x<SearchInfoHistory> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132881a;

        C53826n(SearchFragment mVar) {
            this.f132881a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(SearchInfoHistory searchInfoHistory) {
            SearchInputView a = SearchFragment.m208305a(this.f132881a);
            Intrinsics.checkExpressionValueIsNotNull(searchInfoHistory, "it");
            String query = searchInfoHistory.getQuery();
            Intrinsics.checkExpressionValueIsNotNull(query, "it.query");
            a.setText(query);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$o */
    static final class C53827o<T> implements AbstractC1178x<SearchOpenSearchInfo> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132882a;

        C53827o(SearchFragment mVar) {
            this.f132882a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(SearchOpenSearchInfo searchOpenSearchInfo) {
            if (searchOpenSearchInfo != null) {
                SearchFragment.m208305a(this.f132882a).mo184581a(searchOpenSearchInfo);
            } else {
                SearchFragment.m208305a(this.f132882a).mo184586d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$m */
    static final class C53825m<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132880a;

        C53825m(SearchFragment mVar) {
            this.f132880a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            ISearchModuleDependency.AbstractC53321h.AbstractC53322a docForLark;
            for (T t : this.f132880a.f132846b) {
                if (t.getType() == Scene.Type.SEARCH_SPACE && (docForLark = t.getDocForLark()) != null) {
                    docForLark.mo143226a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo183457a(String str) {
        if (str != null) {
            SearchInputView searchInputView = this.f132848d;
            if (searchInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
            }
            searchInputView.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/search/redesign/viewmodel/TabType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.m$c */
    public static final class C53811c<T> implements AbstractC1178x<TabType> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f132862a;

        C53811c(SearchFragment mVar) {
            this.f132862a = mVar;
        }

        /* renamed from: a */
        public final void onChanged(TabType cVar) {
            Iterator<T> it = this.f132862a.f132846b.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().getType() == cVar.mo183215a()) {
                    Fragment fragment = this.f132862a.f132847c.get(i);
                    if (fragment instanceof BaseSearchTabFragment) {
                        ((BaseSearchTabFragment) fragment).mo183143b(cVar.mo183216b());
                    }
                    SearchFragment.m208306b(this.f132862a).setCurrentItem(i, false);
                    return;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void mo183458a(List<TabInfo> list) {
        if (isActive() && !list.isEmpty()) {
            List<TabInfo> c = CustomTabService.f131788a.mo181917c(list);
            if (!TabManager.f132656a.mo183292a(c, this.f132846b)) {
                this.f132847c.clear();
                this.f132846b.clear();
                this.f132846b.addAll(c);
                this.f132859p.mo243218b();
                AbstractC1045n nVar = this.f132858o;
                if (nVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                nVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo183460b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "appId");
        Iterator withIndex = CollectionsKt.withIndex(this.f132846b.iterator());
        while (withIndex.hasNext()) {
            IndexedValue xVar = (IndexedValue) withIndex.next();
            int c = xVar.mo239101c();
            TabInfo tabInfo = (TabInfo) xVar.mo239102d();
            if (tabInfo.getSceneType() == Scene.Type.SEARCH_OPEN_SEARCH_SCENE.getNumber() && C57782ag.m224242a(str, tabInfo.getMapp_id())) {
                ViewPager viewPager = this.f132849e;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                viewPager.post(new RunnableC53828p(this, c));
                return true;
            }
        }
        startActivityForResult(new Intent(getContext(), CustomTabActivity.class), 2048);
        Context context = getContext();
        if (context == null) {
            return false;
        }
        ViewPager viewPager2 = this.f132849e;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager2.post(new RunnableC53829q(context));
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        String str;
        C1177w<GlobalSearchOrderData> globalSearchOrderData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("search_result_type_order");
        } else {
            obj = null;
        }
        if (!(obj instanceof GlobalSearchOrderData)) {
            obj = null;
        }
        GlobalSearchOrderData globalSearchOrderData2 = (GlobalSearchOrderData) obj;
        if (globalSearchOrderData2 == null) {
            globalSearchOrderData2 = SearchOrderManager.Companion.m207617a(SearchOrderManager.f132393b, 0, 1, null);
        }
        SearchFragmentViewModel bVar = (SearchFragmentViewModel) mo183297b(SearchFragmentViewModel.class);
        this.f132845a = bVar;
        if (!(bVar == null || (globalSearchOrderData = bVar.getGlobalSearchOrderData()) == null)) {
            globalSearchOrderData.mo5929b(globalSearchOrderData2);
        }
        if (C53339b.m206442b()) {
            this.f132846b.clear();
            this.f132846b.addAll(CustomTabService.f131788a.mo181909a());
        } else {
            this.f132846b.clear();
            this.f132846b.addAll(CustomTabService.f131788a.mo181917c(this.f132855l.mo183289a()));
            this.f132855l.mo183290a(new C53817f(this));
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("searchKey")) == null) {
            str = "";
        }
        this.f132854k = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1177w<SearchOpenSearchInfo> searchOpenSearchFilterInfo;
        C1177w<SearchInfoHistory> searchInfoHistory;
        C1177w<String> queryString;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.search_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.search_input)");
        this.f132848d = (SearchInputView) findViewById;
        View findViewById2 = view.findViewById(R.id.search_cancel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.search_cancel)");
        this.f132856m = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tab_indicator);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.tab_indicator)");
        this.f132857n = (MagicIndicator) findViewById3;
        View findViewById4 = view.findViewById(R.id.tab_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.tab_viewpager)");
        ViewPager viewPager = (ViewPager) findViewById4;
        this.f132849e = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager.setOffscreenPageLimit(this.f132846b.size());
        m208307c();
        SearchInputView searchInputView = this.f132848d;
        if (searchInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        searchInputView.setOnSearch(new C53819g(this));
        searchInputView.setOnQueryClear(new C53820h(this));
        searchInputView.setOnClearBtnClick(new C53821i(this));
        searchInputView.post(new RunnableC53823k(searchInputView));
        searchInputView.setOnFilter(new C53822j(this));
        String str = this.f132854k;
        if (str != null) {
            SearchInputView searchInputView2 = this.f132848d;
            if (searchInputView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
            }
            searchInputView2.setText(str);
        }
        TextView textView = this.f132856m;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchCancel");
        }
        textView.setOnClickListener(new View$OnClickListenerC53824l(this));
        SearchFragmentViewModel bVar = this.f132845a;
        if (!(bVar == null || (queryString = bVar.getQueryString()) == null)) {
            queryString.mo5923a(getViewLifecycleOwner(), new C53825m(this));
        }
        SearchFragmentViewModel bVar2 = this.f132845a;
        if (!(bVar2 == null || (searchInfoHistory = bVar2.getSearchInfoHistory()) == null)) {
            searchInfoHistory.mo5923a(getViewLifecycleOwner(), new C53826n(this));
        }
        SearchFragmentViewModel bVar3 = this.f132845a;
        if (bVar3 != null && (searchOpenSearchFilterInfo = bVar3.getSearchOpenSearchFilterInfo()) != null) {
            searchOpenSearchFilterInfo.mo5923a(getViewLifecycleOwner(), new C53827o(this));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_search_redesign, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        super.onActivityResult(i, i2, intent);
        Log.m165389i("LarkSearch.Search.V2.SearchFragment", "requestCode: " + i);
        if (i != 2048) {
            ViewPager viewPager = this.f132849e;
            if (viewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            if (viewPager.getCurrentItem() >= 0) {
                ViewPager viewPager2 = this.f132849e;
                if (viewPager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                int currentItem = viewPager2.getCurrentItem();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
                if (currentItem < childFragmentManager.getFragments().size()) {
                    FragmentManager childFragmentManager2 = getChildFragmentManager();
                    Intrinsics.checkExpressionValueIsNotNull(childFragmentManager2, "childFragmentManager");
                    List<Fragment> fragments = childFragmentManager2.getFragments();
                    ViewPager viewPager3 = this.f132849e;
                    if (viewPager3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    }
                    fragments.get(viewPager3.getCurrentItem()).onActivityResult(i, i2, intent);
                }
            }
        } else if (intent != null && (serializableExtra = intent.getSerializableExtra("tab_info_list")) != null) {
            Intrinsics.checkExpressionValueIsNotNull(serializableExtra, "data?.getSerializableExt…FOR_CUSTOM_TAB) ?: return");
            if (serializableExtra != null) {
                mo183458a((ArrayList) serializableExtra);
                m208308d();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.search.redesign.dto.TabInfo> /* = java.util.ArrayList<com.ss.android.lark.search.redesign.dto.TabInfo> */");
        }
    }
}
