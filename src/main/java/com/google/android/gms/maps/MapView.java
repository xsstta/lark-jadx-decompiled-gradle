package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.AbstractC21818a;
import com.google.android.gms.dynamic.AbstractC21821c;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.AbstractC22024a;
import com.google.android.gms.maps.internal.C22027d;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {

    /* renamed from: a */
    private final C22001b f53482a;

    public MapView(Context context) {
        super(context);
        this.f53482a = new C22001b(this, context, null);
        setClickable(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.MapView$a */
    public static class C22000a implements AbstractC22024a {

        /* renamed from: a */
        private final ViewGroup f53483a;

        /* renamed from: b */
        private final IMapViewDelegate f53484b;

        /* renamed from: c */
        private View f53485c;

        public C22000a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.f53484b = (IMapViewDelegate) Preconditions.checkNotNull(iMapViewDelegate);
            this.f53483a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73895a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C22027d.m79515a(bundle, bundle2);
                this.f53484b.onCreate(bundle2);
                C22027d.m79515a(bundle2, bundle);
                this.f53485c = (View) ObjectWrapper.unwrap(this.f53484b.getView());
                this.f53483a.removeAllViews();
                this.f53483a.addView(this.f53485c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final View mo73892a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73893a() {
            try {
                this.f53484b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53484b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53484b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53484b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53484b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53484b.onLowMemory();
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
                this.f53484b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74499a(AbstractC22011e eVar) {
            try {
                this.f53484b.getMapAsync(new zzac(this, eVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C22001b extends AbstractC21818a<C22000a> {

        /* renamed from: a */
        private final ViewGroup f53486a;

        /* renamed from: b */
        private final Context f53487b;

        /* renamed from: c */
        private AbstractC21821c<C22000a> f53488c;

        /* renamed from: d */
        private final GoogleMapOptions f53489d;

        /* renamed from: e */
        private final List<AbstractC22011e> f53490e = new ArrayList();

        C22001b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f53486a = viewGroup;
            this.f53487b = context;
            this.f53489d = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C22000a> cVar) {
            this.f53488c = cVar;
            if (cVar != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53487b);
                    IMapViewDelegate zza = C22028e.m79517a(this.f53487b).zza(ObjectWrapper.wrap(this.f53487b), this.f53489d);
                    if (zza != null) {
                        this.f53488c.mo73903a(new C22000a(this.f53486a, zza));
                        for (AbstractC22011e eVar : this.f53490e) {
                            ((C22000a) mo73877a()).mo74499a(eVar);
                        }
                        this.f53490e.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo74500a(AbstractC22011e eVar) {
            if (mo73877a() != null) {
                ((C22000a) mo73877a()).mo74499a(eVar);
            } else {
                this.f53490e.add(eVar);
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53482a = new C22001b(this, context, GoogleMapOptions.m79370a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53482a = new C22001b(this, context, GoogleMapOptions.m79370a(context, attributeSet));
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo74494a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f53482a.mo73879a(bundle);
            if (this.f53482a.mo73877a() == null) {
                AbstractC21818a.m79107b(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public final void mo74493a() {
        this.f53482a.mo73884c();
    }

    /* renamed from: b */
    public final void mo74496b() {
        this.f53482a.mo73885d();
    }

    /* renamed from: c */
    public final void mo74498c() {
        this.f53482a.mo73888g();
    }

    /* renamed from: b */
    public final void mo74497b(Bundle bundle) {
        this.f53482a.mo73883b(bundle);
    }

    /* renamed from: a */
    public void mo74495a(AbstractC22011e eVar) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        this.f53482a.mo74500a(eVar);
    }
}
