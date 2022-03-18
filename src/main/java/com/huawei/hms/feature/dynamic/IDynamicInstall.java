package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface IDynamicInstall extends IInterface {

    public static class Default implements IDynamicInstall {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.dynamic.IDynamicInstall
        public Bundle install(IObjectWrapper iObjectWrapper, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDynamicInstall {

        /* renamed from: a */
        public static final String f58022a = "com.huawei.hms.feature.dynamic.IDynamicInstall";

        /* renamed from: b */
        public static final int f58023b = 1;

        /* access modifiers changed from: private */
        public static class Proxy implements IDynamicInstall {
            public static IDynamicInstall sDefaultImpl;

            /* renamed from: a */
            public IBinder f58024a;

            public Proxy(IBinder iBinder) {
                this.f58024a = iBinder;
            }

            public IBinder asBinder() {
                return this.f58024a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f58022a;
            }

            @Override // com.huawei.hms.feature.dynamic.IDynamicInstall
            public Bundle install(IObjectWrapper iObjectWrapper, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f58022a);
                    Bundle bundle2 = null;
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f58024a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().install(iObjectWrapper, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f58022a);
        }

        public static IDynamicInstall asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f58022a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicInstall)) ? new Proxy(iBinder) : (IDynamicInstall) queryLocalInterface;
        }

        public static IDynamicInstall getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDynamicInstall iDynamicInstall) {
            if (Proxy.sDefaultImpl != null || iDynamicInstall == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDynamicInstall;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f58022a);
                Bundle install = install(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (install != null) {
                    parcel2.writeInt(1);
                    install.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f58022a);
                return true;
            }
        }
    }

    Bundle install(IObjectWrapper iObjectWrapper, Bundle bundle) throws RemoteException;
}
