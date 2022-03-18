package com.ss.android.lark.moments.impl.hashtag;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1170p;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.moments.impl.applink.AppLinkUtils;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.CopyUtils;
import com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView;
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
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ar;

public final class MomentsHashTagFeedActivity extends BaseFragmentActivity {

    /* renamed from: c */
    public static final Companion f120187c = new Companion(null);

    /* renamed from: a */
    public MomentsFeedPagerAdapter f120188a;

    /* renamed from: b */
    public AppBarStateChangeListener.State f120189b = AppBarStateChangeListener.State.EXPANDED;

    /* renamed from: d */
    private ArrayList<TabFragmentInfo> f120190d = new ArrayList<>();

    /* renamed from: e */
    private final C47691p f120191e = new C47691p(this);

    /* renamed from: f */
    private final C47687m f120192f = new C47687m(this);

    /* renamed from: g */
    private final Lazy f120193g = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HashTagFeedViewModel.class), new MomentsHashTagFeedActivity$$special$$inlined$viewModels$2(this), new MomentsHashTagFeedActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: h */
    private HashMap f120194h;

    /* renamed from: a */
    public Context mo167314a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo167315a(int i) {
        if (this.f120194h == null) {
            this.f120194h = new HashMap();
        }
        View view = (View) this.f120194h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120194h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final HashTagFeedViewModel mo167316a() {
        return (HashTagFeedViewModel) this.f120193g.getValue();
    }

    /* renamed from: a */
    public void mo167317a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m188622a(this, context);
    }

    /* renamed from: b */
    public Resources mo167319b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo167320c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m188620a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo167322d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m188625c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m188621a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m188624b(this);
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo167325a(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "hashtagId");
            Intent putExtra = new Intent(context, MomentsHashTagFeedActivity.class).putExtra("hash_tag_id", str);
            Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(context, MomentsH…A_HASH_TAG_ID, hashtagId)");
            if (str2 != null) {
                putExtra.putExtra("hash_tag_content", str2);
            }
            C47282k.m187257a(context, putExtra);
        }

        /* renamed from: a */
        public static /* synthetic */ void m188636a(Companion aVar, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            aVar.mo167325a(context, str, str2);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$p */
    public static final class C47691p implements TitleApi {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120216a;

        @Override // com.ss.android.lark.moments.impl.feed.TitleApi
        /* renamed from: a */
        public AppBarStateChangeListener.State mo165985a() {
            return this.f120216a.f120189b;
        }

        C47691p(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120216a = momentsHashTagFeedActivity;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$m */
    public static final class C47687m implements MomentsFeedFragment.OutPageApi {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120208a;

        @Override // com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OutPageApi
        /* renamed from: a */
        public void mo165982a() {
            this.f120208a.mo167316a().getHashTagDetail();
        }

        @Override // com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OutPageApi
        /* renamed from: b */
        public void mo165983b() {
            Job unused = C69553g.m266944a(C1170p.m5399a(this.f120208a), null, null, new C47688a(this, null), 3, null);
        }

        C47687m(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120208a = momentsHashTagFeedActivity;
        }

        /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$m$a */
        static final class C47688a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C47687m this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47688a(C47687m mVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C47688a aVar = new C47688a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C47688a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    this.L$0 = this.p$;
                    this.label = 1;
                    if (ar.m266295a(200, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ((UDTabLayout) this.this$0.f120208a.mo167315a(R.id.tabLayout)).selectTabAt(1);
                return Unit.INSTANCE;
            }
        }
    }

    /* renamed from: f */
    private final void m188627f() {
        Drawable findDrawableByLayerId;
        ((UDShadowLayout) mo167315a(R.id.ivCreatePost)).setOnClickListener(new C47676b(this));
        ImageView imageView = (ImageView) mo167315a(R.id.create_bt);
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

    /* renamed from: e */
    private final void m188626e() {
        MomentsHashTagFeedActivity momentsHashTagFeedActivity = this;
        setDarkTextStatusBar(UIUtils.getColor(momentsHashTagFeedActivity, R.color.lkui_transparent));
        StatusBarUtil.setTransparentForImageView(this, (FrameLayout) mo167315a(R.id.frame_container), (RelativeLayout) mo167315a(R.id.page_error_container));
        ((ImageView) mo167315a(R.id.icBack)).setImageDrawable(UDIconUtils.getIconDrawable(momentsHashTagFeedActivity, (int) R.drawable.ud_icon_left_outlined, UIHelper.getColor(R.color.icon_n1)));
        ((ImageView) mo167315a(R.id.icBack)).setOnClickListener(new C47679e(this));
        ((ImageView) mo167315a(R.id.icMore)).setImageDrawable(UDIconUtils.getIconDrawable(momentsHashTagFeedActivity, (int) R.drawable.ud_icon_more_outlined, UIHelper.getColor(R.color.icon_n1)));
        ((ImageView) mo167315a(R.id.icMore)).setOnClickListener(new C47680f(this));
        ((TextView) mo167315a(R.id.hashTagName)).setTextColor(UIUtils.getColor(momentsHashTagFeedActivity, R.color.lkui_transparent));
        ((ConstraintLayout) mo167315a(R.id.titlebar)).setBackgroundColor(UIUtils.getColor(momentsHashTagFeedActivity, R.color.lkui_transparent));
        setDarkTextStatusBar(UIUtils.getColor(momentsHashTagFeedActivity, R.color.lkui_transparent));
        ConstraintLayout constraintLayout = (ConstraintLayout) mo167315a(R.id.headerView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "headerView");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            layoutParams2.mo76392a(1);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo167315a(R.id.headerView);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "headerView");
            constraintLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$b */
    public static final class C47676b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120195a;

        C47676b(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120195a = momentsHashTagFeedActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post_edit", "moments_edit_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            Intent putExtra = new Intent(this.f120195a, MomentsPublishActivity.class).putExtra("page_hash_tag_content", this.f120195a.mo167316a().getContent().mo5927b());
            Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(it, MomentsPublis… viewModel.content.value)");
            MomentsFeedPagerAdapter cVar = this.f120195a.f120188a;
            Fragment fragment = null;
            Integer num = null;
            if (cVar != null) {
                UDTabLayout uDTabLayout = (UDTabLayout) this.f120195a.mo167315a(R.id.tabLayout);
                if (uDTabLayout != null) {
                    num = Integer.valueOf(uDTabLayout.getSelectPosition());
                }
                fragment = cVar.mo167401a(num);
            }
            if (!C47282k.m187260a(fragment, putExtra, 211)) {
                this.f120195a.startActivityForResult(putExtra, 211);
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$c */
    public static final class C47677c extends AppBarStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120196a;

        C47677c(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120196a = momentsHashTagFeedActivity;
        }

        @Override // com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener, com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            super.onOffsetChanged(appBarLayout, i);
            int dp2px = UIUtils.dp2px(this.f120196a, 72.0f);
            float abs = Math.abs((float) i) / ((float) dp2px);
            if (i > (-dp2px)) {
                ((TextView) this.f120196a.mo167315a(R.id.hashTagName)).setTextColor(C25653b.m91894a(this.f120196a, R.color.text_title, abs));
                ((ConstraintLayout) this.f120196a.mo167315a(R.id.titlebar)).setBackgroundColor(C25653b.m91894a(this.f120196a, R.color.bg_body, abs));
                MomentsHashTagFeedActivity momentsHashTagFeedActivity = this.f120196a;
                momentsHashTagFeedActivity.setDarkTextStatusBar(C25653b.m91894a(momentsHashTagFeedActivity, R.color.bg_body, abs));
                return;
            }
            ((TextView) this.f120196a.mo167315a(R.id.hashTagName)).setTextColor(UIUtils.getColor(this.f120196a, R.color.text_title));
            ((ConstraintLayout) this.f120196a.mo167315a(R.id.titlebar)).setBackgroundColor(UIUtils.getColor(this.f120196a, R.color.bg_body));
            MomentsHashTagFeedActivity momentsHashTagFeedActivity2 = this.f120196a;
            momentsHashTagFeedActivity2.setDarkTextStatusBar(UIUtils.getColor(momentsHashTagFeedActivity2, R.color.bg_body));
        }

        @Override // com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener
        /* renamed from: a */
        public void mo165980a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state != null) {
                this.f120196a.f120189b = state;
                int i = C47703b.f120217a[state.ordinal()];
                boolean z = false;
                if (i == 1) {
                    ((TextView) this.f120196a.mo167315a(R.id.hashTagName)).setTextColor(C25653b.m91894a(this.f120196a, R.color.text_title, BitmapDescriptorFactory.HUE_RED));
                    ((ConstraintLayout) this.f120196a.mo167315a(R.id.titlebar)).setBackgroundColor(C25653b.m91894a(this.f120196a, R.color.bg_body, BitmapDescriptorFactory.HUE_RED));
                    ((LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg)).setBackgroundResource(R.drawable.moments_rec_bg);
                    LinearLayout linearLayout = (LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabTopBg");
                    if (linearLayout.getVisibility() == 8) {
                        z = true;
                    }
                    if (z) {
                        ((ViewPager) this.f120196a.mo167315a(R.id.viewPager)).setBackgroundResource(R.drawable.moments_rec_bg);
                    }
                } else if (i != 2) {
                    ((LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg)).setBackgroundResource(R.drawable.moments_rec_bg);
                    LinearLayout linearLayout2 = (LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "tabTopBg");
                    if (linearLayout2.getVisibility() == 8) {
                        z = true;
                    }
                    if (z) {
                        ((ViewPager) this.f120196a.mo167315a(R.id.viewPager)).setBackgroundResource(R.drawable.moments_rec_bg);
                    }
                } else {
                    ((TextView) this.f120196a.mo167315a(R.id.hashTagName)).setTextColor(UIUtils.getColor(this.f120196a, R.color.text_title));
                    ((ConstraintLayout) this.f120196a.mo167315a(R.id.titlebar)).setBackgroundColor(UIUtils.getColor(this.f120196a, R.color.bg_body));
                    ((LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg)).setBackgroundColor(UIUtils.getColor(this.f120196a, R.color.bg_body));
                    LinearLayout linearLayout3 = (LinearLayout) this.f120196a.mo167315a(R.id.tabTopBg);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "tabTopBg");
                    if (linearLayout3.getVisibility() == 8) {
                        z = true;
                    }
                    if (z) {
                        ((ViewPager) this.f120196a.mo167315a(R.id.viewPager)).setBackgroundResource(R.color.bg_body);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$e */
    public static final class C47679e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120200a;

        C47679e(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120200a = momentsHashTagFeedActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120200a.finish();
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$f */
    public static final class C47680f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120201a;

        C47680f(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120201a = momentsHashTagFeedActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (view != null) {
                this.f120201a.showOperationMenu(view);
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$d */
    public static final class C47678d<T> implements AbstractC1178x<ArrayList<Pair<? extends Integer, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120197a;

        /* renamed from: b */
        final /* synthetic */ String f120198b;

        /* renamed from: c */
        final /* synthetic */ String f120199c;

        C47678d(MomentsHashTagFeedActivity momentsHashTagFeedActivity, String str, String str2) {
            this.f120197a = momentsHashTagFeedActivity;
            this.f120198b = str;
            this.f120199c = str2;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<Pair<Integer, Integer>> arrayList) {
            MomentsHashTagFeedActivity momentsHashTagFeedActivity = this.f120197a;
            String str = this.f120198b;
            String str2 = this.f120199c;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "it");
            momentsHashTagFeedActivity.mo167318a(str, str2, arrayList);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$k */
    static final class C47685k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120206a;

        C47685k(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120206a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((UDTabLayout) this.f120206a.mo167315a(R.id.tabLayout)).selectTabAt(1);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$i */
    static final class C47683i<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120204a;

        C47683i(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120204a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f120204a.mo167315a(R.id.tvPostCount);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvPostCount");
            textView.setText(FakeBoldSpan.f119246a.mo166167a(str));
        }
    }

    /* renamed from: a */
    public static Resources m188621a(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsHashTagFeedActivity);
        }
        return momentsHashTagFeedActivity.mo167319b();
    }

    /* renamed from: c */
    public static AssetManager m188625c(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsHashTagFeedActivity);
        }
        return momentsHashTagFeedActivity.mo167322d();
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$h */
    static final class C47682h<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120203a;

        C47682h(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120203a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f120203a.mo167315a(R.id.hashTagName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "hashTagName");
            textView.setText(FakeBoldSpan.f119246a.mo166167a(str));
            TextView textView2 = (TextView) this.f120203a.mo167315a(R.id.hashTagTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "hashTagTitle");
            textView2.setText(FakeBoldSpan.f119246a.mo166167a(str));
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$j */
    static final class C47684j<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120205a;

        C47684j(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120205a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f120205a.mo167315a(R.id.tvJoinCount);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvJoinCount");
            textView.setText(FakeBoldSpan.f119246a.mo166167a(str));
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) this.f120205a.mo167315a(R.id.splitter1);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "splitter1");
            lKUIRoundedImageView2.setVisibility(0);
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) this.f120205a.mo167315a(R.id.splitter1);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "splitter1");
            lKUIRoundedImageView22.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$n */
    public static final class C47689n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120209a;

        /* renamed from: b */
        final /* synthetic */ MomentsHashTagFeedActivity f120210b;

        /* renamed from: c */
        final /* synthetic */ Dialog f120211c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (CopyUtils.f119249a.mo166199a(this.f120210b, AppLinkUtils.f119003a.mo165905b(this.f120209a.mo167316a().getHashTagId()))) {
                LKUIToast.show(this.f120210b, (int) R.string.Lark_Community_LinkCopiedToast);
            } else {
                LKUIToast.show(this.f120210b, (int) R.string.Lark_Community_UnableToCopyLinkToast);
            }
            this.f120211c.dismiss();
        }

        C47689n(MomentsHashTagFeedActivity momentsHashTagFeedActivity, MomentsHashTagFeedActivity momentsHashTagFeedActivity2, Dialog dialog) {
            this.f120209a = momentsHashTagFeedActivity;
            this.f120210b = momentsHashTagFeedActivity2;
            this.f120211c = dialog;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$o */
    public static final class View$OnClickListenerC47690o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f120212a;

        /* renamed from: b */
        final /* synthetic */ MomentsHashTagFeedActivity f120213b;

        /* renamed from: c */
        final /* synthetic */ MomentsFeedPagerAdapter f120214c;

        /* renamed from: d */
        private long f120215d;

        public void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f120215d;
            if (j == 0 || currentTimeMillis - j > ((long) ParticipantRepo.f117150c)) {
                this.f120215d = currentTimeMillis;
                return;
            }
            Fragment a = this.f120214c.mo167401a(Integer.valueOf(this.f120212a));
            if (!(a instanceof MomentsFeedFragment)) {
                a = null;
            }
            MomentsFeedFragment momentsFeedFragment = (MomentsFeedFragment) a;
            if (momentsFeedFragment != null) {
                momentsFeedFragment.mo166901f();
            }
            this.f120215d = 0;
        }

        View$OnClickListenerC47690o(int i, MomentsHashTagFeedActivity momentsHashTagFeedActivity, MomentsFeedPagerAdapter cVar) {
            this.f120212a = i;
            this.f120213b = momentsHashTagFeedActivity;
            this.f120214c = cVar;
        }
    }

    /* renamed from: b */
    public static void m188624b(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
        momentsHashTagFeedActivity.mo167320c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsHashTagFeedActivity momentsHashTagFeedActivity2 = momentsHashTagFeedActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsHashTagFeedActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void showOperationMenu(View view) {
        view.getLocationOnScreen(new int[2]);
        MomentsHashTagFeedActivity momentsHashTagFeedActivity = this;
        MomentsHashTagFeedActivity momentsHashTagFeedActivity2 = momentsHashTagFeedActivity;
        View inflate = LayoutInflater.from(momentsHashTagFeedActivity2).inflate(R.layout.moments_hashtag_operation_menu, (ViewGroup) null);
        Dialog a = C57811b.m224342a((Context) momentsHashTagFeedActivity2, inflate, (int) R.style.feedPlusDialog, true);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.btn_copy_link);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "copyLinkBtn");
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new C47689n(this, momentsHashTagFeedActivity, a));
        C57810a.m224337a(this, a, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$g */
    static final class C47681g<T> implements AbstractC1178x<List<? extends Pair<? extends String, ? extends String>>> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120202a;

        C47681g(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120202a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<Pair<String, String>> list) {
            if (!list.isEmpty()) {
                int dp2px = UIUtils.dp2px(this.f120202a, 22.0f);
                int i = 0;
                for (T t : CollectionsKt.mutableListOf((BorderOvalImageView) this.f120202a.mo167315a(R.id.avatar1), (BorderOvalImageView) this.f120202a.mo167315a(R.id.avatar2), (BorderOvalImageView) this.f120202a.mo167315a(R.id.avatar3))) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    if (i >= list.size()) {
                        Intrinsics.checkExpressionValueIsNotNull(t2, "view");
                        t2.setVisibility(8);
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(t2, "view");
                        t2.setVisibility(0);
                        Pair<String, String> pair = list.get(i);
                        IRequestCreator override = ImageLoader.with(t2.getContext()).load(AvatarImage.Builder.obtain(pair.component2(), pair.component1(), dp2px, dp2px).build()).placeholder(new ColorDrawable(UIUtils.getColor(t2.getContext(), R.color.bg_filler))).override(dp2px, dp2px);
                        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(view.co…rride(viewSize, viewSize)");
                        C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null).into((ImageView) t2);
                    }
                    i = i2;
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity$l */
    static final class C47686l<T> implements AbstractC1178x<Pair<? extends Integer, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MomentsHashTagFeedActivity f120207a;

        C47686l(MomentsHashTagFeedActivity momentsHashTagFeedActivity) {
            this.f120207a = momentsHashTagFeedActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, String> pair) {
            int color = UIUtils.getColor(this.f120207a, R.color.bg_body);
            if (UDUiModeUtils.m93319a(this.f120207a)) {
                this.f120207a.setLightTextStatusBar(color);
            } else {
                this.f120207a.setDarkTextStatusBar(color);
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f120207a.mo167315a(R.id.page_error_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "page_error_container");
            relativeLayout.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) this.f120207a.mo167315a(R.id.frame_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "frame_container");
            frameLayout.setVisibility(8);
            ImageView imageView = (ImageView) this.f120207a.mo167315a(R.id.hashtag_bg);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "hashtag_bg");
            imageView.setVisibility(8);
            ((ImageView) this.f120207a.mo167315a(R.id.page_error_iv)).setImageResource(pair.getFirst().intValue());
            TextView textView = (TextView) this.f120207a.mo167315a(R.id.page_error_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "page_error_tv");
            textView.setText(pair.getSecond());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_hash_tag_feed);
        m188626e();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        String str2 = "";
        if (extras == null || (str = extras.getString("hash_tag_id")) == null) {
            str = str2;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "intent.extras?.getString(EXTRA_HASH_TAG_ID) ?: \"\"");
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        if (!(extras2 == null || (string = extras2.getString("hash_tag_content")) == null)) {
            str2 = string;
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "intent.extras?.getString…A_HASH_TAG_CONTENT) ?: \"\"");
        m188623a(str, str2);
        m188627f();
        MomentsHashTagFeedActivity momentsHashTagFeedActivity = this;
        mo167316a().getAvatarKeys().mo5923a(momentsHashTagFeedActivity, new C47681g(this));
        mo167316a().getContent().mo5923a(momentsHashTagFeedActivity, new C47682h(this));
        mo167316a().getPostCount().mo5923a(momentsHashTagFeedActivity, new C47683i(this));
        mo167316a().getParticipateCount().mo5923a(momentsHashTagFeedActivity, new C47684j(this));
        mo167316a().getToTimeOrderTab().mo5923a(momentsHashTagFeedActivity, new C47685k(this));
        mo167316a().getShowErrorPage().mo5923a(momentsHashTagFeedActivity, new C47686l(this));
        mo167316a().setHashTagId(str);
        mo167316a().getContent().mo5929b(str2);
        mo167316a().getTabsList();
        mo167316a().getHashTagDetail();
    }

    /* renamed from: a */
    public static void m188622a(MomentsHashTagFeedActivity momentsHashTagFeedActivity, Context context) {
        momentsHashTagFeedActivity.mo167317a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsHashTagFeedActivity);
        }
    }

    /* renamed from: a */
    public static Context m188620a(MomentsHashTagFeedActivity momentsHashTagFeedActivity, Configuration configuration) {
        Context a = momentsHashTagFeedActivity.mo167314a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final void m188623a(String str, String str2) {
        ((AppBarLayout) mo167315a(R.id.appbarlayout)).addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new C47677c(this));
        mo167316a().getTabList().mo5923a(this, new C47678d(this, str, str2));
        mo167316a().getTabsList();
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<Fragment> arrayList;
        super.onActivityResult(i, i2, intent);
        MomentsFeedPagerAdapter cVar = this.f120188a;
        if (!(cVar == null || (arrayList = cVar.f120218a) == null)) {
            for (Fragment fragment : arrayList) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo167318a(String str, String str2, ArrayList<Pair<Integer, Integer>> arrayList) {
        boolean z;
        int i;
        boolean z2;
        String str3;
        LinearLayout linearLayout = (LinearLayout) mo167315a(R.id.tabTopBg);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabTopBg");
        LinearLayout linearLayout2 = linearLayout;
        if (arrayList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (arrayList.size() > 1) {
            LinearLayout linearLayout3 = (LinearLayout) mo167315a(R.id.tabTopBg);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "tabTopBg");
            linearLayout3.setVisibility(0);
            ((ViewPager) mo167315a(R.id.viewPager)).setBackgroundColor(UIUtils.getColor(this, R.color.bg_body));
            z2 = false;
        } else {
            LinearLayout linearLayout4 = (LinearLayout) mo167315a(R.id.tabTopBg);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "tabTopBg");
            linearLayout4.setVisibility(8);
            ((ViewPager) mo167315a(R.id.viewPager)).setBackgroundResource(R.drawable.moments_rec_bg);
            z2 = true;
        }
        this.f120190d.clear();
        for (T t : arrayList) {
            int intValue = ((Number) t.getFirst()).intValue();
            Integer num = (Integer) t.getSecond();
            if (num == null) {
                str3 = "";
            } else {
                str3 = UIUtils.getString(this, num.intValue());
            }
            ArrayList<TabFragmentInfo> arrayList2 = this.f120190d;
            Intrinsics.checkExpressionValueIsNotNull(str3, "title");
            arrayList2.add(new TabFragmentInfo(str, str3, intValue, this.f120191e, this.f120192f, null, "value_from_hashtag", str2, z2));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        MomentsFeedPagerAdapter cVar = new MomentsFeedPagerAdapter(supportFragmentManager, true);
        cVar.mo167402a().clear();
        cVar.mo167402a().addAll(this.f120190d);
        this.f120188a = cVar;
        ViewPager viewPager = (ViewPager) mo167315a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
        viewPager.setAdapter(cVar);
        UDTabLayout uDTabLayout = (UDTabLayout) mo167315a(R.id.tabLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tabLayout");
        ViewPager viewPager2 = (ViewPager) mo167315a(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "viewPager");
        new UDTabLayoutCoordinator(uDTabLayout, viewPager2).attach();
        int i2 = 0;
        for (T t2 : cVar.mo167402a()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((UDTabLayout) mo167315a(R.id.tabLayout)).getTabAt(i2).mo91341c().setOnClickListener(new View$OnClickListenerC47690o(i2, this, cVar));
            i2 = i3;
        }
    }
}
