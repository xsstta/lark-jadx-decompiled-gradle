package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C21805b;
import java.util.Collections;
import java.util.List;

public class ConnectionTracker {
    private static final Object zzdp = new Object();
    private static volatile ConnectionTracker zzfa;
    private static boolean zzfb;
    private final List<String> zzfc = Collections.EMPTY_LIST;
    private final List<String> zzfd = Collections.EMPTY_LIST;
    private final List<String> zzfe = Collections.EMPTY_LIST;
    private final List<String> zzff = Collections.EMPTY_LIST;

    public static ConnectionTracker getInstance() {
        if (zzfa == null) {
            synchronized (zzdp) {
                if (zzfa == null) {
                    zzfa = new ConnectionTracker();
                }
            }
        }
        return zzfa;
    }

    private ConnectionTracker() {
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C21805b.m79079b(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
