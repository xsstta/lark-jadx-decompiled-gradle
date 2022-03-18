package com.huawei.hms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.maps.SupportMapFragment;
import com.huawei.hms.maps.internal.HmsUtil;

public class TextureSupportMapFragment extends Fragment {

    /* renamed from: a */
    private final SupportMapFragment.maa f58631a = new SupportMapFragment.maa(this, (byte) 0);

    public static TextureSupportMapFragment newInstance() {
        return new TextureSupportMapFragment();
    }

    public static TextureSupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        mcq.m86887c("TextureSupportFragment", "TextureSupportMapFragment construct");
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        TextureSupportMapFragment textureSupportMapFragment = new TextureSupportMapFragment();
        textureSupportMapFragment.setArguments(bundle);
        return textureSupportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mcq.m86886b("TextureSupportFragment", "getMapAsync: ");
        this.f58631a.mo83836a(onMapReadyCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        mcq.m86886b("TextureSupportFragment", "onAttach");
        super.onAttach(activity);
        this.f58631a.f58602f = activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58631a.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.f58631a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        mcq.m86886b("TextureSupportFragment", "onDestroy");
        this.f58631a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        mcq.m86886b("TextureSupportFragment", "onDestroyView");
        this.f58631a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mcq.m86886b("TextureSupportFragment", "onEnterAmbient: ");
    }

    public final void onExitAmbient() {
        mcq.m86886b("TextureSupportFragment", "onExitAmbient: ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        mcq.m86886b("TextureSupportFragment", "onInflate");
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mcq.m86886b("TextureSupportFragment", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", createFromAttributes);
            setArguments(bundle2);
            this.f58631a.f58602f = activity;
            this.f58631a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        mcq.m86886b("TextureSupportFragment", "onLowMemory");
        this.f58631a.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f58631a.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f58631a.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        mcq.m86886b("TextureSupportFragment", "onSaveInstanceState");
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.f58631a.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f58631a.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f58631a.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
