package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
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

/* renamed from: com.google.android.gms.maps.i */
public class C22021i extends Fragment {

    /* renamed from: a */
    private final C22023b f53528a = new C22023b(this);

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.i$a */
    public static class C22022a implements AbstractC22025b {

        /* renamed from: a */
        private final Fragment f53529a;

        /* renamed from: b */
        private final IStreetViewPanoramaFragmentDelegate f53530b;

        public C22022a(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.f53530b = (IStreetViewPanoramaFragmentDelegate) Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.f53529a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                C22027d.m79515a(bundle2, bundle3);
                this.f53530b.onInflate(ObjectWrapper.wrap(activity), null, bundle3);
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
                Bundle arguments = this.f53529a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    C22027d.m79516a(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f53530b.onCreate(bundle2);
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
                IObjectWrapper onCreateView = this.f53530b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
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
                this.f53530b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53530b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53530b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53530b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            try {
                this.f53530b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53530b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53530b.onLowMemory();
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
                this.f53530b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74534a(AbstractC22012f fVar) {
            try {
                this.f53530b.getStreetViewPanoramaAsync(new zzal(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.i$b */
    static class C22023b extends AbstractC21818a<C22022a> {

        /* renamed from: a */
        private final Fragment f53531a;

        /* renamed from: b */
        private AbstractC21821c<C22022a> f53532b;

        /* renamed from: c */
        private Activity f53533c;

        /* renamed from: d */
        private final List<AbstractC22012f> f53534d = new ArrayList();

        C22023b(Fragment fragment) {
            this.f53531a = fragment;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C22022a> cVar) {
            this.f53532b = cVar;
            m79510i();
        }

        /* renamed from: i */
        private final void m79510i() {
            if (this.f53533c != null && this.f53532b != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53533c);
                    this.f53532b.mo73903a(new C22022a(this.f53531a, C22028e.m79517a(this.f53533c).zzd(ObjectWrapper.wrap(this.f53533c))));
                    for (AbstractC22012f fVar : this.f53534d) {
                        ((C22022a) mo73877a()).mo74534a(fVar);
                    }
                    this.f53534d.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private final void m79508a(Activity activity) {
            this.f53533c = activity;
            m79510i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f53528a.m79508a((C22023b) activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f53528a.m79508a((C22023b) activity);
            this.f53528a.mo73878a(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53528a.mo73879a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f53528a.mo73876a(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f53528a.mo73882b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f53528a.mo73884c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f53528a.mo73885d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f53528a.mo73886e();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f53528a.mo73887f();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f53528a.mo73888g();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        this.f53528a.mo73889h();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C22021i.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C22021i.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f53528a.mo73883b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
