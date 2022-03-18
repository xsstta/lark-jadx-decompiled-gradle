package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.mbc;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    private static boolean f58600a;

    /* renamed from: b */
    private final maa f58601b = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {

        /* renamed from: f */
        Activity f58602f;

        /* renamed from: g */
        private final Fragment f58603g;

        /* renamed from: h */
        private final List<OnMapReadyCallback> f58604h = new ArrayList();

        /* renamed from: i */
        private OnDelegateCreatedListener<mab> f58605i;

        /* renamed from: j */
        private HuaweiMapOptions f58606j;

        /* renamed from: k */
        private boolean f58607k = false;

        /* renamed from: l */
        private int f58608l = 0;

        /* renamed from: m */
        private boolean f58609m;

        maa(Fragment fragment) {
            this.f58603g = fragment;
        }

        maa(Fragment fragment, byte b) {
            this.f58603g = fragment;
            this.f58609m = true;
        }

        /* renamed from: a */
        private mam m86169a(mag mag, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return this.f58609m ? mag.mo83895c(ObjectWrapper.wrap(context), huaweiMapOptions) : mag.mo83888a(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        private void m86170b() {
            if (!(this.f58602f == null || this.f58605i == null || getDelegate() != null)) {
                mab.m86184a(this.f58602f.getApplicationContext());
                try {
                    MapsInitializer.initialize(this.f58602f);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58602f);
                    if (isHmsAvailable != 0) {
                        mcq.m86889e("SupportMapFragment", "hmsState check failed: ".concat(String.valueOf(isHmsAvailable)));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getApiKey())) {
                        MapClientIdentify.m86146a(mab.m86186c(this.f58602f.getApplicationContext()));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getAppId())) {
                        MapClientIdentify.m86150b(mab.m86185b(this.f58602f.getApplicationContext()));
                    }
                    mag a = mbv.m86514a(this.f58602f);
                    if (a != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b = mbv.m86517b(this.f58602f);
                        this.f58607k = mapClientIdentify.mo83714a(this.f58602f, a);
                        Bundle arguments = this.f58603g.getArguments();
                        if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                            this.f58606j = (HuaweiMapOptions) arguments.getParcelable("HuaweiMapOptions");
                        }
                        mam mam = null;
                        int i = this.f58608l;
                        if (i < 2 && b != null) {
                            this.f58608l = i + 1;
                            mam = m86169a(a, b, this.f58606j);
                        }
                        if (mam != null) {
                            mam.mo83978a(ObjectWrapper.wrap(this.f58602f));
                            this.f58605i.onDelegateCreated(new mab(this.f58603g, mam, this.f58602f));
                            for (OnMapReadyCallback onMapReadyCallback : this.f58604h) {
                                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                            }
                            this.f58604h.clear();
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }

        /* renamed from: a */
        public final void mo83836a(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            } else {
                this.f58604h.add(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!SupportMapFragment.f58600a) {
                this.f58605i = onDelegateCreatedListener;
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    m86170b();
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements MapLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f58610a;

        /* renamed from: b */
        private final mam f58611b;

        /* renamed from: c */
        private Activity f58612c;

        /* renamed from: d */
        private boolean f58613d;

        public mab(Fragment fragment, mam mam, Activity activity) {
            this.f58611b = (mam) Preconditions.checkNotNull(mam);
            this.f58610a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f58612c = activity;
        }

        /* renamed from: a */
        private static void m86172a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.m86145a((Context) null);
            mbv.m86515a();
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public final void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f58611b.mo83980a(new mbc.maa() {
                    /* class com.huawei.hms.maps.SupportMapFragment.mab.BinderC236961 */

                    @Override // com.huawei.hms.maps.mbc
                    /* renamed from: a */
                    public final void mo83734a(mai mai) {
                        onMapReadyCallback.onMapReady(new HuaweiMap(mai));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                Bundle arguments = this.f58610a.getArguments();
                if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                    mbw.m86523a(a, "HuaweiMapOptions", arguments.getParcelable("HuaweiMapOptions"));
                }
                this.f58611b.mo83976a();
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return maa.m86183a(this.f58612c, this.f58611b, viewGroup, bundle);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f58611b.mo83984e();
                if (!this.f58613d) {
                    mcq.m86886b("SupportMapFragment", "clearResource in onDestroy method");
                    m86172a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f58611b.mo83983d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                HuaweiMapOptions huaweiMapOptions = (HuaweiMapOptions) bundle.getParcelable("HuaweiMapOptions");
                try {
                    Bundle a = mbw.m86521a(bundle2);
                    this.f58611b.mo83979a(ObjectWrapper.wrap(activity), huaweiMapOptions, a);
                    mbw.m86521a(a);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mcq.m86889e("SupportMapFragment", "onInflate Bundle is null!");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f58611b.mo83985f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f58611b.mo83982c();
                Activity activity = this.f58612c;
                if (activity != null && activity.isFinishing()) {
                    mcq.m86886b("SupportMapFragment", "clearResource in onPause method");
                    m86172a();
                    this.f58613d = true;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.f58611b.mo83981b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58611b.mo83977a(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f58611b.mo83986g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f58611b.mo83987h();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        mcq.m86887c("SupportMapFragment", "SupportMapFragment construct");
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mcq.m86886b("SupportMapFragment", "getMapAsync: ");
        this.f58601b.mo83836a(onMapReadyCallback);
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
        mcq.m86886b("SupportMapFragment", "onAttach");
        super.onAttach(activity);
        this.f58601b.f58602f = activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        f58600a = true;
        mbv.m86519c(getActivity());
        mbv.m86518b();
        super.onCreate(bundle);
        this.f58601b.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.f58601b.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        mcq.m86886b("SupportMapFragment", "onDestroy");
        this.f58601b.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        mcq.m86886b("SupportMapFragment", "onDestroyView");
        this.f58601b.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mcq.m86886b("SupportMapFragment", "onEnterAmbient: ");
    }

    public final void onExitAmbient() {
        mcq.m86886b("SupportMapFragment", "onExitAmbient: ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        mcq.m86886b("SupportMapFragment", "onInflate");
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mcq.m86886b("SupportMapFragment", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", createFromAttributes);
            setArguments(bundle2);
            this.f58601b.f58602f = activity;
            this.f58601b.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        mcq.m86886b("SupportMapFragment", "onLowMemory");
        this.f58601b.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f58601b.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f58600a = false;
        this.f58601b.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        mcq.m86886b("SupportMapFragment", "onSaveInstanceState");
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.f58601b.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f58601b.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f58601b.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
