package com.ss.lark.android.passport.biz.compat.reset_pwd.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetPwdStepInfo;
import com.ss.lark.android.passport.biz.widget.KeyboardDetectorConstraintLayout;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IView$Delegate;", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IView;", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mViewDelegate", "clearPwd", "", "clearTextFocus", "create", "destroy", "hideLoadingView", "init", "initView", "nextStep", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/model/SetPwdStepInfo;", "inputComplete", "setViewDelegate", "viewDelegate", "showCommonToast", "content", "", "showLoadingView", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c */
public final class SetPasswordView extends AbstractC49023c<ISetPasswordContract.IView.Delegate> implements ISetPasswordContract.IView {

    /* renamed from: e */
    public static final Companion f162745e = new Companion(null);

    /* renamed from: c */
    public ISetPasswordContract.IView.Delegate f162746c;

    /* renamed from: d */
    public final Activity f162747d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordView$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m253238i();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162746c = null;
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView
    /* renamed from: d */
    public void mo223002d() {
        Activity activity = this.f162747d;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView
    /* renamed from: e */
    public void mo223003e() {
        Activity activity = this.f162747d;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView
    /* renamed from: f */
    public void mo223004f() {
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).mo224693f();
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).mo224693f();
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView
    /* renamed from: g */
    public void mo223005g() {
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).mo224691d();
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).mo224691d();
    }

    /* renamed from: h */
    public final void mo223012h() {
        boolean z;
        String string = ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).getString();
        String string2 = ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).getString();
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f162747d.findViewById(R.id.llFinish);
        String str = string;
        boolean z2 = true;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string2)) {
            z = false;
        } else {
            z = true;
        }
        constraintLayout.setEnabled(z);
        TextView textView = (TextView) this.f162747d.findViewById(R.id.tvNext);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string2)) {
            z2 = false;
        }
        textView.setEnabled(z2);
    }

    /* renamed from: i */
    private final void m253238i() {
        ((ConstraintLayout) this.f162747d.findViewById(R.id.llFinish)).setEnabled(false);
        ((TextView) this.f162747d.findViewById(R.id.tvNext)).setEnabled(false);
        Activity activity = this.f162747d;
        PasswordEditText.C65324d a = PasswordEditText.C65324d.m256266a(activity, activity.getResources().getString(R.string.Lark_Settings_PlaceholderOfSetNewPassword));
        Activity activity2 = this.f162747d;
        PasswordEditText.C65324d a2 = PasswordEditText.C65324d.m256266a(activity2, activity2.getResources().getString(R.string.Lark_Passport_ReEnterNewPSHintPC));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).mo224688a(a);
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).mo224688a(a2);
        ak.m193850a((ConstraintLayout) this.f162747d.findViewById(R.id.llFinish), new View$OnClickListenerC64436b(this));
        ((AppCompatImageView) this.f162747d.findViewById(R.id.iv_back)).setOnClickListener(new View$OnClickListenerC64437c(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).mo224694g();
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).setTextChangeListener(new C64438d(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).setTextChangeListener(new C64439e(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).setOnInputCompleteListener(new C64440f(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).setOnInputCompleteListener(new C64441g(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwd)).setOnKeyboardDetectorListener(new C64442h(this));
        ((PasswordEditText) this.f162747d.findViewById(R.id.editSetPwdAgain)).setOnKeyboardDetectorListener(new C64443i(this));
        KeyboardDetectorConstraintLayout keyboardDetectorConstraintLayout = (KeyboardDetectorConstraintLayout) this.f162747d.findViewById(R.id.set_pwd_content_frame_container);
        Intrinsics.checkExpressionValueIsNotNull(keyboardDetectorConstraintLayout, "mContext.set_pwd_content_frame_container");
        keyboardDetectorConstraintLayout.setOnFocusChangeListener(new View$OnFocusChangeListenerC64444j(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$c */
    public static final class View$OnClickListenerC64437c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162749a;

        View$OnClickListenerC64437c(SetPasswordView cVar) {
            this.f162749a = cVar;
        }

        public final void onClick(View view) {
            this.f162749a.f162747d.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onTextChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$d */
    public static final class C64438d implements PasswordEditText.AbstractC65325e {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162750a;

        C64438d(SetPasswordView cVar) {
            this.f162750a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
        /* renamed from: a */
        public final void mo222922a(String str) {
            this.f162750a.mo223012h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onTextChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$e */
    public static final class C64439e implements PasswordEditText.AbstractC65325e {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162751a;

        C64439e(SetPasswordView cVar) {
            this.f162751a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65325e
        /* renamed from: a */
        public final void mo222922a(String str) {
            this.f162751a.mo223012h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "s", "", "kotlin.jvm.PlatformType", "onInputComplete"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$f */
    public static final class C64440f implements PasswordEditText.AbstractC65321a {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162752a;

        C64440f(SetPasswordView cVar) {
            this.f162752a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65321a
        /* renamed from: a */
        public final void mo222923a(String str) {
            this.f162752a.mo223012h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "s", "", "kotlin.jvm.PlatformType", "onInputComplete"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$g */
    public static final class C64441g implements PasswordEditText.AbstractC65321a {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162753a;

        C64441g(SetPasswordView cVar) {
            this.f162753a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65321a
        /* renamed from: a */
        public final void mo222923a(String str) {
            this.f162753a.mo223012h();
        }
    }

    public SetPasswordView(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        this.f162747d = activity;
    }

    /* renamed from: a */
    public void mo171188a(ISetPasswordContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f162746c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onKeyEnterPressed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$h */
    public static final class C64442h implements PasswordEditText.AbstractC65322b {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162754a;

        C64442h(SetPasswordView cVar) {
            this.f162754a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65322b
        /* renamed from: a */
        public final void mo222924a(String str) {
            ((ConstraintLayout) this.f162754a.f162747d.findViewById(R.id.llFinish)).performClick();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onKeyEnterPressed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$i */
    public static final class C64443i implements PasswordEditText.AbstractC65322b {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162755a;

        C64443i(SetPasswordView cVar) {
            this.f162755a = cVar;
        }

        @Override // com.ss.lark.android.passport.biz.widget.password.PasswordEditText.AbstractC65322b
        /* renamed from: a */
        public final void mo222924a(String str) {
            ((ConstraintLayout) this.f162755a.f162747d.findViewById(R.id.llFinish)).performClick();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView
    /* renamed from: a */
    public void mo223001a(SetPwdStepInfo setPwdStepInfo) {
        if (setPwdStepInfo != null) {
            if (!TextUtils.isEmpty(setPwdStepInfo.title)) {
                TextView textView = (TextView) this.f162747d.findViewById(R.id.tvSetPwdTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView, "mContext.tvSetPwdTitle");
                textView.setText(setPwdStepInfo.title);
            }
            if (!TextUtils.isEmpty(setPwdStepInfo.subTitle)) {
                TextView textView2 = (TextView) this.f162747d.findViewById(R.id.tvSetPwdSubTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "mContext.tvSetPwdSubTitle");
                textView2.setText(setPwdStepInfo.subTitle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$b */
    public static final class View$OnClickListenerC64436b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162748a;

        View$OnClickListenerC64436b(SetPasswordView cVar) {
            this.f162748a = cVar;
        }

        public final void onClick(View view) {
            C49096b.m193606r();
            PasswordEditText passwordEditText = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwd);
            Intrinsics.checkExpressionValueIsNotNull(passwordEditText, "mContext.editSetPwd");
            if (!TextUtils.isEmpty(passwordEditText.getString())) {
                PasswordEditText passwordEditText2 = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwdAgain);
                Intrinsics.checkExpressionValueIsNotNull(passwordEditText2, "mContext.editSetPwdAgain");
                if (!TextUtils.isEmpty(passwordEditText2.getString())) {
                    PasswordEditText passwordEditText3 = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwd);
                    Intrinsics.checkExpressionValueIsNotNull(passwordEditText3, "mContext.editSetPwd");
                    PasswordEditText passwordEditText4 = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwdAgain);
                    Intrinsics.checkExpressionValueIsNotNull(passwordEditText4, "mContext.editSetPwdAgain");
                    if (!TextUtils.equals(passwordEditText3.getString(), passwordEditText4.getString())) {
                        this.f162748a.f123085b.mo171471d("SetPasswordView", "Pwd or pwdAgain is null");
                        Activity activity = this.f162748a.f162747d;
                        if (activity != null) {
                            if (UIUtils.isActivityRunning(activity)) {
                                Activity activity2 = this.f162748a.f162747d;
                                if (activity2 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                                } else if (KeyboardUtils.isSoftShowing(activity2)) {
                                    C49203q.m193973a((Context) this.f162748a.f162747d);
                                }
                            }
                            LKUIToast.show(this.f162748a.f162747d, (int) R.string.Lark_Passport_PSWordNotSameToastPC);
                            this.f162748a.mo223005g();
                            this.f162748a.mo223004f();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                    ISetPasswordContract.IView.Delegate aVar = this.f162748a.f162746c;
                    if (aVar != null) {
                        PasswordEditText passwordEditText5 = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwd);
                        Intrinsics.checkExpressionValueIsNotNull(passwordEditText5, "mContext.editSetPwd");
                        String string = passwordEditText5.getString();
                        PasswordEditText passwordEditText6 = (PasswordEditText) this.f162748a.f162747d.findViewById(R.id.editSetPwdAgain);
                        Intrinsics.checkExpressionValueIsNotNull(passwordEditText6, "mContext.editSetPwdAgain");
                        aVar.mo223006a(string, passwordEditText6.getString());
                        return;
                    }
                    return;
                }
            }
            this.f162748a.f123085b.mo171471d("SetPasswordView", "Pwd or pwdAgain is null");
            LKUIToast.show(this.f162748a.f162747d, (int) R.string.Lark_Settings_PlaceholderOfSetNewPassword);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.c$j */
    public static final class View$OnFocusChangeListenerC64444j implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ SetPasswordView f162756a;

        View$OnFocusChangeListenerC64444j(SetPasswordView cVar) {
            this.f162756a = cVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && C49203q.m193977c(this.f162756a.f162747d)) {
                C49203q.m193973a((Context) this.f162756a.f162747d);
            }
        }
    }
}
