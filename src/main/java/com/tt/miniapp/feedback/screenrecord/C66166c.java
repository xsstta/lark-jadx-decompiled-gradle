package com.tt.miniapp.feedback.screenrecord;

import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.feedback.FeedbackRecordActivity;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.feedback.AbstractC67544b;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;

/* renamed from: com.tt.miniapp.feedback.screenrecord.c */
public class C66166c implements AbstractC67544b {
    @Override // com.tt.miniapphost.feedback.AbstractC67544b
    /* renamed from: a */
    public void mo231476a(IFeedbackRecordCallback iFeedbackRecordCallback) {
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            FeedbackRecordActivity.m258817a(AppbrandContext.getInst().getApplicationContext(), iFeedbackRecordCallback);
        }
    }

    @Override // com.tt.miniapphost.feedback.AbstractC67544b
    /* renamed from: b */
    public void mo231477b(IFeedbackRecordCallback iFeedbackRecordCallback) {
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            k = C67448a.m262353a().mo234190i();
        }
        C66172f a = C66172f.m259103a(k);
        if (a == null || !a.mo231491a()) {
            try {
                iFeedbackRecordCallback.onSuccess("fail");
            } catch (RemoteException e) {
                AppBrandLogger.stacktrace(6, "ScreenRecordControl", e.getStackTrace());
            }
        } else {
            try {
                iFeedbackRecordCallback.onSuccess("ok");
            } catch (RemoteException e2) {
                AppBrandLogger.stacktrace(6, "ScreenRecordControl", e2.getStackTrace());
            }
        }
    }
}
