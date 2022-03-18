package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mcj;

public class TileOverlayOptions implements Parcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new Parcelable.Creator<TileOverlayOptions>() {
        /* class com.huawei.hms.maps.model.TileOverlayOptions.C237281 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TileOverlayOptions createFromParcel(Parcel parcel) {
            return new TileOverlayOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TileOverlayOptions[] newArray(int i) {
            return new TileOverlayOptions[i];
        }
    };

    /* renamed from: a */
    private float f58800a;

    /* renamed from: b */
    private boolean f58801b = true;

    /* renamed from: c */
    private float f58802c;

    /* renamed from: d */
    private mcj f58803d;

    /* renamed from: e */
    private boolean f58804e = true;

    /* renamed from: f */
    private TileProvider f58805f;

    public TileOverlayOptions() {
    }

    protected TileOverlayOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58800a = parcelReader.readFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.f58801b = parcelReader.readBoolean(3, true);
        this.f58802c = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
        IBinder readIBinder = parcelReader.readIBinder(5, null);
        if (readIBinder != null) {
            this.f58803d = mcj.maa.m86870a(readIBinder);
        }
        this.f58804e = parcelReader.readBoolean(6, true);
        this.f58805f = new TileProvider() {
            /* class com.huawei.hms.maps.model.TileOverlayOptions.C237292 */

            @Override // com.huawei.hms.maps.model.TileProvider
            public final Tile getTile(int i, int i2, int i3) {
                try {
                    return TileOverlayOptions.this.f58803d.mo84267a(i, i2, i3);
                } catch (RemoteException unused) {
                    return null;
                }
            }
        };
    }

    public int describeContents() {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.f58804e = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.f58804e;
    }

    public TileProvider getTileProvider() {
        return this.f58805f;
    }

    public float getTransparency() {
        return this.f58802c;
    }

    public float getZIndex() {
        return this.f58800a;
    }

    public boolean isVisible() {
        return this.f58801b;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f58805f = tileProvider;
        this.f58803d = tileProvider == null ? null : new mcj.maa() {
            /* class com.huawei.hms.maps.model.TileOverlayOptions.BinderC237303 */

            @Override // com.huawei.hms.maps.mcj
            /* renamed from: a */
            public final Tile mo84267a(int i, int i2, int i3) {
                return TileOverlayOptions.this.f58805f.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions transparency(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED, "Transparency should be equal or more than 0.0");
        if (f > 1.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, "Transparency should be equal or less than 1.0");
        this.f58802c = f;
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.f58801b = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.f58800a);
        parcelWrite.writeBoolean(3, this.f58801b);
        parcelWrite.writeFloat(4, this.f58802c);
        parcelWrite.writeIBinder(5, this.f58803d.asBinder(), false);
        parcelWrite.writeBoolean(6, this.f58804e);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f) {
        this.f58800a = f;
        return this;
    }
}
