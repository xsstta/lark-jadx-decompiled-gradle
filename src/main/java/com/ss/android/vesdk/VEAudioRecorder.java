package com.ss.android.vesdk;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ttve.audio.C60180c;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.vesdk.runtime.VERuntime;

public class VEAudioRecorder implements LifecycleObserver {

    /* renamed from: a */
    private VERuntime f161041a = VERuntime.m251382a();

    /* renamed from: b */
    private boolean f161042b;

    /* renamed from: c */
    private C60180c f161043c = new C60180c(new TEDubWriter());

    public VEAudioRecorder() {
        C63929ab.m250974a("VEAudioRecorder", "VEAudioRecorder constructor in.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destory() {
        C63929ab.m250974a("VEAudioRecorder", "VEAudioRecorder destory in. mbRecording = " + this.f161042b);
        this.f161043c.mo205505a();
    }
}
