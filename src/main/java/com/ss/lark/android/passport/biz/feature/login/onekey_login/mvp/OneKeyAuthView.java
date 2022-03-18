package com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.util.p2441c.C49167b;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import com.ss.lark.android.passport.biz.feature.login.OneKeyLoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract;
import com.ss.lark.android.passport.biz.feature.p3216a.C64574a;
import com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils;
import com.ss.lark.android.passport.biz.widget.KeyboardDetectorConstraintLayout;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\"\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getContext", "()Landroid/app/Activity;", "mDialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "mLocaleListener", "Lcom/ss/android/lark/passport/signinsdk_api/account/OnLocaleSelectListener;", "viewDelegate", "create", "", "destroy", "finish", "hideLoadingView", "initView", "isCheckBoxChecked", "", "oneAuthError", "authType", "", "errCode", ApiHandler.API_CALLBACK_ERRMSG, "", "setButtonAndPolicyText", "setViewDelegate", "showBackTitle", "showLanguageSwitch", "showLoadingView", "showPolicyDaliog", "netType", "showSecurityPhoneAndOperatorName", "securityPhone", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c */
public final class OneKeyAuthView extends AbstractC49023c<IOneKeyAuthContract.IView.Delegate> implements IOneKeyAuthContract.IView {

    /* renamed from: c */
    public IOneKeyAuthContract.IView.Delegate f163500c;

    /* renamed from: d */
    private AbstractC49339b f163501d;

    /* renamed from: e */
    private UDDialog f163502e;

    /* renamed from: f */
    private final Activity f163503f;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254742k();
    }

    /* renamed from: j */
    public final Activity mo223808j() {
        return this.f163503f;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: i */
    public void mo223789i() {
        this.f163503f.finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthView$showBackTitle$1", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar$OnTitleLeftIconClickListener;", "onClickLeftIcon", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$e */
    public static final class C64861e extends CommonTitleBar.AbstractC49239c {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163508a;

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: a */
        public void mo171769a() {
            OneKeyLoginStatisticsHelper.m254675a();
            this.f163508a.mo223808j().finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64861e(OneKeyAuthView cVar) {
            this.f163508a = cVar;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        ServiceFinder.m193752g().removeLocaleSelectListener(this.f163501d);
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: d */
    public void mo223784d() {
        Activity activity = this.f163503f;
        if (!(!activity.isFinishing())) {
            activity = null;
        }
        if (activity != null) {
            Activity activity2 = this.f163503f;
            if (activity2 != null) {
                ((BaseActivity) activity2).mo171141m();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.infra.base.architecture.BaseActivity<*>");
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: e */
    public void mo223785e() {
        Activity activity = this.f163503f;
        if (!(!activity.isFinishing())) {
            activity = null;
        }
        if (activity != null) {
            Activity activity2 = this.f163503f;
            if (activity2 != null) {
                ((BaseActivity) activity2).mo171143o();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.infra.base.architecture.BaseActivity<*>");
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: f */
    public boolean mo223786f() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f163503f.findViewById(R.id.onekeyLoginCheckBoxPolicy);
        Intrinsics.checkExpressionValueIsNotNull(appCompatCheckBox, "context.onekeyLoginCheckBoxPolicy");
        if (appCompatCheckBox.getVisibility() == 0) {
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f163503f.findViewById(R.id.onekeyLoginCheckBoxPolicy);
            Intrinsics.checkExpressionValueIsNotNull(appCompatCheckBox2, "context.onekeyLoginCheckBoxPolicy");
            if (appCompatCheckBox2.isChecked()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: h */
    public void mo223788h() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f163503f.findViewById(R.id.oneKeyAuthTitlebar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "context.oneKeyAuthTitlebar");
        commonTitleBar.setVisibility(0);
        ((CommonTitleBar) this.f163503f.findViewById(R.id.oneKeyAuthTitlebar)).mo171755a(true, true);
        ((CommonTitleBar) this.f163503f.findViewById(R.id.oneKeyAuthTitlebar)).setTitleClickListener(new C64861e(this));
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: g */
    public void mo223787g() {
        TextView textView = (TextView) this.f163503f.findViewById(R.id.oneKeyAuthChangeLanguageTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "context.oneKeyAuthChangeLanguageTv");
        textView.setVisibility(0);
        ak.m193850a((TextView) this.f163503f.findViewById(R.id.oneKeyAuthChangeLanguageTv), new View$OnClickListenerC64862f(this));
        C64574a.m253733a((TextView) this.f163503f.findViewById(R.id.oneKeyAuthChangeLanguageTv));
        this.f163501d = new C64863g(this);
        ServiceFinder.m193752g().addLocaleSelectListener(this.f163501d);
    }

    /* renamed from: k */
    private final void m254742k() {
        TextView textView = (TextView) this.f163503f.findViewById(R.id.oneKeyAuthChangeLanguageTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "context.oneKeyAuthChangeLanguageTv");
        textView.setVisibility(8);
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f163503f.findViewById(R.id.oneKeyAuthTitlebar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "context.oneKeyAuthTitlebar");
        commonTitleBar.setVisibility(8);
        ((Button) this.f163503f.findViewById(R.id.onekeyAuthStartLoginBtn)).setOnClickListener(new View$OnClickListenerC64857a(this));
        ((Button) this.f163503f.findViewById(R.id.onekeyAuthOtherLoginBtn)).setOnClickListener(new View$OnClickListenerC64858b(this));
        ((Button) this.f163503f.findViewById(R.id.onekeyAuthOtherLoginBtn)).setOnClickListener(new View$OnClickListenerC64859c(this));
        if (ServiceFinder.m193752g().getAppIcon() != null) {
            ((ImageView) this.f163503f.findViewById(R.id.onekeyLoginAppLog)).setBackgroundDrawable(ServiceFinder.m193752g().getAppIcon());
        } else {
            ((ImageView) this.f163503f.findViewById(R.id.onekeyLoginAppLog)).setBackgroundResource(R.drawable.signin_sdk_lark_icon_avatar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$a */
    public static final class View$OnClickListenerC64857a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163504a;

        View$OnClickListenerC64857a(OneKeyAuthView cVar) {
            this.f163504a = cVar;
        }

        public final void onClick(View view) {
            IOneKeyAuthContract.IView.Delegate bVar = this.f163504a.f163500c;
            if (bVar != null) {
                bVar.mo223790a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$b */
    public static final class View$OnClickListenerC64858b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163505a;

        View$OnClickListenerC64858b(OneKeyAuthView cVar) {
            this.f163505a = cVar;
        }

        public final void onClick(View view) {
            IOneKeyAuthContract.IView.Delegate bVar = this.f163505a.f163500c;
            if (bVar != null) {
                bVar.mo223791b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$c */
    public static final class View$OnClickListenerC64859c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163506a;

        View$OnClickListenerC64859c(OneKeyAuthView cVar) {
            this.f163506a = cVar;
        }

        public final void onClick(View view) {
            IOneKeyAuthContract.IView.Delegate bVar = this.f163506a.f163500c;
            if (bVar != null) {
                bVar.mo223792c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "onLocaleSelected"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$g */
    static final class C64863g implements AbstractC49339b {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163510a;

        C64863g(OneKeyAuthView cVar) {
            this.f163510a = cVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b
        /* renamed from: a */
        public final void mo172130a(Locale locale) {
            IOneKeyAuthContract.IView.Delegate bVar = this.f163510a.f163500c;
            if (bVar != null) {
                bVar.mo223793d();
            }
        }
    }

    public OneKeyAuthView(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f163503f = activity;
    }

    /* renamed from: a */
    public void mo171188a(IOneKeyAuthContract.IView.Delegate bVar) {
        this.f163500c = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$f */
    static final class View$OnClickListenerC64862f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163509a;

        View$OnClickListenerC64862f(OneKeyAuthView cVar) {
            this.f163509a = cVar;
        }

        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromLogin", true);
            ServiceFinder.m193752g().openLanguageSettingPage(this.f163509a.mo223808j(), bundle);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: a */
    public void mo223780a(int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (i == 2) {
            charSequence = this.f163503f.getResources().getText(R.string.Lark_Login_NumberDetectLogInButton1);
        } else {
            charSequence = this.f163503f.getResources().getText(R.string.Lark_Login_NumberDetectSignUpButton1);
        }
        Intrinsics.checkExpressionValueIsNotNull(charSequence, "if (authType == REQUEST_…umberDetectSignUpButton1)");
        if (i == 2) {
            charSequence2 = this.f163503f.getResources().getText(R.string.Lark_Login_NumberDetectLogInButton2);
        } else {
            charSequence2 = this.f163503f.getResources().getText(R.string.Lark_Login_NumberDetectSignUpButton2);
        }
        Intrinsics.checkExpressionValueIsNotNull(charSequence2, "if (authType == REQUEST_…umberDetectSignUpButton2)");
        Button button = (Button) this.f163503f.findViewById(R.id.onekeyAuthStartLoginBtn);
        Intrinsics.checkExpressionValueIsNotNull(button, "context.onekeyAuthStartLoginBtn");
        button.setText(charSequence);
        Button button2 = (Button) this.f163503f.findViewById(R.id.onekeyAuthOtherLoginBtn);
        Intrinsics.checkExpressionValueIsNotNull(button2, "context.onekeyAuthOtherLoginBtn");
        button2.setText(charSequence2);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f163503f.findViewById(R.id.onekeyLoginCheckBoxPolicy);
        Intrinsics.checkExpressionValueIsNotNull(appCompatCheckBox, "context.onekeyLoginCheckBoxPolicy");
        appCompatCheckBox.setVisibility(0);
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: a */
    public void mo223782a(String str) {
        UDDialog uDDialog;
        Intrinsics.checkParameterIsNotNull(str, "netType");
        UDDialog uDDialog2 = this.f163502e;
        if (!(uDDialog2 == null || !uDDialog2.isShowing() || (uDDialog = this.f163502e) == null)) {
            uDDialog.dismiss();
        }
        View inflate = LayoutInflater.from(this.f163503f).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv);
        if (textView != null) {
            new PrivacyPolicyUtils.TextViewBuilder(textView, (int) R.string.Lark_Login_NumberDetectSignUpPopUpContent, IDomainService.UrlUnitType.HOST_UNIT).mo224495b();
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163503f);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(R.string.Lark_Login_V3_AgreePolicyTitle)).titleBold(true)).contentLayout(inflate)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Login_V3_PolicyAlertCancel, DialogInterface$OnClickListenerC64864h.f163511a)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Login_V3_PolicyAlertAgree, new DialogInterface$OnClickListenerC64865i(this));
        UDDialog build = eVar.build();
        this.f163502e = build;
        if (build != null) {
            build.show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$h */
    static final class DialogInterface$OnClickListenerC64864h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC64864h f163511a = new DialogInterface$OnClickListenerC64864h();

        DialogInterface$OnClickListenerC64864h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$d */
    static final class DialogInterface$OnClickListenerC64860d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163507a;

        DialogInterface$OnClickListenerC64860d(OneKeyAuthView cVar) {
            this.f163507a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IOneKeyAuthContract.IView.Delegate bVar = this.f163507a.f163500c;
            if (bVar != null) {
                bVar.mo223792c();
            }
            this.f163507a.f123085b.mo171465b("n_action_onekey_auth_other", "click");
            this.f163507a.mo223789i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.c$i */
    static final class DialogInterface$OnClickListenerC64865i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthView f163512a;

        DialogInterface$OnClickListenerC64865i(OneKeyAuthView cVar) {
            this.f163512a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f163512a.mo223808j().findViewById(R.id.onekeyLoginCheckBoxPolicy);
            Intrinsics.checkExpressionValueIsNotNull(appCompatCheckBox, "context.onekeyLoginCheckBoxPolicy");
            appCompatCheckBox.setChecked(true);
            IOneKeyAuthContract.IView.Delegate bVar = this.f163512a.f163500c;
            if (bVar != null) {
                bVar.mo223790a();
            }
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: a */
    public void mo223783a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "securityPhone");
        Intrinsics.checkParameterIsNotNull(str2, "netType");
        TextView textView = (TextView) this.f163503f.findViewById(R.id.oneKeyLoginSecurityPhoneTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "context.oneKeyLoginSecurityPhoneTv");
        textView.setText(str);
        KeyboardDetectorConstraintLayout keyboardDetectorConstraintLayout = (KeyboardDetectorConstraintLayout) this.f163503f.findViewById(R.id.one_key_content_frame_container);
        Intrinsics.checkExpressionValueIsNotNull(keyboardDetectorConstraintLayout, "context.one_key_content_frame_container");
        keyboardDetectorConstraintLayout.setVisibility(0);
        TextView textView2 = (TextView) this.f163503f.findViewById(R.id.oneKeyLoginHintTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "context.oneKeyLoginHintTv");
        PassportLog passportLog = this.f123085b;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        textView2.setText(C49154ag.m193832a(this.f163503f, R.string.Lark_Login_NumberDetectOperatorDesc, MapsKt.mutableMapOf(TuplesKt.to("mobileOperator", OperatorAuthTokenInfo.Companion.mo171616a(this.f163503f, str2, passportLog)))));
        TextView textView3 = (TextView) this.f163503f.findViewById(R.id.oneKeyLoginPolicyTV);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "context.oneKeyLoginPolicyTV");
        textView3.setText(new PrivacyPolicyUtils.Builder(this.f163503f, (int) R.string.Lark_Login_NumberDetectSignUpTerms, IDomainService.UrlUnitType.HOST_UNIT).mo224487a());
        TextView textView4 = (TextView) this.f163503f.findViewById(R.id.oneKeyLoginPolicyTV);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "context.oneKeyLoginPolicyTV");
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView5 = (TextView) this.f163503f.findViewById(R.id.oneKeyLoginPolicyTV);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "context.oneKeyLoginPolicyTV");
        textView5.setHighlightColor(0);
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView
    /* renamed from: a */
    public void mo223781a(int i, int i2, String str) {
        String str2;
        String str3;
        if (i == 2) {
            str2 = this.f163503f.getResources().getString(R.string.Lark_Login_NumberDetectOperatorErrorPopupContentLogin);
        } else {
            str2 = this.f163503f.getResources().getString(R.string.Lark_Login_NumberDetectOperatorErrorPopupContentSignup);
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "if (authType == REQUEST_…rErrorPopupContentSignup)");
        if (C49167b.m193878a(str)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        if (i2 == 4607 || i2 == 4223) {
            String string = this.f163503f.getResources().getString(R.string.Lark_Login_NumberDetectOperatorErrorPopupTitle);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…tOperatorErrorPopupTitle)");
            String string2 = this.f163503f.getResources().getString(R.string.Lark_Login_NumberDetectPopUpButtonOtherLoginSignup);
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.resources.getStr…UpButtonOtherLoginSignup)");
            UDDialogUtils.m193817a(this.f163503f, string, str3, string2, new DialogInterface$OnClickListenerC64860d(this), null, 32, null);
        } else if (i2 != 4401) {
            C49266a.m194147a(this.f163503f, str3);
        }
    }
}
