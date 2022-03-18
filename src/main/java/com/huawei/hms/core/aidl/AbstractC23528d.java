package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.huawei.hms.core.aidl.d */
public interface AbstractC23528d extends IInterface {

    /* renamed from: com.huawei.hms.core.aidl.d$a */
    public static abstract class AbstractBinderC23529a extends Binder implements AbstractC23528d {

        /* access modifiers changed from: private */
        /* renamed from: com.huawei.hms.core.aidl.d$a$a */
        public static class C23530a implements AbstractC23528d {

            /* renamed from: b */
            public static AbstractC23528d f57984b;

            /* renamed from: a */
            private IBinder f57985a;

            public IBinder asBinder() {
                return this.f57985a;
            }

            C23530a(IBinder iBinder) {
                this.f57985a = iBinder;
            }

            @Override // com.huawei.hms.core.aidl.AbstractC23528d
            /* renamed from: a */
            public void mo82638a(C23523b bVar, AbstractC23525c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f57985a.transact(2, obtain, null, 1) || AbstractBinderC23529a.m85295a() == null) {
                        obtain.recycle();
                    } else {
                        AbstractBinderC23529a.m85295a().mo82638a(bVar, cVar);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC23528d m85295a() {
            return C23530a.f57984b;
        }

        /* renamed from: a */
        public static AbstractC23528d m85296a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC23528d)) {
                return new C23530a(iBinder);
            }
            return (AbstractC23528d) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo82638a(C23523b bVar, AbstractC23525c cVar) throws RemoteException;
}
