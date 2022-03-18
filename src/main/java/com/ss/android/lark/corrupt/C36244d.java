package com.ss.android.lark.corrupt;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Process;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.corrupt.C36241c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.corrupt.d */
public class C36244d {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.corrupt.d$a */
    public static class C36245a {

        /* renamed from: a */
        public static final C36244d f93528a = new C36244d();
    }

    /* renamed from: b */
    public static C36244d m142733b() {
        return C36245a.f93528a;
    }

    /* renamed from: a */
    public void mo133687a() {
        C36241c.m142725a().mo133686a(new C36241c.AbstractC36243b() {
            /* class com.ss.android.lark.corrupt.$$Lambda$d$h8ouuxWjOLmQA9oZd9pEwEtHYag */

            @Override // com.ss.android.lark.corrupt.C36241c.AbstractC36243b
            public final void onUpdate(Reason reason) {
                C36244d.this.m142732a(reason);
            }
        });
    }

    /* renamed from: c */
    private void m142735c() {
        Activity b = C36239a.m142718a().mo133153b();
        if (b == null) {
            Log.m165389i("DataCorruptService", "doOnDBCorrupt called. topActivity is null");
            return;
        }
        new C25639g(b).mo89248g(R.string.Lark_Legacy_DBDamage).mo89254m(R.string.Lark_Legacy_DBDamageRestart).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_DBDamageRestartLater, $$Lambda$d$msI22oIHeIFcVMSv5EhqQTBp2O4.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_DBDamageRestartNow, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.corrupt.$$Lambda$d$FLjPNutrr3LkaXpI3Heijn4llEE */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C36244d.this.m142731a(dialogInterface, i);
            }
        }).mo89239c();
        DataCorruptHitPoint.f93525a.mo133684a();
    }

    /* renamed from: d */
    private void m142736d() {
        Context a = C36239a.m142718a().mo133152a();
        if (a == null) {
            Log.m165389i("DataCorruptPush", "killAppProcess called. LarkContext is null");
            return;
        }
        Context applicationContext = a.getApplicationContext();
        if (applicationContext == null) {
            Log.m165389i("DataCorruptPush", "killAppProcess called. Context is null");
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) applicationContext.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m142732a(Reason reason) {
        if (reason.isDbCorrupt()) {
            m142735c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m142731a(DialogInterface dialogInterface, int i) {
        DataCorruptHitPoint.f93525a.mo133685a(1);
        dialogInterface.dismiss();
        m142736d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m142734b(DialogInterface dialogInterface, int i) {
        DataCorruptHitPoint.f93525a.mo133685a(0);
        dialogInterface.dismiss();
    }
}
