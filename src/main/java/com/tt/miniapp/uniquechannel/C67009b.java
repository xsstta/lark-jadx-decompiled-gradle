package com.tt.miniapp.uniquechannel;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.uniquechannel.b */
public class C67009b extends MatrixCursor {

    /* renamed from: a */
    private static Map<String, C67009b> f168964a;

    /* renamed from: b */
    private static final String[] f168965b = {"tt"};

    /* renamed from: c */
    private final Bundle f168966c;

    public Bundle getExtras() {
        return this.f168966c;
    }

    /* renamed from: a */
    public static IBinder m261148a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        Bundle extras = cursor.getExtras();
        extras.setClassLoader(BinderWrapper.class.getClassLoader());
        BinderWrapper binderWrapper = (BinderWrapper) extras.getParcelable("BinderWrapper");
        if (binderWrapper != null) {
            return binderWrapper.mo233052a();
        }
        return null;
    }

    /* renamed from: a */
    public static C67009b m261149a(IBinder iBinder) {
        try {
            if (f168964a == null) {
                f168964a = new ConcurrentHashMap();
            }
            C67009b bVar = f168964a.get(iBinder.getInterfaceDescriptor());
            if (bVar != null) {
                return bVar;
            }
            C67009b bVar2 = new C67009b(f168965b, iBinder);
            f168964a.put(iBinder.getInterfaceDescriptor(), bVar2);
            return bVar2;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public C67009b(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.f168966c = bundle;
        bundle.putParcelable("BinderWrapper", new BinderWrapper(iBinder));
    }
}
