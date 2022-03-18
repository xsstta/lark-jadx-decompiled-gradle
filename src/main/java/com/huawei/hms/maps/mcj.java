package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.model.Tile;

public interface mcj extends IInterface {

    public static abstract class maa extends Binder implements mcj {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcj$maa$maa  reason: collision with other inner class name */
        public static class C70281maa implements mcj {

            /* renamed from: a */
            private IBinder f58672a;

            C70281maa(IBinder iBinder) {
                this.f58672a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcj
            /* renamed from: a */
            public final Tile mo84267a(int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.ITileProviderDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f58672a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Tile.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f58672a;
            }
        }

        public maa() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.ITileProviderDelegate");
        }

        /* renamed from: a */
        public static mcj m86870a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.ITileProviderDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcj)) ? new C70281maa(iBinder) : (mcj) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.model.internal.ITileProviderDelegate");
                Tile a = mo84267a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.model.internal.ITileProviderDelegate");
                return true;
            }
        }
    }

    /* renamed from: a */
    Tile mo84267a(int i, int i2, int i3);
}
