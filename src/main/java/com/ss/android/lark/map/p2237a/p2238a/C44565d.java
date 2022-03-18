package com.ss.android.lark.map.p2237a.p2238a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.maps.AbstractC22011e;
import com.google.android.gms.maps.C22007b;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C22040b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.map.MapModule;

/* renamed from: com.ss.android.lark.map.a.a.d */
public class C44565d implements AbstractC41561d {

    /* renamed from: a */
    public MapView f112952a;

    /* renamed from: b */
    public GoogleMap f112953b;

    /* renamed from: c */
    POIInfo f112954c;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public void mo149550a() {
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f112952a;
        if (mapView != null) {
            mapView.mo74496b();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f112952a;
        if (mapView != null) {
            mapView.mo74493a();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f112952a;
        if (mapView != null) {
            mapView.mo74498c();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f112952a;
        if (mapView != null) {
            mapView.mo74497b(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public void mo149551a(double d, double d2) {
        float zoomLevel = (float) this.f112954c.getZoomLevel();
        if (this.f112953b != null) {
            this.f112953b.mo74420b(C22007b.m79468a(new LatLng(d, d2), zoomLevel));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: b */
    public void mo149552b(double d, double d2) {
        if (this.f112953b != null) {
            Resources resources = MapModule.getDependency().getContext().getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.location_my_location_icon);
            Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, R.drawable.location_icon_event_location);
            double latitude = this.f112954c.getLatitude();
            double longitude = this.f112954c.getLongitude();
            this.f112953b.mo74409a(new MarkerOptions().mo74827a(new LatLng(d, d2)).mo74826a(0.45f, 0.45f).mo74828a(C22040b.m79607a(decodeResource)));
            this.f112953b.mo74409a(new MarkerOptions().mo74827a(new LatLng(latitude, longitude)).mo74826a(0.4f, 0.85f).mo74828a(C22040b.m79607a(decodeResource2)));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41561d
    /* renamed from: a */
    public View mo149549a(Context context, Bundle bundle, POIInfo pOIInfo) {
        this.f112954c = pOIInfo;
        new LinearLayout.LayoutParams(-1, -1);
        MapView mapView = new MapView(context);
        this.f112952a = mapView;
        mapView.mo74494a((Bundle) null);
        this.f112952a.mo74493a();
        this.f112952a.mo74495a(new AbstractC22011e() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44565d.C445661 */

            @Override // com.google.android.gms.maps.AbstractC22011e
            /* renamed from: a */
            public void mo74527a(GoogleMap googleMap) {
                if (googleMap != null) {
                    C44565d.this.f112953b = googleMap;
                    if (DesktopUtil.m144301a(C44565d.this.f112952a.getContext())) {
                        C44565d.this.f112953b.mo74421c().mo74769d(true);
                    }
                    if (C44565d.this.f112953b != null) {
                        C44565d.this.f112953b.mo74420b(C22007b.m79466a((float) C44565d.this.f112954c.getZoomLevel()));
                    }
                }
            }
        });
        return this.f112952a;
    }
}
