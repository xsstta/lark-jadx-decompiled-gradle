package com.huawei.hms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.mbc;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapFragment extends Fragment {

    /* renamed from: b */
    private static boolean f58523b;

    /* renamed from: a */
    private final maa f58524a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {

        /* renamed from: f */
        Activity f58525f;

        /* renamed from: g */
        private final Fragment f58526g;

        /* renamed from: h */
        private final List<OnMapReadyCallback> f58527h = new ArrayList();

        /* renamed from: i */
        private OnDelegateCreatedListener<mab> f58528i;

        /* renamed from: j */
        private HuaweiMapOptions f58529j;

        /* renamed from: k */
        private boolean f58530k;

        /* renamed from: l */
        private boolean f58531l = false;

        /* renamed from: m */
        private int f58532m = 0;

        /* renamed from: n */
        private boolean f58533n = false;

        /* renamed from: o */
        private boolean f58534o;

        maa(Fragment fragment) {
            this.f58526g = fragment;
        }

        maa(Fragment fragment, byte b) {
            this.f58526g = fragment;
            this.f58534o = true;
        }

        /* renamed from: a */
        private mam m86153a(mag mag, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return this.f58534o ? mag.mo83895c(ObjectWrapper.wrap(context), huaweiMapOptions) : mag.mo83888a(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        private void m86154b() {
            if (!(this.f58525f == null || this.f58528i == null || getDelegate() != null)) {
                mab.m86184a(this.f58525f.getApplicationContext());
                try {
                    MapsInitializer.initialize(this.f58525f);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58525f);
                    if (isHmsAvailable != 0) {
                        mcq.m86889e("MapFragment", "hmsState check failed: ".concat(String.valueOf(isHmsAvailable)));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getApiKey())) {
                        MapClientIdentify.m86146a(mab.m86186c(this.f58525f.getApplicationContext()));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getAppId())) {
                        MapClientIdentify.m86150b(mab.m86185b(this.f58525f.getApplicationContext()));
                    }
                    mag a = mbv.m86514a(this.f58525f);
                    if (a != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b = mbv.m86517b(this.f58525f);
                        this.f58530k = mapClientIdentify.mo83714a(this.f58525f, a);
                        Bundle arguments = this.f58526g.getArguments();
                        if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                            this.f58529j = (HuaweiMapOptions) arguments.getParcelable("HuaweiMapOptions");
                        }
                        mam mam = null;
                        int i = this.f58532m;
                        if (i < 2 && b != null) {
                            this.f58532m = i + 1;
                            mam = m86153a(a, b, this.f58529j);
                        }
                        if (mam != null) {
                            mam.mo83978a(ObjectWrapper.wrap(this.f58525f));
                            this.f58528i.onDelegateCreated(new mab(this.f58526g, mam, this.f58525f));
                            for (OnMapReadyCallback onMapReadyCallback : this.f58527h) {
                                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                            }
                            this.f58527h.clear();
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }

        /* renamed from: a */
        public final void mo83732a(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            } else {
                this.f58527h.add(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!MapFragment.f58523b) {
                this.f58528i = onDelegateCreatedListener;
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    m86154b();
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements MapLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f58535a;

        /* renamed from: b */
        private final mam f58536b;

        /* renamed from: c */
        private Activity f58537c;

        /* renamed from: d */
        private boolean f58538d;

        public mab(Fragment fragment, mam mam, Activity activity) {
            this.f58536b = (mam) Preconditions.checkNotNull(mam);
            this.f58535a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f58537c = activity;
        }

        /* renamed from: a */
        private static void m86156a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.m86145a((Context) null);
            mbv.m86515a();
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public final void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f58536b.mo83980a(new mbc.maa() {
                    /* class com.huawei.hms.maps.MapFragment.mab.BinderC236881 */

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
                Bundle arguments = this.f58535a.getArguments();
                if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                    mbw.m86523a(a, "HuaweiMapOptions", arguments.getParcelable("HuaweiMapOptions"));
                }
                this.f58536b.mo83976a();
                mbw.m86521a(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return maa.m86183a(this.f58537c, this.f58536b, viewGroup, bundle);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f58536b.mo83984e();
                if (!this.f58538d) {
                    mcq.m86886b("MapFragment", "clearResource in onDestroy method");
                    m86156a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f58536b.mo83983d();
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
                    this.f58536b.mo83979a(ObjectWrapper.wrap(activity), huaweiMapOptions, a);
                    mbw.m86521a(a);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mcq.m86889e("MapFragment", "onInflate Bundle is null!");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f58536b.mo83985f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f58536b.mo83982c();
                Activity activity = this.f58537c;
                if (activity != null && activity.isFinishing()) {
                    mcq.m86886b("MapFragment", "clearResource in onPause method");
                    m86156a();
                    this.f58538d = true;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.f58536b.mo83981b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58536b.mo83977a(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f58536b.mo83986g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f58536b.mo83987h();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mcq.m86886b("MapFragment", "getMapAsync: ");
        this.f58524a.mo83732a(onMapReadyCallback);
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
        this.f58524a.f58525f = activity;
    }

    public void onCreate(Bundle bundle) {
        mcq.m86886b("MapFragment", "onCreate: ");
        super.onCreate(bundle);
        f58523b = true;
        mbv.m86519c(getActivity());
        mbv.m86518b();
        this.f58524a.onCreate(bundle);
        MapClientIdentify.m86144a(System.currentTimeMillis());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mcq.m86886b("MapFragment", "onCreateView: ");
        if (MapClientIdentify.m86142a() == 0) {
            MapClientIdentify.m86144a(System.currentTimeMillis());
        }
        View onCreateView = this.f58524a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        mcq.m86886b("MapFragment", "onDestroy: ");
        this.f58524a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f58524a.onDestroyView();
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
            this.f58524a.f58525f = activity;
            this.f58524a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        mcq.m86886b("MapFragment", "onLowMemory: ");
        this.f58524a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        mcq.m86886b("MapFragment", "onPause: ");
        this.f58524a.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        f58523b = false;
        this.f58524a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        mcq.m86886b("MapFragment", "onSaveInstanceState: ");
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.f58524a.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        this.f58524a.onStart();
    }

    public void onStop() {
        this.f58524a.onStop();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
