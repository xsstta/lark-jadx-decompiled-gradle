package com.ss.android.lark.forward.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.forward.dto.ForwardTarget;

public interface IRemoteForwardTargetFilter extends IInterface {

    public static class Default implements IRemoteForwardTargetFilter {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter
        public boolean filter(ForwardTarget forwardTarget) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteForwardTargetFilter {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IRemoteForwardTargetFilter {
            public static IRemoteForwardTargetFilter sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter
            public boolean filter(ForwardTarget forwardTarget) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter");
                    boolean z = true;
                    if (forwardTarget != null) {
                        obtain.writeInt(1);
                        forwardTarget.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().filter(forwardTarget);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IRemoteForwardTargetFilter getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter");
        }

        public static boolean setDefaultImpl(IRemoteForwardTargetFilter iRemoteForwardTargetFilter) {
            if (Proxy.sDefaultImpl != null || iRemoteForwardTargetFilter == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteForwardTargetFilter;
            return true;
        }

        public static IRemoteForwardTargetFilter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteForwardTargetFilter)) {
                return new Proxy(iBinder);
            }
            return (IRemoteForwardTargetFilter) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ForwardTarget forwardTarget;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter");
                if (parcel.readInt() != 0) {
                    forwardTarget = ForwardTarget.CREATOR.createFromParcel(parcel);
                } else {
                    forwardTarget = null;
                }
                boolean filter = filter(forwardTarget);
                parcel2.writeNoException();
                parcel2.writeInt(filter ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter");
                return true;
            }
        }
    }

    boolean filter(ForwardTarget forwardTarget) throws RemoteException;
}
