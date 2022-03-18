package com.ss.android.lark.contact.impl.contacts_email.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_email.BusinessCardsAdapter;
import com.ss.android.lark.contact.impl.contacts_email.entity.BusinessCardViewData;
import com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0002IJB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000200H\u0002J\b\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u000200H\u0002J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020\"H\u0016J\u0016\u0010=\u001a\u0002002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020:0?H\u0016J\u0010\u0010@\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0002J\b\u0010A\u001a\u000200H\u0016J\u0016\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u00020:0?H\u0016J\u0010\u0010D\u001a\u0002002\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010G\u001a\u0002002\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010?H\u0016R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006K"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView;", "viewDependency", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;", "mShowSelect", "", "mIsMulti", "(Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;ZZ)V", "breadcrumbView", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;", "businessCardAdapter", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter;", "businessCardsRV", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "getBusinessCardsRV", "()Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "setBusinessCardsRV", "(Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;)V", "emptyLayout", "Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;", "getEmptyLayout", "()Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;", "setEmptyLayout", "(Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getMIsMulti", "()Z", "getMShowSelect", "mViewDelegate", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView$Delegage;", "ptrLayout", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "getPtrLayout", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "setPtrLayout", "(Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;)V", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getViewDependency", "()Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;", "setViewDependency", "(Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;)V", "closeAllItems", "", "create", "destroy", "finishLoadMore", "initBusinessCardsView", "initPullToRefresh", "initTitleBar", "initView", "removeCard", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "setViewDelegate", "viewDelegate", "showBusinessCardsView", "cards", "", "showDeleteDialog", "showEmptyView", "showLoadedCards", "list", "showToast", "msg", "", "updateSelectedMember", "mSelectedMemberList", "Companion", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BusinessCardsView implements IBusinessCardsContract.IView {

    /* renamed from: d */
    public static final Companion f91965d = new Companion(null);

    /* renamed from: a */
    public Context f91966a;

    /* renamed from: b */
    public IBusinessCardsContract.IView.Delegage f91967b;
    @BindView(6931)
    public UDBreadcrumb breadcrumbView;
    @BindView(6961)
    public CommonRecyclerView businessCardsRV;

    /* renamed from: c */
    public BusinessCardsAdapter f91968c;

    /* renamed from: e */
    private ViewDependency f91969e;
    @BindView(7589)
    public UDEmptyState emptyLayout;

    /* renamed from: f */
    private final boolean f91970f;

    /* renamed from: g */
    private final boolean f91971g;
    @BindView(6960)
    public LKUIPtrClassicFrameLayout ptrLayout;
    @BindView(6962)
    public CommonTitleBar titleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;", "", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView;", "onFinish", "startCardEditActivity", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo131031a();

        /* renamed from: a */
        void mo131032a(BusinessCardsView businessCardsView);

        /* renamed from: b */
        void mo131033b();

        /* renamed from: c */
        void mo131034c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$Companion;", "", "()V", "MAX_SCROLL_DISTANCE", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final ViewDependency mo131157e() {
        return this.f91969e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$initBusinessCardsView$2", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$d */
    public static final class C35556d implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91973a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            IBusinessCardsContract.IView.Delegage aVar = this.f91973a.f91967b;
            if (aVar != null) {
                return aVar.mo131178a();
            }
            return false;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            if (BusinessCardsView.m139169a(this.f91973a) != null) {
                return BusinessCardsView.m139169a(this.f91973a).getItemCount() - 7;
            }
            return 999999;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35556d(BusinessCardsView businessCardsView) {
            this.f91973a = businessCardsView;
        }
    }

    /* renamed from: f */
    private final void m139170f() {
        m139173i();
        m139172h();
        m139171g();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: c */
    public void mo131154c() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f91969e = null;
        this.f91967b = null;
    }

    /* renamed from: a */
    public final Context mo131146a() {
        Context context = this.f91966a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    /* renamed from: b */
    public void mo131151b() {
        BusinessCardsAdapter aVar = this.f91968c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        if (!CollectionUtils.isEmpty(aVar.mo130988c())) {
            BusinessCardsAdapter aVar2 = this.f91968c;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
            }
            aVar2.mo86622b();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: d */
    public void mo131156d() {
        UDEmptyState uDEmptyState = this.emptyLayout;
        if (uDEmptyState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyLayout");
        }
        UIUtils.show(uDEmptyState);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        UIUtils.hide(lKUIPtrClassicFrameLayout);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        Context context;
        ViewDependency bVar = this.f91969e;
        if (bVar != null) {
            bVar.mo131032a(this);
        }
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null || (context = commonTitleBar.getContext()) == null) {
            UDBreadcrumb uDBreadcrumb = this.breadcrumbView;
            if (uDBreadcrumb == null) {
                Intrinsics.throwNpe();
            }
            context = uDBreadcrumb.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "breadcrumbView!!.context");
        }
        this.f91966a = context;
        m139170f();
    }

    /* renamed from: g */
    private final void m139171g() {
        Context context = this.f91966a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        CommonRecyclerView commonRecyclerView = this.businessCardsRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardsRV");
        }
        commonRecyclerView.setLayoutManager(linearLayoutManager);
        this.f91968c = new BusinessCardsAdapter(this.f91970f, this.f91971g).mo130982a(new C35555c(this));
        CommonRecyclerView commonRecyclerView2 = this.businessCardsRV;
        if (commonRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardsRV");
        }
        BusinessCardsAdapter aVar = this.f91968c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        commonRecyclerView2.setAdapter(aVar);
        Context context2 = this.f91966a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        CommonRecyclerView commonRecyclerView3 = this.businessCardsRV;
        if (commonRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardsRV");
        }
        C59252a.m230151a(context2, lKUIPtrClassicFrameLayout, commonRecyclerView3, new C35556d(this));
    }

    /* renamed from: h */
    private final void m139172h() {
        Context context = this.f91966a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(context);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout2.setFooterView(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout3.addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout4 = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout4.disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout5 = this.ptrLayout;
        if (lKUIPtrClassicFrameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
        }
        lKUIPtrClassicFrameLayout5.setPtrHandler(new C35557e(this));
    }

    /* renamed from: i */
    private final void m139173i() {
        TextView textView;
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar != null) {
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC35559g(this));
        }
        CommonTitleBar commonTitleBar2 = this.titleBar;
        if (commonTitleBar2 != null) {
            commonTitleBar2.addAction(new C35560h(this, UIHelper.getString(R.string.Lark_Legacy_AddMailContact), R.color.text_link_normal));
        }
        CommonTitleBar commonTitleBar3 = this.titleBar;
        if (commonTitleBar3 != null) {
            textView = commonTitleBar3.getRightText();
        } else {
            textView = null;
        }
        if (textView != null) {
            Context context = this.f91966a;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView.setPadding(0, 0, UIUtils.dp2px(context, 16.0f), 0);
        }
        UDBreadcrumb uDBreadcrumb = this.breadcrumbView;
        if (uDBreadcrumb != null) {
            String string = UIUtils.getString(uDBreadcrumb.getContext(), R.string.Lark_Contacts_Contacts);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…g.Lark_Contacts_Contacts)");
            uDBreadcrumb.mo90284a(string);
            String string2 = UIUtils.getString(uDBreadcrumb.getContext(), R.string.Lark_Contacts_ContactCards);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…rk_Contacts_ContactCards)");
            uDBreadcrumb.mo90284a(string2);
            uDBreadcrumb.setOnItemClickListener(new C35558f(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$initBusinessCardsView$1", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsAdapter$ICardItemClickListener;", "onDeleteClick", "", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "onItemClicked", "", "isChecked", "position", "", "startProfileActivity", "cardId", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$c */
    public static final class C35555c implements BusinessCardsAdapter.ICardItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91972a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35555c(BusinessCardsView businessCardsView) {
            this.f91972a = businessCardsView;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.BusinessCardsAdapter.ICardItemClickListener
        /* renamed from: a */
        public void mo130992a(BusinessCardViewData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "card");
            this.f91972a.mo131147a(aVar);
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.BusinessCardsAdapter.ICardItemClickListener
        /* renamed from: a */
        public void mo130993a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cardId");
            ContactSource.C29531a a = new ContactSource.C29531a().mo104726a(14);
            Intrinsics.checkExpressionValueIsNotNull(a, "ContactSource.Builder().….SourceType.CONTACTCARDS)");
            AbstractC35361b a2 = C35358a.m138143a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ContactModule.getDependency()");
            a2.mo130168m().mo130243a(this.f91972a.mo131146a(), str, 101, a.mo104728a());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.BusinessCardsAdapter.ICardItemClickListener
        /* renamed from: a */
        public boolean mo130994a(BusinessCardViewData aVar, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "card");
            IBusinessCardsContract.IView.Delegage aVar2 = this.f91972a.f91967b;
            if (aVar2 != null) {
                return aVar2.mo131179a(aVar, z, i);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$e */
    public static final class C35557e extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91974a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35557e(BusinessCardsView businessCardsView) {
            this.f91974a = businessCardsView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            IBusinessCardsContract.IView.Delegage aVar = this.f91974a.f91967b;
            if (aVar != null) {
                aVar.mo131180b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            boolean checkCanDoLoadMore = super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2);
            IBusinessCardsContract.IView.Delegage aVar = this.f91974a.f91967b;
            if (aVar != null) {
                z = aVar.mo131178a();
            } else {
                z = false;
            }
            return checkCanDoLoadMore & z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$initTitleBar$3$1", "Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "onItemClick", "", "index", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$f */
    public static final class C35558f implements OnBreadcrumbItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91975a;

        C35558f(BusinessCardsView businessCardsView) {
            this.f91975a = businessCardsView;
        }

        @Override // com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener
        public void onItemClick(int i) {
            ViewDependency e = this.f91975a.mo131157e();
            if (e != null) {
                e.mo131034c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$j */
    public static final class DialogInterface$OnDismissListenerC35562j implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91980a;

        DialogInterface$OnDismissListenerC35562j(BusinessCardsView businessCardsView) {
            this.f91980a = businessCardsView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f91980a.mo131151b();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IBusinessCardsContract.IView.Delegage aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f91967b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$g */
    public static final class View$OnClickListenerC35559g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91976a;

        View$OnClickListenerC35559g(BusinessCardsView businessCardsView) {
            this.f91976a = businessCardsView;
        }

        public final void onClick(View view) {
            ViewDependency e = this.f91976a.mo131157e();
            if (e != null) {
                e.mo131031a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BusinessCardsAdapter m139169a(BusinessCardsView businessCardsView) {
        BusinessCardsAdapter aVar = businessCardsView.f91968c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$initTitleBar$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$h */
    public static final class C35560h extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91977a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f91977a.mo131151b();
            ViewDependency e = this.f91977a.mo131157e();
            if (e != null) {
                e.mo131033b();
            }
            ContactHitPoint.m140797d();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35560h(BusinessCardsView businessCardsView, String str, int i) {
            super(str, i);
            this.f91977a = businessCardsView;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: c */
    public void mo131155c(List<BusinessCardViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        BusinessCardsAdapter aVar = this.f91968c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        aVar.mo130987b(list);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: a */
    public void mo131149a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Context context = this.f91966a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.show(context, str);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: b */
    public void mo131152b(BusinessCardViewData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "card");
        BusinessCardsAdapter aVar2 = this.f91968c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        aVar2.mo130984a(aVar);
        BusinessCardsAdapter aVar3 = this.f91968c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        if (aVar3.mo130988c().isEmpty()) {
            mo131156d();
        }
    }

    /* renamed from: a */
    public final void mo131147a(BusinessCardViewData aVar) {
        Context context = this.f91966a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Lark_Contacts_DeleteContactCardConfirmation)).titleBold(true)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.Lark_Contacts_Delete).mo90710d(R.color.function_danger_500).mo90703a(new DialogInterface$OnClickListenerC35561i(this, aVar)))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Contacts_Cancel, (DialogInterface.OnClickListener) null)).onDismissListener(new DialogInterface$OnDismissListenerC35562j(this))).show();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: b */
    public void mo131153b(List<BusinessCardViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "cards");
        if (!CollectionUtils.isEmpty(list)) {
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.ptrLayout;
            if (lKUIPtrClassicFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ptrLayout");
            }
            UIUtils.show(lKUIPtrClassicFrameLayout);
            UDEmptyState uDEmptyState = this.emptyLayout;
            if (uDEmptyState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyLayout");
            }
            UIUtils.hide(uDEmptyState);
            BusinessCardsAdapter aVar = this.f91968c;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
            }
            aVar.mo130986a(list);
            CommonRecyclerView commonRecyclerView = this.businessCardsRV;
            if (commonRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("businessCardsRV");
            }
            commonRecyclerView.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView
    /* renamed from: a */
    public void mo131150a(List<String> list) {
        BusinessCardsAdapter aVar = this.f91968c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessCardAdapter");
        }
        aVar.mo130989c(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView$i */
    public static final class DialogInterface$OnClickListenerC35561i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsView f91978a;

        /* renamed from: b */
        final /* synthetic */ BusinessCardViewData f91979b;

        DialogInterface$OnClickListenerC35561i(BusinessCardsView businessCardsView, BusinessCardViewData aVar) {
            this.f91978a = businessCardsView;
            this.f91979b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IBusinessCardsContract.IView.Delegage aVar = this.f91978a.f91967b;
            if (aVar != null) {
                aVar.mo131177a(this.f91979b);
            }
        }
    }

    public BusinessCardsView(ViewDependency bVar, boolean z, boolean z2) {
        this.f91969e = bVar;
        this.f91970f = z;
        this.f91971g = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessCardsView(ViewDependency bVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
