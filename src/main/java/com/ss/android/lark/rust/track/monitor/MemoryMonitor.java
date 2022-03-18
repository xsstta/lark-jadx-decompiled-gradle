package com.ss.android.lark.rust.track.monitor;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.ss.android.lark.rust.track.C53165b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MemoryMonitor;", "", "()V", "componentCallback", "Landroid/content/ComponentCallbacks2;", "mMemoryTrimLevel", "", "calculateMemoryUsageRate", "start", "", "stop", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.monitor.d */
public final class MemoryMonitor {

    /* renamed from: a */
    public int f131519a;

    /* renamed from: b */
    private final ComponentCallbacks2 f131520b = new ComponentCallbacks2C53192a(this);

    /* renamed from: b */
    public final void mo181662b() {
        C53165b.m205769a().mo178125b(this.f131520b);
    }

    /* renamed from: c */
    public final void mo181663c() {
        C53165b.m205769a().mo178121a(this.f131520b);
    }

    /* renamed from: a */
    public final int mo181661a() {
        int i = this.f131519a;
        if (1 <= i && 20 > i) {
            return 0;
        }
        if (20 <= i && 40 > i) {
            return 1;
        }
        if (40 <= i && 60 > i) {
            return 2;
        }
        if (60 <= i && 80 > i) {
            return 3;
        }
        if (i > 80) {
            return 4;
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/rust/track/monitor/MemoryMonitor$componentCallback$1", "Landroid/content/ComponentCallbacks2;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.d$a */
    public static final class ComponentCallbacks2C53192a implements ComponentCallbacks2 {

        /* renamed from: a */
        final /* synthetic */ MemoryMonitor f131521a;

        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        }

        public void onLowMemory() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ComponentCallbacks2C53192a(MemoryMonitor dVar) {
            this.f131521a = dVar;
        }

        public void onTrimMemory(int i) {
            this.f131521a.f131519a = i;
        }
    }
}
