package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.ExceptionUser;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\b\u0010-\u001a\u00020\u001aH\u0016J\u0016\u0010.\u001a\u00020\u001a2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$ViewDependency;)V", "mAdapter", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter;", "mDelegate", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "getMDelegate", "()Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "setMDelegate", "(Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;)V", "mMode", "", "mMode$annotations", "()V", "getMMode", "()I", "setMMode", "(I)V", "changeMode", "", "view", "clearAdapter", "create", "deleteExceptionUser", "userId", "", "destroy", "initPullRefresh", "initRecyclerView", "initTitle", "setViewDelegate", "viewDelegate", "showPage", ShareHitPoint.f121869d, "showToast", "success", "", "updateEmptyOrFailed", "updateErrorOrFailed", "updateExceptionUsers", "list", "", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/ExceptionUser;", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d */
public final class PrivacyBlockListView implements IPrivacyBlockListContract.IView {

    /* renamed from: a */
    public IPrivacyBlockListContract.IView.Delegate f93134a;

    /* renamed from: b */
    public final ViewDependency f93135b;

    /* renamed from: c */
    private int f93136c;

    /* renamed from: d */
    private PrivacyBlockListAdapter f93137d;

    /* renamed from: e */
    private final Context f93138e;

    /* renamed from: f */
    private final View f93139f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$ViewDependency;", "", "finishPage", "", "onItemClick", "userId", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo132501a();

        /* renamed from: a */
        void mo132502a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: c */
    public void mo132480c() {
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        privacyBlockListAdapter.clear();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m141295e();
        m141296f();
        m141297g();
    }

    /* renamed from: d */
    public final IPrivacyBlockListContract.IView.Delegate mo132511d() {
        IPrivacyBlockListContract.IView.Delegate aVar = this.f93134a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return aVar;
    }

    /* renamed from: g */
    private final void m141297g() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "mRootView.layout_ptr_reFresh");
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        ((LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh)).disableWhenHorizontalMove(true);
        ((LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh)).setPtrHandler(new C36033b(this));
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: a */
    public void mo132475a() {
        ((LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (privacyBlockListAdapter.getItemCount() == 0) {
            mo132508a(0);
        } else {
            LKUIToast.loadFail(this.f93138e, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
        }
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: b */
    public void mo132479b() {
        ((LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (privacyBlockListAdapter.getItemCount() == 0) {
            mo132508a(1);
        } else {
            LKUIToast.loadFail(this.f93138e, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
        }
    }

    /* renamed from: e */
    private final void m141295e() {
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).setLeftClickListener(new View$OnClickListenerC36035d(this));
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).setTitle(UIHelper.getString(R.string.Lark_NewSettings_Blocklist));
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).addAction(new C36036e(this, UIHelper.getString(R.string.Lark_Legacy_Remove), R.color.text_link_normal));
    }

    /* renamed from: f */
    private final void m141296f() {
        C36034c cVar = new C36034c(this);
        RecyclerView recyclerView = (RecyclerView) this.f93139f.findViewById(R.id.mList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.mList");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f93138e));
        this.f93137d = new PrivacyBlockListAdapter(this.f93138e, this.f93136c, cVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f93139f.findViewById(R.id.mList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.mList");
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(privacyBlockListAdapter);
        RecyclerView recyclerView3 = (RecyclerView) this.f93139f.findViewById(R.id.mList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRootView.mList");
        SettingGroupHelper.m88816a(recyclerView3, false, 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$initPullRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$b */
    public static final class C36033b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListView f93140a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36033b(PrivacyBlockListView dVar) {
            this.f93140a = dVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            this.f93140a.mo132511d().mo132481a();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f93140a.mo132511d().mo132483b()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$initRecyclerView$itemListener$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$OnItemClickListener;", "onItemClick", "", "userId", "", "onItemDeleteClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$c */
    public static final class C36034c implements PrivacyBlockListAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListView f93141a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36034c(PrivacyBlockListView dVar) {
            this.f93141a = dVar;
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo132494a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            ViewDependency aVar = this.f93141a.f93135b;
            if (aVar != null) {
                aVar.mo132502a(str);
            }
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter.OnItemClickListener
        /* renamed from: b */
        public void mo132495b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            this.f93141a.mo132511d().mo132482a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListView$initTitle$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$e */
    public static final class C36036e extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListView f93143a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f93143a.mo132509a(view);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36036e(PrivacyBlockListView dVar, String str, int i) {
            super(str, i);
            this.f93143a = dVar;
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IPrivacyBlockListContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f93134a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$d */
    public static final class View$OnClickListenerC36035d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListView f93142a;

        View$OnClickListenerC36035d(PrivacyBlockListView dVar) {
            this.f93142a = dVar;
        }

        public final void onClick(View view) {
            ViewDependency aVar = this.f93142a.f93135b;
            if (aVar != null) {
                aVar.mo132501a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.d$f */
    public static final class View$OnClickListenerC36037f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListView f93144a;

        View$OnClickListenerC36037f(PrivacyBlockListView dVar) {
            this.f93144a = dVar;
        }

        public final void onClick(View view) {
            this.f93144a.mo132511d().mo132481a();
        }
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: a */
    public void mo132478a(boolean z) {
        if (z) {
            LKUIToast.loadSuccess(this.f93138e, (int) R.string.Lark_Legacy_RemovedSuccessfully);
        } else {
            LKUIToast.loadFail(this.f93138e, (int) R.string.Lark_Legacy_RemoveFailed);
        }
    }

    /* renamed from: a */
    public final void mo132509a(View view) {
        String str;
        int i = (this.f93136c + 1) % 2;
        this.f93136c = i;
        if (view != null) {
            TextView textView = (TextView) view;
            if (i == 0) {
                str = UIHelper.getString(R.string.Lark_Legacy_Remove);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_Done);
            }
            textView.setText(str);
            PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
            if (privacyBlockListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            privacyBlockListAdapter.mo132492a(this.f93136c);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: a */
    public void mo132476a(String str) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        List items = privacyBlockListAdapter.getItems();
        Intrinsics.checkExpressionValueIsNotNull(items, "mAdapter.items");
        Iterator it = items.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ExceptionUser exceptionUser = (ExceptionUser) next;
            if (exceptionUser != null) {
                obj = exceptionUser.getUserId();
            }
            if (Intrinsics.areEqual(str, obj)) {
                obj = next;
                break;
            }
        }
        ExceptionUser exceptionUser2 = (ExceptionUser) obj;
        PrivacyBlockListAdapter privacyBlockListAdapter2 = this.f93137d;
        if (privacyBlockListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        privacyBlockListAdapter2.remove(exceptionUser2);
        PrivacyBlockListAdapter privacyBlockListAdapter3 = this.f93137d;
        if (privacyBlockListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (privacyBlockListAdapter3.getItemCount() == 0) {
            mo132508a(1);
        }
    }

    /* renamed from: a */
    public void mo132508a(int i) {
        int i2;
        View findViewById = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mCover");
        findViewById.setVisibility(0);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "mRootView.layout_ptr_reFresh");
        lKUIPtrFrameLayout.setVisibility(8);
        if (i == 1) {
            i2 = R.drawable.illustration_placeholder_common_no_contact;
        } else {
            i2 = R.drawable.illustration_placeholder_common_load_failed;
        }
        View findViewById2 = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.mCover");
        ((ImageView) findViewById2.findViewById(R.id.mIcon)).setImageResource(i2);
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).setRightVisible(false);
        if (i == 1) {
            View findViewById3 = this.f93139f.findViewById(R.id.mCover);
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
        View findViewById4 = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.mCover");
        TextView textView2 = (TextView) findViewById4.findViewById(R.id.mText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.mCover.mText");
        textView2.setText(spannableString);
        View$OnClickListenerC36037f fVar = new View$OnClickListenerC36037f(this);
        View findViewById5 = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.mCover");
        ((TextView) findViewById5.findViewById(R.id.mText)).setOnClickListener(fVar);
        View findViewById6 = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.mCover");
        ((ImageView) findViewById6.findViewById(R.id.mIcon)).setOnClickListener(fVar);
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView
    /* renamed from: a */
    public void mo132477a(List<ExceptionUser> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ((LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh)).refreshComplete();
        if (list.size() == 0) {
            mo132508a(1);
            return;
        }
        View findViewById = this.f93139f.findViewById(R.id.mCover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mCover");
        findViewById.setVisibility(8);
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) this.f93139f.findViewById(R.id.layout_ptr_reFresh);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "mRootView.layout_ptr_reFresh");
        lKUIPtrFrameLayout.setVisibility(0);
        ((CommonTitleBar) this.f93139f.findViewById(R.id.mTitleBar)).setRightVisible(true);
        PrivacyBlockListAdapter privacyBlockListAdapter = this.f93137d;
        if (privacyBlockListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        privacyBlockListAdapter.addAll(list);
    }

    public PrivacyBlockListView(Context context, View view, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        this.f93138e = context;
        this.f93139f = view;
        this.f93135b = aVar;
    }
}
