package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.c */
class C0127c {

    /* renamed from: android.support.v4.media.c$a */
    static class C0128a {
        /* renamed from: a */
        public static Object m314a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m315a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: b */
        public static void m321b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m322c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m316a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m317a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m318a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m319a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m320a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }
    }

    /* renamed from: a */
    public static Object m305a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static CharSequence m308b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m309c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m310d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m311e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m312f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m313g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: a */
    public static String m306a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: a */
    public static void m307a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
