package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static C1228c read(VersionedParcel versionedParcel) {
        C1228c cVar = new C1228c();
        cVar.f4447a = versionedParcel.mo8088b(cVar.f4447a, 1);
        cVar.f4448b = versionedParcel.mo8088b(cVar.f4448b, 2);
        cVar.f4449c = versionedParcel.mo8088b(cVar.f4449c, 3);
        cVar.f4450d = versionedParcel.mo8088b(cVar.f4450d, 4);
        return cVar;
    }

    public static void write(C1228c cVar, VersionedParcel versionedParcel) {
        versionedParcel.mo8084a(false, false);
        versionedParcel.mo8072a(cVar.f4447a, 1);
        versionedParcel.mo8072a(cVar.f4448b, 2);
        versionedParcel.mo8072a(cVar.f4449c, 3);
        versionedParcel.mo8072a(cVar.f4450d, 4);
    }
}
