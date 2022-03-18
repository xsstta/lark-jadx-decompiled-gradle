package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import java.util.ArrayList;
import java.util.List;

public interface BinderWikiDataService extends IInterface, AbstractC10957d, AbstractC12448b {

    public static abstract class Stub extends Binder implements BinderWikiDataService {
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

        private static class Proxy implements BinderWikiDataService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService";
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

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
            public List<String> getCachedRelationSpaceIds() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readArrayList;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
            public Boolean isRelationCached(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    obtain2.recycle();
                    obtain.recycle();
                    return valueOf;
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
            attachInterface(this, "com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
        }

        public static BinderWikiDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderWikiDataService)) {
                return new Proxy(iBinder);
            }
            return (BinderWikiDataService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
                List<String> cachedRelationSpaceIds = getCachedRelationSpaceIds();
                parcel2.writeNoException();
                parcel2.writeList(cachedRelationSpaceIds);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
                Boolean isRelationCached = isRelationCached(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(isRelationCached.booleanValue() ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService");
                return true;
            }
        }
    }
}
