package com.bytedance.ee.bear.notification;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.notification.AbstractC10344g;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import java.util.List;

public interface BinderINotificationView extends IInterface, AbstractC10344g.AbstractC10345a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderINotificationView {
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

        private static class Proxy implements BinderINotificationView {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.notification.BinderINotificationView";
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

            @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
            public void closeNotification(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.notification.BinderINotificationView");
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

            @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
            public void showNotification(String str, List<String> list, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.notification.BinderINotificationView");
                    obtain.writeString(str);
                    obtain.writeList(list);
                    obtain.writeString(str2);
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
            attachInterface(this, "com.bytedance.ee.bear.notification.BinderINotificationView");
        }

        public static BinderINotificationView asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.notification.BinderINotificationView");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderINotificationView)) {
                return new Proxy(iBinder);
            }
            return (BinderINotificationView) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.notification.BinderINotificationView");
                showNotification(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.notification.BinderINotificationView");
                closeNotification(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.notification.BinderINotificationView");
                return true;
            }
        }
    }
}
