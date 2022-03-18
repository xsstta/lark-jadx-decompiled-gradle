package com.ss.android.lark.map.p2237a.p2238a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.maps.AbstractC22011e;
import com.google.android.gms.maps.C22007b;
import com.google.android.gms.maps.C22029j;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C22040b;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.location.dto.C41579a;
import com.ss.android.lark.location.dto.C41581c;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.map.a.a.c */
public class C44563c implements GoogleMap.AbstractC21992t, AbstractC22011e, AbstractC41559c {

    /* renamed from: a */
    public GoogleMap f112944a;

    /* renamed from: b */
    Location f112945b;

    /* renamed from: c */
    Context f112946c;

    /* renamed from: d */
    private MapView f112947d;

    /* renamed from: e */
    private C22029j f112948e;

    /* renamed from: f */
    private AbstractC41559c.AbstractC41560a f112949f;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: b */
    public void mo149547b() {
        GoogleMap googleMap = this.f112944a;
        if (googleMap != null) {
            googleMap.mo74419b();
        }
        Log.m165389i("LittleAppMap", "clear");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        Log.m165389i("LittleAppMap", "onPause");
        this.f112947d.mo74496b();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        this.f112947d.mo74493a();
        Log.m165389i("LittleAppMap", "onResume");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        this.f112947d.mo74498c();
        Log.m165389i("LittleAppMap", "onDestroy");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149541a() {
        if (this.f112945b != null) {
            Log.m165389i("LittleAppMap", "moveTo : " + this.f112945b.getLatitude() + " , " + this.f112945b.getLongitude());
            mo149542a(this.f112945b.getLatitude(), this.f112945b.getLongitude());
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149544a(AbstractC41559c.AbstractC41560a aVar) {
        this.f112949f = aVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f112947d;
        if (mapView != null) {
            mapView.mo74497b(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: b */
    public void mo149548b(List<C41579a> list) {
        if (!(this.f112944a == null || list == null)) {
            for (C41579a aVar : list) {
                this.f112944a.mo74408a(new CircleOptions().mo74791a(new LatLng(aVar.mo149686f(), aVar.mo149685e())).mo74788a((double) aVar.mo149679b()).mo74790a(aVar.mo149684d()).mo74789a((float) aVar.mo149675a()).mo74794b(aVar.mo149683c()));
            }
            Log.m165389i("LittleAppMap", "add circle");
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149543a(float f) {
        if (this.f112944a != null) {
            Log.m165389i("LittleAppMap", "zoom to:" + f);
            this.f112944a.mo74416a(C22007b.m79466a(f));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.AbstractC21992t
    /* renamed from: a */
    public void mo74446a(Location location) {
        if (location != null) {
            Log.m165389i("LittleAppMap", "onlocationchanged: la:" + location.getLatitude() + "lo:" + location.getLongitude());
            this.f112945b = location;
        }
    }

    @Override // com.google.android.gms.maps.AbstractC22011e
    /* renamed from: a */
    public void mo74527a(GoogleMap googleMap) {
        this.f112944a = googleMap;
        if (googleMap != null) {
            C22029j c = googleMap.mo74421c();
            this.f112948e = c;
            c.mo74768c(true);
            this.f112948e.mo74769d(true);
            this.f112948e.mo74766a(true);
            this.f112948e.mo74770e(true);
            this.f112948e.mo74767b(false);
            if (ActivityCompat.checkSelfPermission(this.f112946c, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f112946c, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f112944a.mo74418a(true);
            }
            this.f112944a.mo74413a(this);
            AbstractC41559c.AbstractC41560a aVar = this.f112949f;
            if (aVar != null) {
                aVar.mo144320a();
            }
            Log.m165389i("LittleAppMap", "onMapReady");
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149545a(List<C41581c> list) {
        if (!(list == null || this.f112944a == null)) {
            for (C41581c cVar : list) {
                MarkerOptions a = new MarkerOptions().mo74827a(new LatLng(cVar.mo149693b(), cVar.mo149689a())).mo74829a(cVar.mo149695c());
                if (cVar.mo149696d() != null) {
                    a.mo74828a(C22040b.m79607a(cVar.mo149696d()));
                }
                this.f112944a.mo74409a(a);
                Log.m165389i("LittleAppMap", "addMarkers");
            }
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149546a(boolean z) {
        if (this.f112944a == null) {
            return;
        }
        if (ActivityCompat.checkSelfPermission(this.f112946c, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f112946c, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f112944a.mo74418a(z);
            Log.m165389i("LittleAppMap", "showMyLocation" + z);
            return;
        }
        this.f112944a.mo74418a(false);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149542a(double d, double d2) {
        if (this.f112944a == null) {
            Log.m165383e("LittleAppMap", "mGoogleMap is null");
            return;
        }
        final LatLng latLng = new LatLng(d, d2);
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44563c.RunnableC445641 */

            public void run() {
                C44563c.this.f112944a.mo74416a(C22007b.m79467a(latLng));
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public View mo149540a(Context context, Bundle bundle, boolean z) {
        this.f112946c = context;
        MapView mapView = new MapView(context);
        this.f112947d = mapView;
        mapView.mo74494a(bundle);
        this.f112947d.mo74493a();
        this.f112947d.mo74495a(this);
        return this.f112947d;
    }
}
