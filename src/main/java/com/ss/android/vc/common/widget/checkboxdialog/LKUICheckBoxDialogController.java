package com.ss.android.vc.common.widget.checkboxdialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.p3086b.C60843a;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.statistics.event.C63750bm;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002?@B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0!2\u0006\u0010#\u001a\u00020$H\u0017J\b\u0010%\u001a\u00020\u000fH\u0014J\b\u0010&\u001a\u00020\u0015H\u0002J\n\u0010'\u001a\u0004\u0018\u00010(H\u0014J\n\u0010)\u001a\u0004\u0018\u00010(H\u0014J\"\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020/H\u0002J\"\u00100\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u00172\b\u0010.\u001a\u0004\u0018\u00010/J\u000e\u00101\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,J\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020(J\u0016\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020,J\u0012\u00107\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u000109H\u0002J\u0012\u0010:\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010,H\u0002J\u0018\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020\u0015H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "envId", "mCheckBoxHint", "", "mCheckBoxPaddingBottom", "", "mCheckBoxPaddingLeft", "mCheckBoxPaddingRight", "mCheckBoxPaddingTop", "mContext", "mIsCheckBoxChecked", "", "mMsgInfo", "Lcom/ss/android/vc/entity/livestream/MsgWithUrlInfo;", "mMsgInfoTextColor", "mOnCheckedChangeListener", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "mOnCheckedListener", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnCheckedListener;", "mRequireCheck", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "hasCheckBoxHint", "onCreateContent", "Landroid/view/View;", "onCreateFooter", "setMsgWithOneUrl", "messageTV", "Landroid/widget/TextView;", "msgInfo", "listener", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;", "setMsgWithTwoUrl", "setMsgWithUrl", "setOnCheckedListener", "footerContainer", "setRightChecked", "checked", "right", "setupCheckBox", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setupCheckBoxHint", "tv", "setupRightBtn", "rightBtn", "enable", "OnCheckedListener", "OnJumpListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.b.b */
public final class LKUICheckBoxDialogController extends UDDialogController {

    /* renamed from: a */
    public UDCheckBox.OnCheckedChangeListener f152298a;

    /* renamed from: b */
    public OnCheckedListener f152299b;

    /* renamed from: c */
    public boolean f152300c;

    /* renamed from: d */
    public Context f152301d;

    /* renamed from: e */
    private String f152302e = "LKUICheckBoxDialogController";

    /* renamed from: f */
    private CharSequence f152303f;

    /* renamed from: g */
    private MsgWithUrlInfo f152304g;

    /* renamed from: h */
    private boolean f152305h;

    /* renamed from: i */
    private String f152306i = "";

    /* renamed from: j */
    private int f152307j = -1;

    /* renamed from: k */
    private int f152308k = -1;

    /* renamed from: l */
    private int f152309l = -1;

    /* renamed from: m */
    private int f152310m = -1;

    /* renamed from: n */
    private int f152311n = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnCheckedListener;", "", "onChecked", "", "checked", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$a */
    public interface OnCheckedListener {
        /* renamed from: a */
        void mo208650a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;", "", "onJump", "", "url", "", "sendJumpEvent", "eventName", "actionName", "envID", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$b */
    public interface OnJumpListener {
        /* renamed from: a */
        void mo208651a(String str);

        /* renamed from: a */
        void mo208652a(String str, String str2, String str3);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.vc_lkui_dialog_default_content_checkbox_style_layout;
    }

    /* renamed from: a */
    public String mo208644a() {
        return this.f152302e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$onCreateContent$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC60845c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ TextView f152312a;

        public boolean onPreDraw() {
            if (this.f152312a.getLineCount() > 2) {
                this.f152312a.setGravity(8388611);
            }
            this.f152312a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        ViewTreeObserver$OnPreDrawListenerC60845c(TextView textView) {
            this.f152312a = textView;
        }
    }

    /* renamed from: b */
    private final boolean m236527b() {
        return !TextUtils.isEmpty(this.f152303f);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        View onCreateFooter = super.onCreateFooter();
        if (onCreateFooter == null) {
            return null;
        }
        View findViewById = onCreateFooter.findViewById(R.id.ud_dialog_btn_primary);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "footerContainer.findView…id.ud_dialog_btn_primary)");
        TextView textView = (TextView) findViewById;
        mo208645a(onCreateFooter);
        if (this.f152305h && textView != null) {
            mo208648a(textView, this.f152300c);
            this.f152299b = new C60846d(this, textView);
        }
        return onCreateFooter;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View finalView = getFinalView(getMContentLayout(), getMContentLayoutRes(), getDefaultContentRes());
        if (finalView == null) {
            return null;
        }
        View findViewById = finalView.findViewById(R.id.lkui_dialog_content_message_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById…ialog_content_message_tv)");
        TextView textView = (TextView) findViewById;
        mo208646a(textView);
        textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC60845c(textView));
        View findViewById2 = finalView.findViewById(R.id.lkui_dialog_checkbox);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(id.lkui_dialog_checkbox)");
        UDCheckBox uDCheckBox = (UDCheckBox) findViewById2;
        if (m236527b()) {
            View findViewById3 = finalView.findViewById(R.id.lkui_dialog_checkbox_hint);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById…kui_dialog_checkbox_hint)");
            View findViewById4 = finalView.findViewById(R.id.lkui_dialog_checkbox_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById…i_dialog_checkbox_layout)");
            m236525b((TextView) findViewById3);
            m236524a(uDCheckBox);
            setupViewPadding((LinearLayout) findViewById4, this.f152307j, this.f152308k, this.f152309l, this.f152310m);
        }
        return finalView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$onCreateFooter$1", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnCheckedListener;", "onChecked", "", "checked", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$d */
    public static final class C60846d implements OnCheckedListener {

        /* renamed from: a */
        final /* synthetic */ LKUICheckBoxDialogController f152313a;

        /* renamed from: b */
        final /* synthetic */ TextView f152314b;

        @Override // com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.OnCheckedListener
        /* renamed from: a */
        public void mo208650a(boolean z) {
            this.f152313a.mo208648a(this.f152314b, z);
        }

        C60846d(LKUICheckBoxDialogController bVar, TextView textView) {
            this.f152313a = bVar;
            this.f152314b = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$setMsgWithUrl$listener$1", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;", "onJump", "", "url", "", "sendJumpEvent", "eventName", "actionName", "envID", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$e */
    public static final class C60847e implements OnJumpListener {

        /* renamed from: a */
        final /* synthetic */ LKUICheckBoxDialogController f152315a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60847e(LKUICheckBoxDialogController bVar) {
            this.f152315a = bVar;
        }

        @Override // com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.OnJumpListener
        /* renamed from: a */
        public void mo208651a(String str) {
            if (C28460b.m104296a(LKUICheckBoxDialogController.m236523a(this.f152315a))) {
                try {
                    LKUICheckBoxDialogController.m236523a(this.f152315a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception unused) {
                    C60700b.m235864f(this.f152315a.mo208644a(), "[setMsgWithUrl]", "[Error]start jump activity error");
                }
            } else if (LKUICheckBoxDialogController.m236523a(this.f152315a) instanceof Activity) {
                Context a = LKUICheckBoxDialogController.m236523a(this.f152315a);
                AbstractC60907u larkAppDependency = VideoChatModuleDependency.getLarkAppDependency();
                Intrinsics.checkExpressionValueIsNotNull(larkAppDependency, "VideoChatModuleDependency.getLarkAppDependency()");
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", larkAppDependency.mo196409b());
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…Dependency().larkAppName)");
                Configuration configuration = LKUICheckBoxDialogController.m236523a(this.f152315a).getResources().getConfiguration();
                Intrinsics.checkExpressionValueIsNotNull(configuration, "mContext.getResources().getConfiguration()");
                VCDialogUtils.m236160a(a, (int) R.string.View_N_FloatingWindowPermission, 1, mustacheFormat, (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(configuration));
            }
        }

        @Override // com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.OnJumpListener
        /* renamed from: a */
        public void mo208652a(String str, String str2, String str3) {
            C63750bm.m250193a(str, str2, str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$setupCheckBox$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$g */
    public static final class C60849g implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ LKUICheckBoxDialogController f152318a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60849g(LKUICheckBoxDialogController bVar) {
            this.f152318a = bVar;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            this.f152318a.f152300c = z;
            OnCheckedListener aVar = this.f152318a.f152299b;
            if (aVar != null) {
                aVar.mo208650a(z);
            }
            UDCheckBox.OnCheckedChangeListener gVar = this.f152318a.f152298a;
            if (gVar != null) {
                gVar.onCheckedChanged(uDCheckBox, z);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m236523a(LKUICheckBoxDialogController bVar) {
        Context context = bVar.f152301d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    /* renamed from: b */
    private final void m236525b(TextView textView) {
        if (textView != null) {
            textView.setText(this.f152303f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$setOnCheckedListener$1", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnCheckedListener;", "onChecked", "", "checked", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.b.b$f */
    public static final class C60848f implements OnCheckedListener {

        /* renamed from: a */
        final /* synthetic */ LKUICheckBoxDialogController f152316a;

        /* renamed from: b */
        final /* synthetic */ View f152317b;

        @Override // com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.OnCheckedListener
        /* renamed from: a */
        public void mo208650a(boolean z) {
            LKUICheckBoxDialogController bVar = this.f152316a;
            View findViewById = this.f152317b.findViewById(R.id.ud_dialog_btn_primary);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "footerContainer.findView…id.ud_dialog_btn_primary)");
            bVar.mo208649a(z, (TextView) findViewById);
        }

        C60848f(LKUICheckBoxDialogController bVar, View view) {
            this.f152316a = bVar;
            this.f152317b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUICheckBoxDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m236524a(UDCheckBox uDCheckBox) {
        if (uDCheckBox != null) {
            uDCheckBox.setChecked(this.f152300c);
            uDCheckBox.setOnCheckedChangeListener(new C60849g(this));
        }
    }

    /* renamed from: a */
    public final void mo208645a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "footerContainer");
        if (this.f152305h) {
            this.f152299b = new C60848f(this, view);
        }
    }

    /* renamed from: a */
    public final void mo208646a(TextView textView) {
        List<String> list;
        Intrinsics.checkParameterIsNotNull(textView, "messageTV");
        C60847e eVar = new C60847e(this);
        MsgWithUrlInfo bVar = this.f152304g;
        if (bVar != null) {
            list = bVar.mo209956b();
        } else {
            list = null;
        }
        if (list != null && list.size() == 2) {
            mo208647a(textView, this.f152304g, eVar);
        } else if (list != null && list.size() == 1) {
            m236526b(textView, this.f152304g, eVar);
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60843a.C60844a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C60843a.C60844a aVar = (C60843a.C60844a) uDBaseDialogBuilder;
            this.f152303f = aVar.f152285a;
            this.f152304g = aVar.f152286b;
            this.f152298a = aVar.f152288d;
            this.f152305h = aVar.f152289e;
            this.f152299b = aVar.f152290f;
            this.f152300c = aVar.f152291g;
            String str = aVar.f152292h;
            Intrinsics.checkExpressionValueIsNotNull(str, "builder.envId");
            this.f152306i = str;
            this.f152307j = aVar.f152293i;
            this.f152309l = aVar.f152295k;
            this.f152310m = aVar.f152296l;
            this.f152308k = aVar.f152294j;
            Context context = aVar.f152287c;
            Intrinsics.checkExpressionValueIsNotNull(context, "builder.mContext");
            this.f152301d = context;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDUICheckBoxDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }

    /* renamed from: a */
    public final void mo208648a(TextView textView, boolean z) {
        textView.setEnabled(z);
        if (z) {
            textView.setTextColor(C60773o.m236126d(R.color.ud_B500));
        } else {
            textView.setTextColor(C60773o.m236126d(R.color.ud_N500));
        }
    }

    /* renamed from: a */
    public final void mo208649a(boolean z, TextView textView) {
        int i;
        Intrinsics.checkParameterIsNotNull(textView, "right");
        textView.setEnabled(z);
        if (z) {
            i = R.color.primary_pri_500;
        } else {
            i = R.color.text_disable;
        }
        textView.setTextColor(C60773o.m236126d(i));
    }

    /* renamed from: b */
    private final void m236526b(TextView textView, MsgWithUrlInfo bVar, OnJumpListener bVar2) {
        String str;
        List<String> b;
        String str2 = null;
        if (bVar == null || (b = bVar.mo209956b()) == null) {
            str = null;
        } else {
            str = b.get(0);
        }
        if (bVar != null) {
            str2 = bVar.mo209955a();
        }
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(str2);
        if (str2 != null) {
            String str3 = str2;
            int i = 0;
            int i2 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                String substring = str2.substring(matcher.start() + 2, matcher.end() - 2);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Intrinsics.checkExpressionValueIsNotNull(group, "placeholder");
                String replace$default = StringsKt.replace$default(str2, group, substring, false, 4, (Object) null);
                i = matcher.start();
                i2 = i + substring.length();
                str3 = replace$default;
            }
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new MyClickableSpan(str, bVar.mo209957c(), bVar.mo209958d(), this.f152306i, bVar2), i, i2, 33);
            textView.setText(spannableString);
            int i3 = this.f152311n;
            if (i3 != -1) {
                textView.setTextColor(C60773o.m236126d(i3));
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0175  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo208647a(android.widget.TextView r29, com.ss.android.vc.entity.livestream.MsgWithUrlInfo r30, com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.OnJumpListener r31) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController.mo208647a(android.widget.TextView, com.ss.android.vc.entity.livestream.b, com.ss.android.vc.common.widget.b.b$b):void");
    }
}
