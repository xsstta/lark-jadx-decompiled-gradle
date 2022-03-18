package com.huawei.hms.maps;

import android.os.Bundle;
import android.os.Parcelable;

public class mbw {
    private mbw() {
    }

    /* renamed from: a */
    public static Bundle m86521a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            return bundle2;
        }
        Parcelable a = m86522a(bundle, "HuaweiMapOptions");
        if (a != null) {
            m86523a(bundle2, "HuaweiMapOptions", a);
        }
        Parcelable a2 = m86522a(bundle, "StreetViewOptions");
        if (a2 != null) {
            m86523a(bundle2, "StreetViewOptions", a2);
        }
        Parcelable a3 = m86522a(bundle, "CameraState");
        if (a3 != null) {
            m86523a(bundle2, "CameraState", a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        return bundle2;
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m86522a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(mbw.class.getClassLoader());
        Bundle bundle2 = (Bundle) bundle.get("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(mbw.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m86523a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(mbw.class.getClassLoader());
        bundle.putBundle("map_state", m86524b(bundle, str, parcelable));
    }

    /* renamed from: b */
    private static Bundle m86524b(Bundle bundle, String str, Parcelable parcelable) {
        Bundle bundle2 = bundle != null ? bundle.getBundle("map_state") : null;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(mbw.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        return bundle2;
    }
}
