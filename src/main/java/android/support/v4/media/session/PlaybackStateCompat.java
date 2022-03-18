package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.C0173c;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* class android.support.v4.media.session.PlaybackStateCompat.C01621 */

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };

    /* renamed from: a */
    final int f365a;

    /* renamed from: b */
    final long f366b;

    /* renamed from: c */
    final long f367c;

    /* renamed from: d */
    final float f368d;

    /* renamed from: e */
    final long f369e;

    /* renamed from: f */
    final int f370f;

    /* renamed from: g */
    final CharSequence f371g;

    /* renamed from: h */
    final long f372h;

    /* renamed from: i */
    List<CustomAction> f373i;

    /* renamed from: j */
    final long f374j;

    /* renamed from: k */
    final Bundle f375k;

    /* renamed from: l */
    private Object f376l;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo485a() {
        return this.f365a;
    }

    /* renamed from: b */
    public long mo486b() {
        return this.f366b;
    }

    /* renamed from: c */
    public long mo487c() {
        return this.f372h;
    }

    /* renamed from: d */
    public float mo488d() {
        return this.f368d;
    }

    /* renamed from: e */
    public long mo490e() {
        return this.f369e;
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static final class C0164a {

        /* renamed from: a */
        private final List<CustomAction> f382a;

        /* renamed from: b */
        private int f383b;

        /* renamed from: c */
        private long f384c;

        /* renamed from: d */
        private long f385d;

        /* renamed from: e */
        private float f386e;

        /* renamed from: f */
        private long f387f;

        /* renamed from: g */
        private int f388g;

        /* renamed from: h */
        private CharSequence f389h;

        /* renamed from: i */
        private long f390i;

        /* renamed from: j */
        private long f391j;

        /* renamed from: k */
        private Bundle f392k;

        public C0164a() {
            this.f382a = new ArrayList();
            this.f391j = -1;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo509a() {
            return new PlaybackStateCompat(this.f383b, this.f384c, this.f385d, this.f386e, this.f387f, this.f388g, this.f389h, this.f390i, this.f382a, this.f391j, this.f392k);
        }

        /* renamed from: a */
        public C0164a mo508a(long j) {
            this.f387f = j;
            return this;
        }

        public C0164a(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f382a = arrayList;
            this.f391j = -1;
            this.f383b = playbackStateCompat.f365a;
            this.f384c = playbackStateCompat.f366b;
            this.f386e = playbackStateCompat.f368d;
            this.f390i = playbackStateCompat.f372h;
            this.f385d = playbackStateCompat.f367c;
            this.f387f = playbackStateCompat.f369e;
            this.f388g = playbackStateCompat.f370f;
            this.f389h = playbackStateCompat.f371g;
            if (playbackStateCompat.f373i != null) {
                arrayList.addAll(playbackStateCompat.f373i);
            }
            this.f391j = playbackStateCompat.f374j;
            this.f392k = playbackStateCompat.f375k;
        }

        /* renamed from: a */
        public C0164a mo506a(int i, long j, float f) {
            return mo507a(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: a */
        public C0164a mo507a(int i, long j, float f, long j2) {
            this.f383b = i;
            this.f384c = j;
            this.f390i = j2;
            this.f386e = f;
            return this;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* class android.support.v4.media.session.PlaybackStateCompat.CustomAction.C01631 */

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };

        /* renamed from: a */
        private final String f377a;

        /* renamed from: b */
        private final CharSequence f378b;

        /* renamed from: c */
        private final int f379c;

        /* renamed from: d */
        private final Bundle f380d;

        /* renamed from: e */
        private Object f381e;

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public Object mo498a() {
            if (this.f381e != null || Build.VERSION.SDK_INT < 21) {
                return this.f381e;
            }
            Object a = C0173c.C0174a.m568a(this.f377a, this.f378b, this.f379c, this.f380d);
            this.f381e = a;
            return a;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f378b) + ", mIcon=" + this.f379c + ", mExtras=" + this.f380d;
        }

        CustomAction(Parcel parcel) {
            this.f377a = parcel.readString();
            this.f378b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f379c = parcel.readInt();
            this.f380d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        /* renamed from: a */
        public static CustomAction m507a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0173c.C0174a.m569a(obj), C0173c.C0174a.m570b(obj), C0173c.C0174a.m571c(obj), C0173c.C0174a.m572d(obj));
            customAction.f381e = obj;
            return customAction;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f377a);
            TextUtils.writeToParcel(this.f378b, parcel, i);
            parcel.writeInt(this.f379c);
            parcel.writeBundle(this.f380d);
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f377a = str;
            this.f378b = charSequence;
            this.f379c = i;
            this.f380d = bundle;
        }
    }

    /* renamed from: f */
    public Object mo491f() {
        if (this.f376l == null && Build.VERSION.SDK_INT >= 21) {
            ArrayList arrayList = null;
            if (this.f373i != null) {
                arrayList = new ArrayList(this.f373i.size());
                for (CustomAction customAction : this.f373i) {
                    arrayList.add(customAction.mo498a());
                }
            }
            if (Build.VERSION.SDK_INT >= 22) {
                this.f376l = C0175d.m574a(this.f365a, this.f366b, this.f367c, this.f368d, this.f369e, this.f371g, this.f372h, arrayList, this.f374j, this.f375k);
            } else {
                this.f376l = C0173c.m559a(this.f365a, this.f366b, this.f367c, this.f368d, this.f369e, this.f371g, this.f372h, arrayList, this.f374j);
            }
        }
        return this.f376l;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f365a + ", position=" + this.f366b + ", buffered position=" + this.f367c + ", speed=" + this.f368d + ", updated=" + this.f372h + ", actions=" + this.f369e + ", error code=" + this.f370f + ", error message=" + this.f371g + ", custom actions=" + this.f373i + ", active item id=" + this.f374j + "}";
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f365a = parcel.readInt();
        this.f366b = parcel.readLong();
        this.f368d = parcel.readFloat();
        this.f372h = parcel.readLong();
        this.f367c = parcel.readLong();
        this.f369e = parcel.readLong();
        this.f371g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f373i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f374j = parcel.readLong();
        this.f375k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f370f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m498a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0173c.m566h(obj);
        if (h != null) {
            ArrayList arrayList2 = new ArrayList(h.size());
            for (Object obj2 : h) {
                arrayList2.add(CustomAction.m507a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0175d.m573a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0173c.m558a(obj), C0173c.m560b(obj), C0173c.m561c(obj), C0173c.m562d(obj), C0173c.m563e(obj), 0, C0173c.m564f(obj), C0173c.m565g(obj), arrayList, C0173c.m567i(obj), bundle);
        playbackStateCompat.f376l = obj;
        return playbackStateCompat;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f365a);
        parcel.writeLong(this.f366b);
        parcel.writeFloat(this.f368d);
        parcel.writeLong(this.f372h);
        parcel.writeLong(this.f367c);
        parcel.writeLong(this.f369e);
        TextUtils.writeToParcel(this.f371g, parcel, i);
        parcel.writeTypedList(this.f373i);
        parcel.writeLong(this.f374j);
        parcel.writeBundle(this.f375k);
        parcel.writeInt(this.f370f);
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f365a = i;
        this.f366b = j;
        this.f367c = j2;
        this.f368d = f;
        this.f369e = j3;
        this.f370f = i2;
        this.f371g = charSequence;
        this.f372h = j4;
        this.f373i = new ArrayList(list);
        this.f374j = j5;
        this.f375k = bundle;
    }
}
