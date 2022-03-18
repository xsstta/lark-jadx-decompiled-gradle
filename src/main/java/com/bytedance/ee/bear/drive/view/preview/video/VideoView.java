package com.bytedance.ee.bear.drive.view.preview.video;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.block.IBlockClickInterceptor;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.C7497c;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.C7501e;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13726a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

public class VideoView extends FrameLayout implements IBlockClickInterceptor, AbstractC7494a, AbstractC7495a {

    /* renamed from: a */
    private FrameLayout f20208a;

    /* renamed from: b */
    protected int f20209b;

    /* renamed from: c */
    protected TextureView f20210c;

    /* renamed from: d */
    protected VideoPlayerControllerView f20211d;

    /* renamed from: e */
    protected String f20212e;

    /* renamed from: f */
    public int f20213f;

    /* renamed from: g */
    public int f20214g;

    /* renamed from: h */
    public int f20215h = 1;

    /* renamed from: i */
    protected AbstractC7496b f20216i;

    /* renamed from: j */
    protected String f20217j = "";

    /* renamed from: k */
    protected String f20218k = "";

    /* renamed from: l */
    protected C7493b f20219l;

    /* renamed from: m */
    protected C7555f f20220m;

    /* renamed from: n */
    protected ViewOwner f20221n;

    /* renamed from: o */
    private VideoPlayerContentView f20222o;

    /* renamed from: p */
    private int f20223p;

    /* renamed from: q */
    private int f20224q;

    /* renamed from: r */
    private int f20225r;

    /* renamed from: s */
    private int f20226s;

    /* renamed from: t */
    private C68289a f20227t = new C68289a();

    /* renamed from: u */
    private C10917c f20228u;

    /* renamed from: v */
    private boolean f20229v = false;

    /* renamed from: w */
    private AbstractC7492a f20230w;

    /* renamed from: x */
    private DriveMediaVM f20231x;

    /* renamed from: y */
    private DriveBlockPreviewVM f20232y;

    /* renamed from: z */
    private boolean f20233z;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.VideoView$a */
    public interface AbstractC7492a {
        void onReport(boolean z, Throwable th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29202b(C7493b bVar) {
    }

    public int getCurrentPlayMode() {
        return this.f20209b;
    }

    /* renamed from: a */
    public void mo29255a(boolean z) {
        C13479a.m54775e("DRIVE_VideoPlayer", "handleMessage: MSG_PREVIEW_PAUSE");
        if (!z) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.RunnableC74872 */

                public void run() {
                    if (VideoView.this.f20211d != null) {
                        C13479a.m54764b("DRIVE_VideoPlayer", "no permission, stop play video");
                        VideoView.this.f20211d.setPlayState(false);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo29200a(C7493b bVar) {
        C13479a.m54763b("init video data");
        this.f20219l = bVar;
        this.f20211d.setFileModel(bVar.f20244e);
        this.f20216i = C7497c.m30001a(getContext(), this.f20231x.isAutoPlay());
        mo29252a(this.f20210c);
        this.f20216i.mo29296a(bVar.f20241b);
        this.f20216i.mo29299b(bVar.f20242c);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28318a(Exception exc) {
        C13479a.m54759a("DRIVE_VideoPlayer", "VideoView.onPlayerError(). hasRenderStart: " + this.f20229v, exc);
        if (this.f20229v) {
            this.f20216i.mo29301d();
        } else {
            C7555f fVar = this.f20220m;
            if (fVar != null) {
                fVar.getLiveInnerShowPreviewFailedPage().mo5926a((Void) null);
            }
        }
        post(new Runnable(exc) {
            /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$pb9yyyLdkDL2IdPQee0E2uSwWo */
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VideoView.m269494lambda$pb9yyyLdkDL2IdPQee0E2uSwWo(VideoView.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo29254a(VideoPlayerControllerView videoPlayerControllerView) {
        C13479a.m54764b("DRIVE_VideoPlayer", "addControllerView... ");
        this.f20208a.removeView(this.f20211d);
        this.f20211d = videoPlayerControllerView;
        videoPlayerControllerView.mo29217c();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f20211d.setVisibility(8);
        this.f20208a.addView(this.f20211d, layoutParams);
        this.f20211d.setUpdateProgressBarListener(mo29204g());
    }

    /* renamed from: a */
    public void mo29253a(VideoPlayerContentView videoPlayerContentView) {
        C13479a.m54764b("DRIVE_VideoPlayer", "addContentView... ");
        this.f20208a.removeView(videoPlayerContentView);
        this.f20222o = videoPlayerContentView;
        videoPlayerContentView.setEmptyViewVisibility(0);
        this.f20210c = videoPlayerContentView.getTextureView();
        this.f20208a.addView(videoPlayerContentView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* renamed from: a */
    public void mo29252a(TextureView textureView) {
        C13479a.m54764b("DRIVE_VideoPlayer", "initPlayer... ");
        this.f20216i.mo29294a(textureView);
        this.f20216i.mo29295a(this);
        this.f20211d.mo29214a(this.f20216i, this);
        ((DriveBlockPreviewVM) this.f20221n.viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5923a(this.f20221n.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$GPS207wcdmfYbp0y1HjSMTuZea4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                VideoView.lambda$GPS207wcdmfYbp0y1HjSMTuZea4(VideoView.this, (DriveBlockPreviewVM.BlockState) obj);
            }
        });
    }

    /* renamed from: g */
    private VideoPlayerControllerView.AbstractC7485a mo29204g() {
        return new VideoPlayerControllerView.AbstractC7485a() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.C74916 */

            @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView.AbstractC7485a
            /* renamed from: b */
            public void mo29250b() {
                VideoView.this.mo29262i();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView.AbstractC7485a
            /* renamed from: a */
            public void mo29249a() {
                VideoView.this.mo29257b(0, 100);
            }
        };
    }

    public int getBarsShowState() {
        return this.f20211d.getBarsShowState();
    }

    /* renamed from: i */
    public void mo29262i() {
        this.f20227t.mo237935a();
    }

    /* renamed from: j */
    public boolean mo29263j() {
        if (this.f20209b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void mo29268o() {
        this.f20211d.mo29220g();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m29948q() {
        AbstractC7492a aVar = this.f20230w;
        if (aVar != null) {
            aVar.onReport(true, null);
        }
    }

    /* renamed from: k */
    public boolean mo29264k() {
        if (this.f20223p * 3 > this.f20224q * 4) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo29265l() {
        if (this.f20224q == 0 || this.f20223p == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void mo29266m() {
        this.f20211d.mo29222h();
        this.f20211d.mo29218d();
    }

    /* renamed from: n */
    public void mo29267n() {
        this.f20211d.mo29224j();
        this.f20211d.mo29220g();
    }

    /* renamed from: f */
    private void mo29203f() {
        if (this.f20215h != 4) {
            C13479a.m54764b("DRIVE_VideoPlayer", "mPlayerState != IPlayer.STATE_PLAYING, return");
        } else {
            mo29257b(0, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m29947p() {
        AbstractC7496b bVar = this.f20216i;
        if (bVar != null && this.f20211d != null && this.f20210c != null) {
            bVar.mo29297b();
            this.f20211d.setSilent(false);
            this.f20210c.requestLayout();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.block.IBlockClickInterceptor
    /* renamed from: d */
    public boolean mo28325d() {
        int barsShowState = getBarsShowState();
        C13479a.m54764b("DRIVE_VideoPlayer", "onClick()...barsShowState=" + barsShowState);
        if (barsShowState == 0) {
            return true;
        }
        mo29266m();
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: c */
    public void mo28323c() {
        C13479a.m54764b("DRIVE_VideoPlayer", "VideoView.onRenderStart(). auto play");
        if (this.f20211d != null && this.f20231x.isAutoPlay()) {
            this.f20211d.setPlayState(true);
        }
        this.f20222o.setEmptyViewVisibility(8);
        this.f20229v = true;
        post(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$NgR7jLA7jUugDtwyhGDLNN6pA */

            public final void run() {
                VideoView.m269493lambda$NgR7jLA7jUugDtwyhGDLNN6pA(VideoView.this);
            }
        });
        if (!this.f20233z && !this.f20231x.isAutoPlay() && this.f20210c != null) {
            this.f20233z = true;
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$42DkXaUL8Atc0qhCR6qCKk8_7M */

                public final void run() {
                    VideoView.m269492lambda$42DkXaUL8Atc0qhCR6qCKk8_7M(VideoView.this);
                }
            });
        }
        Long b = this.f20231x.getResumePosition().mo5927b();
        if (b != null) {
            C13479a.m54764b("DRIVE_VideoPlayer", "onRenderStart() resumePosition=" + b);
            this.f20216i.mo29292a(b.longValue());
            this.f20231x.getResumePosition().mo5929b((Long) null);
        }
    }

    /* renamed from: h */
    public void mo29261h() {
        C7493b bVar = this.f20219l;
        if (bVar == null) {
            C13479a.m54764b("DRIVE_VideoPlayer", "mVideoEntity == null, can not play");
        } else if (mo29201a(bVar.f20244e.mo29483d())) {
            this.f20220m.liveInnerUnsupprtPreview().mo5926a(this.f20219l.f20244e.mo29483d());
            C13479a.m54775e("DRIVE_VideoPlayer", "show() TTPlayer.isSoReady false.");
        } else {
            m29942b(this.f20219l.f20240a);
            mo29202b(this.f20219l);
            if (this.f20231x.isAutoPlay()) {
                mo29199a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C7555f fVar = this.f20220m;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            if (this.f20209b == 1) {
                try {
                    mo29258e();
                } catch (Exception unused) {
                    C13479a.m54758a("DRIVE_VideoPlayer", "onDetachedFromWindow() exitFullScreen");
                }
            }
            super.onDetachedFromWindow();
            mo29262i();
            DriveBlockPreviewVM driveBlockPreviewVM = this.f20232y;
            if (driveBlockPreviewVM != null) {
                driveBlockPreviewVM.removeBlockClickInterceptor(this);
            }
            DriveMediaVM bVar = this.f20231x;
            if (bVar != null) {
                bVar.getPlayPosition().mo5929b(Long.valueOf(this.f20216i.mo29304g()));
            }
            this.f20216i.mo29298b(this);
            this.f20216i.mo29300c();
            return;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "onDetachedFromWindow() isBlockViewChanging");
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.AbstractC7494a
    /* renamed from: b */
    public void mo29256b() {
        boolean z = true;
        if (this.f20209b == 1) {
            C13479a.m54764b("DRIVE_VideoPlayer", "current mode is full screen, exit");
        } else if (this.f20220m == null || !C13726a.m55674a(getContext())) {
            StringBuilder sb = new StringBuilder();
            sb.append("enter full screen failed, mCommunication == null?");
            if (this.f20220m != null) {
                z = false;
            }
            sb.append(z);
            C13479a.m54758a("DRIVE_VideoPlayer", sb.toString());
        } else {
            this.f20220m.liveInnerVideoFullScreen().mo5929b((Boolean) true);
            ViewGroup viewGroup = (ViewGroup) ((Activity) getContext()).findViewById(16908290);
            if (viewGroup == null) {
                C13479a.m54758a("DRIVE_VideoPlayer", "contentView is null");
                return;
            }
            removeView(this.f20208a);
            int height = viewGroup.getHeight();
            int width = viewGroup.getWidth();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(height, width);
            layoutParams.gravity = 17;
            this.f20208a.setRotation(90.0f);
            viewGroup.addView(this.f20208a, layoutParams);
            this.f20209b = 1;
            this.f20211d.mo29213a(1);
            DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) this.f20221n.viewModel(DriveBlockPreviewVM.class);
            viewGroup.post(new Runnable(height, width) {
                /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$2YRhsFQ_yukONJVeEOznYuOZlXU */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    VideoView.lambda$2YRhsFQ_yukONJVeEOznYuOZlXU(VideoView.this, this.f$1, this.f$2);
                }
            });
            C13479a.m54764b("DRIVE_VideoPlayer", "enter full screen");
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.AbstractC7494a
    /* renamed from: e */
    public void mo29258e() {
        if (this.f20209b != 0) {
            boolean z = false;
            if (this.f20220m == null || !C13726a.m55674a(getContext())) {
                StringBuilder sb = new StringBuilder();
                sb.append("exit full screen failed, mCommunication == null?");
                if (this.f20220m == null) {
                    z = true;
                }
                sb.append(z);
                C13479a.m54758a("DRIVE_VideoPlayer", sb.toString());
                return;
            }
            this.f20220m.liveInnerVideoFullScreen().mo5929b((Boolean) false);
            ViewGroup viewGroup = (ViewGroup) ((Activity) getContext()).findViewById(16908290);
            if (viewGroup == null) {
                C13479a.m54758a("DRIVE_VideoPlayer", "contentView is null");
                return;
            }
            viewGroup.removeView(this.f20208a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f20208a.setRotation(BitmapDescriptorFactory.HUE_RED);
            addView(this.f20208a, layoutParams);
            this.f20209b = 0;
            this.f20211d.mo29213a(0);
            VideoPlayerControllerView videoPlayerControllerView = this.f20211d;
            if (videoPlayerControllerView != null) {
                videoPlayerControllerView.mo29223i();
            }
            if (((DriveBlockPreviewVM) this.f20221n.viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5927b() != null) {
                viewGroup.post(new Runnable(viewGroup) {
                    /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoView$03PDhhTfDpuKEFHxXezkYUOn8 */
                    public final /* synthetic */ ViewGroup f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoView.m269491lambda$03PDhhTfDpuKEFHxXezkYUOn8(VideoView.this, this.f$1);
                    }
                });
            }
            C13479a.m54764b("DRIVE_VideoPlayer", "exit full screen");
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.AbstractC7494a
    /* renamed from: a */
    public void mo29199a() {
        C13479a.m54764b("DRIVE_VideoPlayer", "start play video");
        C7555f fVar = this.f20220m;
        if (fVar != null) {
            fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(11));
        }
        int i = this.f20215h;
        if (i != 1 || this.f20212e != null) {
            if (i == 1) {
                C13479a.m54764b("DRIVE_VideoPlayer", "start loading resources");
                m29942b(this.f20212e);
                return;
            }
            C13479a.m54764b("DRIVE_VideoPlayer", "resource is ready, play video");
            this.f20216i.mo29289a();
        }
    }

    public void setCommunication(C7555f fVar) {
        this.f20220m = fVar;
    }

    public void setReportCb(AbstractC7492a aVar) {
        this.f20230w = aVar;
    }

    public void setCurrentPlayMode(int i) {
        this.f20209b = i;
        this.f20211d.setVerticalVideoCurrentPlayMode(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29941b(Exception exc) {
        AbstractC7492a aVar = this.f20230w;
        if (aVar != null) {
            aVar.onReport(false, exc);
        }
    }

    public VideoView(Context context) {
        super(context);
        mo29251a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29937a(ViewGroup viewGroup) {
        onSizeChanged(getWidth(), getHeight(), viewGroup.getWidth(), viewGroup.getHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29938a(DriveBlockPreviewVM.BlockState blockState) {
        if (blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
            this.f20211d.mo29215a(false);
            AbstractC7496b bVar = this.f20216i;
            if (bVar != null && bVar.mo29302e() == 4) {
                this.f20211d.mo29218d();
            }
        } else if (blockState == DriveBlockPreviewVM.BlockState.FULLSCREEN) {
            this.f20211d.mo29212a();
            mo29268o();
        } else {
            mo29268o();
            this.f20211d.mo29216b();
        }
    }

    /* renamed from: b */
    private void m29942b(String str) {
        C13479a.m54764b("DRIVE_VideoPlayer", "init video view status");
        if (this.f20215h != 1) {
            this.f20216i.mo29301d();
        }
        this.f20212e = str;
        this.f20216i.mo29293a(Uri.parse(str));
        if (this.f20231x.isAutoPlay()) {
            this.f20211d.setSilent(false);
        } else {
            this.f20211d.setSilent(true);
        }
        this.f20211d.setProgress(0);
    }

    public void setup(ViewOwner viewOwner) {
        this.f20221n = viewOwner;
        this.f20220m = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f20231x = (DriveMediaVM) viewOwner.viewModel(DriveMediaVM.class);
        DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class);
        this.f20232y = driveBlockPreviewVM;
        driveBlockPreviewVM.addBlockClickInterceptor(this);
    }

    /* renamed from: a */
    private boolean mo29201a(String str) {
        if (C7501e.m30024h() || (!"ts".equalsIgnoreCase(str) && !"flv".equalsIgnoreCase(str))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28315a(int i) {
        C13479a.m54764b("DRIVE_VideoPlayer", "VideoView.onPlayerStateChanged(). playerState = " + i);
        this.f20215h = i;
        VideoPlayerControllerView videoPlayerControllerView = this.f20211d;
        if (videoPlayerControllerView == null) {
            C13479a.m54758a("DRIVE_VideoPlayer", "onPlayerStateChanged failed, mControllerView == null");
            mo29262i();
            return;
        }
        videoPlayerControllerView.setPlayerState(i);
        if (i == 3) {
            C13479a.m54764b("DRIVE_VideoPlayer", "video status is ready");
            int f = (int) this.f20216i.mo29303f();
            this.f20213f = f;
            this.f20211d.setProgressbarMaxLength(f);
            mo29262i();
        } else if (i == 4) {
            if (this.f20209b == 1) {
                C13479a.m54764b("DRIVE_VideoPlayer", " current mode is play, start timer");
                this.f20211d.mo29218d();
            }
            if (this.f20213f <= 0) {
                int f2 = (int) this.f20216i.mo29303f();
                this.f20213f = f2;
                this.f20211d.setProgressbarMaxLength(f2);
                C13479a.m54764b("DRIVE_VideoPlayer", "set mVideoLength in play state length=" + this.f20213f);
            }
            this.f20214g = (int) this.f20216i.mo29304g();
            mo29203f();
        } else if (i == 5) {
            C13479a.m54764b("DRIVE_VideoPlayer", "video play finished, curPoint = " + this.f20216i.mo29304g() + ", totalLength = " + this.f20216i.mo29303f());
            this.f20211d.mo29220g();
            if (this.f20218k.equals(this.f20217j)) {
                C13479a.m54764b("DRIVE_VideoPlayer", "auto stop, do not change resolution");
                this.f20211d.setProgress(this.f20213f);
                this.f20211d.setPlayState(false);
                if (this.f20220m != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("play_time", Long.valueOf(this.f20216i.mo29304g()));
                    this.f20220m.liveInnerReportMsg().mo28018a(C7557g.m30301a(12, hashMap));
                }
                mo29262i();
            }
            DriveBlockPreviewVM.BlockState b = this.f20232y.getLiveBlockState().mo5927b();
            if (b != null && TextUtils.equals(this.f20218k, this.f20217j)) {
                this.f20216i.mo29292a(0L);
                this.f20216i.mo29297b();
                if (b == DriveBlockPreviewVM.BlockState.BLOCK) {
                    this.f20211d.mo29215a(true);
                }
            }
            this.f20218k = this.f20217j;
        } else if (i == 2) {
            if (this.f20209b == 1) {
                C13479a.m54764b("DRIVE_VideoPlayer", "current mode is buffering destroy timer");
                this.f20211d.mo29220g();
            }
            mo29262i();
        } else if (i == 1) {
            mo29262i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29251a(Context context) {
        C13479a.m54764b("DRIVE_VideoPlayer", "add view container in current view");
        this.f20208a = new FrameLayout(context);
        addView(this.f20208a, new FrameLayout.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m29944d(int i, int i2) {
        onSizeChanged(i, i2, getWidth(), getHeight());
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f20215h == 4 && i != 0) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.RunnableC74861 */

                public void run() {
                    C13479a.m54764b("DRIVE_VideoPlayer", "video view is not visible, stop play video");
                    if (VideoView.this.f20211d != null) {
                        VideoView.this.f20211d.setPlayState(false);
                        return;
                    }
                    C13479a.m54758a("DRIVE_VideoPlayer", "mControllerView == null, stop play video");
                    if (VideoView.this.f20216i != null) {
                        C13479a.m54758a("DRIVE_VideoPlayer", "mIPlayer != null, stop play video");
                        VideoView.this.f20216i.mo29297b();
                    }
                }
            });
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29251a(context);
    }

    /* renamed from: b */
    public void mo29257b(int i, int i2) {
        this.f20227t.mo237937a(AbstractC68307f.m265073a((long) i, (long) i2, TimeUnit.MILLISECONDS).mo238022d(new AbstractC68322n<Long>() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.C74905 */

            /* renamed from: a */
            public boolean test(Long l) throws Exception {
                if (VideoView.this.f20214g > VideoView.this.f20213f || VideoView.this.f20215h != 4) {
                    return false;
                }
                return true;
            }
        }).mo238001b(new Consumer<Long>() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.C74883 */

            /* renamed from: a */
            public void accept(Long l) throws Exception {
                VideoView videoView = VideoView.this;
                videoView.f20214g = (int) videoView.f20216i.mo29304g();
                VideoView.this.f20211d.setProgress(VideoView.this.f20214g);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoView.C74894 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("DRIVE_VideoPlayer", "progress bar update timer failed ", th);
            }
        }));
    }

    public VideoView(Context context, C10917c cVar) {
        super(context);
        this.f20228u = cVar;
        mo29251a(context);
    }

    /* renamed from: c */
    private void m29943c(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = this.f20223p;
        if (i6 == 0 || (i3 = this.f20224q) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("setTextureViewParams mVideoWidth == 0? ");
            boolean z2 = true;
            if (this.f20223p == 0) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" mVideoHeight == 0? ");
            if (this.f20224q != 0) {
                z2 = false;
            }
            sb.append(z2);
            C13479a.m54758a("DRIVE_VideoPlayer", sb.toString());
            return;
        }
        if (((float) i6) / ((float) i3) > ((float) i2) / ((float) i)) {
            i4 = (int) (((double) (i3 * i2)) / ((double) i6));
            i5 = i2;
        } else {
            i5 = (int) (((double) (i6 * i)) / ((double) i3));
            i4 = i;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20210c.getLayoutParams();
        layoutParams.width = i5;
        layoutParams.height = i4;
        layoutParams.gravity = 17;
        C13479a.m54764b("DRIVE_VideoPlayer", "setTextureViewParams() parentWidth=" + i2 + " parentHeight=" + i + " surfaceWidth=" + i5 + " surfaceHeight=" + i4);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28316a(int i, int i2) {
        C13479a.m54764b("DRIVE_VideoPlayer", "VideoView.onVideoSizeChanged(). " + i + ", height = " + i2);
        this.f20223p = i;
        this.f20224q = i2;
        if (this.f20211d != null) {
            if (mo29264k()) {
                C13479a.m54764b("DRIVE_VideoPlayer", "horizontal video, if mode is normal show full screen button");
                if (this.f20209b == 0) {
                    this.f20211d.setEnterFullScreenButtonVisibility(0);
                }
            } else {
                this.f20211d.setEnterFullScreenButtonVisibility(8);
                this.f20211d.mo29219d(true);
            }
            this.f20211d.setVisibility(0);
        }
        m29939a(false, this.f20226s, this.f20225r);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29251a(context);
    }

    /* renamed from: a */
    private void m29939a(boolean z, int i, int i2) {
        boolean z2;
        if (this.f20223p == 0 || this.f20224q == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("adjustSurfaceViewSize mVideoWidth == 0 ");
            boolean z3 = true;
            if (this.f20223p == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append(" mVideoHeight == 0 ");
            if (this.f20224q != 0) {
                z3 = false;
            }
            sb.append(z3);
            C13479a.m54758a("DRIVE_VideoPlayer", sb.toString());
            return;
        }
        if (z) {
            i2 = i;
            i = i2;
        }
        m29943c(i, i2);
        this.f20210c.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20225r = i;
        this.f20226s = i2;
        m29943c(i2, i);
        this.f20210c.requestLayout();
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.VideoView$b */
    public static class C7493b {

        /* renamed from: a */
        String f20240a;

        /* renamed from: b */
        String f20241b;

        /* renamed from: c */
        String f20242c;

        /* renamed from: d */
        LinkedHashMap<String, String> f20243d = new LinkedHashMap<>();

        /* renamed from: e */
        C7553d f20244e;

        public C7493b(String str, String str2, String str3, LinkedHashMap<String, String> linkedHashMap, C7553d dVar) {
            this.f20240a = str;
            this.f20241b = str2;
            this.f20242c = str3;
            if (!C13657b.m55422a(linkedHashMap)) {
                this.f20243d.putAll(linkedHashMap);
            }
            this.f20244e = dVar;
        }
    }
}
