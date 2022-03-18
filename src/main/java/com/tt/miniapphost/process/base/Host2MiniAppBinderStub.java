package com.tt.miniapphost.process.base;

import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.refer.common.util.C67866g;

public class Host2MiniAppBinderStub extends IHost2MiniAppBinderInterface.Stub {
    @Override // com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface
    public void asyncCallMiniProcess(final CrossProcessCallEntity crossProcessCallEntity, final int i) throws RemoteException {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.process.base.Host2MiniAppBinderStub.C675671 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262957a(crossProcessCallEntity, i);
            }
        }, C67554l.m262725b());
    }
}
