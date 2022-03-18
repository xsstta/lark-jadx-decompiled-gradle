package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEEditor;
import java.util.Arrays;

public class VEEditorModel implements Parcelable {
    public static final Parcelable.Creator<VEEditorModel> CREATOR = new Parcelable.Creator<VEEditorModel>() {
        /* class com.ss.android.vesdk.VEEditorModel.C638491 */

        /* renamed from: a */
        public VEEditorModel[] newArray(int i) {
            return new VEEditorModel[i];
        }

        /* renamed from: a */
        public VEEditorModel createFromParcel(Parcel parcel) {
            return new VEEditorModel(parcel);
        }
    };

    /* renamed from: A */
    public float f161229A;

    /* renamed from: B */
    public float f161230B;

    /* renamed from: C */
    public boolean f161231C;

    /* renamed from: D */
    public VEEditor.VIDEO_GRAVITY f161232D;

    /* renamed from: E */
    public VEEditor.VIDEO_SCALETYPE f161233E;

    /* renamed from: a */
    public String f161234a;

    /* renamed from: b */
    public int f161235b;

    /* renamed from: c */
    public int f161236c;

    /* renamed from: d */
    public boolean f161237d;

    /* renamed from: e */
    public VEEditor.VIDEO_RATIO f161238e;

    /* renamed from: f */
    public boolean f161239f;

    /* renamed from: g */
    public int f161240g;

    /* renamed from: h */
    public int f161241h;

    /* renamed from: i */
    public int f161242i;

    /* renamed from: j */
    public String f161243j;

    /* renamed from: k */
    public int f161244k;

    /* renamed from: l */
    public int f161245l;

    /* renamed from: m */
    public int f161246m;

    /* renamed from: n */
    public String[] f161247n;

    /* renamed from: o */
    public String[] f161248o;

    /* renamed from: p */
    public String[] f161249p;

    /* renamed from: q */
    public int f161250q;

    /* renamed from: r */
    public int f161251r;

    /* renamed from: s */
    public String f161252s;

    /* renamed from: t */
    public String f161253t;

    /* renamed from: u */
    public double f161254u;

    /* renamed from: v */
    public double f161255v;

    /* renamed from: w */
    public double f161256w;

    /* renamed from: x */
    public double f161257x;

    /* renamed from: y */
    public String f161258y;

    /* renamed from: z */
    public String f161259z;

    public int describeContents() {
        return 0;
    }

    public VEEditorModel() {
    }

    public String toString() {
        return "{" + "\"projectXML\":\"" + this.f161234a + '\"' + ",\"inPoint\":" + this.f161235b + ",\"outputPoint\":" + this.f161236c + ",\"reverseDone\":" + this.f161237d + ",\"videoOutRes\":" + this.f161238e + ",\"separateAV\":" + this.f161239f + ",\"masterTrackIndex\":" + this.f161240g + ",\"hostTrackIndex\":" + this.f161241h + ",\"audioEffectFilterIndex\":" + this.f161242i + ",\"modelDir\":\"" + this.f161243j + '\"' + ",\"colorFilterIndex\":" + this.f161244k + ",\"effectHDRFilterIndex\":" + this.f161245l + ",\"mLensHDRFilterIndex\":" + this.f161246m + ",\"videoPaths\":" + Arrays.toString(this.f161247n) + ",\"audioPaths\":" + Arrays.toString(this.f161248o) + ",\"transitions\":" + Arrays.toString(this.f161249p) + ",\"backgroundColor\":" + this.f161250q + ",\"videoBackgroundColor\":" + this.f161251r + ",\"outputFile\":\"" + this.f161252s + '\"' + ",\"watermarkFile\":\"" + this.f161253t + '\"' + ",\"watermarkWidth\":" + this.f161254u + ",\"watermarkHeight\":" + this.f161255v + ",\"watermarkOffsetX\":" + this.f161256w + ",\"watermarkOffsetY\":" + this.f161257x + ",\"colorFilterLeftPath\":\"" + this.f161258y + '\"' + ",\"colorFilterRightPath\":\"" + this.f161259z + '\"' + ",\"colorFilterPosition\":" + this.f161229A + ",\"colorFilterIntensity\":" + this.f161230B + ",\"useColorFilterResIntensity\":" + this.f161231C + ",\"videoGravity\":" + this.f161232D + ",\"videoScaleType\":" + this.f161233E + '}';
    }

    protected VEEditorModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f161234a = parcel.readString();
        this.f161235b = parcel.readInt();
        this.f161236c = parcel.readInt();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f161237d = z;
        this.f161238e = VEEditor.VIDEO_RATIO.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f161239f = z2;
        this.f161240g = parcel.readInt();
        this.f161241h = parcel.readInt();
        this.f161242i = parcel.readInt();
        this.f161243j = parcel.readString();
        this.f161244k = parcel.readInt();
        this.f161245l = parcel.readInt();
        this.f161246m = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            String[] strArr = new String[readInt];
            this.f161247n = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.f161247n = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            String[] strArr2 = new String[readInt2];
            this.f161248o = strArr2;
            parcel.readStringArray(strArr2);
        } else {
            this.f161248o = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            String[] strArr3 = new String[readInt3];
            this.f161249p = strArr3;
            parcel.readStringArray(strArr3);
        } else {
            this.f161249p = null;
        }
        this.f161250q = parcel.readInt();
        this.f161252s = parcel.readString();
        this.f161253t = parcel.readString();
        this.f161254u = parcel.readDouble();
        this.f161255v = parcel.readDouble();
        this.f161256w = parcel.readDouble();
        this.f161257x = parcel.readDouble();
        this.f161258y = parcel.readString();
        this.f161259z = parcel.readString();
        this.f161229A = parcel.readFloat();
        this.f161230B = parcel.readFloat();
        this.f161231C = parcel.readInt() == 1 ? true : z3;
        this.f161232D = VEEditor.VIDEO_GRAVITY.values()[parcel.readInt()];
        this.f161233E = VEEditor.VIDEO_SCALETYPE.values()[parcel.readInt()];
        this.f161251r = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161234a);
        parcel.writeInt(this.f161235b);
        parcel.writeInt(this.f161236c);
        parcel.writeInt(this.f161237d ? 1 : 0);
        parcel.writeInt(this.f161238e.ordinal());
        parcel.writeInt(this.f161239f ? 1 : 0);
        parcel.writeInt(this.f161240g);
        parcel.writeInt(this.f161241h);
        parcel.writeInt(this.f161242i);
        parcel.writeString(this.f161243j);
        parcel.writeInt(this.f161244k);
        parcel.writeInt(this.f161245l);
        parcel.writeInt(this.f161246m);
        String[] strArr = this.f161247n;
        if (strArr != null) {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.f161247n);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr2 = this.f161248o;
        if (strArr2 != null) {
            parcel.writeInt(strArr2.length);
            parcel.writeStringArray(this.f161248o);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr3 = this.f161249p;
        if (strArr3 != null) {
            parcel.writeInt(strArr3.length);
            parcel.writeStringArray(this.f161249p);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.f161250q);
        parcel.writeString(this.f161252s);
        parcel.writeString(this.f161253t);
        parcel.writeDouble(this.f161254u);
        parcel.writeDouble(this.f161255v);
        parcel.writeDouble(this.f161256w);
        parcel.writeDouble(this.f161257x);
        parcel.writeString(this.f161258y);
        parcel.writeString(this.f161259z);
        parcel.writeFloat(this.f161229A);
        parcel.writeFloat(this.f161230B);
        parcel.writeInt(this.f161231C ? 1 : 0);
        parcel.writeInt(this.f161232D.ordinal());
        parcel.writeInt(this.f161233E.ordinal());
        parcel.writeInt(this.f161251r);
    }
}
