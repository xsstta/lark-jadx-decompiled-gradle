package com.ss.android.lark.moments.impl.notice;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.badge.UDBadgeAlign;
import com.larksuite.component.universe_design.badge.UDBadgeDrawable;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.pb.moments_entities.NotificationCount;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "coordinator", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "getCoordinator", "()Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "coordinator$delegate", "Lkotlin/Lazy;", "fragmentList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/base/fragment/FragmentInfo;", "Lkotlin/collections/ArrayList;", "isInitData", "", "finish", "", "hideBadge", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "pageIndex", "", "initBadge", "initData", "initTitleBar", "initView", "initViewPager", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBadge", "count", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsNotificationActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public ArrayList<C29527a> f120369a = new ArrayList<>();

    /* renamed from: b */
    public boolean f120370b = true;

    /* renamed from: c */
    private final Lazy f120371c = LazyKt.lazy(new C47782a(this));

    /* renamed from: d */
    private HashMap f120372d;

    /* renamed from: d */
    private final UDTabLayoutCoordinator m188858d() {
        return (UDTabLayoutCoordinator) this.f120371c.getValue();
    }

    /* renamed from: a */
    public Context mo167508a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo167509a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo167510a(int i) {
        if (this.f120372d == null) {
            this.f120372d = new HashMap();
        }
        View view = (View) this.f120372d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120372d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo167511a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m188855a(this, context);
    }

    /* renamed from: b */
    public void mo167514b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo167515c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m188853a(this, configuration);
    }

    public AssetManager getAssets() {
        return m188857c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m188854a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m188856b(this);
    }

    /* renamed from: f */
    private final void m188860f() {
        m188861g();
        m188862h();
        m188863i();
    }

    /* renamed from: i */
    private final void m188863i() {
        MomentsNotificationManager.f120258a.mo167379a(this, new C47784c(this));
    }

    /* renamed from: g */
    private final void m188861g() {
        ((CommonTitleBar) mo167510a(R.id.notice_title)).setTitle(UIHelper.getString(R.string.Lark_Community_NotificationTab));
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        MomentsHitPointNew.Companion.m188108a(MomentsHitPointNew.f119721a, (String) null, "others", "moments_feed_page_view", (String) null, 8, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.MomentsNotificationActivity$a */
    static final class C47782a extends Lambda implements Function0<UDTabLayoutCoordinator> {
        final /* synthetic */ MomentsNotificationActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47782a(MomentsNotificationActivity momentsNotificationActivity) {
            super(0);
            this.this$0 = momentsNotificationActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDTabLayoutCoordinator invoke() {
            UDTabLayout uDTabLayout = (UDTabLayout) this.this$0.mo167510a(R.id.tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tabLayout");
            ViewPager viewPager = (ViewPager) this.this$0.mo167510a(R.id.notice_vp);
            Intrinsics.checkExpressionValueIsNotNull(viewPager, "notice_vp");
            return new UDTabLayoutCoordinator(uDTabLayout, viewPager);
        }
    }

    /* renamed from: e */
    private final void m188859e() {
        this.f120369a.add(new C29527a(MomentsNotificationFragment.f120403d.mo167545a(1), UIHelper.getString(R.string.Lark_Community_NotificationInteractive)));
        this.f120369a.add(new C29527a(MomentsNotificationFragment.f120403d.mo167545a(2), UIHelper.getString(R.string.Lark_Community_NotificationEmoji)));
    }

    /* renamed from: h */
    private final void m188862h() {
        ViewParent viewParent;
        ViewParent viewParent2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        MomentsNotificationPagerAdapter cVar = new MomentsNotificationPagerAdapter(supportFragmentManager, this.f120369a);
        ViewPager viewPager = (ViewPager) mo167510a(R.id.notice_vp);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "notice_vp");
        viewPager.setAdapter(cVar);
        m188858d().attach();
        UDTab tabAt = ((UDTabLayout) mo167510a(R.id.tabLayout)).getTabAt(0);
        UDTab tabAt2 = ((UDTabLayout) mo167510a(R.id.tabLayout)).getTabAt(1);
        TextView f = tabAt.mo91345f();
        ViewGroup viewGroup = null;
        if (f != null) {
            viewParent = f.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewParent parent = viewGroup2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup3 = (ViewGroup) parent;
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
        TextView f2 = tabAt2.mo91345f();
        if (f2 != null) {
            viewParent2 = f2.getParent();
        } else {
            viewParent2 = null;
        }
        if (!(viewParent2 instanceof ViewGroup)) {
            viewParent2 = null;
        }
        ViewGroup viewGroup4 = (ViewGroup) viewParent2;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            viewGroup4.setClipToPadding(false);
            ViewParent parent2 = viewGroup4.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup = parent2;
            }
            ViewGroup viewGroup5 = viewGroup;
            if (viewGroup5 != null) {
                viewGroup5.setClipChildren(false);
                viewGroup5.setClipToPadding(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/notice/MomentsNotificationActivity$$special$$inlined$onSingleClickListener$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.MomentsNotificationActivity$b */
    public static final class C47783b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationActivity f120373a;

        /* renamed from: b */
        final /* synthetic */ UDTab f120374b;

        /* renamed from: c */
        final /* synthetic */ int f120375c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ((ViewPager) this.f120373a.mo167510a(R.id.notice_vp)).setCurrentItem(this.f120375c, false);
        }

        public C47783b(MomentsNotificationActivity momentsNotificationActivity, UDTab bVar, int i) {
            this.f120373a = momentsNotificationActivity;
            this.f120374b = bVar;
            this.f120375c = i;
        }
    }

    /* renamed from: a */
    public static Resources m188854a(MomentsNotificationActivity momentsNotificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsNotificationActivity);
        }
        return momentsNotificationActivity.mo167509a();
    }

    /* renamed from: c */
    public static AssetManager m188857c(MomentsNotificationActivity momentsNotificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsNotificationActivity);
        }
        return momentsNotificationActivity.mo167515c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/notice/MomentsNotificationActivity$$special$$inlined$onSingleClickListener$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.MomentsNotificationActivity$d */
    public static final class C47785d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationActivity f120377a;

        /* renamed from: b */
        final /* synthetic */ UDTab f120378b;

        /* renamed from: c */
        final /* synthetic */ int f120379c;

        /* renamed from: d */
        final /* synthetic */ int f120380d;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ((ViewPager) this.f120377a.mo167510a(R.id.notice_vp)).setCurrentItem(this.f120380d, false);
            Fragment fragment = this.f120377a.f120369a.get(this.f120380d).f73820a;
            if (!(fragment instanceof MomentsNotificationFragment)) {
                fragment = null;
            }
            MomentsNotificationFragment bVar = (MomentsNotificationFragment) fragment;
            if (bVar != null) {
                bVar.mo167543i();
            }
        }

        public C47785d(MomentsNotificationActivity momentsNotificationActivity, UDTab bVar, int i, int i2) {
            this.f120377a = momentsNotificationActivity;
            this.f120378b = bVar;
            this.f120379c = i;
            this.f120380d = i2;
        }
    }

    /* renamed from: b */
    public static void m188856b(MomentsNotificationActivity momentsNotificationActivity) {
        momentsNotificationActivity.mo167514b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsNotificationActivity momentsNotificationActivity2 = momentsNotificationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsNotificationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_notification);
        getWindow().setBackgroundDrawable(getResources().getDrawable(R.color.bg_body));
        m188859e();
        m188860f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.MomentsNotificationActivity$c */
    public static final class C47784c<T> implements AbstractC1178x<NotificationCount> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationActivity f120376a;

        C47784c(MomentsNotificationActivity momentsNotificationActivity) {
            this.f120376a = momentsNotificationActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void onChanged(NotificationCount notificationCount) {
            int i;
            int i2;
            int i3;
            String str;
            Integer num;
            Integer num2;
            if (notificationCount == null || (num2 = notificationCount.mmessage_count) == null) {
                i = 0;
            } else {
                i = num2.intValue();
            }
            if (notificationCount == null || (num = notificationCount.mreaction_count) == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            if (i > 0) {
                MomentsNotificationActivity momentsNotificationActivity = this.f120376a;
                momentsNotificationActivity.mo167513a(((UDTabLayout) momentsNotificationActivity.mo167510a(R.id.tabLayout)).getTabAt(0), i, 0);
            } else {
                MomentsNotificationActivity momentsNotificationActivity2 = this.f120376a;
                momentsNotificationActivity2.mo167512a(((UDTabLayout) momentsNotificationActivity2.mo167510a(R.id.tabLayout)).getTabAt(0), 0);
            }
            if (i2 > 0) {
                MomentsNotificationActivity momentsNotificationActivity3 = this.f120376a;
                momentsNotificationActivity3.mo167513a(((UDTabLayout) momentsNotificationActivity3.mo167510a(R.id.tabLayout)).getTabAt(1), i2, 1);
            } else {
                MomentsNotificationActivity momentsNotificationActivity4 = this.f120376a;
                momentsNotificationActivity4.mo167512a(((UDTabLayout) momentsNotificationActivity4.mo167510a(R.id.tabLayout)).getTabAt(1), 1);
            }
            if (this.f120376a.f120370b) {
                if (i != 0 || i2 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                ((ViewPager) this.f120376a.mo167510a(R.id.notice_vp)).setCurrentItem(i3, false);
                MomentsAppreciableHitPoint.f119684a.mo166754f(i3 ^ 1);
                this.f120376a.f120370b = false;
                MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "notification", "moments_notification_page_view", (String) null, (String) null, Integer.valueOf(i + i2), 12, (Object) null);
                MomentsHitPoint.Companion aVar = MomentsHitPoint.f119720a;
                if (i != 0 || i2 == 0) {
                    str = "notification_interaction";
                } else {
                    str = "notification_emoji";
                }
                aVar.mo166841b(str);
            }
        }
    }

    /* renamed from: a */
    public static void m188855a(MomentsNotificationActivity momentsNotificationActivity, Context context) {
        momentsNotificationActivity.mo167511a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsNotificationActivity);
        }
    }

    /* renamed from: a */
    public static Context m188853a(MomentsNotificationActivity momentsNotificationActivity, Configuration configuration) {
        Context a = momentsNotificationActivity.mo167508a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo167512a(UDTab bVar, int i) {
        ViewParent viewParent;
        TextView f = bVar.mo91345f();
        if (f != null) {
            viewParent = f.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 == null) {
                viewGroup2 = viewGroup;
            }
            ViewGroupOverlay overlay = viewGroup2.getOverlay();
            if (overlay != null) {
                overlay.clear();
            }
            viewGroup.setTag(R.id.ud_badge_drawable_tag, null);
            TextView f2 = bVar.mo91345f();
            if (f2 != null) {
                f2.setOnClickListener(new C47783b(this, bVar, i));
            }
        }
    }

    /* renamed from: a */
    public final void mo167513a(UDTab bVar, int i, int i2) {
        ViewParent viewParent;
        UDBadgeDrawable.DrawableEditor a;
        UDBadgeDrawable.DrawableEditor a_;
        UDBadgeDrawable.DrawableEditor a2;
        UDBadgeDrawable.DrawableEditor bVar2;
        TextView f = bVar.mo91345f();
        ViewParent viewParent2 = null;
        if (f != null) {
            viewParent = f.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            UDBadgeDrawable b = bVar.mo91338b(viewGroup);
            if (!(b == null || (a = b.mo90263a()) == null || (a_ = a.a_(2131887093)) == null || (a2 = a_.mo90272a(UDBadgeAlign.RIGHT_TOP)) == null || (bVar2 = (UDBadgeDrawable.DrawableEditor) a2.mo90207a(String.valueOf(i))) == null)) {
                bVar2.mo90273a();
            }
            ViewParent parent = viewGroup.getParent();
            if (parent instanceof ViewGroup) {
                viewParent2 = parent;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent2;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            }
            TextView f2 = bVar.mo91345f();
            if (f2 != null) {
                f2.setOnClickListener(new C47785d(this, bVar, i, i2));
            }
            viewGroup.invalidate();
        }
    }
}
