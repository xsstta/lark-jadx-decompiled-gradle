package com.google.android.libraries.places.widget;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzec;
import com.google.android.libraries.places.internal.zzft;
import com.google.android.libraries.places.internal.zzgi;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.larksuite.suite.R;
import java.util.Collection;
import java.util.List;

public class AutocompleteFragment extends Fragment {
    private View zza;
    private View zzb;
    private EditText zzc;
    private LocationBias zzd;
    private LocationRestriction zze;
    private String zzf;
    private TypeFilter zzg;
    private zzgi<Place.Field> zzh;
    private PlaceSelectionListener zzi;

    private final void zza() {
        int i;
        boolean z = !this.zzc.getText().toString().isEmpty();
        View view = this.zzb;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onDestroyView() {
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public void setCountry(String str) {
        this.zzf = str;
    }

    public void setLocationBias(LocationBias locationBias) {
        this.zzd = locationBias;
    }

    public void setLocationRestriction(LocationRestriction locationRestriction) {
        this.zze = locationRestriction;
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public void setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
    }

    public void setText(CharSequence charSequence) {
        try {
            this.zzc.setText(charSequence);
            zza();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public void setHint(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                charSequence = getString(R.string.places_autocomplete_search_hint);
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
        this.zzc.setHint(charSequence);
        this.zza.setContentDescription(charSequence);
    }

    public void setPlaceFields(List<Place.Field> list) {
        try {
            zzft.zza(list, "Place Fields must not be null.");
            this.zzh = zzgi.zza((Collection) list);
            getView().setEnabled(true);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        if (!getView().isEnabled()) {
            zzft.zza(this.zzh, "Place Fields must be set.");
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Autocomplete activity cannot be launched until fragment is enabled.");
                return;
            }
            return;
        }
        Intent build = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, this.zzh).setInitialQuery(this.zzc.getText().toString()).setHint(this.zzc.getHint().toString()).setCountry(this.zzf).setLocationBias(this.zzd).setLocationRestriction(this.zze).setTypeFilter(this.zzg).zza(zzec.FRAGMENT).build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(build, 30421);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            getView().setEnabled(true);
            if (i == 30421) {
                if (this.zzi == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (i2 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i2 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                }
            }
            super.onActivityResult(i, i2, intent);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(R.layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = inflate.findViewById(R.id.places_autocomplete_search_button);
            this.zzb = inflate.findViewById(R.id.places_autocomplete_clear_button);
            this.zzc = (EditText) inflate.findViewById(R.id.places_autocomplete_search_input);
            zzd zzd2 = new zzd(this);
            this.zza.setOnClickListener(zzd2);
            this.zzc.setOnClickListener(zzd2);
            this.zzb.setOnClickListener(new zzc(this));
            zza();
            inflate.setEnabled(false);
            return inflate;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
