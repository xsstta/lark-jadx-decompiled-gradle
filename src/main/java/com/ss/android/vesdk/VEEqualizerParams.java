package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public class VEEqualizerParams implements Parcelable {
    public static final Parcelable.Creator<VEEqualizerParams> CREATOR = new Parcelable.Creator<VEEqualizerParams>() {
        /* class com.ss.android.vesdk.VEEqualizerParams.C638501 */

        /* renamed from: a */
        public VEEqualizerParams[] newArray(int i) {
            return new VEEqualizerParams[i];
        }

        /* renamed from: a */
        public VEEqualizerParams createFromParcel(Parcel parcel) {
            return new VEEqualizerParams(parcel);
        }
    };

    /* renamed from: a */
    public String f161260a = "";

    /* renamed from: b */
    public float f161261b = 12.0f;

    /* renamed from: c */
    public float f161262c = 1.0f;

    /* renamed from: d */
    public float f161263d = 1.0f;

    /* renamed from: e */
    public float f161264e = 1.0f;

    /* renamed from: f */
    public float f161265f = 1.0f;

    /* renamed from: g */
    public float f161266g = 1.0f;

    /* renamed from: h */
    public float f161267h = 1.0f;

    /* renamed from: i */
    public float f161268i = 1.0f;

    /* renamed from: j */
    public float f161269j = 1.0f;

    /* renamed from: k */
    public float f161270k = 1.0f;

    /* renamed from: l */
    public float f161271l = 1.0f;

    /* renamed from: m */
    public float f161272m;

    /* renamed from: n */
    public float f161273n;

    /* renamed from: o */
    public float f161274o;

    /* renamed from: p */
    public float f161275p;

    /* renamed from: q */
    public float f161276q;

    /* renamed from: r */
    public float f161277r;

    /* renamed from: s */
    public float f161278s;

    /* renamed from: t */
    public float f161279t;

    /* renamed from: u */
    public float f161280u;

    /* renamed from: v */
    public float f161281v;

    public int describeContents() {
        return 0;
    }

    public VEEqualizerParams() {
    }

    public String toString() {
        return "VEEqualizerParams{name='" + this.f161260a + '\'' + ", preamp=" + this.f161261b + ", amp31=" + this.f161272m + ", amp63=" + this.f161273n + ", amp125=" + this.f161274o + ", amp250=" + this.f161275p + ", amp500=" + this.f161276q + ", amp1000=" + this.f161277r + ", amp2000=" + this.f161278s + ", amp4000=" + this.f161279t + ", amp8000=" + this.f161280u + ", amp16000=" + this.f161281v + ", freqWidth31=" + this.f161262c + ", freqWidth63=" + this.f161263d + ", freqWidth125=" + this.f161264e + ", freqWidth250=" + this.f161265f + ", freqWidth500=" + this.f161266g + ", freqWidth1000=" + this.f161267h + ", freqWidth2000=" + this.f161268i + ", freqWidth4000=" + this.f161269j + ", freqWidth8000=" + this.f161270k + ", freqWidth16000=" + this.f161271l + '}';
    }

    protected VEEqualizerParams(Parcel parcel) {
        this.f161260a = parcel.readString();
        this.f161261b = parcel.readFloat();
        this.f161262c = parcel.readFloat();
        this.f161263d = parcel.readFloat();
        this.f161264e = parcel.readFloat();
        this.f161265f = parcel.readFloat();
        this.f161266g = parcel.readFloat();
        this.f161267h = parcel.readFloat();
        this.f161268i = parcel.readFloat();
        this.f161269j = parcel.readFloat();
        this.f161270k = parcel.readFloat();
        this.f161271l = parcel.readFloat();
        this.f161272m = parcel.readFloat();
        this.f161273n = parcel.readFloat();
        this.f161274o = parcel.readFloat();
        this.f161275p = parcel.readFloat();
        this.f161276q = parcel.readFloat();
        this.f161277r = parcel.readFloat();
        this.f161278s = parcel.readFloat();
        this.f161279t = parcel.readFloat();
        this.f161280u = parcel.readFloat();
        this.f161281v = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161260a);
        parcel.writeFloat(this.f161261b);
        parcel.writeFloat(this.f161262c);
        parcel.writeFloat(this.f161263d);
        parcel.writeFloat(this.f161264e);
        parcel.writeFloat(this.f161265f);
        parcel.writeFloat(this.f161266g);
        parcel.writeFloat(this.f161267h);
        parcel.writeFloat(this.f161268i);
        parcel.writeFloat(this.f161269j);
        parcel.writeFloat(this.f161270k);
        parcel.writeFloat(this.f161271l);
        parcel.writeFloat(this.f161272m);
        parcel.writeFloat(this.f161273n);
        parcel.writeFloat(this.f161274o);
        parcel.writeFloat(this.f161275p);
        parcel.writeFloat(this.f161276q);
        parcel.writeFloat(this.f161277r);
        parcel.writeFloat(this.f161278s);
        parcel.writeFloat(this.f161279t);
        parcel.writeFloat(this.f161280u);
        parcel.writeFloat(this.f161281v);
    }
}
