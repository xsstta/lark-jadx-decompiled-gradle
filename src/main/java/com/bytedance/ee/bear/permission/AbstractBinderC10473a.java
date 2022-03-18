package com.bytedance.ee.bear.permission;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.permission.a */
abstract class AbstractBinderC10473a extends Binder {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39792a(C10474a aVar);

    /* renamed from: com.bytedance.ee.bear.permission.a$a */
    static final class C10474a {

        /* renamed from: a */
        public int f28175a;

        /* renamed from: b */
        public String f28176b;

        public C10474a() {
        }

        /* renamed from: a */
        public int mo39794a() {
            return this.f28175a;
        }

        /* renamed from: b */
        public String mo39795b() {
            return this.f28176b;
        }

        public String toString() {
            return "Result {code=" + this.f28175a + ", id=" + this.f28176b + "}";
        }

        public C10474a(int i, String str) {
            this.f28175a = i;
            this.f28176b = str;
        }
    }

    AbstractBinderC10473a() {
    }

    /* access modifiers changed from: protected */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            try {
                parcel.enforceInterface("android.os.IBinder");
                C10474a aVar = new C10474a();
                aVar.f28175a = parcel.readInt();
                aVar.f28176b = parcel.readString();
                mo39792a(aVar);
                parcel2.writeNoException();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                C13479a.m54775e("PermissionCheck", "Callback ERROR!");
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
