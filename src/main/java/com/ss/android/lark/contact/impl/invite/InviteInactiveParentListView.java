package com.ss.android.lark.contact.impl.invite;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.InactiveParent;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView;
import com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract;
import com.ss.android.lark.contact.impl.invite.InviteInactiveListAdapter;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000bH\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020(H\u0016J\u001e\u0010,\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010*\u001a\u00020(H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "departmentId", "", BottomDialog.f17198f, "subTitle", "inactiveParentCount", "", "mViewDependency", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$ViewDependency;)V", "Ljava/lang/Integer;", "mAdapter", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter;", "mDelegate", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "getMDelegate", "()Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "setMDelegate", "(Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;)V", "pullToRefreshListener", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentListView$IPullToRefreshListener;", "clearAdapter", "", "create", "destroy", "initPullToRefresh", "initRecyclerView", "initTitle", "setPullToRefreshListener", "setViewDelegate", "viewDelegate", "showPage", ShareHitPoint.f121869d, "showToast", "success", "", "updateEmptyOrFailed", "isFirst", "updateErrorOrFailed", "updateInactiveParents", "list", "", "Lcom/ss/android/lark/contact/entity/InactiveParent;", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.invite.e */
public final class InviteInactiveParentListView implements IInviteInactiveParentListContract.IView {

    /* renamed from: a */
    public InviteInactiveListAdapter f92955a;

    /* renamed from: b */
    public DepartmentListView.AbstractC35854a f92956b;

    /* renamed from: c */
    public final Context f92957c;

    /* renamed from: d */
    public final String f92958d;

    /* renamed from: e */
    public final String f92959e;

    /* renamed from: f */
    public final Integer f92960f;

    /* renamed from: g */
    public final ViewDependency f92961g;

    /* renamed from: h */
    private IInviteInactiveParentListContract.IView.Delegate f92962h;

    /* renamed from: i */
    private final View f92963i;

    /* renamed from: j */
    private final String f92964j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$ViewDependency;", "", "finishPage", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo132271a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public final IInviteInactiveParentListContract.IView.Delegate mo132280a() {
        return this.f92962h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$create$1", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$b */
    public static final class C35948b implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92965a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            return InviteInactiveParentListView.m140925a(this.f92965a).getItemCount() - 7;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            DepartmentListView.AbstractC35854a aVar = this.f92965a.f92956b;
            if (aVar != null) {
                return aVar.mo131784a(true);
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35948b(InviteInactiveParentListView eVar) {
            this.f92965a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$initPullToRefresh$1", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentListView$IPullToRefreshListener;", "canDoLoadMore", "", "superResult", "onLoadMore", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$c */
    public static final class C35949c implements DepartmentListView.AbstractC35854a {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92966a;

        @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.AbstractC35854a
        /* renamed from: a */
        public void mo131783a() {
            IInviteInactiveParentListContract.IView.Delegate a = this.f92966a.mo132280a();
            if (a != null) {
                a.mo132254c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35949c(InviteInactiveParentListView eVar) {
            this.f92966a = eVar;
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.AbstractC35854a
        /* renamed from: a */
        public boolean mo131784a(boolean z) {
            boolean z2;
            if (!z) {
                return false;
            }
            IInviteInactiveParentListContract.IView.Delegate a = this.f92966a.mo132280a();
            if (a != null) {
                z2 = a.mo132253b();
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m140927b();
        m140928c();
        m140929d();
        C59252a.m230151a(this.f92957c, (LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh), (RecyclerView) this.f92963i.findViewById(R.id.mList), new C35948b(this));
    }

    /* renamed from: c */
    private final void m140928c() {
        m140926a(new C35949c(this));
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f92957c);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.layout_ptr_reFresh");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).disableWhenHorizontalMove(true);
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).setPtrHandler(new C35950d(this));
    }

    /* renamed from: d */
    private final void m140929d() {
        C35951e eVar = new C35951e(this);
        RecyclerView recyclerView = (RecyclerView) this.f92963i.findViewById(R.id.mList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.mList");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f92957c));
        this.f92955a = new InviteInactiveListAdapter(this.f92957c, eVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f92963i.findViewById(R.id.mList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.mList");
        InviteInactiveListAdapter aVar = this.f92955a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(aVar);
    }

    /* renamed from: b */
    private final void m140927b() {
        ((CommonTitleBar) this.f92963i.findViewById(R.id.mTitleBar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        ((CommonTitleBar) this.f92963i.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC35952f(this));
        int i = 0;
        if (TextUtils.isEmpty(this.f92964j)) {
            TextView textView = (TextView) this.f92963i.findViewById(R.id.tv_sub_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.tv_sub_title");
            textView.setVisibility(8);
        } else {
            TextView textView2 = (TextView) this.f92963i.findViewById(R.id.tv_sub_title);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tv_sub_title");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) this.f92963i.findViewById(R.id.tv_sub_title);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mRootView.tv_sub_title");
            textView3.setText(this.f92964j);
        }
        String string = UIHelper.getString(R.string.Lark_Education_XParentsInactiveSendMsg);
        TextView textView4 = (TextView) this.f92963i.findViewById(R.id.tv_tip);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "mRootView.tv_tip");
        Integer num = this.f92960f;
        if (num != null) {
            i = num.intValue();
        }
        textView4.setText(UIHelper.mustacheFormat(string, "count", String.valueOf(i)));
        ((CommonTitleBar) this.f92963i.findViewById(R.id.mTitleBar)).setTitle(R.string.Lark_Education_InactiveParents);
        ((TextView) this.f92963i.findViewById(R.id.tv_send_all)).setOnClickListener(new C35953g(this));
    }

    /* renamed from: a */
    private final void m140926a(DepartmentListView.AbstractC35854a aVar) {
        this.f92956b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$initPullToRefresh$2", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$d */
    public static final class C35950d extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92967a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35950d(InviteInactiveParentListView eVar) {
            this.f92967a = eVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            DepartmentListView.AbstractC35854a aVar = this.f92967a.f92956b;
            if (aVar != null) {
                aVar.mo131783a();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            boolean checkCanDoLoadMore = super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2);
            DepartmentListView.AbstractC35854a aVar = this.f92967a.f92956b;
            if (aVar != null) {
                return aVar.mo131784a(checkCanDoLoadMore);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$initRecyclerView$itemListener$1", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$OnItemClickListener;", "onItemClick", "", "id", "", "onItemInviteClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$e */
    public static final class C35951e implements InviteInactiveListAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92968a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35951e(InviteInactiveParentListView eVar) {
            this.f92968a = eVar;
        }

        @Override // com.ss.android.lark.contact.impl.invite.InviteInactiveListAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo132267a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            LKUIToast.show(this.f92968a.f92957c, (int) R.string.Lark_Education_RemindInactiveParentsToast2);
        }

        @Override // com.ss.android.lark.contact.impl.invite.InviteInactiveListAdapter.OnItemClickListener
        /* renamed from: b */
        public void mo132268b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IInviteInactiveParentListContract.IView.Delegate a = this.f92968a.mo132280a();
            if (a != null) {
                a.mo132251a(str);
            }
            ContactHitPoint.m140785a(1, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListView$initTitle$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$g */
    public static final class C35953g extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92970a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35953g(InviteInactiveParentListView eVar) {
            this.f92970a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            int i;
            IInviteInactiveParentListContract.IView.Delegate a;
            Integer num = this.f92970a.f92960f;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            ContactHitPoint.m140785a(i, 1);
            if (!TextUtils.isEmpty(this.f92970a.f92959e)) {
                IInviteInactiveParentListContract.IView.Delegate a2 = this.f92970a.mo132280a();
                if (a2 != null) {
                    a2.mo132252a(null, this.f92970a.f92959e);
                }
            } else if (!TextUtils.isEmpty(this.f92970a.f92958d) && (a = this.f92970a.mo132280a()) != null) {
                a.mo132252a(this.f92970a.f92958d, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$f */
    public static final class View$OnClickListenerC35952f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92969a;

        View$OnClickListenerC35952f(InviteInactiveParentListView eVar) {
            this.f92969a = eVar;
        }

        public final void onClick(View view) {
            ViewDependency aVar = this.f92969a.f92961g;
            if (aVar != null) {
                aVar.mo132271a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.e$h */
    public static final class View$OnClickListenerC35954h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListView f92971a;

        View$OnClickListenerC35954h(InviteInactiveParentListView eVar) {
            this.f92971a = eVar;
        }

        public final void onClick(View view) {
            IInviteInactiveParentListContract.IView.Delegate a = this.f92971a.mo132280a();
            if (a != null) {
                a.mo132250a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ InviteInactiveListAdapter m140925a(InviteInactiveParentListView eVar) {
        InviteInactiveListAdapter aVar = eVar.f92955a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return aVar;
    }

    /* renamed from: a */
    public void setViewDelegate(IInviteInactiveParentListContract.IView.Delegate aVar) {
        this.f92962h = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView
    /* renamed from: c */
    public void mo132249c(boolean z) {
        if (z) {
            LKUIToast.loadSuccess(this.f92957c, (int) R.string.Lark_Education_MsgSent);
        } else {
            LKUIToast.loadFail(this.f92957c, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
        }
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView
    /* renamed from: a */
    public void mo132247a(boolean z) {
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        if (z) {
            InviteInactiveListAdapter aVar = this.f92955a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (aVar.getItemCount() == 0) {
                mo132281a(0);
            } else {
                LKUIToast.loadFail(this.f92957c, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView
    /* renamed from: b */
    public void mo132248b(boolean z) {
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        if (z) {
            InviteInactiveListAdapter aVar = this.f92955a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (aVar.getItemCount() == 0) {
                mo132281a(1);
            } else {
                LKUIToast.loadFail(this.f92957c, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
            }
        }
    }

    /* renamed from: a */
    public void mo132281a(int i) {
        int i2;
        View findViewById = this.f92963i.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mCover");
        findViewById.setVisibility(0);
        if (i == 1) {
            i2 = R.drawable.illustration_placeholder_common_no_contact;
        } else {
            i2 = R.drawable.illustration_placeholder_common_load_failed;
        }
        View findViewById2 = this.f92963i.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.mCover");
        ((ImageView) findViewById2.findViewById(R.id.mIcon)).setImageResource(i2);
        if (i == 1) {
            View findViewById3 = this.f92963i.findViewById(R.id.mCover);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.mCover");
            TextView textView = (TextView) findViewById3.findViewById(R.id.mText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.mCover.mText");
            textView.setText(UIHelper.getString(R.string.Lark_NewContacts_NoUsers));
            return;
        }
        String string = UIHelper.getString(R.string.Lark_NewContacts_FailedToLoadComma);
        String string2 = UIHelper.getString(R.string.Lark_NewContacts_RefreshToTryAagin);
        SpannableString spannableString = new SpannableString(string + string2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(UIHelper.getColor(R.color.text_link_normal));
        Intrinsics.checkExpressionValueIsNotNull(string2, "end");
        spannableString.setSpan(foregroundColorSpan, StringsKt.indexOf$default((CharSequence) (string + string2), string2, 0, false, 6, (Object) null), spannableString.length(), 17);
        View findViewById4 = this.f92963i.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.mCover");
        TextView textView2 = (TextView) findViewById4.findViewById(R.id.mText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.mCover.mText");
        textView2.setText(spannableString);
        View$OnClickListenerC35954h hVar = new View$OnClickListenerC35954h(this);
        View findViewById5 = this.f92963i.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.mCover");
        ((TextView) findViewById5.findViewById(R.id.mText)).setOnClickListener(hVar);
        View findViewById6 = this.f92963i.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.mCover");
        ((ImageView) findViewById6.findViewById(R.id.mIcon)).setOnClickListener(hVar);
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView
    /* renamed from: a */
    public void mo132246a(List<InactiveParent> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ((LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        if (!list.isEmpty()) {
            View findViewById = this.f92963i.findViewById(R.id.mCover);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mCover");
            findViewById.setVisibility(8);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f92963i.findViewById(R.id.layout_ptr_reFresh);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.layout_ptr_reFresh");
            lKUIPtrClassicFrameLayout.setVisibility(0);
            InviteInactiveListAdapter aVar = this.f92955a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            aVar.addAll(list);
        } else if (z) {
            mo132281a(1);
        }
    }

    public InviteInactiveParentListView(Context context, View view, String str, String str2, String str3, Integer num, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        this.f92957c = context;
        this.f92963i = view;
        this.f92958d = str;
        this.f92959e = str2;
        this.f92964j = str3;
        this.f92960f = num;
        this.f92961g = aVar;
    }
}
