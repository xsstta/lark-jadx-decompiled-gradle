package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.C1934i;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class zzad {
    private final C1934i zza;

    zzad(C1934i iVar) {
        this.zza = iVar;
    }

    public final <HttpPhotoResponseT extends zzam<Object, ? extends Object>> Task<HttpPhotoResponseT> zza(zzaj<Object, ?> zzaj, zzan<HttpPhotoResponseT> zzan) {
        TaskCompletionSource taskCompletionSource;
        String zzd = zzaj.zzd();
        Map<String, String> zzc = zzaj.zzc();
        AbstractC22083a zzb = zzaj.zzb();
        if (zzb != null) {
            taskCompletionSource = new TaskCompletionSource(zzb);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        zzah zzah = new zzah(this, zzd, new zzag(zzan, taskCompletionSource), 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new zzaf(taskCompletionSource), zzc);
        if (zzb != null) {
            zzb.mo75029a(zzai.zza(zzah));
        }
        this.zza.mo9808a(zzah);
        return taskCompletionSource.getTask();
    }
}
