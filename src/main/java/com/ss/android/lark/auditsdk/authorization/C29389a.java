package com.ss.android.lark.auditsdk.authorization;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.auditsdk.authorization.a */
public class C29389a {
    /* renamed from: a */
    public static String m108034a() {
        return UIHelper.getString(R.string.Lark_Contacts_CantCompleteOperationNoExternalCommunicationPermission);
    }

    /* renamed from: b */
    public static String m108040b() {
        return m108036a(UIHelper.getString(R.string.Lark_Audit_BlockedActionUpload));
    }

    /* renamed from: a */
    public static String m108035a(int i) {
        if (i == 0) {
            return "";
        }
        return m108036a(UIHelper.getString(i));
    }

    /* renamed from: a */
    private static String m108036a(String str) {
        return UIHelper.mustacheFormat((int) R.string.Lark_Audit_BlockedActionsDueToPermissionSettings, "BlockedAction", str);
    }

    /* renamed from: a */
    public static void m108037a(final Context context, final int i) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.auditsdk.authorization.C29389a.RunnableC293923 */

            public void run() {
                LKUIToast.show(context, UIHelper.mustacheFormat((int) R.string.Lark_Audit_BlockedActionsDueToPermissionSettings, "BlockedAction", UIHelper.getString(i)));
            }
        });
    }

    /* renamed from: b */
    public static void m108041b(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        C25639g a = new C25639g(context).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Group_RevokeIKnow, (DialogInterface.OnClickListener) null).mo89227a(onDismissListener);
        if (context instanceof Application) {
            a.mo89244d();
        } else {
            a.mo89239c();
        }
    }

    /* renamed from: a */
    public static void m108038a(final Context context, final int i, final DialogInterface.OnDismissListener onDismissListener) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.auditsdk.authorization.C29389a.RunnableC293901 */

            public void run() {
                C29389a.m108041b(context, C29389a.m108035a(i), onDismissListener);
            }
        });
    }

    /* renamed from: a */
    public static void m108039a(final Context context, final String str, final DialogInterface.OnDismissListener onDismissListener) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.auditsdk.authorization.C29389a.RunnableC293912 */

            public void run() {
                String str = str;
                if (str == null) {
                    Log.m165383e("AuditUtils", "onCheckedAuthorizationFailed, displayMsg is null");
                } else {
                    C29389a.m108041b(context, str, onDismissListener);
                }
            }
        });
    }
}
