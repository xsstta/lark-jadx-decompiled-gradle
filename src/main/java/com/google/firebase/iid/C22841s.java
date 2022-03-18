package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.s */
class C22841s implements AbstractC22806a {

    /* renamed from: a */
    private final ExecutorService f56471a;

    C22841s(ExecutorService executorService) {
        this.f56471a = executorService;
    }

    @Override // com.google.firebase.iid.AbstractC22806a
    /* renamed from: a */
    public Task<Integer> mo79305a(Intent intent) {
        return Tasks.call(this.f56471a, new CallableC22842t(intent));
    }

    /* renamed from: c */
    private static int m82963c(Intent intent) {
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra == null) {
            return -1;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
            sb.append("Received command: ");
            sb.append(stringExtra);
            sb.append(" - ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
            FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
            return -1;
        } else if (!"SYNC".equals(stringExtra)) {
            return -1;
        } else {
            FirebaseInstanceId.getInstance().forceTokenRefresh();
            return -1;
        }
    }
}
