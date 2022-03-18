package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.util.Locale;

public class Cap implements Parcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new Parcelable.Creator<Cap>() {
        /* class com.huawei.hms.maps.model.Cap.C237101 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Cap createFromParcel(Parcel parcel) {
            return Cap.m86901a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Cap[] newArray(int i) {
            return new Cap[i];
        }
    };
    public static final int TYPE_BUTT_CAP = 0;
    public static final int TYPE_CUSTOM_CAP = 3;
    public static final int TYPE_ROUND_CAP = 2;
    public static final int TYPE_SQUARE_CAP = 1;

    /* renamed from: a */
    private int f58719a;

    /* renamed from: b */
    private BitmapDescriptor f58720b;

    /* renamed from: c */
    private float f58721c;

    protected Cap(int i) {
        this(i, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
    }

    private Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        Preconditions.checkArgument(i != 3 || (bitmapDescriptor != null && (f != null && (f.floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (f.floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) > 0)), String.format(Locale.ENGLISH, "Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
        this.f58719a = i;
        this.f58720b = bitmapDescriptor;
        if (f != null) {
            this.f58721c = f.floatValue();
        }
    }

    private Cap(int i, Float f) {
        this(i, null, f);
    }

    protected Cap(BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }

    /* renamed from: a */
    protected static Cap m86901a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int readInt = parcelReader.readInt(2, 3);
        if (readInt == 0) {
            return new ButtCap();
        }
        if (readInt == 1) {
            return new SquareCap();
        }
        if (readInt == 2) {
            return new RoundCap();
        }
        if (readInt == 3) {
            IBinder readIBinder = parcelReader.readIBinder(3, null);
            float readFloat = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
            if (readIBinder != null) {
                BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
                return readFloat != BitmapDescriptorFactory.HUE_RED ? new CustomCap(bitmapDescriptor, readFloat) : new CustomCap(bitmapDescriptor);
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f58719a == cap.f58719a && Objects.equal(this.f58720b, cap.f58720b) && Objects.equal(Float.valueOf(this.f58721c), Float.valueOf(cap.f58721c));
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f58719a), this.f58720b, Float.valueOf(this.f58721c));
    }

    public String toString() {
        return "Cap: type=" + this.f58719a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f58719a);
        BitmapDescriptor bitmapDescriptor = this.f58720b;
        parcelWrite.writeIBinder(3, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeFloat(4, this.f58721c);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
