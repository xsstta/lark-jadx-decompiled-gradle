package com.ss.android.lark.fcm_download.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.fcm_download.manage.FCMDialogState;
import com.ss.android.lark.fcm_download.manage.FCMDialogStateManager;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0007J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/fcm_download/utils/FCMDownloadUtils;", "", "()V", "FEATURE_KEY_FCM_PLUGIN", "", "PACKAGE_NAME_GMS", "PACKAGE_NAME_VENDING", "PLUGIN_PACKAGE_NAME_FCM", "TAG", "hasGoogleSupport", "", "context", "Landroid/content/Context;", "installFCMPlugin", "", "isFCMPluginInstalled", "isInstalledApp", "packageName", "isUseFCMPlugin", "showRequestPermissionDialog", "activity", "Landroid/app/Activity;", "callback", "Lcom/ss/android/lark/fcm_download/utils/DialogDismissCallback;", "showWarningDialog", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.b.b */
public final class FCMDownloadUtils {

    /* renamed from: a */
    public static final FCMDownloadUtils f95615a = new FCMDownloadUtils();

    private FCMDownloadUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m146623a() {
        return C37239a.m146648b().mo136951a("lark.android.fcm.plugin");
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m146625b() {
        return MiraModule.f130883a.mo180981c("com.ss.android.lark.plugin.fcm");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m146626c() {
        MiraModule.f130883a.mo180977a("com.ss.android.lark.plugin.fcm", new NullPluginInstallCallback());
    }

    /* renamed from: a */
    public final boolean mo136922a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!m146624a(context, "com.android.vending") || !m146624a(context, "com.google.android.gms")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.b.b$c */
    public static final class DialogInterface$OnClickListenerC37233c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogDismissCallback f95619a;

        DialogInterface$OnClickListenerC37233c(DialogDismissCallback aVar) {
            this.f95619a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f95619a.mo136919a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.b.b$a */
    static final class DialogInterface$OnClickListenerC37231a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f95616a;

        /* renamed from: b */
        final /* synthetic */ DialogDismissCallback f95617b;

        DialogInterface$OnClickListenerC37231a(Activity activity, DialogDismissCallback aVar) {
            this.f95616a = activity;
            this.f95617b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m165389i("FCMDownloadUtils", "reject to download fcm plugin");
            FCMDialogStateManager.m146631a(FCMDialogState.REJECT);
            FCMDownloadUtils.f95615a.mo136921a((Context) this.f95616a, this.f95617b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.b.b$b */
    static final class DialogInterface$OnClickListenerC37232b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogDismissCallback f95618a;

        DialogInterface$OnClickListenerC37232b(DialogDismissCallback aVar) {
            this.f95618a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m165389i("FCMDownloadUtils", "agree to download fcm plugin");
            FCMDialogStateManager.m146631a(FCMDialogState.AGREE);
            FCMDownloadUtils.m146626c();
            this.f95618a.mo136919a();
        }
    }

    /* renamed from: a */
    private final boolean m146624a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.m165383e("FCMDownloadUtils", e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo136920a(Activity activity, DialogDismissCallback aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (!activity.hasWindowFocus()) {
            Log.m165383e("FCMDownloadUtils", "activity has not window focus, some dialog is showing, don't show request dialog");
            aVar.mo136919a();
            return;
        }
        Log.m165389i("FCMDownloadUtils", "showRequestPermissionDialog");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).message(R.string.Lark_Core_GooglePlayDevice)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Core_GooglePlayDeviceRefuse, new DialogInterface$OnClickListenerC37231a(activity, aVar))).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Core_GooglePlayDeviceConfirm, new DialogInterface$OnClickListenerC37232b(aVar))).cancelable(false)).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: a */
    public final void mo136921a(Context context, DialogDismissCallback aVar) {
        Log.m165389i("FCMDownloadUtils", "showWarningDialog");
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Core_GooglePlayDeviceNotification);
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(mustacheFormat)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Core_GooglePlayDeviceGotIt, new DialogInterface$OnClickListenerC37233c(aVar))).cancelable(false)).cancelOnTouchOutside(false)).show();
    }
}
