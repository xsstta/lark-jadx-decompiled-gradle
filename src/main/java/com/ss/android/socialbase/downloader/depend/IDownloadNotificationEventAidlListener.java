package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IDownloadNotificationEventAidlListener extends IInterface {

    public static class Default implements IDownloadNotificationEventAidlListener {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public String getNotifyProcessName() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadNotificationEventAidlListener {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadNotificationEventAidlListener {
            public static IDownloadNotificationEventAidlListener sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public String getNotifyProcessName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotifyProcessName();
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    boolean z2 = true;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().interceptAfterNotificationSuccess(z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(i);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onNotificationEvent(i, downloadInfo, str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IDownloadNotificationEventAidlListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        }

        public static boolean setDefaultImpl(IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) {
            if (Proxy.sDefaultImpl != null || iDownloadNotificationEventAidlListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadNotificationEventAidlListener;
            return true;
        }

        public static IDownloadNotificationEventAidlListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadNotificationEventAidlListener)) {
                return new Proxy(iBinder);
            }
            return (IDownloadNotificationEventAidlListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DownloadInfo downloadInfo;
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                onNotificationEvent(readInt, downloadInfo, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean interceptAfterNotificationSuccess = interceptAfterNotificationSuccess(z);
                parcel2.writeNoException();
                parcel2.writeInt(interceptAfterNotificationSuccess ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                String notifyProcessName = getNotifyProcessName();
                parcel2.writeNoException();
                parcel2.writeString(notifyProcessName);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                return true;
            }
        }
    }

    String getNotifyProcessName() throws RemoteException;

    boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException;

    void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException;
}
