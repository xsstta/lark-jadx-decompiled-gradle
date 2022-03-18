package com.ss.android.lark.dfcore.utils;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitcompat.C22662a;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;

/* renamed from: com.ss.android.lark.dfcore.utils.a */
public class C36616a {

    /* renamed from: a */
    private volatile WeakReference<AssetManager> f94230a;

    /* renamed from: b */
    private LinkedHashSet<Integer> f94231b = new LinkedHashSet<>();

    /* renamed from: c */
    private volatile ThreadLocal<Object> f94232c = new ThreadLocal<>();

    /* renamed from: a */
    public void mo135080a() {
        synchronized (this) {
            this.f94230a = null;
            this.f94231b.clear();
        }
    }

    /* renamed from: a */
    public void mo135081a(Context context) {
        if (this.f94232c.get() == null) {
            this.f94232c.set(new Object());
            AssetManager assets = context.getAssets();
            if (this.f94230a == null || this.f94230a.get() != assets) {
                synchronized (this) {
                    if (this.f94230a == null || this.f94230a.get() != assets) {
                        this.f94230a = new WeakReference<>(assets);
                        Integer valueOf = Integer.valueOf(System.identityHashCode(assets));
                        if (!this.f94231b.contains(valueOf)) {
                            Log.m165389i("DFCore", "--->  miss cache,  Do SplitCompat Install Now！ context: " + context + ", manager: " + assets);
                            C22662a.m82494b(context);
                            this.f94231b.add(valueOf);
                        }
                        this.f94232c.remove();
                        return;
                    }
                    this.f94232c.remove();
                    return;
                }
            }
            this.f94232c.remove();
        }
    }
}
