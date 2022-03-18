package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3142a = versionedParcel.mo8088b(iconCompat.f3142a, 1);
        iconCompat.f3144c = versionedParcel.mo8096b(iconCompat.f3144c, 2);
        iconCompat.f3145d = versionedParcel.mo8089b(iconCompat.f3145d, 3);
        iconCompat.f3146e = versionedParcel.mo8088b(iconCompat.f3146e, 4);
        iconCompat.f3147f = versionedParcel.mo8088b(iconCompat.f3147f, 5);
        iconCompat.f3148g = (ColorStateList) versionedParcel.mo8089b(iconCompat.f3148g, 6);
        iconCompat.f3150j = versionedParcel.mo8092b(iconCompat.f3150j, 7);
        iconCompat.mo4304f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8084a(true, true);
        iconCompat.mo4297a(versionedParcel.mo8087a());
        if (-1 != iconCompat.f3142a) {
            versionedParcel.mo8072a(iconCompat.f3142a, 1);
        }
        if (iconCompat.f3144c != null) {
            versionedParcel.mo8086a(iconCompat.f3144c, 2);
        }
        if (iconCompat.f3145d != null) {
            versionedParcel.mo8074a(iconCompat.f3145d, 3);
        }
        if (iconCompat.f3146e != 0) {
            versionedParcel.mo8072a(iconCompat.f3146e, 4);
        }
        if (iconCompat.f3147f != 0) {
            versionedParcel.mo8072a(iconCompat.f3147f, 5);
        }
        if (iconCompat.f3148g != null) {
            versionedParcel.mo8074a(iconCompat.f3148g, 6);
        }
        if (iconCompat.f3150j != null) {
            versionedParcel.mo8081a(iconCompat.f3150j, 7);
        }
    }
}
