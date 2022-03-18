package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderIDownloadCallback extends IInterface, AbstractC7184l.AbstractC7185a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderIDownloadCallback {
        public IBinder asBinder() {
            return this;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void destroy() {
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void init(Application application) {
        }

        public boolean isNewRemoteService() {
            return false;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void lazyInit(Application application) {
        }

        private static class Proxy implements BinderIDownloadCallback {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.drive.services.BinderIDownloadCallback";
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void init(Application application) {
            }

            public boolean isNewRemoteService() {
                return false;
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void lazyInit(Application application) {
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
            public boolean onFailed(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
            public boolean updateProgress(String str, int i, long j, long j2, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str2);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
        }

        public static BinderIDownloadCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderIDownloadCallback)) {
                return new Proxy(iBinder);
            }
            return (BinderIDownloadCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
                boolean updateProgress = updateProgress(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(updateProgress ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
                boolean onFailed = onFailed(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(onFailed ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.drive.services.BinderIDownloadCallback");
                return true;
            }
        }
    }
}
