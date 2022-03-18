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
import com.google.android.gms.maps.internal.AbstractC22024a;
import com.google.android.gms.maps.internal.C22027d;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.h */
public class C22018h extends Fragment {

    /* renamed from: a */
    private final C22020b f53521a = new C22020b(this);

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.h$a */
    public static class C22019a implements AbstractC22024a {

        /* renamed from: a */
        private final Fragment f53522a;

        /* renamed from: b */
        private final IMapFragmentDelegate f53523b;

        public C22019a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f53523b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f53522a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C22027d.m79515a(bundle2, bundle3);
                this.f53523b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
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
                Bundle arguments = this.f53522a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    C22027d.m79516a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f53523b.onCreate(bundle2);
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
                IObjectWrapper onCreateView = this.f53523b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
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
                this.f53523b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53523b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53523b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53523b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            try {
                this.f53523b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53523b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53523b.onLowMemory();
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
                this.f53523b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74533a(AbstractC22011e eVar) {
            try {
                this.f53523b.getMapAsync(new zzak(this, eVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.h$b */
    static class C22020b extends AbstractC21818a<C22019a> {

        /* renamed from: a */
        private final Fragment f53524a;

        /* renamed from: b */
        private AbstractC21821c<C22019a> f53525b;

        /* renamed from: c */
        private Activity f53526c;

        /* renamed from: d */
        private final List<AbstractC22011e> f53527d = new ArrayList();

        C22020b(Fragment fragment) {
            this.f53524a = fragment;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C22019a> cVar) {
            this.f53525b = cVar;
            m79494i();
        }

        /* renamed from: i */
        private final void m79494i() {
            if (this.f53526c != null && this.f53525b != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53526c);
                    IMapFragmentDelegate zzc = C22028e.m79517a(this.f53526c).zzc(ObjectWrapper.wrap(this.f53526c));
                    if (zzc != null) {
                        this.f53525b.mo73903a(new C22019a(this.f53524a, zzc));
                        for (AbstractC22011e eVar : this.f53527d) {
                            ((C22019a) mo73877a()).mo74533a(eVar);
                        }
                        this.f53527d.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private final void m79492a(Activity activity) {
            this.f53526c = activity;
            m79494i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f53521a.m79492a((C22020b) activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f53521a.m79492a((C22020b) activity);
            GoogleMapOptions a = GoogleMapOptions.m79370a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            this.f53521a.mo73878a(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53521a.mo73879a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f53521a.mo73876a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f53521a.mo73884c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f53521a.mo73885d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f53521a.mo73882b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f53521a.mo73886e();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f53521a.mo73887f();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f53521a.mo73888g();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        this.f53521a.mo73889h();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C22018h.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C22018h.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f53521a.mo73883b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
