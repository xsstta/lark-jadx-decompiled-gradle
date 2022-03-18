package com.bytedance.ee.bear.drive.view.preview.video.p375a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.ee.bear.basesdk.services.C4508f;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.p284h.AbstractC5176a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.C7501e;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.ss.ttm.player.TTPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.log.VideoEventListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.e */
public class C7501e implements AbstractC7496b {

    /* renamed from: h */
    private static volatile boolean f20252h;

    /* renamed from: q */
    private static C7505b f20253q = new C7505b();

    /* renamed from: a */
    public TTVideoEngine f20254a;

    /* renamed from: b */
    public AbstractC5176a.AbstractC5177a f20255b;

    /* renamed from: c */
    public AbstractC7495a f20256c;

    /* renamed from: d */
    public TextureView f20257d;

    /* renamed from: e */
    public Surface f20258e;

    /* renamed from: f */
    public SurfaceTexture f20259f;

    /* renamed from: g */
    public long f20260g;

    /* renamed from: i */
    private boolean f20261i;

    /* renamed from: j */
    private String f20262j;

    /* renamed from: k */
    private String f20263k;

    /* renamed from: l */
    private boolean f20264l;

    /* renamed from: m */
    private final PersistenceSharedPreference f20265m;

    /* renamed from: n */
    private long f20266n = C6920b.m27342f().mo27168c().mo27225g();

    /* renamed from: o */
    private NetService f20267o = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: p */
    private boolean f20268p;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.e$b */
    public static class C7505b implements VideoEventListener {
        @Override // com.ss.ttvideoengine.log.VideoEventListener
        public void onEventV2(String str) {
        }

        private C7505b() {
        }

        @Override // com.ss.ttvideoengine.log.VideoEventListener
        public void onEvent() {
            try {
                JSONArray popAllEvents = VideoEventManager.instance.popAllEvents();
                for (int i = 0; i < popAllEvents.length(); i++) {
                    JSONObject jSONObject = popAllEvents.getJSONObject(i);
                    C13479a.m54764b(TTPlayer.TAG, "onEvent: " + jSONObject.toString());
                }
            } catch (Exception e) {
                C13479a.m54759a(TTPlayer.TAG, "VideoEventManager error", e);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: f */
    public long mo29303f() {
        return (long) this.f20254a.getDuration();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: g */
    public long mo29304g() {
        return (long) this.f20254a.getCurrentPlaybackTime();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29297b() {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer pause");
        this.f20254a.pause();
    }

    /* renamed from: j */
    public void mo29306j() {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer stop");
        this.f20254a.stop();
    }

    /* renamed from: h */
    public static boolean m30024h() {
        if (!f20252h) {
            f20252h = C4508f.m18583a().mo17338a("ttplayer");
        }
        return f20252h;
    }

    /* renamed from: i */
    public static void m30025i() {
        TTVideoEngine.setTTDNSServerHost(C7506f.m30053c().mo29324a());
        TTVideoEngine.configBoeSuffix(C7506f.m30053c().mo29325b());
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: c */
    public void mo29300c() {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer release... ");
        TextureView textureView = this.f20257d;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f20254a.setListener(null);
        this.f20254a.release();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: d */
    public void mo29301d() {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer reset... ");
        if (this.f20254a.getPlaybackState() != 0) {
            C13479a.m54764b(TTPlayer.TAG, "ttPlayer reset, stop playing");
            mo29306j();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: e */
    public int mo29302e() {
        int playbackState = this.f20254a.getPlaybackState();
        if (playbackState != 0) {
            if (playbackState == 1) {
                return 4;
            }
            if (playbackState == 2) {
                return 2;
            }
            if (playbackState != 3) {
                return 1;
            }
        }
        return 5;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29289a() {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer start");
        this.f20260g = SystemClock.elapsedRealtime();
        if (this.f20254a.getPlaybackState() == 1) {
            C13479a.m54764b(TTPlayer.TAG, "video is playing return");
        } else if (this.f20258e == null) {
            this.f20261i = true;
        } else {
            this.f20254a.play();
        }
    }

    /* renamed from: a */
    public void mo29305a(AbstractC5176a.AbstractC5177a aVar) {
        this.f20255b = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29299b(String str) {
        this.f20263k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.e$a */
    public class C7504a implements VideoEngineListener {
        /* renamed from: a */
        private int m30052a(int i) {
            if (i != 0) {
                if (i == 1) {
                    return 4;
                }
                if (i == 2) {
                    return 2;
                }
                if (i != 3) {
                    return 1;
                }
            }
            return 5;
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        }

        C7504a() {
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onCompletion(TTVideoEngine tTVideoEngine) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onVideoStatusException, onCompletion ");
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepare(TTVideoEngine tTVideoEngine) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onPrepare start load video");
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPrepared(TTVideoEngine tTVideoEngine) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onPrepared load video finished");
            if (C7501e.this.f20255b != null) {
                C7501e.this.f20255b.mo20657a(3);
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onRenderStart(TTVideoEngine tTVideoEngine) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onRenderStart auto play");
            if (C7501e.this.f20255b != null) {
                C7501e.this.f20255b.mo20656a();
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoStatusException(int i) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onVideoStatusException, status = " + i);
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onError(Error error) {
            C13479a.m54758a(TTPlayer.TAG, "ttvideo engine onError, error = " + error);
            if (C7501e.this.f20255b != null) {
                C7501e.this.f20255b.mo20659a(error.toString());
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            C13479a.m54764b(TTPlayer.TAG, "ttvideo engine onPlaybackStateChanged, state = " + i);
            if (C7501e.this.f20255b != null) {
                C7501e.this.f20255b.mo20657a(m30052a(i));
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineListener
        public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
            C13479a.m54764b(TTPlayer.TAG, "onVideoSizeChanged, width = " + i + ", height = " + i2);
            if (C7501e.this.f20255b != null) {
                C7501e.this.f20255b.mo20658a(i, i2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29291a(int i) {
        this.f20254a.setStartTime(i);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29295a(AbstractC7495a aVar) {
        this.f20256c = aVar;
        mo29305a(new AbstractC5176a.AbstractC5177a() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.C7501e.C75032 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m30044b() {
                if (C7501e.this.f20256c != null) {
                    C7501e.this.f20256c.mo28323c();
                }
            }

            @Override // com.bytedance.ee.bear.contract.p284h.AbstractC5176a.AbstractC5177a
            /* renamed from: a */
            public void mo20656a() {
                C13479a.m54764b(TTPlayer.TAG, "ttPlayer auto play time cause :  " + (SystemClock.elapsedRealtime() - C7501e.this.f20260g));
                C13742g.m55705a(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$e$2$hO4_LLWsB4obodErdgmut54Oo8 */

                    public final void run() {
                        C7501e.C75032.this.m30044b();
                    }
                });
            }

            @Override // com.bytedance.ee.bear.contract.p284h.AbstractC5176a.AbstractC5177a
            /* renamed from: a */
            public void mo20657a(int i) {
                C13742g.m55705a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$e$2$dqb8ZusOZUNGtW2cLpAzq_AGGEo */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7501e.C75032.this.m30045b((C7501e.C75032) this.f$1);
                    }
                });
            }

            @Override // com.bytedance.ee.bear.contract.p284h.AbstractC5176a.AbstractC5177a
            /* renamed from: a */
            public void mo20659a(String str) {
                C13479a.m54764b(TTPlayer.TAG, "ttPlayer onPlayerError");
                C13742g.m55705a(new Runnable(str) {
                    /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$e$2$w59ob4tgYfKZui4EEai2xSGka7E */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7501e.C75032.this.m30047b((C7501e.C75032) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m30045b(int i) {
                if (C7501e.this.f20256c != null) {
                    C13479a.m54764b(TTPlayer.TAG, "onPlaybackStateChanged, video view state = " + i);
                    C7501e.this.f20256c.mo28315a(i);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m30047b(String str) {
                if (C7501e.this.f20256c != null) {
                    C7501e.this.f20256c.mo28318a(new Exception(str));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m30046b(int i, int i2) {
                if (C7501e.this.f20256c != null) {
                    C7501e.this.f20256c.mo28316a(i, i2);
                }
            }

            @Override // com.bytedance.ee.bear.contract.p284h.AbstractC5176a.AbstractC5177a
            /* renamed from: a */
            public void mo20658a(int i, int i2) {
                C13479a.m54764b(TTPlayer.TAG, "ttPlayer onVideoSizeChanged width = " + i + " height = " + i2);
                C13742g.m55705a(new Runnable(i, i2) {
                    /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$e$2$qbVPStwqBUyLooQmTa0a8D3Q1HA */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7501e.C75032.this.m30046b(this.f$1, this.f$2);
                    }
                });
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29294a(TextureView textureView) {
        if (textureView == null) {
            C13479a.m54758a(TTPlayer.TAG, "textureView == null");
            return;
        }
        this.f20257d = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.C7501e.TextureView$SurfaceTextureListenerC75021 */

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C13479a.m54764b(TTPlayer.TAG, "onSurfaceTextureDestroyed");
                if (C7501e.this.f20259f == null) {
                    return true;
                }
                return false;
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C13479a.m54764b(TTPlayer.TAG, "onSurfaceTextureAvailable");
                if (C7501e.this.f20259f == null) {
                    C7501e.this.f20259f = surfaceTexture;
                    C7501e.this.f20258e = new Surface(C7501e.this.f20259f);
                    C7501e.this.f20254a.setSurface(C7501e.this.f20258e);
                    C7501e.this.mo29289a();
                    return;
                }
                C7501e.this.f20257d.setSurfaceTexture(C7501e.this.f20259f);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29298b(AbstractC7495a aVar) {
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer removeEventListener");
        if (this.f20256c == aVar) {
            this.f20255b = null;
            this.f20256c = null;
        }
    }

    /* renamed from: a */
    private void m30022a(Context context) {
        try {
            m30025i();
            if (this.f20264l) {
                C13479a.m54764b(TTPlayer.TAG, "TTVideoLog has open");
                TTVideoEngineLog.turnOn(1, 1);
            }
            TTVideoEngine tTVideoEngine = new TTVideoEngine(context, 0);
            this.f20254a = tTVideoEngine;
            tTVideoEngine.setListener(new C7504a());
            this.f20254a.setVideoEngineInfoListener($$Lambda$e$dnOhZ0ZeKkJA0_B87TxsiPP098.INSTANCE);
            this.f20254a.setIntOption(6, 1);
            this.f20254a.setIntOption(160, 1);
            this.f20254a.setIntOption(161, (int) this.f20266n);
            VideoEventManager.instance.setListener(f20253q);
            C13479a.m54764b(TTPlayer.TAG, "isSystemPlayer=" + this.f20254a.isSystemPlayer());
        } catch (Exception e) {
            C13479a.m54761a(TTPlayer.TAG, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30023a(VideoEngineInfos videoEngineInfos) {
        if (videoEngineInfos == null) {
            C13479a.m54758a(TTPlayer.TAG, "onVideoEngineInfos is null");
        } else if (videoEngineInfos.getKey().equals("mdlhitcachesize")) {
            String usingMDLPlayTaskKey = videoEngineInfos.getUsingMDLPlayTaskKey();
            long usingMDLHitCacheSize = videoEngineInfos.getUsingMDLHitCacheSize();
            C13479a.m54764b(TTPlayer.TAG, "usingKey " + usingMDLPlayTaskKey + " hitCacheSize " + usingMDLHitCacheSize);
        } else {
            C13479a.m54772d(TTPlayer.TAG, "videoEngineInfos.getKey()=" + videoEngineInfos.getKey());
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29290a(float f) {
        boolean z;
        C13479a.m54764b(TTPlayer.TAG, "ttPlayer setVolume volume=" + f);
        if (((double) f) < 0.01d) {
            z = true;
        } else {
            z = false;
        }
        this.f20254a.setIsMute(z);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29292a(long j) {
        int i = 2000;
        if (this.f20254a.getDuration() / 10 < 2000) {
            i = this.f20254a.getDuration() / 10;
        }
        long j2 = (long) i;
        if (((long) this.f20254a.getDuration()) - j < j2) {
            C13479a.m54764b(TTPlayer.TAG, "seek to end return gap = " + i);
            j -= j2;
        }
        if (this.f20254a.getPlaybackState() == 0) {
            C13479a.m54764b(TTPlayer.TAG, "seek to current status is stop, start play");
            mo29291a((int) j);
            mo29289a();
            return;
        }
        C13479a.m54764b(TTPlayer.TAG, "seek to ... ");
        this.f20254a.seekTo((int) j, null);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29293a(Uri uri) {
        boolean z;
        String uri2 = uri.toString();
        C13479a.m54764b(TTPlayer.TAG, "prepare uri = " + C13598b.m55197d(uri2) + ", mCacheKey = " + this.f20263k);
        if (TextUtils.isEmpty(uri2) || !uri2.contains("api/box/stream/sdk")) {
            z = false;
        } else {
            z = true;
        }
        if (z || uri2.startsWith("file") || TextUtils.isEmpty(this.f20263k)) {
            this.f20254a.setDirectURL(uri2);
        } else {
            this.f20254a.setDirectUrlUseDataLoader(uri2, this.f20263k);
        }
        TTVideoEngine tTVideoEngine = this.f20254a;
        tTVideoEngine.setCustomHeader("Cookie", "bear-session=" + this.f20262j);
        this.f20254a.setCustomHeader("doc-device-id", C4511g.m18594d().mo17369s());
        NetService netService = this.f20267o;
        if (netService != null && netService.mo20121b() == 3) {
            C13479a.m54764b(TTPlayer.TAG, "isPreRelease, add prerelease env header");
            this.f20254a.setCustomHeader("env", "Pre_release");
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29296a(String str) {
        this.f20262j = str;
    }

    C7501e(Context context, boolean z) {
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        this.f20265m = aVar;
        this.f20268p = z;
        this.f20264l = ((Boolean) aVar.mo34038b("tt_video_log_enable", Boolean.FALSE)).booleanValue();
        m30022a(context.getApplicationContext());
    }
}
