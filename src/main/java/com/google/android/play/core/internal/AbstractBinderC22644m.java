package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.m */
public abstract class AbstractBinderC22644m extends BinderC22641j implements AbstractC22645n {
    /* renamed from: a */
    public static AbstractC22645n m82422a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof AbstractC22645n ? (AbstractC22645n) queryLocalInterface : new C22643l(iBinder);
    }
}
