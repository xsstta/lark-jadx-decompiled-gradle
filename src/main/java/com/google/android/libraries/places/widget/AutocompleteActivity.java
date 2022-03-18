package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.internal.zzft;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    private static boolean zzc = true;
    private int zza;
    private int zzb;

    public void AutocompleteActivity__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Context AutocompleteActivity__createConfigurationContext$___twin___(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    public AssetManager AutocompleteActivity__getAssets$___twin___() {
        return super.getAssets();
    }

    public Resources AutocompleteActivity__getResources$___twin___() {
        return super.getResources();
    }

    public void AutocompleteActivity__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(this, configuration);
    }

    public AssetManager getAssets() {
        return com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_getResources(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        com_google_android_libraries_places_widget_AutocompleteActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(Place place) {
        zza(-1, place, Status.RESULT_SUCCESS);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(Status status) {
        int i;
        if (status.isCanceled()) {
            i = 0;
        } else {
            i = 2;
        }
        zza(i, (Place) null, status);
    }

    public static AssetManager com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(AutocompleteActivity autocompleteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autocompleteActivity);
        }
        return autocompleteActivity.AutocompleteActivity__getAssets$___twin___();
    }

    public static Resources com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_getResources(AutocompleteActivity autocompleteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autocompleteActivity);
        }
        return autocompleteActivity.AutocompleteActivity__getResources$___twin___();
    }

    public static void com_google_android_libraries_places_widget_AutocompleteActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AutocompleteActivity autocompleteActivity) {
        autocompleteActivity.AutocompleteActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AutocompleteActivity autocompleteActivity2 = autocompleteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    autocompleteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        boolean z;
        try {
            zzft.zzb(Places.isInitialized(), "Places must be initialized.");
            if (zzc) {
                if (getCallingActivity() != null) {
                    z = true;
                } else {
                    z = false;
                }
                zzft.zzb(z, "Cannot find caller. startActivityForResult should be used.");
            }
            zzed zzed = (zzed) zzft.zza((zzed) getIntent().getParcelableExtra("places/AutocompleteOptions"));
            int i = zzb.zza[zzed.zza().ordinal()];
            if (i == 1) {
                this.zza = R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzb = R.style.PlacesAutocompleteOverlay;
            } else if (i == 2) {
                this.zza = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzb = R.style.PlacesAutocompleteFullscreen;
            }
            getSupportFragmentManager().setFragmentFactory(new AutocompleteImplFragment.zza(this.zza, this, zzed));
            setTheme(this.zzb);
            super.onCreate(bundle);
            AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().findFragmentById(R.id.places_autocomplete_content);
            autocompleteImplFragment.zza(this);
            findViewById(16908290).setOnTouchListener(new zza(this, autocompleteImplFragment));
            if (zzed.zzb().isEmpty()) {
                zza(2, (Place) null, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public static void com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(AutocompleteActivity autocompleteActivity, Context context) {
        autocompleteActivity.AutocompleteActivity__attachBaseContext$___twin___(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autocompleteActivity);
        }
    }

    public static Context com_google_android_libraries_places_widget_AutocompleteActivity_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(AutocompleteActivity autocompleteActivity, Configuration configuration) {
        Context AutocompleteActivity__createConfigurationContext$___twin___ = autocompleteActivity.AutocompleteActivity__createConfigurationContext$___twin___(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", AutocompleteActivity__createConfigurationContext$___twin___);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(AutocompleteActivity__createConfigurationContext$___twin___);
    }

    private final void zza(int i, Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(AutocompleteImplFragment autocompleteImplFragment, View view, MotionEvent motionEvent) {
        View view2 = autocompleteImplFragment.getView();
        if (view2 == null || motionEvent.getY() <= ((float) view2.getBottom())) {
            return false;
        }
        zza(0, (Place) null, new Status(16));
        return true;
    }
}
