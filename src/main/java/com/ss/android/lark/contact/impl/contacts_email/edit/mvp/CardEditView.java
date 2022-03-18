package com.ss.android.lark.contact.impl.contacts_email.edit.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.edittext.UDTextInputLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_email.edit.CardEditItemFactory;
import com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u000e\u0011\u0018\u00002\u00020\u0001:\u00019B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0016J\u0018\u0010-\u001a\u00020!2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020!H\u0016J\u0012\u00106\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u000108H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0004¨\u0006:"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView;", "viewDependency", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$ViewDependency;", "(Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$ViewDependency;)V", "adapter", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditAdapter;", "cardEditRV", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "getCardEditRV", "()Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "setCardEditRV", "(Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;)V", "confirmClickListener", "com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$confirmClickListener$1", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$confirmClickListener$1;", "editItemTouchListener", "com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$editItemTouchListener$1", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$editItemTouchListener$1;", "mContext", "Landroid/content/Context;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewDelegate", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView$Delegage;", "getViewDependency", "()Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$ViewDependency;", "setViewDependency", "create", "", "destroy", "finish", "cardEdited", "", "initData", "factory", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory;", "initRecyclerView", "initTitleBar", "initView", "quit", "resetAll", "itemList", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "setViewDelegate", "showToast", "message", "", "updateItemsError", "updatePhonePrefixView", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CardEditView implements ICardEditContract.IView {

    /* renamed from: a */
    public Context f91928a;

    /* renamed from: b */
    public ICardEditContract.IView.Delegage f91929b;

    /* renamed from: c */
    public final C35545b f91930c = new C35545b(this);
    @BindView(6976)
    public CommonRecyclerView cardEditRV;

    /* renamed from: d */
    private CardEditItemFactory.CardEditAdapter f91931d;

    /* renamed from: e */
    private final C35546c f91932e = new C35546c(this);

    /* renamed from: f */
    private ViewDependency f91933f;
    @BindView(7209)
    public CommonTitleBar titleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$ViewDependency;", "", "finishActivity", "", "cardEdited", "", "injectView", "view", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView;", "startCountrySelectActivity", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo131051a();

        /* renamed from: a */
        void mo131052a(CardEditView cardEditView);

        /* renamed from: a */
        void mo131053a(boolean z);
    }

    /* renamed from: d */
    public final ViewDependency mo131122d() {
        return this.f91933f;
    }

    /* renamed from: e */
    private final void m139119e() {
        m139120f();
        m139121g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$editItemTouchListener$1", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemHolder$IEditItemTouchListener;", "onPhonePrefixClick", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$c */
    public static final class C35546c implements CardEditItemFactory.CardEditItemHolder.IEditItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91935a;

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.CardEditItemFactory.CardEditItemHolder.IEditItemTouchListener
        /* renamed from: a */
        public void mo131091a() {
            ViewDependency d = this.f91935a.mo131122d();
            if (d != null) {
                d.mo131051a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35546c(CardEditView cardEditView) {
            this.f91935a = cardEditView;
        }
    }

    /* renamed from: c */
    public final CommonRecyclerView mo131121c() {
        CommonRecyclerView commonRecyclerView = this.cardEditRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        return commonRecyclerView;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f91933f = null;
        this.f91929b = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$d */
    public static final class RunnableC35547d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91936a;

        RunnableC35547d(CardEditView cardEditView) {
            this.f91936a = cardEditView;
        }

        public final void run() {
            EditText editText;
            View childAt = this.f91936a.mo131121c().getChildAt(0);
            if (childAt == null) {
                childAt = null;
            }
            if ((childAt instanceof UDTextInputLayout) && (editText = ((UDTextInputLayout) childAt).getEditText()) != null) {
                editText.requestFocus();
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: a */
    public void mo131109a() {
        CardEditItemFactory.CardEditAdapter aVar = this.f91931d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo131066a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ViewDependency aVar = this.f91933f;
        if (aVar != null) {
            aVar.mo131052a(this);
        }
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        Context context = commonTitleBar.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "titleBar.context");
        this.f91928a = context;
        m139119e();
    }

    /* renamed from: f */
    private final void m139120f() {
        String str;
        int i;
        ICardEditContract.IView.Delegage aVar = this.f91929b;
        if (aVar != null) {
            str = aVar.mo131117b();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual("mode_edit", str)) {
            i = R.string.Lark_Contacts_EditContactCardTitle;
        } else {
            i = R.string.Lark_Contacts_AddContactCardTitle;
        }
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setTitle(UIHelper.getString(i));
        CommonTitleBar commonTitleBar2 = this.titleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.addAction(new C35548e(this, UIHelper.getString(R.string.Lark_Contacts_AddContactCardConfirm)));
        CommonTitleBar commonTitleBar3 = this.titleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC35549f(this));
        CommonTitleBar commonTitleBar4 = this.titleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        TextView rightText = commonTitleBar4.getRightText();
        if (rightText != null) {
            rightText.setTextColor(UIHelper.getColor(R.color.text_link_normal));
        }
    }

    /* renamed from: g */
    private final void m139121g() {
        CommonRecyclerView commonRecyclerView = this.cardEditRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        Context context = this.f91928a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        CardEditItemFactory bVar = new CardEditItemFactory();
        this.f91931d = bVar.mo131055a(this.f91932e).mo131054a();
        CommonRecyclerView commonRecyclerView2 = this.cardEditRV;
        if (commonRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        CardEditItemFactory.CardEditAdapter aVar = this.f91931d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        commonRecyclerView2.setAdapter(aVar);
        CommonRecyclerView commonRecyclerView3 = this.cardEditRV;
        if (commonRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        commonRecyclerView3.setOverScrollMode(2);
        CommonRecyclerView commonRecyclerView4 = this.cardEditRV;
        if (commonRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        commonRecyclerView4.setItemAnimator(null);
        m139118a(bVar);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: b */
    public void mo131114b() {
        boolean z;
        Context context = this.f91928a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        KeyboardUtils.hideKeyboard(context);
        ICardEditContract.IView.Delegage aVar = this.f91929b;
        if (aVar != null) {
            z = aVar.mo131118c();
        } else {
            z = false;
        }
        if (z) {
            Context context2 = this.f91928a;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            UDDialogBuilder eVar = new UDDialogBuilder(context2);
            String string = UIHelper.getString(R.string.Lark_Contacts_DiscardChangesConfirmation);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…scardChangesConfirmation)");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(string)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Contacts_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Contacts_Discard, new DialogInterface$OnClickListenerC35550g(this))).show();
            return;
        }
        mo131113a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$confirmClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$b */
    public static final class C35545b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91934a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35545b(CardEditView cardEditView) {
            this.f91934a = cardEditView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            KeyboardUtils.hideKeyboard(CardEditView.m139117a(this.f91934a));
            ICardEditContract.IView.Delegage aVar = this.f91934a.f91929b;
            if (aVar != null) {
                aVar.mo131115a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$f */
    public static final class View$OnClickListenerC35549f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91938a;

        View$OnClickListenerC35549f(CardEditView cardEditView) {
            this.f91938a = cardEditView;
        }

        public final void onClick(View view) {
            this.f91938a.mo131114b();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ICardEditContract.IView.Delegage aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f91929b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$e */
    public static final class C35548e extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91937a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f91937a.f91930c.onClick(view);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35548e(CardEditView cardEditView, String str) {
            super(str);
            this.f91937a = cardEditView;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m139117a(CardEditView cardEditView) {
        Context context = cardEditView.f91928a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    public CardEditView(ViewDependency aVar) {
        this.f91933f = aVar;
    }

    /* renamed from: a */
    private final void m139118a(CardEditItemFactory bVar) {
        ICardEditContract.IView.Delegage aVar = this.f91929b;
        if (aVar != null) {
            aVar.mo131116a(bVar.mo131056b());
        }
        CardEditItemFactory.CardEditAdapter aVar2 = this.f91931d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar2.diff(bVar.mo131056b());
        CommonRecyclerView commonRecyclerView = this.cardEditRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditRV");
        }
        commonRecyclerView.post(new RunnableC35547d(this));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: a */
    public void mo131110a(CountryBean countryBean) {
        CardEditItemFactory.CardEditAdapter aVar = this.f91931d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo131067a(3);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: a */
    public void mo131111a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Context context = this.f91928a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        LKUIToast.show(context, str);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: a */
    public void mo131112a(List<CardEditItemFactory.CardEditItemData> list) {
        boolean z;
        List<CardEditItemFactory.CardEditItemData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CardEditItemFactory.CardEditAdapter aVar = this.f91931d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            aVar.resetAll(list2);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView
    /* renamed from: a */
    public void mo131113a(boolean z) {
        ViewDependency aVar = this.f91933f;
        if (aVar != null) {
            aVar.mo131053a(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView$g */
    public static final class DialogInterface$OnClickListenerC35550g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardEditView f91939a;

        DialogInterface$OnClickListenerC35550g(CardEditView cardEditView) {
            this.f91939a = cardEditView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f91939a.mo131113a(false);
        }
    }
}
