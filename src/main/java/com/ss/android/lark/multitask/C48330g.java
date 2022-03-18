package com.ss.android.lark.multitask;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.task.Task;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.multitask.g */
public class C48330g {

    /* renamed from: a */
    final Context f121708a;

    C48330g(Context context) {
        this.f121708a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo169040a(Task task, final Callable<?> callable) {
        new C25639g(this.f121708a).mo89248g(R.string.Lark_Core_FloatingLimitDesc).mo89224a(R.id.lkui_dialog_btn_center, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.multitask.C48330g.DialogInterface$OnClickListenerC483311 */

            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    callable.call();
                } catch (Exception unused) {
                }
            }
        }).mo89239c();
    }
}
