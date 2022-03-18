package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface IDynamicLoader extends IInterface {

    public static class Default implements IDynamicLoader {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
        public IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDynamicLoader {

        /* renamed from: a */
        public static final String f58025a = "com.huawei.hms.feature.dynamic.IDynamicLoader";

        /* renamed from: b */
        public static final int f58026b = 1;

        /* access modifiers changed from: private */
        public static class Proxy implements IDynamicLoader {
            public static IDynamicLoader sDefaultImpl;

            /* renamed from: a */
            public IBinder f58027a;

            public Proxy(IBinder iBinder) {
                this.f58027a = iBinder;
            }

            public IBinder asBinder() {
                return this.f58027a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f58025a;
            }

            @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
            public IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
                IObjectWrapper asInterface;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f58025a);
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (iObjectWrapper2 != null) {
                        iBinder = iObjectWrapper2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f58027a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        asInterface = IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                    } else {
                        asInterface = Stub.getDefaultImpl().load(iObjectWrapper, str, i, iObjectWrapper2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f58025a);
        }

        public static IDynamicLoader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f58025a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicLoader)) ? new Proxy(iBinder) : (IDynamicLoader) queryLocalInterface;
        }

        public static IDynamicLoader getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDynamicLoader iDynamicLoader) {
            if (Proxy.sDefaultImpl != null || iDynamicLoader == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDynamicLoader;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f58025a);
                IObjectWrapper load = load(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(load != null ? load.asBinder() : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f58025a);
                return true;
            }
        }
    }

    IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
