package com.larksuite.component.openplatform.core.plugin.op;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* access modifiers changed from: package-private */
public class ApiKeyboardCtrl$2 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C25424v f61826a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApiKeyboardCtrl$2(C25424v vVar, Handler handler) {
        super(handler);
        this.f61826a = vVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        boolean z;
        super.onReceiveResult(i, bundle);
        if (i == 2 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f61826a.callbackOk();
        } else {
            this.f61826a.callbackFail("show keyboard fail");
        }
    }
}
