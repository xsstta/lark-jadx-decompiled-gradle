package com.ss.android.photoeditor.ve.crop.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;

public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Parcelable.Creator<CropImageOptions>() {
        /* class com.ss.android.photoeditor.ve.crop.view.CropImageOptions.C598661 */

        /* renamed from: a */
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }

        /* renamed from: a */
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }
    };

    /* renamed from: A */
    public int f148912A;

    /* renamed from: B */
    public int f148913B;

    /* renamed from: C */
    public int f148914C;

    /* renamed from: D */
    public CharSequence f148915D;

    /* renamed from: E */
    public int f148916E;

    /* renamed from: F */
    public Uri f148917F;

    /* renamed from: G */
    public Bitmap.CompressFormat f148918G;

    /* renamed from: H */
    public int f148919H;

    /* renamed from: I */
    public int f148920I;

    /* renamed from: J */
    public int f148921J;

    /* renamed from: K */
    public CropImageView.RequestSizeOptions f148922K;

    /* renamed from: L */
    public boolean f148923L;

    /* renamed from: M */
    public Rect f148924M;

    /* renamed from: N */
    public int f148925N;

    /* renamed from: O */
    public boolean f148926O;

    /* renamed from: P */
    public boolean f148927P;

    /* renamed from: Q */
    public boolean f148928Q;

    /* renamed from: R */
    public int f148929R;

    /* renamed from: S */
    public boolean f148930S;

    /* renamed from: T */
    public boolean f148931T;

    /* renamed from: U */
    public CharSequence f148932U;

    /* renamed from: V */
    public int f148933V;

    /* renamed from: a */
    public CropImageView.CropShape f148934a;

    /* renamed from: b */
    public float f148935b;

    /* renamed from: c */
    public float f148936c;

    /* renamed from: d */
    public CropImageView.Guidelines f148937d;

    /* renamed from: e */
    public CropImageView.ScaleType f148938e;

    /* renamed from: f */
    public boolean f148939f;

    /* renamed from: g */
    public boolean f148940g;

    /* renamed from: h */
    public boolean f148941h;

    /* renamed from: i */
    public boolean f148942i;

    /* renamed from: j */
    public int f148943j;

    /* renamed from: k */
    public float f148944k;

    /* renamed from: l */
    public boolean f148945l;

    /* renamed from: m */
    public int f148946m;

    /* renamed from: n */
    public int f148947n;

    /* renamed from: o */
    public float f148948o;

    /* renamed from: p */
    public int f148949p;

    /* renamed from: q */
    public float f148950q;

    /* renamed from: r */
    public float f148951r;

    /* renamed from: s */
    public float f148952s;

    /* renamed from: t */
    public int f148953t;

    /* renamed from: u */
    public float f148954u;

    /* renamed from: v */
    public int f148955v;

    /* renamed from: w */
    public int f148956w;

    /* renamed from: x */
    public int f148957x;

    /* renamed from: y */
    public int f148958y;

    /* renamed from: z */
    public int f148959z;

    public int describeContents() {
        return 0;
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f148934a = CropImageView.CropShape.RECTANGLE;
        this.f148935b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f148936c = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f148937d = CropImageView.Guidelines.ON_TOUCH;
        this.f148938e = CropImageView.ScaleType.FIT_CENTER;
        this.f148939f = true;
        this.f148940g = true;
        this.f148941h = true;
        this.f148942i = false;
        this.f148943j = 4;
        this.f148944k = 0.1f;
        this.f148945l = false;
        this.f148946m = 1;
        this.f148947n = 1;
        this.f148948o = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f148949p = Color.argb(170, 255, 255, 255);
        this.f148950q = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f148951r = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f148952s = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f148953t = -1;
        this.f148954u = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f148955v = Color.argb(170, 255, 255, 255);
        this.f148956w = Color.argb(119, 0, 0, 0);
        this.f148957x = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f148958y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f148959z = 24;
        this.f148912A = 24;
        this.f148913B = 99999;
        this.f148914C = 99999;
        this.f148915D = "";
        this.f148916E = 0;
        this.f148917F = Uri.EMPTY;
        this.f148918G = Bitmap.CompressFormat.JPEG;
        this.f148919H = 90;
        this.f148920I = 0;
        this.f148921J = 0;
        this.f148922K = CropImageView.RequestSizeOptions.NONE;
        this.f148923L = false;
        this.f148924M = null;
        this.f148925N = -1;
        this.f148926O = true;
        this.f148927P = true;
        this.f148928Q = false;
        this.f148929R = 90;
        this.f148930S = false;
        this.f148931T = false;
        this.f148932U = null;
        this.f148933V = 0;
    }

    /* renamed from: a */
    public void mo203789a() {
        if (this.f148943j < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f148936c >= BitmapDescriptorFactory.HUE_RED) {
            float f = this.f148944k;
            if (f < BitmapDescriptorFactory.HUE_RED || ((double) f) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            } else if (this.f148946m <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f148947n <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f148948o < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.f148950q < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.f148954u < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.f148958y >= 0) {
                int i = this.f148959z;
                if (i >= 0) {
                    int i2 = this.f148912A;
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.f148913B < i) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.f148914C < i2) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f148920I < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f148921J >= 0) {
                        int i3 = this.f148929R;
                        if (i3 < 0 || i3 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    protected CropImageOptions(Parcel parcel) {
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
        this.f148934a = CropImageView.CropShape.values()[parcel.readInt()];
        this.f148935b = parcel.readFloat();
        this.f148936c = parcel.readFloat();
        this.f148937d = CropImageView.Guidelines.values()[parcel.readInt()];
        this.f148938e = CropImageView.ScaleType.values()[parcel.readInt()];
        boolean z11 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f148939f = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f148940g = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f148941h = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f148942i = z4;
        this.f148943j = parcel.readInt();
        this.f148944k = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f148945l = z5;
        this.f148946m = parcel.readInt();
        this.f148947n = parcel.readInt();
        this.f148948o = parcel.readFloat();
        this.f148949p = parcel.readInt();
        this.f148950q = parcel.readFloat();
        this.f148951r = parcel.readFloat();
        this.f148952s = parcel.readFloat();
        this.f148953t = parcel.readInt();
        this.f148954u = parcel.readFloat();
        this.f148955v = parcel.readInt();
        this.f148956w = parcel.readInt();
        this.f148957x = parcel.readInt();
        this.f148958y = parcel.readInt();
        this.f148959z = parcel.readInt();
        this.f148912A = parcel.readInt();
        this.f148913B = parcel.readInt();
        this.f148914C = parcel.readInt();
        this.f148915D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f148916E = parcel.readInt();
        this.f148917F = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f148918G = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f148919H = parcel.readInt();
        this.f148920I = parcel.readInt();
        this.f148921J = parcel.readInt();
        this.f148922K = CropImageView.RequestSizeOptions.values()[parcel.readInt()];
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f148923L = z6;
        this.f148924M = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f148925N = parcel.readInt();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f148926O = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f148927P = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f148928Q = z9;
        this.f148929R = parcel.readInt();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f148930S = z10;
        this.f148931T = parcel.readByte() == 0 ? false : z11;
        this.f148932U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f148933V = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f148934a.ordinal());
        parcel.writeFloat(this.f148935b);
        parcel.writeFloat(this.f148936c);
        parcel.writeInt(this.f148937d.ordinal());
        parcel.writeInt(this.f148938e.ordinal());
        parcel.writeByte(this.f148939f ? (byte) 1 : 0);
        parcel.writeByte(this.f148940g ? (byte) 1 : 0);
        parcel.writeByte(this.f148941h ? (byte) 1 : 0);
        parcel.writeByte(this.f148942i ? (byte) 1 : 0);
        parcel.writeInt(this.f148943j);
        parcel.writeFloat(this.f148944k);
        parcel.writeByte(this.f148945l ? (byte) 1 : 0);
        parcel.writeInt(this.f148946m);
        parcel.writeInt(this.f148947n);
        parcel.writeFloat(this.f148948o);
        parcel.writeInt(this.f148949p);
        parcel.writeFloat(this.f148950q);
        parcel.writeFloat(this.f148951r);
        parcel.writeFloat(this.f148952s);
        parcel.writeInt(this.f148953t);
        parcel.writeFloat(this.f148954u);
        parcel.writeInt(this.f148955v);
        parcel.writeInt(this.f148956w);
        parcel.writeInt(this.f148957x);
        parcel.writeInt(this.f148958y);
        parcel.writeInt(this.f148959z);
        parcel.writeInt(this.f148912A);
        parcel.writeInt(this.f148913B);
        parcel.writeInt(this.f148914C);
        TextUtils.writeToParcel(this.f148915D, parcel, i);
        parcel.writeInt(this.f148916E);
        parcel.writeParcelable(this.f148917F, i);
        parcel.writeString(this.f148918G.name());
        parcel.writeInt(this.f148919H);
        parcel.writeInt(this.f148920I);
        parcel.writeInt(this.f148921J);
        parcel.writeInt(this.f148922K.ordinal());
        parcel.writeInt(this.f148923L ? 1 : 0);
        parcel.writeParcelable(this.f148924M, i);
        parcel.writeInt(this.f148925N);
        parcel.writeByte(this.f148926O ? (byte) 1 : 0);
        parcel.writeByte(this.f148927P ? (byte) 1 : 0);
        parcel.writeByte(this.f148928Q ? (byte) 1 : 0);
        parcel.writeInt(this.f148929R);
        parcel.writeByte(this.f148930S ? (byte) 1 : 0);
        parcel.writeByte(this.f148931T ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f148932U, parcel, i);
        parcel.writeInt(this.f148933V);
    }
}
