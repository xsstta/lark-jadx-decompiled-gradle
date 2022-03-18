package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class VERecordData implements Parcelable {
    public static final Parcelable.Creator<VERecordData> CREATOR = new Parcelable.Creator<VERecordData>() {
        /* class com.ss.android.vesdk.VERecordData.C638881 */

        /* renamed from: a */
        public VERecordData[] newArray(int i) {
            return new VERecordData[i];
        }

        /* renamed from: a */
        public VERecordData createFromParcel(Parcel parcel) {
            return new VERecordData(parcel);
        }
    };

    /* renamed from: a */
    static final String f161346a = VERecordData.class.getSimpleName();

    /* renamed from: d */
    public static final String[] f161347d = {"counts", "audioLengths", "speeds", "musicStartTime", "encodeMode", "offset", "videoQuality", "random", "duatStartTime", "audioEffects", "newSync", "encodeMethod", "videoLengths"};

    /* renamed from: e */
    public static final String[] f161348e = {"_frag_v", "_frag_a"};

    /* renamed from: b */
    public String f161349b;

    /* renamed from: c */
    public String f161350c;

    /* renamed from: f */
    private List<VERecordSegmentData> f161351f;

    /* renamed from: g */
    private boolean f161352g;

    public int describeContents() {
        return 0;
    }

    private VERecordData() {
    }

    /* renamed from: b */
    public List<VERecordSegmentData> mo220911b() {
        return this.f161351f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo220910a() {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecordData.mo220910a():boolean");
    }

    protected VERecordData(Parcel parcel) {
        boolean z;
        this.f161351f = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161352g = z;
        this.f161349b = parcel.readString();
        this.f161350c = parcel.readString();
    }

    public static final class VERecordSegmentData implements Parcelable {
        public static final Parcelable.Creator<VERecordSegmentData> CREATOR = new Parcelable.Creator<VERecordSegmentData>() {
            /* class com.ss.android.vesdk.VERecordData.VERecordSegmentData.C638891 */

            /* renamed from: a */
            public VERecordSegmentData[] newArray(int i) {
                return new VERecordSegmentData[i];
            }

            /* renamed from: a */
            public VERecordSegmentData createFromParcel(Parcel parcel) {
                return new VERecordSegmentData(parcel);
            }
        };

        /* renamed from: a */
        public String f161353a;

        /* renamed from: b */
        public String f161354b;

        /* renamed from: c */
        public long f161355c;

        /* renamed from: d */
        public long f161356d;

        /* renamed from: e */
        public float f161357e;

        /* renamed from: f */
        public float f161358f = 1.0f;

        /* renamed from: g */
        public ROTATE_DEGREE f161359g;

        /* renamed from: h */
        public long f161360h;

        /* renamed from: i */
        public long f161361i;

        /* renamed from: j */
        public boolean f161362j;

        /* renamed from: k */
        public long f161363k;

        /* renamed from: l */
        public long f161364l;

        /* renamed from: m */
        public boolean f161365m;

        public int describeContents() {
            return 0;
        }

        protected VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.f161353a = parcel.readString();
            this.f161354b = parcel.readString();
            this.f161355c = parcel.readLong();
            this.f161356d = parcel.readLong();
            this.f161358f = parcel.readFloat();
            this.f161357e = parcel.readFloat();
            this.f161359g = (ROTATE_DEGREE) parcel.readParcelable(ROTATE_DEGREE.class.getClassLoader());
            this.f161360h = parcel.readLong();
            this.f161361i = parcel.readLong();
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f161362j = z;
            this.f161363k = parcel.readLong();
            this.f161364l = parcel.readLong();
            this.f161365m = parcel.readByte() == 0 ? false : z2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f161353a);
            parcel.writeString(this.f161354b);
            parcel.writeLong(this.f161355c);
            parcel.writeLong(this.f161356d);
            parcel.writeFloat(this.f161358f);
            parcel.writeFloat(this.f161357e);
            parcel.writeParcelable(this.f161359g, i);
            parcel.writeLong(this.f161360h);
            parcel.writeLong(this.f161361i);
            parcel.writeByte(this.f161362j ? (byte) 1 : 0);
            parcel.writeLong(this.f161363k);
            parcel.writeLong(this.f161364l);
            parcel.writeByte(this.f161365m ? (byte) 1 : 0);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f161351f);
        parcel.writeByte(this.f161352g ? (byte) 1 : 0);
        parcel.writeString(this.f161349b);
        parcel.writeString(this.f161350c);
    }
}
