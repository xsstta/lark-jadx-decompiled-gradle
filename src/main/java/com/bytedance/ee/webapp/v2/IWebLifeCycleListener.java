package com.bytedance.ee.webapp.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IWebLifeCycleListener extends IInterface {

    public static class Default implements IWebLifeCycleListener {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onCreateView() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onFirstDataLoaded() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onFirstFrameDraw() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onFirstFrameShow() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onPageFinished(String str) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onPageStarted(String str) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onProgressChanged(int i) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onReceivedError(int i, String str) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void onResume() throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
        public void waitInit() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWebLifeCycleListener {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IWebLifeCycleListener {
            public static IWebLifeCycleListener sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.webapp.v2.IWebLifeCycleListener";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onCreateView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onCreateView();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onFirstDataLoaded() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFirstDataLoaded();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onFirstFrameDraw() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFirstFrameDraw();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onFirstFrameShow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFirstFrameShow();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onResume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onResume();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void waitInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().waitInit();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onPageStarted(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    obtain.writeString(str);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onPageStarted(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onPageFinished(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    obtain.writeString(str);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onPageFinished(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onProgressChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onProgressChanged(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener
            public void onReceivedError(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onReceivedError(i, str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IWebLifeCycleListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
        }

        public static boolean setDefaultImpl(IWebLifeCycleListener iWebLifeCycleListener) {
            if (Proxy.sDefaultImpl != null || iWebLifeCycleListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWebLifeCycleListener;
            return true;
        }

        public static IWebLifeCycleListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebLifeCycleListener)) {
                return new Proxy(iBinder);
            }
            return (IWebLifeCycleListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onCreateView();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onResume();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onFirstDataLoaded();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onFirstFrameDraw();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onFirstFrameShow();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        waitInit();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onPageStarted(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onPageFinished(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onProgressChanged(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                        onReceivedError(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.webapp.v2.IWebLifeCycleListener");
                return true;
            }
        }
    }

    void onCreateView() throws RemoteException;

    void onFirstDataLoaded() throws RemoteException;

    void onFirstFrameDraw() throws RemoteException;

    void onFirstFrameShow() throws RemoteException;

    void onPageFinished(String str) throws RemoteException;

    void onPageStarted(String str) throws RemoteException;

    void onProgressChanged(int i) throws RemoteException;

    void onReceivedError(int i, String str) throws RemoteException;

    void onResume() throws RemoteException;

    void waitInit() throws RemoteException;
}
