package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.assetpacks.i */
final class ResultReceiverC22598i extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C22741m f55935a;

    /* renamed from: b */
    final /* synthetic */ cx f55936b;

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f55935a.mo79092b((Object) -1);
            this.f55936b.f55897h.mo78735a(null);
        } else if (i != 2) {
            this.f55935a.mo79091b((Exception) new AssetPackException(-100));
        } else {
            this.f55935a.mo79092b((Object) 0);
        }
    }
}
