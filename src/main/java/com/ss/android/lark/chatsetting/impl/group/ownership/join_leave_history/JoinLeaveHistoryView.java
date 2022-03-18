package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.LoadingView;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001)B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J$\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\fH\u0002J\u0012\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\"\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0016\u0010'\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;", "mIsThread", "", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;Z)V", "AUTO_LOAD_MORE_THRESHOLD", "", "mAdapter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter;", "mViewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView$IDelegate;", "create", "", "destroy", "goChatProfile", "chatId", "", "hideLoading", "initContentRV", "initTitleBar", "openChat", "refreshComplete", "setMaskView", "visibility", "textId", "drawableId", "setViewDelegate", "viewDelegate", "showInitData", "joinLeaveDatas", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "showLoadFailed", "showLoadMoreData", "showLoading", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f */
public final class JoinLeaveHistoryView implements IJoinLeaveHistoryContract.IJoinLeaveHistoryView {

    /* renamed from: a */
    public final int f89719a = 10;

    /* renamed from: b */
    public IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate f89720b;

    /* renamed from: c */
    public JoinLeaveAdapter f89721c;

    /* renamed from: d */
    public final ViewDependency f89722d;

    /* renamed from: e */
    private final Context f89723e;

    /* renamed from: f */
    private final View f89724f;

    /* renamed from: g */
    private final boolean f89725g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;", "", "finish", "", "goToBotProfile", "botId", "", "goToChatProfile", "chatId", "goToUserProfile", "userId", "openChat", "openDocUrl", "url", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo128250a();

        /* renamed from: a */
        void mo128251a(String str);

        /* renamed from: b */
        void mo128252b(String str);

        /* renamed from: c */
        void mo128253c(String str);

        /* renamed from: d */
        void mo128254d(String str);

        /* renamed from: e */
        void mo128255e(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m135056e();
        m135057f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$initContentRV$3", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f$d */
    public static final class C34735d implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryView f89728a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate aVar = this.f89728a.f89720b;
            if (aVar != null) {
                return aVar.mo128226a();
            }
            return false;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            JoinLeaveAdapter bVar = this.f89728a.f89721c;
            if (bVar != null) {
                return bVar.getItemCount();
            }
            return 0 - this.f89728a.f89719a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34735d(JoinLeaveHistoryView fVar) {
            this.f89728a = fVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: c */
    public void mo128224c() {
        mo128265d();
        m135055a(0, R.string.Lark_Legacy_QrCodeDeviceError, R.drawable.illustration_placeholder_common_no_preview);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: a */
    public void mo128218a() {
        LoadingView loadingView = (LoadingView) this.f89724f.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mLoadingView");
        loadingView.setVisibility(0);
        LoadingView.m226086a((LoadingView) this.f89724f.findViewById(R.id.mLoadingView), 0, 1, null);
        m135055a(8, -1, -1);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: b */
    public void mo128221b() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.mContentPtrLayout");
        if (lKUIPtrClassicFrameLayout.isRefreshing()) {
            ((LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout)).refreshComplete();
        }
    }

    /* renamed from: d */
    public void mo128265d() {
        LoadingView loadingView = (LoadingView) this.f89724f.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mLoadingView");
        loadingView.setVisibility(8);
        ((LoadingView) this.f89724f.findViewById(R.id.mLoadingView)).mo197486a();
        m135055a(8, -1, -1);
    }

    /* renamed from: e */
    private final void m135056e() {
        if (this.f89725g) {
            ((CommonTitleBar) this.f89724f.findViewById(R.id.mTitleBar)).setTitle(R.string.Lark_Groups_MemberJoinAndLeaveHistory);
        } else {
            ((CommonTitleBar) this.f89724f.findViewById(R.id.mTitleBar)).setTitle(R.string.Lark_Group_MemberJoinAndLeaveHistory);
        }
        ((CommonTitleBar) this.f89724f.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC34736e(this));
        if (DesktopUtil.m144307b()) {
            ((CommonTitleBar) this.f89724f.findViewById(R.id.mTitleBar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        }
    }

    /* renamed from: f */
    private final void m135057f() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f89724f.findViewById(R.id.mContentRV);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mContentRV");
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(this.f89723e, 1, false));
        this.f89721c = new JoinLeaveAdapter(this.f89723e, new C34733b(this));
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f89724f.findViewById(R.id.mContentRV);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.mContentRV");
        commonRecyclerView2.setAdapter(this.f89721c);
        CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) this.f89724f.findViewById(R.id.mContentRV);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "mRootView.mContentRV");
        commonRecyclerView3.setItemAnimator(null);
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f89723e);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.mContentPtrLayout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.mContentPtrLayout");
        lKUIPtrClassicFrameLayout2.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout)).disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = (LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout3, "mRootView.mContentPtrLayout");
        lKUIPtrClassicFrameLayout3.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout)).setPtrHandler(new C34734c(this));
        C59252a.m230151a(this.f89723e, (LKUIPtrClassicFrameLayout) this.f89724f.findViewById(R.id.mContentPtrLayout), (CommonRecyclerView) this.f89724f.findViewById(R.id.mContentRV), new C34735d(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate aVar) {
        this.f89720b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$initContentRV$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$ItemClickListener;", "onBotClick", "", "botId", "", "position", "", "onChatClick", "chatId", "onDocClick", "url", "onUserClick", "userId", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f$b */
    public static final class C34733b implements JoinLeaveAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryView f89726a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34733b(JoinLeaveHistoryView fVar) {
            this.f89726a = fVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveAdapter.ItemClickListener
        /* renamed from: a */
        public void mo128232a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            this.f89726a.f89722d.mo128251a(str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveAdapter.ItemClickListener
        /* renamed from: b */
        public void mo128233b(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f89726a.f89722d.mo128254d(str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveAdapter.ItemClickListener
        /* renamed from: c */
        public void mo128234c(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "botId");
            this.f89726a.f89722d.mo128255e(str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveAdapter.ItemClickListener
        /* renamed from: d */
        public void mo128235d(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate aVar = this.f89726a.f89720b;
            if (aVar != null) {
                aVar.mo128225a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$initContentRV$2", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f$c */
    public static final class C34734c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryView f89727a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34734c(JoinLeaveHistoryView fVar) {
            this.f89727a = fVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate aVar = this.f89727a.f89720b;
            if (aVar != null) {
                aVar.mo128227b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "content");
            if (super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate aVar = this.f89727a.f89720b;
                if (aVar != null) {
                    z = aVar.mo128226a();
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.f$e */
    public static final class View$OnClickListenerC34736e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryView f89729a;

        View$OnClickListenerC34736e(JoinLeaveHistoryView fVar) {
            this.f89729a = fVar;
        }

        public final void onClick(View view) {
            this.f89729a.f89722d.mo128250a();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: a */
    public void mo128219a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89722d.mo128252b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: b */
    public void mo128222b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89722d.mo128253c(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: b */
    public void mo128223b(List<JoinLeaveViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "joinLeaveDatas");
        mo128221b();
        JoinLeaveAdapter bVar = this.f89721c;
        if (bVar != null) {
            bVar.addAll(list);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView
    /* renamed from: a */
    public void mo128220a(List<JoinLeaveViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "joinLeaveDatas");
        mo128265d();
        List<JoinLeaveViewData> list2 = list;
        if (CollectionUtils.isEmpty(list2)) {
            m135055a(0, R.string.Lark_Legacy_CurrentPageEmpty, R.drawable.empty_search);
            return;
        }
        JoinLeaveAdapter bVar = this.f89721c;
        if (bVar != null) {
            bVar.resetAll(list2);
        }
    }

    /* renamed from: a */
    private final void m135055a(int i, int i2, int i3) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89724f.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mMaskLayout");
        constraintLayout.setVisibility(i);
        if (i != 8) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89724f.findViewById(R.id.mMaskLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mMaskLayout");
            ((ImageView) constraintLayout2.findViewById(R.id.mMaskIv)).setImageResource(i3);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f89724f.findViewById(R.id.mMaskLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "mRootView.mMaskLayout");
            ((TextView) constraintLayout3.findViewById(R.id.mMaskTv)).setText(i2);
        }
    }

    public JoinLeaveHistoryView(Context context, View view, ViewDependency aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mViewDependency");
        this.f89723e = context;
        this.f89724f = view;
        this.f89722d = aVar;
        this.f89725g = z;
    }
}
