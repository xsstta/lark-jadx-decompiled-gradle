package com.ss.android.lark.mediapicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import java.util.ArrayList;

public class MediaPickerConfig implements Parcelable {
    public static final Parcelable.Creator<MediaPickerConfig> CREATOR = new Parcelable.Creator<MediaPickerConfig>() {
        /* class com.ss.android.lark.mediapicker.MediaPickerConfig.C446131 */

        /* renamed from: a */
        public MediaPickerConfig[] newArray(int i) {
            return new MediaPickerConfig[i];
        }

        /* renamed from: a */
        public MediaPickerConfig createFromParcel(Parcel parcel) {
            return new MediaPickerConfig(parcel);
        }
    };

    /* renamed from: A */
    public int f113062A;

    /* renamed from: B */
    public boolean f113063B;

    /* renamed from: C */
    public boolean f113064C;

    /* renamed from: D */
    public boolean f113065D;

    /* renamed from: E */
    public ArrayList<LocalMedia> f113066E;

    /* renamed from: F */
    public int[] f113067F;

    /* renamed from: a */
    public boolean f113068a;

    /* renamed from: b */
    public boolean f113069b;

    /* renamed from: c */
    public boolean f113070c;

    /* renamed from: d */
    public int f113071d;

    /* renamed from: e */
    public int f113072e;

    /* renamed from: f */
    public int f113073f;

    /* renamed from: g */
    public int f113074g;

    /* renamed from: h */
    public int f113075h;

    /* renamed from: i */
    public int f113076i;

    /* renamed from: j */
    public int f113077j;

    /* renamed from: k */
    public boolean f113078k;

    /* renamed from: l */
    public boolean f113079l;

    /* renamed from: m */
    public boolean f113080m;

    /* renamed from: n */
    public boolean f113081n;

    /* renamed from: o */
    public Class<?> f113082o;

    /* renamed from: p */
    public Class<?> f113083p;

    /* renamed from: q */
    public boolean f113084q;

    /* renamed from: r */
    public boolean f113085r;

    /* renamed from: s */
    public boolean f113086s;

    /* renamed from: t */
    public boolean f113087t;

    /* renamed from: u */
    public int f113088u;

    /* renamed from: v */
    public int f113089v;

    /* renamed from: w */
    public String f113090w;

    /* renamed from: x */
    public String f113091x;

    /* renamed from: y */
    public boolean f113092y;

    /* renamed from: z */
    public int f113093z;

    public int describeContents() {
        return 0;
    }

    public MediaPickerConfig() {
        this.f113068a = true;
        this.f113071d = 9;
        this.f113072e = 1;
        this.f113073f = 9;
        this.f113077j = 3;
        this.f113084q = true;
        this.f113087t = true;
        this.f113089v = 1;
        this.f113090w = "";
        this.f113091x = "";
        this.f113093z = -1;
        this.f113062A = -1;
        this.f113063B = true;
        this.f113064C = true;
        this.f113066E = new ArrayList<>();
        this.f113067F = new int[2];
    }

    protected MediaPickerConfig(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        this.f113068a = true;
        this.f113071d = 9;
        this.f113072e = 1;
        this.f113073f = 9;
        this.f113077j = 3;
        this.f113084q = true;
        this.f113087t = true;
        this.f113089v = 1;
        this.f113090w = "";
        this.f113091x = "";
        this.f113093z = -1;
        this.f113062A = -1;
        this.f113063B = true;
        this.f113064C = true;
        this.f113066E = new ArrayList<>();
        this.f113067F = new int[2];
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f113068a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f113069b = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f113070c = z3;
        this.f113071d = parcel.readInt();
        this.f113072e = parcel.readInt();
        this.f113073f = parcel.readInt();
        this.f113074g = parcel.readInt();
        this.f113075h = parcel.readInt();
        this.f113076i = parcel.readInt();
        this.f113077j = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f113078k = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f113079l = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f113080m = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f113081n = z7;
        this.f113082o = (Class) parcel.readSerializable();
        this.f113083p = (Class) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f113084q = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f113085r = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f113086s = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f113087t = z11;
        this.f113088u = parcel.readInt();
        this.f113089v = parcel.readInt();
        this.f113090w = parcel.readString();
        this.f113091x = parcel.readString();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f113092y = z12;
        this.f113093z = parcel.readInt();
        this.f113062A = parcel.readInt();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f113063B = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f113064C = z14;
        this.f113065D = parcel.readByte() == 0 ? false : z15;
        this.f113066E = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f113067F = parcel.createIntArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f113068a ? (byte) 1 : 0);
        parcel.writeByte(this.f113069b ? (byte) 1 : 0);
        parcel.writeByte(this.f113070c ? (byte) 1 : 0);
        parcel.writeInt(this.f113071d);
        parcel.writeInt(this.f113072e);
        parcel.writeInt(this.f113073f);
        parcel.writeInt(this.f113074g);
        parcel.writeInt(this.f113075h);
        parcel.writeInt(this.f113076i);
        parcel.writeInt(this.f113077j);
        parcel.writeByte(this.f113078k ? (byte) 1 : 0);
        parcel.writeByte(this.f113079l ? (byte) 1 : 0);
        parcel.writeByte(this.f113080m ? (byte) 1 : 0);
        parcel.writeByte(this.f113081n ? (byte) 1 : 0);
        parcel.writeSerializable(this.f113082o);
        parcel.writeSerializable(this.f113083p);
        parcel.writeByte(this.f113084q ? (byte) 1 : 0);
        parcel.writeByte(this.f113085r ? (byte) 1 : 0);
        parcel.writeByte(this.f113086s ? (byte) 1 : 0);
        parcel.writeByte(this.f113087t ? (byte) 1 : 0);
        parcel.writeInt(this.f113088u);
        parcel.writeInt(this.f113089v);
        parcel.writeString(this.f113090w);
        parcel.writeString(this.f113091x);
        parcel.writeByte(this.f113092y ? (byte) 1 : 0);
        parcel.writeInt(this.f113093z);
        parcel.writeInt(this.f113062A);
        parcel.writeByte(this.f113063B ? (byte) 1 : 0);
        parcel.writeByte(this.f113064C ? (byte) 1 : 0);
        parcel.writeByte(this.f113065D ? (byte) 1 : 0);
        parcel.writeTypedList(this.f113066E);
        parcel.writeIntArray(this.f113067F);
    }
}
