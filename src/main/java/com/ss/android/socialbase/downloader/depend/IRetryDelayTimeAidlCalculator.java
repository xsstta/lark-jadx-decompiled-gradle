package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRetryDelayTimeAidlCalculator extends IInterface {

    public static class Default implements IRetryDelayTimeAidlCalculator {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator
        public long calculateRetryDelayTime(int i, int i2) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IRetryDelayTimeAidlCalculator {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IRetryDelayTimeAidlCalculator {
            public static IRetryDelayTimeAidlCalculator sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator
            public long calculateRetryDelayTime(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calculateRetryDelayTime(i, i2);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IRetryDelayTimeAidlCalculator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        public static boolean setDefaultImpl(IRetryDelayTimeAidlCalculator iRetryDelayTimeAidlCalculator) {
            if (Proxy.sDefaultImpl != null || iRetryDelayTimeAidlCalculator == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRetryDelayTimeAidlCalculator;
            return true;
        }

        public static IRetryDelayTimeAidlCalculator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRetryDelayTimeAidlCalculator)) {
                return new Proxy(iBinder);
            }
            return (IRetryDelayTimeAidlCalculator) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long calculateRetryDelayTime = calculateRetryDelayTime(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(calculateRetryDelayTime);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    long calculateRetryDelayTime(int i, int i2) throws RemoteException;
}
