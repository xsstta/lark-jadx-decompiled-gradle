package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.AbstractC21818a;
import com.google.android.gms.dynamic.AbstractC21821c;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.AbstractC22025b;
import com.google.android.gms.maps.internal.C22027d;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final C22003b f53491a = new C22003b(this);

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$a */
    public static class C22002a implements AbstractC22025b {

        /* renamed from: a */
        private final Fragment f53492a;

        /* renamed from: b */
        private final IStreetViewPanoramaFragmentDelegate f53493b;

        public C22002a(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.f53493b = (IStreetViewPanoramaFragmentDelegate) Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.f53492a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                C22027d.m79515a(bundle2, bundle3);
                this.f53493b.onInflate(ObjectWrapper.wrap(activity), null, bundle3);
                C22027d.m79515a(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73895a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C22027d.m79515a(bundle, bundle2);
                Bundle arguments = this.f53492a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    C22027d.m79516a(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f53493b.onCreate(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final View mo73892a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C22027d.m79515a(bundle, bundle2);
                IObjectWrapper onCreateView = this.f53493b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                C22027d.m79515a(bundle2, bundle);
                return (View) ObjectWrapper.unwrap(onCreateView);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73893a() {
            try {
                this.f53493b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53493b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53493b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53493b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            try {
                this.f53493b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53493b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53493b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73897b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C22027d.m79515a(bundle, bundle2);
                this.f53493b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74515a(AbstractC22012f fVar) {
            try {
                this.f53493b.getStreetViewPanoramaAsync(new zzah(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$b */
    static class C22003b extends AbstractC21818a<C22002a> {

        /* renamed from: a */
        private final Fragment f53494a;

        /* renamed from: b */
        private AbstractC21821c<C22002a> f53495b;

        /* renamed from: c */
        private Activity f53496c;

        /* renamed from: d */
        private final List<AbstractC22012f> f53497d = new ArrayList();

        C22003b(Fragment fragment) {
            this.f53494a = fragment;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C22002a> cVar) {
            this.f53495b = cVar;
            m79445i();
        }

        /* renamed from: i */
        private final void m79445i() {
            if (this.f53496c != null && this.f53495b != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53496c);
                    this.f53495b.mo73903a(new C22002a(this.f53494a, C22028e.m79517a(this.f53496c).zzd(ObjectWrapper.wrap(this.f53496c))));
                    for (AbstractC22012f fVar : this.f53497d) {
                        ((C22002a) mo73877a()).mo74515a(fVar);
                    }
                    this.f53497d.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private final void m79443a(Activity activity) {
            this.f53496c = activity;
            m79445i();
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f53491a.m79443a((C22003b) activity);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f53491a.m79443a((C22003b) activity);
            this.f53491a.mo73878a(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53491a.mo73879a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f53491a.mo73876a(layoutInflater, viewGroup, bundle);
    }

    public void onStart() {
        super.onStart();
        this.f53491a.mo73882b();
    }

    public void onResume() {
        super.onResume();
        this.f53491a.mo73884c();
    }

    public void onPause() {
        this.f53491a.mo73885d();
        super.onPause();
    }

    public void onStop() {
        this.f53491a.mo73886e();
        super.onStop();
    }

    public void onDestroyView() {
        this.f53491a.mo73887f();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f53491a.mo73888g();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f53491a.mo73889h();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f53491a.mo73883b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
