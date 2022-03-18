package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.b */
public class C22824b implements AbstractC22806a {

    /* renamed from: a */
    private static final Object f56435a = new Object();

    /* renamed from: b */
    private static as f56436b;

    /* renamed from: c */
    private final Context f56437c;

    /* renamed from: d */
    private final ExecutorService f56438d;

    /* renamed from: a */
    static final /* synthetic */ Integer m82941a(Task task) throws Exception {
        return -1;
    }

    /* renamed from: b */
    static final /* synthetic */ Integer m82943b(Task task) throws Exception {
        return 403;
    }

    @Override // com.google.firebase.iid.AbstractC22806a
    /* renamed from: a */
    public Task<Integer> mo79305a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo79352a(this.f56437c, intent);
    }

    public C22824b(Context context, ExecutorService executorService) {
        this.f56437c = context;
        this.f56438d = executorService;
    }

    /* renamed from: a */
    private static as m82940a(Context context, String str) {
        as asVar;
        synchronized (f56435a) {
            if (f56436b == null) {
                f56436b = new as(context, str);
            }
            asVar = f56436b;
        }
        return asVar;
    }

    /* renamed from: c */
    private static Task<Integer> m82944c(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return m82940a(context, "com.google.firebase.MESSAGING_EVENT").mo79344a(intent).continueWith(C22829g.m82947a(), C22827e.f56443a);
    }

    /* renamed from: a */
    public Task<Integer> mo79352a(Context context, Intent intent) {
        boolean z;
        boolean z2 = true;
        if (!PlatformVersion.isAtLeastO() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (!z || z2) {
            return Tasks.call(this.f56438d, new CallableC22825c(context, intent)).continueWithTask(this.f56438d, new C22826d(context, intent));
        }
        return m82944c(context, intent);
    }

    /* renamed from: a */
    static final /* synthetic */ Task m82939a(Context context, Intent intent, Task task) throws Exception {
        if (!PlatformVersion.isAtLeastO() || ((Integer) task.getResult()).intValue() != 402) {
            return task;
        }
        return m82944c(context, intent).continueWith(C22829g.m82947a(), C22828f.f56444a);
    }
}
