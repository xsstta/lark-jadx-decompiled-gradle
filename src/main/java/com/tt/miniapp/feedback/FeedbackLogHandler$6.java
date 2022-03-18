package com.tt.miniapp.feedback;

import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;

/* access modifiers changed from: package-private */
public class FeedbackLogHandler$6 extends IFeedbackRecordCallback.Stub {
    final /* synthetic */ C66094d this$0;

    FeedbackLogHandler$6(C66094d dVar) {
        this.this$0 = dVar;
    }

    @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
    public void onSuccess(String str) throws RemoteException {
        this.this$0.mo231259b();
    }

    @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
    public void onFail(String str) throws RemoteException {
        this.this$0.mo231257a(AppbrandContext.getInst().getApplicationContext(), false);
        AppBrandLogger.m52829e("tma_FeedbackLogHandler", "screen record can not start" + str);
    }
}
