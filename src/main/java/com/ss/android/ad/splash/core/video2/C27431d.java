package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.VideoInfoListener;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video2.d */
public class C27431d implements AbstractC27436f, AbstractC27438h, HandlerC27486n.AbstractC27487a, VideoEngineListener, VideoInfoListener {

    /* renamed from: a */
    protected Context f68563a;

    /* renamed from: b */
    protected AbstractC27437g f68564b;

    /* renamed from: c */
    protected TTVideoEngine f68565c;

    /* renamed from: d */
    protected HandlerC27486n f68566d = new HandlerC27486n(this);

    /* renamed from: e */
    private AbstractC27429b f68567e;

    /* renamed from: f */
    private boolean f68568f;

    /* renamed from: g */
    private ArrayList<Runnable> f68569g = new ArrayList<>();

    /* renamed from: h */
    private boolean f68570h;

    /* renamed from: i */
    private boolean f68571i = false;

    /* renamed from: j */
    private boolean f68572j = false;

    /* renamed from: k */
    private long f68573k;

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27438h
    /* renamed from: a */
    public boolean mo97922a(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoInfoListener
    public boolean onFetchedVideoInfo(VideoModel videoModel) {
        return false;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: c */
    public float mo97925c() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return tTVideoEngine.getVolume();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: d */
    public float mo97926d() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return tTVideoEngine.getMaxVolume();
    }

    /* renamed from: e */
    public boolean mo97971e() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: g */
    public int mo97929g() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getCurrentPlaybackTime();
        }
        return 0;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: h */
    public int mo97930h() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getDuration();
        }
        return 0;
    }

    /* renamed from: l */
    public void mo97973l() {
        try {
            this.f68565c.setLooping(false);
            this.f68565c.play();
        } catch (Exception unused) {
        }
    }

    public C27431d() {
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: b */
    public void mo97923b() {
        if (this.f68565c != null && !this.f68571i) {
            this.f68567e.mo97176a(mo97929g(), mo97930h());
            this.f68565c.stop();
            this.f68571i = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: i */
    public void mo97931i() {
        if (this.f68565c != null && mo97970a()) {
            this.f68565c.pause();
            AbstractC27429b bVar = this.f68567e;
            if (bVar != null) {
                bVar.mo97953f(mo97929g());
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: j */
    public void mo97932j() {
        if (this.f68565c != null && mo97971e()) {
            this.f68565c.play();
            AbstractC27429b bVar = this.f68567e;
            if (bVar != null) {
                bVar.mo97955h();
            }
        }
    }

    /* renamed from: n */
    private void m100112n() {
        if (!this.f68570h && !this.f68569g.isEmpty()) {
            this.f68570h = true;
            Iterator it = new ArrayList(this.f68569g).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f68569g.clear();
            this.f68570h = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo97972f() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        TTVideoEngine tTVideoEngine2 = new TTVideoEngine(this.f68563a, 0);
        this.f68565c = tTVideoEngine2;
        tTVideoEngine2.setIsMute(true);
        this.f68565c.setTag("splash_ad");
        this.f68565c.setListener(this);
        this.f68565c.setVideoInfoListener(this);
        this.f68565c.setIntOption(4, 2);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: k */
    public void mo97933k() {
        AbstractC27437g gVar = this.f68564b;
        if (gVar != null) {
            gVar.mo97904a(false);
        }
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            tTVideoEngine.setListener(null);
            this.f68565c.setVideoInfoListener(null);
            if (C27287e.m99259e().mo97707l()) {
                this.f68565c.releaseAsync();
            } else {
                this.f68565c.release();
            }
            this.f68565c = null;
        }
        this.f68567e = null;
    }

    /* renamed from: m */
    private void m100111m() {
        AbstractC27429b bVar;
        if (this.f68565c != null) {
            if (mo97970a()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f68573k;
                long j2 = uptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.f68566d.sendMessageDelayed(this.f68566d.obtainMessage(1000), j3);
                this.f68573k = uptimeMillis;
            } else {
                this.f68573k = 0;
            }
            int duration = this.f68565c.getDuration();
            if (duration > 0 && (bVar = this.f68567e) != null) {
                bVar.mo97954g(this.f68565c.getCurrentPlaybackTime(), duration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo97970a() {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97918a(AbstractC27429b bVar) {
        this.f68567e = bVar;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onError(Error error) {
        AbstractC27429b bVar = this.f68567e;
        if (bVar != null) {
            bVar.mo97177b();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoStatusException(int i) {
        AbstractC27429b bVar = this.f68567e;
        if (bVar != null) {
            bVar.mo97177b();
        }
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        if (message.what == 1000) {
            m100111m();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        AbstractC27429b bVar = this.f68567e;
        if (bVar != null) {
            bVar.mo97175a(mo97930h());
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        AbstractC27429b bVar = this.f68567e;
        if (bVar != null) {
            bVar.mo97225b(tTVideoEngine.getDuration());
        }
    }

    public C27431d(AbstractC27437g gVar) {
        mo97968a(gVar);
    }

    /* renamed from: a */
    public void mo97968a(AbstractC27437g gVar) {
        if (gVar != null) {
            this.f68564b = gVar;
            gVar.setVideoViewCallback(this);
            this.f68563a = this.f68564b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    /* renamed from: a */
    public void mo97969a(Runnable runnable) {
        if (runnable != null) {
            if (this.f68568f) {
                runnable.run();
            } else {
                this.f68569g.add(runnable);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97921a(boolean z) {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            tTVideoEngine.setIsMute(z);
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97916a(float f, float f2) {
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            tTVideoEngine.setVolume(f, f2);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1) {
            AbstractC27429b bVar = this.f68567e;
            if (bVar != null && !this.f68572j) {
                bVar.mo97174a();
            }
            this.f68566d.removeMessages(1000);
            this.f68566d.sendEmptyMessage(1000);
            this.f68572j = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: b */
    public boolean mo97924b(String str, String str2) {
        if (TextUtils.isEmpty(str) || this.f68564b == null) {
            return false;
        }
        mo97972f();
        this.f68565c.setLocalURL(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f68565c.setDecryptionKey(str2);
        }
        this.f68565c.setStartTime(0);
        Surface surface = this.f68564b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f68564b.setSurfaceViewVisibility(0);
            mo97969a(new Runnable() {
                /* class com.ss.android.ad.splash.core.video2.C27431d.RunnableC274321 */

                public void run() {
                    C27431d.this.mo97973l();
                }
            });
        } else {
            this.f68565c.setSurface(surface);
            mo97973l();
        }
        this.f68571i = false;
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27438h
    /* renamed from: a */
    public void mo97917a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f68568f = true;
        Surface surface = this.f68564b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        TTVideoEngine tTVideoEngine = this.f68565c;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(surface);
            m100112n();
        }
    }
}
