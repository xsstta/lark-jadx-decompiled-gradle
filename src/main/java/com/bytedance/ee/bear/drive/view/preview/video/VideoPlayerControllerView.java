package com.bytedance.ee.bear.drive.view.preview.video;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.ProgressBar;
import com.bytedance.ee.bear.drive.view.widget.VolumeView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p717s.C13724b;
import com.bytedance.ee.util.p718t.C13737d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class VideoPlayerControllerView extends FrameLayout implements View.OnClickListener, ProgressBar.AbstractC7563a, ProgressBar.AbstractC7564b, VolumeView.AbstractC7567a {

    /* renamed from: a */
    public ProgressBar f20181a;

    /* renamed from: b */
    public int f20182b;

    /* renamed from: c */
    private AbstractC7496b f20183c;

    /* renamed from: d */
    private AbstractC7494a f20184d;

    /* renamed from: e */
    private TextView f20185e;

    /* renamed from: f */
    private TextView f20186f;

    /* renamed from: g */
    private FrameLayout f20187g;

    /* renamed from: h */
    private ImageView f20188h;

    /* renamed from: i */
    private ViewGroup f20189i;

    /* renamed from: j */
    private ImageView f20190j;

    /* renamed from: k */
    private int f20191k = 1;

    /* renamed from: l */
    private C7555f f20192l;

    /* renamed from: m */
    private DriveBlockPreviewVM f20193m;

    /* renamed from: n */
    private DriveMediaVM f20194n;

    /* renamed from: o */
    private C7553d f20195o;

    /* renamed from: p */
    private int f20196p;

    /* renamed from: q */
    private int f20197q;

    /* renamed from: r */
    private boolean f20198r;

    /* renamed from: s */
    private C7509b f20199s;

    /* renamed from: t */
    private AbstractC7485a f20200t;

    /* renamed from: u */
    private C68289a f20201u = new C68289a();

    /* renamed from: v */
    private C3069b f20202v = new C3069b("bear_drive_video_play");

    /* renamed from: w */
    private boolean f20203w;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView$a */
    public interface AbstractC7485a {
        /* renamed from: a */
        void mo29249a();

        /* renamed from: b */
        void mo29250b();
    }

    public int getBarsShowState() {
        return this.f20182b;
    }

    /* renamed from: c */
    public void mo29217c() {
        this.f20181a.setProgress(0);
    }

    /* renamed from: h */
    public void mo29222h() {
        this.f20199s.mo29328c();
    }

    /* renamed from: i */
    public void mo29223i() {
        this.f20199s.mo29330e();
    }

    /* renamed from: j */
    public void mo29224j() {
        this.f20199s.mo29329d();
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: e */
    public void mo28326e() {
        this.f20198r = true;
        AbstractC7485a aVar = this.f20200t;
        if (aVar != null) {
            aVar.mo29250b();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: f */
    public void mo28327f() {
        this.f20198r = false;
        AbstractC7485a aVar = this.f20200t;
        if (aVar != null) {
            aVar.mo29249a();
        }
    }

    /* renamed from: g */
    public void mo29220g() {
        C13479a.m54764b("DRIVE_VideoPlayer", "destroy timer");
        this.f20196p = 0;
        this.f20201u.mo237935a();
    }

    /* renamed from: k */
    private void m29916k() {
        this.f20199s.mo29326a().addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView.C74832 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                VideoPlayerControllerView.this.f20182b = 1;
            }

            public void onAnimationStart(Animator animator) {
                VideoPlayerControllerView.this.f20182b = -1;
            }
        });
        this.f20199s.mo29327b().addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView.C74843 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                VideoPlayerControllerView.this.f20182b = 0;
            }

            public void onAnimationStart(Animator animator) {
                VideoPlayerControllerView.this.f20182b = -1;
            }
        });
    }

    /* renamed from: b */
    public void mo29216b() {
        this.f20181a.mo29653d();
        this.f20190j.setVisibility(8);
        this.f20189i.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ void m29917l() {
        int i = this.f20191k;
        if (i == 3 || i == 4) {
            C13479a.m54764b("DRIVE_VideoPlayer", "time up set visibility gone mPlayerState = " + this.f20191k);
            this.f20199s.mo29329d();
        }
        mo29220g();
    }

    /* renamed from: a */
    public void mo29212a() {
        this.f20181a.mo29652c();
        if (!this.f20203w) {
            this.f20189i.setVisibility(0);
        }
        this.f20185e.setVisibility(8);
        this.f20190j.setVisibility(8);
    }

    /* renamed from: d */
    public void mo29218d() {
        int i = this.f20191k;
        if (i == 3 || i == 4) {
            mo29220g();
            this.f20201u.mo237937a(AbstractC68307f.m265075a(1000, TimeUnit.MILLISECONDS).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoPlayerControllerView$eUWhXBAB2bFDu1enr9UvUz5ipSU */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VideoPlayerControllerView.this.m29914a((VideoPlayerControllerView) ((Long) obj));
                }
            }, $$Lambda$VideoPlayerControllerView$LbxKuKHpBA4LhCiG3GVPgkYHzu4.INSTANCE));
            return;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "current status is not ready or playing, do not need start timer " + this.f20191k);
    }

    public void setUpdateProgressBarListener(AbstractC7485a aVar) {
        this.f20200t = aVar;
    }

    public void setEnterFullScreenButtonVisibility(int i) {
        this.f20187g.setVisibility(i);
    }

    public void setPlayState(boolean z) {
        this.f20181a.setPlayState(z);
    }

    public void setProgressBarVisibility(int i) {
        this.f20181a.setVisibility(i);
    }

    public void setResolution(String str) {
        this.f20181a.setResolution(str);
    }

    public void setResolutionClickListener(View.OnClickListener onClickListener) {
        this.f20181a.setResolutionClickListener(onClickListener);
    }

    public void setResolutionVisible(boolean z) {
        this.f20181a.setResolutionVisible(z);
    }

    /* renamed from: d */
    public void mo29219d(boolean z) {
        if (z) {
            this.f20189i.setVisibility(8);
        }
        this.f20203w = z;
    }

    public void setProgress(final int i) {
        this.f20181a.post(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView.RunnableC74821 */

            public void run() {
                VideoPlayerControllerView.this.f20181a.setProgress(i);
            }
        });
    }

    public VideoPlayerControllerView(Context context) {
        super(context);
        m29913a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m29915a(Throwable th) throws Exception {
        C13479a.m54758a("DRIVE_VideoPlayer", "go to immersive mode failed, timer exception " + th);
    }

    public void setFileModel(C7553d dVar) {
        this.f20195o = dVar;
        this.f20181a.setFileModel(dVar);
        this.f20186f.setText(this.f20195o.mo29480c());
    }

    public void setSilent(boolean z) {
        C13479a.m54764b("preview_video", "video player control setSilent=" + z);
        this.f20181a.setSilent(z);
    }

    public void setVerticalVideoCurrentPlayMode(int i) {
        this.f20197q = i;
        if (i == 0) {
            mo29222h();
            mo29220g();
        } else if (i == 1) {
            mo29218d();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m29914a(Long l) throws Exception {
        if (this.f20198r) {
            C13479a.m54764b("DRIVE_VideoPlayer", "touching seek bar, reset mPlaySeconds ");
            this.f20196p = 0;
            return;
        }
        int i = this.f20196p + 1;
        this.f20196p = i;
        if (i == 5) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$VideoPlayerControllerView$8t0K_Fcl5GROSd_wal4petbZ98 */

                public final void run() {
                    VideoPlayerControllerView.this.m29917l();
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: b */
    public void mo28321b(int i) {
        if (this.f20191k == 1) {
            C13479a.m54764b("preview_video", "mPlayerState == IPlayer.STATE_IDLE, return");
        } else if (this.f20183c == null) {
            C13479a.m54758a("preview_video", "mIPlayer == null, seek to failed");
        } else {
            C13479a.m54764b("preview_video", "onProgressSeeked, progress = " + i);
            this.f20183c.mo29292a((long) i);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.VolumeView.AbstractC7567a
    /* renamed from: c */
    public void mo28324c(boolean z) {
        AbstractC7496b bVar = this.f20183c;
        if (bVar == null) {
            C13479a.m54758a("preview_video", "mIPlayer == null, VolumeStateChangedListener failed");
        } else if (z) {
            bVar.mo29290a(BitmapDescriptorFactory.HUE_RED);
            C7555f fVar = this.f20192l;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(15));
            }
        } else {
            bVar.mo29290a(1.0f);
            C7555f fVar2 = this.f20192l;
            if (fVar2 != null) {
                fVar2.liveInnerReportMsg().mo28018a(C7557g.m30300a(16));
            }
        }
    }

    public void setPlayerState(int i) {
        this.f20191k = i;
        this.f20181a.setPlayerState(i);
        if (i == 4 && this.f20193m.getLiveBlockState().mo5927b() == DriveBlockPreviewVM.BlockState.BLOCK) {
            mo29218d();
        }
        if (i == 5) {
            this.f20193m.getBlockTitleViewVisibility().mo5926a((Boolean) false);
        }
    }

    public void setProgressbarMaxLength(int i) {
        C13479a.m54764b("preview_video", "video player control setProgressbarMaxLength=" + i);
        this.f20181a.setMaxLength(i);
        this.f20185e.setText(C13724b.m55670a(i));
    }

    public void setViewModel(ViewOwner viewOwner) {
        this.f20192l = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f20193m = (DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class);
        this.f20194n = (DriveMediaVM) viewOwner.viewModel(DriveMediaVM.class);
        this.f20181a.setViewModel(viewOwner);
        this.f20199s = new C7509b(getContext(), this.f20181a, this.f20189i, this.f20193m.getBlockTitleView(), this.f20194n);
        m29916k();
    }

    /* renamed from: a */
    private void m29913a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_preview_video_view_controller, this);
        this.f20181a = (ProgressBar) findViewById(R.id.progress_bar);
        this.f20185e = (TextView) findViewById(R.id.block_length);
        this.f20186f = (TextView) findViewById(R.id.file_name_tv);
        this.f20190j = (ImageView) findViewById(R.id.block_play);
        this.f20187g = (FrameLayout) findViewById(R.id.drive_video_player_enter_full_screen_button);
        this.f20188h = (ImageView) findViewById(R.id.drive_video_player_back_image);
        this.f20189i = (ViewGroup) findViewById(R.id.control_fullscreen_root);
        this.f20181a.setProgressBg(R.drawable.drive_progressbar_bg_video);
        this.f20181a.setThumbBg(R.drawable.drive_progressbar_thumb_video);
        this.f20181a.setStartBtnBg(R.drawable.drive_progressbar_play_white);
        this.f20181a.setPauseBtnBg(R.drawable.drive_progressbar_pause_white);
        this.f20181a.setMaxLengthTextColor(R.color.space_kit_n00);
        this.f20181a.setProgressTextColor(R.color.space_kit_n00);
        this.f20181a.setBackgroundResource(R.drawable.drive_progressbar_bg);
        this.f20181a.setResolutionTextColor(R.color.space_kit_n00);
        this.f20181a.setPlayStateChangedListener(this);
        this.f20181a.setProgressSeekedListener(this);
        this.f20187g.setOnClickListener(this);
        this.f20188h.setOnClickListener(this);
        this.f20181a.setVolumeStateChangedListener(this);
        this.f20190j.setOnClickListener(this);
        this.f20190j.setTag(R.id.drive_preview_block_fun_location_tag, true);
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7563a
    /* renamed from: b */
    public void mo28322b(boolean z) {
        if (this.f20183c == null) {
            C13479a.m54758a("preview_video", "mIPlayer == null, PlayStateChangedListener failed");
            return;
        }
        if (z) {
            this.f20184d.mo29199a();
            this.f20202v.mo12923a();
            C7555f fVar = this.f20192l;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(27));
            }
            DriveBlockPreviewVM driveBlockPreviewVM = this.f20193m;
            if (driveBlockPreviewVM != null && driveBlockPreviewVM.getLiveBlockState().mo5927b() == DriveBlockPreviewVM.BlockState.BLOCK) {
                mo29218d();
            }
        } else {
            if (this.f20191k != 5) {
                C13479a.m54764b("preview_video", "stop play video after progress bar status changed");
                this.f20183c.mo29297b();
                if (this.f20192l != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("play_time", Long.valueOf(this.f20183c.mo29304g()));
                    this.f20192l.liveInnerReportMsg().mo28018a(C7557g.m30301a(12, hashMap));
                }
            }
            this.f20202v.mo12926b();
        }
        C7555f fVar2 = this.f20192l;
        if (fVar2 == null) {
            C13479a.m54758a("DRIVE_VideoPlayer", "mCommunication == null, keep screen on failed");
        } else {
            fVar2.liveInnerKeepScreenOn().mo5926a(Boolean.valueOf(z));
        }
    }

    public void onClick(View view) {
        if (!C13737d.m55692a()) {
            C13479a.m54764b("DRIVE_VideoPlayer", "onClick() isValidClick=false");
            return;
        }
        int id = view.getId();
        if (id == R.id.drive_video_player_enter_full_screen_button) {
            this.f20197q = 1;
            try {
                this.f20184d.mo29256b();
                HashMap hashMap = new HashMap();
                hashMap.put("is_fullscreen", true);
                this.f20192l.liveInnerReportMsg().mo28018a(C7557g.m30301a(12, hashMap));
            } catch (Exception e) {
                C13479a.m54759a("DRIVE_VideoPlayer", "mVideoPlayer.enterFullScreen error", e);
            }
            mo29218d();
        } else if (id == R.id.drive_video_player_back_image) {
            mo29220g();
            this.f20197q = 0;
            try {
                this.f20184d.mo29258e();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("is_fullscreen", false);
                this.f20192l.liveInnerReportMsg().mo28018a(C7557g.m30301a(12, hashMap2));
            } catch (Exception e2) {
                C13479a.m54759a("DRIVE_VideoPlayer", "mVideoPlayer.exitFullScreen error", e2);
            }
        } else if (id == R.id.block_play) {
            this.f20183c.mo29289a();
            this.f20190j.setVisibility(8);
            this.f20181a.mo29649a(false);
            this.f20185e.setVisibility(8);
            this.f20181a.mo29651b();
            mo29220g();
            mo29222h();
        }
    }

    /* renamed from: a */
    public void mo29213a(int i) {
        if (i == 0) {
            this.f20187g.setVisibility(0);
            this.f20188h.setVisibility(8);
            this.f20186f.setVisibility(8);
            mo29222h();
            mo29220g();
        } else if (i == 1) {
            this.f20187g.setVisibility(8);
            this.f20188h.setVisibility(0);
            this.f20186f.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo29215a(boolean z) {
        boolean z2;
        if (z || this.f20181a.mo29650a() || this.f20183c.mo29302e() == 3 || this.f20183c.mo29302e() == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f20181a.mo29649a(z2);
        this.f20189i.setVisibility(8);
        if (this.f20183c == null || !z2) {
            this.f20185e.setVisibility(8);
            this.f20190j.setVisibility(8);
            return;
        }
        this.f20199s.mo29330e();
        this.f20185e.setVisibility(0);
        this.f20190j.setVisibility(0);
    }

    /* renamed from: a */
    public void mo29214a(AbstractC7496b bVar, AbstractC7494a aVar) {
        this.f20183c = bVar;
        this.f20184d = aVar;
    }

    public VideoPlayerControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29913a(context);
    }

    public VideoPlayerControllerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29913a(context);
    }
}
