package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IObjectWrapper extends IInterface {

    public static class Default implements IObjectWrapper {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IObjectWrapper {

        /* renamed from: a */
        public static final String f58028a = "com.huawei.hms.feature.dynamic.IObjectWrapper";

        /* access modifiers changed from: private */
        public static class Proxy implements IObjectWrapper {
            public static IObjectWrapper sDefaultImpl;

            /* renamed from: a */
            public IBinder f58029a;

            public Proxy(IBinder iBinder) {
                this.f58029a = iBinder;
            }

            public IBinder asBinder() {
                return this.f58029a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f58028a;
            }
        }

        public Stub() {
            attachInterface(this, f58028a);
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f58028a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) queryLocalInterface;
        }

        public static IObjectWrapper getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IObjectWrapper iObjectWrapper) {
            if (Proxy.sDefaultImpl != null || iObjectWrapper == null) {
                return false;
            }
            Proxy.sDefaultImpl = iObjectWrapper;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(f58028a);
            return true;
        }
    }
}
