package com.bytedance.ee.bear.contract.darkmode;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.darkmode.BinderIDarkModeChangedListener;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderDarkModeService extends IInterface, AbstractC5128c, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDarkModeService {
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

        private static class Proxy implements BinderDarkModeService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService";
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

            @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
            public void addDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                    if (binderIDarkModeChangedListener != null) {
                        iBinder = binderIDarkModeChangedListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
            public void notifyDarkModeChangedListeners(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
            public void removeDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                    if (binderIDarkModeChangedListener != null) {
                        iBinder = binderIDarkModeChangedListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
        }

        public static BinderDarkModeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDarkModeService)) {
                return new Proxy(iBinder);
            }
            return (BinderDarkModeService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                addDarkModeListener(BinderIDarkModeChangedListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                removeDarkModeListener(BinderIDarkModeChangedListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                notifyDarkModeChangedListeners(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService");
                return true;
            }
        }
    }
}
