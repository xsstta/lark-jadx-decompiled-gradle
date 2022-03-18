package com.google.android.gms.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.internal.C21644a;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.api.internal.C21672g;
import com.google.android.gms.common.api.internal.C21678m;
import com.google.android.gms.common.internal.C21752k;
import com.google.android.gms.internal.location.C21927o;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class FusedLocationProviderClient extends C21628c<Object> {

    /* access modifiers changed from: private */
    public static class zza extends zzak {
        private final TaskCompletionSource<Void> zzac;

        public zza(TaskCompletionSource<Void> taskCompletionSource) {
            this.zzac = taskCompletionSource;
        }

        @Override // com.google.android.gms.internal.location.zzaj
        public final void zza(zzad zzad) {
            C21678m.m78753a(zzad.getStatus(), this.zzac);
        }
    }

    public FusedLocationProviderClient(Context context) {
        super(context, C21949e.f53431a, (C21611a.AbstractC21615d) null, new C21644a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final zzaj m79282a(TaskCompletionSource<Boolean> taskCompletionSource) {
        return new zzp(this, taskCompletionSource);
    }

    /* renamed from: a */
    public Task<Location> mo74306a() {
        return mo73248a(new C21942ac(this));
    }

    /* renamed from: a */
    public Task<Void> mo74307a(LocationRequest locationRequest, C21947c cVar, Looper looper) {
        zzbd a = zzbd.m79259a(locationRequest);
        C21668f a2 = C21672g.m78739a(cVar, C21927o.m79249a(looper), C21947c.class.getSimpleName());
        return mo73247a(new C21943ad(this, a2, a, a2), new C21944ae(this, a2.mo73481b()));
    }

    /* renamed from: a */
    public Task<Void> mo74308a(C21947c cVar) {
        return C21678m.m78752a(mo73246a(C21672g.m78738a(cVar, C21947c.class.getSimpleName())));
    }

    /* renamed from: a */
    public Task<Void> mo74309a(boolean z) {
        return C21752k.m79000a(C21949e.f53432b.mo74053a(mo73254g(), z));
    }
}
