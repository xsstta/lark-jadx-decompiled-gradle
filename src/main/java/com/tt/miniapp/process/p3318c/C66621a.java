package com.tt.miniapp.process.p3318c;

import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.p3322g.AbstractC66642a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;
import ee.android.framework.manis.C68183b;

/* renamed from: com.tt.miniapp.process.c.a */
public class C66621a {
    /* renamed from: a */
    public static void m260263a(CrossProcessCallEntity crossProcessCallEntity, AbstractC67565b bVar) throws RemoteException {
        IMiniApp2HostBinderInterface b = C66615b.m260248a().mo232246b();
        int i = 0;
        if (b == null) {
            if (bVar != null) {
                bVar.mo48979a();
            }
            AppBrandLogger.m52829e("CrossProcessActionCaller", "主进程被杀死或绑定主进程服务异常. CallType:", crossProcessCallEntity.mo234727c());
            return;
        }
        if (bVar != null) {
            bVar.mo234708a(crossProcessCallEntity.mo234726b());
            C67566c.m262973a().mo232256a(bVar);
        }
        if (bVar != null) {
            i = bVar.mo234709b();
        }
        b.asyncCall(crossProcessCallEntity, i);
    }

    /* renamed from: a */
    public static CrossProcessDataEntity m260262a(CrossProcessCallEntity crossProcessCallEntity, AbstractC66642a aVar) throws RemoteException {
        IMiniApp2HostBinderInterface b = C66615b.m260248a().mo232246b();
        String c = crossProcessCallEntity.mo234727c();
        if (b == null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                AppBrandLogger.m52829e("CrossProcessActionCaller", "同步跨进程通信请勿在主线程中执行. CallType:", c);
            } else {
                AppBrandLogger.m52829e("CrossProcessActionCaller", "主进程被杀死或绑定主进程服务异常. CallType:", c);
            }
            if (aVar != null) {
                return aVar.mo232243a(c, null, false);
            }
            return null;
        }
        CrossProcessDataEntity syncCall = b.syncCall(crossProcessCallEntity);
        if (aVar != null) {
            return aVar.mo232243a(c, syncCall, true);
        }
        return syncCall;
    }

    /* renamed from: b */
    public static void m260264b(final CrossProcessCallEntity crossProcessCallEntity, AbstractC67565b bVar) {
        final int i;
        String str;
        ISandboxEnvInfo c = C66645a.m260337a().mo232360c(crossProcessCallEntity.mo234726b());
        if (c == null) {
            if (bVar != null) {
                try {
                    i = bVar.mo234709b();
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("CrossProcessActionCaller", "", th);
                }
            } else {
                i = 0;
            }
            HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
            if (hostInterface == null || !hostInterface.isP0MergeToMainProc()) {
                IP0ProcessHandleEvent iP0ProcessHandleEvent = (IP0ProcessHandleEvent) C68183b.m264839a().mo237086a(AppbrandContext.getInst().getApplicationContext(), IP0ProcessHandleEvent.class);
                if (iP0ProcessHandleEvent != null) {
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("callback data to P0:");
                    if (crossProcessCallEntity.mo234728d() != null) {
                        str = crossProcessCallEntity.mo234728d().toString();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    objArr[0] = sb.toString();
                    AppBrandLogger.m52830i("CrossProcessActionCaller", objArr);
                    iP0ProcessHandleEvent.callP0Process(crossProcessCallEntity, i);
                } else {
                    AppBrandLogger.m52830i("CrossProcessActionCaller", "processHandleEvent is null");
                }
                DebugUtil.logOrThrow("CrossProcessActionCaller", "processInfo is null! " + crossProcessCallEntity.mo234725a());
                return;
            }
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.process.p3318c.C66621a.C666221 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    C67560a.m262957a(crossProcessCallEntity, i);
                }
            }, C67554l.m262725b());
            DebugUtil.logOrThrow("CrossProcessActionCaller", "processInfo is null! " + crossProcessCallEntity.mo234725a());
            return;
        }
        if (bVar != null) {
            bVar.mo234708a(crossProcessCallEntity.mo234726b());
            C67566c.m262973a().mo232256a(bVar);
        }
        c.getMiniProcessMontior().asyncCallMiniAppProcess(crossProcessCallEntity, bVar);
    }
}
