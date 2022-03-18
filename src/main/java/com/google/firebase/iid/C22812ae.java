package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ae */
public class C22812ae {

    /* renamed from: a */
    private final Executor f56382a;

    /* renamed from: b */
    private final Map<Pair<String, String>, Task<InstanceIdResult>> f56383b = new ArrayMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.ae$a */
    public interface AbstractC22813a {
        /* renamed from: a */
        Task<InstanceIdResult> mo79314a();
    }

    C22812ae(Executor executor) {
        this.f56382a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Task mo79312a(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.f56383b.remove(pair);
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Task<InstanceIdResult> mo79313a(String str, String str2, AbstractC22813a aVar) {
        Pair<String, String> pair = new Pair<>(str, str2);
        Task<InstanceIdResult> task = this.f56383b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        Task<TContinuationResult> continueWithTask = aVar.mo79314a().continueWithTask(this.f56382a, new C22814af(this, pair));
        this.f56383b.put(pair, continueWithTask);
        return continueWithTask;
    }
}
