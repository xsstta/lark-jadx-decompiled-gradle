package com.google.android.libraries.places.widget.internal.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1396o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzdk;
import com.larksuite.suite.R;
import java.util.List;

public final class zzl extends AbstractC1396o<AutocompletePrediction, zzm> {
    private final zzo zza;
    private int zzb;
    private boolean zzc = true;

    public zzl(zzo zzo) {
        super(new zzn());
        this.zza = zzo;
    }

    @Override // androidx.recyclerview.widget.AbstractC1396o
    public final void submitList(List<AutocompletePrediction> list) {
        boolean z;
        try {
            int i = 0;
            if (this.zzb != 0 || list == null || list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            this.zzc = z;
            if (list != null) {
                i = list.size();
            }
            this.zzb = i;
            super.submitList(list);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final zzm onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            return new zzm(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        try {
            ((zzm) viewHolder).zza((AutocompletePrediction) getItem(i), this.zzc);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
