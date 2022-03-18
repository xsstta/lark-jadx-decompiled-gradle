package com.ss.android.lark.moments.impl.personal.p2361new;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C1067t;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1170p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IForwardDependency;
import com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.MomentsFeedAdapter;
import com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity;
import com.ss.android.lark.moments.impl.personal.follow.MomentsFollowActivity;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.moments.impl.report.MomentsReportActivity;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ar;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u000e\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\nH\u0002J\u0018\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "adapter", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "getAdapter", "()Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "firstResume", "", "mCancelableCallbackExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mClickListener", "com/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$mClickListener$1", "Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$mClickListener$1;", "mTouchY", "", "onScrolledSent", "viewModel", "Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileViewModel;", "getViewModel", "()Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileViewModel;", "viewModel$delegate", "initObserver", "", "initRecyclerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "sendExposureHitPoint", "isScrollEnd", "startMomentsDetailById", "postId", "", "openKeyboard", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a */
public final class MomentsProfileFragment extends BaseFragment {

    /* renamed from: e */
    public static final Companion f120599e = new Companion(null);

    /* renamed from: a */
    public C25969c f120600a = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: b */
    public float f120601b;

    /* renamed from: c */
    public boolean f120602c;

    /* renamed from: d */
    public final C47892k f120603d = new C47892k(this);

    /* renamed from: f */
    private final Lazy f120604f = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(MomentsProfileViewModel.class), new MomentsProfileFragment$$special$$inlined$viewModels$2(new MomentsProfileFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: g */
    private final Lazy f120605g = LazyKt.lazy(new C47880b(this));

    /* renamed from: h */
    private boolean f120606h = true;

    /* renamed from: i */
    private HashMap f120607i;

    /* renamed from: a */
    public View mo167747a(int i) {
        if (this.f120607i == null) {
            this.f120607i = new HashMap();
        }
        View view = (View) this.f120607i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f120607i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsProfileViewModel mo167748a() {
        return (MomentsProfileViewModel) this.f120604f.getValue();
    }

    /* renamed from: b */
    public final MomentsFeedAdapter mo167751b() {
        return (MomentsFeedAdapter) this.f120605g.getValue();
    }

    /* renamed from: c */
    public void mo167752c() {
        HashMap hashMap = this.f120607i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo167752c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$Companion;", "", "()V", "ARGUMENTS_KEY_USER_ID", "", "PRE_REQUEST_LEFT_POST_COUNT", "", "REQUEST_PAGE_POST_COUNT", "newInstance", "Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment;", "userId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileFragment mo167753a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            MomentsProfileFragment aVar = new MomentsProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("user_id", str);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$mClickListener$1", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "createPost", "", "getTouchY", "", "onClickFollowersLayout", "onClickFollowingsLayout", "onClickHashTag", "id", "", "content", "postId", "onForwardClicked", "contentText", "totalShareCount", "", "categoryId", "onItemCellClicked", "onReplyClicked", "onReportClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$k */
    public static final class C47892k implements IMomentClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120619a;

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166622b() {
            IMomentClickListener.C47490a.m188220c(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public float mo166614a() {
            return this.f120619a.f120601b;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166624c() {
            MomentsFollowActivity.Companion aVar = MomentsFollowActivity.f120526i;
            Context requireContext = this.f120619a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            aVar.mo167680b(requireContext, this.f120619a.mo167748a().getUserId());
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: d */
        public void mo166626d() {
            MomentsFollowActivity.Companion aVar = MomentsFollowActivity.f120526i;
            Context requireContext = this.f120619a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            aVar.mo167679a(requireContext, this.f120619a.mo167748a().getUserId());
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: e */
        public void mo166627e() {
            IMainModuleDependency mainDependency = MomentsDependencyHolder.f118998b.mo165899a().mainDependency();
            if (mainDependency.mo144719a("moments")) {
                Context requireContext = this.f120619a.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                Bundle bundle = new Bundle();
                bundle.putString("arguments_key_from", "from_profile_create_post");
                mainDependency.mo144717a(requireContext, "moments", bundle);
                return;
            }
            C47282k.m187260a(this.f120619a, new Intent(this.f120619a.getContext(), MomentsPublishActivity.class), 211);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47892k(MomentsProfileFragment aVar) {
            this.f120619a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166616a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intent intent = new Intent(this.f120619a.mContext, MomentsReportActivity.class);
            intent.putExtra("post_id", str);
            this.f120619a.startActivity(intent);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166623b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IMomentClickListener.C47490a.m188217a(this, str, str2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166617a(String str, View view) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(view, "imageView");
            IMomentClickListener.C47490a.m188216a(this, str, view);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166625c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, Comment.f24093e, "moments_detail_page_view", str, (String) null, (Integer) null, 24, (Object) null);
            this.f120619a.mo167749a(str, true);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166618a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitPoint.f119720a.mo166842b(str, "feed_page");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post", "moments_detail_page_view", str, (String) null, (Integer) null, 24, (Object) null);
            this.f120619a.mo167749a(str, false);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166621a(ArrayList<PhotoItem> arrayList, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoList");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            IMomentClickListener.C47490a.m188218a(this, arrayList, imageView);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166620a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(str3, "postId");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "hashtag", "moments_feed_page_view", str3, str, (Integer) null, 16, (Object) null);
            MomentsHashTagFeedActivity.Companion aVar = MomentsHashTagFeedActivity.f120187c;
            Context requireContext = this.f120619a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            aVar.mo167325a(requireContext, str, str2);
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
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "share", "public_multi_select_share_view", str2, (String) null, (Integer) null, 24, (Object) null);
            IForwardDependency forwardDependency = MomentsDependencyHolder.f118998b.mo165899a().forwardDependency();
            Context context = this.f120619a.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            forwardDependency.mo144712a(context, str, str2, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$b */
    static final class C47880b extends Lambda implements Function0<MomentsFeedAdapter> {
        final /* synthetic */ MomentsProfileFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47880b(MomentsProfileFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsFeedAdapter invoke() {
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            return new MomentsFeedAdapter(requireContext, this.this$0.f120603d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MomentsHitHelper.f119719r.mo166791a(6);
        MomentsHitHelper.f119719r.mo166821l("none");
        MomentsHitHelper.f119719r.mo166819k("none");
        Job unused = C69553g.m266944a(C1170p.m5399a(this), null, null, new C47893l(null), 3, null);
        boolean z = this.f120606h;
        if (!z || (z && !this.f120602c)) {
            m189134a(this, false, 1, null);
        }
        this.f120606h = false;
    }

    /* renamed from: d */
    private final void m189135d() {
        mo167748a().getDataList().mo5923a(getViewLifecycleOwner(), new C47881c(this));
        mo167748a().getCompleteRefresh().mo5923a(getViewLifecycleOwner(), new C47882d(this));
        mo167748a().getToastResId().mo5923a(getViewLifecycleOwner(), new C47883e(this));
        mo167748a().getNeedRefresh().mo5923a(getViewLifecycleOwner(), new C47884f(this));
        mo167748a().getStartNickIdentityActivity().mo5923a(getViewLifecycleOwner(), new C47886g(this));
    }

    /* renamed from: e */
    private final void m189136e() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167747a(R.id.ptrLayout);
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        lKUIPtrFrameLayout.setForceBackWhenComplete(true);
        lKUIPtrFrameLayout.setEnableScrollContentAfterLoad(true);
        lKUIPtrFrameLayout.disableWhenHorizontalMove(true);
        lKUIPtrFrameLayout.setPtrHandler(new C47889h(this));
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) mo167747a(R.id.rv);
        pointRecoderRecyclerView.setAdapter(mo167751b());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "this");
        pointRecoderRecyclerView.setLayoutManager(linearLayoutManager);
        pointRecoderRecyclerView.setItemAnimator(null);
        pointRecoderRecyclerView.setTouchViewListener(new C47890i(this));
        pointRecoderRecyclerView.addOnScrollListener(new C47891j(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$initRecyclerView$1$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$h */
    public static final class C47889h extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120616a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        C47889h(MomentsProfileFragment aVar) {
            this.f120616a = aVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f120616a.mo167748a().loadMorePostData(20, true, false);
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f120616a.mo167748a().canLoadMore()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$initRecyclerView$2$2", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$j */
    public static final class C47891j extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120618a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        C47891j(MomentsProfileFragment aVar) {
            this.f120618a = aVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
            this.f120618a.mo167750a(true);
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f120618a.mo167751b().getItemCount() - 15 && this.f120618a.mo167748a().canLoadMore()) {
                this.f120618a.mo167748a().loadMorePostData(20, true, false);
            }
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (!this.f120618a.f120602c && MomentsProfileFragment.m189134a(this.f120618a, false, 1, null)) {
                this.f120618a.f120602c = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$c */
    public static final class C47881c<T> implements AbstractC1178x<List<? extends IMomentsItemBase>> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120608a;

        C47881c(MomentsProfileFragment aVar) {
            this.f120608a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends IMomentsItemBase> list) {
            MomentsFeedAdapter b = this.f120608a.mo167751b();
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            b.mo166945a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "firstTime", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$d */
    public static final class C47882d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120609a;

        C47882d(MomentsProfileFragment aVar) {
            this.f120609a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((LKUIPtrFrameLayout) this.f120609a.mo167747a(R.id.ptrLayout)).refreshComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$e */
    public static final class C47883e<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120610a;

        C47883e(MomentsProfileFragment aVar) {
            this.f120610a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Context requireContext = this.f120610a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            LKUIToast.show(requireContext, num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$f */
    public static final class C47884f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120611a;

        C47884f(MomentsProfileFragment aVar) {
            this.f120611a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f120611a.f120600a.mo92346a(new Runnable(this) {
                    /* class com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileFragment.C47884f.RunnableC478851 */

                    /* renamed from: a */
                    final /* synthetic */ C47884f f120612a;

                    {
                        this.f120612a = r1;
                    }

                    public final void run() {
                        ((PointRecoderRecyclerView) this.f120612a.f120611a.mo167747a(R.id.rv)).scrollToPosition(0);
                        this.f120612a.f120611a.mo167748a().refreshData(20);
                    }
                }, 500);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileFragment$onResume$1", mo239173f = "MomentsProfileFragment.kt", mo239174i = {0}, mo239175l = {156}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$l */
    static final class C47893l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47893l(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47893l lVar = new C47893l(cVar);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47893l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MomentsHitPointNew.f119721a.mo166851a();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "need", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$g */
    public static final class C47886g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120613a;

        C47886g(MomentsProfileFragment aVar) {
            this.f120613a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                Context requireContext = this.f120613a.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDDialogBuilder eVar = new UDDialogBuilder(requireContext);
                String string = UIUtils.getString(this.f120613a.requireContext(), R.string.Lark_Community_SelectNicknameTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "com.larksuite.framework.…nity_SelectNicknameTitle)");
                String string2 = UIUtils.getString(this.f120613a.requireContext(), R.string.Lark_Community_ChooseNicknameDialogDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "com.larksuite.framework.…ChooseNicknameDialogDesc)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_ChooseNicknameDialogChooseNicknameButton, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileFragment.C47886g.DialogInterface$OnClickListenerC478871 */

                    /* renamed from: a */
                    final /* synthetic */ C47886g f120614a;

                    {
                        this.f120614a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MomentsProfileFragment aVar = this.f120614a.f120613a;
                        Intent intent = new Intent(this.f120614a.f120613a.requireContext(), NickIdentityChooseActivity.class);
                        intent.putExtra("from_click_reaction", true);
                        aVar.startActivity(intent);
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                    }
                })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_ChooseNicknameDialogNotNowButton, DialogInterface$OnClickListenerC478882.f120615a)).show();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        MomentsHitHelper.f119719r.mo166832t();
        MomentsHitHelper.f119719r.mo166791a(6);
        MomentsHitHelper.f119719r.mo166821l("none");
        MomentsHitHelper.f119719r.mo166819k("none");
        MomentsProfileViewModel a = mo167748a();
        Bundle arguments = getArguments();
        String str = "";
        if (!(arguments == null || (string = arguments.getString("user_id", str)) == null)) {
            str = string;
        }
        a.setUserId(str);
        MomentsHitHelper.f119719r.mo166827o(mo167748a().getUserId());
        mo167748a().setSelf(C57782ag.m224242a(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a(), mo167748a().getUserId()));
    }

    /* renamed from: a */
    public final boolean mo167750a(boolean z) {
        int i;
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) mo167747a(R.id.rv);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "rv");
        RecyclerView.LayoutManager layoutManager = pointRecoderRecyclerView.getLayoutManager();
        int i2 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.findFirstVisibleItemPosition();
            i = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            i = -1;
        }
        if (i2 >= 0 && i >= 0) {
            List<IMomentsItemBase> b = mo167751b().mo166946b();
            if (i2 >= b.size() || i >= b.size() || !MomentsHitPointNew.f119721a.mo166860a(b.subList(i2, i))) {
                return false;
            }
            if (z) {
                MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "slide", "none", (String) null, (String) null, (Integer) null, 28, (Object) null);
            }
            MomentsHitHelper.f119719r.mo166795a(b.subList(i2, i));
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "y", "onTouchiew", "com/ss/android/lark/moments/impl/personal/new/MomentsProfileFragment$initRecyclerView$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a$i */
    public static final class C47890i implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileFragment f120617a;

        C47890i(MomentsProfileFragment aVar) {
            this.f120617a = aVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f120617a.f120601b = f2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m189135d();
        m189136e();
        mo167748a().initData(20);
    }

    /* renamed from: a */
    public final void mo167749a(String str, boolean z) {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        MomentsDetailLauncher.m187946a(MomentsDetailLauncher.f119660a, this, context, str, z, null, "feed_page", false, false, 208, null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_profile, viewGroup, false);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m189134a(MomentsProfileFragment aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return aVar.mo167750a(z);
    }
}
