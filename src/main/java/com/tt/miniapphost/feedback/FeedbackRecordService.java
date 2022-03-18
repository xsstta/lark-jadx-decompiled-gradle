package com.tt.miniapphost.feedback;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.tt.miniapphost.feedback.IFeedbackRecordAIDL;

public class FeedbackRecordService extends Service {

    /* renamed from: a */
    IFeedbackRecordAIDL.Stub f170352a = new IFeedbackRecordAIDL.Stub() {
        /* class com.tt.miniapphost.feedback.FeedbackRecordService.BinderC675411 */

        @Override // com.tt.miniapphost.feedback.IFeedbackRecordAIDL
        public void start(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException {
            C67542a.m262700a(iFeedbackRecordCallback);
        }

        @Override // com.tt.miniapphost.feedback.IFeedbackRecordAIDL
        public void stop(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException {
            C67542a.m262701b(iFeedbackRecordCallback);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.f170352a;
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
