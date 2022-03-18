package com.bytedance.ee.bear.middleground.drive.export;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderIUploadStateMonitor extends IInterface, AbstractC9363c.AbstractC9364a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderIUploadStateMonitor {
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

        private static class Proxy implements BinderIUploadStateMonitor {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor";
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

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onExistUploadingFile() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onUploadFinished() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onUploadError(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onFileCountChange(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onFileProgressChange(int i, ProgressingEntity progressingEntity) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    obtain.writeInt(i);
                    if (progressingEntity != null) {
                        obtain.writeInt(1);
                        progressingEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onUploadErrorCode(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
            public void onUploadFileSuccess(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
        }

        public static BinderIUploadStateMonitor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderIUploadStateMonitor)) {
                return new Proxy(iBinder);
            }
            return (BinderIUploadStateMonitor) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ProgressingEntity progressingEntity;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onExistUploadingFile();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            progressingEntity = ProgressingEntity.CREATOR.createFromParcel(parcel);
                        } else {
                            progressingEntity = null;
                        }
                        onFileProgressChange(readInt, progressingEntity);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onFileCountChange(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onUploadFinished();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onUploadError(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onUploadErrorCode(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                        onUploadFileSuccess(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor");
                return true;
            }
        }
    }
}
