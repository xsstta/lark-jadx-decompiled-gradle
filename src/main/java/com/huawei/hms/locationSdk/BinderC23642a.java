package com.huawei.hms.locationSdk;

import android.os.Binder;
import android.os.Bundle;

/* renamed from: com.huawei.hms.locationSdk.a */
public class BinderC23642a extends Binder {

    /* renamed from: a */
    private static BinderC23642a f58389a;

    /* renamed from: a */
    public static Bundle m86006a() {
        if (f58389a == null) {
            f58389a = new BinderC23642a();
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("InnerBinder", f58389a);
        return bundle;
    }
}
