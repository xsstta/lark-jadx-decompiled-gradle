package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.LoadingView;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0002\u0010\u0013\u0018\u00002\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0016\u0010\u001d\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\u0012\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\u0018\u00102\u001a\u00020\u00192\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001bH\u0016J\b\u00104\u001a\u00020\u0019H\u0016J\u001c\u00105\u001a\u00020\u00192\b\b\u0001\u00106\u001a\u00020\f2\b\b\u0001\u00107\u001a\u00020\fH\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u001cH\u0016J\b\u0010:\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "isThread", "", "mDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;ZLcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;)V", "AUTO_LOAD_MORE_THRESHOLD", "", "mAdapter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter;", "mCancelAction", "com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mCancelAction$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mCancelAction$1;", "mNormalAction", "com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mNormalAction$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mNormalAction$1;", "mSelectedCount", "mViewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView$Delegate;", "activateItems", "", "ids", "", "", "addItemList", "items", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "changeToNormalStatus", "changeToSelectable", "create", "destroy", "hideLoading", "initRV", "initSelectLayout", "initTitleBar", "openBotProfile", BottomDialog.f17198f, "openChatProfile", "chatId", "openChatWindow", "openUserProfile", "refreshComplete", "setViewDelegate", "viewDelegate", "showError", "showInitData", "initData", "showLoading", "showMask", "drawable", "string", "showToast", "msg", "updateSelectCountText", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l */
public final class SharingHistoryView implements ISharingHistoryContract.IView {

    /* renamed from: a */
    public final int f89921a = 10;

    /* renamed from: b */
    public ISharingHistoryContract.IView.Delegate f89922b;

    /* renamed from: c */
    public SharingHistoryAdapter f89923c;

    /* renamed from: d */
    public int f89924d;

    /* renamed from: e */
    public final ViewDependency f89925e;

    /* renamed from: f */
    private final C34815h f89926f;

    /* renamed from: g */
    private final C34814g f89927g;

    /* renamed from: h */
    private final Context f89928h;

    /* renamed from: i */
    private final View f89929i;

    /* renamed from: j */
    private final boolean f89930j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;", "", "finish", "", "goToBotProfile", BottomDialog.f17198f, "", "goToChatWindow", "chatId", "goToGroupChatProfile", "goToUserProfile", "openDocUrl", "url", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo128470a();

        /* renamed from: a */
        void mo128471a(String str);

        /* renamed from: b */
        void mo128472b(String str);

        /* renamed from: c */
        void mo128473c(String str);

        /* renamed from: d */
        void mo128474d(String str);

        /* renamed from: e */
        void mo128475e(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$initRV$3", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$d */
    public static final class C34811d implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89933a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            ISharingHistoryContract.IView.Delegate aVar = this.f89933a.f89922b;
            if (aVar != null) {
                return aVar.mo128446a();
            }
            return false;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            int i;
            SharingHistoryAdapter eVar = this.f89933a.f89923c;
            if (eVar != null) {
                i = eVar.getItemCount();
            } else {
                i = 0;
            }
            return i - this.f89933a.f89921a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34811d(SharingHistoryView lVar) {
            this.f89933a = lVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: a */
    public void mo128432a() {
        m135329a(R.drawable.illustration_placeholder_common_load_failed, R.string.Lark_Legacy_LoadingFailed);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m135332j();
        m135330h();
        m135331i();
    }

    /* renamed from: i */
    private final void m135331i() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mSelectLayout");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mSelectLayout");
        ((TextView) constraintLayout2.findViewById(R.id.mConfirmBtn)).setOnClickListener(new View$OnClickListenerC34812e(this));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: b */
    public void mo128435b() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.mPtrFl");
        if (lKUIPtrClassicFrameLayout.isRefreshing()) {
            ((LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl)).refreshComplete();
        }
    }

    /* renamed from: e */
    public final void mo128496e() {
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            eVar.mo128453a(false);
        }
        SharingHistoryAdapter eVar2 = this.f89923c;
        if (eVar2 != null) {
            eVar2.notifyDataSetChanged();
        }
        m135330h();
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mSelectLayout");
        constraintLayout.setVisibility(8);
    }

    /* renamed from: h */
    private final void m135330h() {
        int i;
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).removeAllActions();
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).setTitle(R.string.Lark_Group_SharingHistory);
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).setLeftClickListener(new View$OnClickListenerC34813f(this));
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            i = eVar.getItemCount();
        } else {
            i = 0;
        }
        if (i > 0) {
            ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).addAction(this.f89926f);
        }
        if (DesktopUtil.m144307b()) {
            ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: c */
    public void mo128438c() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mMaskLayout");
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mMaskLayout");
        LoadingView loadingView = (LoadingView) constraintLayout2.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mMaskLayout.mLoadingView");
        loadingView.setVisibility(0);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "mRootView.mMaskLayout");
        LoadingView.m226086a((LoadingView) constraintLayout3.findViewById(R.id.mLoadingView), 0, 1, null);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: d */
    public void mo128441d() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mMaskLayout");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mMaskLayout");
        LoadingView loadingView = (LoadingView) constraintLayout2.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mMaskLayout.mLoadingView");
        loadingView.setVisibility(8);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "mRootView.mMaskLayout");
        ((LoadingView) constraintLayout3.findViewById(R.id.mLoadingView)).mo197486a();
    }

    /* renamed from: f */
    public final void mo128497f() {
        List<String> a;
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            eVar.mo128453a(true);
        }
        SharingHistoryAdapter eVar2 = this.f89923c;
        if (eVar2 != null) {
            eVar2.notifyDataSetChanged();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mSelectLayout");
        int i = 0;
        constraintLayout.setVisibility(0);
        SharingHistoryAdapter eVar3 = this.f89923c;
        if (!(eVar3 == null || (a = eVar3.mo128450a()) == null)) {
            i = a.size();
        }
        this.f89924d = i;
        mo128498g();
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).removeAllActions();
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).setTitle(R.string.Lark_Chat_DeactivateShare);
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).addAction(this.f89927g);
    }

    /* renamed from: g */
    public final void mo128498g() {
        int i;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mSelectLayout");
        TextView textView = (TextView) constraintLayout.findViewById(R.id.mSelectCountTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mSelectLayout.mSelectCountTv");
        textView.setText(UIUtils.getString(this.f89928h, R.string.Lark_Legacy_HasSelected) + this.f89924d);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mSelectLayout");
        View findViewById = constraintLayout2.findViewById(R.id.mMaskView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mSelectLayout.mMaskView");
        if (this.f89924d == 0) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    /* renamed from: j */
    private final void m135332j() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f89929i.findViewById(R.id.mRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mRecyclerView");
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(this.f89928h, 1, false));
        this.f89923c = new SharingHistoryAdapter(this.f89928h, this.f89930j, new C34809b(this));
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f89929i.findViewById(R.id.mRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.mRecyclerView");
        commonRecyclerView2.setAdapter(this.f89923c);
        CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) this.f89929i.findViewById(R.id.mRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "mRootView.mRecyclerView");
        commonRecyclerView3.setLayoutManager(new LinearLayoutManager(this.f89928h, 1, false));
        CommonRecyclerView commonRecyclerView4 = (CommonRecyclerView) this.f89929i.findViewById(R.id.mRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView4, "mRootView.mRecyclerView");
        commonRecyclerView4.setItemAnimator(null);
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f89928h);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.mPtrFl");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.mPtrFl");
        lKUIPtrClassicFrameLayout2.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl)).disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = (LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout3, "mRootView.mPtrFl");
        lKUIPtrClassicFrameLayout3.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl)).setPtrHandler(new C34810c(this));
        C59252a.m230151a(this.f89928h, (LKUIPtrClassicFrameLayout) this.f89929i.findViewById(R.id.mPtrFl), (CommonRecyclerView) this.f89929i.findViewById(R.id.mRecyclerView), new C34811d(this));
    }

    /* renamed from: a */
    public void setViewDelegate(ISharingHistoryContract.IView.Delegate aVar) {
        this.f89922b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$initRV$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$IItemClickListener;", "onAvatarClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "onItemClick", "onSharingNameClick", "onSharingTargetClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$b */
    public static final class C34809b implements SharingHistoryAdapter.IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89931a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34809b(SharingHistoryView lVar) {
            this.f89931a = lVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryAdapter.IItemClickListener
        /* renamed from: b */
        public void mo128457b(View view, SharingHistoryViewData sharingHistoryViewData) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f89931a.f89925e.mo128472b(sharingHistoryViewData.mo128409e());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryAdapter.IItemClickListener
        /* renamed from: c */
        public void mo128458c(View view, SharingHistoryViewData sharingHistoryViewData) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f89931a.f89925e.mo128472b(sharingHistoryViewData.mo128409e());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryAdapter.IItemClickListener
        /* renamed from: a */
        public void mo128456a(View view, SharingHistoryViewData sharingHistoryViewData) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (sharingHistoryViewData.mo128406b()) {
                this.f89931a.f89924d++;
            } else {
                SharingHistoryView lVar = this.f89931a;
                lVar.f89924d--;
            }
            if (this.f89931a.f89924d < 0) {
                this.f89931a.f89924d = 0;
            }
            this.f89931a.mo128498g();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryAdapter.IItemClickListener
        /* renamed from: d */
        public void mo128459d(View view, SharingHistoryViewData sharingHistoryViewData) {
            ISharingHistoryContract.IView.Delegate aVar;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SharingTarget i = sharingHistoryViewData.mo128415i();
            if (i instanceof DocTarget) {
                this.f89931a.f89925e.mo128473c(((DocTarget) sharingHistoryViewData.mo128415i()).mo128423a());
            } else if (i instanceof ChatTarget) {
                ISharingHistoryContract.IView.Delegate aVar2 = this.f89931a.f89922b;
                if (aVar2 != null) {
                    aVar2.mo128444a(((ChatTarget) sharingHistoryViewData.mo128415i()).mo128421a());
                }
            } else if ((i instanceof ChatterTarget) && (aVar = this.f89931a.f89922b) != null) {
                aVar.mo128448b(((ChatterTarget) sharingHistoryViewData.mo128415i()).mo128422a());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$initRV$2", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$c */
    public static final class C34810c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89932a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34810c(SharingHistoryView lVar) {
            this.f89932a = lVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            ISharingHistoryContract.IView.Delegate aVar = this.f89932a.f89922b;
            if (aVar != null) {
                aVar.mo128447b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "content");
            if (super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                ISharingHistoryContract.IView.Delegate aVar = this.f89932a.f89922b;
                if (aVar != null) {
                    z = aVar.mo128446a();
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
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$f */
    public static final class View$OnClickListenerC34813f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89935a;

        View$OnClickListenerC34813f(SharingHistoryView lVar) {
            this.f89935a = lVar;
        }

        public final void onClick(View view) {
            this.f89935a.f89925e.mo128470a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mCancelAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$g */
    public static final class C34814g extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89936a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f89936a.mo128496e();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34814g(SharingHistoryView lVar, String str, int i) {
            super(str, i);
            this.f89936a = lVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$mNormalAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$h */
    public static final class C34815h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89937a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f89937a.mo128497f();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34815h(SharingHistoryView lVar, String str, int i) {
            super(str, i);
            this.f89937a = lVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: b */
    public void mo128436b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89925e.mo128474d(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: c */
    public void mo128439c(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        this.f89925e.mo128472b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: d */
    public void mo128442d(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        this.f89925e.mo128475e(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: e */
    public void mo128443e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        LKUIToast.show(this.f89928h, str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: a */
    public void mo128433a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89925e.mo128471a(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: b */
    public void mo128437b(List<SharingHistoryViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            eVar.addAll(list);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: c */
    public void mo128440c(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            eVar.mo128455b(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.l$e */
    public static final class View$OnClickListenerC34812e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryView f89934a;

        View$OnClickListenerC34812e(SharingHistoryView lVar) {
            this.f89934a = lVar;
        }

        public final void onClick(View view) {
            List<String> list;
            ArrayList arrayList;
            if (this.f89934a.f89924d > 0) {
                this.f89934a.f89924d = 0;
                SharingHistoryAdapter eVar = this.f89934a.f89923c;
                if (eVar != null) {
                    list = eVar.mo128450a();
                } else {
                    list = null;
                }
                SharingHistoryAdapter eVar2 = this.f89934a.f89923c;
                if (eVar2 != null) {
                    if (list != null) {
                        arrayList = list;
                    } else {
                        arrayList = new ArrayList();
                    }
                    eVar2.mo128452a(arrayList);
                }
                this.f89934a.mo128496e();
                ISharingHistoryContract.IView.Delegate aVar = this.f89934a.f89922b;
                if (aVar != null) {
                    aVar.mo128445a(list);
                }
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView
    /* renamed from: a */
    public void mo128434a(List<SharingHistoryViewData> list) {
        int i;
        mo128441d();
        List<SharingHistoryViewData> list2 = list;
        if (CollectionUtils.isEmpty(list2)) {
            if (this.f89930j) {
                i = R.string.Lark_Groups_ShareHistoryEmpty;
            } else {
                i = R.string.Lark_Group_SharingHistoryBlankPage;
            }
            m135329a(R.drawable.illustration_placeholder_common_default, i);
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mMaskLayout");
        constraintLayout.setVisibility(8);
        ((CommonTitleBar) this.f89929i.findViewById(R.id.mTitlebar)).addAction(this.f89926f);
        SharingHistoryAdapter eVar = this.f89923c;
        if (eVar != null) {
            eVar.resetAll(list2);
        }
    }

    /* renamed from: a */
    private final void m135329a(int i, int i2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mMaskLayout");
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mMaskLayout");
        ((ImageView) constraintLayout2.findViewById(R.id.mMaskIv)).setImageResource(i);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "mRootView.mMaskLayout");
        ((TextView) constraintLayout3.findViewById(R.id.mMaskTv)).setText(i2);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) this.f89929i.findViewById(R.id.mSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout4, "mRootView.mSelectLayout");
        constraintLayout4.setVisibility(8);
        ConstraintLayout constraintLayout5 = (ConstraintLayout) this.f89929i.findViewById(R.id.mMaskLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout5, "mRootView.mMaskLayout");
        LoadingView loadingView = (LoadingView) constraintLayout5.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mMaskLayout.mLoadingView");
        loadingView.setVisibility(8);
    }

    public SharingHistoryView(Context context, View view, boolean z, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        this.f89928h = context;
        this.f89929i = view;
        this.f89930j = z;
        this.f89925e = aVar;
        this.f89926f = new C34815h(this, UIUtils.getString(context, R.string.Lark_Chat_DeactivateShare), R.color.text_title);
        this.f89927g = new C34814g(this, UIUtils.getString(context, R.string.Lark_Legacy_Cancel), R.color.text_title);
    }
}
