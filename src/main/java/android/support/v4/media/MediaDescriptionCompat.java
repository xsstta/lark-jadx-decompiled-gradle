package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0127c;
import android.support.v4.media.C0129d;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* class android.support.v4.media.MediaDescriptionCompat.C01131 */

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m255a(C0127c.m305a(parcel));
        }
    };

    /* renamed from: a */
    private final String f237a;

    /* renamed from: b */
    private final CharSequence f238b;

    /* renamed from: c */
    private final CharSequence f239c;

    /* renamed from: d */
    private final CharSequence f240d;

    /* renamed from: e */
    private final Bitmap f241e;

    /* renamed from: f */
    private final Uri f242f;

    /* renamed from: g */
    private final Bundle f243g;

    /* renamed from: h */
    private final Uri f244h;

    /* renamed from: i */
    private Object f245i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo216a() {
        return this.f237a;
    }

    public String toString() {
        return ((Object) this.f238b) + ", " + ((Object) this.f239c) + ", " + ((Object) this.f240d);
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0114a {

        /* renamed from: a */
        private String f246a;

        /* renamed from: b */
        private CharSequence f247b;

        /* renamed from: c */
        private CharSequence f248c;

        /* renamed from: d */
        private CharSequence f249d;

        /* renamed from: e */
        private Bitmap f250e;

        /* renamed from: f */
        private Uri f251f;

        /* renamed from: g */
        private Bundle f252g;

        /* renamed from: h */
        private Uri f253h;

        /* renamed from: a */
        public MediaDescriptionCompat mo230a() {
            return new MediaDescriptionCompat(this.f246a, this.f247b, this.f248c, this.f249d, this.f250e, this.f251f, this.f252g, this.f253h);
        }

        /* renamed from: a */
        public C0114a mo225a(Bitmap bitmap) {
            this.f250e = bitmap;
            return this;
        }

        /* renamed from: b */
        public C0114a mo231b(Uri uri) {
            this.f253h = uri;
            return this;
        }

        /* renamed from: c */
        public C0114a mo233c(CharSequence charSequence) {
            this.f249d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0114a mo226a(Uri uri) {
            this.f251f = uri;
            return this;
        }

        /* renamed from: b */
        public C0114a mo232b(CharSequence charSequence) {
            this.f248c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0114a mo227a(Bundle bundle) {
            this.f252g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0114a mo228a(CharSequence charSequence) {
            this.f247b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0114a mo229a(String str) {
            this.f246a = str;
            return this;
        }
    }

    /* renamed from: b */
    public Object mo217b() {
        if (this.f245i != null || Build.VERSION.SDK_INT < 21) {
            return this.f245i;
        }
        Object a = C0127c.C0128a.m314a();
        C0127c.C0128a.m320a(a, this.f237a);
        C0127c.C0128a.m319a(a, this.f238b);
        C0127c.C0128a.m321b(a, this.f239c);
        C0127c.C0128a.m322c(a, this.f240d);
        C0127c.C0128a.m316a(a, this.f241e);
        C0127c.C0128a.m317a(a, this.f242f);
        Bundle bundle = this.f243g;
        if (Build.VERSION.SDK_INT < 23 && this.f244h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f244h);
        }
        C0127c.C0128a.m318a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0129d.C0130a.m324a(a, this.f244h);
        }
        Object a2 = C0127c.C0128a.m315a(a);
        this.f245i = a2;
        return a2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f237a = parcel.readString();
        this.f238b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f239c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f240d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f241e = (Bitmap) parcel.readParcelable(classLoader);
        this.f242f = (Uri) parcel.readParcelable(classLoader);
        this.f243g = parcel.readBundle(classLoader);
        this.f244h = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat m255a(java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m255a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f237a);
            TextUtils.writeToParcel(this.f238b, parcel, i);
            TextUtils.writeToParcel(this.f239c, parcel, i);
            TextUtils.writeToParcel(this.f240d, parcel, i);
            parcel.writeParcelable(this.f241e, i);
            parcel.writeParcelable(this.f242f, i);
            parcel.writeBundle(this.f243g);
            parcel.writeParcelable(this.f244h, i);
            return;
        }
        C0127c.m307a(mo217b(), parcel, i);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f237a = str;
        this.f238b = charSequence;
        this.f239c = charSequence2;
        this.f240d = charSequence3;
        this.f241e = bitmap;
        this.f242f = uri;
        this.f243g = bundle;
        this.f244h = uri2;
    }
}
