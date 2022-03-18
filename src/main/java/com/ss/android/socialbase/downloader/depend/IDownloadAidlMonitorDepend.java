package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDownloadAidlMonitorDepend extends IInterface {

    public static class Default implements IDownloadAidlMonitorDepend {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
        public int[] getAdditionalMonitorStatus() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
        public String getEventPage() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
        public void monitorLogSend(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadAidlMonitorDepend {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadAidlMonitorDepend {
            public static IDownloadAidlMonitorDepend sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
            public int[] getAdditionalMonitorStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAdditionalMonitorStatus();
                    }
                    obtain2.readException();
                    int[] createIntArray = obtain2.createIntArray();
                    obtain2.recycle();
                    obtain.recycle();
                    return createIntArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
            public String getEventPage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEventPage();
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

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
            public void monitorLogSend(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().monitorLogSend(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IDownloadAidlMonitorDepend getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        }

        public static boolean setDefaultImpl(IDownloadAidlMonitorDepend iDownloadAidlMonitorDepend) {
            if (Proxy.sDefaultImpl != null || iDownloadAidlMonitorDepend == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadAidlMonitorDepend;
            return true;
        }

        public static IDownloadAidlMonitorDepend asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadAidlMonitorDepend)) {
                return new Proxy(iBinder);
            }
            return (IDownloadAidlMonitorDepend) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                monitorLogSend(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                String eventPage = getEventPage();
                parcel2.writeNoException();
                parcel2.writeString(eventPage);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                int[] additionalMonitorStatus = getAdditionalMonitorStatus();
                parcel2.writeNoException();
                parcel2.writeIntArray(additionalMonitorStatus);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                return true;
            }
        }
    }

    int[] getAdditionalMonitorStatus() throws RemoteException;

    String getEventPage() throws RemoteException;

    void monitorLogSend(String str) throws RemoteException;
}
