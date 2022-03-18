package com.google.android.libraries.places.widget.internal.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1034f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzd;
import com.google.android.libraries.places.internal.zzdj;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzdl;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.internal.zzef;
import com.google.android.libraries.places.internal.zzej;
import com.google.android.libraries.places.internal.zzen;
import com.google.android.libraries.places.internal.zzes;
import com.google.android.libraries.places.internal.zzey;
import com.google.android.libraries.places.internal.zzez;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.larksuite.suite.R;

public final class AutocompleteImplFragment extends Fragment {
    private final PlacesClient zza;
    private final zzed zzb;
    private final zzfa zzc;
    private final com.google.android.libraries.places.internal.zzb zzd;
    private zzes zze;
    private PlaceSelectionListener zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzl zzs;
    private final zzc zzt;

    static final class zzb implements View.OnFocusChangeListener {
        private zzb() {
        }

        /* synthetic */ zzb(zzg zzg) {
            this();
        }

        public final void onFocusChange(View view, boolean z) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
                if (inputMethodManager == null) {
                    return;
                }
                if (z) {
                    inputMethodManager.showSoftInput(view, 1);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zze.zze();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zze.zzd();
    }

    final class zzc implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private zzc() {
        }

        public final void afterTextChanged(Editable editable) {
            try {
                AutocompleteImplFragment.this.zze.zza(editable.toString());
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }

        /* synthetic */ zzc(AutocompleteImplFragment autocompleteImplFragment, zzg zzg) {
            this();
        }
    }

    public final void zza(PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(View view) {
        this.zze.zzf();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(View view) {
        try {
            this.zze.zzc();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        try {
            this.zze.zzb(this.zzg.getText().toString());
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzey zzey = new zzey(this.zzb.zzc(), this.zzb.zza(), this.zzb.zzd(), this.zzd);
            zzes zzes = (zzes) aj.m5365a(this, new zzes.zza(new zzen(this.zza, this.zzb, zzey.zzc()), zzey, this.zzc)).mo6005a(zzes.class);
            this.zze = zzes;
            zzes.zza(bundle);
            requireActivity().getOnBackPressedDispatcher().addCallback(this, new zzg(this, true));
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzef zzef) {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            switch (zzh.zzb[zzef.zza().ordinal()]) {
                case 1:
                    if (TextUtils.isEmpty(this.zzb.zzd())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzd());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 2:
                    this.zzs.submitList(null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 3:
                    this.zzl.setVisibility(0);
                    return;
                case 4:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(zzef.zzc());
                    this.zzo.setVisibility(0);
                    return;
                case 6:
                    this.zzs.submitList(null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(R.string.places_autocomplete_no_results_for_query, zzef.zzb()));
                    this.zzq.setVisibility(0);
                    return;
                case 7:
                    this.zzf.onError(zzef.zzf());
                    return;
                case 8:
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(zzef.zze().getPrimaryText(null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    break;
                case 10:
                    this.zzf.onPlaceSelected(zzef.zzd());
                    return;
                default:
                    return;
            }
            this.zzs.submitList(null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(R.string.places_search_error));
            this.zzq.setVisibility(0);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zze.zza(autocompletePrediction, i);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public static final class zza extends C1034f {
        private final int zza;
        private final PlacesClient zzb;
        private final zzed zzc;
        private final zzfa zzd;
        private final com.google.android.libraries.places.internal.zzb zze = new zzd();

        @Override // androidx.fragment.app.C1034f
        public final Fragment instantiate(ClassLoader classLoader, String str) {
            if (loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class) {
                return new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
            }
            return super.instantiate(classLoader, str);
        }

        public zza(int i, Context context, zzed zzed) {
            this.zza = i;
            Context applicationContext = context.getApplicationContext();
            zzdj zzb2 = zzdj.zza(applicationContext).zza(zzdj.zzb.AUTOCOMPLETE_WIDGET).zzb();
            zzdl zzdl = new zzdl(applicationContext);
            this.zzb = Places.zza(applicationContext, zzb2);
            this.zzc = zzed;
            this.zzd = new zzez(zzdl, zzb2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int identifier;
        try {
            this.zzg = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzi = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzj = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(R.id.places_autocomplete_progress);
            this.zzm = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzb(null));
            EditText editText = this.zzg;
            if (TextUtils.isEmpty(this.zzb.zze())) {
                str = getString(R.string.places_autocomplete_search_hint);
            } else {
                str = this.zzb.zze();
            }
            editText.setHint(str);
            int i = zzh.zza[this.zzb.zza().ordinal()];
            if (i == 1) {
                int zzj2 = this.zzb.zzj();
                int zzk2 = this.zzb.zzk();
                if (Color.alpha(zzj2) < 255) {
                    zzj2 = 0;
                }
                if (zzj2 != 0) {
                    if (zzk2 != 0) {
                        int zza2 = zzej.zza(zzj2, ContextCompat.getColor(requireContext(), R.color.places_text_white_alpha_87), ContextCompat.getColor(requireContext(), R.color.places_text_black_alpha_87));
                        int zza3 = zzej.zza(zzj2, ContextCompat.getColor(requireContext(), R.color.places_text_white_alpha_26), ContextCompat.getColor(requireContext(), R.color.places_text_black_alpha_26));
                        view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(zzj2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            Window window = requireActivity().getWindow();
                            if (!zzej.zzb(zzk2, -1, -16777216)) {
                                window.setStatusBarColor(zzk2);
                            } else if (Build.VERSION.SDK_INT >= 23) {
                                window.setStatusBarColor(zzk2);
                                window.getDecorView().setSystemUiVisibility(8192);
                            }
                        }
                        this.zzg.setTextColor(zza2);
                        this.zzg.setHintTextColor(zza3);
                        zzej.zza((ImageView) this.zzi, zza2);
                        zzej.zza((ImageView) this.zzj, zza2);
                    }
                }
            } else if (i == 2) {
                if (Build.VERSION.SDK_INT >= 19 && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                    requireActivity().getWindow().addFlags(67108864);
                    ViewCompat.m4058b(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
                }
            }
            this.zzi.setOnClickListener(new zzc(this));
            this.zzj.setOnClickListener(new zzb(this));
            this.zzr.setOnClickListener(new zzd(this));
            this.zzs = new zzl(new zze(this));
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzj(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.addOnScrollListener(new zzf(this));
            this.zze.zza().mo5923a(getViewLifecycleOwner(), new zza(this));
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    private AutocompleteImplFragment(int i, PlacesClient placesClient, zzed zzed, zzfa zzfa, com.google.android.libraries.places.internal.zzb zzb2) {
        super(i);
        this.zzt = new zzc(this, null);
        this.zza = placesClient;
        this.zzb = zzed;
        this.zzc = zzfa;
        this.zzd = zzb2;
    }

    /* synthetic */ AutocompleteImplFragment(int i, PlacesClient placesClient, zzed zzed, zzfa zzfa, com.google.android.libraries.places.internal.zzb zzb2, zzg zzg2) {
        this(i, placesClient, zzed, zzfa, zzb2);
    }
}
