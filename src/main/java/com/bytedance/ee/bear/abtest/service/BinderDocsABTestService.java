package com.bytedance.ee.bear.abtest.service;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public interface BinderDocsABTestService extends IInterface, AbstractC4156b, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDocsABTestService {
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

        private static class Proxy implements BinderDocsABTestService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.abtest.service.BinderDocsABTestService";
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

            @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
            public String getABTestStringValue(String str, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
            public Boolean getABTestBooleanValue(String str, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                    obtain.writeString(str);
                    boolean z2 = true;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
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

            @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
            public Integer getABTestIntValue(String str, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    Integer valueOf = Integer.valueOf(obtain2.readInt());
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
            attachInterface(this, "com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
        }

        public static BinderDocsABTestService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDocsABTestService)) {
                return new Proxy(iBinder);
            }
            return (BinderDocsABTestService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                Integer aBTestIntValue = getABTestIntValue(readString, z);
                parcel2.writeNoException();
                parcel2.writeInt(aBTestIntValue.intValue());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                String aBTestStringValue = getABTestStringValue(readString2, z);
                parcel2.writeNoException();
                parcel2.writeString(aBTestStringValue);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                Boolean aBTestBooleanValue = getABTestBooleanValue(readString3, z);
                parcel2.writeNoException();
                parcel2.writeInt(aBTestBooleanValue.booleanValue() ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.abtest.service.BinderDocsABTestService");
                return true;
            }
        }
    }
}
