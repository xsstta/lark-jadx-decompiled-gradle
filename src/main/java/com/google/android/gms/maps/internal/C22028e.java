package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C21700b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.internal.e */
public class C22028e {

    /* renamed from: a */
    private static final String f53535a = "e";

    /* renamed from: b */
    private static Context f53536b;

    /* renamed from: c */
    private static zze f53537c;

    /* renamed from: a */
    public static zze m79517a(Context context) throws GooglePlayServicesNotAvailableException {
        zze zze;
        Preconditions.checkNotNull(context);
        zze zze2 = f53537c;
        if (zze2 != null) {
            return zze2;
        }
        int a = C21700b.m78850a(context, 13400000);
        if (a == 0) {
            Log.i(f53535a, "Making Creator dynamically");
            IBinder iBinder = (IBinder) m79519a(m79520b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                if (queryLocalInterface instanceof zze) {
                    zze = (zze) queryLocalInterface;
                } else {
                    zze = new zzf(iBinder);
                }
            }
            f53537c = zze;
            try {
                zze.zza(ObjectWrapper.wrap(m79520b(context).getResources()), C21700b.f52917a);
                return f53537c;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(a);
        }
    }

    /* renamed from: b */
    private static Context m79520b(Context context) {
        Context context2 = f53536b;
        if (context2 != null) {
            return context2;
        }
        Context c = m79521c(context);
        f53536b = c;
        return c;
    }

    /* renamed from: c */
    private static Context m79521c(Context context) {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
        } catch (Exception e) {
            Log.e(f53535a, "Failed to load maps module, use legacy", e);
            return C21700b.m78852b(context);
        }
    }

    /* renamed from: a */
    private static <T> T m79519a(ClassLoader classLoader, String str) {
        try {
            return (T) m79518a(((ClassLoader) Preconditions.checkNotNull(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "));
        }
    }

    /* renamed from: a */
    private static <T> T m79518a(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (InstantiationException unused) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf2) : new String("Unable to call the default constructor of "));
        }
    }
}
