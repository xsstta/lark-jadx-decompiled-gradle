package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1556v;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "(Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;)V", "adminCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "adminLayout", "adminTextView", "Landroid/widget/TextView;", "anyoneCheckBox", "anyoneLayout", "anyoneTextView", "memberCheckBox", "memberLayout", "memberTextView", "nobodyCheckBox", "nobodyLayout", "nobodyTextView", "root", "Landroid/view/ViewGroup;", "tenantCheckBox", "tenantLayout", "tenantTextView", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "viewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView$Delegate;", "closeSetting", "", "create", "destroy", "initListeners", "refreshGroupMailSendType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "refreshState", "setParamsForDesktop", "setViewDelegate", "delegate", "showError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Companion", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d */
public final class GroupMailSettingView implements IGroupMailSettingContract.IView {

    /* renamed from: c */
    public static final Companion f89749c = new Companion(null);

    /* renamed from: a */
    public IGroupMailSettingContract.IView.Delegate f89750a;

    /* renamed from: b */
    public final ViewDependency f89751b;

    /* renamed from: d */
    private ViewGroup f89752d;

    /* renamed from: e */
    private View f89753e;

    /* renamed from: f */
    private View f89754f;

    /* renamed from: g */
    private View f89755g;

    /* renamed from: h */
    private View f89756h;

    /* renamed from: i */
    private View f89757i;

    /* renamed from: j */
    private UDCheckBox f89758j;

    /* renamed from: k */
    private UDCheckBox f89759k;

    /* renamed from: l */
    private UDCheckBox f89760l;

    /* renamed from: m */
    private UDCheckBox f89761m;

    /* renamed from: n */
    private UDCheckBox f89762n;

    /* renamed from: o */
    private TextView f89763o;

    /* renamed from: p */
    private TextView f89764p;

    /* renamed from: q */
    private TextView f89765q;

    /* renamed from: r */
    private TextView f89766r;

    /* renamed from: s */
    private TextView f89767s;

    /* renamed from: t */
    private CommonTitleBar f89768t;

    /* renamed from: u */
    private final View f89769u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "", "closeCurrent", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo128275a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView
    /* renamed from: a */
    public void mo128286a() {
        this.f89751b.mo128275a();
    }

    /* renamed from: b */
    private final void m135102b() {
        if (DesktopUtil.m144307b()) {
            CommonTitleBar commonTitleBar = this.f89768t;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            TextView[] textViewArr = new TextView[4];
            TextView textView = this.f89764p;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adminTextView");
            }
            textViewArr[0] = textView;
            TextView textView2 = this.f89765q;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("memberTextView");
            }
            textViewArr[1] = textView2;
            TextView textView3 = this.f89763o;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tenantTextView");
            }
            textViewArr[2] = textView3;
            TextView textView4 = this.f89766r;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anyoneTextView");
            }
            textViewArr[3] = textView4;
            DesktopUtil.m144299a(textViewArr);
            View[] viewArr = new View[4];
            View view = this.f89754f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adminLayout");
            }
            viewArr[0] = view;
            View view2 = this.f89755g;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("memberLayout");
            }
            viewArr[1] = view2;
            View view3 = this.f89756h;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tenantLayout");
            }
            viewArr[2] = view3;
            View view4 = this.f89753e;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anyoneLayout");
            }
            viewArr[3] = view4;
            DesktopUtil.m144298a(viewArr);
        }
    }

    /* renamed from: c */
    private final void m135103c() {
        View view = this.f89753e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anyoneLayout");
        }
        view.setOnClickListener(new View$OnClickListenerC34741d(this));
        View view2 = this.f89754f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adminLayout");
        }
        view2.setOnClickListener(new View$OnClickListenerC34742e(this));
        View view3 = this.f89755g;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("memberLayout");
        }
        view3.setOnClickListener(new View$OnClickListenerC34743f(this));
        View view4 = this.f89756h;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tenantLayout");
        }
        view4.setOnClickListener(new View$OnClickListenerC34744g(this));
        View view5 = this.f89757i;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nobodyLayout");
        }
        view5.setOnClickListener(new View$OnClickListenerC34745h(this));
        CommonTitleBar commonTitleBar = this.f89768t;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC34746i(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        View findViewById = this.f89769u.findViewById(R.id.mail_permission_setting_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.…ermission_setting_layout)");
        this.f89752d = (ViewGroup) findViewById;
        View findViewById2 = this.f89769u.findViewById(R.id.mail_permission_anyone_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.…permission_anyone_layout)");
        this.f89753e = findViewById2;
        View findViewById3 = this.f89769u.findViewById(R.id.mail_permission_admin_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.…_permission_admin_layout)");
        this.f89754f = findViewById3;
        View findViewById4 = this.f89769u.findViewById(R.id.mail_permission_member_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.…permission_member_layout)");
        this.f89755g = findViewById4;
        View findViewById5 = this.f89769u.findViewById(R.id.mail_permission_tenant_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.…permission_tenant_layout)");
        this.f89756h = findViewById5;
        View findViewById6 = this.f89769u.findViewById(R.id.mail_permission_nobody_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.…permission_nobody_layout)");
        this.f89757i = findViewById6;
        View findViewById7 = this.f89769u.findViewById(R.id.mail_permission_anyone_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.…ail_permission_anyone_cb)");
        this.f89758j = (UDCheckBox) findViewById7;
        View findViewById8 = this.f89769u.findViewById(R.id.mail_permission_admin_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.…mail_permission_admin_cb)");
        this.f89759k = (UDCheckBox) findViewById8;
        View findViewById9 = this.f89769u.findViewById(R.id.mail_permission_member_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.…ail_permission_member_cb)");
        this.f89760l = (UDCheckBox) findViewById9;
        View findViewById10 = this.f89769u.findViewById(R.id.mail_permission_tenant_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.…ail_permission_tenant_cb)");
        this.f89761m = (UDCheckBox) findViewById10;
        View findViewById11 = this.f89769u.findViewById(R.id.mail_permission_nobody_cb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.…ail_permission_nobody_cb)");
        this.f89762n = (UDCheckBox) findViewById11;
        View findViewById12 = this.f89769u.findViewById(R.id.mail_permission_setting_tenant);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.…ermission_setting_tenant)");
        this.f89763o = (TextView) findViewById12;
        View findViewById13 = this.f89769u.findViewById(R.id.mail_permission_setting_admin);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.…permission_setting_admin)");
        this.f89764p = (TextView) findViewById13;
        View findViewById14 = this.f89769u.findViewById(R.id.mail_permission_setting_member);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "rootView.findViewById(R.…ermission_setting_member)");
        this.f89765q = (TextView) findViewById14;
        View findViewById15 = this.f89769u.findViewById(R.id.mail_permission_setting_anyone);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "rootView.findViewById(R.…ermission_setting_anyone)");
        this.f89766r = (TextView) findViewById15;
        View findViewById16 = this.f89769u.findViewById(R.id.mail_permission_setting_nobody);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "rootView.findViewById(R.…ermission_setting_nobody)");
        this.f89767s = (TextView) findViewById16;
        View findViewById17 = this.f89769u.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById17, "rootView.findViewById(R.id.title_bar)");
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById17;
        this.f89768t = commonTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setTitle(R.string.Lark_Group_GroupSettings_Email_Permission_Title);
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        commonTitleBar.addAction(new C34740c(UIHelper.getString(R.string.Lark_Legacy_Confirm), R.color.function_info_500, this));
        IGroupMailSettingContract.IView.Delegate aVar = this.f89750a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        if (aVar.mo128283a()) {
            TextView textView = this.f89764p;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adminTextView");
            }
            textView.setText(R.string.Lark_Groups_CircleEmailOnlyOwnerCanSend);
            TextView textView2 = this.f89765q;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("memberTextView");
            }
            textView2.setText(R.string.Lark_Groups_CircleEmailOnlyMemberCanSend);
        }
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34476o g = a.mo127277g();
        Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
        String b = g.mo127414b();
        TextView textView3 = this.f89763o;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tenantTextView");
        }
        textView3.setText(UIHelper.mustacheFormat((int) R.string.Lark_Group_GroupSettings_Email_Permission_Tenant, "tenant_name", b));
        View view = this.f89757i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nobodyLayout");
        }
        view.setVisibility(0);
        m135103c();
        mo128290b(Chat.GroupMailSendPermissionType.UNKNOWN);
        m135102b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$i */
    public static final class View$OnClickListenerC34746i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89778a;

        View$OnClickListenerC34746i(GroupMailSettingView dVar) {
            this.f89778a = dVar;
        }

        public final void onClick(View view) {
            this.f89778a.f89751b.mo128275a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IGroupMailSettingContract.IView.Delegate m135101a(GroupMailSettingView dVar) {
        IGroupMailSettingContract.IView.Delegate aVar = dVar.f89750a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$d */
    public static final class View$OnClickListenerC34741d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89773a;

        View$OnClickListenerC34741d(GroupMailSettingView dVar) {
            this.f89773a = dVar;
        }

        public final void onClick(View view) {
            GroupMailSettingView.m135101a(this.f89773a).mo128282a(true, Chat.GroupMailSendPermissionType.ANYONE);
            this.f89773a.mo128290b(Chat.GroupMailSendPermissionType.ANYONE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$e */
    public static final class View$OnClickListenerC34742e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89774a;

        View$OnClickListenerC34742e(GroupMailSettingView dVar) {
            this.f89774a = dVar;
        }

        public final void onClick(View view) {
            GroupMailSettingView.m135101a(this.f89774a).mo128282a(true, Chat.GroupMailSendPermissionType.ONLY_ADMIN);
            this.f89774a.mo128290b(Chat.GroupMailSendPermissionType.ONLY_ADMIN);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$f */
    public static final class View$OnClickListenerC34743f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89775a;

        View$OnClickListenerC34743f(GroupMailSettingView dVar) {
            this.f89775a = dVar;
        }

        public final void onClick(View view) {
            GroupMailSettingView.m135101a(this.f89775a).mo128282a(true, Chat.GroupMailSendPermissionType.ONLY_MEMBER);
            this.f89775a.mo128290b(Chat.GroupMailSendPermissionType.ONLY_MEMBER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$g */
    public static final class View$OnClickListenerC34744g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89776a;

        View$OnClickListenerC34744g(GroupMailSettingView dVar) {
            this.f89776a = dVar;
        }

        public final void onClick(View view) {
            GroupMailSettingView.m135101a(this.f89776a).mo128282a(true, Chat.GroupMailSendPermissionType.ONLY_TENANT);
            this.f89776a.mo128290b(Chat.GroupMailSendPermissionType.ONLY_TENANT);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$h */
    public static final class View$OnClickListenerC34745h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89777a;

        View$OnClickListenerC34745h(GroupMailSettingView dVar) {
            this.f89777a = dVar;
        }

        public final void onClick(View view) {
            GroupMailSettingView.m135101a(this.f89777a).mo128282a(false, Chat.GroupMailSendPermissionType.UNKNOWN);
            this.f89777a.mo128290b(Chat.GroupMailSendPermissionType.UNKNOWN);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView
    /* renamed from: a */
    public void mo128288a(Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
        Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
        mo128290b(groupMailSendPermissionType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$create$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "LENGTH", "", "getLENGTH", "()J", "mLastClickTime", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.d$c */
    public static final class C34740c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingView f89770a;

        /* renamed from: b */
        private long f89771b;

        /* renamed from: c */
        private final long f89772c = 1000;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f89771b = uptimeMillis;
            if (uptimeMillis - this.f89771b < this.f89772c) {
                Log.m165389i("GroupMailSettingView", "elapsedTime is short than " + this.f89772c + " ms");
                return;
            }
            GroupMailSettingView.m135101a(this.f89770a).mo128284b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34740c(String str, int i, GroupMailSettingView dVar) {
            super(str, i);
            this.f89770a = dVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView
    /* renamed from: a */
    public void mo128287a(ErrorResult errorResult) {
        if (errorResult == null || TextUtils.isEmpty(errorResult.getDisplayMsg())) {
            LKUIToast.show(this.f89769u.getContext(), (int) R.string.Lark_Group_GroupSettings_Email_Permission_Failed);
        } else {
            LKUIToast.show(this.f89769u.getContext(), errorResult.getDisplayMsg());
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IGroupMailSettingContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f89750a = aVar;
    }

    /* renamed from: b */
    public final void mo128290b(Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ViewGroup viewGroup = this.f89752d;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        C1556v.m7130a(viewGroup);
        UDCheckBox uDCheckBox = this.f89758j;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anyoneCheckBox");
        }
        boolean z5 = true;
        if (groupMailSendPermissionType == Chat.GroupMailSendPermissionType.ANYONE) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        UDCheckBox uDCheckBox2 = this.f89759k;
        if (uDCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adminCheckBox");
        }
        if (groupMailSendPermissionType == Chat.GroupMailSendPermissionType.ONLY_ADMIN) {
            z2 = true;
        } else {
            z2 = false;
        }
        uDCheckBox2.setChecked(z2);
        UDCheckBox uDCheckBox3 = this.f89760l;
        if (uDCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("memberCheckBox");
        }
        if (groupMailSendPermissionType == Chat.GroupMailSendPermissionType.ONLY_MEMBER) {
            z3 = true;
        } else {
            z3 = false;
        }
        uDCheckBox3.setChecked(z3);
        UDCheckBox uDCheckBox4 = this.f89761m;
        if (uDCheckBox4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tenantCheckBox");
        }
        if (groupMailSendPermissionType == Chat.GroupMailSendPermissionType.ONLY_TENANT) {
            z4 = true;
        } else {
            z4 = false;
        }
        uDCheckBox4.setChecked(z4);
        UDCheckBox uDCheckBox5 = this.f89762n;
        if (uDCheckBox5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nobodyCheckBox");
        }
        if (groupMailSendPermissionType != Chat.GroupMailSendPermissionType.UNKNOWN) {
            z5 = false;
        }
        uDCheckBox5.setChecked(z5);
        ViewGroup viewGroup2 = this.f89752d;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        C1556v.m7132b(viewGroup2);
    }

    public GroupMailSettingView(View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f89769u = view;
        this.f89751b = bVar;
    }
}
