package com.lynx.tasm.behavior.p1223c.p1224a;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.p1223c.AbstractC26656j;
import com.lynx.tasm.p1216a.C26545a;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.lynx.tasm.behavior.c.a.d */
public class C26644d extends C26640c {
    public C26644d(C26690o oVar) {
        super(oVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: a */
    public void mo94617a(int i, String str, C26697s sVar, Map<String, C26545a> map, boolean z) {
        final Future<Runnable> b = this.f65939a.mo94743b(i, str, sVar, map, z);
        this.f65941b.add(new AbstractC26656j(-1) {
            /* class com.lynx.tasm.behavior.p1223c.p1224a.C26644d.C266451 */

            /* access modifiers changed from: protected */
            @Override // com.lynx.tasm.behavior.p1223c.AbstractC26656j
            /* renamed from: a */
            public void mo94608a(C26690o oVar) {
                Runnable runnable;
                try {
                    runnable = (Runnable) b.get(100, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    LLog.m96429e("UIOperationQueueAsyncRender", "createViewAsync failed, error:" + e);
                    C26644d.this.f65939a.mo94761j().mo94207a(e);
                    runnable = null;
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }
}
