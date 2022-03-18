package com.ss.android.lark.ug.dyflow.steps.video.volume;

import android.content.Context;
import android.media.AudioManager;
import com.ss.android.lark.ug.apm.UGApm;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeManager;", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/OnVolumeChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioMgr", "Landroid/media/AudioManager;", "maxVolume", "", "receiver", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeBroadcastReceiver;", "step", "", "volumeChangeListener", "addMediaVolume", "current", "cutMediaVolume", "decreaseVolume", "destroy", "", "getMediaMaxVolume", "getMediaVolume", "getStepVolume", "increaseVolume", "init", "onVolumeChanged", "setMediaVolume", "volume", "setOnVolumeChangeListener", "listener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.video.volume.b */
public final class VolumeManager implements OnVolumeChangeListener {

    /* renamed from: a */
    private AudioManager f141637a;

    /* renamed from: b */
    private final float f141638b = 0.1f;

    /* renamed from: c */
    private int f141639c;

    /* renamed from: d */
    private VolumeBroadcastReceiver f141640d;

    /* renamed from: e */
    private OnVolumeChangeListener f141641e;

    /* renamed from: f */
    private final Context f141642f;

    /* renamed from: h */
    public final int mo195103h() {
        return this.f141639c;
    }

    @Override // com.ss.android.lark.ug.dyflow.steps.video.volume.OnVolumeChangeListener
    /* renamed from: a */
    public void mo195079a() {
        OnVolumeChangeListener aVar = this.f141641e;
        if (aVar != null) {
            aVar.mo195079a();
        }
    }

    /* renamed from: d */
    public final int mo195099d() {
        int g = mo195102g();
        mo195093a(g);
        return g;
    }

    /* renamed from: e */
    public final int mo195100e() {
        int g = mo195102g();
        mo195095b(g);
        return g;
    }

    /* renamed from: f */
    public final int mo195101f() {
        return (int) (((float) this.f141639c) * this.f141638b);
    }

    /* renamed from: g */
    public final int mo195102g() {
        AudioManager audioManager = this.f141637a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo195097c() {
        VolumeBroadcastReceiver volumeBroadcastReceiver = this.f141640d;
        if (volumeBroadcastReceiver != null) {
            VolumeBroadcastReceiver.f141635a.mo195092a(this.f141642f, volumeBroadcastReceiver);
        }
        this.f141641e = null;
    }

    /* renamed from: b */
    public final void mo195096b() {
        if (this.f141640d == null) {
            this.f141640d = VolumeBroadcastReceiver.f141635a.mo195091a(this.f141642f, this);
        }
    }

    /* renamed from: a */
    public final void mo195094a(OnVolumeChangeListener aVar) {
        this.f141641e = aVar;
    }

    /* renamed from: a */
    public final int mo195093a(int i) {
        if (this.f141637a == null) {
            return -1;
        }
        int f = i + mo195101f();
        int i2 = this.f141639c;
        if (f >= i2) {
            f = i2;
        }
        mo195098c(f);
        return f;
    }

    /* renamed from: b */
    public final int mo195095b(int i) {
        if (this.f141637a == null) {
            return -1;
        }
        int f = i - mo195101f();
        if (f < 0) {
            f = 0;
        }
        mo195098c(f);
        return f;
    }

    public VolumeManager(Context context) {
        AudioManager audioManager;
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f141642f = context;
        Object systemService = context.getSystemService("audio");
        if (systemService == null) {
            audioManager = null;
        } else if (systemService != null) {
            audioManager = (AudioManager) systemService;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
        }
        this.f141637a = audioManager;
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        this.f141639c = i;
    }

    /* renamed from: c */
    public final void mo195098c(int i) {
        try {
            AudioManager audioManager = this.f141637a;
            if (audioManager != null) {
                audioManager.setStreamVolume(3, i, 4);
            }
            UGApm.OnBoarding.f141199a.mo194478a(true, (String) null);
        } catch (Exception e) {
            UGApm.OnBoarding.f141199a.mo194478a(false, e.toString());
        }
    }
}
