package com.ss.android.lark.map.p2237a.p2238a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.AbstractC22011e;
import com.google.android.gms.maps.C22007b;
import com.google.android.gms.maps.C22029j;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.map.a.a.a */
public class C44560a implements AbstractC22011e, AbstractC41558b {

    /* renamed from: a */
    private final String f112939a = "CalendarMap";

    /* renamed from: b */
    private MapView f112940b;

    /* renamed from: c */
    private GoogleMap f112941c;

    /* renamed from: d */
    private C22029j f112942d;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f112940b;
        if (mapView != null) {
            mapView.mo74496b();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f112940b;
        if (mapView != null) {
            mapView.mo74493a();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f112940b;
        if (mapView != null) {
            mapView.mo74498c();
            this.f112940b = null;
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f112940b;
        if (mapView != null) {
            mapView.mo74497b(bundle);
        }
    }

    @Override // com.google.android.gms.maps.AbstractC22011e
    /* renamed from: a */
    public void mo74527a(GoogleMap googleMap) {
        if (googleMap == null) {
            Log.m165389i("CalendarMap", "googleMap is null");
            return;
        }
        this.f112941c = googleMap;
        C22029j c = googleMap.mo74421c();
        this.f112942d = c;
        c.mo74768c(false);
        this.f112942d.mo74769d(false);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41558b
    /* renamed from: a */
    public void mo149539a(double d, double d2) {
        if (this.f112941c == null) {
            Log.m165389i("CalendarMap", "mGoogleMap is null");
            return;
        }
        this.f112941c.mo74416a(C22007b.m79468a(new LatLng(d, d2), 15.0f));
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41558b
    /* renamed from: a */
    public View mo149538a(Context context, Bundle bundle, boolean z) {
        if (this.f112940b == null) {
            this.f112940b = new MapView(context);
        }
        this.f112940b.mo74494a(bundle);
        this.f112940b.mo74493a();
        this.f112940b.mo74495a(this);
        return this.f112940b;
    }
}
