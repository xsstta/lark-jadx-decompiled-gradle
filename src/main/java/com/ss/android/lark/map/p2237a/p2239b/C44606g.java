package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.larksuite.suite.R;
import com.ss.android.lark.location.p2146b.AbstractC41569h;

/* renamed from: com.ss.android.lark.map.a.b.g */
public class C44606g implements AbstractC41569h {

    /* renamed from: a */
    public HuaweiMap f113045a;

    /* renamed from: b */
    protected boolean f113046b = true;

    /* renamed from: c */
    public AbstractC41569h.AbstractC41570a f113047c;

    /* renamed from: d */
    public AbstractC41569h.AbstractC41573d f113048d;

    /* renamed from: e */
    protected double f113049e = 39.908823d;

    /* renamed from: f */
    protected double f113050f = 116.39747d;

    /* renamed from: g */
    private MapView f113051g;

    /* renamed from: h */
    private LatLng f113052h;

    /* renamed from: i */
    private Marker f113053i;

    /* renamed from: j */
    private Context f113054j;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149581a() {
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: b */
    public String mo149587b() {
        return "google";
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: k */
    public void mo149593k() {
        this.f113046b = false;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: i */
    public double mo149591i() {
        return this.f113049e;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: j */
    public double mo149592j() {
        return this.f113050f;
    }

    /* renamed from: l */
    private CameraPosition m176942l() {
        HuaweiMap huaweiMap = this.f113045a;
        if (huaweiMap == null) {
            return null;
        }
        return huaweiMap.getCameraPosition();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f113051g;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f113051g;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f113051g;
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: f */
    public int mo149588f() {
        CameraPosition cameraPosition;
        HuaweiMap huaweiMap = this.f113045a;
        if (huaweiMap == null || (cameraPosition = huaweiMap.getCameraPosition()) == null || this.f113046b) {
            return 15;
        }
        return (int) cameraPosition.zoom;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: g */
    public double mo149589g() {
        if (this.f113045a == null) {
            return this.f113049e;
        }
        CameraPosition l = m176942l();
        if (l == null) {
            return this.f113049e;
        }
        LatLng latLng = l.target;
        if (latLng == null) {
            return this.f113049e;
        }
        return latLng.latitude;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: h */
    public double mo149590h() {
        if (this.f113045a == null) {
            return this.f113050f;
        }
        CameraPosition l = m176942l();
        if (l == null) {
            return this.f113050f;
        }
        LatLng latLng = l.target;
        if (latLng == null) {
            return this.f113050f;
        }
        return latLng.longitude;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149584a(AbstractC41569h.AbstractC41570a aVar) {
        this.f113047c = aVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f113051g;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149585a(final AbstractC41569h.AbstractC41572c cVar) {
        Marker marker = this.f113053i;
        if (marker != null && marker.isVisible()) {
            this.f113053i.remove();
        }
        cVar.mo149597a();
        if (this.f113045a != null) {
            this.f113045a.addMarker(new MarkerOptions().position(this.f113045a.getCameraPosition().target).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(this.f113054j.getResources(), R.drawable.location_icon_event_location)))).setVisible(true);
            this.f113045a.snapshot(new HuaweiMap.SnapshotReadyCallback() {
                /* class com.ss.android.lark.map.p2237a.p2239b.C44606g.C446102 */

                @Override // com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap) {
                    AbstractC41569h.AbstractC41572c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo149598a(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149586a(AbstractC41569h.AbstractC41573d dVar) {
        this.f113048d = dVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public View mo149580a(Context context, Bundle bundle) {
        this.f113054j = context;
        MapView mapView = new MapView(this.f113054j);
        this.f113051g = mapView;
        mapView.onCreate(null);
        this.f113051g.onResume();
        this.f113051g.getMapAsync(new OnMapReadyCallback() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44606g.C446071 */

            @Override // com.huawei.hms.maps.OnMapReadyCallback
            public void onMapReady(HuaweiMap huaweiMap) {
                C44606g.this.f113045a = huaweiMap;
                if (C44606g.this.f113045a != null) {
                    C44606g.this.f113045a.getUiSettings().setAllGesturesEnabled(true);
                    C44606g.this.f113045a.getUiSettings().setScrollGesturesEnabled(true);
                    C44606g.this.f113045a.getUiSettings().setZoomGesturesEnabled(true);
                    C44606g.this.f113045a.setOnCameraIdleListener(new HuaweiMap.OnCameraIdleListener() {
                        /* class com.ss.android.lark.map.p2237a.p2239b.C44606g.C446071.C446081 */

                        @Override // com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener
                        public void onCameraIdle() {
                            if (C44606g.this.f113045a != null) {
                                CameraPosition cameraPosition = C44606g.this.f113045a.getCameraPosition();
                                double d = cameraPosition.target.longitude;
                                C44606g.this.f113047c.mo149594a(cameraPosition.target.latitude, d);
                            }
                        }
                    });
                    C44606g.this.f113045a.setMapType(1);
                    C44606g.this.f113045a.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
                    C44606g.this.f113045a.setOnCameraMoveStartedListener(new HuaweiMap.OnCameraMoveStartedListener() {
                        /* class com.ss.android.lark.map.p2237a.p2239b.C44606g.C446071.C446092 */

                        @Override // com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener
                        public void onCameraMoveStarted(int i) {
                            if (i != 3) {
                                C44606g.this.f113048d.mo149599a();
                                if (i == 1) {
                                    C44606g.this.f113048d.mo149600b();
                                }
                            }
                        }
                    });
                }
            }
        });
        return this.f113051g;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149582a(double d, double d2) {
        this.f113049e = d;
        this.f113050f = d2;
        if (this.f113045a != null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f113054j.getResources(), R.drawable.location_my_location_icon);
            this.f113053i = this.f113045a.addMarker(new MarkerOptions().position(new LatLng(this.f113049e, this.f113050f)).anchor(0.5f, 0.15f).icon(BitmapDescriptorFactory.fromBitmap(decodeResource)));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149583a(double d, double d2, final AbstractC41569h.AbstractC41571b bVar) {
        if (this.f113045a != null) {
            LatLng latLng = new LatLng(d, d2);
            this.f113052h = latLng;
            this.f113045a.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, (float) mo149588f()), new HuaweiMap.CancelableCallback() {
                /* class com.ss.android.lark.map.p2237a.p2239b.C44606g.C446113 */

                @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                public void onFinish() {
                    AbstractC41569h.AbstractC41571b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo149595a();
                    }
                }

                @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                public void onCancel() {
                    AbstractC41569h.AbstractC41571b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo149596b();
                    }
                }
            });
        }
    }
}
