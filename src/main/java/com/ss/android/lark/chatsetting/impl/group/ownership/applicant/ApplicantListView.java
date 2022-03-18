package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListAdapter;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0012\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010(\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0012\u0010,\u001a\u00020\u00162\b\b\u0001\u0010\"\u001a\u00020\fH\u0016R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;", "mIsThread", "", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;Z)V", "AUTO_LOAD_MORE_THRESHOLD", "", "mAdapter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter;", "getMContext", "()Landroid/content/Context;", "mSwitchBtnListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mViewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView$Delegate;", "clearApplicantList", "", "create", "destroy", "go2Profile", "userId", "", "chatName", "initPulltoRefresh", "initView", "initData", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "removeItem", "id", "resetApproveSwitchBtn", "boolean", "setParamsForDesktop", "setViewDelegate", "viewDelegate", "showLoadData", "list", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "showToast", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f */
public final class ApplicantListView implements IApplicantListContract.IView {

    /* renamed from: a */
    public final int f89588a = 10;

    /* renamed from: b */
    public ApplicantListAdapter f89589b;

    /* renamed from: c */
    public IApplicantListContract.IView.Delegate f89590c;

    /* renamed from: d */
    public final ViewDependency f89591d;

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f89592e = new C34704f(this);

    /* renamed from: f */
    private final Context f89593f;

    /* renamed from: g */
    private final View f89594g;

    /* renamed from: h */
    private final boolean f89595h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;", "", "finish", "", "goToProfileActivity", "id", "", "chatName", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo128094a();

        /* renamed from: a */
        void mo128095a(String str, String str2);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m134862b();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128120a() {
        ApplicantListAdapter aVar = this.f89589b;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$initPulltoRefresh$2", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$c */
    public static final class C34701c implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ ApplicantListView f89597a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            IApplicantListContract.IView.Delegate aVar = this.f89597a.f89590c;
            if (aVar != null) {
                return aVar.mo128112a();
            }
            return false;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            int i;
            ApplicantListAdapter aVar = this.f89597a.f89589b;
            if (aVar != null) {
                i = aVar.getItemCount();
            } else {
                i = 0;
            }
            return i - this.f89597a.f89588a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34701c(ApplicantListView fVar) {
            this.f89597a = fVar;
        }
    }

    /* renamed from: c */
    private final void m134863c() {
        if (DesktopUtil.m144307b()) {
            ((CommonTitleBar) this.f89594g.findViewById(R.id.titlebar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            TextView textView = (TextView) this.f89594g.findViewById(R.id.mJoinGroupApproveTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mJoinGroupApproveTv");
            textView.setTextSize((float) 14);
        }
    }

    /* renamed from: b */
    private final void m134862b() {
        if (this.f89595h) {
            ((CommonTitleBar) this.f89594g.findViewById(R.id.titlebar)).setTitle(R.string.Lark_Groups_MembershipRequestPushTitle);
            ((TextView) this.f89594g.findViewById(R.id.mJoinGroupApproveTv)).setText(R.string.Lark_Groups_ApproveInvitation);
        } else {
            ((CommonTitleBar) this.f89594g.findViewById(R.id.titlebar)).setTitle(R.string.Lark_Group_MembershipRequestPushTitle);
            ((TextView) this.f89594g.findViewById(R.id.mJoinGroupApproveTv)).setText(R.string.Lark_Group_ApproveInvitation);
        }
        ((CommonTitleBar) this.f89594g.findViewById(R.id.titlebar)).setLeftClickListener(new View$OnClickListenerC34702d(this));
        m134864d();
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f89594g.findViewById(R.id.mApplicantRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.mApplicantRv");
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(this.f89593f, 1, false));
        this.f89589b = new ApplicantListAdapter(this.f89593f, new C34703e(this));
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f89594g.findViewById(R.id.mApplicantRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.mApplicantRv");
        commonRecyclerView2.setAdapter(this.f89589b);
        CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) this.f89594g.findViewById(R.id.mApplicantRv);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "mRootView.mApplicantRv");
        commonRecyclerView3.setItemAnimator(null);
        ((LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn)).setOnCheckedChangeListener(this.f89592e);
        m134863c();
    }

    /* renamed from: d */
    private final void m134864d() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f89593f);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.mInboxPtrLayout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.mInboxPtrLayout");
        lKUIPtrClassicFrameLayout2.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout)).disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = (LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout3, "mRootView.mInboxPtrLayout");
        lKUIPtrClassicFrameLayout3.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout)).setPtrHandler(new C34700b(this));
        C59252a.m230151a(this.f89593f, (LKUIPtrClassicFrameLayout) this.f89594g.findViewById(R.id.mInboxPtrLayout), (CommonRecyclerView) this.f89594g.findViewById(R.id.mApplicantRv), new C34701c(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IApplicantListContract.IView.Delegate aVar) {
        this.f89590c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$initPulltoRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$b */
    public static final class C34700b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ ApplicantListView f89596a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34700b(ApplicantListView fVar) {
            this.f89596a = fVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IApplicantListContract.IView.Delegate aVar = this.f89596a.f89590c;
            if (aVar != null) {
                aVar.mo128113b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "content");
            if (super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                IApplicantListContract.IView.Delegate aVar = this.f89596a.f89590c;
                if (aVar != null) {
                    z = aVar.mo128112a();
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
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$d */
    public static final class View$OnClickListenerC34702d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListView f89598a;

        View$OnClickListenerC34702d(ApplicantListView fVar) {
            this.f89598a = fVar;
        }

        public final void onClick(View view) {
            this.f89598a.f89591d.mo128094a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$initView$2", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$ItemClickListener;", "onCloseBtnClick", "", "position", "", "id", "", "onDoneBtnClick", "onUserClick", BottomDialog.f17198f, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$e */
    public static final class C34703e implements ApplicantListAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListView f89599a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34703e(ApplicantListView fVar) {
            this.f89599a = fVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListAdapter.ItemClickListener
        /* renamed from: a */
        public void mo128086a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            IApplicantListContract.IView.Delegate aVar = this.f89599a.f89590c;
            if (aVar != null) {
                aVar.mo128110a(str);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListAdapter.ItemClickListener
        /* renamed from: a */
        public void mo128085a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IApplicantListContract.IView.Delegate aVar = this.f89599a.f89590c;
            if (aVar != null) {
                aVar.mo128109a(i, str);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListAdapter.ItemClickListener
        /* renamed from: b */
        public void mo128087b(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IApplicantListContract.IView.Delegate aVar = this.f89599a.f89590c;
            if (aVar != null) {
                aVar.mo128114b(i, str);
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128121a(int i) {
        Context context = this.f89593f;
        LKUIToast.show(context, UIUtils.getString(context, i));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128126a(List<ApplicantViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ApplicantListAdapter aVar = this.f89589b;
        if (aVar != null) {
            aVar.diff(list);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128123a(InitData kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "initData");
        ((LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn)).setOnCheckedChangeListener(null);
        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn);
        Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mSwitchBtn");
        lKUISwitchButton.setChecked(kVar.mo128148a());
        ((LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn)).setOnCheckedChangeListener(this.f89592e);
        ApplicantListAdapter aVar = this.f89589b;
        if (aVar != null) {
            aVar.resetAll(kVar.mo128149b());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128124a(String str) {
        ApplicantListAdapter aVar;
        Intrinsics.checkParameterIsNotNull(str, "id");
        ApplicantListAdapter aVar2 = this.f89589b;
        if (aVar2 != null) {
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            if (aVar2.getItems() != null) {
                List list = null;
                ApplicantViewData gVar = null;
                ApplicantListAdapter aVar3 = this.f89589b;
                if (aVar3 != null) {
                    list = aVar3.getItems();
                }
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ApplicantViewData gVar2 = (ApplicantViewData) it.next();
                    if (TextUtils.equals(gVar2.mo128132c(), str)) {
                        gVar = gVar2;
                        break;
                    }
                }
                if (gVar != null && (aVar = this.f89589b) != null) {
                    aVar.remove(gVar);
                }
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128127a(boolean z) {
        ((LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn)).setOnCheckedChangeListener(null);
        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn);
        Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mSwitchBtn");
        lKUISwitchButton.setChecked(z);
        ((LKUISwitchButton) this.f89594g.findViewById(R.id.mSwitchBtn)).setOnCheckedChangeListener(this.f89592e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.f$f */
    static final class C34704f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListView f89600a;

        C34704f(ApplicantListView fVar) {
            this.f89600a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
            if (z) {
                managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.OFF_TO_ON;
            } else {
                managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ON_TO_OFF;
            }
            ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.JOIN_GROUP_RESTRICTION, managePermissionParams);
            IApplicantListContract.IView.Delegate aVar = this.f89600a.f89590c;
            if (aVar != null) {
                aVar.mo128111a(z);
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView
    /* renamed from: a */
    public void mo128125a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f89591d.mo128095a(str, str2);
    }

    public ApplicantListView(Context context, View view, ViewDependency aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        this.f89593f = context;
        this.f89594g = view;
        this.f89591d = aVar;
        this.f89595h = z;
    }
}
