package com.ss.android.lark.moments.impl.personal.follow;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrFooterView;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView;
import com.ss.android.lark.moments.impl.common.widget.ScrollerConflictPtrFrameLayout;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.FollowMomentUser;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.IMomentsFollowVM;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.MomentsFollowersListVM;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.MomentsFollowingListVM;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0014J\b\u0010\u001e\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "adapter", "Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowAdapter;", "emptyText", "", "mPageSkeletonRunnable", "Ljava/lang/Runnable;", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonShow", "", "mTouchY", "", "titleText", ShareHitPoint.f121869d, "", "userId", "vm", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/IMomentsFollowVM;", "hidePageSkeleton", "", "initPullToRefresh", "initRecyclerView", "initTitleBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showPageSkeleton", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsFollowActivity extends BaseFragmentActivity {

    /* renamed from: i */
    public static final Companion f120526i = new Companion(null);

    /* renamed from: a */
    public String f120527a = "";

    /* renamed from: b */
    public IMomentsFollowVM f120528b;

    /* renamed from: c */
    public MomentsFollowAdapter f120529c;

    /* renamed from: d */
    public float f120530d;

    /* renamed from: e */
    public String f120531e = "";

    /* renamed from: f */
    public C2057g f120532f;

    /* renamed from: g */
    public boolean f120533g;

    /* renamed from: h */
    public int f120534h;

    /* renamed from: j */
    private String f120535j = "";

    /* renamed from: k */
    private Runnable f120536k;

    /* renamed from: l */
    private HashMap f120537l;

    /* renamed from: a */
    public Context mo167670a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo167671a(int i) {
        if (this.f120537l == null) {
            this.f120537l = new HashMap();
        }
        View view = (View) this.f120537l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120537l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo167673a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189053a(this, context);
    }

    /* renamed from: b */
    public Resources mo167674b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo167675c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189051a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo167677d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m189055c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189052a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189054b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowActivity$Companion;", "", "()V", "FOLLOW_LIST_TYPE_EMPTY", "", "FOLLOW_LIST_TYPE_FOLLOWERS", "FOLLOW_LIST_TYPE_FOLLOWINGS", "KEY_FOLLOW_LIST_TYPE", "", "KEY_USER_ID", "ONE_PAGE_ITEM_COUNT", "startMomentsFollowerActivity", "", "context", "Landroid/content/Context;", "userId", "startMomentsFollowingActivity", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo167679a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intent intent = new Intent(context, MomentsFollowActivity.class);
            intent.putExtra("user_id", str);
            intent.putExtra("follow_list_type", 1);
            C47282k.m187257a(context, intent);
        }

        /* renamed from: b */
        public final void mo167680b(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intent intent = new Intent(context, MomentsFollowActivity.class);
            intent.putExtra("user_id", str);
            intent.putExtra("follow_list_type", 2);
            C47282k.m187257a(context, intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowActivity$initRecyclerView$1", "Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "getHitPointPageType", "", "onClickFollowBtn", "", "user", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onClickUserAvatar", "onClickUserItem", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$d */
    public static final class C47851d implements IMomentsFollowClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120540a;

        /* renamed from: c */
        private final String m189069c() {
            if (this.f120540a.f120534h == 2) {
                return "follow";
            }
            return "followed";
        }

        @Override // com.ss.android.lark.moments.impl.personal.follow.IMomentsFollowClickListener
        /* renamed from: a */
        public void mo167681a() {
            MomentsHitPointNew.f119721a.mo166864b(m189069c(), "other_profile", "profile_main_view", this.f120540a.f120527a);
        }

        @Override // com.ss.android.lark.moments.impl.personal.follow.IMomentsFollowClickListener
        /* renamed from: b */
        public void mo167683b() {
            MomentsHitPointNew.f119721a.mo166864b(m189069c(), "moments_profile", "moments_feed_page_view", this.f120540a.f120527a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47851d(MomentsFollowActivity momentsFollowActivity) {
            this.f120540a = momentsFollowActivity;
        }

        @Override // com.ss.android.lark.moments.impl.personal.follow.IMomentsFollowClickListener
        /* renamed from: a */
        public void mo167682a(MomentUser momentUser) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(momentUser, "user");
            MomentsHitPoint.Companion aVar = MomentsHitPoint.f119720a;
            if (this.f120540a.f120534h == 2) {
                str = "following_page";
            } else {
                str = "follower_page";
            }
            aVar.mo166839a(str, !momentUser.is_current_user_following.booleanValue(), this.f120540a.f120527a);
            Boolean bool = momentUser.is_current_user_following;
            Intrinsics.checkExpressionValueIsNotNull(bool, "user.is_current_user_following");
            if (bool.booleanValue()) {
                str2 = "follow_cancel";
            } else {
                str2 = "follow";
            }
            MomentsHitPointNew.f119721a.mo166864b(m189069c(), str2, "none", this.f120540a.f120527a);
            IMomentsFollowVM bVar = this.f120540a.f120528b;
            if (bVar != null) {
                bVar.changeFollowState(momentUser);
            }
        }
    }

    /* renamed from: h */
    private final void m189059h() {
        RunnableC47855h hVar = new RunnableC47855h(this);
        this.f120536k = hVar;
        UICallbackExecutor.executeDelayed(hVar, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        String str;
        super.onResume();
        if (this.f120534h != 2) {
            str = "followed";
        } else {
            str = "follow";
        }
        MomentsHitPointNew.f119721a.mo166869d(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$h */
    public static final class RunnableC47855h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120544a;

        RunnableC47855h(MomentsFollowActivity momentsFollowActivity) {
            this.f120544a = momentsFollowActivity;
        }

        public final void run() {
            MomentsFollowActivity momentsFollowActivity = this.f120544a;
            momentsFollowActivity.f120532f = C2052c.m8961a((FrameLayout) momentsFollowActivity.mo167671a(R.id.skeleton)).mo10151a(R.layout.item_skeleton_moments_follow).mo10152a(UIUtils.canShowSkeleton()).mo10156d(20).mo10154b(R.color.skeleton_shine).mo10155c(1000).mo10153a();
            this.f120544a.f120533g = true;
        }
    }

    /* renamed from: e */
    private final void m189056e() {
        ((CommonTitleBar) mo167671a(R.id.titleBar)).setTitle(this.f120535j);
        ((CommonTitleBar) mo167671a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC47852e(this));
    }

    /* renamed from: f */
    private final void m189057f() {
        MomentsFollowActivity momentsFollowActivity = this;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(momentsFollowActivity, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) mo167671a(R.id.rvFollow);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "rvFollow");
        pointRecoderRecyclerView.setItemAnimator(null);
        PointRecoderRecyclerView pointRecoderRecyclerView2 = (PointRecoderRecyclerView) mo167671a(R.id.rvFollow);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView2, "rvFollow");
        pointRecoderRecyclerView2.setLayoutManager(linearLayoutManager);
        this.f120529c = new MomentsFollowAdapter(momentsFollowActivity, new C47851d(this));
        PointRecoderRecyclerView pointRecoderRecyclerView3 = (PointRecoderRecyclerView) mo167671a(R.id.rvFollow);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView3, "rvFollow");
        pointRecoderRecyclerView3.setAdapter(this.f120529c);
    }

    /* renamed from: g */
    private final void m189058g() {
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
        scrollerConflictPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout2 = (ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout2, "ptrLayout");
        scrollerConflictPtrFrameLayout2.setForceBackWhenComplete(true);
        ((ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout)).disableWhenHorizontalMove(true);
        MomentsFollowActivity momentsFollowActivity = this;
        MomentsPtrHeaderView momentsPtrHeaderView = new MomentsPtrHeaderView(momentsFollowActivity, null, 0, 6, null);
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout3 = (ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout3, "ptrLayout");
        scrollerConflictPtrFrameLayout3.setHeaderView(momentsPtrHeaderView);
        ((ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrHeaderView);
        MomentsPtrFooterView momentsPtrFooterView = new MomentsPtrFooterView(momentsFollowActivity, null, 0, 6, null);
        ((ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout)).setFooterView(momentsPtrFooterView);
        ((ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrFooterView);
        ((ScrollerConflictPtrFrameLayout) mo167671a(R.id.ptrLayout)).setPtrHandler(new C47849b(this));
        ((PointRecoderRecyclerView) mo167671a(R.id.rvFollow)).setTouchViewListener(new C47850c(this));
    }

    /* renamed from: a */
    public final void mo167672a() {
        Runnable runnable = this.f120536k;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f120536k = null;
        }
        if (this.f120533g) {
            C2057g gVar = this.f120532f;
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f120533g = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowActivity$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$b */
    public static final class C47849b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120538a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47849b(MomentsFollowActivity momentsFollowActivity) {
            this.f120538a = momentsFollowActivity;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IMomentsFollowVM bVar = this.f120538a.f120528b;
            if (bVar != null) {
                bVar.getUserList(this.f120538a.f120527a, 20);
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IMomentsFollowVM bVar = this.f120538a.f120528b;
            if (bVar != null) {
                bVar.refreshUserList(this.f120538a.f120527a, 20);
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            IMomentsFollowVM bVar = this.f120538a.f120528b;
            if (bVar != null) {
                z = bVar.hasNextUserPage();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$e */
    public static final class View$OnClickListenerC47852e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120541a;

        View$OnClickListenerC47852e(MomentsFollowActivity momentsFollowActivity) {
            this.f120541a = momentsFollowActivity;
        }

        public final void onClick(View view) {
            this.f120541a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$g */
    static final class C47854g<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120543a;

        C47854g(MomentsFollowActivity momentsFollowActivity) {
            this.f120543a = momentsFollowActivity;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            LKUIToast.show(this.f120543a, num.intValue());
        }
    }

    /* renamed from: a */
    public static Resources m189052a(MomentsFollowActivity momentsFollowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsFollowActivity);
        }
        return momentsFollowActivity.mo167674b();
    }

    /* renamed from: c */
    public static AssetManager m189055c(MomentsFollowActivity momentsFollowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsFollowActivity);
        }
        return momentsFollowActivity.mo167677d();
    }

    /* renamed from: b */
    public static void m189054b(MomentsFollowActivity momentsFollowActivity) {
        momentsFollowActivity.mo167675c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsFollowActivity momentsFollowActivity2 = momentsFollowActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsFollowActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$f */
    static final class C47853f<T> implements AbstractC1178x<List<? extends FollowMomentUser>> {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120542a;

        C47853f(MomentsFollowActivity momentsFollowActivity) {
            this.f120542a = momentsFollowActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<FollowMomentUser> list) {
            this.f120542a.mo167672a();
            MomentsFollowAdapter cVar = this.f120542a.f120529c;
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                cVar.mo167701a(list);
            }
            ((ScrollerConflictPtrFrameLayout) this.f120542a.mo167671a(R.id.ptrLayout)).refreshComplete();
            if (list.isEmpty()) {
                ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) this.f120542a.mo167671a(R.id.ptrLayout);
                Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
                scrollerConflictPtrFrameLayout.setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f120542a.mo167671a(R.id.followEmptyLayout);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "followEmptyLayout");
                constraintLayout.setVisibility(0);
                ((ConstraintLayout) this.f120542a.mo167671a(R.id.followEmptyLayout)).setPadding(0, 0, 0, DeviceUtils.getStatusHeight(this.f120542a) + UIUtils.dp2px(this.f120542a, 50.0f));
                TextView textView = (TextView) this.f120542a.mo167671a(R.id.tvEmpty);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvEmpty");
                textView.setText(this.f120542a.f120531e);
                return;
            }
            ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout2 = (ScrollerConflictPtrFrameLayout) this.f120542a.mo167671a(R.id.ptrLayout);
            Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout2, "ptrLayout");
            scrollerConflictPtrFrameLayout2.setVisibility(0);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f120542a.mo167671a(R.id.followEmptyLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "followEmptyLayout");
            constraintLayout2.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        LiveData<Integer> toastResId;
        LiveData<List<FollowMomentUser>> userList;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView(R.layout.moments_fragment_follow_list);
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("user_id")) == null) {
            str = "";
        }
        this.f120527a = str;
        Intent intent2 = getIntent();
        int i = 0;
        if (intent2 != null) {
            i = intent2.getIntExtra("follow_list_type", 0);
        }
        this.f120534h = i;
        boolean a = C57782ag.m224242a(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a(), this.f120527a);
        int i2 = this.f120534h;
        if (i2 == 2) {
            this.f120528b = (IMomentsFollowVM) new C1144ai(this).mo6005a(MomentsFollowingListVM.class);
            MomentsFollowActivity momentsFollowActivity = this;
            String string = UIUtils.getString(momentsFollowActivity, R.string.Lark_MomentFollowing_ListTitle);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(this, …omentFollowing_ListTitle)");
            this.f120535j = string;
            if (a) {
                str3 = UIUtils.getString(momentsFollowActivity, R.string.Lark_Community_FollowingEmptyState);
                Intrinsics.checkExpressionValueIsNotNull(str3, "UIUtils.getString(this, …nity_FollowingEmptyState)");
            } else {
                str3 = UIUtils.getString(momentsFollowActivity, R.string.Lark_Community_OtherUserNotFollowingEmptyState);
                Intrinsics.checkExpressionValueIsNotNull(str3, "UIUtils.getString(this, …erNotFollowingEmptyState)");
            }
            this.f120531e = str3;
        } else if (i2 == 1) {
            this.f120528b = (IMomentsFollowVM) new C1144ai(this).mo6005a(MomentsFollowersListVM.class);
            MomentsFollowActivity momentsFollowActivity2 = this;
            String string2 = UIUtils.getString(momentsFollowActivity2, R.string.Lark_MomentFollowers_ListTitle);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(this, …omentFollowers_ListTitle)");
            this.f120535j = string2;
            if (a) {
                str2 = UIUtils.getString(momentsFollowActivity2, R.string.Lark_Community_FollowersEmptyState);
                Intrinsics.checkExpressionValueIsNotNull(str2, "UIUtils.getString(this, …nity_FollowersEmptyState)");
            } else {
                str2 = UIUtils.getString(momentsFollowActivity2, R.string.Lark_Community_OtherUserNoFollowersEmptyState);
                Intrinsics.checkExpressionValueIsNotNull(str2, "UIUtils.getString(this, …serNoFollowersEmptyState)");
            }
            this.f120531e = str2;
        }
        m189056e();
        m189057f();
        m189058g();
        IMomentsFollowVM bVar = this.f120528b;
        if (!(bVar == null || (userList = bVar.getUserList()) == null)) {
            userList.mo5923a(this, new C47853f(this));
        }
        IMomentsFollowVM bVar2 = this.f120528b;
        if (!(bVar2 == null || (toastResId = bVar2.getToastResId()) == null)) {
            toastResId.mo5923a(this, new C47854g(this));
        }
        m189059h();
        IMomentsFollowVM bVar3 = this.f120528b;
        if (bVar3 != null) {
            bVar3.getUserList(this.f120527a, 20);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity$c */
    public static final class C47850c implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowActivity f120539a;

        C47850c(MomentsFollowActivity momentsFollowActivity) {
            this.f120539a = momentsFollowActivity;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f120539a.f120530d = f2;
        }
    }

    /* renamed from: a */
    public static void m189053a(MomentsFollowActivity momentsFollowActivity, Context context) {
        momentsFollowActivity.mo167673a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsFollowActivity);
        }
    }

    /* renamed from: a */
    public static Context m189051a(MomentsFollowActivity momentsFollowActivity, Configuration configuration) {
        Context a = momentsFollowActivity.mo167670a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
