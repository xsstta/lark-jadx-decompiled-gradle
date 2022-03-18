package com.bytedance.ee.webapp.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.webapp.v2.IWebTabCallbackInterface;

public interface IWebAppBinderCallbackInterface extends IInterface {

    public static class Default implements IWebAppBinderCallbackInterface {
        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public boolean canGoBack() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public boolean canGoForward() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void fireEvent(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public String getBotId() throws RemoteException {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void goBack() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void goForward() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public boolean hasInit() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
        public void setTabTitleBarHeight(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWebAppBinderCallbackInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IWebAppBinderCallbackInterface {
            public static IWebAppBinderCallbackInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void goBack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().goBack();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void goForward() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().goForward();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public boolean canGoBack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    boolean z = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().canGoBack();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public boolean canGoForward() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    boolean z = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().canGoForward();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public String getBotId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBotId();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public boolean hasInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    boolean z = false;
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hasInit();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void setTabTitleBarHeight(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setTabTitleBarHeight(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    obtain.writeString(str);
                    if (iWebTabCallbackInterface != null) {
                        iBinder = iWebTabCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addCommonApp(str, iWebTabCallbackInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void fireEvent(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().fireEvent(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    obtain.writeString(str);
                    if (iWebTabCallbackInterface != null) {
                        iBinder = iWebTabCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().removeCommonApp(str, iWebTabCallbackInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
            public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                    obtain.writeString(str);
                    if (iWebTabCallbackInterface != null) {
                        iBinder = iWebTabCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().requestCommonApp(str, iWebTabCallbackInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IWebAppBinderCallbackInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
        }

        public static IWebAppBinderCallbackInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebAppBinderCallbackInterface)) {
                return new Proxy(iBinder);
            }
            return (IWebAppBinderCallbackInterface) queryLocalInterface;
        }

        public static boolean setDefaultImpl(IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iWebAppBinderCallbackInterface == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iWebAppBinderCallbackInterface;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        boolean canGoBack = canGoBack();
                        parcel2.writeNoException();
                        parcel2.writeInt(canGoBack ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        boolean canGoForward = canGoForward();
                        parcel2.writeNoException();
                        parcel2.writeInt(canGoForward ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        goBack();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        goForward();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        boolean hasInit = hasInit();
                        parcel2.writeNoException();
                        parcel2.writeInt(hasInit ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        setTabTitleBarHeight(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        String botId = getBotId();
                        parcel2.writeNoException();
                        parcel2.writeString(botId);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        requestCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        addCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        removeCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                        fireEvent(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface");
                return true;
            }
        }
    }

    void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    boolean canGoBack() throws RemoteException;

    boolean canGoForward() throws RemoteException;

    void fireEvent(String str, String str2) throws RemoteException;

    String getBotId() throws RemoteException;

    void goBack() throws RemoteException;

    void goForward() throws RemoteException;

    boolean hasInit() throws RemoteException;

    void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    void setTabTitleBarHeight(int i) throws RemoteException;
}
