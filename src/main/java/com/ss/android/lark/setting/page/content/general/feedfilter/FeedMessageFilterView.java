package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import butterknife.BindView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfoList;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u000223B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0018\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u00020(H\u0002J\u0012\u00101\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView;", "viewDependency", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$ViewDependency;", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$ViewDependency;)V", "feedTypeFilter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter;", "getFeedTypeFilter", "()Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter;", "setFeedTypeFilter", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedTypeFilter;)V", "filterSwitchLayout", "Landroid/view/View;", "getFilterSwitchLayout", "()Landroid/view/View;", "setFilterSwitchLayout", "(Landroid/view/View;)V", "filterSwitchTipView", "getFilterSwitchTipView", "setFilterSwitchTipView", "hideSwitchBtn", "", "highlightedFilter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilter;", "isSwitchButtonToastEnabled", "switchButton", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "getSwitchButton", "()Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "setSwitchButton", "(Lcom/larksuite/component/universe_design/udswitch/UDSwitch;)V", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewDelegate", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView$Delegate;", "create", "", "destroy", "initFeedTypeFilter", "isFeedFilterEnabled", "feedTabInfoList", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfoList;", "initSwitchButton", "initTitleBar", "initViews", "setViewDelegate", "Companion", "ViewDependency", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedMessageFilterView implements IFeedMessageFilterContract.IView {

    /* renamed from: e */
    public static final Companion f134685e = new Companion(null);

    /* renamed from: a */
    public IFeedMessageFilterContract.IView.Delegate f134686a;

    /* renamed from: b */
    public boolean f134687b;

    /* renamed from: c */
    public boolean f134688c;

    /* renamed from: d */
    public final ViewDependency f134689d;

    /* renamed from: f */
    private FeedFilter f134690f;
    @BindView(6948)
    public FeedTypeFilter feedTypeFilter;
    @BindView(6973)
    public View filterSwitchLayout;
    @BindView(6974)
    public View filterSwitchTipView;
    @BindView(6970)
    public UDSwitch switchButton;
    @BindView(7904)
    public CommonTitleBar titleBar;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$Companion;", "", "()V", "LOG_TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$ViewDependency;", "", "()V", "finish", "", "getHighlightedFilter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilter;", "injectView", "translateSettingView", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$b */
    public static abstract class ViewDependency {
        /* renamed from: a */
        public void mo186196a() {
        }

        /* renamed from: a */
        public void mo186197a(FeedMessageFilterView feedMessageFilterView) {
            Intrinsics.checkParameterIsNotNull(feedMessageFilterView, "translateSettingView");
        }

        /* renamed from: b */
        public FeedFilter mo186198b() {
            return FeedFilter.UNKNOWN;
        }
    }

    /* renamed from: d */
    private final void m211391d() {
        m211392e();
        m211393f();
        SettingHitPointNew.f134850a.mo186383a();
    }

    /* renamed from: a */
    public final CommonTitleBar mo186191a() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return commonTitleBar;
    }

    /* renamed from: b */
    public final UDSwitch mo186194b() {
        UDSwitch uDSwitch = this.switchButton;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchButton");
        }
        return uDSwitch;
    }

    /* renamed from: c */
    public final FeedTypeFilter mo186195c() {
        FeedTypeFilter feedTypeFilter2 = this.feedTypeFilter;
        if (feedTypeFilter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedTypeFilter");
        }
        return feedTypeFilter2;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134689d.mo186197a(this);
        m211391d();
    }

    /* renamed from: e */
    private final void m211392e() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        CommonTitleBar commonTitleBar2 = this.titleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setTitle(UIHelper.getString(R.string.Lark_Feed_FilterEdit));
        CommonTitleBar commonTitleBar3 = this.titleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC54477d(this));
        CommonTitleBar commonTitleBar4 = this.titleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar4.addAction(new C54478e(this, UIHelper.getString(R.string.Lark_Feed_Save), R.color.primary_pri_500));
    }

    /* renamed from: f */
    private final void m211393f() {
        UDSwitch uDSwitch = this.switchButton;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchButton");
        }
        uDSwitch.setOnCheckedChangeListener(new C54476c(this));
        if (C54115c.m210080a().mo178288c("lark.feed.setting_filter_only_at_me") || C54115c.m210080a().mo178273I()) {
            View view = this.filterSwitchLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSwitchLayout");
            }
            view.setVisibility(8);
            View view2 = this.filterSwitchTipView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSwitchTipView");
            }
            view2.setVisibility(8);
            this.f134687b = true;
            return;
        }
        this.f134687b = false;
    }

    /* renamed from: a */
    public void setViewDelegate(IFeedMessageFilterContract.IView.Delegate aVar) {
        this.f134686a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$e */
    public static final class C54478e extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterView f134693a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$initTitleBar$2$performAction$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(Ljava/lang/Long;)V", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$e$a */
        public static final class C54479a implements IGetDataCallback<Long> {

            /* renamed from: a */
            final /* synthetic */ C54478e f134694a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C54479a(C54478e eVar) {
                this.f134694a = eVar;
            }

            /* renamed from: a */
            public void onSuccess(Long l) {
                this.f134694a.f134693a.f134689d.mo186196a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                LKUIToast.show(this.f134694a.f134693a.mo186191a().getContext(), UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry));
            }
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Boolean bool;
            if (this.f134693a.mo186195c().mo186210b()) {
                ArrayList arrayList = new ArrayList();
                for (T t : this.f134693a.mo186195c().getMyFiltersSelections()) {
                    if (!Intrinsics.areEqual(t, String.valueOf(FeedFilter.INBOX.getValue()))) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (this.f134693a.f134687b) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(this.f134693a.mo186194b().isChecked());
                }
                Log.m165379d("FeedMessageFilterView", "feed message filter results: " + arrayList2 + ", switch button checked: " + bool);
                SettingHitPoint.f134851a.mo186395a(this.f134693a.mo186195c().getMyFiltersSelections());
                SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_SAVE);
                IFeedMessageFilterContract.IView.Delegate aVar = this.f134693a.f134686a;
                if (aVar != null) {
                    aVar.mo186334a(bool, arrayList2, new C54479a(this));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54478e(FeedMessageFilterView feedMessageFilterView, String str, int i) {
            super(str, i);
            this.f134693a = feedMessageFilterView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$d */
    public static final class View$OnClickListenerC54477d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterView f134692a;

        View$OnClickListenerC54477d(FeedMessageFilterView feedMessageFilterView) {
            this.f134692a = feedMessageFilterView;
        }

        public final void onClick(View view) {
            SettingHitPoint.f134851a.mo186410j();
            SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_CLOSE);
            this.f134692a.f134689d.mo186196a();
        }
    }

    public FeedMessageFilterView(ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f134689d = bVar;
        this.f134690f = bVar.mo186198b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView$c */
    public static final class C54476c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterView f134691a;

        C54476c(FeedMessageFilterView feedMessageFilterView) {
            this.f134691a = feedMessageFilterView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            if (this.f134691a.f134688c) {
                SettingHitPoint.f134851a.mo186404e(z);
                SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_FILTER_TOGGLE);
                Context context = this.f134691a.mo186194b().getContext();
                if (z) {
                    i = R.string.Lark_Feed_MessageFilterOnToast;
                } else {
                    i = R.string.Lark_Feed_MessageFilterOffToast;
                }
                LKUIToast.show(context, i);
            }
        }
    }

    @Override // com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract.IView
    /* renamed from: a */
    public void mo186193a(boolean z, FeedTabInfoList dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "feedTabInfoList");
        FeedTypeFilter feedTypeFilter2 = this.feedTypeFilter;
        if (feedTypeFilter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedTypeFilter");
        }
        feedTypeFilter2.setHighlightFilter(this.f134690f);
        FeedTypeFilter feedTypeFilter3 = this.feedTypeFilter;
        if (feedTypeFilter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedTypeFilter");
        }
        FeedTypeFilter.m211406a(feedTypeFilter3, dVar, false, 2, (Object) null);
        FeedTypeFilter feedTypeFilter4 = this.feedTypeFilter;
        if (feedTypeFilter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedTypeFilter");
        }
        UDSwitch uDSwitch = this.switchButton;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchButton");
        }
        uDSwitch.setChecked(z);
        feedTypeFilter4.setCorrespondingSwitchButton(uDSwitch);
        this.f134688c = true;
    }
}
