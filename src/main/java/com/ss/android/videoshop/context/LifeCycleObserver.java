package com.ss.android.videoshop.context;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.videoshop.api.AbstractC64102j;
import com.ss.android.videoshop.controller.EngineInspector;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3199e.C64159a;

/* access modifiers changed from: package-private */
public class LifeCycleObserver extends AbstractC64102j.C64103a implements LifecycleObserver {

    /* renamed from: a */
    private final AbstractC64102j f161930a;

    /* renamed from: b */
    private final VideoContext f161931b;

    /* renamed from: c */
    private final Lifecycle f161932c;

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public void mo163677b(VideoContext videoContext) {
        this.f161930a.mo163677b(videoContext);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: c */
    public void mo163680c(VideoContext videoContext) {
        this.f161930a.mo163680c(videoContext);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public boolean mo163673a(VideoContext videoContext) {
        return this.f161930a.mo163673a(videoContext);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnCreate owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnCreate owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(401));
        this.f161930a.mo163670a(lifecycleOwner, this.f161931b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnDestroy owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnDestroy owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(406));
        this.f161930a.mo163684f(lifecycleOwner, this.f161931b);
        this.f161931b.mo222014a(this.f161932c);
        this.f161931b.mo222033b(this.f161932c);
        this.f161932c.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnPause owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnPause owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(404));
        this.f161930a.mo163682d(lifecycleOwner, this.f161931b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnResume owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnResume owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(403));
        this.f161930a.mo163679c(lifecycleOwner, this.f161931b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnStart owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnStart owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(402));
        this.f161930a.mo163676b(lifecycleOwner, this.f161931b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner) {
        C64159a.m252083b("LifeCycleObserver", "onLifeCycleOnStop owner:" + lifecycleOwner.getClass().getSimpleName());
        C64116b m = this.f161931b.mo222060m();
        C64159a.m252077a(m, "onLifeCycleOnStop owner:" + lifecycleOwner.getClass().getSimpleName());
        this.f161931b.mo222028a(this.f161932c, new C64119c(405));
        this.f161930a.mo163683e(lifecycleOwner, this.f161931b);
        C64159a.m252083b("LifeCycleObserver", "Context Stop Engine State:" + EngineInspector.ENUM.getStateDesc());
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public void mo163671a(VideoContext videoContext, boolean z) {
        this.f161930a.mo163671a(videoContext, z);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public void mo163678b(VideoContext videoContext, boolean z) {
        this.f161930a.mo163678b(videoContext, z);
    }

    LifeCycleObserver(Lifecycle lifecycle, AbstractC64102j jVar, VideoContext videoContext) {
        this.f161932c = lifecycle;
        this.f161930a = jVar;
        this.f161931b = videoContext;
        lifecycle.addObserver(this);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public void mo221904a(boolean z, int i, boolean z2) {
        this.f161930a.mo221904a(z, i, z2);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public boolean mo221905b(boolean z, int i, boolean z2) {
        return this.f161930a.mo221905b(z, i, z2);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public void mo221903a(NetworkUtils.NetworkType networkType, VideoContext videoContext, Context context, Intent intent) {
        this.f161930a.mo221903a(networkType, videoContext, context, intent);
    }
}
