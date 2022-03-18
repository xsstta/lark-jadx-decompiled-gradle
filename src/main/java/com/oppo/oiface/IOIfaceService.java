package com.oppo.oiface;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public interface IOIfaceService extends IInterface {

    public static abstract class Stub extends Binder implements IOIfaceService {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IOIfaceService {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.oppo.oiface.IOIfaceService";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oppo.oiface.IOIfaceService
            public int getMemoryUsage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.mRemote.transact(SmEvents.EVENT_NR, obtain, obtain2, 0);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public String getOifaceVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.mRemote.transact(LocationRequest.PRIORITY_NO_POWER, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public int getSystemMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.mRemote.transact(108, obtain, obtain2, 0);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public void onAppRegister() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.mRemote.transact(104, obtain, obtain2, 1);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oppo.oiface.IOIfaceService
            public void applyHardwareResource(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.mRemote.transact(103, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public void updateGameEngineInfo(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.mRemote.transact(155, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public void updateGameInfo(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.mRemote.transact(102, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public void generalSingal(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.mRemote.transact(SmEvents.EVENT_NO, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.oppo.oiface.IOIfaceService
            public int getSystemTemp(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeInt(i);
                    this.mRemote.transact(ActivityIdentificationData.WALKING, obtain, obtain2, 0);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX INFO: finally extract failed */
            @Override // com.oppo.oiface.IOIfaceService
            public boolean registerClient(String str, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.mRemote.transact(101, obtain, obtain2, 0);
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    if (readInt == 1) {
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.oppo.oiface.IOIfaceService");
        }

        public static IOIfaceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.oppo.oiface.IOIfaceService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOIfaceService)) {
                return new Proxy(iBinder);
            }
            return (IOIfaceService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    void applyHardwareResource(String str) throws RemoteException;

    void generalSingal(String str) throws RemoteException;

    int getMemoryUsage() throws RemoteException;

    String getOifaceVersion() throws RemoteException;

    int getSystemMode() throws RemoteException;

    int getSystemTemp(int i) throws RemoteException;

    void onAppRegister() throws RemoteException;

    boolean registerClient(String str, IBinder iBinder) throws RemoteException;

    void updateGameEngineInfo(String str) throws RemoteException;

    void updateGameInfo(String str) throws RemoteException;
}
