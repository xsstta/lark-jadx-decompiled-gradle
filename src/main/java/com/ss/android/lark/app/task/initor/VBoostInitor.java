package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ak;

public class VBoostInitor {
    /* renamed from: a */
    public static void m106669a(Context context) {
        try {
            if (context instanceof Activity) {
                context = context.getApplicationContext();
            }
            if (context instanceof Application) {
                ak.m224266a(true);
                Log.m165389i("VBoostInitor", "feature key for vboost is true");
                ak.m224265a((Application) context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            Log.m165383e("VBoostInitor", "VBoost init failed");
        }
    }
}
