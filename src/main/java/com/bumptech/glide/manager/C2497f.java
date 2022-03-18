package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.manager.AbstractC2492c;

/* renamed from: com.bumptech.glide.manager.f */
public class C2497f implements AbstractC2494d {
    @Override // com.bumptech.glide.manager.AbstractC2494d
    /* renamed from: a */
    public AbstractC2492c mo11069a(Context context, AbstractC2492c.AbstractC2493a aVar) {
        boolean z;
        String str;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new C2495e(context, aVar);
        }
        return new C2501j();
    }
}
