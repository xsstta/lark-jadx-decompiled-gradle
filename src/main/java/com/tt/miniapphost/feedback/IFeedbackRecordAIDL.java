package com.tt.miniapphost.feedback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;

public interface IFeedbackRecordAIDL extends IInterface {

    public static abstract class Stub extends Binder implements IFeedbackRecordAIDL {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IFeedbackRecordAIDL {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapphost.feedback.IFeedbackRecordAIDL";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapphost.feedback.IFeedbackRecordAIDL
            public void start(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
                    if (iFeedbackRecordCallback != null) {
                        iBinder = iFeedbackRecordCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tt.miniapphost.feedback.IFeedbackRecordAIDL
            public void stop(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
                    if (iFeedbackRecordCallback != null) {
                        iBinder = iFeedbackRecordCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
        }

        public static IFeedbackRecordAIDL asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFeedbackRecordAIDL)) {
                return new Proxy(iBinder);
            }
            return (IFeedbackRecordAIDL) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
                start(IFeedbackRecordCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
                stop(IFeedbackRecordCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapphost.feedback.IFeedbackRecordAIDL");
                return true;
            }
        }
    }

    void start(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException;

    void stop(IFeedbackRecordCallback iFeedbackRecordCallback) throws RemoteException;
}
