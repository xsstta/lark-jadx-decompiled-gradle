package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.UiSettings;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.MarkerOptions;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.location.dto.C41579a;
import com.ss.android.lark.location.dto.C41581c;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.map.a.b.c */
public class C44590c implements OnMapReadyCallback, AbstractC41559c {

    /* renamed from: a */
    public HuaweiMap f113007a;

    /* renamed from: b */
    Location f113008b;

    /* renamed from: c */
    Context f113009c;

    /* renamed from: d */
    private MapView f113010d;

    /* renamed from: e */
    private UiSettings f113011e;

    /* renamed from: f */
    private AbstractC41559c.AbstractC41560a f113012f;

    /* renamed from: g */
    private C44600f f113013g;

    /* renamed from: h */
    private AbstractC41584c f113014h = new AbstractC41584c() {
        /* class com.ss.android.lark.map.p2237a.p2239b.C44590c.C445911 */

        @Override // com.ss.android.lark.location.listener.AbstractC41584c
        public void onLocationChange(LarkLocation larkLocation, List<Location> list) {
            if (larkLocation != null) {
                Log.m165389i("LittleAppMapHW", "onlocationchanged: la:" + larkLocation.getLatitude() + "lo:" + larkLocation.getLongitude());
                C44590c.this.f113008b = larkLocation;
            }
        }
    };

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        Log.m165389i("LittleAppMapHW", "onPause");
        this.f113010d.onPause();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        this.f113010d.onResume();
        Log.m165389i("LittleAppMapHW", "onResume");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: b */
    public void mo149547b() {
        HuaweiMap huaweiMap = this.f113007a;
        if (huaweiMap != null) {
            huaweiMap.clear();
        }
        C44600f fVar = this.f113013g;
        if (fVar != null) {
            fVar.mo149532b(this.f113014h);
        }
        Log.m165389i("LittleAppMapHW", "clear");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        this.f113010d.onDestroy();
        C44600f fVar = this.f113013g;
        if (fVar != null) {
            fVar.mo149532b(this.f113014h);
        }
        Log.m165389i("LittleAppMapHW", "onDestroy");
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149541a() {
        if (this.f113008b != null) {
            Log.m165389i("LittleAppMapHW", "moveTo : " + this.f113008b.getLatitude() + " , " + this.f113008b.getLongitude());
            mo149542a(this.f113008b.getLatitude(), this.f113008b.getLongitude());
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149544a(AbstractC41559c.AbstractC41560a aVar) {
        this.f113012f = aVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f113010d;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: b */
    public void mo149548b(List<C41579a> list) {
        if (!(this.f113007a == null || list == null)) {
            for (C41579a aVar : list) {
                this.f113007a.addCircle(new CircleOptions().center(new LatLng(aVar.mo149686f(), aVar.mo149685e())).radius((double) aVar.mo149679b()).strokeColor(aVar.mo149684d()).strokeWidth((float) aVar.mo149675a()).fillColor(aVar.mo149683c()));
            }
            Log.m165389i("LittleAppMapHW", "add circle");
        }
    }

    @Override // com.huawei.hms.maps.OnMapReadyCallback
    public void onMapReady(HuaweiMap huaweiMap) {
        this.f113007a = huaweiMap;
        if (huaweiMap != null) {
            UiSettings uiSettings = huaweiMap.getUiSettings();
            this.f113011e = uiSettings;
            uiSettings.setScrollGesturesEnabled(true);
            this.f113011e.setZoomGesturesEnabled(true);
            this.f113011e.setCompassEnabled(true);
            this.f113011e.setAllGesturesEnabled(true);
            this.f113011e.setMyLocationButtonEnabled(false);
            if (ActivityCompat.checkSelfPermission(this.f113009c, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f113009c, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f113007a.setMyLocationEnabled(true);
            }
            this.f113013g.mo149527a(this.f113014h, 1000);
            AbstractC41559c.AbstractC41560a aVar = this.f113012f;
            if (aVar != null) {
                aVar.mo144320a();
            }
            Log.m165389i("LittleAppMapHW", "onMapReady");
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149543a(float f) {
        if (this.f113007a != null) {
            Log.m165389i("LittleAppMapHW", "zoom to:" + f);
            this.f113007a.moveCamera(CameraUpdateFactory.zoomTo(f));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149545a(List<C41581c> list) {
        if (!(list == null || this.f113007a == null)) {
            for (C41581c cVar : list) {
                MarkerOptions title = new MarkerOptions().position(new LatLng(cVar.mo149693b(), cVar.mo149689a())).title(cVar.mo149695c());
                if (cVar.mo149696d() != null) {
                    title.icon(BitmapDescriptorFactory.fromBitmap(cVar.mo149696d()));
                }
                this.f113007a.addMarker(title);
                Log.m165389i("LittleAppMapHW", "addMarkers");
            }
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149546a(boolean z) {
        if (this.f113007a == null) {
            return;
        }
        if (ActivityCompat.checkSelfPermission(this.f113009c, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f113009c, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f113007a.setMyLocationEnabled(z);
            Log.m165389i("LittleAppMapHW", "showMyLocation" + z);
            return;
        }
        this.f113007a.setMyLocationEnabled(false);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public void mo149542a(double d, double d2) {
        if (this.f113007a == null) {
            Log.m165383e("LittleAppMapHW", "mHuaweiMap is null");
            return;
        }
        final LatLng latLng = new LatLng(d, d2);
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44590c.RunnableC445922 */

            public void run() {
                C44590c.this.f113007a.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41559c
    /* renamed from: a */
    public View mo149540a(Context context, Bundle bundle, boolean z) {
        this.f113009c = context;
        MapView mapView = new MapView(context);
        this.f113010d = mapView;
        mapView.onCreate(bundle);
        this.f113010d.onResume();
        this.f113010d.getMapAsync(this);
        if (this.f113013g == null) {
            this.f113013g = new C44600f(context);
        }
        return this.f113010d;
    }
}
