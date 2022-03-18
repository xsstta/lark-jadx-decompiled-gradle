package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class VEDisplaySettings implements Parcelable {
    public static final Parcelable.Creator<VEDisplaySettings> CREATOR = new Parcelable.Creator<VEDisplaySettings>() {
        /* class com.ss.android.vesdk.VEDisplaySettings.C638311 */

        /* renamed from: a */
        public VEDisplaySettings[] newArray(int i) {
            return new VEDisplaySettings[i];
        }

        /* renamed from: a */
        public VEDisplaySettings createFromParcel(Parcel parcel) {
            return new VEDisplaySettings(parcel);
        }
    };

    /* renamed from: a */
    public int f161114a;

    /* renamed from: b */
    public int f161115b;

    /* renamed from: c */
    public VEDisplayFitMode f161116c;

    /* renamed from: d */
    public int f161117d;

    /* renamed from: e */
    public int f161118e;

    /* renamed from: f */
    public int f161119f;

    /* renamed from: g */
    public long f161120g;

    /* renamed from: h */
    public float f161121h;

    /* renamed from: i */
    public VESize f161122i;

    /* renamed from: j */
    public VESize f161123j;

    /* renamed from: k */
    public VESize f161124k;

    /* renamed from: l */
    public VEDisPlayEffect f161125l;

    /* renamed from: m */
    public float f161126m;

    public enum VEDisPlayEffect {
        NONE,
        GAUSSIAN_BLUR
    }

    public enum VEDisplayFitMode {
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_FIT_FULL,
        SCALE_MODE_USER_DEF
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.vesdk.VEDisplaySettings$a */
    public static final class C63832a {

        /* renamed from: a */
        private final VEDisplaySettings f161127a = new VEDisplaySettings();

        /* renamed from: a */
        public VEDisplaySettings mo220677a() {
            return this.f161127a;
        }

        /* renamed from: a */
        public C63832a mo220676a(VESize vESize) {
            this.f161127a.f161122i = vESize;
            return this;
        }
    }

    /* renamed from: a */
    public int mo220658a() {
        return this.f161114a;
    }

    /* renamed from: b */
    public int mo220659b() {
        return this.f161115b;
    }

    /* renamed from: c */
    public VEDisplayFitMode mo220660c() {
        return this.f161116c;
    }

    /* renamed from: d */
    public int mo220661d() {
        return this.f161117d;
    }

    /* renamed from: e */
    public long mo220663e() {
        return this.f161120g;
    }

    /* renamed from: f */
    public float mo220664f() {
        return this.f161121h;
    }

    /* renamed from: g */
    public VESize mo220665g() {
        return this.f161122i;
    }

    /* renamed from: h */
    public VESize mo220666h() {
        return this.f161123j;
    }

    /* renamed from: i */
    public VESize mo220667i() {
        return this.f161124k;
    }

    /* renamed from: j */
    public VEDisPlayEffect mo220668j() {
        return this.f161125l;
    }

    /* renamed from: k */
    public float mo220669k() {
        return this.f161126m;
    }

    private VEDisplaySettings() {
        this.f161116c = VEDisplayFitMode.SCALE_MODE_CENTER_INSIDE;
        this.f161123j = new VESize(0, 0);
        this.f161124k = new VESize(0, 0);
        this.f161125l = VEDisPlayEffect.NONE;
        this.f161126m = BitmapDescriptorFactory.HUE_RED;
    }

    public String toString() {
        return "VEDisplaySettings{mTranslateX=" + this.f161114a + ", mTranslateY=" + this.f161115b + ", mFitMode=" + this.f161116c + ", mRotation=" + this.f161117d + ", mBgColor=" + this.f161120g + ", mDisplayRatio=" + this.f161121h + ", mRenderSize=" + this.f161122i + ", mEffect=" + this.f161125l + ", mEffectIntensity=" + this.f161126m + '}';
    }

    protected VEDisplaySettings(Parcel parcel) {
        VEDisplayFitMode vEDisplayFitMode;
        this.f161116c = VEDisplayFitMode.SCALE_MODE_CENTER_INSIDE;
        this.f161123j = new VESize(0, 0);
        this.f161124k = new VESize(0, 0);
        this.f161125l = VEDisPlayEffect.NONE;
        this.f161126m = BitmapDescriptorFactory.HUE_RED;
        this.f161114a = parcel.readInt();
        this.f161115b = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            vEDisplayFitMode = null;
        } else {
            vEDisplayFitMode = VEDisplayFitMode.values()[readInt];
        }
        this.f161116c = vEDisplayFitMode;
        this.f161117d = parcel.readInt();
        this.f161118e = parcel.readInt();
        this.f161119f = parcel.readInt();
        this.f161120g = (long) parcel.readInt();
        this.f161121h = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f161114a);
        parcel.writeInt(this.f161115b);
        VEDisplayFitMode vEDisplayFitMode = this.f161116c;
        if (vEDisplayFitMode == null) {
            i2 = -1;
        } else {
            i2 = vEDisplayFitMode.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f161117d);
        parcel.writeInt(this.f161118e);
        parcel.writeInt(this.f161119f);
        parcel.writeLong(this.f161120g);
        parcel.writeFloat(this.f161121h);
    }
}
