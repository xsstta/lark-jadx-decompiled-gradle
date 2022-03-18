package com.ss.android.lark.mediarecorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;

public class MediaRecorderConfig implements Parcelable {
    public static final Parcelable.Creator<MediaRecorderConfig> CREATOR = new Parcelable.Creator<MediaRecorderConfig>() {
        /* class com.ss.android.lark.mediarecorder.MediaRecorderConfig.C447701 */

        /* renamed from: a */
        public MediaRecorderConfig[] newArray(int i) {
            return new MediaRecorderConfig[i];
        }

        /* renamed from: a */
        public MediaRecorderConfig createFromParcel(Parcel parcel) {
            return new MediaRecorderConfig(parcel);
        }
    };

    /* renamed from: a */
    public String f113387a;

    /* renamed from: b */
    public String f113388b;

    /* renamed from: c */
    public boolean f113389c;

    /* renamed from: d */
    public int f113390d;

    /* renamed from: e */
    public int f113391e = 1;

    /* renamed from: f */
    public boolean f113392f;

    /* renamed from: g */
    public int f113393g = -1;

    /* renamed from: h */
    public int f113394h = -1;

    /* renamed from: i */
    public C44796g.AbstractC44798a f113395i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static C44771a m177530a() {
        return new C44771a();
    }

    public MediaRecorderConfig() {
    }

    /* renamed from: com.ss.android.lark.mediarecorder.MediaRecorderConfig$a */
    public static class C44771a {

        /* renamed from: a */
        private MediaRecorderConfig f113396a = new MediaRecorderConfig();

        /* renamed from: a */
        public MediaRecorderConfig mo158504a() {
            return new MediaRecorderConfig(this.f113396a);
        }

        /* renamed from: a */
        public C44771a mo158500a(int i) {
            this.f113396a.f113393g = i;
            return this;
        }

        /* renamed from: b */
        public C44771a mo158505b(int i) {
            this.f113396a.f113394h = i;
            return this;
        }

        /* renamed from: c */
        public C44771a mo158507c(int i) {
            this.f113396a.f113391e = i;
            return this;
        }

        /* renamed from: d */
        public C44771a mo158508d(int i) {
            this.f113396a.f113390d = i;
            return this;
        }

        /* renamed from: a */
        public C44771a mo158501a(C44796g.AbstractC44798a aVar) {
            if (aVar != null) {
                C44796g.m177634a(aVar);
            }
            this.f113396a.f113395i = aVar;
            return this;
        }

        /* renamed from: b */
        public C44771a mo158506b(String str) {
            this.f113396a.f113388b = str;
            return this;
        }

        /* renamed from: a */
        public C44771a mo158502a(String str) {
            this.f113396a.f113387a = str;
            return this;
        }

        /* renamed from: a */
        public C44771a mo158503a(boolean z) {
            this.f113396a.f113392f = z;
            return this;
        }
    }

    public MediaRecorderConfig(MediaRecorderConfig mediaRecorderConfig) {
        this.f113387a = mediaRecorderConfig.f113387a;
        this.f113388b = mediaRecorderConfig.f113388b;
        this.f113389c = mediaRecorderConfig.f113389c;
        this.f113391e = mediaRecorderConfig.f113391e;
        this.f113390d = mediaRecorderConfig.f113390d;
        this.f113392f = mediaRecorderConfig.f113392f;
        this.f113393g = mediaRecorderConfig.f113393g;
        this.f113394h = mediaRecorderConfig.f113394h;
        this.f113395i = mediaRecorderConfig.f113395i;
    }

    protected MediaRecorderConfig(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f113387a = parcel.readString();
        this.f113388b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f113389c = z;
        this.f113390d = parcel.readInt();
        this.f113391e = parcel.readInt();
        this.f113392f = parcel.readByte() == 0 ? false : z2;
        this.f113393g = parcel.readInt();
        this.f113394h = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113387a);
        parcel.writeString(this.f113388b);
        parcel.writeByte(this.f113389c ? (byte) 1 : 0);
        parcel.writeInt(this.f113390d);
        parcel.writeInt(this.f113391e);
        parcel.writeByte(this.f113392f ? (byte) 1 : 0);
        parcel.writeInt(this.f113393g);
        parcel.writeInt(this.f113394h);
    }
}
