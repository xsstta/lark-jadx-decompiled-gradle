package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.facebook.react.d */
public class ComponentCallbacks2C21112d implements ComponentCallbacks2 {

    /* renamed from: a */
    private final Set<MemoryPressureListener> f51501a = Collections.synchronizedSet(new LinkedHashSet());

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        m76740a(i);
    }

    /* renamed from: a */
    public void mo71767a(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    /* renamed from: b */
    public void mo71769b(MemoryPressureListener memoryPressureListener) {
        this.f51501a.remove(memoryPressureListener);
    }

    /* renamed from: a */
    public void mo71768a(MemoryPressureListener memoryPressureListener) {
        this.f51501a.add(memoryPressureListener);
    }

    ComponentCallbacks2C21112d(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    /* renamed from: a */
    private void m76740a(int i) {
        Set<MemoryPressureListener> set = this.f51501a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }
}
