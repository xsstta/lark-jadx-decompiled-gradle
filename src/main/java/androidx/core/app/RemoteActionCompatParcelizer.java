package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3052a = (IconCompat) versionedParcel.mo8090b(remoteActionCompat.f3052a, 1);
        remoteActionCompat.f3053b = versionedParcel.mo8091b(remoteActionCompat.f3053b, 2);
        remoteActionCompat.f3054c = versionedParcel.mo8091b(remoteActionCompat.f3054c, 3);
        remoteActionCompat.f3055d = (PendingIntent) versionedParcel.mo8089b(remoteActionCompat.f3055d, 4);
        remoteActionCompat.f3056e = versionedParcel.mo8095b(remoteActionCompat.f3056e, 5);
        remoteActionCompat.f3057f = versionedParcel.mo8095b(remoteActionCompat.f3057f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8084a(false, false);
        versionedParcel.mo8076a(remoteActionCompat.f3052a, 1);
        versionedParcel.mo8079a(remoteActionCompat.f3053b, 2);
        versionedParcel.mo8079a(remoteActionCompat.f3054c, 3);
        versionedParcel.mo8074a(remoteActionCompat.f3055d, 4);
        versionedParcel.mo8083a(remoteActionCompat.f3056e, 5);
        versionedParcel.mo8083a(remoteActionCompat.f3057f, 6);
    }
}
