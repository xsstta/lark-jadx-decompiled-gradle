package com.tt.miniapp.process;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface;
import com.tt.miniapphost.util.DebugUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.process.b */
public class C66615b {

    /* renamed from: a */
    public volatile boolean f168186a;

    /* renamed from: b */
    public boolean f168187b;

    /* renamed from: c */
    public volatile IMiniApp2HostBinderInterface f168188c;

    /* renamed from: d */
    public final Object f168189d = new Object();

    /* renamed from: e */
    public final ServiceConnection f168190e = new ServiceConnection() {
        /* class com.tt.miniapp.process.C66615b.ServiceConnectionC666161 */

        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void onNullBinding(ComponentName componentName) {
            synchronized (C66615b.this.f168189d) {
                AppbrandContext.getInst().getApplicationContext().unbindService(C66615b.this.f168190e);
                C66615b.this.f168187b = false;
                C66615b.this.f168189d.notifyAll();
            }
            AppBrandLogger.m52829e("ServiceBindManager", "onNullBinding");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str;
            AppBrandLogger.m52830i("ServiceBindManager", "iBinder", iBinder);
            try {
                str = iBinder.getInterfaceDescriptor();
            } catch (Exception e) {
                AppBrandLogger.m52829e("ServiceBindManager", "getInterfaceDescriptor", e);
                str = null;
            }
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, "com.tt.miniapphost.process.base.EmptyBinder")) {
                DebugUtil.outputError("ServiceBindManager", "绑定了空 Binder interfaceDescriptor:", str);
                onNullBinding(componentName);
                return;
            }
            synchronized (C66615b.this.f168189d) {
                C66615b.this.f168188c = IMiniApp2HostBinderInterface.Stub.asInterface(iBinder);
                C66615b.this.f168187b = false;
                C66615b.this.f168189d.notifyAll();
            }
            try {
                if (C66615b.this.f168188c == null) {
                    DebugUtil.outputError("ServiceBindManager", "onServiceConnected mHostCrossProcessCall == null. iBinder:" + iBinder);
                    return;
                }
                C66615b.this.f168188c.asBinder().linkToDeath(C66615b.this.f168191f, 0);
                C66615b bVar = C66615b.this;
                bVar.mo232245a(bVar.f168186a);
                if (!C66615b.this.f168186a) {
                    C66615b.this.f168186a = true;
                }
            } catch (Exception e2) {
                AppBrandLogger.m52829e("ServiceBindManager", "onServiceConnected", e2);
            }
        }
    };

    /* renamed from: f */
    public IBinder.DeathRecipient f168191f = new IBinder.DeathRecipient() {
        /* class com.tt.miniapp.process.C66615b.C666172 */

        public void binderDied() {
            C66615b.this.mo232249d();
        }
    };

    /* renamed from: g */
    private List<AbstractC66618a> f168192g = new ArrayList();

    /* renamed from: com.tt.miniapp.process.b$a */
    public interface AbstractC66618a {
        /* renamed from: a */
        void mo232064a();

        /* renamed from: a */
        void mo232065a(boolean z);
    }

    /* renamed from: a */
    public static C66615b m260248a() {
        return ContextSingletonInstance.getInstance().getServiceBindManager();
    }

    /* renamed from: e */
    private void m260249e() {
        synchronized (C66615b.class) {
            for (AbstractC66618a aVar : this.f168192g) {
                aVar.mo232064a();
            }
        }
    }

    /* renamed from: b */
    public IMiniApp2HostBinderInterface mo232246b() {
        if (this.f168188c != null) {
            return this.f168188c;
        }
        if (!C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS).isHostProcessExist(AppbrandContext.getInst().getApplicationContext())) {
            DebugUtil.outputError("ServiceBindManager", "cross call sync is not supported after host process is gone");
            return null;
        }
        mo232248c();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            DebugUtil.outputError("ServiceBindManager", "cross process data transport must be in MAIN_PROCESS");
            return null;
        }
        synchronized (this.f168189d) {
            try {
                this.f168189d.wait();
            } catch (InterruptedException e) {
                AppBrandLogger.m52829e("ServiceBindManager", "getHostCrossProcessCallSync", e);
            }
        }
        return this.f168188c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0 = com.tt.miniapphost.AppbrandContext.getInst().getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0.bindService(new android.content.Intent(r0, com.tt.miniapphost.process.HostCrossProcessCallService.class), r5.f168190e, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e("ServiceBindManager", "bind host service fail : context is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo232248c() {
        /*
            r5 = this;
            java.lang.String r0 = "ServiceBindManager"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "bindHostService"
            r4 = 0
            r2[r4] = r3
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i(r0, r2)
            java.lang.Object r0 = r5.f168189d
            monitor-enter(r0)
            com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface r2 = r5.f168188c     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0016:
            boolean r2 = r5.f168187b     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x001c:
            r5.f168187b = r1     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            com.tt.miniapphost.AppbrandContext r0 = com.tt.miniapphost.AppbrandContext.getInst()
            android.app.Application r0 = r0.getApplicationContext()
            if (r0 == 0) goto L_0x0036
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.tt.miniapphost.process.HostCrossProcessCallService> r3 = com.tt.miniapphost.process.HostCrossProcessCallService.class
            r2.<init>(r0, r3)
            android.content.ServiceConnection r3 = r5.f168190e
            r0.bindService(r2, r3, r1)
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "ServiceBindManager"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "bind host service fail : context is null"
            r1[r4] = r2
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r0, r1)
        L_0x0041:
            return
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.process.C66615b.mo232248c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (com.tt.miniapp.process.manager.C66645a.m260337a().mo232355a(com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS).isHostProcessExist(com.tt.miniapphost.AppbrandContext.getInst().getApplicationContext()) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        mo232248c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        com.tt.miniapphost.process.p3376b.C67566c.m262973a().mo232257a("hostProcess");
        com.tt.miniapphost.util.DebugUtil.outputError("ServiceBindManager", "宿主进程已被杀死");
        m260249e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo232249d() {
        /*
            r5 = this;
            java.lang.String r0 = "ServiceBindManager"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "rebindHostService"
            r4 = 0
            r2[r4] = r3
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i(r0, r2)
            java.lang.Object r0 = r5.f168189d
            monitor-enter(r0)
            com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface r2 = r5.f168188c     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0016:
            com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface r2 = r5.f168188c     // Catch:{ all -> 0x0059 }
            android.os.IBinder r2 = r2.asBinder()     // Catch:{ all -> 0x0059 }
            android.os.IBinder$DeathRecipient r3 = r5.f168191f     // Catch:{ all -> 0x0059 }
            r2.unlinkToDeath(r3, r4)     // Catch:{ all -> 0x0059 }
            r2 = 0
            r5.f168188c = r2     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            com.tt.miniapphost.AppbrandContext r0 = com.tt.miniapphost.AppbrandContext.getInst()
            android.app.Application r0 = r0.getApplicationContext()
            com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService r2 = com.tt.miniapp.process.manager.C66645a.m260337a()
            com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService$SandBoxEnvType r3 = com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS
            com.tt.miniapp.process.manager.IAppSandboxEnvProcessor r2 = r2.mo232355a(r3)
            boolean r0 = r2.isHostProcessExist(r0)
            if (r0 == 0) goto L_0x0041
            r5.mo232248c()
            goto L_0x0058
        L_0x0041:
            com.tt.miniapphost.process.b.c r0 = com.tt.miniapphost.process.p3376b.C67566c.m262973a()
            java.lang.String r2 = "hostProcess"
            r0.mo232257a(r2)
            java.lang.String r0 = "ServiceBindManager"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "宿主进程已被杀死"
            r1[r4] = r2
            com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
            r5.m260249e()
        L_0x0058:
            return
        L_0x0059:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.process.C66615b.mo232249d():void");
    }

    /* renamed from: a */
    public void mo232244a(AbstractC66618a aVar) {
        AppBrandLogger.m52828d("ServiceBindManager", "registerHostProcessLifeListener:", aVar);
        if (aVar != null) {
            synchronized (C66615b.class) {
                this.f168192g.add(aVar);
            }
        }
    }

    /* renamed from: b */
    public void mo232247b(AbstractC66618a aVar) {
        AppBrandLogger.m52828d("ServiceBindManager", "unregisterHostProcessLifeListener:", aVar);
        if (aVar != null) {
            synchronized (C66615b.class) {
                this.f168192g.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo232245a(boolean z) {
        synchronized (C66615b.class) {
            for (AbstractC66618a aVar : this.f168192g) {
                aVar.mo232065a(z);
            }
        }
    }
}
