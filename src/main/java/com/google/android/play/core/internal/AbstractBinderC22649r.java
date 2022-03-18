package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.r */
public abstract class AbstractBinderC22649r extends BinderC22641j implements AbstractC22650s {
    /* renamed from: a */
    public static AbstractC22650s m82438a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof AbstractC22650s ? (AbstractC22650s) queryLocalInterface : new C22648q(iBinder);
    }
}
