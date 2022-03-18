package com.huawei.hms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.mbn;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final maa f58565a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {

        /* renamed from: f */
        final List<OnStreetViewPanoramaReadyCallback> f58566f = new ArrayList();

        /* renamed from: g */
        boolean f58567g = false;

        /* renamed from: h */
        private final Fragment f58568h;

        /* renamed from: i */
        private OnDelegateCreatedListener<mab> f58569i;

        /* renamed from: j */
        private Activity f58570j;

        /* renamed from: k */
        private StreetViewPanoramaOptions f58571k;

        /* renamed from: l */
        private boolean f58572l = false;

        maa(Fragment fragment) {
            this.f58568h = fragment;
        }

        /* renamed from: a */
        static /* synthetic */ void m86163a(maa maa, Activity activity) {
            maa.f58570j = activity;
            maa.m86165c();
        }

        /* renamed from: b */
        private boolean m86164b() {
            return this.f58570j == null || this.f58569i == null || getDelegate() != null;
        }

        /* renamed from: c */
        private void m86165c() {
            if (!m86164b()) {
                try {
                    m86166d();
                    mag a = mbv.m86514a(this.f58570j);
                    if (a != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b = mbv.m86517b(this.f58570j);
                        this.f58572l = mapClientIdentify.mo83714a(this.f58570j, a);
                        Bundle arguments = this.f58568h.getArguments();
                        if (arguments != null && arguments.containsKey("StreetOptions")) {
                            this.f58571k = (StreetViewPanoramaOptions) arguments.getParcelable("StreetOptions");
                        }
                        mbr b2 = a.mo83893b(ObjectWrapper.wrap(b), this.f58571k);
                        if (b2 == null) {
                            b2 = m86167e();
                        }
                        if (b2 != null) {
                            this.f58569i.onDelegateCreated(new mab(this.f58568h, b2, this.f58570j));
                            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f58566f) {
                                ((mab) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                            }
                            this.f58566f.clear();
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }

        /* renamed from: d */
        private boolean m86166d() {
            MapsInitializer.initialize(this.f58570j);
            int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58570j);
            if (isHmsAvailable == 0) {
                return true;
            }
            mcq.m86889e("StreetViewPanoramaFragm", "hmsState check failed: ".concat(String.valueOf(isHmsAvailable)));
            return true;
        }

        /* renamed from: e */
        private mbr m86167e() {
            try {
                Context b = mbv.m86517b(this.f58570j);
                int i = 1;
                while (!this.f58572l && i < 30) {
                    try {
                        mcq.m86886b("StreetViewPanoramaFragm", "sdk waitTime : " + i + "onCreateView :" + this.f58572l);
                        i++;
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        mcq.m86889e("StreetViewPanoramaFragm", " InterruptedException: " + e.getMessage());
                    }
                }
                mag a = mbv.m86514a(this.f58570j);
                mbr b2 = a.mo83893b(ObjectWrapper.wrap(b), this.f58571k);
                mcq.m86887c("StreetViewPanoramaFragm", "sdk onCreateView loop creator ".concat(String.valueOf(a)));
                return b2;
            } catch (RemoteException e2) {
                mcq.m86889e("StreetViewPanoramaFragm", "RemoteException: " + e2.toString());
                return null;
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!this.f58567g) {
                this.f58567g = true;
                this.f58569i = onDelegateCreatedListener;
                m86165c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements StreetLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f58573a;

        /* renamed from: b */
        private mbr f58574b;

        /* renamed from: c */
        private Activity f58575c;

        public mab(Fragment fragment, mbr mbr, Activity activity) {
            this.f58574b = (mbr) Preconditions.checkNotNull(mbr);
            this.f58573a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f58575c = activity;
        }

        @Override // com.huawei.hms.maps.StreetLifecycleDelegate
        public final void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f58574b.mo84067a(new mbn.maa() {
                    /* class com.huawei.hms.maps.StreetViewPanoramaFragment.mab.BinderC236931 */
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                Bundle arguments = this.f58573a.getArguments();
                if (arguments != null && arguments.containsKey("StreetOptions")) {
                    mbw.m86523a(a, "StreetOptions", arguments.getParcelable("StreetOptions"));
                }
                this.f58574b.mo84065a(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view;
            try {
                Bundle a = mbw.m86521a(bundle);
                Context b = mbv.m86517b(this.f58575c);
                if (this.f58574b != null) {
                    mcq.m86887c("StreetViewPanoramaFragm", "sdk onCreateView iStreetViewPanoramaFragmentDelegate" + this.f58574b);
                    view = (View) ObjectWrapper.unwrap(this.f58574b.mo84063a(ObjectWrapper.wrap(LayoutInflater.from(b)), ObjectWrapper.wrap(viewGroup), a));
                } else {
                    view = LayoutInflater.from(b).inflate(R.layout.empty_layout, (ViewGroup) null);
                }
                mbw.m86521a(a);
                return view;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f58574b.mo84064a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f58574b.mo84068b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) bundle.getParcelable("StreetOptions");
                try {
                    Bundle a = mbw.m86521a(bundle2);
                    this.f58574b.mo84066a(ObjectWrapper.wrap(activity), streetViewPanoramaOptions, a);
                    mbw.m86521a(a);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mcq.m86889e("StreetViewPanoramaFragm", "onInflate Bundle is null!");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f58574b.mo84070c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f58574b.mo84071d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                mcq.m86886b("StreetViewPanoramaFragm", "StreetFragmentDelegate:onResume");
                this.f58574b.mo84072e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                new Bundle();
                Bundle a = mbw.m86521a(bundle);
                this.f58574b.mo84069b(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                mcq.m86886b("StreetViewPanoramaFragm", "StreetFragmentDelegate:onStart");
                this.f58574b.mo84073f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f58574b.mo84074g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        mcq.m86887c("StreetViewPanoramaFragm", "StreetViewPanoramaFragment construct");
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mcq.m86886b("StreetViewPanoramaFragm", "getStreetViewPanoramaAsync");
        maa maa2 = this.f58565a;
        if (maa2.getDelegate() != null) {
            ((mab) maa2.getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            maa2.f58566f.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        mcq.m86886b("StreetViewPanoramaFragm", "onAttach");
        super.onAttach(activity);
        maa.m86163a(this.f58565a, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58565a.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.f58565a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        this.f58565a.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f58565a.onDestroyView();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mcq.m86886b("StreetViewPanoramaFragm", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("CONSTANTS_STREET_OPTIONS", streetViewPanoramaOptions);
            maa.m86163a(this.f58565a, activity);
            this.f58565a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f58565a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        super.onPause();
        this.f58565a.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f58565a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f58565a.onStart();
    }

    public void onStop() {
        this.f58565a.onStop();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
