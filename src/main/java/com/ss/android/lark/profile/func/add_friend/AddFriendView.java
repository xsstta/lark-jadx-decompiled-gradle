package com.ss.android.lark.profile.func.add_friend;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.add_friend.IAddFriendContract;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendView;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;)V", "defaultReasonEdit", "", "kotlin.jvm.PlatformType", "loginUserName", "getMContext", "()Landroid/content/Context;", "getMRootView", "()Landroid/view/View;", "mViewDelegate", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView$IDelegate;", "getMViewDependency", "()Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;", "addSuccess", "", "alias", "create", "destroy", "initView", "setViewDelegate", "viewDelegate", "showErrorDialog", "content", "showInitData", "initData", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendViewData;", "Companion", "IAddFriendViewDependency", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.d */
public final class AddFriendView implements IAddFriendContract.IView {

    /* renamed from: b */
    public static final Companion f129630b = new Companion(null);

    /* renamed from: a */
    public IAddFriendContract.IView.IDelegate f129631a;

    /* renamed from: c */
    private final String f129632c;

    /* renamed from: d */
    private final String f129633d;

    /* renamed from: e */
    private final Context f129634e;

    /* renamed from: f */
    private final View f129635f;

    /* renamed from: g */
    private final IAddFriendViewDependency f129636g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$IAddFriendViewDependency;", "", "finishForResult", "", "alias", "", "finishFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$b */
    public interface IAddFriendViewDependency {
        /* renamed from: a */
        void mo179053a();

        /* renamed from: a */
        void mo179054a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendView$Companion;", "", "()V", "FRIEND_REQUEST_REASON_MAX_ALIAS", "", "FRIEND_REQUEST_REASON_MAX_LENGTH", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendView$initView$3", "Lcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;", "onExceed", "", "originString", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$e */
    public static final class C52267e implements EditTextLengthFilter.ExceedLengthListener {
        @Override // com.ss.android.lark.utils.EditTextLengthFilter.ExceedLengthListener
        /* renamed from: a */
        public void mo134006a(CharSequence charSequence) {
        }

        C52267e() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendView$initView$4", "Lcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;", "onExceed", "", "originString", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$f */
    public static final class C52268f implements EditTextLengthFilter.ExceedLengthListener {
        @Override // com.ss.android.lark.utils.EditTextLengthFilter.ExceedLengthListener
        /* renamed from: a */
        public void mo134006a(CharSequence charSequence) {
        }

        C52268f() {
        }
    }

    /* renamed from: a */
    public final Context mo179064a() {
        return this.f129634e;
    }

    /* renamed from: b */
    public final View mo179068b() {
        return this.f129635f;
    }

    /* renamed from: c */
    public final IAddFriendViewDependency mo179070c() {
        return this.f129636g;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m202813d();
    }

    /* renamed from: d */
    private final void m202813d() {
        ((CommonTitleBar) this.f129635f.findViewById(R.id.mTitleBar)).addAction(new C52265c(this, C57582a.m223604a(this.f129634e, (int) R.string.Lark_Legacy_Send), R.color.lkui_B500));
        ((CommonTitleBar) this.f129635f.findViewById(R.id.mTitleBar)).setTitle(C57582a.m223604a(this.f129634e, (int) R.string.Lark_NewContacts_RequestToAddToContacts));
        if (DesktopUtil.m144307b()) {
            ((CommonTitleBar) this.f129635f.findViewById(R.id.mTitleBar)).setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            ((CommonTitleBar) this.f129635f.findViewById(R.id.mTitleBar)).setLeftClickListener(new C52266d(this));
        }
        EditText editText = (EditText) this.f129635f.findViewById(R.id.mAliasNameEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mAliasNameEt");
        editText.setFilters(new InputFilter[]{new EditTextLengthFilter(50, new C52267e())});
        EditText editText2 = (EditText) this.f129635f.findViewById(R.id.mReasonEdit);
        Intrinsics.checkExpressionValueIsNotNull(editText2, "mRootView.mReasonEdit");
        editText2.setFilters(new InputFilter[]{new EditTextLengthFilter(100, new C52268f())});
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendView$initView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$d */
    public static final class C52266d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFriendView f129638a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52266d(AddFriendView dVar) {
            this.f129638a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f129638a.mo179070c().mo179053a();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IAddFriendContract.IView.IDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f129631a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IAddFriendContract.IView.IDelegate m202812a(AddFriendView dVar) {
        IAddFriendContract.IView.IDelegate aVar = dVar.f129631a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IView
    /* renamed from: a */
    public void mo179065a(AddFriendViewData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "initData");
        if (eVar.mo179071a() != null) {
            ((EditText) this.f129635f.findViewById(R.id.mAliasNameEt)).setText(eVar.mo179071a());
        }
        ((EditText) this.f129635f.findViewById(R.id.mReasonEdit)).setText(this.f129633d);
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IView
    /* renamed from: b */
    public void mo179069b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        new C25639g(this.f129634e).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89238b(true).mo89239c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendView$initView$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.d$c */
    public static final class C52265c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ AddFriendView f129637a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            IAddFriendContract.IView.IDelegate a = AddFriendView.m202812a(this.f129637a);
            Context a2 = this.f129637a.mo179064a();
            EditText editText = (EditText) this.f129637a.mo179068b().findViewById(R.id.mReasonEdit);
            Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.mReasonEdit");
            String obj = editText.getText().toString();
            EditText editText2 = (EditText) this.f129637a.mo179068b().findViewById(R.id.mAliasNameEt);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "mRootView.mAliasNameEt");
            a.mo179062a(a2, obj, editText2.getText().toString());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52265c(AddFriendView dVar, String str, int i) {
            super(str, i);
            this.f129637a = dVar;
        }
    }

    @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IView
    /* renamed from: a */
    public void mo179067a(String str) {
        Context context = this.f129634e;
        if ((context instanceof Activity) && KeyboardUtils.isSoftShowing((Activity) context)) {
            KeyboardUtils.hideKeyboard(this.f129634e);
        }
        LKUIToast.show(this.f129634e, (int) R.string.Lark_NewContacts_ContactRequestSentToast);
        this.f129636g.mo179054a(str);
        C57783ah.m224245a().mo196093a(R.id.UiMessageExternalContactUsingItem, UserContactStatus.CONTACT_STATUS_REQUEST);
    }

    public AddFriendView(Context context, View view, IAddFriendViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        this.f129634e = context;
        this.f129635f = view;
        this.f129636g = bVar;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        String e = q.mo133626e();
        this.f129632c = e;
        this.f129633d = UIHelper.mustacheFormat(UIHelper.getString(R.string.Lark_NewContacts_ContactRequestMessagePlaceholder2), "username", e);
    }
}
