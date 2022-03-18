package com.bytedance.ee.bear.middleground.permission.util;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/util/PermissionUtils;", "", "()V", "NONE", "", "showRemoveCollaboratorDialog", "", "context", "Landroid/content/Context;", "bodyRes", "onRemoveClickListener", "Landroid/content/DialogInterface$OnClickListener;", "titleRes", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.g.b */
public final class PermissionUtils {

    /* renamed from: a */
    public static final PermissionUtils f26827a = new PermissionUtils();

    private PermissionUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41302a(Context context, int i, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m41301a(context, -1, i, onClickListener);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41301a(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        BearUDDialogBuilder g = new BearUDDialogBuilder(context).mo45363d(true).mo45343a(260.0f).mo45366g(0);
        if (i != -1) {
            String string = context.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(titleRes)");
            g.mo45353a(string);
        }
        if (i2 != -1) {
            String string2 = context.getString(i2);
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(bodyRes)");
            g.mo45357b(string2).mo45360c(17);
        }
        g.mo45352a(new BearUDDialogBuilder.ActionBuilder().mo45369a(R.id.ud_dialog_btn_primary).mo45372b(R.string.Doc_Share_RemovePermissionButton).mo45373c(R.color.function_danger_500).mo45370a(onClickListener)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
    }
}
