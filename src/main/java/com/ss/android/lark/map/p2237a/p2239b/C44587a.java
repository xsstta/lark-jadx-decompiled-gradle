package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.UiSettings;
import com.huawei.hms.maps.model.LatLng;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.map.a.b.a */
public class C44587a implements OnMapReadyCallback, AbstractC41558b {

    /* renamed from: a */
    private final String f113002a = "CalendarMapHW";

    /* renamed from: b */
    private MapView f113003b;

    /* renamed from: c */
    private HuaweiMap f113004c;

    /* renamed from: d */
    private UiSettings f113005d;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f113003b;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f113003b;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f113003b;
        if (mapView != null) {
            mapView.onDestroy();
            this.f113003b = null;
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f113003b;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.huawei.hms.maps.OnMapReadyCallback
    public void onMapReady(HuaweiMap huaweiMap) {
        if (huaweiMap == null) {
            Log.m165389i("CalendarMapHW", "huaweiMap is null");
            return;
        }
        this.f113004c = huaweiMap;
        UiSettings uiSettings = huaweiMap.getUiSettings();
        this.f113005d = uiSettings;
        uiSettings.setScrollGesturesEnabled(false);
        this.f113005d.setZoomGesturesEnabled(false);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41558b
    /* renamed from: a */
    public void mo149539a(double d, double d2) {
        if (this.f113004c == null) {
            Log.m165389i("CalendarMapHW", "mHuaweiMap is null");
            return;
        }
        this.f113004c.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, d2), 15.0f));
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41558b
    /* renamed from: a */
    public View mo149538a(Context context, Bundle bundle, boolean z) {
        if (this.f113003b == null) {
            this.f113003b = new MapView(context);
        }
        this.f113003b.onCreate(bundle);
        this.f113003b.onResume();
        this.f113003b.getMapAsync(this);
        return this.f113003b;
    }
}
