package com.huawei.hms.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mca;
import com.huawei.hms.maps.mcl;
import com.huawei.hms.maps.mcm;
import com.huawei.hms.maps.mcp;
import com.huawei.hms.maps.mcq;
import com.huawei.hms.maps.mct;
import com.huawei.hms.maps.mcu;

public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;

    /* renamed from: a */
    private static Context f58691a;
    public static mca sIBitmapDescriptorDelegate;

    public static BitmapDescriptor defaultMarker() {
        mca mca = sIBitmapDescriptorDelegate;
        if (mca == null) {
            mcq.m86888d("BitmapDescriptorFactory", "defaultMarker null == IBitmapDescriptorDelegate");
            return null;
        }
        try {
            IObjectWrapper a = mca.mo84125a();
            if (a != null) {
                return new BitmapDescriptor(a);
            }
            mcq.m86888d("BitmapDescriptorFactory", "defaultMarker null == objectWrapper");
            return null;
        } catch (RemoteException unused) {
            mcq.m86889e("BitmapDescriptorFactory", "defaultMarker error");
            return null;
        }
    }

    public static BitmapDescriptor defaultMarker(float f) {
        mca mca = sIBitmapDescriptorDelegate;
        if (mca == null) {
            mcq.m86888d("BitmapDescriptorFactory", "defaultMarker hue null == IBitmapDescriptorDelegate");
            return null;
        }
        try {
            IObjectWrapper a = mca.mo84126a(f);
            if (a != null) {
                return new BitmapDescriptor(a);
            }
            mcq.m86888d("BitmapDescriptorFactory", "defaultMarker hue null == objectWrapper");
            return null;
        } catch (RemoteException unused) {
            mcq.m86889e("BitmapDescriptorFactory", "defaultMarkerWithHue error");
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcl(str).mo84271a(f58691a)));
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcm(bitmap).mo84271a(f58691a)));
    }

    public static BitmapDescriptor fromFile(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcp(str).mo84271a(f58691a)));
    }

    public static BitmapDescriptor fromPath(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mct(str).mo84271a(f58691a)));
    }

    public static BitmapDescriptor fromResource(int i) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcu(i).mo84271a(f58691a)));
    }

    public static void setContext(Context context) {
        f58691a = context;
    }
}
