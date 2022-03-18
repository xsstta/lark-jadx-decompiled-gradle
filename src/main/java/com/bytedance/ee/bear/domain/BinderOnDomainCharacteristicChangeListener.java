package com.bytedance.ee.bear.domain;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import java.util.Map;

public interface BinderOnDomainCharacteristicChangeListener extends IInterface, AbstractC6307e.AbstractC6308a.AbstractC6309a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderOnDomainCharacteristicChangeListener {
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

        private static class Proxy implements BinderOnDomainCharacteristicChangeListener {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener";
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

            @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a.AbstractC6309a
            public void onConfigChanged(Map<String, String> map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener");
                    obtain.writeMap(map);
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
            attachInterface(this, "com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener");
        }

        public static BinderOnDomainCharacteristicChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderOnDomainCharacteristicChangeListener)) {
                return new Proxy(iBinder);
            }
            return (BinderOnDomainCharacteristicChangeListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener");
                onConfigChanged(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener");
                return true;
            }
        }
    }
}
