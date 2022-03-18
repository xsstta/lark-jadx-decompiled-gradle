package com.bytedance.ee.bear.drive.biz.docplugin;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.b */
public abstract class AbstractBinderC6405b extends Binder {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25700a(C6406a aVar);

    /* renamed from: com.bytedance.ee.bear.drive.biz.docplugin.b$a */
    public static final class C6406a {

        /* renamed from: a */
        public int f17711a;

        public C6406a() {
        }

        /* renamed from: a */
        public int mo25713a() {
            return this.f17711a;
        }

        public String toString() {
            return "Result {code=" + this.f17711a + "}";
        }

        public C6406a(int i) {
            this.f17711a = i;
        }
    }

    /* renamed from: b */
    public void mo25711b(C6406a aVar) {
        C13479a.m54775e("drive_in_doc_attachment_ICallback", "ICallbackProxy.sendResult: result " + aVar.toString());
        if (isBinderAlive()) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.os.IBinder");
            obtain.writeInt(aVar.mo25713a());
            try {
                C13479a.m54775e("drive_in_doc_attachment_ICallback", "ICallbackProxy.sendResult: send success ");
                transact(2, obtain, obtain2, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
                C13479a.m54759a("drive_in_doc_attachment_ICallback", "sendResult: ", e);
            }
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            try {
                parcel.enforceInterface("android.os.IBinder");
                C6406a aVar = new C6406a();
                aVar.f17711a = parcel.readInt();
                mo25700a(aVar);
                parcel2.writeNoException();
                return true;
            } catch (Exception e) {
                C13479a.m54773d("drive_in_doc_attachment_ICallback", "Callback ERROR!", e);
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
