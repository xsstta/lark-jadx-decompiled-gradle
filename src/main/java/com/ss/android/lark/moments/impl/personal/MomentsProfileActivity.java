package com.ss.android.lark.moments.impl.personal;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IAvatarModuleDependency;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrFooterView;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.MomentsFeedAdapter;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.mainview.MomentsFeedPagerAdapter;
import com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity;
import com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.moments.impl.report.MomentsReportActivity;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class MomentsProfileActivity extends BaseFragmentActivity {

    /* renamed from: g */
    public static final Companion f120464g = new Companion(null);

    /* renamed from: a */
    public float f120465a;

    /* renamed from: b */
    public String f120466b = "";

    /* renamed from: c */
    public C25969c f120467c = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: d */
    public final C47840p f120468d = new C47840p(this);

    /* renamed from: e */
    public boolean f120469e = true;

    /* renamed from: f */
    public int f120470f;

    /* renamed from: h */
    private final Lazy f120471h = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsProfileVM.class), new MomentsProfileActivity$$special$$inlined$viewModels$2(this), new MomentsProfileActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: i */
    private final Lazy f120472i = LazyKt.lazy(new C47839o(this));

    /* renamed from: j */
    private final Lazy f120473j = LazyKt.lazy(new C47841q(this));

    /* renamed from: k */
    private Fragment f120474k;

    /* renamed from: l */
    private HashMap f120475l;

    /* renamed from: f */
    private final MomentsPtrFooterView m188983f() {
        return (MomentsPtrFooterView) this.f120473j.getValue();
    }

    /* renamed from: a */
    public Context mo167618a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo167619a(int i) {
        if (this.f120475l == null) {
            this.f120475l = new HashMap();
        }
        View view = (View) this.f120475l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120475l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsProfileVM mo167620a() {
        return (MomentsProfileVM) this.f120471h.getValue();
    }

    /* renamed from: a */
    public void mo167621a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m188980a(this, context);
    }

    /* renamed from: b */
    public final MomentsFeedAdapter mo167625b() {
        return (MomentsFeedAdapter) this.f120472i.getValue();
    }

    /* renamed from: c */
    public Resources mo167626c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m188978a(this, configuration);
    }

    /* renamed from: d */
    public void mo167628d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo167629e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m188982c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m188979a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m188981b(this);
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo167631a(String str, Context context, Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (MomentsDependencyHolder.f118998b.mo165901b().mo166490b()) {
                MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(context, str);
                return;
            }
            MomentsAppreciableHitPoint.f119684a.mo166727L();
            Intent intent = new Intent(context, MomentsProfileActivity.class);
            String a = MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a();
            intent.putExtra("user_id", str);
            intent.putExtra("is_self", C57782ag.m224242a(a, str));
            if (fragment != null) {
                fragment.startActivity(intent);
            } else {
                C47282k.m187257a(context, intent);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m188998a(Companion aVar, String str, Context context, Fragment fragment, int i, Object obj) {
            if ((i & 4) != 0) {
                fragment = null;
            }
            aVar.mo167631a(str, context, fragment);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$p */
    public static final class C47840p implements IMomentClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120493a;

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166622b() {
            IMomentClickListener.C47490a.m188220c(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public float mo166614a() {
            return this.f120493a.f120465a;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166624c() {
            MomentsFollowActivity.Companion aVar = MomentsFollowActivity.f120526i;
            MomentsProfileActivity momentsProfileActivity = this.f120493a;
            aVar.mo167680b(momentsProfileActivity, momentsProfileActivity.f120466b);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: d */
        public void mo166626d() {
            MomentsFollowActivity.Companion aVar = MomentsFollowActivity.f120526i;
            MomentsProfileActivity momentsProfileActivity = this.f120493a;
            aVar.mo167679a(momentsProfileActivity, momentsProfileActivity.f120466b);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: e */
        public void mo166627e() {
            MomentsHitPoint.f119720a.mo166848e("community_profile");
            this.f120493a.startActivity(new Intent(this.f120493a, MomentsPublishActivity.class));
        }

        C47840p(MomentsProfileActivity momentsProfileActivity) {
            this.f120493a = momentsProfileActivity;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166616a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intent intent = new Intent(this.f120493a, MomentsReportActivity.class);
            intent.putExtra("post_id", str);
            this.f120493a.startActivity(intent);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166623b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IMomentClickListener.C47490a.m188217a(this, str, str2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166625c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitHelper.f119719r.mo166800b("btn", "community_profile");
            this.f120493a.mo167624a(str, true);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166618a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitPoint.f119720a.mo166842b(str, "community_profile");
            this.f120493a.mo167624a(str, false);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166617a(String str, View view) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(view, "imageView");
            IAvatarModuleDependency avatarDependency = MomentsDependencyHolder.f118998b.mo165899a().avatarDependency();
            MomentsProfileActivity momentsProfileActivity = this.f120493a;
            String str2 = momentsProfileActivity.f120466b;
            String a = C52990a.m205228a(view.getContext(), (int) R.string.Lark_Community_ChangeCover);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIUtils.getString(imageV…rk_Community_ChangeCover)");
            String a2 = C52990a.m205228a(view.getContext(), (int) R.string.Lark_CommunityUnableToUploadToast);
            Intrinsics.checkExpressionValueIsNotNull(a2, "UIUtils.getString(imageV…unityUnableToUploadToast)");
            avatarDependency.mo144692a(momentsProfileActivity, str, str2, view, a, a2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166621a(ArrayList<PhotoItem> arrayList, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoList");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            C58630d.m227364a().mo198658a(imageView).mo198667a(arrayList).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198673b(false).mo198674c(false).mo198675d(false).mo198676e(false).mo198678g(false).mo198679h(false).mo198666a("").mo198677f(false).mo198683l(false).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(9).mo198669a((Activity) this.f120493a);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166620a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(str3, "postId");
            MomentsHashTagFeedActivity.f120187c.mo167325a(this.f120493a, str, str2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166615a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
            IMomentClickListener.C47490a.m188214a(this, context, str, str2, str3);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166619a(String str, String str2, int i, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "contentText");
            Intrinsics.checkParameterIsNotNull(str2, "postId");
            MomentsDependencyHolder.f118998b.mo165899a().forwardDependency().mo144712a(this.f120493a, str, str2, i);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$j */
    public static final class C47834j implements LoadingAPI {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120487a;

        @Override // com.ss.android.lark.moments.impl.personal.LoadingAPI
        /* renamed from: a */
        public void mo167642a() {
            this.f120487a.mo167620a().refreshData(20);
        }

        C47834j(MomentsProfileActivity momentsProfileActivity) {
            this.f120487a = momentsProfileActivity;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$o */
    static final class C47839o extends Lambda implements Function0<MomentsFeedAdapter> {
        final /* synthetic */ MomentsProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47839o(MomentsProfileActivity momentsProfileActivity) {
            super(0);
            this.this$0 = momentsProfileActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsFeedAdapter invoke() {
            MomentsProfileActivity momentsProfileActivity = this.this$0;
            return new MomentsFeedAdapter(momentsProfileActivity, momentsProfileActivity.f120468d);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$q */
    static final class C47841q extends Lambda implements Function0<MomentsPtrFooterView> {
        final /* synthetic */ MomentsProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47841q(MomentsProfileActivity momentsProfileActivity) {
            super(0);
            this.this$0 = momentsProfileActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsPtrFooterView invoke() {
            return new MomentsPtrFooterView(this.this$0, null, 0, 6, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f120467c.mo92349b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        MomentsHitHelper.f119719r.mo166815i("community_profile");
        mo167620a().reloadProfileData();
    }

    /* renamed from: h */
    private final void m188985h() {
        MomentsProfileActivity momentsProfileActivity = this;
        setLightTextStatusBar(C52990a.m205239c(momentsProfileActivity, R.color.lkui_transparent));
        this.f120469e = true;
        this.f120470f = C52990a.m205239c(momentsProfileActivity, R.color.lkui_transparent);
        ((ImageView) mo167619a(R.id.icBack)).setOnClickListener(new View$OnClickListenerC47838n(this));
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Fragment fragment = this.f120474k;
        if (fragment != null) {
            mo167623a(fragment);
            StatusBarUtil.setTransparentForImageView(this, (LinearLayout) mo167619a(R.id.titleBar), (LottieAnimationView) mo167619a(R.id.refreshIcon), (RelativeLayout) mo167619a(R.id.page_error_container));
            if (this.f120469e) {
                setLightTextStatusBar(this.f120470f);
            } else {
                setDarkTextStatusBar(this.f120470f);
            }
        } else {
            finish();
        }
    }

    /* renamed from: g */
    private final void m188984g() {
        MomentsProfileActivity momentsProfileActivity = this;
        mo167620a().getDataList().mo5923a(momentsProfileActivity, new C47823b(this));
        mo167620a().getCompleteRefresh().mo5923a(momentsProfileActivity, new C47824c(this));
        mo167620a().getUserName().mo5923a(momentsProfileActivity, new C47825d(this));
        mo167620a().getToastResId().mo5923a(momentsProfileActivity, new C47826e(this));
        mo167620a().getNeedRefresh().mo5923a(momentsProfileActivity, new C47827f(this));
        mo167620a().getStartNickIdentityActivity().mo5923a(momentsProfileActivity, new C47829g(this));
        mo167620a().getShowErrorPage().mo5923a(momentsProfileActivity, new C47832h(this));
    }

    /* renamed from: i */
    private final void m188986i() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrFrameLayout lKUIPtrFrameLayout2 = (LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout2, "ptrLayout");
        lKUIPtrFrameLayout2.setForceBackWhenComplete(true);
        ((LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout)).setEnableScrollContentAfterLoad(true);
        ((LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout)).disableWhenHorizontalMove(true);
        ((LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout)).setFooterView(m188983f());
        ((LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout)).addPtrUIHandler(m188983f());
        ((LKUIPtrFrameLayout) mo167619a(R.id.ptrLayout)).setPtrHandler(new C47833i(this));
        MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView = (MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsProfileZoomRecyclerView, "rvFeed");
        momentsProfileZoomRecyclerView.setAdapter(mo167625b());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView2 = (MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsProfileZoomRecyclerView2, "rvFeed");
        momentsProfileZoomRecyclerView2.setLayoutManager(linearLayoutManager);
        MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView3 = (MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsProfileZoomRecyclerView3, "rvFeed");
        momentsProfileZoomRecyclerView3.setItemAnimator(null);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo167619a(R.id.refreshIcon);
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "refreshIcon");
        ((MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed)).setLoadingView(lottieAnimationView);
        ((MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed)).setLoadingApi(new C47834j(this));
        ((MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed)).setTouchViewListener(new C47835k(this));
        ((MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed)).addOnScrollListener(new C47836l(this, linearLayoutManager));
        ((MomentsProfileZoomRecyclerView) mo167619a(R.id.rvFeed)).addOnScrollListener(new C47837m(this));
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$i */
    public static final class C47833i extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120486a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        C47833i(MomentsProfileActivity momentsProfileActivity) {
            this.f120486a = momentsProfileActivity;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f120486a.mo167620a().loadMorePostData(20, true, false);
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f120486a.mo167620a().canLoadMore()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$m */
    public static final class C47837m extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120491a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        C47837m(MomentsProfileActivity momentsProfileActivity) {
            this.f120491a = momentsProfileActivity;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f120491a.mo167625b().getItemCount() - 15 && this.f120491a.mo167620a().canLoadMore()) {
                this.f120491a.mo167620a().loadMorePostData(20, true, false);
            }
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
            int i3;
            MomentsFeedAdapter b;
            List<IMomentsItemBase> b2;
            MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView = (MomentsProfileZoomRecyclerView) this.f120491a.mo167619a(R.id.rvFeed);
            Intrinsics.checkExpressionValueIsNotNull(momentsProfileZoomRecyclerView, "rvFeed");
            RecyclerView.LayoutManager layoutManager = momentsProfileZoomRecyclerView.getLayoutManager();
            int i4 = -1;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i4 = linearLayoutManager.findFirstVisibleItemPosition();
                i3 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i3 = -1;
            }
            if (i4 >= 0 && i3 >= 0 && (b = this.f120491a.mo167625b()) != null && (b2 = b.mo166946b()) != null && i4 < b2.size() && i3 < b2.size()) {
                MomentsHitHelper.f119719r.mo166795a(b2.subList(i4, i3));
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$n */
    public static final class View$OnClickListenerC47838n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120492a;

        View$OnClickListenerC47838n(MomentsProfileActivity momentsProfileActivity) {
            this.f120492a = momentsProfileActivity;
        }

        public final void onClick(View view) {
            this.f120492a.finish();
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$b */
    public static final class C47823b<T> implements AbstractC1178x<List<? extends IMomentsItemBase>> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120476a;

        C47823b(MomentsProfileActivity momentsProfileActivity) {
            this.f120476a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends IMomentsItemBase> list) {
            MomentsFeedAdapter b = this.f120476a.mo167625b();
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            b.mo166945a(list);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$d */
    public static final class C47825d<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120478a;

        C47825d(MomentsProfileActivity momentsProfileActivity) {
            this.f120478a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            TextView textView = (TextView) this.f120478a.mo167619a(R.id.tvTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvTitle");
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$e */
    public static final class C47826e<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120479a;

        C47826e(MomentsProfileActivity momentsProfileActivity) {
            this.f120479a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            LKUIToast.show(this.f120479a, num.intValue());
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$f */
    public static final class C47827f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120480a;

        C47827f(MomentsProfileActivity momentsProfileActivity) {
            this.f120480a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f120480a.f120467c.mo92346a(new Runnable(this) {
                    /* class com.ss.android.lark.moments.impl.personal.MomentsProfileActivity.C47827f.RunnableC478281 */

                    /* renamed from: a */
                    final /* synthetic */ C47827f f120481a;

                    {
                        this.f120481a = r1;
                    }

                    public final void run() {
                        ((MomentsProfileZoomRecyclerView) this.f120481a.f120480a.mo167619a(R.id.rvFeed)).scrollToPosition(0);
                        this.f120481a.f120480a.mo167620a().refreshData(20);
                    }
                }, 500);
            }
        }
    }

    /* renamed from: a */
    public static Resources m188979a(MomentsProfileActivity momentsProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsProfileActivity);
        }
        return momentsProfileActivity.mo167626c();
    }

    /* renamed from: c */
    public static AssetManager m188982c(MomentsProfileActivity momentsProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsProfileActivity);
        }
        return momentsProfileActivity.mo167629e();
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$c */
    public static final class C47824c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120477a;

        C47824c(MomentsProfileActivity momentsProfileActivity) {
            this.f120477a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (!bool.booleanValue()) {
                ((MomentsProfileZoomRecyclerView) this.f120477a.mo167619a(R.id.rvFeed)).mo166921a();
            }
            ((LKUIPtrFrameLayout) this.f120477a.mo167619a(R.id.ptrLayout)).refreshComplete();
        }
    }

    /* renamed from: b */
    public static void m188981b(MomentsProfileActivity momentsProfileActivity) {
        momentsProfileActivity.mo167628d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsProfileActivity momentsProfileActivity2 = momentsProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$g */
    public static final class C47829g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120482a;

        C47829g(MomentsProfileActivity momentsProfileActivity) {
            this.f120482a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                UDDialogBuilder eVar = new UDDialogBuilder(this.f120482a);
                String string = UIUtils.getString(this.f120482a, R.string.Lark_Community_SelectNicknameTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "com.larksuite.framework.…nity_SelectNicknameTitle)");
                String string2 = UIUtils.getString(this.f120482a, R.string.Lark_Community_ChooseNicknameDialogDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "com.larksuite.framework.…ChooseNicknameDialogDesc)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_ChooseNicknameDialogChooseNicknameButton, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.moments.impl.personal.MomentsProfileActivity.C47829g.DialogInterface$OnClickListenerC478301 */

                    /* renamed from: a */
                    final /* synthetic */ C47829g f120483a;

                    {
                        this.f120483a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MomentsProfileActivity momentsProfileActivity = this.f120483a.f120482a;
                        Intent intent = new Intent(this.f120483a.f120482a, NickIdentityChooseActivity.class);
                        intent.putExtra("from_click_reaction", true);
                        momentsProfileActivity.startActivity(intent);
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                    }
                })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_ChooseNicknameDialogNotNowButton, DialogInterface$OnClickListenerC478312.f120484a)).show();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_profile);
        StatusBarUtil.setTransparentForImageView(this, (LinearLayout) mo167619a(R.id.titleBar), (LottieAnimationView) mo167619a(R.id.refreshIcon), (RelativeLayout) mo167619a(R.id.page_error_container));
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f120466b = stringExtra;
        mo167620a().setUserId(this.f120466b);
        m188985h();
        m188986i();
        m188984g();
        mo167620a().setSelf(getIntent().getBooleanExtra("is_self", false));
        mo167620a().initData(20);
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$h */
    public static final class C47832h<T> implements AbstractC1178x<Pair<? extends Integer, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120485a;

        C47832h(MomentsProfileActivity momentsProfileActivity) {
            this.f120485a = momentsProfileActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, String> pair) {
            if (UDUiModeUtils.m93319a(this.f120485a)) {
                MomentsProfileActivity momentsProfileActivity = this.f120485a;
                momentsProfileActivity.setLightTextStatusBar(C52990a.m205239c(momentsProfileActivity, R.color.bg_body));
            } else {
                MomentsProfileActivity momentsProfileActivity2 = this.f120485a;
                momentsProfileActivity2.setDarkTextStatusBar(C52990a.m205239c(momentsProfileActivity2, R.color.bg_body));
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f120485a.mo167619a(R.id.page_error_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "page_error_container");
            relativeLayout.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) this.f120485a.mo167619a(R.id.titleBar);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleBar");
            linearLayout.setVisibility(8);
            LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) this.f120485a.mo167619a(R.id.ptrLayout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
            lKUIPtrFrameLayout.setVisibility(8);
            ((ImageView) this.f120485a.mo167619a(R.id.page_error_iv)).setImageResource(pair.getFirst().intValue());
            TextView textView = (TextView) this.f120485a.mo167619a(R.id.page_error_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "page_error_tv");
            textView.setText(pair.getSecond());
        }
    }

    /* renamed from: a */
    public final void mo167623a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f120474k = null;
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).remove(fragment).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$k */
    public static final class C47835k implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120488a;

        C47835k(MomentsProfileActivity momentsProfileActivity) {
            this.f120488a = momentsProfileActivity;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f120488a.f120465a = f2;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileActivity$l */
    public static final class C47836l extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileActivity f120489a;

        /* renamed from: b */
        final /* synthetic */ LinearLayoutManager f120490b;

        C47836l(MomentsProfileActivity momentsProfileActivity, LinearLayoutManager linearLayoutManager) {
            this.f120489a = momentsProfileActivity;
            this.f120490b = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View findViewByPosition;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            View a = this.f120489a.mo167625b().mo166941a();
            if (a != null) {
                ((MomentsProfileZoomRecyclerView) this.f120489a.mo167619a(R.id.rvFeed)).setZoomView(a);
            }
            if (this.f120490b.findFirstVisibleItemPosition() == 0 && (findViewByPosition = this.f120490b.findViewByPosition(0)) != null) {
                MomentsProfileActivity momentsProfileActivity = this.f120489a;
                Intrinsics.checkExpressionValueIsNotNull(findViewByPosition, "it");
                int b = C52990a.m205234b(momentsProfileActivity, (float) findViewByPosition.getTop());
                if (b > -200) {
                    int c = C52990a.m205239c(momentsProfileActivity, R.color.lkui_transparent);
                    this.f120489a.setLightTextStatusBar(c);
                    this.f120489a.f120469e = true;
                    this.f120489a.f120470f = c;
                    ((LinearLayout) this.f120489a.mo167619a(R.id.titleBar)).setBackgroundColor(c);
                    ((TextView) this.f120489a.mo167619a(R.id.tvTitle)).setTextColor(c);
                    ImageView imageView = (ImageView) this.f120489a.mo167619a(R.id.icBack);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "icBack");
                    imageView.setVisibility(0);
                    MomentsProfileActivity momentsProfileActivity2 = this.f120489a;
                    ImageView imageView2 = (ImageView) momentsProfileActivity2.mo167619a(R.id.icBack);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "icBack");
                    momentsProfileActivity2.mo167622a(imageView2, C52990a.m205239c(momentsProfileActivity, R.color.ud_N00));
                    return;
                }
                float f = (float) b;
                if (f > -300.0f) {
                    float f2 = (float) 1;
                    float f3 = f - -300.0f;
                    float f4 = f2 - (f3 / 100.0f);
                    this.f120489a.setLightTextStatusBar(C25653b.m91894a(momentsProfileActivity, R.color.ud_N00, f4));
                    this.f120489a.f120469e = true;
                    this.f120489a.f120470f = C25653b.m91894a(momentsProfileActivity, R.color.ud_N00, f4);
                    ((LinearLayout) this.f120489a.mo167619a(R.id.titleBar)).setBackgroundColor(C25653b.m91894a(momentsProfileActivity, R.color.ud_N00, f4));
                    ((TextView) this.f120489a.mo167619a(R.id.tvTitle)).setTextColor(C25653b.m91894a(momentsProfileActivity, R.color.text_title, f4));
                    if (f > -240.0f) {
                        ImageView imageView3 = (ImageView) this.f120489a.mo167619a(R.id.icBack);
                        Intrinsics.checkExpressionValueIsNotNull(imageView3, "icBack");
                        imageView3.setVisibility(0);
                        float abs = f2 - (((float) Math.abs(b - -200)) / 40.0f);
                        MomentsProfileActivity momentsProfileActivity3 = this.f120489a;
                        ImageView imageView4 = (ImageView) momentsProfileActivity3.mo167619a(R.id.icBack);
                        Intrinsics.checkExpressionValueIsNotNull(imageView4, "icBack");
                        momentsProfileActivity3.mo167622a(imageView4, C25653b.m91894a(momentsProfileActivity, R.color.ud_N00, abs));
                    } else if (f > -260.0f) {
                        ImageView imageView5 = (ImageView) this.f120489a.mo167619a(R.id.icBack);
                        Intrinsics.checkExpressionValueIsNotNull(imageView5, "icBack");
                        imageView5.setVisibility(4);
                    } else {
                        ImageView imageView6 = (ImageView) this.f120489a.mo167619a(R.id.icBack);
                        Intrinsics.checkExpressionValueIsNotNull(imageView6, "icBack");
                        imageView6.setVisibility(0);
                        float abs2 = f2 - (Math.abs(f3) / 40.0f);
                        MomentsProfileActivity momentsProfileActivity4 = this.f120489a;
                        ImageView imageView7 = (ImageView) momentsProfileActivity4.mo167619a(R.id.icBack);
                        Intrinsics.checkExpressionValueIsNotNull(imageView7, "icBack");
                        momentsProfileActivity4.mo167622a(imageView7, C25653b.m91894a(momentsProfileActivity, R.color.ud_N900, abs2));
                    }
                } else {
                    this.f120489a.setDarkTextStatusBar(C52990a.m205239c(momentsProfileActivity, R.color.ud_N00));
                    this.f120489a.f120469e = false;
                    this.f120489a.f120470f = C52990a.m205239c(momentsProfileActivity, R.color.ud_N00);
                    ((LinearLayout) this.f120489a.mo167619a(R.id.titleBar)).setBackgroundColor(C52990a.m205239c(momentsProfileActivity, R.color.ud_N00));
                    ((TextView) this.f120489a.mo167619a(R.id.tvTitle)).setTextColor(C52990a.m205239c(momentsProfileActivity, R.color.text_title));
                    ImageView imageView8 = (ImageView) this.f120489a.mo167619a(R.id.icBack);
                    Intrinsics.checkExpressionValueIsNotNull(imageView8, "icBack");
                    imageView8.setVisibility(0);
                    MomentsProfileActivity momentsProfileActivity5 = this.f120489a;
                    ImageView imageView9 = (ImageView) momentsProfileActivity5.mo167619a(R.id.icBack);
                    Intrinsics.checkExpressionValueIsNotNull(imageView9, "icBack");
                    momentsProfileActivity5.mo167622a(imageView9, C52990a.m205239c(momentsProfileActivity, R.color.ud_N900));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m188980a(MomentsProfileActivity momentsProfileActivity, Context context) {
        momentsProfileActivity.mo167621a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m188978a(MomentsProfileActivity momentsProfileActivity, Configuration configuration) {
        Context a = momentsProfileActivity.mo167618a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo167622a(ImageView imageView, int i) {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ud_icon_left_outlined);
        if (drawable != null) {
            Intrinsics.checkExpressionValueIsNotNull(drawable, "ContextCompat.getDrawabl…ty, drawableId) ?: return");
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            Intrinsics.checkExpressionValueIsNotNull(mutate, "DrawableCompat.wrap(drawable).mutate()");
            C0774a.m3766a(mutate, i);
            imageView.setImageDrawable(mutate);
        }
    }

    /* renamed from: a */
    public final void mo167624a(String str, boolean z) {
        MomentsDetailLauncher.m187944a(MomentsDetailLauncher.f119660a, (Activity) this, str, z, (String) null, "community_profile", false, false, 104, (Object) null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        boolean z;
        Bundle extras;
        MomentsFeedFragment momentsFeedFragment;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (i == 211) {
            setResult(SmEvents.EVENT_NE_RR, intent);
            if (intent != null && (extras = intent.getExtras()) != null && (momentsFeedFragment = MomentsFeedPagerAdapter.f120270c.mo167404a().get()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(extras, "it");
                momentsFeedFragment.mo166890a(extras);
            }
        } else if (i2 == 101005 && bundle != null) {
            boolean z2 = bundle.getBoolean("post_deleted");
            String string = bundle.getString("post_id");
            if (z2) {
                String str = string;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    mo167620a().onPushEntityDeleted(string, EntityType.POST);
                }
            }
        }
    }
}
