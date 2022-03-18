package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.maps.internal.AbstractC22025b;
import com.google.android.gms.maps.internal.C22027d;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    private final C22005b f53508a;

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.f53508a = new C22005b(this, context, null);
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    static class C22004a implements AbstractC22025b {

        /* renamed from: a */
        private final ViewGroup f53509a;

        /* renamed from: b */
        private final IStreetViewPanoramaViewDelegate f53510b;

        /* renamed from: c */
        private View f53511c;

        public C22004a(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.f53510b = (IStreetViewPanoramaViewDelegate) Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
            this.f53509a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73894a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73895a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C22027d.m79515a(bundle, bundle2);
                this.f53510b.onCreate(bundle2);
                C22027d.m79515a(bundle2, bundle);
                this.f53511c = (View) ObjectWrapper.unwrap(this.f53510b.getView());
                this.f53509a.removeAllViews();
                this.f53509a.addView(this.f53511c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final View mo73892a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: a */
        public final void mo73893a() {
            try {
                this.f53510b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: b */
        public final void mo73896b() {
            try {
                this.f53510b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: c */
        public final void mo73898c() {
            try {
                this.f53510b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: d */
        public final void mo73899d() {
            try {
                this.f53510b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: e */
        public final void mo73900e() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: f */
        public final void mo73901f() {
            try {
                this.f53510b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.AbstractC21820b
        /* renamed from: g */
        public final void mo73902g() {
            try {
                this.f53510b.onLowMemory();
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
                this.f53510b.onSaveInstanceState(bundle2);
                C22027d.m79515a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo74523a(AbstractC22012f fVar) {
            try {
                this.f53510b.getStreetViewPanoramaAsync(new zzaj(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53508a = new C22005b(this, context, null);
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    static class C22005b extends AbstractC21818a<C22004a> {

        /* renamed from: a */
        private final ViewGroup f53512a;

        /* renamed from: b */
        private final Context f53513b;

        /* renamed from: c */
        private AbstractC21821c<C22004a> f53514c;

        /* renamed from: d */
        private final StreetViewPanoramaOptions f53515d;

        /* renamed from: e */
        private final List<AbstractC22012f> f53516e = new ArrayList();

        C22005b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f53512a = viewGroup;
            this.f53513b = context;
            this.f53515d = streetViewPanoramaOptions;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.AbstractC21818a
        /* renamed from: a */
        public final void mo73881a(AbstractC21821c<C22004a> cVar) {
            this.f53514c = cVar;
            if (cVar != null && mo73877a() == null) {
                try {
                    C22010d.m79473a(this.f53513b);
                    this.f53514c.mo73903a(new C22004a(this.f53512a, C22028e.m79517a(this.f53513b).zza(ObjectWrapper.wrap(this.f53513b), this.f53515d)));
                    for (AbstractC22012f fVar : this.f53516e) {
                        ((C22004a) mo73877a()).mo74523a(fVar);
                    }
                    this.f53516e.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53508a = new C22005b(this, context, null);
    }
}
