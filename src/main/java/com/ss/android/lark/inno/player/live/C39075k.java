package com.ss.android.lark.inno.player.live;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.network.C38932b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.videoarch.liveplayer.AbstractC65610b;
import com.ss.videoarch.liveplayer.C65638g;
import com.ss.videoarch.liveplayer.p3251b.C65613c;

/* renamed from: com.ss.android.lark.inno.player.live.k */
public class C39075k extends AbstractC39065c implements AbstractC39068f {

    /* renamed from: d */
    private static String f100320d = "lark_vc_live";

    /* renamed from: b */
    public AbstractC65610b f100321b;

    /* renamed from: c */
    private Context f100322c;

    /* renamed from: e */
    private C39066d f100323e = new C39066d(this);

    /* renamed from: f */
    private String f100324f;

    /* renamed from: g */
    private boolean f100325g;

    /* renamed from: h */
    private boolean f100326h;

    /* renamed from: d */
    public void mo142911d() {
        mo142894b();
    }

    /* renamed from: f */
    public boolean mo142913f() {
        return this.f100325g;
    }

    /* renamed from: g */
    public boolean mo142914g() {
        return this.f100321b.mo229565d();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39068f
    public void aI_() {
        this.f100321b.mo229562b();
        this.f100323e.mo142856g();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39068f
    /* renamed from: b */
    public void mo142894b() {
        this.f100321b.mo229556a();
        this.f100307a = LivePlayerStatus.Preparing;
        this.f100323e.mo142855f();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39068f
    /* renamed from: c */
    public void mo142895c() {
        if (!TextUtils.isEmpty(this.f100324f)) {
            mo142910c(this.f100324f);
        }
    }

    /* renamed from: e */
    public void mo142912e() {
        this.f100321b.mo229564c();
        this.f100323e.mo142857h();
        this.f100323e.mo142865a();
    }

    /* renamed from: a */
    public void mo142906a(AbstractC39070h hVar) {
        this.f100323e.mo142868a(hVar);
    }

    /* renamed from: a */
    public void mo142907a(boolean z) {
        this.f100321b.mo229559a(Boolean.valueOf(z));
        this.f100325g = z;
    }

    /* renamed from: a */
    public void mo142905a(FrameLayout frameLayout) {
        View a = m154292a(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(a, 0, layoutParams);
    }

    /* renamed from: b */
    public void mo142909b(String str) {
        this.f100321b.mo229561a(new C65613c[]{new C65613c(str, null, "{\"VCodec\":\"h264\"}")});
    }

    /* renamed from: c */
    public void mo142910c(String str) {
        this.f100324f = str;
        this.f100321b.mo229560a(str);
        this.f100323e.mo142852d(str);
    }

    /* renamed from: a */
    private View m154292a(Context context) {
        if (this.f100326h) {
            SurfaceView surfaceView = new SurfaceView(context);
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
                /* class com.ss.android.lark.inno.player.live.C39075k.SurfaceHolder$CallbackC390761 */

                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    C45855f.m181663b("VcLivePlayer", "surfaceDestroyed");
                }

                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    C45855f.m181663b("VcLivePlayer", "surfaceCreated");
                    C39075k.this.f100321b.mo229558a(surfaceHolder);
                }

                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    C45855f.m181663b("VcLivePlayer", "surfaceChanged width " + i2 + " height " + i3);
                    C39075k.this.f100321b.mo229558a(surfaceHolder);
                }
            });
            return surfaceView;
        }
        TextureView textureView = new TextureView(this.f100322c);
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.lark.inno.player.live.C39075k.TextureView$SurfaceTextureListenerC390772 */

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C39075k.this.f100321b.mo229557a(new Surface(surfaceTexture));
            }
        });
        return textureView;
    }

    public C39075k(Context context) {
        this.f100322c = context;
        this.f100321b = C65638g.m257283a(context.getApplicationContext()).mo229693a(f100320d).mo229696b(300000).mo229692a(new C38932b()).mo229694a(false).mo229697b(false).mo229698c(true).mo229690a(1).mo229691a(this.f100323e).mo229695a();
    }

    /* renamed from: a */
    public boolean mo142908a(String str) {
        boolean b = this.f100321b.mo229563b(str);
        this.f100323e.mo142854e(str);
        return b;
    }
}
