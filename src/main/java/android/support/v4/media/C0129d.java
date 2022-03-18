package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.d */
class C0129d {
    /* renamed from: a */
    public static Uri m323a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    /* renamed from: android.support.v4.media.d$a */
    static class C0130a {
        /* renamed from: a */
        public static void m324a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
