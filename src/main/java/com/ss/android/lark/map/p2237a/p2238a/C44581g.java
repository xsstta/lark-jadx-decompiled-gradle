package com.ss.android.lark.map.p2237a.p2238a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.AbstractC22011e;
import com.google.android.gms.maps.C22007b;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C22040b;
import com.google.android.gms.maps.model.C22045f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.larksuite.suite.R;
import com.ss.android.lark.location.p2146b.AbstractC41569h;

/* renamed from: com.ss.android.lark.map.a.a.g */
public class C44581g implements AbstractC41569h {

    /* renamed from: a */
    public GoogleMap f112985a;

    /* renamed from: b */
    protected boolean f112986b = true;

    /* renamed from: c */
    public AbstractC41569h.AbstractC41570a f112987c;

    /* renamed from: d */
    public AbstractC41569h.AbstractC41573d f112988d;

    /* renamed from: e */
    protected double f112989e = 39.908823d;

    /* renamed from: f */
    protected double f112990f = 116.39747d;

    /* renamed from: g */
    private MapView f112991g;

    /* renamed from: h */
    private LatLng f112992h;

    /* renamed from: i */
    private C22045f f112993i;

    /* renamed from: j */
    private Context f112994j;

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
        this.f112986b = false;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: i */
    public double mo149591i() {
        return this.f112989e;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: j */
    public double mo149592j() {
        return this.f112990f;
    }

    /* renamed from: l */
    private CameraPosition m176864l() {
        GoogleMap googleMap = this.f112985a;
        if (googleMap == null) {
            return null;
        }
        return googleMap.mo74407a();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: c */
    public void mo149566c() {
        MapView mapView = this.f112991g;
        if (mapView != null) {
            mapView.mo74496b();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: d */
    public void mo149567d() {
        MapView mapView = this.f112991g;
        if (mapView != null) {
            mapView.mo74493a();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: e */
    public void mo149568e() {
        MapView mapView = this.f112991g;
        if (mapView != null) {
            mapView.mo74498c();
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: f */
    public int mo149588f() {
        CameraPosition a;
        GoogleMap googleMap = this.f112985a;
        if (googleMap == null || (a = googleMap.mo74407a()) == null || this.f112986b) {
            return 15;
        }
        return (int) a.f53541b;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: g */
    public double mo149589g() {
        if (this.f112985a == null) {
            return this.f112989e;
        }
        CameraPosition l = m176864l();
        if (l == null) {
            return this.f112989e;
        }
        LatLng latLng = l.f53540a;
        if (latLng == null) {
            return this.f112989e;
        }
        return latLng.f53577a;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: h */
    public double mo149590h() {
        if (this.f112985a == null) {
            return this.f112990f;
        }
        CameraPosition l = m176864l();
        if (l == null) {
            return this.f112990f;
        }
        LatLng latLng = l.f53540a;
        if (latLng == null) {
            return this.f112990f;
        }
        return latLng.f53578b;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149584a(AbstractC41569h.AbstractC41570a aVar) {
        this.f112987c = aVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41566f
    /* renamed from: a */
    public void mo149565a(Bundle bundle) {
        MapView mapView = this.f112991g;
        if (mapView != null) {
            mapView.mo74497b(bundle);
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149585a(final AbstractC41569h.AbstractC41572c cVar) {
        C22045f fVar = this.f112993i;
        if (fVar != null && fVar.mo74919b()) {
            this.f112993i.mo74917a();
        }
        cVar.mo149597a();
        if (this.f112985a != null) {
            this.f112985a.mo74409a(new MarkerOptions().mo74827a(this.f112985a.mo74407a().f53540a).mo74826a(0.5f, 0.5f).mo74828a(C22040b.m79607a(BitmapFactory.decodeResource(this.f112994j.getResources(), R.drawable.location_icon_event_location)))).mo74918a(true);
            this.f112985a.mo74414a(new GoogleMap.AbstractC21997y() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44581g.C445852 */

                @Override // com.google.android.gms.maps.GoogleMap.AbstractC21997y
                /* renamed from: a */
                public void mo74451a(Bitmap bitmap) {
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
        this.f112988d = dVar;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public View mo149580a(Context context, Bundle bundle) {
        this.f112994j = context;
        MapView mapView = new MapView(this.f112994j);
        this.f112991g = mapView;
        mapView.mo74494a((Bundle) null);
        this.f112991g.mo74493a();
        this.f112991g.mo74495a(new AbstractC22011e() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44581g.C445821 */

            @Override // com.google.android.gms.maps.AbstractC22011e
            /* renamed from: a */
            public void mo74527a(GoogleMap googleMap) {
                C44581g.this.f112985a = googleMap;
                if (C44581g.this.f112985a != null) {
                    C44581g.this.f112985a.mo74421c().mo74770e(true);
                    C44581g.this.f112985a.mo74421c().mo74768c(true);
                    C44581g.this.f112985a.mo74421c().mo74769d(true);
                    C44581g.this.f112985a.mo74411a(new GoogleMap.AbstractC21976d() {
                        /* class com.ss.android.lark.map.p2237a.p2238a.C44581g.C445821.C445831 */

                        @Override // com.google.android.gms.maps.GoogleMap.AbstractC21976d
                        /* renamed from: a */
                        public void mo74427a() {
                            if (C44581g.this.f112985a != null) {
                                CameraPosition a = C44581g.this.f112985a.mo74407a();
                                double d = a.f53540a.f53578b;
                                C44581g.this.f112987c.mo149594a(a.f53540a.f53577a, d);
                            }
                        }
                    });
                    C44581g.this.f112985a.mo74410a(1);
                    C44581g.this.f112985a.mo74420b(C22007b.m79466a(15.0f));
                    C44581g.this.f112985a.mo74412a(new GoogleMap.AbstractC21979g() {
                        /* class com.ss.android.lark.map.p2237a.p2238a.C44581g.C445821.C445842 */

                        @Override // com.google.android.gms.maps.GoogleMap.AbstractC21979g
                        /* renamed from: a */
                        public void mo74430a(int i) {
                            C44581g.this.f112988d.mo149599a();
                            if (i == 1) {
                                C44581g.this.f112988d.mo149600b();
                            }
                        }
                    });
                }
            }
        });
        return this.f112991g;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149582a(double d, double d2) {
        this.f112989e = d;
        this.f112990f = d2;
        if (this.f112985a != null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f112994j.getResources(), R.drawable.location_my_location_icon);
            this.f112993i = this.f112985a.mo74409a(new MarkerOptions().mo74827a(new LatLng(this.f112989e, this.f112990f)).mo74826a(0.5f, 0.15f).mo74828a(C22040b.m79607a(decodeResource)));
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41569h
    /* renamed from: a */
    public void mo149583a(double d, double d2, final AbstractC41569h.AbstractC41571b bVar) {
        if (this.f112985a != null) {
            LatLng latLng = new LatLng(d, d2);
            this.f112992h = latLng;
            this.f112985a.mo74417a(C22007b.m79468a(latLng, (float) mo149588f()), new GoogleMap.AbstractC21973a() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44581g.C445863 */

                @Override // com.google.android.gms.maps.GoogleMap.AbstractC21973a
                /* renamed from: a */
                public void mo74422a() {
                    AbstractC41569h.AbstractC41571b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo149595a();
                    }
                }

                @Override // com.google.android.gms.maps.GoogleMap.AbstractC21973a
                /* renamed from: b */
                public void mo74423b() {
                    AbstractC41569h.AbstractC41571b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo149596b();
                    }
                }
            });
        }
    }
}
