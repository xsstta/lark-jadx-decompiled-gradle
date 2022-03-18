package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.y */
public final class C2042y {

    /* renamed from: com.appsflyer.internal.y$a */
    static final class C2043a implements IInterface {

        /* renamed from: ɩ */
        private IBinder f7005;

        public final IBinder asBinder() {
            return this.f7005;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı */
        public final boolean mo10102() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f7005.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: Ι */
        public final String mo10103() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7005.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        C2043a(IBinder iBinder) {
            this.f7005 = iBinder;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.y$d */
    public static final class C2045d {

        /* renamed from: ǃ */
        private final boolean f7008;

        /* renamed from: ι */
        final String f7009;

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ */
        public final boolean mo10106() {
            return this.f7008;
        }

        C2045d(String str, boolean z) {
            this.f7009 = str;
            this.f7008 = z;
        }
    }

    C2042y() {
    }

    /* renamed from: com.appsflyer.internal.y$b */
    static final class ServiceConnectionC2044b implements ServiceConnection {

        /* renamed from: ɩ */
        final LinkedBlockingQueue<IBinder> f7006;

        /* renamed from: ι */
        boolean f7007;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC2044b() {
            this.f7006 = new LinkedBlockingQueue<>(1);
            this.f7007 = false;
        }

        /* synthetic */ ServiceConnectionC2044b(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f7006.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: Ι */
    static C2045d m8940(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC2044b bVar = new ServiceConnectionC2044b((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!context.bindService(intent, bVar, 1)) {
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        throw new IOException("Google Play connection failed");
                    } else if (!bVar.f7007) {
                        bVar.f7007 = true;
                        C2043a aVar = new C2043a(bVar.f7006.take());
                        C2045d dVar = new C2045d(aVar.mo10103(), aVar.mo10102());
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        return dVar;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
