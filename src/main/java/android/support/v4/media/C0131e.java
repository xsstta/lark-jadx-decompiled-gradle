package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;

/* renamed from: android.support.v4.media.e */
class C0131e {
    /* renamed from: a */
    public static Object m325a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m326a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
