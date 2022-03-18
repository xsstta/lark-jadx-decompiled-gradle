package com.ss.android.lark.player.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.p2511a.AbstractC52087i;
import com.ss.android.lark.player.p2511a.AbstractC52091j;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractC52094m;
import com.ss.android.lark.player.p2513c.AbstractC52102a;
import com.ss.android.lark.player.p2513c.AbstractC52110k;
import com.ss.android.lark.player.p2513c.AbstractC52111l;
import com.ss.android.lark.player.p2513c.C52120q;
import com.ss.android.lark.player.widget.RenderSurfaceView;
import com.ss.ttvideoengine.DataSource;
import com.ss.ttvideoengine.VideoEngineInfoListener;

public class VideoView extends FrameLayout implements AbstractC52102a.AbstractC52103a {

    /* renamed from: a */
    public C52120q f129365a;

    /* renamed from: b */
    public SuperContainer f129366b;

    /* renamed from: c */
    public RenderSurfaceView f129367c;

    /* renamed from: d */
    public int f129368d;

    /* renamed from: e */
    public int f129369e;

    /* renamed from: f */
    public boolean f129370f;

    /* renamed from: g */
    public RenderSurfaceView.AbstractC52132b f129371g;

    /* renamed from: h */
    RenderSurfaceView.AbstractC52131a f129372h;

    /* renamed from: i */
    public AbstractC52111l f129373i;

    /* renamed from: j */
    public AbstractC52110k f129374j;

    /* renamed from: k */
    public AbstractC52092k f129375k;

    /* renamed from: l */
    private int f129376l;

    /* renamed from: m */
    private int f129377m;

    /* renamed from: n */
    private int f129378n;

    /* renamed from: o */
    private AbstractC52094m f129379o;

    /* renamed from: p */
    private AbstractC52111l f129380p;

    /* renamed from: q */
    private AbstractC52110k f129381q;

    /* renamed from: r */
    private AudioManager.OnAudioFocusChangeListener f129382r;

    /* renamed from: s */
    private AbstractC52091j f129383s;

    public AbstractC52110k getOnErrorEventListener() {
        return this.f129374j;
    }

    public AbstractC52111l getOnPlayerEventListener() {
        return this.f129373i;
    }

    public final SuperContainer getSuperContainer() {
        return this.f129366b;
    }

    /* renamed from: c */
    public void mo178602c() {
        this.f129365a.mo178533a();
    }

    /* renamed from: d */
    public void mo178603d() {
        this.f129365a.mo178502f();
    }

    /* renamed from: e */
    public void mo178604e() {
        this.f129365a.mo178503g();
    }

    public int getBufferPercentage() {
        return this.f129365a.mo178542l();
    }

    public int getCurrentPosition() {
        return this.f129365a.mo178500d();
    }

    public int getDuration() {
        return this.f129365a.mo178501e();
    }

    public int getState() {
        return this.f129365a.mo178539b();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m202269k() {
        onVideoSizeChanged((float) this.f129368d, (float) this.f129369e);
    }

    /* renamed from: b */
    public boolean mo178601b() {
        return this.f129365a.mo178499c();
    }

    /* renamed from: f */
    public void mo178605f() {
        this.f129365a.mo178504h();
        m202268j();
    }

    /* renamed from: h */
    private void m202266h() {
        this.f129365a.mo178489a((Surface) null);
        this.f129371g = null;
        RenderSurfaceView renderSurfaceView = new RenderSurfaceView(getContext());
        this.f129367c = renderSurfaceView;
        renderSurfaceView.setRenderCallback(this.f129372h);
        this.f129366b.setRenderView(this.f129367c);
    }

    /* renamed from: i */
    private void m202267i() {
        Log.m165389i("VideoView", ">>requestAudioFocus<<");
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f129382r, 3, 2);
        }
    }

    /* renamed from: j */
    private void m202268j() {
        Log.m165389i("VideoView", "<<releaseAudioFocus>>");
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f129382r);
        }
    }

    /* renamed from: g */
    public void mo178606g() {
        Log.m165389i("VideoView", "stopPlayback release.");
        m202268j();
        this.f129365a.mo178505i();
        this.f129371g = null;
        this.f129366b.mo178585a();
    }

    /* renamed from: a */
    public boolean mo178599a() {
        int state = getState();
        if (state == -2 || state == -1 || state == 0 || state == 1 || state == 5) {
            return false;
        }
        return true;
    }

    public void setOnErrorEventListener(AbstractC52110k kVar) {
        this.f129374j = kVar;
    }

    public void setOnPlayerEventListener(AbstractC52111l lVar) {
        this.f129373i = lVar;
    }

    public VideoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo178596a(int i) {
        this.f129365a.mo178534a(i);
    }

    /* renamed from: b */
    public void mo178600b(int i) {
        this.f129365a.mo178498c(i);
    }

    public void setDataSource(DataSource dataSource) {
        this.f129365a.mo178492a(dataSource);
    }

    public void setMute(boolean z) {
        this.f129365a.mo178495a(z);
    }

    public void setReceiverGroup(AbstractC52087i iVar) {
        this.f129366b.setReceiverGroup(iVar);
    }

    public void setSpeed(float f) {
        this.f129365a.mo178488a(f);
    }

    public void setVideoEngineInfoListener(VideoEngineInfoListener videoEngineInfoListener) {
        C52120q qVar = this.f129365a;
        if (qVar != null) {
            qVar.mo178493a(videoEngineInfoListener);
        }
    }

    public void setVideoID(String str) {
        this.f129365a.mo178494a(str);
    }

    /* renamed from: a */
    public void mo178597a(RenderSurfaceView.AbstractC52132b bVar) {
        if (bVar != null) {
            bVar.mo178581a(this.f129365a);
        }
    }

    public void setDataSource(com.ss.android.lark.player.entity.DataSource dataSource) {
        m202267i();
        m202266h();
        this.f129365a.mo178491a(dataSource);
    }

    /* renamed from: a */
    public void mo178598a(boolean z) {
        this.f129365a.mo178497b(z);
    }

    /* renamed from: a */
    private void m202265a(Context context) {
        C52120q qVar = new C52120q(context);
        this.f129365a = qVar;
        qVar.mo178538a(this.f129380p);
        this.f129365a.mo178537a(this.f129381q);
        this.f129365a.mo178536a(this);
        SuperContainer superContainer = new SuperContainer(context);
        this.f129366b = superContainer;
        superContainer.setStateGetter(this.f129379o);
        this.f129366b.setOnReceiverEventListener(this.f129383s);
        addView(this.f129366b, new ViewGroup.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f129376l != configuration.orientation || this.f129377m != configuration.screenWidthDp || this.f129378n != configuration.screenHeightDp) {
            this.f129376l = configuration.orientation;
            this.f129377m = configuration.screenWidthDp;
            this.f129378n = configuration.screenHeightDp;
            post(new Runnable() {
                /* class com.ss.android.lark.player.widget.$$Lambda$VideoView$B70VL9wOGYOr3XX2_HbRy_DGD6E */

                public final void run() {
                    VideoView.this.m202269k();
                }
            });
        }
    }

    /* renamed from: a */
    private void m202264a(float f) {
        C52120q qVar;
        if (this.f129367c != null && (qVar = this.f129365a) != null) {
            if (qVar.mo178506j() || this.f129365a.mo178507k()) {
                int width = getWidth();
                int height = getHeight();
                if (width != 0 && height != 0 && f != BitmapDescriptorFactory.HUE_RED) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f129367c.getLayoutParams();
                    if (f > ((float) height) / ((float) width)) {
                        layoutParams.height = height;
                        layoutParams.width = (int) (((float) layoutParams.height) / f);
                    } else {
                        layoutParams.width = width;
                        layoutParams.height = (int) (((float) layoutParams.width) * f);
                    }
                    this.f129367c.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52102a.AbstractC52103a
    public void onVideoSizeChanged(float f, float f2) {
        if (f != BitmapDescriptorFactory.HUE_RED && f2 != BitmapDescriptorFactory.HUE_RED) {
            m202264a(f2 / f);
        }
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f129376l = Integer.MAX_VALUE;
        this.f129377m = Integer.MAX_VALUE;
        this.f129378n = Integer.MAX_VALUE;
        this.f129372h = new RenderSurfaceView.AbstractC52131a() {
            /* class com.ss.android.lark.player.widget.VideoView.C521401 */

            @Override // com.ss.android.lark.player.widget.RenderSurfaceView.AbstractC52131a
            /* renamed from: a */
            public void mo178580a(RenderSurfaceView.AbstractC52132b bVar, int i, int i2, int i3) {
            }

            @Override // com.ss.android.lark.player.widget.RenderSurfaceView.AbstractC52131a
            /* renamed from: a */
            public void mo178578a(RenderSurfaceView.AbstractC52132b bVar) {
                VideoView.this.f129371g = null;
            }

            @Override // com.ss.android.lark.player.widget.RenderSurfaceView.AbstractC52131a
            /* renamed from: a */
            public void mo178579a(RenderSurfaceView.AbstractC52132b bVar, int i, int i2) {
                VideoView.this.f129371g = bVar;
                VideoView.this.mo178597a(bVar);
            }
        };
        this.f129375k = new AbstractC52092k() {
            /* class com.ss.android.lark.player.widget.VideoView.C521412 */

            @Override // com.ss.android.lark.player.p2511a.AbstractC52092k
            /* renamed from: c */
            public boolean mo178467c() {
                return VideoView.this.f129370f;
            }

            @Override // com.ss.android.lark.player.p2511a.AbstractC52092k
            /* renamed from: a */
            public int mo178465a() {
                return VideoView.this.f129365a.mo178539b();
            }

            @Override // com.ss.android.lark.player.p2511a.AbstractC52092k
            /* renamed from: b */
            public int mo178466b() {
                return VideoView.this.f129365a.mo178500d();
            }
        };
        this.f129379o = new AbstractC52094m() {
            /* class com.ss.android.lark.player.widget.VideoView.C521423 */

            @Override // com.ss.android.lark.player.p2511a.AbstractC52094m
            /* renamed from: j */
            public AbstractC52092k mo178441j() {
                return VideoView.this.f129375k;
            }
        };
        this.f129380p = new AbstractC52111l() {
            /* class com.ss.android.lark.player.widget.VideoView.C521434 */

            @Override // com.ss.android.lark.player.p2513c.AbstractC52111l
            /* renamed from: a */
            public void mo140068a(int i, Bundle bundle) {
                switch (i) {
                    case -99018:
                        if (!(bundle == null || VideoView.this.f129367c == null)) {
                            VideoView.this.f129368d = bundle.getInt("int_arg1");
                            VideoView.this.f129369e = bundle.getInt("int_arg2");
                        }
                        VideoView videoView = VideoView.this;
                        videoView.mo178597a(videoView.f129371g);
                        break;
                    case -99017:
                        if (bundle != null) {
                            VideoView.this.f129368d = bundle.getInt("int_arg1");
                            VideoView.this.f129369e = bundle.getInt("int_arg2");
                            Log.m165389i("VideoView", "onVideoSizeChange : videoWidth = " + VideoView.this.f129368d + ", videoHeight = " + VideoView.this.f129369e);
                            break;
                        }
                        break;
                    case -99011:
                        VideoView.this.f129370f = false;
                        break;
                    case -99010:
                        VideoView.this.f129370f = true;
                        break;
                }
                if (VideoView.this.f129373i != null) {
                    VideoView.this.f129373i.mo140068a(i, bundle);
                }
                VideoView.this.f129366b.mo178588b(i, bundle);
            }
        };
        this.f129381q = new AbstractC52110k() {
            /* class com.ss.android.lark.player.widget.VideoView.C521445 */

            @Override // com.ss.android.lark.player.p2513c.AbstractC52110k
            /* renamed from: a */
            public void mo140067a(int i, Bundle bundle) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("onError : code = ");
                sb.append(i);
                sb.append(", Message = ");
                if (bundle == null) {
                    str = "no message";
                } else {
                    str = bundle.toString();
                }
                sb.append(str);
                Log.m165383e("VideoView", sb.toString());
                if (VideoView.this.f129374j != null) {
                    VideoView.this.f129374j.mo140067a(i, bundle);
                }
                VideoView.this.f129366b.mo178586a(i, bundle);
            }
        };
        this.f129382r = new AudioManager.OnAudioFocusChangeListener() {
            /* class com.ss.android.lark.player.widget.VideoView.C521456 */

            public void onAudioFocusChange(int i) {
                if (i == -1) {
                    VideoView.this.mo178603d();
                }
            }
        };
        this.f129383s = new AbstractC52091j() {
            /* class com.ss.android.lark.player.widget.VideoView.C521467 */

            @Override // com.ss.android.lark.player.p2511a.AbstractC52091j
            /* renamed from: a */
            public void mo178464a(int i, Bundle bundle) {
                int i2 = 0;
                switch (i) {
                    case -660011:
                        if (bundle != null) {
                            i2 = bundle.getInt("int_data");
                        }
                        VideoView.this.mo178596a(i2);
                        return;
                    case -66016:
                        VideoView.this.f129365a.mo178541c(false);
                        return;
                    case -66015:
                        VideoView.this.f129365a.mo178541c(true);
                        return;
                    case -66013:
                        VideoView.this.mo178596a(0);
                        return;
                    case -66009:
                        VideoView.this.mo178605f();
                        return;
                    case -66007:
                        VideoView.this.mo178605f();
                        return;
                    case -66005:
                        if (bundle != null) {
                            i2 = bundle.getInt("int_data");
                        }
                        VideoView.this.f129365a.mo178498c(i2);
                        return;
                    case -66003:
                        if (VideoView.this.mo178599a()) {
                            VideoView.this.mo178604e();
                            return;
                        } else {
                            VideoView.this.mo178596a(0);
                            return;
                        }
                    case -66001:
                        if (VideoView.this.mo178599a()) {
                            VideoView.this.mo178603d();
                            return;
                        } else {
                            VideoView.this.mo178605f();
                            return;
                        }
                    default:
                        return;
                }
            }
        };
        m202265a(context);
    }
}
