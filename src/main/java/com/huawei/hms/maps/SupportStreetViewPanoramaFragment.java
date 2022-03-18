package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
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
import com.huawei.hms.maps.mbn;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class SupportStreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final maa f58616a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {

        /* renamed from: f */
        final List<OnStreetViewPanoramaReadyCallback> f58617f = new ArrayList();

        /* renamed from: g */
        boolean f58618g = false;

        /* renamed from: h */
        private final Fragment f58619h;

        /* renamed from: i */
        private OnDelegateCreatedListener<mab> f58620i;

        /* renamed from: j */
        private Activity f58621j;

        /* renamed from: k */
        private StreetViewPanoramaOptions f58622k;

        /* renamed from: l */
        private boolean f58623l = false;

        maa(Fragment fragment) {
            this.f58619h = fragment;
        }

        /* renamed from: a */
        static /* synthetic */ void m86174a(maa maa, Activity activity) {
            maa.f58621j = activity;
            maa.m86178c();
        }

        /* renamed from: a */
        private void m86175a(mbr mbr) {
            this.f58620i.onDelegateCreated(new mab(this.f58619h, mbr, this.f58621j));
            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f58617f) {
                ((mab) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            }
            this.f58617f.clear();
        }

        /* renamed from: a */
        private void m86176a(mbr mbr, int i) {
            while (!this.f58623l && mbr == null && i < 30) {
                try {
                    mcq.m86886b("SupportStreetViewPanoramaFragment", "sdk waitTime : " + i + "onCreateView :" + this.f58623l);
                    i++;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    mcq.m86889e("SupportStreetViewPanoramaFragment", " InterruptedException: " + e.getMessage());
                }
            }
        }

        /* renamed from: b */
        private boolean m86177b() {
            return this.f58621j == null || this.f58620i == null || getDelegate() != null;
        }

        /* renamed from: c */
        private void m86178c() {
            if (!m86177b()) {
                try {
                    MapsInitializer.initialize(this.f58621j);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58621j);
                    if (isHmsAvailable != 0) {
                        mcq.m86889e("SupportStreetViewPanoramaFragment", "hmsState check failed: ".concat(String.valueOf(isHmsAvailable)));
                    }
                    mag a = mbv.m86514a(this.f58621j);
                    if (a != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b = mbv.m86517b(this.f58621j);
                        this.f58623l = mapClientIdentify.mo83714a(this.f58621j, a);
                        Bundle arguments = this.f58619h.getArguments();
                        if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                            this.f58622k = (StreetViewPanoramaOptions) arguments.getParcelable("HuaweiMapOptions");
                        }
                        mbr b2 = a.mo83893b(ObjectWrapper.wrap(b), this.f58622k);
                        if (b2 == null) {
                            try {
                                Context b3 = mbv.m86517b(this.f58621j);
                                m86176a(b2, 1);
                                mag a2 = mbv.m86514a(this.f58621j);
                                b2 = a2.mo83893b(ObjectWrapper.wrap(b3), this.f58622k);
                                mcq.m86887c("SupportStreetViewPanoramaFragment", "sdk onCreateView loop creator".concat(String.valueOf(a2)));
                            } catch (RemoteException e) {
                                mcq.m86889e("SupportStreetViewPanoramaFragment", "RemoteException: " + e.toString());
                            }
                        }
                        if (b2 != null) {
                            m86175a(b2);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!this.f58618g) {
                this.f58618g = true;
                this.f58620i = onDelegateCreatedListener;
                m86178c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements StreetLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f58624a;

        /* renamed from: b */
        private final mbr f58625b;

        /* renamed from: c */
        private Activity f58626c;

        public mab(Fragment fragment, mbr mbr, Activity activity) {
            this.f58625b = (mbr) Preconditions.checkNotNull(mbr);
            this.f58624a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f58626c = activity;
        }

        @Override // com.huawei.hms.maps.StreetLifecycleDelegate
        public final void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f58625b.mo84067a(new mbn.maa() {
                    /* class com.huawei.hms.maps.SupportStreetViewPanoramaFragment.mab.BinderC236971 */
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                Bundle arguments = this.f58624a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewOptions")) {
                    mbw.m86523a(a, "StreetViewOptions", arguments.getParcelable("StreetViewOptions"));
                }
                this.f58625b.mo84065a(a);
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
                Context b = mbv.m86517b(this.f58626c);
                if (this.f58625b != null) {
                    mcq.m86887c("SupportStreetViewPanoramaFragment", "sdk onCreateView iStreetViewFragmentDelegate" + this.f58625b);
                    view = (View) ObjectWrapper.unwrap(this.f58625b.mo84063a(ObjectWrapper.wrap(LayoutInflater.from(b)), ObjectWrapper.wrap(viewGroup), a));
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
                this.f58625b.mo84064a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f58625b.mo84068b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) bundle.getParcelable("StreetViewOptions");
                try {
                    mcq.m86886b("SupportStreetViewPanoramaFragment", "SupportStreetViewPanoramaFragment:onInflate");
                    Bundle a = mbw.m86521a(bundle2);
                    this.f58625b.mo84066a(ObjectWrapper.wrap(activity), streetViewPanoramaOptions, a);
                    mbw.m86521a(a);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mcq.m86889e("SupportStreetViewPanoramaFragment", "onInflate Bundle is null!");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f58625b.mo84070c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f58625b.mo84071d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.f58625b.mo84072e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58625b.mo84069b(bundle);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f58625b.mo84073f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f58625b.mo84074g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static SupportStreetViewPanoramaFragment newInstance() {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        mcq.m86887c("SupportStreetViewPanoramaFragment", "SupportStreetViewPanoramaFragment construct");
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mcq.m86886b("SupportStreetViewPanoramaFragment", "getStreetViewPanoramaAsync: ");
        maa maa2 = this.f58616a;
        if (maa2.getDelegate() != null) {
            ((mab) maa2.getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            maa2.f58617f.add(onStreetViewPanoramaReadyCallback);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        mcq.m86886b("SupportStreetViewPanoramaFragment", "onAttach");
        super.onAttach(activity);
        maa.m86174a(this.f58616a, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58616a.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.f58616a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f58616a.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f58616a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mcq.m86886b("SupportStreetViewPanoramaFragment", "onEnterAmbient: ");
    }

    public final void onExitAmbient() {
        mcq.m86886b("SupportStreetViewPanoramaFragment", "onExitAmbient: ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mcq.m86886b("SupportStreetViewPanoramaFragment", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("StreetViewOptions", streetViewPanoramaOptions);
            maa.m86174a(this.f58616a, activity);
            this.f58616a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        this.f58616a.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f58616a.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f58616a.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.f58616a.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f58616a.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f58616a.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
