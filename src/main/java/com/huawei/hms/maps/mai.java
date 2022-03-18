package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mbo;
import com.huawei.hms.maps.mbt;
import com.huawei.hms.maps.mca;
import com.huawei.hms.maps.mcb;
import com.huawei.hms.maps.mcc;
import com.huawei.hms.maps.mcd;
import com.huawei.hms.maps.mcf;
import com.huawei.hms.maps.mcg;
import com.huawei.hms.maps.mch;
import com.huawei.hms.maps.mci;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.CameraUpdateParam;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.TileOverlayOptions;

public interface mai extends IInterface {

    public static abstract class maa extends Binder implements mai {

        /* renamed from: com.huawei.hms.maps.mai$maa$maa  reason: collision with other inner class name */
        static class C70263maa implements mai {

            /* renamed from: a */
            private IBinder f58641a;

            C70263maa(IBinder iBinder) {
                this.f58641a = iBinder;
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mcb mo83900a(CircleOptions circleOptions) {
                return mcb.maa.m86579a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 25, circleOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mcc mo83901a(GroundOverlayOptions groundOverlayOptions) {
                return mcc.maa.m86629a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 28, groundOverlayOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mcd mo83902a() {
                return mcd.maa.m86661a(mbz.m86560i(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 2));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mcf mo83903a(MarkerOptions markerOptions) {
                return mcf.maa.m86714a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 24, markerOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mcg mo83904a(PolygonOptions polygonOptions) {
                return mcg.maa.m86767a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 26, polygonOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mch mo83905a(PolylineOptions polylineOptions) {
                return mch.maa.m86813a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 27, polylineOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final mci mo83906a(TileOverlayOptions tileOverlayOptions) {
                return mci.maa.m86855a(mbz.m86538a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 1, tileOverlayOptions));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83907a(float f) {
                mbz.m86544a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83908a(int i) {
                mbz.m86544a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 7, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83909a(int i, int i2) {
                mbz.m86544a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 70, Integer.valueOf(i), Integer.valueOf(i2));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83910a(int i, int i2, int i3, int i4) {
                mbz.m86544a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 18, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83911a(maj maj) {
                mbz.m86541a(maj.asBinder(), this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 45);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83912a(mak mak) {
                mbz.m86541a(mak != null ? mak.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 58);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83913a(mao mao) {
                mbz.m86541a(mao != null ? mao.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 40);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83914a(AbstractC23699map map) {
                mbz.m86541a(map != null ? map.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 39);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83915a(maq maq) {
                mbz.m86541a(maq != null ? maq.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 38);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83916a(mar mar) {
                mbz.m86541a(mar != null ? mar.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 37);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83917a(mas mas) {
                mbz.m86541a(mas != null ? mas.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 42);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83918a(mat mat) {
                mbz.m86541a(mat != null ? mat.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 47);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83919a(mau mau) {
                mbz.m86541a(mau != null ? mau.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 48);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83920a(mav mav) {
                mbz.m86541a(mav != null ? mav.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 46);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83921a(maw maw) {
                mbz.m86541a(maw != null ? maw.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 49);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83922a(max max) {
                mbz.m86541a(max != null ? max.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 50);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83923a(maz maz) {
                mbz.m86541a(maz != null ? maz.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 54);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83924a(mba mba) {
                mbz.m86541a(mba.asBinder(), this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 30);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83925a(mbb mbb) {
                mbz.m86541a(mbb != null ? mbb.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 53);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83926a(mbd mbd) {
                mbz.m86541a(mbd != null ? mbd.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 51);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83927a(mbe mbe) {
                mbz.m86541a(mbe != null ? mbe.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 52);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83928a(mbf mbf) {
                mbz.m86541a(mbf != null ? mbf.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 55);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83929a(mbg mbg) {
                mbz.m86541a(mbg != null ? mbg.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 57);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83930a(mbh mbh) {
                mbz.m86541a(mbh != null ? mbh.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 61);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83931a(mbi mbi) {
                mbz.m86541a(mbi != null ? mbi.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 43);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83932a(mbj mbj) {
                mbz.m86541a(mbj != null ? mbj.asBinder() : null, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 44);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83933a(mbp mbp) {
                mbz.m86541a(mbp.asBinder(), this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 65);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83934a(mbp mbp, IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 64, mbp.asBinder(), iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83935a(CameraUpdateParam cameraUpdateParam) {
                mbz.m86543a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 33, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83936a(CameraUpdateParam cameraUpdateParam, int i, maf maf) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    if (cameraUpdateParam != null) {
                        obtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(maf != null ? maf.asBinder() : null);
                    this.f58641a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83937a(CameraUpdateParam cameraUpdateParam, maf maf) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    if (cameraUpdateParam != null) {
                        obtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(maf != null ? maf.asBinder() : null);
                    this.f58641a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83938a(LatLngBounds latLngBounds) {
                mbz.m86543a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 23, latLngBounds);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83939a(String str) {
                mbz.m86546a(str, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 14);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final void mo83940a(boolean z) {
                mbz.m86548a(z, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: a */
            public final boolean mo83941a(MapStyleOptions mapStyleOptions) {
                return mbz.m86540a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 59, 0, new Parcelable[]{mapStyleOptions}).intValue() != 0;
            }

            public final IBinder asBinder() {
                return this.f58641a;
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: b */
            public final float mo83942b() {
                return mbz.m86554c(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: b */
            public final void mo83943b(float f) {
                mbz.m86544a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 17, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: b */
            public final void mo83944b(CameraUpdateParam cameraUpdateParam) {
                mbz.m86543a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 34, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: b */
            public final void mo83945b(String str) {
                mbz.m86546a(str, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 67);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: b */
            public final void mo83946b(boolean z) {
                mbz.m86548a(z, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: c */
            public final float mo83947c() {
                return mbz.m86554c(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: c */
            public final void mo83948c(String str) {
                mbz.m86546a(str, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 69);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: c */
            public final boolean mo83949c(boolean z) {
                return mbz.m86550a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", z);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: d */
            public final void mo83950d(boolean z) {
                mbz.m86548a(z, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 19);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: d */
            public final boolean mo83951d() {
                return mbz.m86549a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: e */
            public final void mo83952e(boolean z) {
                mbz.m86548a(z, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 20);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: e */
            public final boolean mo83953e() {
                return mbz.m86549a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: f */
            public final int mo83954f() {
                return mbz.m86552b(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: f */
            public final void mo83955f(boolean z) {
                mbz.m86548a(z, this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 60);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: g */
            public final boolean mo83956g() {
                return mbz.m86549a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: h */
            public final boolean mo83957h() {
                return mbz.m86549a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: i */
            public final void mo83958i() {
                mbz.m86559h(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 13);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: j */
            public final boolean mo83959j() {
                return mbz.m86549a(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 21);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: k */
            public final mbt mo83960k() {
                return mbt.maa.m86489a(mbz.m86560i(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 22));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: l */
            public final mbo mo83961l() {
                return mbo.maa.m86409a(mbz.m86560i(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 29));
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: m */
            public final void mo83962m() {
                mbz.m86559h(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 32);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: n */
            public final CameraPosition mo83963n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    this.f58641a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: o */
            public final void mo83964o() {
                mbz.m86559h(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 66);
            }

            @Override // com.huawei.hms.maps.mai
            /* renamed from: p */
            public final mca mo83965p() {
                return mca.maa.m86563a(mbz.m86560i(this.f58641a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 68));
            }
        }
    }

    /* renamed from: a */
    mcb mo83900a(CircleOptions circleOptions);

    /* renamed from: a */
    mcc mo83901a(GroundOverlayOptions groundOverlayOptions);

    /* renamed from: a */
    mcd mo83902a();

    /* renamed from: a */
    mcf mo83903a(MarkerOptions markerOptions);

    /* renamed from: a */
    mcg mo83904a(PolygonOptions polygonOptions);

    /* renamed from: a */
    mch mo83905a(PolylineOptions polylineOptions);

    /* renamed from: a */
    mci mo83906a(TileOverlayOptions tileOverlayOptions);

    /* renamed from: a */
    void mo83907a(float f);

    /* renamed from: a */
    void mo83908a(int i);

    /* renamed from: a */
    void mo83909a(int i, int i2);

    /* renamed from: a */
    void mo83910a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo83911a(maj maj);

    /* renamed from: a */
    void mo83912a(mak mak);

    /* renamed from: a */
    void mo83913a(mao mao);

    /* renamed from: a */
    void mo83914a(AbstractC23699map map);

    /* renamed from: a */
    void mo83915a(maq maq);

    /* renamed from: a */
    void mo83916a(mar mar);

    /* renamed from: a */
    void mo83917a(mas mas);

    /* renamed from: a */
    void mo83918a(mat mat);

    /* renamed from: a */
    void mo83919a(mau mau);

    /* renamed from: a */
    void mo83920a(mav mav);

    /* renamed from: a */
    void mo83921a(maw maw);

    /* renamed from: a */
    void mo83922a(max max);

    /* renamed from: a */
    void mo83923a(maz maz);

    /* renamed from: a */
    void mo83924a(mba mba);

    /* renamed from: a */
    void mo83925a(mbb mbb);

    /* renamed from: a */
    void mo83926a(mbd mbd);

    /* renamed from: a */
    void mo83927a(mbe mbe);

    /* renamed from: a */
    void mo83928a(mbf mbf);

    /* renamed from: a */
    void mo83929a(mbg mbg);

    /* renamed from: a */
    void mo83930a(mbh mbh);

    /* renamed from: a */
    void mo83931a(mbi mbi);

    /* renamed from: a */
    void mo83932a(mbj mbj);

    /* renamed from: a */
    void mo83933a(mbp mbp);

    /* renamed from: a */
    void mo83934a(mbp mbp, IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo83935a(CameraUpdateParam cameraUpdateParam);

    /* renamed from: a */
    void mo83936a(CameraUpdateParam cameraUpdateParam, int i, maf maf);

    /* renamed from: a */
    void mo83937a(CameraUpdateParam cameraUpdateParam, maf maf);

    /* renamed from: a */
    void mo83938a(LatLngBounds latLngBounds);

    /* renamed from: a */
    void mo83939a(String str);

    /* renamed from: a */
    void mo83940a(boolean z);

    /* renamed from: a */
    boolean mo83941a(MapStyleOptions mapStyleOptions);

    /* renamed from: b */
    float mo83942b();

    /* renamed from: b */
    void mo83943b(float f);

    /* renamed from: b */
    void mo83944b(CameraUpdateParam cameraUpdateParam);

    /* renamed from: b */
    void mo83945b(String str);

    /* renamed from: b */
    void mo83946b(boolean z);

    /* renamed from: c */
    float mo83947c();

    /* renamed from: c */
    void mo83948c(String str);

    /* renamed from: c */
    boolean mo83949c(boolean z);

    /* renamed from: d */
    void mo83950d(boolean z);

    /* renamed from: d */
    boolean mo83951d();

    /* renamed from: e */
    void mo83952e(boolean z);

    /* renamed from: e */
    boolean mo83953e();

    /* renamed from: f */
    int mo83954f();

    /* renamed from: f */
    void mo83955f(boolean z);

    /* renamed from: g */
    boolean mo83956g();

    /* renamed from: h */
    boolean mo83957h();

    /* renamed from: i */
    void mo83958i();

    /* renamed from: j */
    boolean mo83959j();

    /* renamed from: k */
    mbt mo83960k();

    /* renamed from: l */
    mbo mo83961l();

    /* renamed from: m */
    void mo83962m();

    /* renamed from: n */
    CameraPosition mo83963n();

    /* renamed from: o */
    void mo83964o();

    /* renamed from: p */
    mca mo83965p();
}
