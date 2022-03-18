package com.tt.miniapp.video.base;

import android.app.Application;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.SeekCompletionListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tt.miniapp.util.HandlerC67025ad;
import com.tt.miniapp.video.base.ITTVideoController;
import com.tt.miniapp.video.p3338a.AbstractC67079a;
import com.tt.miniapp.video.p3338a.AbstractC67080b;
import com.tt.miniapp.video.p3340c.C67090b;
import com.tt.miniapp.video.p3340c.C67091c;
import com.tt.miniapp.video.p3340c.C67092d;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67099e;
import com.tt.miniapp.video.p3341d.p3342a.C67096b;
import com.tt.miniapp.video.p3341d.p3343b.C67102b;
import com.tt.miniapp.video.player.C67127b;
import com.tt.miniapp.video.player.TTPlayerInitializer;
import com.tt.miniapp.video.view.AbstractC67130a;
import com.tt.miniapp.video.view.CoreVideoView;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.DebugUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tt.miniapp.video.base.a */
public class C67084a extends C67096b implements HandlerC67025ad.AbstractC67026a, AbstractC67080b, ITTVideoController, AbstractC67130a {

    /* renamed from: A */
    private AudioManager f169103A;

    /* renamed from: B */
    private String f169104B;

    /* renamed from: C */
    private int f169105C = 0;

    /* renamed from: D */
    private boolean f169106D = true;

    /* renamed from: E */
    private int f169107E = 0;

    /* renamed from: F */
    private boolean f169108F = false;

    /* renamed from: G */
    private String f169109G;

    /* renamed from: H */
    private AudioManager.OnAudioFocusChangeListener f169110H = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.tt.miniapp.video.base.C67084a.C670873 */

        public void onAudioFocusChange(int i) {
            if ((i == -2 || i == -1) && C67084a.this.mo233272l()) {
                C67091c.m261543a("onAudioFocusChange", true);
                C67084a.this.f169122k = true;
                if (C67084a.this.f169113b != null) {
                    C67084a.this.mo233268h();
                }
            }
        }
    };

    /* renamed from: I */
    private SeekCompletionListener f169111I = new SeekCompletionListener() {
        /* class com.tt.miniapp.video.base.C67084a.C670884 */

        @Override // com.ss.ttvideoengine.SeekCompletionListener
        public void onCompletion(boolean z) {
            C67084a.this.mo233264d(z);
        }
    };

    /* renamed from: a */
    private boolean f169112a;

    /* renamed from: b */
    protected TTVideoEngine f169113b;

    /* renamed from: c */
    protected CoreVideoView f169114c;

    /* renamed from: d */
    protected int f169115d;

    /* renamed from: e */
    protected int f169116e;

    /* renamed from: f */
    protected int f169117f = -1;

    /* renamed from: g */
    protected int f169118g = -1;

    /* renamed from: h */
    protected boolean f169119h;

    /* renamed from: i */
    protected int f169120i;

    /* renamed from: j */
    protected int f169121j;

    /* renamed from: k */
    public boolean f169122k;

    /* renamed from: l */
    protected HandlerC67025ad f169123l = new HandlerC67025ad(this);

    /* renamed from: m */
    protected ITTVideoController.C67083a f169124m;

    /* renamed from: n */
    protected IAppContext f169125n;

    /* renamed from: o */
    private boolean f169126o;

    /* renamed from: p */
    private TTPlayerInitializer f169127p;

    /* renamed from: q */
    private Surface f169128q;

    /* renamed from: r */
    private boolean f169129r;

    /* renamed from: s */
    private boolean f169130s;

    /* renamed from: t */
    private boolean f169131t;

    /* renamed from: u */
    private boolean f169132u;

    /* renamed from: v */
    private boolean f169133v;

    /* renamed from: w */
    private int f169134w;

    /* renamed from: x */
    private int f169135x = -1;

    /* renamed from: y */
    private ArrayList<Runnable> f169136y;

    /* renamed from: z */
    private boolean f169137z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230774a(int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo233286z() {
        return true;
    }

    /* renamed from: e */
    public CoreVideoView mo233265e() {
        return this.f169114c;
    }

    /* renamed from: f */
    public String mo233266f() {
        return this.f169104B;
    }

    /* renamed from: a */
    public void mo233256a(CoreVideoView coreVideoView) {
        this.f169114c = coreVideoView;
        if (coreVideoView != null) {
            coreVideoView.setVideoViewCallback(this);
        }
    }

    /* renamed from: a */
    public void mo233258a(boolean z) {
        C67091c.m261543a("setIsMute " + z, true);
        this.f169132u = z;
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.setIsMute(z);
        }
    }

    /* renamed from: a */
    public void mo233257a(Runnable runnable) {
        if (runnable != null) {
            if (this.f169130s) {
                runnable.run();
            } else {
                m261494b(runnable);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo230776b() {
        C67091c.m261543a("onBufferStart", true);
    }

    /* renamed from: n */
    public boolean mo233274n() {
        if (this.f169113b == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo233278r() {
        C67091c.m261543a("onBufferEnd", true);
    }

    /* renamed from: a */
    private void mo230773a() {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.setStartTime(0);
        }
        mo233267g();
    }

    /* renamed from: o */
    public boolean mo233275o() {
        return mo233265e().mo233396a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo233284x() {
        HandlerC67025ad adVar = this.f169123l;
        if (adVar != null) {
            adVar.removeMessages(101);
        }
    }

    /* renamed from: E */
    private void mo233298E() {
        ArrayList<Runnable> arrayList = this.f169136y;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f169136y.clear();
        }
    }

    /* renamed from: c */
    public void mo230777c() {
        if (mo233265e() != null) {
            mo233265e().mo233394a(this.f169125n.getCurrentActivity(), mo233294A());
        }
    }

    /* renamed from: d */
    public void mo230778d() {
        if (mo233265e() != null) {
            mo233265e().mo233393a(this.f169125n.getCurrentActivity());
        }
    }

    /* renamed from: h */
    public void mo233268h() {
        C67091c.m261543a("pauseVideo", true);
        mo233298E();
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null && tTVideoEngine.isStarted()) {
            this.f169113b.pause();
        }
    }

    /* renamed from: i */
    public void mo233269i() {
        C67091c.m261543a("stopVideo", true);
        mo233298E();
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.stop();
        }
        mo233262c(0);
    }

    /* renamed from: k */
    public void mo233271k() {
        C67091c.m261543a("retry", true);
        int i = this.f169115d;
        if (i > 0) {
            this.f169117f = i;
        }
        ITTVideoController.C67083a aVar = this.f169124m;
        if (aVar != null) {
            m261493a(aVar, true);
        }
    }

    /* renamed from: l */
    public boolean mo233272l() {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine == null || !tTVideoEngine.isStarted() || this.f169113b.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo233273m() {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine == null || !tTVideoEngine.isStarted() || this.f169113b.getPlaybackState() == 0 || this.f169113b.getPlaybackState() == 3) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo233276p() {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 0 || !this.f169129r) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo233280t() {
        AudioManager audioManager;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        if (mo233286z() && (audioManager = this.f169103A) != null && (onAudioFocusChangeListener = this.f169110H) != null) {
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            this.f169103A = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo233281u() {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            try {
                tTVideoEngine.play();
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "TTBaseVideoController", e.getStackTrace());
            }
        }
    }

    /* renamed from: v */
    public void mo233282v() {
        if (mo233265e() != null) {
            mo233265e().setSurfaceViewVisible(8);
            mo233265e().setSurfaceViewVisible(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo233283w() {
        HandlerC67025ad adVar = this.f169123l;
        if (adVar != null && !adVar.hasMessages(101)) {
            this.f169123l.sendEmptyMessage(101);
        }
    }

    /* renamed from: B */
    private void mo233295B() {
        ArrayList<Runnable> arrayList;
        if (!this.f169137z && (arrayList = this.f169136y) != null && !arrayList.isEmpty()) {
            this.f169137z = true;
            Iterator it = new ArrayList(this.f169136y).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f169136y.clear();
            this.f169137z = false;
        }
    }

    /* renamed from: j */
    public void mo233270j() {
        C67091c.m261543a("releaseMedia", true);
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
            this.f169113b = null;
        }
        mo233280t();
        mo233298E();
        mo233284x();
        this.f169129r = false;
        this.f169122k = false;
        this.f169117f = -1;
        this.f169118g = -1;
        this.f169124m = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo233279s() {
        this.f169122k = false;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null && mo233286z()) {
            if (this.f169103A == null) {
                this.f169103A = (AudioManager) applicationContext.getSystemService("audio");
            }
            try {
                this.f169103A.requestAudioFocus(this.f169110H, 3, 2);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo233285y() {
        boolean z;
        ITTVideoController.C67083a aVar = this.f169124m;
        if (aVar == null || TextUtils.isEmpty(aVar.mo233247o())) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
        if (z) {
            str = this.f169124m.mo233247o();
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists() || !file.canRead()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: A */
    private int mo233294A() {
        int i = this.f169135x;
        if (i == 0) {
            AppBrandLogger.m52830i("TTBaseVideoController", "direction:reverse portrait!");
            return 1;
        } else if (i == 90) {
            return 0;
        } else {
            if (i == -90) {
                AppBrandLogger.m52830i("TTBaseVideoController", "direction:reverse landscape!");
                return 8;
            }
            int videoWidth = this.f169113b.getVideoWidth();
            int videoHeight = this.f169113b.getVideoHeight();
            AppBrandLogger.m52830i("TTBaseVideoController", "width:", Integer.valueOf(videoWidth), "height:", Integer.valueOf(videoHeight));
            if (videoWidth > videoHeight) {
                AppBrandLogger.m52830i("TTBaseVideoController", "direction:landscap!");
                return 0;
            }
            AppBrandLogger.m52830i("TTBaseVideoController", "direction:portrait!");
            return 1;
        }
    }

    /* renamed from: g */
    public void mo233267g() {
        C67091c.m261543a("startVideo", true);
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.setIsMute(this.f169132u);
            this.f169113b.setStartTime(this.f169134w * 1000);
            int i = this.f169117f;
            if (i > 0) {
                this.f169113b.setStartTime(i);
            }
        }
        this.f169129r = false;
        if (!this.f169130s) {
            mo233282v();
            mo233257a(new Runnable() {
                /* class com.tt.miniapp.video.base.C67084a.RunnableC670862 */

                public void run() {
                    C67084a.this.mo233281u();
                }
            });
        } else {
            TTVideoEngine tTVideoEngine2 = this.f169113b;
            if (tTVideoEngine2 != null) {
                Surface surface = this.f169128q;
                if (surface != null) {
                    tTVideoEngine2.setSurface(surface);
                }
                mo233281u();
            }
        }
        this.f169117f = -1;
        this.f169134w = 0;
        this.f169126o = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo233277q() {
        C67091c.m261543a("createVideoEngine", true);
        if (this.f169113b != null) {
            mo233298E();
            this.f169113b.release();
        }
        if (this.f169127p == null) {
            this.f169127p = new TTPlayerInitializer(this.f169125n);
        }
        if (mo233285y()) {
            this.f169113b = this.f169127p.mo233390a(2);
        } else {
            this.f169113b = this.f169127p.mo233391b();
        }
        this.f169113b.setIntOption(SmEvents.EVENT_NO, 1);
        this.f169113b.setIntOption(4, 1);
        Surface surface = this.f169128q;
        if (surface != null) {
            this.f169113b.setSurface(surface);
        }
        VideoEventManager.instance.setListener(new C67127b());
        this.f169113b.setListener(this);
        this.f169113b.setDecryptionKey(this.f169104B);
        if (DebugUtil.debug()) {
            TTVideoEngineLog.turnOn(1, 1);
        }
    }

    /* renamed from: a */
    public void mo233250a(int i) {
        this.f169135x = i;
    }

    /* renamed from: b */
    public void mo233259b(int i) {
        this.f169134w = i;
    }

    /* renamed from: c */
    public void mo233263c(boolean z) {
        this.f169133v = z;
    }

    /* renamed from: b */
    public void mo233261b(boolean z) {
        this.f169119h = z;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        C67091c.m261543a("onPrepared", true);
        this.f169129r = false;
    }

    /* renamed from: b */
    private void m261494b(Runnable runnable) {
        if (this.f169136y == null) {
            this.f169136y = new ArrayList<>();
        }
        this.f169136y.add(runnable);
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        C67091c.m261543a("onCompletion", true);
        if (!this.f169133v) {
            this.f169129r = true;
        } else if (this.f169126o) {
            this.f169126o = false;
        } else {
            mo230773a();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onError(Error error) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("onError");
        if (error != null) {
            i = error.code;
        } else {
            i = 0;
        }
        sb.append(i);
        C67091c.m261543a(sb.toString(), true);
        m261496e(false);
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        C67091c.m261543a("onPrepare", true);
        this.f169108F = false;
        this.f169129r = false;
        if (this.f169112a) {
            mo233268h();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        C67091c.m261543a("onRenderStart", true);
        this.f169108F = true;
        int i = this.f169118g;
        if (i != -1) {
            mo233262c(i);
            this.f169118g = -1;
        }
        this.f169129r = false;
    }

    public C67084a(IAppContext iAppContext) {
        this.f169125n = iAppContext;
    }

    /* renamed from: e */
    private void m261496e(boolean z) {
        C67091c.m261543a("setKeepScreenOn" + z, true);
        if (mo233265e() != null) {
            mo233265e().mo233395a(z);
        }
    }

    @Override // com.tt.miniapp.video.view.AbstractC67130a
    /* renamed from: a */
    public void mo233252a(Surface surface) {
        TTVideoEngine tTVideoEngine;
        C67091c.m261543a("textureViewCreated", true);
        this.f169130s = true;
        this.f169128q = surface;
        if (!this.f169131t && (tTVideoEngine = this.f169113b) != null) {
            tTVideoEngine.setSurface(surface);
            this.f169131t = true;
            mo233295B();
        }
    }

    @Override // com.tt.miniapp.video.view.AbstractC67130a
    /* renamed from: b */
    public void mo233260b(Surface surface) {
        C67091c.m261543a("textureViewDestroyed", true);
        this.f169130s = false;
        this.f169128q = null;
        m261496e(false);
        this.f169131t = false;
    }

    /* renamed from: c */
    public void mo233262c(int i) {
        C67091c.m261543a("seekTo " + i, true);
        if (this.f169113b != null) {
            int e = m261495e(i);
            mo233284x();
            if (this.f169108F) {
                this.f169113b.seekTo(e, this.f169111I);
            } else {
                this.f169118g = e;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo233264d(boolean z) {
        C67091c.m261543a("onSeekCompletion" + z, true);
        if (mo233273m()) {
            this.f169123l.sendMessageDelayed(this.f169123l.obtainMessage(101), 250);
        }
    }

    /* renamed from: e */
    private int m261495e(int i) {
        boolean z;
        int duration = this.f169113b.getDuration();
        int currentPlaybackTime = this.f169113b.getCurrentPlaybackTime();
        if (duration < 2200) {
            return i;
        }
        int i2 = duration - 2000;
        if (mo233272l() || mo233276p()) {
            z = false;
        } else {
            z = true;
        }
        if (i >= duration) {
            this.f169126o = !mo233272l();
            return i;
        }
        if (i > i2) {
            i = i2 - 200;
        }
        if (currentPlaybackTime > i2 || !mo233273m()) {
            if (mo233273m()) {
                this.f169113b.stop();
            }
            mo233267g();
            if (z) {
                mo233268h();
            }
        }
        return i;
    }

    @Override // com.tt.miniapp.util.HandlerC67025ad.AbstractC67026a
    /* renamed from: a */
    public void mo233141a(Message message) {
        if (message.what == 101) {
            TTVideoEngine tTVideoEngine = this.f169113b;
            if (tTVideoEngine != null) {
                int currentPlaybackTime = tTVideoEngine.getCurrentPlaybackTime();
                int duration = this.f169113b.getDuration();
                this.f169115d = currentPlaybackTime;
                this.f169116e = duration;
                C67090b.m261540a().mo233289a(this.f169116e);
                C67091c.m261543a("Duration: " + duration + " current: " + currentPlaybackTime, false);
                if (duration > 0) {
                    mo230774a(currentPlaybackTime, duration);
                }
            }
            if (mo233272l()) {
                this.f169123l.sendMessageDelayed(this.f169123l.obtainMessage(101), 250);
            }
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoStatusException(int i) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        C67091c.m261543a("onVideoStatusException" + i, true);
        if (!(i == 3 || i == 4 || i == 20 || i == 30)) {
            if (i != 40) {
                if (i != 1000) {
                    if (i != 1002) {
                        return;
                    }
                }
            }
            HostDependManager.getInst().showToast(applicationContext, null, applicationContext.getResources().getString(R.string.microapp_m_video_exception_deleted), 0, null);
            mo233270j();
            return;
        }
        HostDependManager.getInst().showToast(applicationContext, null, applicationContext.getResources().getString(R.string.microapp_m_video_exception_transcode), 0, null);
        mo233270j();
    }

    /* renamed from: a */
    public void mo233253a(ITTVideoController.ShowStateEntity showStateEntity) {
        CoreVideoView e = mo233265e();
        if (e != null) {
            e.setObjectFit(showStateEntity.mo233213e());
        } else {
            AppBrandLogger.m52829e("TTBaseVideoController", "updateShowStateError coreVideoView == null");
        }
        mo233258a(showStateEntity.mo233210d());
        mo233263c(showStateEntity.mo233208c());
        mo233259b(showStateEntity.mo233200a());
        Bundle bundle = new Bundle();
        bundle.putParcelable("showState", showStateEntity);
        mo233314b(new C67102b(SmEvents.EVENT_HBRESET, bundle));
    }

    /* renamed from: a */
    public void mo233254a(ITTVideoController.C67083a aVar) {
        m261493a(aVar, false);
    }

    /* renamed from: a */
    public void mo233255a(AbstractC67099e eVar) {
        mo233314b(eVar);
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        this.f169107E = tTVideoEngine.getLoadState();
        if (i == 1) {
            mo233278r();
        } else if (i == 2) {
            mo230776b();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        C67091c.m261543a("onPlaybackStateChanged playbackState:" + i, true);
        if (i != 0) {
            if (i == 1) {
                mo233279s();
                mo233283w();
                m261496e(true);
                this.f169129r = false;
                return;
            } else if (i == 2) {
                this.f169129r = false;
            } else if (i != 3) {
                return;
            }
        }
        mo233280t();
        mo233284x();
        mo233298E();
        m261496e(false);
    }

    /* renamed from: a */
    private void m261493a(final ITTVideoController.C67083a aVar, boolean z) {
        String n = aVar.mo233246n();
        this.f169124m = aVar;
        this.f169104B = aVar.mo233238f();
        mo233263c(aVar.mo233227a());
        mo233258a(aVar.mo233234c());
        mo233261b(aVar.mo233236d());
        mo233250a(aVar.mo233228b());
        mo233259b(aVar.mo233237e());
        if (z || !TextUtils.equals(this.f169109G, n) || this.f169113b == null) {
            mo233277q();
            C67091c.m261543a("try play " + aVar.mo233241i() + " getWidth " + aVar.mo233248p() + " getHeight " + aVar.mo233249q(), true);
            if (this.f169113b != null) {
                if (!TextUtils.isEmpty(aVar.mo233247o())) {
                    C67091c.m261543a("try play local url", true);
                    this.f169113b.setLocalURL(aVar.mo233247o());
                } else if (!TextUtils.isEmpty(n)) {
                    this.f169109G = n;
                    C67091c.m261543a("try play video url", true);
                    this.f169113b.setDirectURL(n);
                } else {
                    C67091c.m261543a("try play get url", true);
                    this.f169113b.setDataSource(new AbstractC67079a() {
                        /* class com.tt.miniapp.video.base.C67084a.C670851 */

                        @Override // com.ss.ttvideoengine.DataSource
                        public String apiForFetcher(Map<String, String> map, int i) {
                            return C67092d.m261544a(aVar.mo233242j(), aVar.mo233241i(), aVar.mo233243k(), aVar.mo233244l(), 1, aVar.mo233245m(), map);
                        }
                    });
                    this.f169113b.setVideoID(aVar.mo233241i());
                }
            }
            if (aVar.mo233239g()) {
                mo233267g();
                return;
            }
            AppBrandLogger.m52830i("TTBaseVideoController", "play, autoPlay false");
            return;
        }
        AppBrandLogger.m52830i("TTBaseVideoController", "play, same videoUrl: ", n);
    }

    @Override // com.tt.miniapp.video.view.AbstractC67130a
    /* renamed from: a */
    public void mo233251a(SurfaceTexture surfaceTexture, int i, int i2) {
        TTVideoEngine tTVideoEngine = this.f169113b;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(new Surface(surfaceTexture));
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        C67091c.m261543a("onVideoSizeChanged called :" + i + " " + i2, true);
        if (i > 0 && i2 > 0) {
            this.f169120i = i;
            this.f169121j = i2;
            this.f169114c.mo233392a(i, i2);
        }
    }
}
