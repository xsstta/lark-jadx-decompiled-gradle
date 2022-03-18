package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.huawei.hms.core.aidl.c */
public interface AbstractC23525c extends IInterface {

    /* renamed from: com.huawei.hms.core.aidl.c$a */
    public static abstract class AbstractBinderC23526a extends Binder implements AbstractC23525c {
        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.huawei.hms.core.aidl.c$a$a */
        private static class C23527a implements AbstractC23525c {

            /* renamed from: b */
            public static AbstractC23525c f57982b;

            /* renamed from: a */
            private IBinder f57983a;

            public IBinder asBinder() {
                return this.f57983a;
            }

            C23527a(IBinder iBinder) {
                this.f57983a = iBinder;
            }
        }

        public static AbstractC23525c getDefaultImpl() {
            return C23527a.f57982b;
        }

        public AbstractBinderC23526a() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static boolean setDefaultImpl(AbstractC23525c cVar) {
            if (C23527a.f57982b != null || cVar == null) {
                return false;
            }
            C23527a.f57982b = cVar;
            return true;
        }

        public static AbstractC23525c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC23525c)) {
                return new C23527a(iBinder);
            }
            return (AbstractC23525c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C23523b bVar;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
                if (parcel.readInt() != 0) {
                    bVar = C23523b.CREATOR.createFromParcel(parcel);
                } else {
                    bVar = null;
                }
                call(bVar);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
                return true;
            }
        }
    }

    void call(C23523b bVar) throws RemoteException;
}
