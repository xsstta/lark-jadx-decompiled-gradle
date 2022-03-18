package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

final class ct implements OnCompleteListener<Map<cc<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ cr f52845a;

    private ct(cr crVar) {
        this.f52845a = crVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Map<cc<?>, String>> task) {
        cr.m78685a(this.f52845a).lock();
        try {
            if (cr.m78690b(this.f52845a)) {
                if (task.isSuccessful()) {
                    cr crVar = this.f52845a;
                    crVar.f52841o = new ArrayMap(crVar.f52827a.size());
                    for (cq cqVar : this.f52845a.f52827a.values()) {
                        cr.m78693d(this.f52845a).put(cqVar.mo73252e(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (cr.m78695e(this.f52845a)) {
                        cr crVar2 = this.f52845a;
                        crVar2.f52841o = new ArrayMap(crVar2.f52827a.size());
                        for (cq cqVar2 : this.f52845a.f52827a.values()) {
                            cc e = cqVar2.mo73252e();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(cqVar2);
                            if (cr.m78687a(this.f52845a, cqVar2, connectionResult)) {
                                cr.m78693d(this.f52845a).put(e, new ConnectionResult(16));
                            } else {
                                cr.m78693d(this.f52845a).put(e, connectionResult);
                            }
                        }
                    } else {
                        this.f52845a.f52841o = availabilityException.zaj();
                    }
                    cr crVar3 = this.f52845a;
                    crVar3.f52844r = cr.m78696f(crVar3);
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    this.f52845a.f52841o = Collections.emptyMap();
                    this.f52845a.f52844r = new ConnectionResult(8);
                }
                if (cr.m78697g(this.f52845a) != null) {
                    cr.m78693d(this.f52845a).putAll(cr.m78697g(this.f52845a));
                    cr crVar4 = this.f52845a;
                    crVar4.f52844r = cr.m78696f(crVar4);
                }
                if (this.f52845a.f52844r == null) {
                    this.f52845a.m78698g();
                    this.f52845a.m78701j();
                } else {
                    cr.m78688a(this.f52845a, false);
                    this.f52845a.f52831e.mo73349a(this.f52845a.f52844r);
                }
                this.f52845a.f52835i.signalAll();
                cr.m78685a(this.f52845a).unlock();
            }
        } finally {
            cr.m78685a(this.f52845a).unlock();
        }
    }
}
