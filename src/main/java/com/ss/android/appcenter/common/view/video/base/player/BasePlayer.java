package com.ss.android.appcenter.common.view.video.base.player;

import android.os.Bundle;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.appcenter.common.view.video.base.misc.BundlePool;
import com.ss.android.appcenter.common.view.video.listener.OnBufferingListener;
import com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\rJ\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0004J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0004J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0004H\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/player/BasePlayer;", "Lcom/ss/android/appcenter/common/view/video/base/player/IPlayer;", "()V", "bufferPercentage", "", "bufferingListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "curState", "errorEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "playerEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "videoSizeChangedListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;", "getVideoSizeChangedListener", "()Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;", "setVideoSizeChangedListener", "(Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;)V", "getBufferPercentage", "getState", "option", "", "code", "bundle", "Landroid/os/Bundle;", "setOnBufferingListener", "onBufferingListener", "setOnErrorEventListener", "onErrorEventListener", "setOnPlayerEventListener", "onPlayerEventListener", "setOnVideoSizeChangedListener", "listener", "submitBufferingUpdate", "percentage", "extra", "submitErrorEvent", "eventCode", "submitPlayerEvent", "updateStatus", UpdateKey.STATUS, "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.b.a */
public abstract class BasePlayer implements IPlayer {

    /* renamed from: a */
    private int f70815a;

    /* renamed from: b */
    private OnPlayerEventListener f70816b;

    /* renamed from: c */
    private OnErrorEventListener f70817c;

    /* renamed from: d */
    private OnBufferingListener f70818d;

    /* renamed from: e */
    private int f70819e;

    /* renamed from: f */
    private OnVideoSizeChangedListener f70820f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final OnVideoSizeChangedListener mo100521a() {
        return this.f70820f;
    }

    /* renamed from: b */
    public int mo100528b() {
        return this.f70815a;
    }

    /* renamed from: c */
    public int mo100530c() {
        return this.f70819e;
    }

    /* renamed from: a */
    public void mo100524a(OnBufferingListener aVar) {
        this.f70818d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100522a(int i) {
        this.f70815a = i;
        Bundle a = BundlePool.f70804a.mo100512a();
        a.putInt("int_data", i);
        mo100523a(-99031, a);
    }

    /* renamed from: a */
    public void mo100525a(OnErrorEventListener bVar) {
        this.f70817c = bVar;
    }

    /* renamed from: a */
    public void mo100526a(OnPlayerEventListener cVar) {
        this.f70816b = cVar;
    }

    /* renamed from: a */
    public final void mo100527a(OnVideoSizeChangedListener dVar) {
        this.f70820f = dVar;
    }

    /* renamed from: a */
    public final void mo100523a(int i, Bundle bundle) {
        OnPlayerEventListener cVar = this.f70816b;
        if (cVar != null) {
            cVar.mo99385a(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo100529b(int i, Bundle bundle) {
        OnErrorEventListener bVar = this.f70817c;
        if (bVar != null) {
            bVar.mo99390c(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo100531c(int i, Bundle bundle) {
        this.f70819e = i;
        OnBufferingListener aVar = this.f70818d;
        if (aVar != null) {
            aVar.mo99388b(i, bundle);
        }
    }
}
