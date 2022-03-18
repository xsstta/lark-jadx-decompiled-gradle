package com.google.android.libraries.places.widget.internal.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzdk;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

final class zzi extends AnimatorListenerAdapter {
    private final /* synthetic */ View zza;
    private final /* synthetic */ RecyclerView.ViewHolder zzb;
    private final /* synthetic */ ViewPropertyAnimator zzc;
    private final /* synthetic */ zzj zzd;

    public final void onAnimationCancel(Animator animator) {
        try {
            zzj.zzb(this.zza);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        try {
            this.zzc.setListener(null);
            this.zzd.dispatchAddFinished(this.zzb);
            this.zzd.zzc.remove(this.zzb);
            this.zzd.zza();
            this.zzc.setStartDelay(0);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    zzi(zzj zzj, View view, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator) {
        this.zzd = zzj;
        this.zza = view;
        this.zzb = viewHolder;
        this.zzc = viewPropertyAnimator;
    }
}
