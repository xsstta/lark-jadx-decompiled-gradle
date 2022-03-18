package com.ss.android.vcxp.binder;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vcxp.binder.a */
public class C63800a extends MatrixCursor {

    /* renamed from: a */
    public static final String[] f161002a = {"binder"};

    /* renamed from: b */
    private static final Map<String, C63800a> f161003b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Bundle f161004c;

    public Bundle getExtras() {
        return this.f161004c;
    }

    /* renamed from: a */
    public static C63800a m250497a(IBinder iBinder) {
        try {
            C63800a aVar = new C63800a(f161002a, iBinder);
            f161003b.put(iBinder.getInterfaceDescriptor(), aVar);
            return aVar;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public C63800a(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.f161004c = bundle;
        bundle.putParcelable("BinderParcel", new BinderParcel(iBinder));
    }
}
