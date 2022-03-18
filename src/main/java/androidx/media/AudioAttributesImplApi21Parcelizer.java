package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static C1227b read(VersionedParcel versionedParcel) {
        C1227b bVar = new C1227b();
        bVar.f4445a = (AudioAttributes) versionedParcel.mo8089b(bVar.f4445a, 1);
        bVar.f4446b = versionedParcel.mo8088b(bVar.f4446b, 2);
        return bVar;
    }

    public static void write(C1227b bVar, VersionedParcel versionedParcel) {
        versionedParcel.mo8084a(false, false);
        versionedParcel.mo8074a(bVar.f4445a, 1);
        versionedParcel.mo8072a(bVar.f4446b, 2);
    }
}
