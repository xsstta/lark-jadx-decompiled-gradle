package com.ss.android.socialbase.downloader.db;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

public interface ISqlCacheLoadCompleteCallbackAidl extends IInterface {

    public static class Default implements ISqlCacheLoadCompleteCallbackAidl {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl
        public void callback(Map map, Map map2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISqlCacheLoadCompleteCallbackAidl {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements ISqlCacheLoadCompleteCallbackAidl {
            public static ISqlCacheLoadCompleteCallbackAidl sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl
            public void callback(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().callback(map, map2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ISqlCacheLoadCompleteCallbackAidl getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        public static boolean setDefaultImpl(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) {
            if (Proxy.sDefaultImpl != null || iSqlCacheLoadCompleteCallbackAidl == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSqlCacheLoadCompleteCallbackAidl;
            return true;
        }

        public static ISqlCacheLoadCompleteCallbackAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISqlCacheLoadCompleteCallbackAidl)) {
                return new Proxy(iBinder);
            }
            return (ISqlCacheLoadCompleteCallbackAidl) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                ClassLoader classLoader = getClass().getClassLoader();
                callback(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
        }
    }

    void callback(Map map, Map map2) throws RemoteException;
}
