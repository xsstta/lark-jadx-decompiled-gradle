package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface INotificationSideChannel extends IInterface {

    public static class Default implements INotificationSideChannel {
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements INotificationSideChannel {
            public static INotificationSideChannel sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "android.support.v4.app.INotificationSideChannel";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancelAll(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancel(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().notify(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static INotificationSideChannel getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        public static boolean setDefaultImpl(INotificationSideChannel iNotificationSideChannel) {
            if (Proxy.sDefaultImpl != null || iNotificationSideChannel == null) {
                return false;
            }
            Proxy.sDefaultImpl = iNotificationSideChannel;
            return true;
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new Proxy(iBinder);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Notification notification;
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                } else {
                    notification = null;
                }
                notify(readString, readInt, readString2, notification);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                cancelAll(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;
}
