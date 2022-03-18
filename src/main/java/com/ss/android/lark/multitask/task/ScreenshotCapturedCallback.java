package com.ss.android.lark.multitask.task;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public interface ScreenshotCapturedCallback extends IInterface {

    public static class Default implements ScreenshotCapturedCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.multitask.task.ScreenshotCapturedCallback
        public void onScreenshotCaptured(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ScreenshotCapturedCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements ScreenshotCapturedCallback {
            public static ScreenshotCapturedCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask.task.ScreenshotCapturedCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.multitask.task.ScreenshotCapturedCallback
            public void onScreenshotCaptured(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.ScreenshotCapturedCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onScreenshotCaptured(i, i2, parcelFileDescriptor);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ScreenshotCapturedCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask.task.ScreenshotCapturedCallback");
        }

        public static boolean setDefaultImpl(ScreenshotCapturedCallback screenshotCapturedCallback) {
            if (Proxy.sDefaultImpl != null || screenshotCapturedCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = screenshotCapturedCallback;
            return true;
        }

        public static ScreenshotCapturedCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask.task.ScreenshotCapturedCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ScreenshotCapturedCallback)) {
                return new Proxy(iBinder);
            }
            return (ScreenshotCapturedCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ParcelFileDescriptor parcelFileDescriptor;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.multitask.task.ScreenshotCapturedCallback");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else {
                    parcelFileDescriptor = null;
                }
                onScreenshotCaptured(readInt, readInt2, parcelFileDescriptor);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.multitask.task.ScreenshotCapturedCallback");
                return true;
            }
        }
    }

    void onScreenshotCaptured(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;
}
