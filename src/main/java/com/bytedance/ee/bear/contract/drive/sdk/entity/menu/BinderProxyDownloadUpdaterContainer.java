package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderProxyDownloadUpdaterContainer extends IInterface, AbstractC5150g.AbstractC5153c, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderProxyDownloadUpdaterContainer {
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

        private static class Proxy implements BinderProxyDownloadUpdaterContainer {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer";
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

            /* JADX INFO: finally extract failed */
            @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5153c
            public BinderProxyDownloadUpdater getProxyDownloadUpdater() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    BinderProxyDownloadUpdater asInterface = BinderProxyDownloadUpdater.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5153c
            public void setProxyDownloadUpdater(BinderProxyDownloadUpdater binderProxyDownloadUpdater) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
                    if (binderProxyDownloadUpdater != null) {
                        iBinder = binderProxyDownloadUpdater.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
        }

        public static BinderProxyDownloadUpdaterContainer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderProxyDownloadUpdaterContainer)) {
                return new Proxy(iBinder);
            }
            return (BinderProxyDownloadUpdaterContainer) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
                setProxyDownloadUpdater(BinderProxyDownloadUpdater.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
                BinderProxyDownloadUpdater proxyDownloadUpdater = getProxyDownloadUpdater();
                parcel2.writeNoException();
                if (proxyDownloadUpdater != null) {
                    iBinder = proxyDownloadUpdater.asBinder();
                } else {
                    iBinder = null;
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdaterContainer");
                return true;
            }
        }
    }
}
