package com.ss.android.lark.multitask_impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.multitask.task.ScreenshotCapturedCallback;

public interface MultitaskScreenCaptureInterface extends IInterface {

    public static class Default implements MultitaskScreenCaptureInterface {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface
        public void captureScreenshot(String str, ScreenshotCapturedCallback screenshotCapturedCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements MultitaskScreenCaptureInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements MultitaskScreenCaptureInterface {
            public static MultitaskScreenCaptureInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface
            public void captureScreenshot(String str, ScreenshotCapturedCallback screenshotCapturedCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface");
                    obtain.writeString(str);
                    if (screenshotCapturedCallback != null) {
                        iBinder = screenshotCapturedCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().captureScreenshot(str, screenshotCapturedCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static MultitaskScreenCaptureInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface");
        }

        public static boolean setDefaultImpl(MultitaskScreenCaptureInterface multitaskScreenCaptureInterface) {
            if (Proxy.sDefaultImpl != null || multitaskScreenCaptureInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = multitaskScreenCaptureInterface;
            return true;
        }

        public static MultitaskScreenCaptureInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MultitaskScreenCaptureInterface)) {
                return new Proxy(iBinder);
            }
            return (MultitaskScreenCaptureInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface");
                captureScreenshot(parcel.readString(), ScreenshotCapturedCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface");
                return true;
            }
        }
    }

    void captureScreenshot(String str, ScreenshotCapturedCallback screenshotCapturedCallback) throws RemoteException;
}
