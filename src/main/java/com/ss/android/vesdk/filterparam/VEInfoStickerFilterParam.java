package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class VEInfoStickerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEInfoStickerFilterParam> CREATOR = new Parcelable.Creator<VEInfoStickerFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEInfoStickerFilterParam.C640081 */

        /* renamed from: a */
        public VEInfoStickerFilterParam[] newArray(int i) {
            return new VEInfoStickerFilterParam[i];
        }

        /* renamed from: a */
        public VEInfoStickerFilterParam createFromParcel(Parcel parcel) {
            return new VEInfoStickerFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public String f161609a = "";

    /* renamed from: b */
    public String[] f161610b;

    /* renamed from: c */
    public float f161611c;

    /* renamed from: d */
    public float f161612d;

    /* renamed from: e */
    public float f161613e;

    /* renamed from: f */
    public int f161614f;

    /* renamed from: g */
    public int f161615g;

    /* renamed from: h */
    public float f161616h = 1.0f;

    /* renamed from: i */
    public float f161617i = 1.0f;

    /* renamed from: j */
    public int f161618j;

    /* renamed from: k */
    public boolean f161619k;

    /* renamed from: l */
    public boolean f161620l;

    /* renamed from: m */
    public VEStickerAnimationParam f161621m;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public static class VEStickerAnimationParam implements Parcelable {
        public static final Parcelable.Creator<VEStickerAnimationParam> CREATOR = new Parcelable.Creator<VEStickerAnimationParam>() {
            /* class com.ss.android.vesdk.filterparam.VEInfoStickerFilterParam.VEStickerAnimationParam.C640091 */

            /* renamed from: a */
            public VEStickerAnimationParam[] newArray(int i) {
                return new VEStickerAnimationParam[i];
            }

            /* renamed from: a */
            public VEStickerAnimationParam createFromParcel(Parcel parcel) {
                return new VEStickerAnimationParam(parcel);
            }
        };

        /* renamed from: a */
        public boolean f161622a;

        /* renamed from: b */
        public String f161623b = "";

        /* renamed from: c */
        public int f161624c;

        /* renamed from: d */
        public String f161625d = "";

        /* renamed from: e */
        public int f161626e;

        public int describeContents() {
            return 0;
        }

        public VEStickerAnimationParam() {
        }

        protected VEStickerAnimationParam(Parcel parcel) {
            boolean z;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f161622a = z;
            this.f161623b = parcel.readString();
            this.f161624c = parcel.readInt();
            this.f161625d = parcel.readString();
            this.f161626e = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f161622a ? (byte) 1 : 0);
            parcel.writeString(this.f161623b);
            parcel.writeInt(this.f161624c);
            parcel.writeString(this.f161625d);
            parcel.writeInt(this.f161626e);
        }
    }

    public VEInfoStickerFilterParam() {
        this.filterName = "info sticker";
        this.filterType = 9;
        this.filterDurationType = 1;
        this.f161609a = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEInfoStickerFilterParam{resPath='" + this.f161609a + '\'' + ", param=" + Arrays.toString(this.f161610b) + ", offsetX=" + this.f161611c + ", offsetY=" + this.f161612d + ", degree=" + this.f161613e + ", startTime=" + this.f161614f + ", endTime=" + this.f161615g + ", scale=" + this.f161616h + ", alpha=" + this.f161617i + ", layer=" + this.f161618j + ", flipX=" + this.f161619k + ", flipY=" + this.f161620l + ", animationParam=" + this.f161621m + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEInfoStickerFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f161609a = parcel.readString();
        this.f161610b = parcel.createStringArray();
        this.f161611c = parcel.readFloat();
        this.f161612d = parcel.readFloat();
        this.f161613e = parcel.readFloat();
        this.f161614f = parcel.readInt();
        this.f161615g = parcel.readInt();
        this.f161616h = parcel.readFloat();
        this.f161617i = parcel.readFloat();
        this.f161618j = parcel.readInt();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161619k = z;
        this.f161620l = parcel.readByte() == 0 ? false : z2;
        this.f161621m = (VEStickerAnimationParam) parcel.readParcelable(VEStickerAnimationParam.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f161609a);
        parcel.writeStringArray(this.f161610b);
        parcel.writeFloat(this.f161611c);
        parcel.writeFloat(this.f161612d);
        parcel.writeFloat(this.f161613e);
        parcel.writeInt(this.f161614f);
        parcel.writeInt(this.f161615g);
        parcel.writeFloat(this.f161616h);
        parcel.writeFloat(this.f161617i);
        parcel.writeInt(this.f161618j);
        parcel.writeByte(this.f161619k ? (byte) 1 : 0);
        parcel.writeByte(this.f161620l ? (byte) 1 : 0);
        parcel.writeParcelable(this.f161621m, i);
    }
}
