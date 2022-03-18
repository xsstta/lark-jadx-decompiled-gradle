package com.ss.android.lark.moments.impl.notice;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C1067t;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrFooterView;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM;
import com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationVM;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0006\u0010*\u001a\u00020\u0017J\b\u0010+\u001a\u00020\u0017H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014¨\u0006/"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mAdapter", "Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationAdapter;", "getMAdapter", "()Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mCancelableCallbackExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mPageSkeletonRunnable", "Ljava/lang/Runnable;", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonShow", "", "mViewModel", "Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationViewModel;", "getMViewModel", "()Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationViewModel;", "mViewModel$delegate", "collectCurrentPageData", "", "hideEmptyPage", "hidePageSkeleton", "initPullToRefresh", "initRecyclerView", "initViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "refreshNotificationList", "showEmptyPage", "showErrorPage", "showPageSkeleton", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.b */
public final class MomentsNotificationFragment extends BaseFragment {

    /* renamed from: d */
    public static final Companion f120403d = new Companion(null);

    /* renamed from: a */
    public C2057g f120404a;

    /* renamed from: b */
    public boolean f120405b;

    /* renamed from: c */
    public C25969c f120406c = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: e */
    private final Lazy f120407e = LazyKt.lazy(new C47806l(this));

    /* renamed from: f */
    private final Lazy f120408f = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(MomentsNotificationViewModel.class), new MomentsNotificationFragment$$special$$inlined$viewModels$2(new MomentsNotificationFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: g */
    private Runnable f120409g;

    /* renamed from: h */
    private HashMap f120410h;

    /* renamed from: a */
    public View mo167534a(int i) {
        if (this.f120410h == null) {
            this.f120410h = new HashMap();
        }
        View view = (View) this.f120410h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f120410h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsNotificationAdapter mo167535a() {
        return (MomentsNotificationAdapter) this.f120407e.getValue();
    }

    /* renamed from: b */
    public final MomentsNotificationViewModel mo167536b() {
        return (MomentsNotificationViewModel) this.f120408f.getValue();
    }

    /* renamed from: j */
    public void mo167544j() {
        HashMap hashMap = this.f120410h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo167544j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationFragment$Companion;", "", "()V", "CATEGORY_MSG", "", "CATEGORY_REACTION", "CATEGORY_UNKNOWN", "LOG_TAG", "", "PARAMS_NOTICE_CATEGORY", "instance", "Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationFragment;", "notificationCategory", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsNotificationFragment mo167545a(int i) {
            MomentsNotificationFragment bVar = new MomentsNotificationFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("params_notice_category", i);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$l */
    static final class C47806l extends Lambda implements Function0<MomentsNotificationAdapter> {
        final /* synthetic */ MomentsNotificationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47806l(MomentsNotificationFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsNotificationAdapter invoke() {
            Context context = this.this$0.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            return new MomentsNotificationAdapter(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/moments/impl/notice/MomentsNotificationFragment$refreshNotificationList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$m */
    static final class RunnableC47807m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120424a;

        RunnableC47807m(MomentsNotificationFragment bVar) {
            this.f120424a = bVar;
        }

        public final void run() {
            ((LKUIPtrFrameLayout) this.f120424a.mo167534a(R.id.ptrLayout)).autoRefresh();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f120406c.mo92349b();
    }

    /* renamed from: g */
    public final void mo167541g() {
        Runnable runnable = this.f120409g;
        if (runnable != null) {
            this.f120406c.mo92350b(runnable);
            this.f120409g = null;
        }
        if (this.f120405b) {
            C2057g gVar = this.f120404a;
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f120405b = false;
        }
    }

    /* renamed from: i */
    public final void mo167543i() {
        RecyclerView recyclerView = (RecyclerView) mo167534a(R.id.noticeRV);
        recyclerView.scrollToPosition(0);
        recyclerView.post(new RunnableC47807m(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mo167536b().isVisible().mo5926a((Boolean) false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$o */
    public static final class RunnableC47809o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120426a;

        /* renamed from: b */
        final /* synthetic */ int f120427b;

        RunnableC47809o(MomentsNotificationFragment bVar, int i) {
            this.f120426a = bVar;
            this.f120427b = i;
        }

        public final void run() {
            MomentsNotificationFragment bVar = this.f120426a;
            bVar.f120404a = C2052c.m8961a((LinearLayout) bVar.mo167534a(R.id.skeletonLayout)).mo10151a(this.f120427b).mo10152a(UIUtils.canShowSkeleton()).mo10156d(20).mo10154b(R.color.skeleton_shine).mo10155c(1000).mo10153a();
            this.f120426a.f120405b = true;
        }
    }

    /* renamed from: c */
    public final void mo167537c() {
        int i;
        int category = mo167536b().getCategory();
        if (category == 1) {
            i = R.layout.moments_skeleton_notification_message;
        } else if (category == 2) {
            i = R.layout.moments_skeleton_notification_reaction;
        } else {
            return;
        }
        RunnableC47809o oVar = new RunnableC47809o(this, i);
        this.f120409g = oVar;
        this.f120406c.mo92345a(oVar);
        mo167540f();
    }

    /* renamed from: f */
    public final void mo167540f() {
        LinearLayout linearLayout = (LinearLayout) mo167534a(R.id.emptyLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "emptyLayout");
        linearLayout.setVisibility(8);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        super.onResume();
        boolean z = true;
        mo167536b().isVisible().mo5926a((Boolean) true);
        MomentsHitPoint.Companion aVar = MomentsHitPoint.f119720a;
        if (mo167536b().getCategory() == 1) {
            str = "notification_interaction";
        } else {
            str = "notification_emoji";
        }
        aVar.mo166844c(str);
        MomentsHitPointNew.Companion aVar2 = MomentsHitPointNew.f119721a;
        if (mo167536b().getCategory() != 2) {
            z = false;
        }
        aVar2.mo166859a(z);
    }

    /* renamed from: k */
    private final void m188899k() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        RecyclerView recyclerView = (RecyclerView) mo167534a(R.id.noticeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "noticeRV");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = (RecyclerView) mo167534a(R.id.noticeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "noticeRV");
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = (RecyclerView) mo167534a(R.id.noticeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "noticeRV");
        recyclerView3.setAdapter(mo167535a());
        ((RecyclerView) mo167534a(R.id.noticeRV)).addOnScrollListener(new C47795c(this));
    }

    /* renamed from: d */
    public final void mo167538d() {
        LinearLayout linearLayout = (LinearLayout) mo167534a(R.id.emptyLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "emptyLayout");
        linearLayout.setVisibility(0);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setVisibility(8);
        ((ImageView) mo167534a(R.id.ivEmpty)).setImageDrawable(UIHelper.getDrawable(R.drawable.illustration_empty_neutral_no_content));
        TextView textView = (TextView) mo167534a(R.id.tvEmpty);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEmpty");
        textView.setText(UIHelper.getString(R.string.Lark_Community_NoNotifications));
        mo167541g();
    }

    /* renamed from: h */
    public final void mo167542h() {
        int i;
        if (((RecyclerView) mo167534a(R.id.noticeRV)) != null) {
            RecyclerView recyclerView = (RecyclerView) mo167534a(R.id.noticeRV);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "noticeRV");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int i2 = -1;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i2 = linearLayoutManager.findFirstVisibleItemPosition();
                i = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i = -1;
            }
            if (i2 >= 0 && i >= 0) {
                List<IMomentsNotificationBaseVM> a = mo167535a().mo167520a();
                if (i2 < a.size() && i < a.size()) {
                    for (T t : a) {
                        if (t instanceof MomentsNotificationVM) {
                            MomentsHitPoint.f119720a.mo166834a(t.mo167585c());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: l */
    private final void m188900l() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrFrameLayout lKUIPtrFrameLayout2 = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout2, "ptrLayout");
        lKUIPtrFrameLayout2.setForceBackWhenComplete(true);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).setEnableScrollContentAfterLoad(true);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).disableWhenHorizontalMove(true);
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        MomentsPtrHeaderView momentsPtrHeaderView = new MomentsPtrHeaderView(context, null, 0, 6, null);
        Context context2 = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        MomentsPtrFooterView momentsPtrFooterView = new MomentsPtrFooterView(context2, null, 0, 6, null);
        LKUIPtrFrameLayout lKUIPtrFrameLayout3 = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout3, "ptrLayout");
        lKUIPtrFrameLayout3.setHeaderView(momentsPtrHeaderView);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).setFooterView(momentsPtrFooterView);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrHeaderView);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrFooterView);
        ((LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout)).setPtrHandler(new C47794b(this));
    }

    /* renamed from: m */
    private final void m188901m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            mo167536b().setCategory(arguments.getInt("params_notice_category", 0));
        }
        mo167536b().getDataList().mo5923a(getViewLifecycleOwner(), new C47796d(this));
        mo167536b().getCompleteRefresh().mo5923a(getViewLifecycleOwner(), new C47798e(this));
        mo167536b().getToastResId().mo5923a(getViewLifecycleOwner(), new C47799f(this));
        mo167536b().getPageLoading().mo5923a(getViewLifecycleOwner(), new C47800g(this));
        mo167536b().isVisible().mo5923a(getViewLifecycleOwner(), new C47801h(this));
        mo167536b().getNeedPutRead().mo5923a(getViewLifecycleOwner(), new C47802i(this));
        mo167536b().getScrollPosition().mo5923a(getViewLifecycleOwner(), new C47803j(this));
        mo167536b().getLoadFail().mo5923a(getViewLifecycleOwner(), new C47805k(this));
        mo167536b().loadFirstPage();
    }

    /* renamed from: e */
    public final void mo167539e() {
        LinearLayout linearLayout = (LinearLayout) mo167534a(R.id.emptyLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "emptyLayout");
        linearLayout.setVisibility(0);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo167534a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setVisibility(8);
        ((ImageView) mo167534a(R.id.ivEmpty)).setImageDrawable(UIHelper.getDrawable(R.drawable.illustration_empty_negative_load_failed));
        String string = UIHelper.getString(R.string.Lark_Community_UnableLoadNotifications);
        String str = string + UIHelper.getString(R.string.Lark_Community_UnableLoadNotificationsLink);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C47808n(this), string.length(), str.length(), 33);
        TextView textView = (TextView) mo167534a(R.id.tvEmpty);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEmpty");
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) mo167534a(R.id.tvEmpty);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEmpty");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) mo167534a(R.id.tvEmpty);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvEmpty");
        textView3.setHighlightColor(UIHelper.getColor(R.color.transparent));
        mo167541g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/notice/MomentsNotificationFragment$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$b */
    public static final class C47794b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120411a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47794b(MomentsNotificationFragment bVar) {
            this.f120411a = bVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            this.f120411a.mo167536b().loadMore();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            this.f120411a.mo167536b().refreshList(false);
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f120411a.mo167536b().canLoadMore()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/notice/MomentsNotificationFragment$initRecyclerView$1", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$c */
    public static final class C47795c extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120412a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47795c(MomentsNotificationFragment bVar) {
            this.f120412a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
            this.f120412a.mo167542h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$k */
    public static final class C47805k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120423a;

        C47805k(MomentsNotificationFragment bVar) {
            this.f120423a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f120423a.mo167539e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/notice/MomentsNotificationFragment$showErrorPage$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$n */
    public static final class C47808n extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120425a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47808n(MomentsNotificationFragment bVar) {
            this.f120425a = bVar;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f120425a.mo167540f();
            this.f120425a.mo167536b().loadFirstPage();
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(UIHelper.getColor(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$e */
    public static final class C47798e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120415a;

        C47798e(MomentsNotificationFragment bVar) {
            this.f120415a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((LKUIPtrFrameLayout) this.f120415a.mo167534a(R.id.ptrLayout)).refreshComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "showLoading", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$g */
    public static final class C47800g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120417a;

        C47800g(MomentsNotificationFragment bVar) {
            this.f120417a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "showLoading");
            if (bool.booleanValue()) {
                this.f120417a.mo167537c();
            } else {
                this.f120417a.mo167541g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$j */
    public static final class C47803j<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120420a;

        C47803j(MomentsNotificationFragment bVar) {
            this.f120420a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(final Integer num) {
            this.f120420a.f120406c.mo92346a(new Runnable(this) {
                /* class com.ss.android.lark.moments.impl.notice.MomentsNotificationFragment.C47803j.RunnableC478041 */

                /* renamed from: a */
                final /* synthetic */ C47803j f120421a;

                {
                    this.f120421a = r1;
                }

                public final void run() {
                    Integer num = num;
                    Intrinsics.checkExpressionValueIsNotNull(num, "it");
                    ((RecyclerView) this.f120421a.f120420a.mo167534a(R.id.noticeRV)).scrollToPosition(num.intValue());
                }
            }, 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "resId", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$f */
    public static final class C47799f<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120416a;

        C47799f(MomentsNotificationFragment bVar) {
            this.f120416a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num == null || num.intValue() != -1) {
                Context context = this.f120416a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(num, "resId");
                LKUIToast.show(context, UIHelper.getString(num.intValue()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$d */
    public static final class C47796d<T> implements AbstractC1178x<List<? extends IMomentsNotificationBaseVM>> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120413a;

        C47796d(MomentsNotificationFragment bVar) {
            this.f120413a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends IMomentsNotificationBaseVM> list) {
            if (list.isEmpty()) {
                this.f120413a.mo167538d();
                MomentsAppreciableHitPoint aVar = MomentsAppreciableHitPoint.f119684a;
                boolean z = true;
                if (this.f120413a.mo167536b().getCategory() != 1) {
                    z = false;
                }
                aVar.mo166752e(z);
                MomentsAppreciableHitPoint.f119684a.mo166738W();
            } else {
                this.f120413a.mo167540f();
            }
            MomentsNotificationAdapter a = this.f120413a.mo167535a();
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            a.mo167522a(list);
            this.f120413a.f120406c.mo92346a(new Runnable(this) {
                /* class com.ss.android.lark.moments.impl.notice.MomentsNotificationFragment.C47796d.RunnableC477971 */

                /* renamed from: a */
                final /* synthetic */ C47796d f120414a;

                {
                    this.f120414a = r1;
                }

                public final void run() {
                    this.f120414a.f120413a.mo167542h();
                }
            }, 500);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$h */
    public static final class C47801h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120418a;

        C47801h(MomentsNotificationFragment bVar) {
            this.f120418a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Log.m165389i("MomentsNotificationFragment", "isVisible changed isVisible=" + bool + " needPutRead=" + this.f120418a.mo167536b().getNeedPutRead().mo5927b());
            if (Intrinsics.areEqual((Object) bool, (Object) true) && Intrinsics.areEqual((Object) this.f120418a.mo167536b().getNeedPutRead().mo5927b(), (Object) true)) {
                this.f120418a.mo167536b().putReadNotification();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.b$i */
    public static final class C47802i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationFragment f120419a;

        C47802i(MomentsNotificationFragment bVar) {
            this.f120419a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Log.m165389i("MomentsNotificationFragment", "needPutRead changed isVisible=" + this.f120419a.mo167536b().isVisible().mo5927b() + " needPutRead=" + bool);
            if (Intrinsics.areEqual((Object) bool, (Object) true) && Intrinsics.areEqual((Object) this.f120419a.mo167536b().isVisible().mo5927b(), (Object) true)) {
                this.f120419a.mo167536b().putReadNotification();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m188899k();
        m188900l();
        m188901m();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_notification, viewGroup, false);
    }
}
