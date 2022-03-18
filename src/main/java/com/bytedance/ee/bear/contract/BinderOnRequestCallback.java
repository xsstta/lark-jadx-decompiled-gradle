package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderOnRequestCallback extends IInterface, am.AbstractC5113f, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderOnRequestCallback {
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

        private static class Proxy implements BinderOnRequestCallback {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderOnRequestCallback";
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

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
            public void onSuccess() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5113f
            public void onFail(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderOnRequestCallback");
        }

        public static BinderOnRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderOnRequestCallback)) {
                return new Proxy(iBinder);
            }
            return (BinderOnRequestCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
                onSuccess();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderOnRequestCallback");
                return true;
            }
        }
    }
}
