package com.ss.android.lark.moments.impl.categorydetail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.transition.Transition;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.MomentsPreviewHelper;
import com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.feed.TitleApi;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.MomentsFeedPagerAdapter;
import com.ss.android.lark.moments.impl.mainview.TabFragmentInfo;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.span.UrlInfo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;

public final class MomentsCategoryDetailActivity extends BaseFragmentActivity {

    /* renamed from: d */
    public static final Companion f119067d = new Companion(null);

    /* renamed from: a */
    public AppBarStateChangeListener.State f119068a = AppBarStateChangeListener.State.EXPANDED;

    /* renamed from: b */
    public MomentsFeedPagerAdapter f119069b;

    /* renamed from: c */
    public C25969c f119070c = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: e */
    private final Lazy f119071e = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CategoryDetailViewModel.class), new MomentsCategoryDetailActivity$$special$$inlined$viewModels$2(this), new MomentsCategoryDetailActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: f */
    private String f119072f;

    /* renamed from: g */
    private final C47226t f119073g = new C47226t(this);

    /* renamed from: h */
    private ArrayList<TabFragmentInfo> f119074h = new ArrayList<>();

    /* renamed from: i */
    private C25969c f119075i = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: j */
    private final C47219m f119076j = new C47219m(this);

    /* renamed from: k */
    private final Lazy f119077k = LazyKt.lazy(new C47208c(this));

    /* renamed from: l */
    private final Lazy f119078l = LazyKt.lazy(C47207b.INSTANCE);

    /* renamed from: m */
    private final Lazy f119079m = LazyKt.lazy(new C47209d(this));

    /* renamed from: n */
    private HashMap f119080n;

    /* renamed from: g */
    private final FlexboxLayoutManager m187053g() {
        return (FlexboxLayoutManager) this.f119077k.getValue();
    }

    /* renamed from: h */
    private final CategoryAdminAdapter m187054h() {
        return (CategoryAdminAdapter) this.f119078l.getValue();
    }

    /* renamed from: i */
    private final DescriptionSuffixHelper m187055i() {
        return (DescriptionSuffixHelper) this.f119079m.getValue();
    }

    /* renamed from: a */
    public Context mo165961a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo165962a(int i) {
        if (this.f119080n == null) {
            this.f119080n = new HashMap();
        }
        View view = (View) this.f119080n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119080n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CategoryDetailViewModel mo165963a() {
        return (CategoryDetailViewModel) this.f119071e.getValue();
    }

    /* renamed from: a */
    public void mo165964a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m187046a(this, context);
    }

    /* renamed from: b */
    public Resources mo165968b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo165969c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m187044a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo165971d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m187050c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m187045a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m187048b(this);
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo165973a(Context context, Category category) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(category, "category");
            String str = category.category_id;
            if (str != null) {
                mo165974a(context, str, category.name, category.icon_key);
            }
        }

        /* renamed from: a */
        public final void mo165974a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "categoryId");
            Intent intent = new Intent(context, MomentsCategoryDetailActivity.class);
            intent.putExtra("category_id", str);
            if (str2 != null) {
                intent.putExtra("category_name", str2);
            }
            if (str3 != null) {
                intent.putExtra("category_icon_key", str3);
            }
            C47282k.m187257a(context, intent);
        }

        /* renamed from: a */
        public static /* synthetic */ void m187067a(Companion aVar, Context context, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            aVar.mo165974a(context, str, str2, str3);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$m */
    public static final class C47219m implements MomentsFeedFragment.OutPageApi {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119091a;

        @Override // com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OutPageApi
        /* renamed from: b */
        public void mo165983b() {
            MomentsFeedFragment.OutPageApi.C47466a.m188170a(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OutPageApi
        /* renamed from: a */
        public void mo165982a() {
            this.f119091a.mo165963a().m270851getCategoryDetail();
        }

        C47219m(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119091a = momentsCategoryDetailActivity;
        }
    }

    /* renamed from: a */
    public final void mo165967a(String str, ArrayList<Pair<Integer, Integer>> arrayList) {
        boolean z;
        String str2;
        if (arrayList.size() > 1) {
            UDTabLayout uDTabLayout = (UDTabLayout) mo165962a(R.id.tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tabLayout");
            uDTabLayout.setVisibility(0);
            ((ViewPager) mo165962a(R.id.viewPager)).setBackgroundColor(UIUtils.getColor(this, R.color.bg_body));
            z = false;
        } else {
            UDTabLayout uDTabLayout2 = (UDTabLayout) mo165962a(R.id.tabLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDTabLayout2, "tabLayout");
            uDTabLayout2.setVisibility(8);
            ((ViewPager) mo165962a(R.id.viewPager)).setBackgroundResource(R.drawable.moments_rec_bg);
            z = true;
        }
        this.f119074h.clear();
        for (T t : arrayList) {
            int intValue = ((Number) t.getFirst()).intValue();
            Integer num = (Integer) t.getSecond();
            if (num == null) {
                str2 = "";
            } else {
                str2 = UIUtils.getString(this, num.intValue());
            }
            ArrayList<TabFragmentInfo> arrayList2 = this.f119074h;
            Intrinsics.checkExpressionValueIsNotNull(str2, "title");
            arrayList2.add(new TabFragmentInfo(str, str2, intValue, this.f119073g, this.f119076j, null, "value_from_category", null, z, SmActions.ACTION_ONTHECALL_EXIT, null));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        MomentsFeedPagerAdapter cVar = new MomentsFeedPagerAdapter(supportFragmentManager, true);
        cVar.mo167402a().clear();
        cVar.mo167402a().addAll(this.f119074h);
        this.f119069b = cVar;
        ViewPager viewPager = (ViewPager) mo165962a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
        viewPager.setAdapter(cVar);
        UDTabLayout uDTabLayout3 = (UDTabLayout) mo165962a(R.id.tabLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout3, "tabLayout");
        ViewPager viewPager2 = (ViewPager) mo165962a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "viewPager");
        new UDTabLayoutCoordinator(uDTabLayout3, viewPager2).attach();
        int i = 0;
        for (T t2 : cVar.mo167402a()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((UDTabLayout) mo165962a(R.id.tabLayout)).getTabAt(i).mo91341c().setOnClickListener(new View$OnClickListenerC47225s(i, this, cVar));
            i = i2;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$b */
    static final class C47207b extends Lambda implements Function0<CategoryAdminAdapter> {
        public static final C47207b INSTANCE = new C47207b();

        C47207b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CategoryAdminAdapter invoke() {
            return new CategoryAdminAdapter();
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$t */
    public static final class C47226t implements TitleApi {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119114a;

        @Override // com.ss.android.lark.moments.impl.feed.TitleApi
        /* renamed from: a */
        public AppBarStateChangeListener.State mo165985a() {
            return this.f119114a.f119068a;
        }

        C47226t(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119114a = momentsCategoryDetailActivity;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$c */
    static final class C47208c extends Lambda implements Function0<FlexboxLayoutManager> {
        final /* synthetic */ MomentsCategoryDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47208c(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            super(0);
            this.this$0 = momentsCategoryDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FlexboxLayoutManager invoke() {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.this$0, 0);
            flexboxLayoutManager.mo72862d(1);
            return flexboxLayoutManager;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f119075i.mo92349b();
        super.onDestroy();
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$d */
    static final class C47209d extends Lambda implements Function0<DescriptionSuffixHelper> {
        final /* synthetic */ MomentsCategoryDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47209d(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            super(0);
            this.this$0 = momentsCategoryDetailActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DescriptionSuffixHelper invoke() {
            TextView textView = (TextView) this.this$0.mo165962a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvDescription");
            DescriptionSuffixHelper iVar = new DescriptionSuffixHelper(textView);
            iVar.mo166037b("..." + UIUtils.getString(this.this$0, R.string.Lark_Community_More));
            Transition g = iVar.mo166044g();
            if (g != null) {
                g.mo7878a(300L);
            }
            ViewParent parent = iVar.mo166046i().getParent();
            Intrinsics.checkExpressionValueIsNotNull(parent, "this.textView.parent");
            ViewParent parent2 = parent.getParent();
            Intrinsics.checkExpressionValueIsNotNull(parent2, "this.textView.parent.parent");
            ViewParent parent3 = parent2.getParent();
            if (parent3 != null) {
                iVar.mo166032a((ViewGroup) parent3);
                return iVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: e */
    private final void m187051e() {
        MomentsCategoryDetailActivity momentsCategoryDetailActivity = this;
        mo165963a().getCategoryDetail().mo5923a(momentsCategoryDetailActivity, new C47211f(this));
        mo165963a().getBackgroundImage().mo5923a(momentsCategoryDetailActivity, new C47212g(this));
        mo165963a().getShowErrorPage().mo5923a(momentsCategoryDetailActivity, new C47213h(this));
        mo165963a().getRefreshDetail().mo5923a(momentsCategoryDetailActivity, new C47214i(this));
    }

    /* renamed from: j */
    private final void m187056j() {
        Drawable findDrawableByLayerId;
        ((UDShadowLayout) mo165962a(R.id.ivCreatePost)).setOnClickListener(new C47210e(this));
        ImageView imageView = (ImageView) mo165962a(R.id.create_bt);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "create_bt");
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.add_bold)) != null) {
            findDrawableByLayerId.setTint(UIUtils.getColor(this, R.color.static_white));
        }
    }

    /* renamed from: f */
    private final void m187052f() {
        MomentsCategoryDetailActivity momentsCategoryDetailActivity = this;
        setLightTextStatusBar(UIUtils.getColor(momentsCategoryDetailActivity, R.color.lkui_transparent));
        StatusBarUtil.setTransparentForImageView(this, (FrameLayout) mo165962a(R.id.frame_container), (RelativeLayout) mo165962a(R.id.page_error_container));
        ((ImageView) mo165962a(R.id.background)).setBackgroundColor(Color.parseColor("#808080"));
        ImageView imageView = (ImageView) mo165962a(R.id.background);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "background");
        imageView.setMinimumHeight(DeviceUtils.getScreenWidth(momentsCategoryDetailActivity) * 2);
        ((ImageView) mo165962a(R.id.icBack)).setImageDrawable(UDIconUtils.getIconDrawable(momentsCategoryDetailActivity, (int) R.drawable.ud_icon_left_outlined, UIHelper.getColor(R.color.static_white)));
        ((ImageView) mo165962a(R.id.icBack)).setOnClickListener(new C47218l(this));
        ((TextView) mo165962a(R.id.titleName)).setTextColor(C25653b.m91894a(momentsCategoryDetailActivity, R.color.static_white, BitmapDescriptorFactory.HUE_RED));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo165962a(R.id.titleIcon);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "titleIcon");
        lKUIRoundedImageView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo165962a(R.id.headerView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "headerView");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            layoutParams2.mo76392a(1);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo165962a(R.id.headerView);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "headerView");
            constraintLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$e */
    public static final class C47210e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119081a;

        C47210e(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119081a = momentsCategoryDetailActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post_edit", "moments_edit_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            Intent intent = new Intent(this.f119081a, MomentsPublishActivity.class);
            intent.putExtra("default_selected_category_id", this.f119081a.mo165963a().getCategoryId());
            MomentsFeedPagerAdapter cVar = this.f119081a.f119069b;
            Fragment fragment = null;
            Integer num = null;
            if (cVar != null) {
                UDTabLayout uDTabLayout = (UDTabLayout) this.f119081a.mo165962a(R.id.tabLayout);
                if (uDTabLayout != null) {
                    num = Integer.valueOf(uDTabLayout.getSelectPosition());
                }
                fragment = cVar.mo167401a(num);
            }
            if (!C47282k.m187260a(fragment, intent, 211)) {
                this.f119081a.startActivityForResult(intent, 211);
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$j */
    public static final class C47216j extends AppBarStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119087a;

        C47216j(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119087a = momentsCategoryDetailActivity;
        }

        @Override // com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener
        /* renamed from: a */
        public void mo165980a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state != null) {
                this.f119087a.f119068a = state;
                int i = C47253k.f119186a[state.ordinal()];
                if (i == 1) {
                    ((TextView) this.f119087a.mo165962a(R.id.titleName)).setTextColor(C25653b.m91894a(this.f119087a, R.color.static_white, BitmapDescriptorFactory.HUE_RED));
                    LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f119087a.mo165962a(R.id.titleIcon);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "titleIcon");
                    lKUIRoundedImageView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                } else if (i == 2) {
                    ((TextView) this.f119087a.mo165962a(R.id.titleName)).setTextColor(UIUtils.getColor(this.f119087a, R.color.static_white));
                    LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) this.f119087a.mo165962a(R.id.titleIcon);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "titleIcon");
                    lKUIRoundedImageView22.setAlpha(1.0f);
                }
            }
        }

        @Override // com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener, com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            super.onOffsetChanged(appBarLayout, i);
            int dp2px = UIUtils.dp2px(this.f119087a, 36.0f);
            float abs = Math.abs((float) i) / ((float) dp2px);
            if (i > (-dp2px)) {
                ((TextView) this.f119087a.mo165962a(R.id.titleName)).setTextColor(C25653b.m91894a(this.f119087a, R.color.static_white, abs));
                LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f119087a.mo165962a(R.id.titleIcon);
                Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "titleIcon");
                lKUIRoundedImageView2.setAlpha(abs);
                return;
            }
            ((TextView) this.f119087a.mo165962a(R.id.titleName)).setTextColor(UIUtils.getColor(this.f119087a, R.color.static_white));
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) this.f119087a.mo165962a(R.id.titleIcon);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "titleIcon");
            lKUIRoundedImageView22.setAlpha(1.0f);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$l */
    public static final class C47218l extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119090a;

        C47218l(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119090a = momentsCategoryDetailActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119090a.finish();
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$q */
    public static final class C47223q implements ListenerParams.RequestListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119107a;

        @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
        /* renamed from: a */
        public void mo105410a(Exception exc) {
        }

        C47223q(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119107a = momentsCategoryDetailActivity;
        }

        @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
        /* renamed from: a */
        public void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z) {
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            Bitmap bitmap = null;
            if (!(obj instanceof BitmapDrawable)) {
                obj = null;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            if (bitmapDrawable != null) {
                bitmap = bitmapDrawable.getBitmap();
            }
            this.f119107a.mo165963a().getBackgroundImage(bitmap, this.f119107a);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$k */
    public static final class C47217k<T> implements AbstractC1178x<ArrayList<Pair<? extends Integer, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119088a;

        /* renamed from: b */
        final /* synthetic */ String f119089b;

        C47217k(MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str) {
            this.f119088a = momentsCategoryDetailActivity;
            this.f119089b = str;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<Pair<Integer, Integer>> arrayList) {
            MomentsCategoryDetailActivity momentsCategoryDetailActivity = this.f119088a;
            String str = this.f119089b;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "it");
            momentsCategoryDetailActivity.mo165967a(str, arrayList);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$n */
    public static final class C47220n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Ref.IntRef f119092a;

        /* renamed from: b */
        final /* synthetic */ DescriptionSuffixHelper f119093b;

        /* renamed from: c */
        final /* synthetic */ MomentsCategoryDetailActivity f119094c;

        /* renamed from: d */
        final /* synthetic */ String f119095d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f119096e;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f119093b.mo166042e()) {
                DescriptionSuffixHelper.m187105a(this.f119093b, false, 1, (Object) null);
            }
        }

        C47220n(Ref.IntRef intRef, DescriptionSuffixHelper iVar, MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str, ArrayList arrayList) {
            this.f119092a = intRef;
            this.f119093b = iVar;
            this.f119094c = momentsCategoryDetailActivity;
            this.f119095d = str;
            this.f119096e = arrayList;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$o */
    public static final class C47221o extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ UrlInfo f119097a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f119098b;

        /* renamed from: c */
        final /* synthetic */ DescriptionSuffixHelper f119099c;

        /* renamed from: d */
        final /* synthetic */ MomentsCategoryDetailActivity f119100d;

        /* renamed from: e */
        final /* synthetic */ String f119101e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f119102f;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String str = this.f119097a.href;
            Intrinsics.checkExpressionValueIsNotNull(str, "urlInfo.href");
            MomentsDependencyHolder.f118998b.mo165899a().browserModuleDependency().mo144693a(this.f119100d, str);
        }

        C47221o(UrlInfo urlInfo, Ref.IntRef intRef, DescriptionSuffixHelper iVar, MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str, ArrayList arrayList) {
            this.f119097a = urlInfo;
            this.f119098b = intRef;
            this.f119099c = iVar;
            this.f119100d = momentsCategoryDetailActivity;
            this.f119101e = str;
            this.f119102f = arrayList;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$p */
    public static final class C47222p extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionSuffixHelper f119103a;

        /* renamed from: b */
        final /* synthetic */ MomentsCategoryDetailActivity f119104b;

        /* renamed from: c */
        final /* synthetic */ String f119105c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f119106d;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f119103a.mo166042e()) {
                DescriptionSuffixHelper.m187105a(this.f119103a, false, 1, (Object) null);
            }
        }

        C47222p(DescriptionSuffixHelper iVar, MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str, ArrayList arrayList) {
            this.f119103a = iVar;
            this.f119104b = momentsCategoryDetailActivity;
            this.f119105c = str;
            this.f119106d = arrayList;
        }
    }

    /* renamed from: a */
    public static Resources m187045a(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryDetailActivity);
        }
        return momentsCategoryDetailActivity.mo165968b();
    }

    /* renamed from: c */
    public static AssetManager m187050c(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryDetailActivity);
        }
        return momentsCategoryDetailActivity.mo165971d();
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$i */
    public static final class C47214i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119085a;

        C47214i(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119085a = momentsCategoryDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f119085a.f119070c.mo92349b();
                this.f119085a.f119070c.mo92346a(new Runnable(this) {
                    /* class com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity.C47214i.RunnableC472151 */

                    /* renamed from: a */
                    final /* synthetic */ C47214i f119086a;

                    {
                        this.f119086a = r1;
                    }

                    public final void run() {
                        this.f119086a.f119085a.mo165963a().m270851getCategoryDetail();
                    }
                }, 1000);
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$r */
    public static final class C47224r extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119108a;

        /* renamed from: b */
        final /* synthetic */ String f119109b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ArrayList<PhotoItem> arrayList = new ArrayList<>();
            arrayList.add(new PhotoItem().setPaths(CollectionsKt.listOf(this.f119109b)).setImageKey(this.f119109b).setType(4));
            MomentsPreviewHelper eVar = MomentsPreviewHelper.f119251a;
            MomentsCategoryDetailActivity momentsCategoryDetailActivity = this.f119108a;
            MomentsCategoryDetailActivity momentsCategoryDetailActivity2 = momentsCategoryDetailActivity;
            SquircleImageView squircleImageView = (SquircleImageView) momentsCategoryDetailActivity.mo165962a(R.id.categoryAvatar);
            Intrinsics.checkExpressionValueIsNotNull(squircleImageView, "categoryAvatar");
            eVar.mo166208b(momentsCategoryDetailActivity2, squircleImageView, arrayList);
        }

        C47224r(MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str) {
            this.f119108a = momentsCategoryDetailActivity;
            this.f119109b = str;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$s */
    public static final class View$OnClickListenerC47225s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f119110a;

        /* renamed from: b */
        final /* synthetic */ MomentsCategoryDetailActivity f119111b;

        /* renamed from: c */
        final /* synthetic */ MomentsFeedPagerAdapter f119112c;

        /* renamed from: d */
        private long f119113d;

        public void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f119113d;
            if (j == 0 || currentTimeMillis - j > ((long) ParticipantRepo.f117150c)) {
                this.f119113d = currentTimeMillis;
                return;
            }
            Fragment a = this.f119112c.mo167401a(Integer.valueOf(this.f119110a));
            if (!(a instanceof MomentsFeedFragment)) {
                a = null;
            }
            MomentsFeedFragment momentsFeedFragment = (MomentsFeedFragment) a;
            if (momentsFeedFragment != null) {
                momentsFeedFragment.mo166901f();
            }
            this.f119113d = 0;
        }

        View$OnClickListenerC47225s(int i, MomentsCategoryDetailActivity momentsCategoryDetailActivity, MomentsFeedPagerAdapter cVar) {
            this.f119110a = i;
            this.f119111b = momentsCategoryDetailActivity;
            this.f119112c = cVar;
        }
    }

    /* renamed from: b */
    public static void m187048b(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
        momentsCategoryDetailActivity.mo165969c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsCategoryDetailActivity momentsCategoryDetailActivity2 = momentsCategoryDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsCategoryDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$f */
    public static final class C47211f<T> implements AbstractC1178x<CategoryDetail> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119082a;

        C47211f(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119082a = momentsCategoryDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(CategoryDetail gVar) {
            int i;
            this.f119082a.mo165966a(gVar.mo165998b(), gVar.mo165997a(), gVar.mo165999c(), gVar.mo166000d(), gVar.mo166003f(), gVar.mo166004g());
            this.f119082a.mo165965a(gVar.mo166001e());
            UDShadowLayout uDShadowLayout = (UDShadowLayout) this.f119082a.mo165962a(R.id.ivCreatePost);
            Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout, "ivCreatePost");
            UDShadowLayout uDShadowLayout2 = uDShadowLayout;
            if (gVar.mo166005h()) {
                i = 0;
            } else {
                i = 8;
            }
            uDShadowLayout2.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$g */
    public static final class C47212g<T> implements AbstractC1178x<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119083a;

        C47212g(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119083a = momentsCategoryDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Bitmap bitmap) {
            if (bitmap != null) {
                ImageView imageView = (ImageView) this.f119083a.mo165962a(R.id.background);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "background");
                imageView.setBackground(new BitmapDrawable(this.f119083a.getResources(), bitmap));
                return;
            }
            ((ImageView) this.f119083a.mo165962a(R.id.background)).setBackgroundColor(Color.parseColor("#808080"));
            ImageView imageView2 = (ImageView) this.f119083a.mo165962a(R.id.background);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "background");
            imageView2.setMinimumHeight(DeviceUtils.getScreenWidth(this.f119083a) * 2);
        }
    }

    /* renamed from: b */
    private final void m187049b(String str) {
        ((AppBarLayout) mo165962a(R.id.appbarlayout)).addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new C47216j(this));
        mo165963a().getTabList().mo5923a(this, new C47217k(this, str));
        mo165963a().m270852getTabList();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_category_detail);
        String stringExtra = getIntent().getStringExtra("category_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(stringExtra, "intent.getStringExtra(EXTRA_CATEGORY_ID) ?: \"\"");
        mo165963a().setCategoryId(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("category_name");
        if (stringExtra2 != null) {
            str = stringExtra2;
        } else {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "intent.getStringExtra(EXTRA_CATEGORY_NAME) ?: \"\"");
        String stringExtra3 = getIntent().getStringExtra("category_icon_key");
        if (stringExtra3 != null) {
            str2 = stringExtra3;
        } else {
            str2 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "intent.getStringExtra(EX…_CATEGORY_ICON_KEY) ?: \"\"");
        m187052f();
        m187049b(stringExtra);
        m187047a(this, str, str2, 0, 0, false, null, 32, null);
        m187056j();
        m187051e();
        mo165963a().m270851getCategoryDetail();
    }

    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity$h */
    public static final class C47213h<T> implements AbstractC1178x<Pair<? extends Integer, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryDetailActivity f119084a;

        C47213h(MomentsCategoryDetailActivity momentsCategoryDetailActivity) {
            this.f119084a = momentsCategoryDetailActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, String> pair) {
            Integer component1 = pair.component1();
            String component2 = pair.component2();
            if (component1 == null) {
                LKUIToast.show(this.f119084a, component2);
                this.f119084a.finish();
                return;
            }
            int color = UIUtils.getColor(this.f119084a, R.color.bg_body);
            if (UDUiModeUtils.m93319a(this.f119084a)) {
                this.f119084a.setLightTextStatusBar(color);
            } else {
                this.f119084a.setDarkTextStatusBar(color);
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f119084a.mo165962a(R.id.page_error_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "page_error_container");
            relativeLayout.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) this.f119084a.mo165962a(R.id.frame_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "frame_container");
            frameLayout.setVisibility(8);
            ImageView imageView = (ImageView) this.f119084a.mo165962a(R.id.background);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "background");
            imageView.setVisibility(8);
            ((ImageView) this.f119084a.mo165962a(R.id.page_error_iv)).setImageResource(component1.intValue());
            TextView textView = (TextView) this.f119084a.mo165962a(R.id.page_error_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "page_error_tv");
            textView.setText(component2);
        }
    }

    /* renamed from: a */
    public final void mo165965a(String str) {
        boolean z;
        Iterator<T> it;
        String str2 = str;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) mo165962a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvDescription");
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo165962a(R.id.tvDescription);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvDescription");
        textView2.setVisibility(0);
        if (!Intrinsics.areEqual(str, this.f119072f)) {
            this.f119072f = str;
            ArrayList<UrlInfo> a = URLMatcherHelper.f119187a.mo166087a(str);
            DescriptionSuffixHelper i = m187055i();
            i.mo166033a(str2);
            CharSequence d = i.mo166041d();
            if (d != null) {
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 0;
                Iterator<T> it2 = a.iterator();
                while (it2.hasNext()) {
                    T next = it2.next();
                    if (((UrlInfo) next).start > intRef.element) {
                        it = it2;
                        i.mo166036b(intRef.element, ((UrlInfo) next).start, UIUtils.getColor(this, R.color.static_white), new C47220n(intRef, i, this, str, a));
                    } else {
                        it = it2;
                    }
                    i.mo166040c(((UrlInfo) next).start, ((UrlInfo) next).end, UIUtils.getColor(this, R.color.static_white), new C47221o(next, intRef, i, this, str, a));
                    intRef.element = ((UrlInfo) next).end;
                    it2 = it;
                }
                i.mo166031a(3, d.length(), C25653b.m91894a(this, R.color.static_white, 0.7f), new C47222p(i, this, str, a));
            }
            i.mo166034a(false);
        }
    }

    /* renamed from: a */
    public static void m187046a(MomentsCategoryDetailActivity momentsCategoryDetailActivity, Context context) {
        momentsCategoryDetailActivity.mo165964a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m187044a(MomentsCategoryDetailActivity momentsCategoryDetailActivity, Configuration configuration) {
        Context a = momentsCategoryDetailActivity.mo165961a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<Fragment> arrayList;
        super.onActivityResult(i, i2, intent);
        MomentsFeedPagerAdapter cVar = this.f119069b;
        if (!(cVar == null || (arrayList = cVar.f120218a) == null)) {
            for (Fragment fragment : arrayList) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x029d, code lost:
        if (r1 == false) goto L_0x02a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo165966a(java.lang.String r17, java.lang.String r18, long r19, long r21, boolean r23, java.util.List<com.bytedance.lark.pb.moments.v1.MomentUser> r24) {
        /*
        // Method dump skipped, instructions count: 881
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity.mo165966a(java.lang.String, java.lang.String, long, long, boolean, java.util.List):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m187047a(MomentsCategoryDetailActivity momentsCategoryDetailActivity, String str, String str2, long j, long j2, boolean z, List list, int i, Object obj) {
        List list2;
        if ((i & 32) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        momentsCategoryDetailActivity.mo165966a(str, str2, j, j2, z, list2);
    }
}
