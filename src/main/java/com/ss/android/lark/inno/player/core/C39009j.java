package com.ss.android.lark.inno.player.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.p1974b.p1975a.C38944a;
import com.ss.android.lark.inno.player.p1978c.AbstractC38953b;
import com.ss.android.lark.inno.player.p1978c.AbstractC38995d;
import com.ss.android.lark.inno.player.p1978c.C38950a;
import com.ss.android.lark.inno.player.p1978c.C38991c;
import com.ss.android.lark.inno.player.p1978c.p1979a.C38951a;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.SeekCompletionListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfoListener;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.player.core.j */
public class C39009j extends AbstractC38953b {

    /* renamed from: a */
    public TTVideoEngine f100193a;

    /* renamed from: b */
    private Context f100194b;

    /* renamed from: c */
    private C38944a f100195c;

    /* renamed from: d */
    private C38991c f100196d;

    /* renamed from: e */
    private C38950a f100197e;

    /* renamed from: f */
    private VcVideoPlayerStatus f100198f = VcVideoPlayerStatus.NONE;

    /* renamed from: g */
    private PlaybackParams f100199g;

    /* renamed from: h */
    private boolean f100200h;

    /* renamed from: i */
    private VideoEngineInfoListener f100201i = new VideoEngineInfoListener() {
        /* class com.ss.android.lark.inno.player.core.C39009j.C390101 */

        @Override // com.ss.ttvideoengine.VideoEngineInfoListener
        public void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
            if (videoEngineInfos != null) {
                C45855f.m181663b("VcVideoPlayer", "onVideoEngineInfos " + videoEngineInfos.getKey());
                if (videoEngineInfos.getKey().equals("mdlhitcachesize")) {
                    String usingMDLPlayTaskKey = videoEngineInfos.getUsingMDLPlayTaskKey();
                    long usingMDLHitCacheSize = videoEngineInfos.getUsingMDLHitCacheSize();
                    C45855f.m181663b("VcVideoPlayer", "onVideoEngineInfos usingKey: " + usingMDLPlayTaskKey + " hitCacheSize: " + usingMDLHitCacheSize);
                }
            }
        }
    };

    /* renamed from: c */
    public void mo142727c() {
        this.f100193a.stop();
    }

    /* renamed from: e */
    public void mo142729e() {
        this.f100193a.pause();
    }

    /* renamed from: f */
    public boolean mo142730f() {
        return this.f100193a.isMute();
    }

    /* renamed from: k */
    public int mo142735k() {
        return this.f100193a.getDuration();
    }

    /* renamed from: l */
    public int mo142736l() {
        return this.f100193a.getCurrentPlaybackTime();
    }

    /* renamed from: g */
    public boolean mo142731g() {
        if (this.f100193a.getPlaybackState() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo142732h() {
        if (this.f100193a.getPlaybackState() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo142733i() {
        if (this.f100193a.getPlaybackState() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public float mo142734j() {
        PlaybackParams playbackParams = this.f100199g;
        if (playbackParams == null) {
            return 1.0f;
        }
        return playbackParams.getSpeed();
    }

    /* renamed from: m */
    public void mo142737m() {
        this.f100193a.release();
        this.f100196d.mo142575b();
        this.f100196d.mo142672c();
    }

    /* renamed from: a */
    public VcVideoPlayerStatus mo142715a() {
        if (mo142732h()) {
            return VcVideoPlayerStatus.COMPLETE;
        }
        if (mo142733i()) {
            return VcVideoPlayerStatus.ERROR;
        }
        return this.f100198f;
    }

    /* renamed from: b */
    public void mo142724b() {
        C45855f.m181663b("VcVideoPlayer", "start");
        this.f100193a.start();
        mo142720a(VcVideoPlayerStatus.PREPARING);
        C38991c cVar = this.f100196d;
        if (cVar != null) {
            cVar.mo142569a();
        }
    }

    /* renamed from: d */
    public void mo142728d() {
        if (mo142733i() || mo142732h()) {
            mo142720a(VcVideoPlayerStatus.PREPARING);
        }
        this.f100193a.play();
    }

    /* renamed from: a */
    public void mo142720a(VcVideoPlayerStatus vcVideoPlayerStatus) {
        this.f100198f = vcVideoPlayerStatus;
    }

    /* renamed from: a */
    public void mo142717a(int i) {
        this.f100193a.setStartTime(i);
    }

    /* renamed from: b */
    public void mo142726b(AbstractC38995d dVar) {
        this.f100196d.mo142671b(dVar);
    }

    /* renamed from: a */
    public void mo142719a(AbstractC38995d dVar) {
        this.f100196d.mo142670a(dVar);
    }

    /* renamed from: b */
    public void mo142725b(int i) {
        this.f100193a.seekTo(i, new SeekCompletionListener() {
            /* class com.ss.android.lark.inno.player.core.C39009j.C390145 */

            @Override // com.ss.ttvideoengine.SeekCompletionListener
            public void onCompletion(boolean z) {
            }
        });
    }

    public C39009j(Context context) {
        this.f100194b = context.getApplicationContext();
        m153969a(context);
    }

    /* renamed from: b */
    private View m153970b(Context context) {
        if (this.f100200h) {
            SurfaceView surfaceView = new SurfaceView(context);
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
                /* class com.ss.android.lark.inno.player.core.C39009j.SurfaceHolder$CallbackC390123 */

                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    C45855f.m181663b("VcVideoPlayer", "surfaceDestroyed");
                }

                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    C45855f.m181663b("VcVideoPlayer", "surfaceCreated");
                    C39009j.this.f100193a.setSurfaceHolder(surfaceHolder);
                }

                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    C45855f.m181663b("VcVideoPlayer", "surfaceChanged width " + i2 + " height " + i3);
                    C39009j.this.f100193a.setSurfaceHolder(surfaceHolder);
                }
            });
            return surfaceView;
        }
        TextureView textureView = new TextureView(this.f100194b);
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.lark.inno.player.core.C39009j.TextureView$SurfaceTextureListenerC390134 */

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C39009j.this.f100193a.setSurface(new Surface(surfaceTexture));
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C39009j.this.f100193a.setSurface(new Surface(surfaceTexture));
            }
        });
        return textureView;
    }

    /* renamed from: a */
    public void mo142716a(float f) {
        if (this.f100199g == null) {
            this.f100199g = new PlaybackParams();
        }
        this.f100199g.setSpeed(f);
        this.f100193a.setPlaybackParams(this.f100199g);
    }

    /* renamed from: a */
    private void m153969a(Context context) {
        if (C45850b.m181645a()) {
            TTVideoEngineLog.turnOn(1, 1);
        }
        C38951a.m153689a();
        TTVideoEngine tTVideoEngine = new TTVideoEngine(context.getApplicationContext(), 0);
        this.f100193a = tTVideoEngine;
        tTVideoEngine.setIntOption(4, 0);
        this.f100193a.setIntOption(6, 1);
        this.f100193a.setIntOption(160, 1);
        this.f100193a.setIntOption(21, 1);
        this.f100193a.setIntOption(SmEvents.EVENT_HBRESET, 1);
        this.f100193a.setVideoEngineInfoListener(this.f100201i);
        this.f100196d = new C38991c(this);
        C390112 r4 = new C38950a() {
            /* class com.ss.android.lark.inno.player.core.C39009j.C390112 */

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: a */
            public void mo142573a(TTVideoEngine tTVideoEngine, int i, int i2) {
            }
        };
        this.f100197e = r4;
        mo142719a(r4);
        this.f100193a.setVideoEngineSimpleCallback(this.f100196d);
    }

    /* renamed from: a */
    public void mo142718a(FrameLayout frameLayout) {
        View b = m153970b(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(b, 0, layoutParams);
        C38944a aVar = new C38944a();
        this.f100195c = aVar;
        aVar.mo142542a(frameLayout);
        this.f100195c.mo142541a(b);
        this.f100195c.mo142540a(3);
    }

    /* renamed from: a */
    public void mo142721a(String str) {
        C45855f.m181664c("VcVideoPlayer", "setVideoUrl " + str + " " + str.hashCode());
        TTVideoEngine tTVideoEngine = this.f100193a;
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append("");
        tTVideoEngine.setDirectUrlUseDataLoader(str, sb.toString());
        for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
            this.f100193a.setCustomHeader(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void mo142723a(boolean z) {
        this.f100193a.setIsMute(z);
    }

    /* renamed from: a */
    public void mo142722a(String str, String str2) {
        this.f100193a.setCustomHeader(str, str2);
    }
}
