package com.tt.miniapp.feedback.screenrecord;

import android.os.RemoteException;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;

/* access modifiers changed from: package-private */
public class ScreenRecordServiceBindManager$2 extends IFeedbackRecordCallback.Stub {
    final /* synthetic */ C66167d this$0;

    ScreenRecordServiceBindManager$2(C66167d dVar) {
        this.this$0 = dVar;
    }

    @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
    public void onFail(String str) throws RemoteException {
        if (this.this$0.f167026b != null) {
            this.this$0.f167026b.onFail(str);
        }
    }

    @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
    public void onSuccess(String str) throws RemoteException {
        if (this.this$0.f167026b != null) {
            this.this$0.f167026b.onSuccess(str);
        }
    }
}
