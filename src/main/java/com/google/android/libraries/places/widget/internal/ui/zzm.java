package com.google.android.libraries.places.widget.internal.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzdk;
import com.larksuite.suite.R;

public final class zzm extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final zzo zza;
    private final TextView zzb;
    private final TextView zzc;
    private AutocompletePrediction zzd;
    private boolean zze;

    public final boolean zza() {
        return this.zze;
    }

    public final void onClick(View view) {
        try {
            this.zza.zza(this.zzd, getAdapterPosition());
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public zzm(zzo zzo, View view) {
        super(view);
        this.zza = zzo;
        this.zzb = (TextView) view.findViewById(R.id.places_autocomplete_prediction_primary_text);
        this.zzc = (TextView) view.findViewById(R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(this);
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzd = autocompletePrediction;
        this.zze = z;
        this.zzb.setText(autocompletePrediction.getPrimaryText(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), R.color.places_autocomplete_prediction_primary_text_highlight))));
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        this.zzc.setText(secondaryText);
        if (secondaryText.length() == 0) {
            this.zzc.setVisibility(8);
            this.zzb.setGravity(16);
            return;
        }
        this.zzc.setVisibility(0);
        this.zzb.setGravity(80);
    }
}
