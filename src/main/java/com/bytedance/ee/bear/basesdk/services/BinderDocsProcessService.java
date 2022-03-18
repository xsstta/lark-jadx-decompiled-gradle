package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.ss.android.lark.watermark.dto.WatermarkInfo;

public interface BinderDocsProcessService extends IInterface, AbstractC4501b, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDocsProcessService {
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

        private static class Proxy implements BinderDocsProcessService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService";
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

            @Override // com.bytedance.ee.bear.basesdk.services.AbstractC4501b
            public void updateWatermarkInfo(WatermarkInfo watermarkInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService");
                    if (watermarkInfo != null) {
                        obtain.writeInt(1);
                        watermarkInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService");
        }

        public static BinderDocsProcessService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDocsProcessService)) {
                return new Proxy(iBinder);
            }
            return (BinderDocsProcessService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            WatermarkInfo watermarkInfo;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService");
                if (parcel.readInt() != 0) {
                    watermarkInfo = WatermarkInfo.CREATOR.createFromParcel(parcel);
                } else {
                    watermarkInfo = null;
                }
                updateWatermarkInfo(watermarkInfo);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService");
                return true;
            }
        }
    }
}
