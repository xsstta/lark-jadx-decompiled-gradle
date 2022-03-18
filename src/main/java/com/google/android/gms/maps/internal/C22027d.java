package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.internal.d */
public final class C22027d {
    /* renamed from: a */
    public static void m79515a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m79514a(bundle, "MapOptions");
            if (a != null) {
                m79516a(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m79514a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m79516a(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m79514a(bundle, "camera");
            if (a3 != null) {
                m79516a(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m79514a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(C22027d.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(C22027d.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m79516a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C22027d.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C22027d.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private C22027d() {
    }
}
