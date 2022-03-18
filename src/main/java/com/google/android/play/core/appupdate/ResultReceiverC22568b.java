package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.appupdate.b */
final class ResultReceiverC22568b extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C22741m f55616a;

    public final void onReceiveResult(int i, Bundle bundle) {
        C22741m mVar;
        int i2 = 1;
        if (i == 1) {
            mVar = this.f55616a;
            i2 = -1;
        } else if (i != 2) {
            mVar = this.f55616a;
        } else {
            mVar = this.f55616a;
            i2 = 0;
        }
        mVar.mo79092b(Integer.valueOf(i2));
    }
}
