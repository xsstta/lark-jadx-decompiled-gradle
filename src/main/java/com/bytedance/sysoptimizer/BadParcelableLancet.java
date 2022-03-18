package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Bundle;
import me.ele.lancet.base.Origin;

public class BadParcelableLancet {
    public Bundle getBundleExtra(String str) {
        Bundle bundle = (Bundle) Origin.call();
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundle == null || context == null)) {
            bundle.setClassLoader(context.getClassLoader());
        }
        return bundle;
    }
}
