package com.bun.lib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface MsaIdInterface extends IInterface {

    public static abstract class Stub extends Binder implements MsaIdInterface {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements MsaIdInterface {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bun.lib.MsaIdInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bun.lib.MsaIdInterface
            /* renamed from: a */
            public String mo11264a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bun.lib.MsaIdInterface
            /* renamed from: c */
            public boolean mo11265c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bun.lib.MsaIdInterface
            /* renamed from: d */
            public String mo11266d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bun.lib.MsaIdInterface
            /* renamed from: e */
            public boolean mo11267e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bun.lib.MsaIdInterface
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bun.lib.MsaIdInterface
            public void shutDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public Stub() {
            attachInterface(this, "com.bun.lib.MsaIdInterface");
        }

        public static MsaIdInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MsaIdInterface)) {
                return new Proxy(iBinder);
            }
            return (MsaIdInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        String a = mo11264a();
                        parcel2.writeNoException();
                        parcel2.writeString(a);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        boolean c = mo11265c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        String oaid = getOAID();
                        parcel2.writeNoException();
                        parcel2.writeString(oaid);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        String d = mo11266d();
                        parcel2.writeNoException();
                        parcel2.writeString(d);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        boolean e = mo11267e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                        shutDown();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bun.lib.MsaIdInterface");
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo11264a() throws RemoteException;

    /* renamed from: c */
    boolean mo11265c() throws RemoteException;

    /* renamed from: d */
    String mo11266d() throws RemoteException;

    /* renamed from: e */
    boolean mo11267e() throws RemoteException;

    String getOAID() throws RemoteException;

    void shutDown() throws RemoteException;
}
