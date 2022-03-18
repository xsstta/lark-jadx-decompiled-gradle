package com.tt.miniapphost.process.base;

import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.refer.common.util.C67866g;

public class MiniApp2HostBinderStub extends IMiniApp2HostBinderInterface.Stub {
    @Override // com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface
    public CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) {
        return C67560a.m262954a(crossProcessCallEntity);
    }

    @Override // com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface
    public void asyncCall(final CrossProcessCallEntity crossProcessCallEntity, final int i) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.process.base.MiniApp2HostBinderStub.C675681 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262957a(crossProcessCallEntity, i);
            }
        }, C67554l.m262725b());
    }
}
