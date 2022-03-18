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
import com.google.android.gms.maps.internal.AbstractC22024a;
import com.google.android.gms.maps.internal.C22027d;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapFragment extends Fragment {

    /* renamed from: a */
    private final C21999b f53475a = new C21999b(this);

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    public static class C21998a implements AbstractC22024a {

        /* renamed from: a */
        private final Fragment f53476a;

        /* renamed from: b */
        private final IMapFragmentDelegate f53477b;

        public C21998a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f53477b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f53476a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C22027d.m79515a(bundle2, bundle3);
                this.f53477b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
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
                Bundle arguments = this.f53476a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    C22027d.m79516a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f53477b.onCreate(bundle2);
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
                IObjectWrapper onCreateView = this.f53477b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
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
                this.f53477b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53477b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53477b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53477b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            try {
                this.f53477b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53477b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53477b.onLowMemory();
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
                this.f53477b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74492a(AbstractC22011e eVar) {
            try {
                this.f53477b.getMapAsync(new zzab(this, eVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    static class C21999b extends AbstractC21818a<C21998a> {

        /* renamed from: a */
        private final Fragment f53478a;

        /* renamed from: b */
        private AbstractC21821c<C21998a> f53479b;

        /* renamed from: c */
        private Activity f53480c;

        /* renamed from: d */
        private final List<AbstractC22011e> f53481d = new ArrayList();

        C21999b(Fragment fragment) {
            this.f53478a = fragment;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C21998a> cVar) {
            this.f53479b = cVar;
            m79409i();
        }

        /* renamed from: i */
        private final void m79409i() {
            if (this.f53480c != null && this.f53479b != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53480c);
                    IMapFragmentDelegate zzc = C22028e.m79517a(this.f53480c).zzc(ObjectWrapper.wrap(this.f53480c));
                    if (zzc != null) {
                        this.f53479b.mo73903a(new C21998a(this.f53478a, zzc));
                        for (AbstractC22011e eVar : this.f53481d) {
                            ((C21998a) mo73877a()).mo74492a(eVar);
                        }
                        this.f53481d.clear();
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
        private final void m79407a(Activity activity) {
            this.f53480c = activity;
            m79409i();
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f53475a.m79407a((C21999b) activity);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f53475a.m79407a((C21999b) activity);
            GoogleMapOptions a = GoogleMapOptions.m79370a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            this.f53475a.mo73878a(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53475a.mo73879a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f53475a.mo73876a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    public void onResume() {
        super.onResume();
        this.f53475a.mo73884c();
    }

    public void onPause() {
        this.f53475a.mo73885d();
        super.onPause();
    }

    public void onStart() {
        super.onStart();
        this.f53475a.mo73882b();
    }

    public void onStop() {
        this.f53475a.mo73886e();
        super.onStop();
    }

    public void onDestroyView() {
        this.f53475a.mo73887f();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f53475a.mo73888g();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f53475a.mo73889h();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f53475a.mo73883b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
