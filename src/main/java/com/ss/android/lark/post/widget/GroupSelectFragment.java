package com.ss.android.lark.post.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.post.widget.GroupSelectAdapter;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\nJ&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0004J\u0014\u0010 \u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mDelegate", "Lcom/ss/android/lark/post/widget/GroupSelectFragment$Delegate;", "mGroupSelectAdapter", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter;", "mSkeleton", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "hideSkeletonRecyclerView", "", "initGroupSelectRecycleView", "initGroupsPtrLayout", "initSkeletonRecycleView", "initTitleBar", "initView", "isShowSkeleton", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshComplete", "setDelegate", "delegate", "updateGroupRv", "groups", "", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "Companion", "Delegate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.post.b.c */
public final class GroupSelectFragment extends BaseFragment {

    /* renamed from: c */
    public static final Companion f129498c = new Companion(null);

    /* renamed from: a */
    public GroupSelectAdapter f129499a = new GroupSelectAdapter();

    /* renamed from: b */
    public Delegate f129500b;

    /* renamed from: d */
    private C2048a f129501d;

    /* renamed from: e */
    private HashMap f129502e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectFragment$Delegate;", "", "canLoadMore", "", "onBackPressed", "", "onClickGroupItem", "topicGroup", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "onLoadMore", "setTitleBar", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$b */
    public interface Delegate {
        /* renamed from: a */
        void mo178645a();

        /* renamed from: a */
        void mo178646a(C29607af afVar);

        /* renamed from: a */
        void mo178647a(CommonTitleBar commonTitleBar);

        /* renamed from: b */
        boolean mo178648b();

        /* renamed from: c */
        void mo178649c();
    }

    /* renamed from: a */
    public View mo178744a(int i) {
        if (this.f129502e == null) {
            this.f129502e = new HashMap();
        }
        View view = (View) this.f129502e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129502e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo178750d() {
        HashMap hashMap = this.f129502e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo178750d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectFragment$Companion;", "", "()V", "AUTO_LOAD_MESSAGE_THRESHOLD", "", "newInstance", "Lcom/ss/android/lark/post/widget/GroupSelectFragment;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final GroupSelectFragment mo178751a() {
            GroupSelectFragment cVar = new GroupSelectFragment();
            cVar.setArguments(new Bundle());
            return cVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final boolean m202492j() {
        return UIUtils.canShowSkeleton();
    }

    /* renamed from: c */
    public final void mo178749c() {
        Delegate bVar = this.f129500b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        bVar.mo178645a();
    }

    /* renamed from: a */
    public final void mo178745a() {
        m202487e();
        m202490h();
        m202489g();
        m202488f();
    }

    /* renamed from: b */
    public final void mo178748b() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "groupsPtrLayout");
        if (lKUIPtrClassicFrameLayout.isRefreshing()) {
            ((LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout)).refreshComplete();
        }
    }

    /* renamed from: e */
    private final void m202487e() {
        Delegate bVar = this.f129500b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo178744a(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "titleBar");
        bVar.mo178647a(commonTitleBar);
        ((CommonTitleBar) mo178744a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC52199f(this));
    }

    /* renamed from: i */
    private final void m202491i() {
        RecyclerView recyclerView = (RecyclerView) mo178744a(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "skeletonLoadingRv");
        if (recyclerView.getVisibility() == 0) {
            RecyclerView recyclerView2 = (RecyclerView) mo178744a(R.id.skeletonLoadingRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "skeletonLoadingRv");
            recyclerView2.setVisibility(8);
            C2048a aVar = this.f129501d;
            if (aVar != null) {
                aVar.mo10130b();
            }
        }
    }

    /* renamed from: f */
    private final void m202488f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) mo178744a(R.id.selectGroupRv);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "selectGroupRv");
        pointRecoderRecyclerView.setLayoutManager(linearLayoutManager);
        PointRecoderRecyclerView pointRecoderRecyclerView2 = (PointRecoderRecyclerView) mo178744a(R.id.selectGroupRv);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView2, "selectGroupRv");
        pointRecoderRecyclerView2.setAdapter(this.f129499a);
        ((PointRecoderRecyclerView) mo178744a(R.id.selectGroupRv)).addOnScrollListener(new C52196c(this));
        this.f129499a.mo178717a(new C52197d(this));
    }

    /* renamed from: g */
    private final void m202489g() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.mContext);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "groupsPtrLayout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "groupsPtrLayout");
        lKUIPtrClassicFrameLayout2.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout)).disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = (LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout3, "groupsPtrLayout");
        lKUIPtrClassicFrameLayout3.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) mo178744a(R.id.groupsPtrLayout)).setPtrHandler(new C52198e(this));
    }

    /* renamed from: h */
    private final void m202490h() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        RecyclerView recyclerView = (RecyclerView) mo178744a(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "skeletonLoadingRv");
        recyclerView.setLayoutManager(linearLayoutManager);
        if (m202492j()) {
            RecyclerView recyclerView2 = (RecyclerView) mo178744a(R.id.skeletonLoadingRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "skeletonLoadingRv");
            recyclerView2.setVisibility(0);
            this.f129501d = C2052c.m8960a((RecyclerView) mo178744a(R.id.skeletonLoadingRv)).mo10139e(R.layout.item_group_select_skeletom).mo10133a(true).mo10138d(20).mo10137c(R.color.a60_white).mo10131a(11).mo10135b(1000).mo10136b(true).mo10134a();
            return;
        }
        RecyclerView recyclerView3 = (RecyclerView) mo178744a(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "skeletonLoadingRv");
        recyclerView3.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectFragment$initGroupSelectRecycleView$1", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$c */
    public static final class C52196c extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ GroupSelectFragment f129503a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52196c(GroupSelectFragment cVar) {
            this.f129503a = cVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f129503a.f129499a.getItemCount() - 5 && GroupSelectFragment.m202486a(this.f129503a).mo178648b()) {
                ((LKUIPtrClassicFrameLayout) this.f129503a.mo178744a(R.id.groupsPtrLayout)).autoLoadMore();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectFragment$initGroupSelectRecycleView$2", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupSelectListener;", "onGroupSelected", "", "topicGroup", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$d */
    public static final class C52197d implements GroupSelectAdapter.GroupSelectListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectFragment f129504a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52197d(GroupSelectFragment cVar) {
            this.f129504a = cVar;
        }

        @Override // com.ss.android.lark.post.widget.GroupSelectAdapter.GroupSelectListener
        /* renamed from: a */
        public void mo178721a(C29607af afVar) {
            Intrinsics.checkParameterIsNotNull(afVar, "topicGroup");
            GroupSelectFragment.m202486a(this.f129504a).mo178646a(afVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectFragment$initGroupsPtrLayout$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$e */
    public static final class C52198e extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ GroupSelectFragment f129505a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "content");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52198e(GroupSelectFragment cVar) {
            this.f129505a = cVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            GroupSelectFragment.m202486a(this.f129505a).mo178649c();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "content");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !GroupSelectFragment.m202486a(this.f129505a).mo178648b()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.c$f */
    public static final class View$OnClickListenerC52199f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectFragment f129506a;

        View$OnClickListenerC52199f(GroupSelectFragment cVar) {
            this.f129506a = cVar;
        }

        public final void onClick(View view) {
            this.f129506a.mo178749c();
        }
    }

    /* renamed from: a */
    public final void mo178746a(Delegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f129500b = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Delegate m202486a(GroupSelectFragment cVar) {
        Delegate bVar = cVar.f129500b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo178747a(List<C29607af> list) {
        Intrinsics.checkParameterIsNotNull(list, "groups");
        m202491i();
        mo178748b();
        this.f129499a.resetAll(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        mo178745a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.group_select_view, viewGroup, false);
    }
}
