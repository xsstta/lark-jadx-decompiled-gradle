package com.bytedance.ee.bear.drive.view.preview.audio;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.block.IBlockClickInterceptor;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.drive.view.preview.video.C7509b;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b;
import com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.ProgressBar;
import com.bytedance.ee.bear.drive.view.widget.VolumeView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p717s.C13724b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class AudioView extends FrameLayout implements IBlockClickInterceptor, AbstractC7495a, ProgressBar.AbstractC7563a, ProgressBar.AbstractC7564b, VolumeView.AbstractC7567a {

    /* renamed from: a */
    public ProgressBar f19420a;

    /* renamed from: b */
    public AbstractC7496b f19421b;

    /* renamed from: c */
    public DriveBlockPreviewVM f19422c;

    /* renamed from: d */
    public C7509b f19423d;

    /* renamed from: e */
    private final String f19424e = ("preview_audio_" + hashCode());

    /* renamed from: f */
    private TextView f19425f;

    /* renamed from: g */
    private int f19426g;

    /* renamed from: h */
    private int f19427h;

    /* renamed from: i */
    private boolean f19428i;

    /* renamed from: j */
    private int f19429j = 1;

    /* renamed from: k */
    private Handler f19430k;

    /* renamed from: l */
    private C7555f f19431l;

    /* renamed from: m */
    private C7252a f19432m;

    /* renamed from: n */
    private boolean f19433n = true;

    /* renamed from: o */
    private C3069b f19434o = new C3069b("bear_drive_voice_play");

    /* renamed from: p */
    private ViewOwner f19435p;

    /* renamed from: q */
    private DriveMediaVM f19436q;

    /* renamed from: r */
    private ImageView f19437r;

    /* renamed from: s */
    private C68289a f19438s = new C68289a();

    /* renamed from: t */
    private int f19439t;

    /* renamed from: u */
    private boolean f19440u;

    /* renamed from: a */
    public void mo28319a(boolean z) {
        C13479a.m54775e(this.f19424e, "handleMessage: MSG_PREVIEW_PAUSE");
        if (!z) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.AudioView.RunnableC72512 */

                public void run() {
                    AudioView.this.f19420a.setPlayState(false);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28318a(Exception exc) {
        C13479a.m54759a(this.f19424e, "onPlayerError: ", exc);
        this.f19421b.mo29301d();
        this.f19434o.mo12926b();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: c */
    public void mo28323c() {
        C13479a.m54764b(this.f19424e, "onRenderStart()");
    }

    /* renamed from: i */
    private void m28998i() {
        C13479a.m54764b(this.f19424e, "destroy timer");
        this.f19439t = 0;
        this.f19438s.mo237935a();
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: e */
    public void mo28326e() {
        C13479a.m54764b(this.f19424e, "onStartTrackingTouch()");
        this.f19440u = true;
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: f */
    public void mo28327f() {
        C13479a.m54764b(this.f19424e, "onStopTrackingTouch()");
        this.f19440u = false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.block.IBlockClickInterceptor
    /* renamed from: d */
    public boolean mo28325d() {
        if (this.f19423d.mo29331f()) {
            return true;
        }
        this.f19423d.mo29328c();
        m28997h();
        return true;
    }

    /* renamed from: j */
    private void m28999j() {
        C13479a.m54764b(this.f19424e, "audio view prepare()");
        if (this.f19429j != 1) {
            this.f19421b.mo29301d();
        }
        this.f19421b.mo29293a(Uri.parse(this.f19432m.f19443a));
        this.f19420a.setProgress(0);
    }

    /* renamed from: k */
    private void m29000k() {
        C13479a.m54764b(this.f19424e, "audio view play()");
        C7555f fVar = this.f19431l;
        if (fVar != null) {
            fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(6));
        }
        if (this.f19429j != 1 || this.f19432m.f19443a != null) {
            if (this.f19429j == 1) {
                m28999j();
            } else {
                this.f19421b.mo29289a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m29001l() {
        int i = this.f19429j;
        if (i == 3 || i == 4) {
            String str = this.f19424e;
            C13479a.m54764b(str, "time up set visibility gone mPlayerState = " + this.f19429j);
            this.f19423d.mo29329d();
        }
        m28998i();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7555f fVar = this.f19431l;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            C13479a.m54764b(this.f19424e, "onDetachedFromWindow()");
            this.f19436q.getPlayPosition().mo5929b(Long.valueOf(this.f19421b.mo29304g()));
            this.f19430k.removeCallbacksAndMessages(null);
            this.f19421b.mo29298b(this);
            this.f19421b.mo29300c();
            this.f19422c.removeBlockClickInterceptor(this);
        }
    }

    /* renamed from: h */
    private void m28997h() {
        int i = this.f19429j;
        if (i == 3 || i == 4) {
            m28998i();
            this.f19438s.mo237937a(AbstractC68307f.m265075a(1000, TimeUnit.MILLISECONDS).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.$$Lambda$AudioView$UcGsFtFOG0LthwJmw7BDWRL57FI */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AudioView.lambda$UcGsFtFOG0LthwJmw7BDWRL57FI(AudioView.this, (Long) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.$$Lambda$AudioView$tZBaE9GuHTP7Jdw_3zPL1L5uoNQ */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AudioView.lambda$tZBaE9GuHTP7Jdw_3zPL1L5uoNQ(AudioView.this, (Throwable) obj);
                }
            }));
            return;
        }
        String str = this.f19424e;
        C13479a.m54764b(str, "current status is not ready or playing, do not need start timer " + this.f19429j);
    }

    /* renamed from: b */
    public void mo28320b() {
        if (this.f19429j == 4) {
            int g = (int) this.f19421b.mo29304g();
            this.f19427h = g;
            this.f19420a.setProgress(g);
            String str = this.f19424e;
            C13479a.m54764b(str, "updateProgress, curPosition = " + this.f19427h + ", audioLength = " + this.f19426g);
            if (this.f19427h < this.f19426g && this.f19429j == 4) {
                this.f19430k.sendEmptyMessageDelayed(0, 20);
            }
        }
    }

    /* renamed from: g */
    private void m28996g() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_audio_view, this);
        this.f19437r = (ImageView) findViewById(R.id.block_play);
        this.f19420a = (ProgressBar) findViewById(R.id.progress_bar);
        this.f19425f = (TextView) findViewById(R.id.block_length);
        this.f19420a.setProgressBg(R.drawable.drive_progressbar_bg_audio);
        this.f19420a.setStartBtnBg(R.drawable.drive_progressbar_play_white);
        this.f19420a.setPauseBtnBg(R.drawable.drive_progressbar_pause_white);
        this.f19420a.setThumbBg(R.drawable.drive_progressbar_thumb_video);
        this.f19420a.setMaxLengthTextColor(R.color.space_kit_n00);
        this.f19420a.setProgressTextColor(R.color.space_kit_n00);
        this.f19420a.setWholeBackgroundColor(17170445);
        this.f19420a.setResolutionTextColor(R.color.space_kit_n00);
        this.f19420a.setVolumeStateChangedListener(this);
        this.f19420a.setPlayStateChangedListener(this);
        this.f19420a.setProgressSeekedListener(this);
        this.f19430k = new HandlerC7253b();
        this.f19437r.setTag(R.id.drive_preview_block_fun_location_tag, true);
    }

    /* renamed from: a */
    public void mo28314a() {
        C7252a aVar = this.f19432m;
        if (aVar != null && aVar.f19443a != null) {
            C13479a.m54764b(this.f19424e, "audio view show()");
            m28999j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.audio.AudioView$b */
    public static class HandlerC7253b extends Handler {

        /* renamed from: a */
        private WeakReference<AudioView> f19445a;

        private HandlerC7253b(AudioView audioView) {
            this.f19445a = new WeakReference<>(audioView);
        }

        public void handleMessage(Message message) {
            AudioView audioView;
            if (message.what == 0 && (audioView = this.f19445a.get()) != null) {
                audioView.mo28320b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28995a(Throwable th) throws Exception {
        String str = this.f19424e;
        C13479a.m54758a(str, "go to immersive mode failed, timer exception " + th);
    }

    public AudioView(Context context) {
        super(context);
        m28996g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28992a(View view) {
        this.f19437r.setVisibility(8);
        this.f19425f.setVisibility(8);
        this.f19421b.mo29289a();
        this.f19422c.getBlockTitleViewVisibility().mo5926a((Boolean) true);
        this.f19420a.mo29649a(false);
        m28998i();
        m28997h();
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7564b
    /* renamed from: b */
    public void mo28321b(int i) {
        if (this.f19429j != 1) {
            String str = this.f19424e;
            C13479a.m54764b(str, "onProgressSeeked() progress = " + i);
            this.f19421b.mo29292a((long) i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28993a(DriveBlockPreviewVM.BlockState blockState) {
        boolean z;
        int i = 8;
        if (blockState == DriveBlockPreviewVM.BlockState.BLOCK) {
            AbstractC7496b bVar = this.f19421b;
            if (bVar == null || ((bVar.mo29302e() == 5 || this.f19421b.mo29302e() == 3) && this.f19421b.mo29304g() <= 0)) {
                z = true;
            } else {
                z = false;
            }
            this.f19420a.mo29649a(z);
            TextView textView = this.f19425f;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
            AbstractC7496b bVar2 = this.f19421b;
            if (bVar2 == null) {
                return;
            }
            if (bVar2.mo29302e() == 4) {
                m28997h();
            } else if (this.f19421b.mo29304g() <= 0) {
                this.f19437r.setVisibility(0);
            }
        } else if (blockState == DriveBlockPreviewVM.BlockState.FULLSCREEN) {
            m28998i();
            this.f19423d.mo29332g();
            this.f19420a.mo29652c();
            this.f19425f.setVisibility(8);
        } else {
            this.f19420a.mo29653d();
            this.f19425f.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.VolumeView.AbstractC7567a
    /* renamed from: c */
    public void mo28324c(boolean z) {
        String str = this.f19424e;
        C13479a.m54764b(str, "onVolumeStateChanged() isSilent=" + z);
        this.f19428i = z;
        if (z) {
            C7555f fVar = this.f19431l;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(8));
            }
            this.f19421b.mo29290a(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        C7555f fVar2 = this.f19431l;
        if (fVar2 != null) {
            fVar2.liveInnerReportMsg().mo28018a(C7557g.m30300a(9));
        }
        this.f19421b.mo29290a(1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28994a(Long l) throws Exception {
        if (this.f19440u) {
            C13479a.m54764b(this.f19424e, "touching seek bar, reset mPlaySeconds ");
            this.f19439t = 0;
            return;
        }
        int i = this.f19439t + 1;
        this.f19439t = i;
        if (i == 5) {
            post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.$$Lambda$AudioView$64HnNI6kzZHZ45iNDz0Ru5DWSs8 */

                public final void run() {
                    AudioView.lambda$64HnNI6kzZHZ45iNDz0Ru5DWSs8(AudioView.this);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.ProgressBar.AbstractC7563a
    /* renamed from: b */
    public void mo28322b(boolean z) {
        String str = this.f19424e;
        C13479a.m54764b(str, "onPlayStateChanged() isPlay=" + z);
        if (z) {
            m29000k();
            this.f19434o.mo12923a();
            return;
        }
        if (this.f19429j != 5) {
            C7555f fVar = this.f19431l;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(7));
            }
            this.f19430k.removeCallbacksAndMessages(null);
            this.f19421b.mo29297b();
        }
        this.f19434o.mo12926b();
        m28998i();
    }

    public void setPreviewModel(ViewOwner viewOwner) {
        this.f19435p = viewOwner;
        this.f19431l = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f19420a.setViewModel(viewOwner);
        this.f19436q = (DriveMediaVM) viewOwner.viewModel(DriveMediaVM.class);
        DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class);
        this.f19422c = driveBlockPreviewVM;
        driveBlockPreviewVM.getLiveBlockState().mo5923a(viewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.audio.$$Lambda$AudioView$0y10iJDlQli_QgfWL_OpKcc0es4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AudioView.lambda$0y10iJDlQli_QgfWL_OpKcc0es4(AudioView.this, (DriveBlockPreviewVM.BlockState) obj);
            }
        });
        this.f19422c.addBlockClickInterceptor(this);
        this.f19431l = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f19422c = (DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class);
        this.f19423d = new C7509b(getContext(), this.f19420a, new View(getContext()), this.f19422c.getBlockTitleView(), this.f19436q);
        if (this.f19422c.isFromBlockPreview()) {
            this.f19437r.setVisibility(0);
            this.f19425f.setVisibility(0);
            this.f19437r.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.$$Lambda$AudioView$Fi0ZGSQA6W2UayT3MtqdMcQi7lI */

                public final void onClick(View view) {
                    AudioView.lambda$Fi0ZGSQA6W2UayT3MtqdMcQi7lI(AudioView.this, view);
                }
            });
            setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.audio.AudioView.View$OnClickListenerC72501 */

                public void onClick(View view) {
                    if (!AudioView.this.f19423d.mo29331f() && AudioView.this.f19422c.getLiveBlockState().mo5927b() == DriveBlockPreviewVM.BlockState.BLOCK && AudioView.this.f19421b != null && AudioView.this.f19421b.mo29302e() == 4) {
                        AudioView.this.f19423d.mo29328c();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28315a(int i) {
        String str = this.f19424e;
        C13479a.m54764b(str, "onPlaybackStateChanged() state = " + this.f19429j);
        this.f19429j = i;
        if (i == 3) {
            if (this.f19433n) {
                this.f19433n = false;
                int f = (int) this.f19421b.mo29303f();
                this.f19426g = f;
                this.f19420a.setMaxLength(f);
                this.f19425f.setText(C13724b.m55670a(this.f19426g));
                if (((DriveMediaVM) this.f19435p.viewModel(DriveMediaVM.class)).isAutoPlay()) {
                    this.f19420a.setPlayState(true);
                }
            }
        } else if (i == 4) {
            this.f19420a.setPlayState(true);
            this.f19430k.sendEmptyMessage(0);
        } else if (i == 5) {
            String str2 = this.f19424e;
            C13479a.m54764b(str2, "audio play finished, curPoint = " + this.f19421b.mo29302e() + ", totalLength = " + this.f19421b.mo29303f());
            this.f19420a.setProgress(this.f19426g);
            this.f19420a.setPlayState(false);
            C7555f fVar = this.f19431l;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(7));
            }
            DriveBlockPreviewVM.BlockState b = this.f19422c.getLiveBlockState().mo5927b();
            if (b != null) {
                this.f19422c.getBlockTitleViewVisibility().mo5926a((Boolean) false);
                this.f19423d.mo29332g();
                this.f19423d.mo29330e();
                m28998i();
                if (b == DriveBlockPreviewVM.BlockState.BLOCK) {
                    this.f19420a.mo29649a(true);
                    this.f19437r.setVisibility(0);
                    this.f19425f.setVisibility(0);
                }
                this.f19421b.mo29292a(0L);
                this.f19421b.mo29297b();
            }
        }
        if (this.f19429j == 4 && this.f19422c.getLiveBlockState().mo5927b() == DriveBlockPreviewVM.BlockState.BLOCK) {
            m28997h();
        }
    }

    /* renamed from: a */
    public void mo28317a(C7252a aVar) {
        C7498d dVar = new C7498d(getContext(), ((DriveMediaVM) this.f19435p.viewModel(DriveMediaVM.class)).isAutoPlay());
        this.f19421b = dVar;
        dVar.mo29295a(this);
        this.f19432m = aVar;
        this.f19420a.setFileModel(aVar.f19444b);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.audio.AudioView$a */
    public static class C7252a {

        /* renamed from: a */
        String f19443a;

        /* renamed from: b */
        C7553d f19444b;

        public C7252a(String str, C7553d dVar) {
            this.f19443a = str;
            this.f19444b = dVar;
        }
    }

    public AudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28996g();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7495a
    /* renamed from: a */
    public void mo28316a(int i, int i2) {
        String str = this.f19424e;
        C13479a.m54764b(str, "onVideoSizeChanged() width=" + i + ", height=" + i2);
    }

    public AudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28996g();
    }
}
