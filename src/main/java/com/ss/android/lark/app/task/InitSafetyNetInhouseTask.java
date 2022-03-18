package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Process;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.p2503t.p2504a.C52004a;
import com.ss.android.lark.utils.ApiUtils;

public class InitSafetyNetInhouseTask extends AsyncLaunchTask {

    /* renamed from: a */
    private static boolean f72632a;

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            m106267b(context);
        } else {
            C28513a.m104512a(new C28513a.AbstractC28514a(context) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitSafetyNetInhouseTask$0eeSBXIZeIgnZj90G2Xms2AKLM */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                public final void onLoginStatusChanged(int i) {
                    InitSafetyNetInhouseTask.m270256lambda$0eeSBXIZeIgnZj90G2Xms2AKLM(InitSafetyNetInhouseTask.this, this.f$1, i);
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (com.larksuite.framework.utils.C26284k.m95186b(r3) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        m106268c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        com.ss.android.lark.platform.p2503t.p2504a.C52004a.m201775a().mo181669c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        com.ss.android.lark.platform.p2503t.p2504a.C52004a.m201775a().mo181668b();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m106267b(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.Class<com.ss.android.lark.app.task.InitSafetyNetInhouseTask> r0 = com.ss.android.lark.app.task.InitSafetyNetInhouseTask.class
            monitor-enter(r0)
            boolean r1 = com.ss.android.lark.app.task.InitSafetyNetInhouseTask.f72632a     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 1
            com.ss.android.lark.app.task.InitSafetyNetInhouseTask.f72632a = r1     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            com.ss.android.lark.safetynet.inhouse.a r0 = com.ss.android.lark.platform.p2503t.p2504a.C52004a.m201775a()
            r0.mo181668b()
            boolean r0 = com.larksuite.framework.utils.C26284k.m95186b(r3)
            if (r0 != 0) goto L_0x001d
            r2.m106268c(r3)
        L_0x001d:
            com.ss.android.lark.safetynet.inhouse.a r3 = com.ss.android.lark.platform.p2503t.p2504a.C52004a.m201775a()
            r3.mo181669c()
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.app.task.InitSafetyNetInhouseTask.m106267b(android.content.Context):void");
    }

    /* renamed from: c */
    private void m106268c(final Context context) {
        if (!C52004a.m201775a().mo181670d()) {
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.app.task.InitSafetyNetInhouseTask.RunnableC289711 */

                public void run() {
                    Context context = context;
                    LKUIToast.show(context, context.getString(R.string.Lark_Legacy_InvalidateApkTips));
                    Log.m165382e("try to kill process 4");
                }
            });
            CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
                /* class com.ss.android.lark.app.task.InitSafetyNetInhouseTask.RunnableC289722 */

                public void run() {
                    Process.killProcess(Process.myPid());
                }
            }, 3000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m106266a(Context context, int i) {
        if (i != 0) {
            m106267b(context);
        }
    }
}
