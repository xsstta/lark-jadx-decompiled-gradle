package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.o */
final class C21680o implements OnCompleteListener<Map<cc<?>, String>> {

    /* renamed from: a */
    private AbstractC21674i f52870a;

    /* renamed from: b */
    private final /* synthetic */ cr f52871b;

    C21680o(cr crVar, AbstractC21674i iVar) {
        this.f52871b = crVar;
        this.f52870a = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73498a() {
        this.f52870a.mo73095h();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Map<cc<?>, String>> task) {
        cr.m78685a(this.f52871b).lock();
        try {
            if (!cr.m78690b(this.f52871b)) {
                this.f52870a.mo73095h();
                return;
            }
            if (task.isSuccessful()) {
                cr crVar = this.f52871b;
                cr.m78689b(crVar, new ArrayMap(cr.m78706m(crVar).size()));
                for (cq cqVar : cr.m78706m(this.f52871b).values()) {
                    cr.m78697g(this.f52871b).put(cqVar.mo73252e(), ConnectionResult.RESULT_SUCCESS);
                }
            } else if (task.getException() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.getException();
                if (cr.m78695e(this.f52871b)) {
                    cr crVar2 = this.f52871b;
                    cr.m78689b(crVar2, new ArrayMap(cr.m78706m(crVar2).size()));
                    for (cq cqVar2 : cr.m78706m(this.f52871b).values()) {
                        cc e = cqVar2.mo73252e();
                        ConnectionResult connectionResult = availabilityException.getConnectionResult(cqVar2);
                        if (cr.m78687a(this.f52871b, cqVar2, connectionResult)) {
                            cr.m78697g(this.f52871b).put(e, new ConnectionResult(16));
                        } else {
                            cr.m78697g(this.f52871b).put(e, connectionResult);
                        }
                    }
                } else {
                    cr.m78689b(this.f52871b, availabilityException.zaj());
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                cr.m78689b(this.f52871b, Collections.emptyMap());
            }
            if (this.f52871b.mo73375f()) {
                cr.m78693d(this.f52871b).putAll(cr.m78697g(this.f52871b));
                if (cr.m78696f(this.f52871b) == null) {
                    cr.m78700i(this.f52871b);
                    cr.m78702j(this.f52871b);
                    cr.m78705l(this.f52871b).signalAll();
                }
            }
            this.f52870a.mo73095h();
            cr.m78685a(this.f52871b).unlock();
        } finally {
            cr.m78685a(this.f52871b).unlock();
        }
    }
}
