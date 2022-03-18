package com.tt.miniapp.p3323q;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.data.ContextSingletonInstance;

/* renamed from: com.tt.miniapp.q.e */
public class C66681e extends AbstractC66676a {

    /* renamed from: c */
    private IAppContext f168338c;

    /* renamed from: com.tt.miniapp.q.e$a */
    public static class C66682a {

        /* renamed from: a */
        public long f168339a;
    }

    /* renamed from: c */
    public static long m260431c() {
        return ContextSingletonInstance.getInstance().memoryDataInstance.f168339a;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3323q.AbstractC66676a
    /* renamed from: b */
    public void mo232429b() {
        if (!this.f168338c.isDestroying() && !this.f168338c.isDestroyed()) {
            m260432d();
        }
    }

    /* renamed from: d */
    private void m260432d() {
        ActivityManager activityManager;
        Debug.MemoryInfo[] processMemoryInfo;
        Activity currentActivity = this.f168338c.getCurrentActivity();
        if (currentActivity != null && (activityManager = (ActivityManager) currentActivity.getSystemService("activity")) != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
            Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
            C66682a aVar = ContextSingletonInstance.getInstance().memoryDataInstance;
            if (aVar.f168339a == 0) {
                aVar.f168339a = ((long) activityManager.getMemoryClass()) * 1024;
            }
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f168338c);
            if (inst != null) {
                C66689h.m260453a(inst.getForeBackgroundManager().mo231961c(), memoryInfo, this.f168338c);
            }
        }
    }

    public C66681e(IAppContext iAppContext) {
        super(10000);
        this.f168338c = iAppContext;
    }
}
