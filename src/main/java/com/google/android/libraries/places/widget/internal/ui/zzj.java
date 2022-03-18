package com.google.android.libraries.places.widget.internal.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.p031d.p032a.p033a.C0966b;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzdk;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public final class zzj extends C1363f {
    private final List<RecyclerView.ViewHolder> zza = new ArrayList();
    private final List<RecyclerView.ViewHolder> zzb = new ArrayList();
    private final List<RecyclerView.ViewHolder> zzc = new ArrayList();
    private final int zzd;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zza() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.C1363f
    public final boolean isRunning() {
        try {
            if (super.isRunning() || !this.zzb.isEmpty() || !this.zza.isEmpty() || !this.zzc.isEmpty()) {
                return true;
            }
            return false;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.C1363f
    public final void endAnimations() {
        try {
            for (int size = this.zza.size() - 1; size >= 0; size--) {
                RecyclerView.ViewHolder viewHolder = this.zza.get(size);
                zzb(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                this.zza.remove(size);
            }
            List<RecyclerView.ViewHolder> list = this.zzc;
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                list.get(size2).itemView.animate().cancel();
            }
            super.endAnimations();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.C1363f
    public final void runPendingAnimations() {
        try {
            for (RecyclerView.ViewHolder viewHolder : this.zzb) {
                super.animateAdd(viewHolder);
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (!this.zza.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.zza);
                this.zza.clear();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) obj;
                    View view = viewHolder2.itemView;
                    this.zzc.add(viewHolder2);
                    long moveDuration = getMoveDuration() + ((long) (viewHolder2.getLayoutPosition() * 67));
                    view.setTranslationY((float) (-this.zzd));
                    view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(133).setInterpolator(new C0966b()).setStartDelay(moveDuration);
                    animate.setListener(new zzi(this, view, viewHolder2, animate)).start();
                }
            }
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public static void zzb(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.C1363f
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        try {
            super.endAnimation(viewHolder);
            if (this.zza.remove(viewHolder)) {
                zzb(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
            }
            zza();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public zzj(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    @Override // androidx.recyclerview.widget.C1363f, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        try {
            endAnimation(viewHolder);
            viewHolder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            if (((zzm) viewHolder).zza()) {
                this.zza.add(viewHolder);
                return true;
            }
            this.zzb.add(viewHolder);
            return true;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
