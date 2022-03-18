package com.bytedance.dr.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDidAidlInterface extends IInterface {

    public static abstract class Stub extends Binder implements IDidAidlInterface {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IDidAidlInterface {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.asus.msa.SupplementaryDID.IDidAidlInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.dr.aidl.IDidAidlInterface
            /* renamed from: a */
            public String mo15724a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDidAidlInterface
            /* renamed from: c */
            public String mo15725c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDidAidlInterface
            /* renamed from: d */
            public String mo15726d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDidAidlInterface
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDidAidlInterface
            public boolean support() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public Stub() {
            attachInterface(this, "com.asus.msa.SupplementaryDID.IDidAidlInterface");
        }

        public static IDidAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDidAidlInterface)) {
                return new Proxy(iBinder);
            }
            return (IDidAidlInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                boolean support = support();
                parcel2.writeNoException();
                parcel2.writeInt(support ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                String a = mo15724a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                String oaid = getOAID();
                parcel2.writeNoException();
                parcel2.writeString(oaid);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                String c = mo15725c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                String d = mo15726d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo15724a() throws RemoteException;

    /* renamed from: c */
    String mo15725c() throws RemoteException;

    /* renamed from: d */
    String mo15726d() throws RemoteException;

    String getOAID() throws RemoteException;

    boolean support() throws RemoteException;
}
