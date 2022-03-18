package com.google.android.libraries.places.internal;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import java.util.List;

public final class zzes extends AbstractC1142af {
    private final zzek zza;
    private final zzey zzb;
    private final zzfa zzc;
    private final C1177w<zzef> zzd;

    public final LiveData<zzef> zza() {
        return this.zzd;
    }

    public final void zzb() {
        this.zzb.zzw();
    }

    public final void zzd() {
        this.zzb.zzx();
    }

    public final void zze() {
        this.zzb.zzy();
    }

    public final void zzc() {
        this.zzb.zzv();
        zza("");
    }

    public final void zzf() {
        this.zzb.zzp();
        zza(zzef.zzk());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public final void onCleared() {
        try {
            this.zza.zza();
            this.zzb.zzq();
            this.zzc.zza(this.zzb);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            this.zzd.mo5929b(zzef.zzg());
        }
    }

    public final void zzb(String str) {
        this.zza.zza();
        zza(str);
        zza(zzef.zzj());
    }

    public static final class zza implements C1144ai.AbstractC1146b {
        private final zzek zza;
        private final zzey zzb;
        private final zzfa zzc;

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public final <T extends AbstractC1142af> T create(Class<T> cls) {
            boolean z;
            if (cls == zzes.class) {
                z = true;
            } else {
                z = false;
            }
            zzft.zza(z, "This factory can only be used to instantiate its enclosing class.");
            return new zzes(this.zza, this.zzb, this.zzc);
        }

        public zza(zzek zzek, zzey zzey, zzfa zzfa) {
            this.zza = zzek;
            this.zzb = zzey;
            this.zzc = zzfa;
        }
    }

    private static Status zza(Exception exc) {
        if (!(exc instanceof ApiException)) {
            return new Status(13, exc.getMessage());
        }
        ApiException apiException = (ApiException) exc;
        return new Status(apiException.getStatusCode(), apiException.getStatusMessage());
    }

    private final void zza(zzef zzef) {
        if (!zzef.equals(this.zzd.mo5927b())) {
            this.zzd.mo5926a(zzef);
        }
    }

    private static boolean zza(Status status) {
        if (status.isCanceled() || status.getStatusCode() == 9012 || status.getStatusCode() == 9011) {
            return true;
        }
        return false;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
        if (str.isEmpty()) {
            this.zza.zza();
            zza(zzef.zzh());
            return;
        }
        Task<FindAutocompletePredictionsResponse> zza2 = this.zza.zza(str);
        if (!zza2.isComplete()) {
            zza(zzef.zzi());
        }
        zza2.addOnCompleteListener(new zzev(this, str));
    }

    public final void zza(AutocompletePrediction autocompletePrediction, int i) {
        this.zzb.zza(i);
        Task<FetchPlaceResponse> zza2 = this.zza.zza(autocompletePrediction);
        if (!zza2.isComplete()) {
            zza(zzef.zzi());
        }
        zza2.addOnCompleteListener(new zzeu(this, autocompletePrediction));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, Task task) {
        if (!task.isCanceled()) {
            Exception exception = task.getException();
            if (exception == null) {
                this.zzb.zzt();
                zza(zzef.zza(((FetchPlaceResponse) task.getResult()).getPlace()));
                return;
            }
            this.zzb.zzu();
            Status zza2 = zza(exception);
            if (zza(zza2)) {
                zza(zzef.zza(zza2));
            } else {
                zza(zzef.zza(autocompletePrediction, zza2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, Task task) {
        if (!task.isCanceled()) {
            Exception exception = task.getException();
            if (exception == null) {
                this.zzb.zzr();
                List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions();
                if (autocompletePredictions.isEmpty()) {
                    zza(zzef.zza(str));
                } else {
                    zza(zzef.zza(autocompletePredictions));
                }
            } else {
                this.zzb.zzs();
                Status zza2 = zza(exception);
                if (zza(zza2)) {
                    zza(zzef.zza(zza2));
                } else {
                    zza(zzef.zza(str, zza2));
                }
            }
        }
    }

    private zzes(zzek zzek, zzey zzey, zzfa zzfa) {
        this.zzd = new C1177w<>();
        this.zza = zzek;
        this.zzb = zzey;
        this.zzc = zzfa;
    }
}
