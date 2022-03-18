package com.ss.android.lark.mm.module.detail.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.banner.MmDetailBannerLayout;
import com.ss.android.lark.mm.module.detail.banner.MmReviewBanner;
import com.ss.android.lark.mm.module.detail.baseinfo.MediaType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateBar;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.widget.C47150e;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0002:\u0001@B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u0011H\u0016J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\u0012\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0011H\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\u0012\u00107\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u000fH\u0002J\u0017\u0010;\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u001fH\u0002J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmDetailViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailListener;", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailDependency;", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "adapter", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailTabFragmentAdapter;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isLastShowSummaryTab", "", "lastEditVersion", "", "lastObjectStatus", "Ljava/lang/Integer;", "locations", "", "mNoAudioBanner", "Lcom/ss/android/lark/mm/module/detail/banner/MmDetailBannerLayout;", "mReviewBanner", "Lcom/ss/android/lark/mm/module/detail/banner/MmReviewBanner;", "topicView", "Landroid/widget/TextView;", "viewHolder", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailViewControl$MmDetailViewHolder;", "animHide", "", "view", "Landroid/view/View;", "animShow", "getInitialPosition", "getMmInquirer", "getMmListener", "getTopTabLayoutPositionY", "initHeaderView", "initStickyNavLayout", "onAudioResourceAvailableChange", "isAvailable", "onChangeSummaryTabVisible", "onCreate", "onDismissUpdateView", "onHideVideoView", "onMmStatusChange", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onReviewStatusChange", "onShowVideoView", "onStartFind", "onStopFind", "onSwitchToSubtitleTab", "onTopicUpdated", ChatTypeStateKeeper.f135670e, "", "setAudioResourceAvailable", "setReviewBannerStatus", "(Ljava/lang/Integer;)V", "setupMockPlayerViewVisibility", "setupTab", "showSummaryTab", "MmDetailViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.h */
public final class MmDetailViewControl extends MmBaseViewControl<IMmDetailListener, IMmDetailDependency> implements IMmDetailInquirer, IMmDetailListener {

    /* renamed from: a */
    public MmDetailViewHolder f116128a;

    /* renamed from: b */
    public Integer f116129b;

    /* renamed from: c */
    public int f116130c;

    /* renamed from: d */
    public boolean f116131d;

    /* renamed from: e */
    public final IMmViewControlContext f116132e;

    /* renamed from: f */
    public final MmBaseViewControlAdapter<IMmDetailListener, IMmDetailDependency> f116133f;

    /* renamed from: g */
    private MmDetailTabFragmentAdapter f116134g;

    /* renamed from: h */
    private final int[] f116135h = new int[2];

    /* renamed from: i */
    private final MmBaseInfo f116136i;

    /* renamed from: j */
    private MmDetailBannerLayout f116137j;

    /* renamed from: k */
    private MmReviewBanner f116138k;

    /* renamed from: l */
    private TextView f116139l;

    /* renamed from: k */
    public IMmDetailListener mo161243c() {
        return this;
    }

    /* renamed from: l */
    public IMmDetailInquirer mo161244e() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020-R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u0011\u0010&\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmDetailViewControl$MmDetailViewHolder;", "", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/main/MmDetailViewControl;Landroid/view/View;)V", "bannerContainer", "Landroid/widget/FrameLayout;", "getBannerContainer", "()Landroid/widget/FrameLayout;", "detailStickyNavLayout", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailStickyNavLayout;", "getDetailStickyNavLayout", "()Lcom/ss/android/lark/mm/module/detail/main/MmDetailStickyNavLayout;", "mmTranslateBar", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar;", "getMmTranslateBar", "()Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar;", "mmTranslateBarContainer", "getMmTranslateBarContainer", "()Landroid/view/View;", "mmUpdateView", "Lcom/ss/android/lark/mm/widget/MmUpdateView;", "getMmUpdateView", "()Lcom/ss/android/lark/mm/widget/MmUpdateView;", "setMmUpdateView", "(Lcom/ss/android/lark/mm/widget/MmUpdateView;)V", "mockPlayerView", "getMockPlayerView", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "getTabLayout", "()Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "updateContainer", "Landroid/view/ViewGroup;", "getUpdateContainer", "()Landroid/view/ViewGroup;", "videoToolbar", "getVideoToolbar", "videoViewContainer", "getVideoViewContainer", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "initUpdateTipsView", "", "setUpdateContainerPosition", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$a */
    public final class MmDetailViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116140a;

        /* renamed from: b */
        private final UDTabLayout f116141b;

        /* renamed from: c */
        private final ViewPager f116142c;

        /* renamed from: d */
        private final MmDetailStickyNavLayout f116143d;

        /* renamed from: e */
        private final ViewGroup f116144e;

        /* renamed from: f */
        private final FrameLayout f116145f;

        /* renamed from: g */
        private final MmTranslateBar f116146g;

        /* renamed from: h */
        private final View f116147h;

        /* renamed from: i */
        private final ViewGroup f116148i;

        /* renamed from: j */
        private final View f116149j;

        /* renamed from: k */
        private final View f116150k;

        /* renamed from: l */
        private C47150e f116151l;

        /* renamed from: a */
        public final UDTabLayout mo161927a() {
            return this.f116141b;
        }

        /* renamed from: b */
        public final ViewPager mo161928b() {
            return this.f116142c;
        }

        /* renamed from: c */
        public final MmDetailStickyNavLayout mo161929c() {
            return this.f116143d;
        }

        /* renamed from: d */
        public final ViewGroup mo161930d() {
            return this.f116144e;
        }

        /* renamed from: e */
        public final FrameLayout mo161931e() {
            return this.f116145f;
        }

        /* renamed from: f */
        public final View mo161932f() {
            return this.f116147h;
        }

        /* renamed from: g */
        public final ViewGroup mo161933g() {
            return this.f116148i;
        }

        /* renamed from: h */
        public final View mo161934h() {
            return this.f116150k;
        }

        /* renamed from: i */
        public final C47150e mo161935i() {
            return this.f116151l;
        }

        /* renamed from: j */
        public final void mo161936j() {
            C47150e eVar = new C47150e();
            this.f116151l = eVar;
            if (eVar != null) {
                eVar.mo165768a(new View$OnClickListenerC46078a(this));
            }
        }

        /* renamed from: k */
        public final void mo161937k() {
            this.f116148i.setTranslationY(((float) this.f116140a.mo161898a()) - ((float) MmDetailViewControl.m182549a(this.f116140a).f116141b.getHeight()));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.main.h$a$a */
        public static final class View$OnClickListenerC46078a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MmDetailViewHolder f116152a;

            View$OnClickListenerC46078a(MmDetailViewHolder aVar) {
                this.f116152a = aVar;
            }

            public final void onClick(View view) {
                C45855f.m181664c("MmDetailViewControl", "update detail page");
                C47150e i = this.f116152a.mo161935i();
                if (i != null) {
                    i.mo165766a();
                }
                ((IMmDetailDependency) this.f116152a.f116140a.mo161247w()).mo161894c();
                C47083e.m186423a(this.f116152a.f116140a.f116132e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("refresh").mo165413a("fromSource", "modified_tip").mo165421c());
                C47083e.m186423a(this.f116152a.f116140a.f116132e.mo161232n(), "vc_minutes_popup_click", C47086i.m186432a().mo165422d("refresh").mo165423e("none").mo165427i("modified_tip").mo165421c());
            }
        }

        public MmDetailViewHolder(MmDetailViewControl hVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f116140a = hVar;
            View findViewById = view.findViewById(R.id.mMTabLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.mMTabLayout)");
            this.f116141b = (UDTabLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.viewPager);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.viewPager)");
            this.f116142c = (ViewPager) findViewById2;
            View findViewById3 = view.findViewById(R.id.stickyLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.stickyLayout)");
            this.f116143d = (MmDetailStickyNavLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.topViewContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.topViewContainer)");
            this.f116144e = (ViewGroup) findViewById4;
            View findViewById5 = view.findViewById(R.id.reviewContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.reviewContainer)");
            this.f116145f = (FrameLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.translateBar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.translateBar)");
            this.f116146g = (MmTranslateBar) findViewById6;
            View findViewById7 = view.findViewById(R.id.translateBarContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.translateBarContainer)");
            this.f116147h = findViewById7;
            View findViewById8 = view.findViewById(R.id.updateContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.updateContainer)");
            this.f116148i = (ViewGroup) findViewById8;
            View findViewById9 = view.findViewById(R.id.detail_video_toolbar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.detail_video_toolbar)");
            this.f116149j = findViewById9;
            View findViewById10 = hVar.f116132e.mo161233o().findViewById(R.id.mockPlayerView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "vcContext.getRootView().…ById(R.id.mockPlayerView)");
            this.f116150k = findViewById10;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/mm/module/detail/main/MmDetailViewControl$initStickyNavLayout$1", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailStickyNavLayout$IMmStickNavListener;", "onScrollDown", "", "onScrollUp", "onVideoPlayerCompletelyVisible", "isCompletelyVisible", "", "onVideoPlayerVisibilityChange", "isVisible", "stopScroll", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$b */
    public static final class C46079b implements MmDetailStickyNavLayout.AbstractC46077a {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116153a;

        @Override // com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout.AbstractC46077a
        /* renamed from: a */
        public void mo161884a() {
            this.f116153a.f116133f.mo161230c().mo161889a();
        }

        @Override // com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout.AbstractC46077a
        /* renamed from: b */
        public void mo161886b() {
            MmDetailViewControl hVar = this.f116153a;
            hVar.mo161924b(MmDetailViewControl.m182549a(hVar).mo161932f());
        }

        @Override // com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout.AbstractC46077a
        /* renamed from: c */
        public void mo161888c() {
            MmDetailViewControl hVar = this.f116153a;
            hVar.mo161923a(MmDetailViewControl.m182549a(hVar).mo161932f());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46079b(MmDetailViewControl hVar) {
            this.f116153a = hVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout.AbstractC46077a
        /* renamed from: a */
        public void mo161885a(boolean z) {
            this.f116153a.f116133f.mo161230c().mo161891a(z);
        }

        @Override // com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout.AbstractC46077a
        /* renamed from: b */
        public void mo161887b(boolean z) {
            this.f116153a.f116133f.mo161230c().mo161893b(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/detail/main/MmDetailViewControl$setupTab$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$f */
    public static final class RunnableC46083f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116159a;

        /* renamed from: b */
        final /* synthetic */ boolean f116160b;

        RunnableC46083f(MmDetailViewControl hVar, boolean z) {
            this.f116159a = hVar;
            this.f116160b = z;
        }

        public final void run() {
            MmDetailViewControl.m182549a(this.f116159a).mo161928b().setCurrentItem(this.f116159a.mo161899b());
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailInquirer
    /* renamed from: b */
    public int mo161899b() {
        if (!this.f116131d || !((IMmDetailDependency) mo161247w()).mo161895d()) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    public void bf_() {
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161929c().setForceHideTopView(false);
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: f */
    public void mo161904f() {
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161929c().mo161875a();
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: g */
    public void mo161905g() {
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161929c().setForceHideTopView(true);
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: j */
    public void mo161907j() {
        C45855f.m181664c("MmDetailViewControl", "onDismissUpdateView");
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        C47150e i = aVar.mo161935i();
        if (i != null) {
            i.mo165766a();
        }
    }

    /* renamed from: m */
    private final void m182553m() {
        String str;
        MediaType.Companion aVar = MediaType.Companion;
        MmBaseInfo mmBaseInfo = this.f116136i;
        if (mmBaseInfo != null) {
            str = mmBaseInfo.getMediaType();
        } else {
            str = null;
        }
        if (aVar.mo161472a(str) == MediaType.Video) {
            MmDetailViewHolder aVar2 = this.f116128a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            aVar2.mo161934h().setVisibility(0);
            return;
        }
        MmDetailViewHolder aVar3 = this.f116128a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar3.mo161934h().setVisibility(8);
    }

    /* renamed from: o */
    private final void m182555o() {
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161929c().setVisibility(0);
        MmDetailViewHolder aVar2 = this.f116128a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo161929c().setListener(new C46079b(this));
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailInquirer
    /* renamed from: a */
    public int mo161898a() {
        if (this.f116128a == null) {
            return 0;
        }
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161927a().getLocationOnScreen(this.f116135h);
        int i = this.f116135h[1];
        MmDetailViewHolder aVar2 = this.f116128a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return i + aVar2.mo161927a().getHeight();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$c */
    static final class RunnableC46080c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116154a;

        /* renamed from: b */
        final /* synthetic */ int f116155b;

        /* renamed from: c */
        final /* synthetic */ boolean f116156c;

        RunnableC46080c(MmDetailViewControl hVar, int i, boolean z) {
            this.f116154a = hVar;
            this.f116155b = i;
            this.f116156c = z;
        }

        public final void run() {
            int i = this.f116155b;
            if (i == 0) {
                MmDetailViewControl.m182549a(this.f116154a).mo161928b().setCurrentItem(0);
            } else if (i != 1) {
                if (i == 2) {
                    MmDetailViewControl.m182549a(this.f116154a).mo161928b().setCurrentItem(2);
                }
            } else if (this.f116154a.f116131d) {
                MmDetailViewControl.m182549a(this.f116154a).mo161928b().setCurrentItem(1);
            } else {
                MmDetailViewControl.m182549a(this.f116154a).mo161928b().setCurrentItem(2);
            }
            this.f116154a.f116131d = this.f116156c;
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        Integer num;
        String videoUrlWithLocal;
        super.be_();
        this.f116128a = new MmDetailViewHolder(this, this.f116132e.mo161233o());
        m182553m();
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161936j();
        m182554n();
        m182555o();
        m182551b(this.f116131d);
        MmBaseInfo mmBaseInfo = this.f116136i;
        if (mmBaseInfo != null) {
            num = Integer.valueOf(mmBaseInfo.getReviewStatus());
        } else {
            num = null;
        }
        m182550a(num);
        MmBaseInfo mmBaseInfo2 = this.f116136i;
        boolean z = true;
        if (mmBaseInfo2 == null || (videoUrlWithLocal = mmBaseInfo2.getVideoUrlWithLocal()) == null || !(!StringsKt.isBlank(videoUrlWithLocal))) {
            z = false;
        }
        m182552c(z);
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: i */
    public void mo161906i() {
        MmBaseInfo b;
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        int currentItem = aVar.mo161928b().getCurrentItem();
        boolean z = true;
        if (!C45865a.m181720c() || (b = ((IMmDetailDependency) mo161247w()).mo161892b()) == null || !b.isHasSummary()) {
            z = false;
        }
        if (z != this.f116131d) {
            m182551b(z);
            MmDetailViewHolder aVar2 = this.f116128a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            aVar2.mo161928b().postDelayed(new RunnableC46080c(this, currentItem, z), 100);
        }
    }

    /* renamed from: n */
    private final void m182554n() {
        View view;
        MmBaseInfo b = ((IMmDetailDependency) mo161247w()).mo161892b();
        if (b != null) {
            if (b.isVideoType()) {
                LayoutInflater from = LayoutInflater.from(this.f116132e.mo161232n());
                MmDetailViewHolder aVar = this.f116128a;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                }
                view = from.inflate(R.layout.mm_detail_video_header, aVar.mo161930d(), true);
            } else {
                LayoutInflater from2 = LayoutInflater.from(this.f116132e.mo161232n());
                MmDetailViewHolder aVar2 = this.f116128a;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                }
                view = from2.inflate(R.layout.mm_detail_audio_header, aVar2.mo161930d(), true);
            }
            TextView textView = (TextView) view.findViewById(R.id.titleTv);
            this.f116139l = textView;
            if (textView != null) {
                textView.setText(b.getTopic());
            }
            TextView textView2 = (TextView) view.findViewById(R.id.createdTimeTv);
            if (textView2 != null) {
                textView2.setText(FormatUtil.f118607a.mo165484b(Long.valueOf(b.getStartTime())));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$d */
    static final class RunnableC46081d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116157a;

        /* renamed from: b */
        final /* synthetic */ PermissionStatus f116158b;

        RunnableC46081d(MmDetailViewControl hVar, PermissionStatus permissionStatus) {
            this.f116157a = hVar;
            this.f116158b = permissionStatus;
        }

        public final void run() {
            boolean z;
            int i;
            int i2;
            if (this.f116158b != null && this.f116157a.f116128a != null) {
                MmBaseInfo b = ((IMmDetailDependency) this.f116157a.mo161247w()).mo161892b();
                boolean z2 = false;
                if (b == null || !b.isUncompletedRecordingType()) {
                    z = false;
                } else {
                    z = true;
                }
                C45855f.m181664c("MmDetailViewControl", "[onMmStatusChange] isRecordingStatusChangeToCompletedStatus: " + z);
                boolean f = ((IMmDetailDependency) this.f116157a.mo161247w()).mo161897f();
                boolean e = ((IMmDetailDependency) this.f116157a.mo161247w()).mo161896e();
                C45855f.m181664c("MmDetailViewControl", "[onMmStatusChange] isEditMode: " + e);
                if (!z && !f && !e) {
                    Integer lastEditVersion = this.f116158b.getLastEditVersion();
                    int i3 = -1;
                    if (lastEditVersion != null) {
                        i = lastEditVersion.intValue();
                    } else {
                        i = -1;
                    }
                    if (this.f116157a.f116130c != -1 && i > this.f116157a.f116130c) {
                        z2 = true;
                    }
                    boolean isChangeSummary = this.f116158b.isChangeSummary();
                    C45855f.m181664c("MmDetailViewControl", "[onMmStatusChange] isVersionUpdate:" + z2 + ", isSummaryUpdate:" + isChangeSummary);
                    if (z2 || isChangeSummary) {
                        MmDetailViewControl.m182549a(this.f116157a).mo161937k();
                        C47150e i4 = MmDetailViewControl.m182549a(this.f116157a).mo161935i();
                        if (i4 != null) {
                            i4.mo165767a(this.f116157a.f116132e.mo161232n(), MmDetailViewControl.m182549a(this.f116157a).mo161933g());
                        }
                    }
                    MmDetailViewControl hVar = this.f116157a;
                    Integer lastEditVersion2 = this.f116158b.getLastEditVersion();
                    if (lastEditVersion2 != null) {
                        i2 = lastEditVersion2.intValue();
                    } else {
                        i2 = -1;
                    }
                    hVar.f116130c = i2;
                    MmDetailViewControl hVar2 = this.f116157a;
                    Integer objectStatus = this.f116158b.getObjectStatus();
                    if (objectStatus != null) {
                        i3 = objectStatus.intValue();
                    }
                    hVar2.f116129b = Integer.valueOf(i3);
                }
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: a */
    public void mo161902a(boolean z) {
        m182552c(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "", "invoke", "com/ss/android/lark/mm/module/detail/main/MmDetailViewControl$setReviewBannerStatus$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$e */
    public static final class C46082e extends Lambda implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
        final /* synthetic */ Integer $status$inlined;
        final /* synthetic */ MmDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46082e(MmDetailViewControl hVar, Integer num) {
            super(1);
            this.this$0 = hVar;
            this.$status$inlined = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
            invoke((Function1<? super Boolean, Unit>) function1);
            return Unit.INSTANCE;
        }

        public final void invoke(Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "it");
            this.this$0.f116133f.mo161230c().mo161890a(function1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MmDetailViewHolder m182549a(MmDetailViewControl hVar) {
        MmDetailViewHolder aVar = hVar.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: a */
    public void mo161900a(PermissionStatus permissionStatus) {
        C45859k.m181685a(new RunnableC46081d(this, permissionStatus));
    }

    /* renamed from: b */
    public final void mo161924b(View view) {
        view.animate().translationY((float) view.getHeight()).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200).start();
    }

    /* renamed from: a */
    private final void m182550a(Integer num) {
        MmBaseInfo mmBaseInfo;
        if (num == null) {
            return;
        }
        if (num.intValue() == ReviewStatus.Passed.getValue() || (mmBaseInfo = this.f116136i) == null || mmBaseInfo.isOwner()) {
            MmReviewBanner mmReviewBanner = new MmReviewBanner(this.f116132e.mo161232n(), null, 0, 6, null);
            this.f116138k = mmReviewBanner;
            MmDetailViewHolder aVar = this.f116128a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            ReviewStatus a = ReviewStatus.Companion.mo161616a(num.intValue());
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a2.getHostDepend();
            Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
            String g = hostDepend.mo144639g();
            Intrinsics.checkExpressionValueIsNotNull(g, "MmDepend.impl().hostDepend.appName");
            mmReviewBanner.mo161451a(aVar.mo161931e(), a, g, new C46082e(this, num));
        }
    }

    /* renamed from: c */
    private final void m182552c(boolean z) {
        C45855f.m181663b("MmDetailViewControl", "setAudioResourceAvailable: " + z);
        if (this.f116128a != null) {
            if (z) {
                MmDetailBannerLayout mmDetailBannerLayout = this.f116137j;
                if (mmDetailBannerLayout != null) {
                    MmDetailViewHolder aVar = this.f116128a;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                    }
                    mmDetailBannerLayout.mo161449b(aVar.mo161931e());
                    return;
                }
                return;
            }
            MmReviewBanner mmReviewBanner = this.f116138k;
            if (mmReviewBanner != null) {
                MmDetailViewHolder aVar2 = this.f116128a;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                }
                mmReviewBanner.mo161453b(aVar2.mo161931e());
            }
            MmDetailBannerLayout mmDetailBannerLayout2 = new MmDetailBannerLayout(this.f116132e.mo161232n(), null, 0, 6, null);
            this.f116137j = mmDetailBannerLayout2;
            if (mmDetailBannerLayout2 != null) {
                MmDetailViewHolder aVar3 = this.f116128a;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
                }
                mmDetailBannerLayout2.mo161448a(aVar3.mo161931e());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/detail/main/MmDetailViewControl$setupTab$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.h$g */
    public static final class C46084g implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControl f116161a;

        /* renamed from: b */
        final /* synthetic */ boolean f116162b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("switch_tab").mo165413a("tab_type", "transcript").mo165421c());
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("switch_tab").mo165423e("none").mo165430l("transcript").mo165421c());
            } else if (!this.f116162b || i != 1) {
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("switch_tab").mo165413a("tab_type", "detail").mo165421c());
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("switch_tab").mo165423e("none").mo165430l("detail").mo165421c());
            } else {
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("switch_tab").mo165413a("tab_type", "summary").mo165421c());
                C47083e.m186423a(this.f116161a.f116132e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("switch_tab").mo165423e("none").mo165430l("minutes").mo165421c());
            }
        }

        C46084g(MmDetailViewControl hVar, boolean z) {
            this.f116161a = hVar;
            this.f116162b = z;
        }
    }

    /* renamed from: b */
    private final void m182551b(boolean z) {
        FragmentManager supportFragmentManager;
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161927a().removeAllTabs();
        MmDetailViewHolder aVar2 = this.f116128a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo161928b().addOnPageChangeListener(new C46084g(this, z));
        FragmentActivity a = C47107a.m186565a(this.f116132e.mo161232n());
        if (!(a == null || (supportFragmentManager = a.getSupportFragmentManager()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            this.f116134g = new MmDetailTabFragmentAdapter(supportFragmentManager, z);
            MmDetailViewHolder aVar3 = this.f116128a;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            ViewPager b = aVar3.mo161928b();
            MmDetailTabFragmentAdapter gVar = this.f116134g;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            b.setAdapter(gVar);
            MmDetailViewHolder aVar4 = this.f116128a;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            ViewPager b2 = aVar4.mo161928b();
            MmDetailTabFragmentAdapter gVar2 = this.f116134g;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            b2.setOffscreenPageLimit(gVar2.getCount());
            C45859k.m181686a(new RunnableC46083f(this, z), 100);
        }
        MmDetailViewHolder aVar5 = this.f116128a;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        UDTabLayout a2 = aVar5.mo161927a();
        MmDetailViewHolder aVar6 = this.f116128a;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        new UDTabLayoutCoordinator(a2, aVar6.mo161928b()).attach();
    }

    /* renamed from: a */
    public final void mo161923a(View view) {
        view.animate().translationY((float) C57582a.m223600a(2)).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200).start();
    }

    @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailListener
    /* renamed from: a */
    public void mo161901a(String str) {
        TextView textView = this.f116139l;
        if (textView != null) {
            textView.setText(str);
        }
        MmDetailViewHolder aVar = this.f116128a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161929c().requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmDetailListener, IMmDetailDependency> jVar) {
        super(gVar, jVar);
        Integer num;
        int i;
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f116132e = gVar;
        this.f116133f = jVar;
        MmBaseInfo b = jVar.mo161230c().mo161892b();
        this.f116136i = b;
        if (b != null) {
            num = Integer.valueOf(b.getObjectStatus());
        } else {
            num = null;
        }
        this.f116129b = num;
        if (b != null) {
            i = b.getObjectVersion();
        } else {
            i = -1;
        }
        this.f116130c = i;
        boolean z = true;
        this.f116131d = (!C45865a.m181720c() || b == null || !b.isHasSummary()) ? false : z;
    }
}
