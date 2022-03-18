package com.bytedance.ee.webapp.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface;
import com.bytedance.ee.webapp.v2.IWebLifeCycleListener;
import com.bytedance.ee.webapp.v2.IWebTabCallbackInterface;
import com.huawei.hms.android.HwBuildEx;

public interface IWebAppBinderInterface extends IInterface {

    public static class Default implements IWebAppBinderInterface {
        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public boolean canGoBack() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public boolean canGoForward() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void fireEvent(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public String getBotId() throws RemoteException {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public int getTabTitleBarHeight() throws RemoteException {
            return 0;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void goBack() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void goForward() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public boolean hasInit() throws RemoteException {
            return false;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void setCallback(IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void setTabTitleBarHeight(int i) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
        public void setWebLifecycleListener(IWebLifeCycleListener iWebLifeCycleListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWebAppBinderInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IWebAppBinderInterface {
            public static IWebAppBinderInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.webapp.v2.IWebAppBinderInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void goBack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void goForward() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public boolean canGoBack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public boolean canGoForward() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public String getBotId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public int getTabTitleBarHeight() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTabTitleBarHeight();
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public boolean hasInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void setTabTitleBarHeight(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void setCallback(IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    if (iWebAppBinderCallbackInterface != null) {
                        iBinder = iWebAppBinderCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setCallback(iWebAppBinderCallbackInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void setWebLifecycleListener(IWebLifeCycleListener iWebLifeCycleListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    if (iWebLifeCycleListener != null) {
                        iBinder = iWebLifeCycleListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setWebLifecycleListener(iWebLifeCycleListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    obtain.writeString(str);
                    if (iWebTabCallbackInterface != null) {
                        iBinder = iWebTabCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void fireEvent(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                    obtain.writeString(str);
                    if (iWebTabCallbackInterface != null) {
                        iBinder = iWebTabCallbackInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
            public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
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
                    Stub.getDefaultImpl().requestCommonApp(str, iWebTabCallbackInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IWebAppBinderInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
        }

        public static IWebAppBinderInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebAppBinderInterface)) {
                return new Proxy(iBinder);
            }
            return (IWebAppBinderInterface) queryLocalInterface;
        }

        public static boolean setDefaultImpl(IWebAppBinderInterface iWebAppBinderInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iWebAppBinderInterface == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iWebAppBinderInterface;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        boolean canGoBack = canGoBack();
                        parcel2.writeNoException();
                        parcel2.writeInt(canGoBack ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        boolean canGoForward = canGoForward();
                        parcel2.writeNoException();
                        parcel2.writeInt(canGoForward ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        goBack();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        goForward();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        boolean hasInit = hasInit();
                        parcel2.writeNoException();
                        parcel2.writeInt(hasInit ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        setCallback(IWebAppBinderCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        setTabTitleBarHeight(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        int tabTitleBarHeight = getTabTitleBarHeight();
                        parcel2.writeNoException();
                        parcel2.writeInt(tabTitleBarHeight);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        String botId = getBotId();
                        parcel2.writeNoException();
                        parcel2.writeString(botId);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        requestCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        addCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        removeCommonApp(parcel.readString(), IWebTabCallbackInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        setWebLifecycleListener(IWebLifeCycleListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                        fireEvent(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.webapp.v2.IWebAppBinderInterface");
                return true;
            }
        }
    }

    void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    boolean canGoBack() throws RemoteException;

    boolean canGoForward() throws RemoteException;

    void fireEvent(String str, String str2) throws RemoteException;

    String getBotId() throws RemoteException;

    int getTabTitleBarHeight() throws RemoteException;

    void goBack() throws RemoteException;

    void goForward() throws RemoteException;

    boolean hasInit() throws RemoteException;

    void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException;

    void setCallback(IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface) throws RemoteException;

    void setTabTitleBarHeight(int i) throws RemoteException;

    void setWebLifecycleListener(IWebLifeCycleListener iWebLifeCycleListener) throws RemoteException;
}
