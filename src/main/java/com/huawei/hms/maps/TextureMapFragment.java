package com.huawei.hms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.MapFragment;
import com.huawei.hms.maps.internal.HmsUtil;

public class TextureMapFragment extends Fragment {

    /* renamed from: a */
    private final MapFragment.maa f58629a = new MapFragment.maa(this, (byte) 0);

    public static TextureMapFragment newInstance() {
        return new TextureMapFragment();
    }

    public static TextureMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        TextureMapFragment textureMapFragment = new TextureMapFragment();
        textureMapFragment.setArguments(bundle);
        return textureMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mcq.m86886b("MapFragment", "getMapAsync: ");
        this.f58629a.mo83732a(onMapReadyCallback);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        mcq.m86886b("MapFragment", "onAttach: ");
        super.onAttach(activity);
        this.f58629a.f58525f = activity;
    }

    public void onCreate(Bundle bundle) {
        mcq.m86886b("MapFragment", "onCreate: ");
        super.onCreate(bundle);
        this.f58629a.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mcq.m86886b("MapFragment", "onCreateView: ");
        View onCreateView = this.f58629a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        mcq.m86886b("MapFragment", "onDestroy: ");
        this.f58629a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f58629a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mcq.m86886b("MapFragment", "onEnterAmbient: ");
    }

    public final void onExitAmbient() {
        mcq.m86886b("MapFragment", "onExitAmbient: ");
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        mcq.m86886b("MapFragment", "onInflate: ");
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            super.onInflate(activity, attributeSet, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", createFromAttributes);
            setArguments(bundle2);
            this.f58629a.f58525f = activity;
            this.f58629a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        mcq.m86886b("MapFragment", "onLowMemory: ");
        this.f58629a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        mcq.m86886b("MapFragment", "onPause: ");
        this.f58629a.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f58629a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        mcq.m86886b("MapFragment", "onSaveInstanceState: ");
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.f58629a.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        this.f58629a.onStart();
    }

    public void onStop() {
        this.f58629a.onStop();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
