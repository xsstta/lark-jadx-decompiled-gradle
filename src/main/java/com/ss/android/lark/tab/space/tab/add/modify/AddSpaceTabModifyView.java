package com.ss.android.lark.tab.space.tab.add.modify;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001+\u0018\u0000 ?2\u00020\u0001:\u0002?@B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u000203H\u0016J\u0010\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceModifyViewModel;", "viewDependency", "Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceModifyViewModel;Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$ViewDependency;)V", "getContext", "()Landroid/content/Context;", "mInputTip", "Landroid/widget/TextView;", "getMInputTip", "()Landroid/widget/TextView;", "setMInputTip", "(Landroid/widget/TextView;)V", "mModifyWarnTip", "getMModifyWarnTip", "setMModifyWarnTip", "mNameModifyEt", "Landroid/widget/EditText;", "getMNameModifyEt", "()Landroid/widget/EditText;", "setMNameModifyEt", "(Landroid/widget/EditText;)V", "mSelectDocView", "getMSelectDocView", "()Landroid/view/View;", "setMSelectDocView", "(Landroid/view/View;)V", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "getRootView", "showWarn", "", "titleAction", "com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$titleAction$2$1", "getTitleAction", "()Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$titleAction$2$1;", "titleAction$delegate", "Lkotlin/Lazy;", "getViewDependency", "()Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$ViewDependency;", "initNameEdit", "", "initSelectDocCard", "initTitleBar", "initView", "initViewModel", "onCreate", "setupTipForInput", "length", "", "trimTextLength", "", "text", "Companion", "ViewDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceTabModifyView extends Widget {

    /* renamed from: b */
    public static final Companion f136598b = new Companion(null);

    /* renamed from: a */
    public final AddSpaceModifyViewModel f136599a;

    /* renamed from: c */
    private boolean f136600c;

    /* renamed from: d */
    private final Lazy f136601d = LazyKt.lazy(new C55351g(this));

    /* renamed from: e */
    private final Context f136602e;

    /* renamed from: f */
    private final View f136603f;

    /* renamed from: g */
    private final ViewDependency f136604g;
    @BindView(7876)
    public TextView mInputTip;
    @BindView(8206)
    public TextView mModifyWarnTip;
    @BindView(8287)
    public EditText mNameModifyEt;
    @BindView(8718)
    public View mSelectDocView;
    @BindView(PlacesStatusCodes.OVER_QUERY_LIMIT)
    public CommonTitleBar mTitleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$ViewDependency;", "", "finish", "", "finishToChat", "id", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo188690a();

        /* renamed from: a */
        void mo188691a(long j);
    }

    /* renamed from: c */
    public final C55351g.C553521 mo121985c() {
        return (C55351g.C553521) this.f136601d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$Companion;", "", "()V", "MAX_NAME_CHAR_COUNT", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final Context mo188688f() {
        return this.f136602e;
    }

    /* renamed from: g */
    public final ViewDependency mo188689g() {
        return this.f136604g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$titleAction$2$1", "invoke", "()Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$titleAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$g */
    static final class C55351g extends Lambda implements Function0<C553521> {
        final /* synthetic */ AddSpaceTabModifyView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55351g(AddSpaceTabModifyView addSpaceTabModifyView) {
            super(0);
            this.this$0 = addSpaceTabModifyView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C553521 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Lark_Legacy_Save), R.drawable.selector_title_save_button) {
                /* class com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView.C55351g.C553521 */

                /* renamed from: a */
                final /* synthetic */ C55351g f136611a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    this.f136611a.this$0.f136599a.setDocName(this.f136611a.this$0.mo188685a(this.f136611a.this$0.mo188684a().getText().toString()));
                    this.f136611a.this$0.f136599a.getConfirmFlag().mo5926a((Boolean) true);
                }

                {
                    this.f136611a = r1;
                }
            };
        }
    }

    /* renamed from: h */
    private final void m214674h() {
        m214675i();
        m214676j();
        m214678l();
        m214677k();
    }

    /* renamed from: a */
    public final EditText mo188684a() {
        EditText editText = this.mNameModifyEt;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameModifyEt");
        }
        return editText;
    }

    /* renamed from: b */
    public final CommonTitleBar mo188687b() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        return commonTitleBar;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        ButterKnife.bind(this, this.f136603f);
        m214674h();
    }

    /* renamed from: i */
    private final void m214675i() {
        AddSpaceTabModifyView addSpaceTabModifyView = this;
        this.f136599a.getChatTabListLiveData().mo5923a(addSpaceTabModifyView, new C55348e(this));
        this.f136599a.getErrorLiveData().mo5923a(addSpaceTabModifyView, new C55350f(this));
    }

    /* renamed from: k */
    private final void m214677k() {
        AddSpaceItemBinder addSpaceItemBinder = new AddSpaceItemBinder(this.f136602e, null, false);
        View view = this.mSelectDocView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectDocView");
        }
        AddSpaceItemBinder.AddSpaceViewHolder addSpaceViewHolder = new AddSpaceItemBinder.AddSpaceViewHolder(view);
        addSpaceItemBinder.mo188554a(addSpaceViewHolder, this.f136599a.getSelectViewData());
        addSpaceViewHolder.mo188560f().setVisibility(8);
    }

    /* renamed from: j */
    private final void m214676j() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_DocumentName));
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC55347d(this));
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar4.addAction(mo121985c());
    }

    /* renamed from: l */
    private final void m214678l() {
        TextView textView = this.mModifyWarnTip;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModifyWarnTip");
        }
        textView.setText(UIHelper.getString(R.string.Lark_Groups_TabNameErrorMsg));
        TextView textView2 = this.mModifyWarnTip;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModifyWarnTip");
        }
        textView2.setVisibility(8);
        EditText editText = this.mNameModifyEt;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameModifyEt");
        }
        editText.addTextChangedListener(new C55346c(this));
        String a = mo188685a(this.f136599a.getSelectViewData().getTitle());
        EditText editText2 = this.mNameModifyEt;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameModifyEt");
        }
        editText2.setText(a);
        EditText editText3 = this.mNameModifyEt;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNameModifyEt");
        }
        mo188686a(editText3.length());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyView$initNameEdit$1", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$c */
    public static final class C55346c extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyView f136605a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55346c(AddSpaceTabModifyView addSpaceTabModifyView) {
            this.f136605a = addSpaceTabModifyView;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            int length = editable.length();
            View viewByAction = this.f136605a.mo188687b().getViewByAction(this.f136605a.mo121985c());
            if (viewByAction != null) {
                TextView textView = (TextView) viewByAction;
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setEnabled(z);
                this.f136605a.mo188686a(length);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$d */
    public static final class View$OnClickListenerC55347d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyView f136606a;

        View$OnClickListenerC55347d(AddSpaceTabModifyView addSpaceTabModifyView) {
            this.f136606a = addSpaceTabModifyView;
        }

        public final void onClick(View view) {
            this.f136606a.mo188689g().mo188690a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$f */
    public static final class C55350f<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyView f136610a;

        C55350f(AddSpaceTabModifyView addSpaceTabModifyView) {
            this.f136610a = addSpaceTabModifyView;
        }

        /* renamed from: a */
        public final void onChanged(ErrorResult errorResult) {
            KeyboardUtils.hideKeyboard(this.f136610a.mo188688f());
            Context f = this.f136610a.mo188688f();
            String string = UIHelper.getString(R.string.Lark_Group_FailedToSaveToast);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_Group_FailedToSaveToast)");
            UDToast.show(f, string);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "list", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView$e */
    public static final class C55348e<T> implements AbstractC1178x<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceTabModifyView f136607a;

        C55348e(AddSpaceTabModifyView addSpaceTabModifyView) {
            this.f136607a = addSpaceTabModifyView;
        }

        /* renamed from: a */
        public final void onChanged(final ChatTabsListResult aVar) {
            if (!CollectionUtils.isEmpty(aVar.mo188425a())) {
                Context f = this.f136607a.mo188688f();
                String string = UIHelper.getString(R.string.Lark_Group_SavedToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Group_SavedToast)");
                UDToast.show(f, string);
                KeyboardUtils.hideKeyboard(this.f136607a.mo188688f());
                UICallbackExecutor.executeDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyView.C55348e.RunnableC553491 */

                    /* renamed from: a */
                    final /* synthetic */ C55348e f136608a;

                    {
                        this.f136608a = r1;
                    }

                    public final void run() {
                        this.f136608a.f136607a.mo188689g().mo188691a(((ChatTab) CollectionsKt.last((List) aVar.mo188425a())).getId());
                    }
                }, 100);
            }
        }
    }

    /* renamed from: a */
    public final String mo188685a(String str) {
        if (str.length() <= 12) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            String substring = str.substring(0, 12);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final void mo188686a(int i) {
        boolean z;
        int i2;
        int i3 = 0;
        if (i > 12 || i <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f136600c = z;
        String str = i + "/12";
        SpannableString spannableString = new SpannableString(str);
        if (this.f136600c) {
            i2 = R.color.ud_error_color_6;
        } else {
            i2 = R.color.text_placeholder;
        }
        spannableString.setSpan(new ForegroundColorSpan(UIHelper.getColor(i2)), 0, StringsKt.indexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null), 17);
        TextView textView = this.mInputTip;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputTip");
        }
        textView.setText(spannableString);
        TextView textView2 = this.mModifyWarnTip;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModifyWarnTip");
        }
        if (i <= 12) {
            i3 = 8;
        }
        textView2.setVisibility(i3);
    }

    public AddSpaceTabModifyView(Context context, View view, AddSpaceModifyViewModel aVar, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f136602e = context;
        this.f136603f = view;
        this.f136599a = aVar;
        this.f136604g = bVar;
    }
}
