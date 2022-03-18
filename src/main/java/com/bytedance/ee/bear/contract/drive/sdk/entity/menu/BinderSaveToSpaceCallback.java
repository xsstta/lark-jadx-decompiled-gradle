package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderSaveToSpaceCallback extends IInterface, AbstractC5150g.AbstractC5155e, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderSaveToSpaceCallback {
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

        /* access modifiers changed from: private */
        public static class Proxy implements BinderSaveToSpaceCallback {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback";
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

            @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5155e
            public void onClick(boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
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
            attachInterface(this, "com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback");
        }

        public static BinderSaveToSpaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderSaveToSpaceCallback)) {
                return new Proxy(iBinder);
            }
            return (BinderSaveToSpaceCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback");
                if (parcel.readInt() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                onClick(z);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback");
                return true;
            }
        }
    }
}
