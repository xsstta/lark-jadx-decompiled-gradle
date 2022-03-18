package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1177w;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzec;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.internal.zzgi;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.larksuite.suite.R;
import java.util.List;

public class AutocompleteSupportFragment extends Fragment {
    private final C1177w<CharSequence> zza = new C1177w<>();
    private final C1177w<CharSequence> zzb = new C1177w<>();
    private zzed.zza zzc = zzed.zza(AutocompleteActivityMode.OVERLAY, zzgi.zza(), zzec.FRAGMENT);
    private PlaceSelectionListener zzd;

    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
    }

    private final void zza() {
        Intent build = new Autocomplete.IntentBuilder(this.zzc.zza()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(View view) {
        zza();
    }

    public AutocompleteSupportFragment setActivityMode(AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zza(autocompleteActivityMode);
        return this;
    }

    public AutocompleteSupportFragment setCountries(List<String> list) {
        this.zzc.zzb(list);
        return this;
    }

    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzc(str);
        return this;
    }

    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zza(locationBias);
        return this;
    }

    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zza(locationRestriction);
        return this;
    }

    public AutocompleteSupportFragment setPlaceFields(List<Place.Field> list) {
        this.zzc.zza(list);
        return this;
    }

    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zza(typeFilter);
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zza());
    }

    public AutocompleteSupportFragment setCountries(String... strArr) {
        this.zzc.zzb(zzgi.zza((Object[]) strArr));
        return this;
    }

    private final void zzc(View view) {
        int i;
        if (!TextUtils.isEmpty(this.zza.mo5927b())) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        String str;
        try {
            zzed.zza zza2 = this.zzc;
            if (TextUtils.isEmpty(charSequence)) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            zza2.zza(str);
            this.zza.mo5926a(charSequence);
            return this;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzed zzed = (zzed) bundle.getParcelable("options");
                if (zzed != null) {
                    if (this.zza.mo5927b() == null) {
                        this.zza.mo5926a((CharSequence) zzed.zzd());
                    }
                    if (this.zzb.mo5927b() == null) {
                        this.zzb.mo5926a((CharSequence) zzed.zze());
                    }
                    this.zzc = zzed.zzl();
                }
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }

    public AutocompleteSupportFragment setHint(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                String string = getString(R.string.places_autocomplete_search_hint);
                this.zzc.zzb(string);
                this.zzb.mo5926a((CharSequence) string);
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        } else {
            this.zzc.zzb(charSequence.toString());
            this.zzb.mo5926a(charSequence);
        }
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        View findViewById = view.findViewById(R.id.places_autocomplete_search_button);
        View findViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        findViewById.setOnClickListener(new zze(this));
        editText.setOnClickListener(new zzg(this));
        findViewById2.setOnClickListener(new zzf(this));
        zzc(findViewById2);
        this.zza.mo5923a(getViewLifecycleOwner(), new zzi(this, editText, findViewById2));
        this.zzb.mo5923a(getViewLifecycleOwner(), new zzh(editText, findViewById));
    }

    static final /* synthetic */ void zza(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzc(view);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 30421) {
            try {
                if (this.zzd == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Intent data was null.");
                    }
                } else if (i2 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzd.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else {
                    this.zzd.onError(Autocomplete.getStatusFromIntent(intent));
                }
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }
}
