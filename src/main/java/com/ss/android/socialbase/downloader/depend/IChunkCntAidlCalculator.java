package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IChunkCntAidlCalculator extends IInterface {

    public static class Default implements IChunkCntAidlCalculator {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator
        public int calculateChunkCount(long j) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IChunkCntAidlCalculator {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IChunkCntAidlCalculator {
            public static IChunkCntAidlCalculator sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator
            public int calculateChunkCount(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().calculateChunkCount(j);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IChunkCntAidlCalculator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        public static boolean setDefaultImpl(IChunkCntAidlCalculator iChunkCntAidlCalculator) {
            if (Proxy.sDefaultImpl != null || iChunkCntAidlCalculator == null) {
                return false;
            }
            Proxy.sDefaultImpl = iChunkCntAidlCalculator;
            return true;
        }

        public static IChunkCntAidlCalculator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IChunkCntAidlCalculator)) {
                return new Proxy(iBinder);
            }
            return (IChunkCntAidlCalculator) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int calculateChunkCount = calculateChunkCount(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(calculateChunkCount);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    int calculateChunkCount(long j) throws RemoteException;
}
