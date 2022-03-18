package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderIManualOfflineCallback extends IInterface, am.AbstractC5110c, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderIManualOfflineCallback {
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

        private static class Proxy implements BinderIManualOfflineCallback {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderIManualOfflineCallback";
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

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
            public void onDownloadStatusChange() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
            public void onShowConfirmDownloadDialog(Document document, long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
                    if (document != null) {
                        obtain.writeInt(1);
                        document.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    if (binderIManualOfflineDialogCallback != null) {
                        iBinder = binderIManualOfflineDialogCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
        }

        public static BinderIManualOfflineCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderIManualOfflineCallback)) {
                return new Proxy(iBinder);
            }
            return (BinderIManualOfflineCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Document document;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
                if (parcel.readInt() != 0) {
                    document = Document.CREATOR.createFromParcel(parcel);
                } else {
                    document = null;
                }
                onShowConfirmDownloadDialog(document, parcel.readLong(), BinderIManualOfflineDialogCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
                onDownloadStatusChange();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderIManualOfflineCallback");
                return true;
            }
        }
    }
}
