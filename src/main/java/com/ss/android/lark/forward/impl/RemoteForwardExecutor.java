package com.ss.android.lark.forward.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback;
import java.util.ArrayList;
import java.util.List;

public interface RemoteForwardExecutor extends IInterface {

    public static class Default implements RemoteForwardExecutor {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.forward.impl.RemoteForwardExecutor
        public void onForward(List<ForwardTarget> list, Bundle bundle, RemoteForwardExecuteCallback remoteForwardExecuteCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements RemoteForwardExecutor {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements RemoteForwardExecutor {
            public static RemoteForwardExecutor sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.forward.impl.RemoteForwardExecutor";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.forward.impl.RemoteForwardExecutor
            public void onForward(List<ForwardTarget> list, Bundle bundle, RemoteForwardExecuteCallback remoteForwardExecuteCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.forward.impl.RemoteForwardExecutor");
                    obtain.writeTypedList(list);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (remoteForwardExecuteCallback != null) {
                        iBinder = remoteForwardExecuteCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onForward(list, bundle, remoteForwardExecuteCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static RemoteForwardExecutor getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.forward.impl.RemoteForwardExecutor");
        }

        public static boolean setDefaultImpl(RemoteForwardExecutor remoteForwardExecutor) {
            if (Proxy.sDefaultImpl != null || remoteForwardExecutor == null) {
                return false;
            }
            Proxy.sDefaultImpl = remoteForwardExecutor;
            return true;
        }

        public static RemoteForwardExecutor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.forward.impl.RemoteForwardExecutor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof RemoteForwardExecutor)) {
                return new Proxy(iBinder);
            }
            return (RemoteForwardExecutor) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.forward.impl.RemoteForwardExecutor");
                ArrayList createTypedArrayList = parcel.createTypedArrayList(ForwardTarget.CREATOR);
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                onForward(createTypedArrayList, bundle, RemoteForwardExecuteCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.forward.impl.RemoteForwardExecutor");
                return true;
            }
        }
    }

    void onForward(List<ForwardTarget> list, Bundle bundle, RemoteForwardExecuteCallback remoteForwardExecuteCallback) throws RemoteException;
}
