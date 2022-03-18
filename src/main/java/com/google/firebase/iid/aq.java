package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.as;

public class aq extends Binder {

    /* renamed from: a */
    private final AbstractC22821a f56423a;

    /* renamed from: com.google.firebase.iid.aq$a */
    public interface AbstractC22821a {
        /* renamed from: a */
        Task<Void> mo79343a(Intent intent);
    }

    public aq(AbstractC22821a aVar) {
        this.f56423a = aVar;
    }

    /* renamed from: a */
    public void mo79342a(as.C22822a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f56423a.mo79343a(aVar.f56431a).addOnCompleteListener(C22829g.m82947a(), new ar(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
