package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.MarkerOptions;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.map.MapModule;

/* renamed from: com.ss.android.lark.map.a.b.d */
public class C44593d implements AbstractC41561d {

    /* renamed from: a */
    public MapView f113018a;

    /* renamed from: b */
    public HuaweiMap f113019b;

    /* renamed from: c */
    POIInfo f113020c;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public void mo149550a() {
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f113018a;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f113018a;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f113018a;
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f113018a;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public void mo149551a(double d, double d2) {
        float zoomLevel = (float) this.f113020c.getZoomLevel();
        if (this.f113019b != null) {
            this.f113019b.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, d2), zoomLevel));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: b */
    public void mo149552b(double d, double d2) {
        if (this.f113019b != null) {
            Resources resources = MapModule.getDependency().getContext().getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.location_my_location_icon);
            Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, R.drawable.location_icon_event_location);
            double latitude = this.f113020c.getLatitude();
            double longitude = this.f113020c.getLongitude();
            this.f113019b.addMarker(new MarkerOptions().position(new LatLng(d, d2)).anchor(0.45f, 0.45f).icon(BitmapDescriptorFactory.fromBitmap(decodeResource)));
            this.f113019b.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).anchor(0.4f, 0.85f).icon(BitmapDescriptorFactory.fromBitmap(decodeResource2)));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public View mo149549a(Context context, Bundle bundle, POIInfo pOIInfo) {
        this.f113020c = pOIInfo;
        new LinearLayout.LayoutParams(-1, -1);
        MapView mapView = new MapView(context);
        this.f113018a = mapView;
        mapView.onCreate(null);
        this.f113018a.onResume();
        this.f113018a.getMapAsync(new OnMapReadyCallback() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44593d.C445941 */

            @Override // com.huawei.hms.maps.OnMapReadyCallback
            public void onMapReady(HuaweiMap huaweiMap) {
                if (huaweiMap != null) {
                    C44593d.this.f113019b = huaweiMap;
                    if (DesktopUtil.m144301a(C44593d.this.f113018a.getContext())) {
                        C44593d.this.f113019b.getUiSettings().setZoomGesturesEnabled(true);
                    }
                    if (C44593d.this.f113019b != null) {
                        C44593d.this.f113019b.animateCamera(CameraUpdateFactory.zoomTo((float) C44593d.this.f113020c.getZoomLevel()));
                    }
                }
            }
        });
        return this.f113018a;
    }
}
