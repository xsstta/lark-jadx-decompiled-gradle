package com.tt.miniapphost.feedback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IFeedbackRecordCallback extends IInterface {

    public static abstract class Stub extends Binder implements IFeedbackRecordCallback {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IFeedbackRecordCallback {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapphost.feedback.IFeedbackRecordCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
            public void onFail(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tt.miniapphost.feedback.IFeedbackRecordCallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapphost.feedback.IFeedbackRecordCallback");
        }

        public static IFeedbackRecordCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFeedbackRecordCallback)) {
                return new Proxy(iBinder);
            }
            return (IFeedbackRecordCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
                onFail(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapphost.feedback.IFeedbackRecordCallback");
                return true;
            }
        }
    }

    void onFail(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;
}
