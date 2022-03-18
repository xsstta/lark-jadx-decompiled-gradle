package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.util.p718t.C13742g;

class RNFollowAdapter$1 extends BinderISendDataCallback.Stub {
    RNFollowAdapter$1() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5098d
    public void onReceiveData(String str) {
        C13742g.m55711d(new Runnable(str) {
            /* class com.bytedance.ee.bear.doc.follow.impl.rn.$$Lambda$RNFollowAdapter$1$Inep37MVTJrmgRUtpSVey7DCEk */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                RNFollowAdapter$1.lambda$onReceiveData$0(this.f$0);
            }
        });
    }
}
