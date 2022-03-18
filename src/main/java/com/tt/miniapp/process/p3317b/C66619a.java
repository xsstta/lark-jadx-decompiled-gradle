package com.tt.miniapp.process.p3317b;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67564a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.tt.miniapp.process.b.a */
public class C66619a implements AbstractC67564a {

    /* renamed from: a */
    private SparseArray<AbstractC67565b> f168195a = new SparseArray<>();

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public synchronized void mo232256a(AbstractC67565b bVar) {
        this.f168195a.put(bVar.mo234709b(), bVar);
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public synchronized void mo232254a(int i) {
        if (i == 0) {
            DebugUtil.outputError("IpcCallbackManagerImpl", "unregisterIpcCallback invalid callbackId");
            return;
        }
        this.f168195a.delete(i);
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public synchronized void mo232257a(String str) {
        for (int size = this.f168195a.size() - 1; size >= 0; size--) {
            AbstractC67565b valueAt = this.f168195a.valueAt(size);
            if (valueAt != null && TextUtils.equals(valueAt.mo234710c(), str)) {
                this.f168195a.removeAt(size);
                valueAt.mo48979a();
            }
        }
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public void mo232255a(int i, final CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        final AbstractC67565b bVar;
        if (i == 0) {
            DebugUtil.outputError("IpcCallbackManagerImpl", "handleIpcCallBack invalid callbackId");
            return;
        }
        synchronized (this) {
            bVar = this.f168195a.get(i);
            if (z && bVar != null) {
                mo232254a(i);
            }
        }
        if (bVar == null) {
            return;
        }
        if (bVar.mo234712e()) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.process.p3317b.C66619a.RunnableC666201 */

                public void run() {
                    bVar.mo48980a(crossProcessDataEntity);
                }
            });
        } else {
            bVar.mo48980a(crossProcessDataEntity);
        }
    }
}
