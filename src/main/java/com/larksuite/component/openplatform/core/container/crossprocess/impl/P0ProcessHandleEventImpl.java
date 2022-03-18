package com.larksuite.component.openplatform.core.container.crossprocess.impl;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.refer.common.util.C67866g;

@RemoteServiceImpl(service = IP0ProcessHandleEvent.class)
public class P0ProcessHandleEventImpl implements IP0ProcessHandleEvent {
    public P0ProcessHandleEventImpl(Context context) {
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IP0ProcessHandleEvent
    public void callP0Process(final CrossProcessCallEntity crossProcessCallEntity, final int i) {
        C67866g.m264025a(new Action() {
            /* class com.larksuite.component.openplatform.core.container.crossprocess.impl.P0ProcessHandleEventImpl.C244771 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262957a(crossProcessCallEntity, i);
            }
        }, C67554l.m262725b());
    }
}
