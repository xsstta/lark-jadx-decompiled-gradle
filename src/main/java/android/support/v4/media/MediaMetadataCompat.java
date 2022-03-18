package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.ArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* class android.support.v4.media.MediaMetadataCompat.C01151 */

        /* renamed from: a */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    /* renamed from: a */
    static final ArrayMap<String, Integer> f254a;

    /* renamed from: c */
    private static final String[] f255c = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: d */
    private static final String[] f256d = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: e */
    private static final String[] f257e = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f258b;

    /* renamed from: f */
    private Object f259f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BitmapKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LongKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RatingKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextKey {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public static final class C0116a {

        /* renamed from: a */
        private final Bundle f260a;

        /* renamed from: a */
        public MediaMetadataCompat mo246a() {
            return new MediaMetadataCompat(this.f260a);
        }

        public C0116a() {
            this.f260a = new Bundle();
        }

        public C0116a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f258b);
            this.f260a = bundle;
            MediaSessionCompat.m360a(bundle);
        }

        public C0116a(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f260a.keySet()) {
                Object obj = this.f260a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo245a(str, m276a(bitmap, i));
                    }
                }
            }
        }

        /* renamed from: a */
        private Bitmap m276a(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public C0116a mo244a(String str, long j) {
            if (!MediaMetadataCompat.f254a.containsKey(str) || MediaMetadataCompat.f254a.get(str).intValue() == 0) {
                this.f260a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: a */
        public C0116a mo245a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.f254a.containsKey(str) || MediaMetadataCompat.f254a.get(str).intValue() == 2) {
                this.f260a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }
    }

    /* renamed from: a */
    public Bundle mo234a() {
        return new Bundle(this.f258b);
    }

    /* renamed from: b */
    public Object mo237b() {
        if (this.f259f == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f259f = C0131e.m325a(obtain);
            obtain.recycle();
        }
        return this.f259f;
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f254a = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f258b = bundle2;
        MediaSessionCompat.m360a(bundle2);
    }

    /* renamed from: a */
    public boolean mo235a(String str) {
        return this.f258b.containsKey(str);
    }

    /* renamed from: b */
    public long mo236b(String str) {
        return this.f258b.getLong(str, 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f258b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m269a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0131e.m326a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f259f = obj;
        return createFromParcel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f258b);
    }
}
