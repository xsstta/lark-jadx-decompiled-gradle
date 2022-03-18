package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.widget.dialog.UDBottomLoadingDialogController;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007JF\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007JP\u0010\u0011\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007JP\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J*\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J9\u0010\u001e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010 \u001a\u00020\u001b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/UDDialogUtils;", "", "()V", "DIALOG_CONTENT_TEXT_SIZE_17", "", "generateSingleButtonDialog", "Lcom/ss/android/lark/passport/infra/util/UDDialogUtils$DialogWrapper;", "context", "Landroid/content/Context;", "message", "", "btnText", "title", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "onKeyListener", "Landroid/content/DialogInterface$OnKeyListener;", "generateWhiteNormalDialog", "btnPositiveText", "btnNegativeText", "onPositiveClickListener", "onNegativeClickListener", "generateWhiteNormalDialogAutoVertical", "isContextValidForDlg", "", "isTextViewWrapped", "textSizeSp", "", "text", "layoutWidth", "showBottomLoadingDialog", "loadingMsg", "dimAmount", "cancelable", "(Landroid/content/Context;Ljava/lang/String;FLjava/lang/Boolean;)Lcom/ss/android/lark/passport/infra/util/UDDialogUtils$DialogWrapper;", "wrapUDDialogText", "string", "DialogWrapper", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.ae */
public final class UDDialogUtils {

    /* renamed from: a */
    public static final UDDialogUtils f123426a = new UDDialogUtils();

    @JvmStatic
    /* renamed from: a */
    public static final DialogWrapper m193815a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        return m193817a(context, str, str2, str3, onClickListener, null, 32, null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final DialogWrapper m193821b(Context context) {
        return m193813a(context, (String) null, (float) BitmapDescriptorFactory.HUE_RED, (Boolean) null, 14, (Object) null);
    }

    private UDDialogUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m193820a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return !activity.isFinishing() && !activity.isDestroyed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/UDDialogUtils$DialogWrapper;", "", "dialog", "Landroid/app/Dialog;", "(Landroid/app/Dialog;)V", "cancel", "", "dismiss", "hide", "isShowing", "", "setCancelable", "cancelable", "show", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.ae$a */
    public static final class DialogWrapper {

        /* renamed from: a */
        private final Dialog f123427a;

        public DialogWrapper() {
            this(null, 1, null);
        }

        /* renamed from: a */
        public final void mo171632a() {
            Dialog dialog = this.f123427a;
            if (dialog != null) {
                dialog.show();
            }
        }

        /* renamed from: b */
        public final void mo171634b() {
            Dialog dialog = this.f123427a;
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        /* renamed from: c */
        public final boolean mo171635c() {
            Dialog dialog = this.f123427a;
            if (dialog != null) {
                return dialog.isShowing();
            }
            return false;
        }

        public DialogWrapper(Dialog dialog) {
            this.f123427a = dialog;
        }

        /* renamed from: a */
        public final void mo171633a(boolean z) {
            Dialog dialog = this.f123427a;
            if (dialog != null) {
                dialog.setCancelable(z);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DialogWrapper(Dialog dialog, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dialog);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193819a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.ae$b */
    public static final class DialogInterface$OnClickListenerC49150b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f123428a;

        DialogInterface$OnClickListenerC49150b(DialogInterface.OnClickListener onClickListener) {
            this.f123428a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            DialogInterface.OnClickListener onClickListener = this.f123428a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.ae$c */
    public static final class DialogInterface$OnClickListenerC49151c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f123429a;

        DialogInterface$OnClickListenerC49151c(DialogInterface.OnClickListener onClickListener) {
            this.f123429a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            DialogInterface.OnClickListener onClickListener = this.f123429a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.ae$d */
    public static final class DialogInterface$OnClickListenerC49152d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f123430a;

        DialogInterface$OnClickListenerC49152d(DialogInterface.OnClickListener onClickListener) {
            this.f123430a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            DialogInterface.OnClickListener onClickListener = this.f123430a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogWrapper m193814a(Context context, String str, String str2) {
        return m193817a(context, "", str, str2, null, null, 32, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogWrapper m193812a(Context context, String str, float f, Boolean bool) {
        UDDialog uDDialog;
        boolean z;
        if (context == null) {
            uDDialog = null;
        } else {
            UDDialogBuilder eVar = (UDDialogBuilder) new UDDialogBuilder(context).controller(new UDBottomLoadingDialogController(context));
            if (str == null) {
                str = "";
            }
            UDDialogBuilder eVar2 = (UDDialogBuilder) eVar.message(str);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            uDDialog = ((UDDialogBuilder) ((UDDialogBuilder) eVar2.cancelable(z)).maskAlpha(f)).show();
        }
        return new DialogWrapper(uDDialog);
    }

    /* renamed from: a */
    public static /* synthetic */ DialogWrapper m193813a(Context context, String str, float f, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 8) != 0) {
            bool = true;
        }
        return m193812a(context, str, f, bool);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogWrapper m193816a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnKeyListener onKeyListener) {
        String str4;
        String str5;
        String str6;
        if (!m193820a(context)) {
            PassportLog.f123351c.mo171474a().mo171471d("UDDialogUtils", "generateSingleButtonDialog context is non-valid");
            return new DialogWrapper(null, 1, null);
        }
        if (context == null) {
            Intrinsics.throwNpe();
        }
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        if (str != null) {
            str4 = str;
        }
        UDDialogBuilder eVar2 = (UDDialogBuilder) eVar.title(str4);
        if (str2 != null) {
            str5 = str2;
        }
        UDDialogBuilder eVar3 = (UDDialogBuilder) eVar2.message(str5);
        if (str3 != null) {
            str6 = str3;
        } else {
            String a = C49154ag.m193830a(context, (int) R.string.Lark_Legacy_Confirm);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIUtils.getString(contex…ring.Lark_Legacy_Confirm)");
            str6 = a;
        }
        UDDialog build = ((UDDialogBuilder) eVar3.addActionButton(R.id.ud_dialog_btn_primary, str6, new DialogInterface$OnClickListenerC49150b(onClickListener))).build();
        if (onKeyListener != null) {
            build.setOnKeyListener(onKeyListener);
        }
        build.show();
        return new DialogWrapper(build);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogWrapper m193818a(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        String str5;
        String str6;
        String str7;
        if (context == null) {
            return new DialogWrapper(null, 1, null);
        }
        if (!m193820a(context)) {
            PassportLog.f123351c.mo171474a().mo171471d("UDDialogUtils", "generateWhiteNormalDialog context is non-valid");
            return new DialogWrapper(null, 1, null);
        }
        UDBaseDialogBuilder.ActionBottomOrientation actionBottomOrientation = UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL;
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        if (str != null) {
            str5 = str;
        }
        UDDialogBuilder eVar2 = (UDDialogBuilder) eVar.title(str5);
        if (str2 != null) {
            str6 = str2;
        }
        UDDialogBuilder eVar3 = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar2.message(str6)).titleBold(true)).autoDismiss(true);
        if (str3 == null) {
            str3 = C49154ag.m193830a(context, (int) R.string.Lark_Legacy_Confirm);
            Intrinsics.checkExpressionValueIsNotNull(str3, "UIUtils.getString(contex…ring.Lark_Legacy_Confirm)");
        }
        UDDialogBuilder eVar4 = (UDDialogBuilder) eVar3.addActionButton(R.id.ud_dialog_btn_primary, str3, new DialogInterface$OnClickListenerC49151c(onClickListener));
        if (str4 != null) {
            str7 = str4;
        } else {
            String a = C49154ag.m193830a(context, (int) R.string.Lark_Legacy_Cancel);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIUtils.getString(contex…tring.Lark_Legacy_Cancel)");
            str7 = a;
        }
        UDDialog build = ((UDDialogBuilder) ((UDDialogBuilder) eVar4.addActionButton(R.id.ud_dialog_btn_secondary, str7, new DialogInterface$OnClickListenerC49152d(onClickListener2))).actionButtonOrientation(actionBottomOrientation)).build();
        Window window = build.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        build.show();
        return new DialogWrapper(build);
    }

    /* renamed from: a */
    public static /* synthetic */ DialogWrapper m193817a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnKeyListener onKeyListener, int i, Object obj) {
        if ((i & 32) != 0) {
            onKeyListener = null;
        }
        return m193816a(context, str, str2, str3, onClickListener, onKeyListener);
    }
}
