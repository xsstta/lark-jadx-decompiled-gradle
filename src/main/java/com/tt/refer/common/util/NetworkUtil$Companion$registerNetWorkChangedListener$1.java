package com.tt.refer.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tt.refer.common.util.NetworkUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/tt/refer/common/util/NetworkUtil$Companion$registerNetWorkChangedListener$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NetworkUtil$Companion$registerNetWorkChangedListener$1 extends BroadcastReceiver {
    NetworkUtil$Companion$registerNetWorkChangedListener$1() {
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (NetworkUtil.f170924d == null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            NetworkUtil.f170924d = new NetworkUtil.Companion.NetChangedRunnable(applicationContext);
        }
        NetworkUtil.Companion.NetChangedRunnable aVar = NetworkUtil.f170924d;
        if (aVar != null) {
            NetworkUtil.Companion.NetChangedRunnable aVar2 = aVar;
            NetworkUtil.f170922b.removeCallbacks(aVar2);
            NetworkUtil.f170922b.postDelayed(aVar2, 500);
        }
    }
}
