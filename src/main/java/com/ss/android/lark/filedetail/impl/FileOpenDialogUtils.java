package com.ss.android.lark.filedetail.impl;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/FileOpenDialogUtils;", "", "()V", "showResourceDeletedByAdminDialog", "", "context", "Landroid/content/Context;", "isDeleted", "", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.b */
public final class FileOpenDialogUtils {

    /* renamed from: a */
    public static final FileOpenDialogUtils f98031a = new FileOpenDialogUtils();

    private FileOpenDialogUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150338a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m150339a(context, z, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150339a(Context context, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        String a = C57582a.m223604a(context, (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogTitle);
        Intrinsics.checkExpressionValueIsNotNull(a, "UiUtils.getString(contex…tFileNotFoundDialogTitle)");
        if (z) {
            str = C57582a.m223604a(context, (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogOver90Days);
            Intrinsics.checkExpressionValueIsNotNull(str, "UiUtils.getString(contex…NotFoundDialogOver90Days)");
        } else {
            str = C57582a.m223604a(context, (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogWithin90Days);
            Intrinsics.checkExpressionValueIsNotNull(str, "UiUtils.getString(contex…tFoundDialogWithin90Days)");
        }
        new C25639g(context).mo89237b(a).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, (DialogInterface.OnClickListener) null).mo89227a(onDismissListener).mo89233b().show();
    }
}
