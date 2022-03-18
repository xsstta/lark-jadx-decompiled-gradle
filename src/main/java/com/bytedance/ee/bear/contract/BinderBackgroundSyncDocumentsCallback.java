package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderBackgroundSyncDocumentsCallback extends IInterface, AbstractC5094ag.AbstractC5095a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderBackgroundSyncDocumentsCallback {
        public IBinder asBinder() {
            return this;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void destroy() {
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void init(Application application) {
        }

        public boolean isNewRemoteService() {
            return false;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void lazyInit(Application application) {
        }

        private static class Proxy implements BinderBackgroundSyncDocumentsCallback {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback";
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void init(Application application) {
            }

            public boolean isNewRemoteService() {
                return false;
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void lazyInit(Application application) {
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5095a
            public void onChange(OfflineDoc offlineDoc) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback");
                    if (offlineDoc != null) {
                        obtain.writeInt(1);
                        offlineDoc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback");
        }

        public static BinderBackgroundSyncDocumentsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderBackgroundSyncDocumentsCallback)) {
                return new Proxy(iBinder);
            }
            return (BinderBackgroundSyncDocumentsCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            OfflineDoc offlineDoc;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback");
                if (parcel.readInt() != 0) {
                    offlineDoc = OfflineDoc.CREATOR.createFromParcel(parcel);
                } else {
                    offlineDoc = null;
                }
                onChange(offlineDoc);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback");
                return true;
            }
        }
    }
}
