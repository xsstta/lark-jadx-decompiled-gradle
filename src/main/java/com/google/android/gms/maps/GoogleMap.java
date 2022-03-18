package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzd;
import com.google.android.gms.maps.model.C22041c;
import com.google.android.gms.maps.model.C22042d;
import com.google.android.gms.maps.model.C22043e;
import com.google.android.gms.maps.model.C22045f;
import com.google.android.gms.maps.model.C22046g;
import com.google.android.gms.maps.model.C22047h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class GoogleMap {

    /* renamed from: a */
    private final IGoogleMapDelegate f53456a;

    /* renamed from: b */
    private C22029j f53457b;

    /* renamed from: com.google.android.gms.maps.GoogleMap$a */
    public interface AbstractC21973a {
        /* renamed from: a */
        void mo74422a();

        /* renamed from: b */
        void mo74423b();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$b */
    public interface AbstractC21974b {
        /* renamed from: a */
        View mo74424a(C22045f fVar);

        /* renamed from: b */
        View mo74425b(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$c */
    public interface AbstractC21975c {
        /* renamed from: a */
        void mo74426a(CameraPosition cameraPosition);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$d */
    public interface AbstractC21976d {
        /* renamed from: a */
        void mo74427a();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$e */
    public interface AbstractC21977e {
        /* renamed from: a */
        void mo74428a();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$f */
    public interface AbstractC21978f {
        /* renamed from: a */
        void mo74429a();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$g */
    public interface AbstractC21979g {
        /* renamed from: a */
        void mo74430a(int i);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$h */
    public interface AbstractC21980h {
        /* renamed from: a */
        void mo74431a(C22041c cVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$i */
    public interface AbstractC21981i {
        /* renamed from: a */
        void mo74432a(C22042d dVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$j */
    public interface AbstractC21982j {
        /* renamed from: a */
        void mo74433a();

        /* renamed from: a */
        void mo74434a(C22043e eVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$k */
    public interface AbstractC21983k {
        /* renamed from: a */
        void mo74435a(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$l */
    public interface AbstractC21984l {
        /* renamed from: a */
        void mo74436a(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$m */
    public interface AbstractC21985m {
        /* renamed from: a */
        void mo74437a(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$n */
    public interface AbstractC21986n {
        /* renamed from: a */
        void mo74438a(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$o */
    public interface AbstractC21987o {
        /* renamed from: a */
        void mo74439a();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$p */
    public interface AbstractC21988p {
        /* renamed from: a */
        void mo74440a(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$q */
    public interface AbstractC21989q {
        /* renamed from: a */
        boolean mo74441a(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$r */
    public interface AbstractC21990r {
        /* renamed from: a */
        void mo74442a(C22045f fVar);

        /* renamed from: b */
        void mo74443b(C22045f fVar);

        /* renamed from: c */
        void mo74444c(C22045f fVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$s */
    public interface AbstractC21991s {
        /* renamed from: a */
        boolean mo74445a();
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$t */
    public interface AbstractC21992t {
        /* renamed from: a */
        void mo74446a(Location location);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$u */
    public interface AbstractC21993u {
        /* renamed from: a */
        void mo74447a(Location location);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$v */
    public interface AbstractC21994v {
        /* renamed from: a */
        void mo74448a(PointOfInterest pointOfInterest);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$w */
    public interface AbstractC21995w {
        /* renamed from: a */
        void mo74449a(C22046g gVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$x */
    public interface AbstractC21996x {
        /* renamed from: a */
        void mo74450a(C22047h hVar);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$y */
    public interface AbstractC21997y {
        /* renamed from: a */
        void mo74451a(Bitmap bitmap);
    }

    public GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f53456a = (IGoogleMapDelegate) Preconditions.checkNotNull(iGoogleMapDelegate);
    }

    private static final class zza extends zzd {
        private final AbstractC21973a zzai;

        zza(AbstractC21973a aVar) {
            this.zzai = aVar;
        }

        @Override // com.google.android.gms.maps.internal.zzc
        public final void onFinish() {
            this.zzai.mo74422a();
        }

        @Override // com.google.android.gms.maps.internal.zzc
        public final void onCancel() {
            this.zzai.mo74423b();
        }
    }

    /* renamed from: a */
    public final CameraPosition mo74407a() {
        try {
            return this.f53456a.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74416a(C22006a aVar) {
        try {
            this.f53456a.moveCamera(aVar.mo74524a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo74420b(C22006a aVar) {
        try {
            this.f53456a.animateCamera(aVar.mo74524a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74417a(C22006a aVar, AbstractC21973a aVar2) {
        zza zza2;
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.f53456a;
            IObjectWrapper a = aVar.mo74524a();
            if (aVar2 == null) {
                zza2 = null;
            } else {
                zza2 = new zza(aVar2);
            }
            iGoogleMapDelegate.animateCameraWithCallback(a, zza2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C22041c mo74408a(CircleOptions circleOptions) {
        try {
            return new C22041c(this.f53456a.addCircle(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C22045f mo74409a(MarkerOptions markerOptions) {
        try {
            zzt addMarker = this.f53456a.addMarker(markerOptions);
            if (addMarker != null) {
                return new C22045f(addMarker);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo74419b() {
        try {
            this.f53456a.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74410a(int i) {
        try {
            this.f53456a.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74418a(boolean z) {
        try {
            this.f53456a.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final C22029j mo74421c() {
        try {
            if (this.f53457b == null) {
                this.f53457b = new C22029j(this.f53456a.getUiSettings());
            }
            return this.f53457b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74412a(AbstractC21979g gVar) {
        if (gVar == null) {
            try {
                this.f53456a.setOnCameraMoveStartedListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f53456a.setOnCameraMoveStartedListener(new zzu(this, gVar));
        }
    }

    /* renamed from: a */
    public final void mo74411a(AbstractC21976d dVar) {
        if (dVar == null) {
            try {
                this.f53456a.setOnCameraIdleListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f53456a.setOnCameraIdleListener(new zzx(this, dVar));
        }
    }

    /* renamed from: a */
    public final void mo74413a(AbstractC21992t tVar) {
        if (tVar == null) {
            try {
                this.f53456a.setOnMyLocationChangeListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f53456a.setOnMyLocationChangeListener(new zzh(this, tVar));
        }
    }

    /* renamed from: a */
    public final void mo74414a(AbstractC21997y yVar) {
        mo74415a(yVar, (Bitmap) null);
    }

    /* renamed from: a */
    public final void mo74415a(AbstractC21997y yVar, Bitmap bitmap) {
        try {
            this.f53456a.snapshot(new zzr(this, yVar), (ObjectWrapper) (bitmap != null ? ObjectWrapper.wrap(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
