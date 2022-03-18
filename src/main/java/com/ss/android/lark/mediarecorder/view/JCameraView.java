package com.ss.android.lark.mediarecorder.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44774c;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44775d;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44777f;
import com.ss.android.lark.mediarecorder.p2244b.C44780c;
import com.ss.android.lark.mediarecorder.p2245c.C44791d;
import com.ss.android.lark.mediarecorder.p2245c.C44792e;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.lark.mediarecorder.view.C44830a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class JCameraView extends FrameLayout implements SurfaceHolder.Callback, C44830a.AbstractC44838a, AbstractC44851c {

    /* renamed from: A */
    private int f113475A;

    /* renamed from: B */
    private boolean f113476B;

    /* renamed from: C */
    private float f113477C;

    /* renamed from: a */
    public C44780c f113478a;

    /* renamed from: b */
    public int f113479b;

    /* renamed from: c */
    public AbstractC44773b f113480c;

    /* renamed from: d */
    public AbstractC44773b f113481d;

    /* renamed from: e */
    public VideoView f113482e;

    /* renamed from: f */
    public VideoView f113483f;

    /* renamed from: g */
    public CaptureLayout f113484g;

    /* renamed from: h */
    public FoucsView f113485h;

    /* renamed from: i */
    public MediaPlayer f113486i;

    /* renamed from: j */
    public float f113487j;

    /* renamed from: k */
    public AbstractC44774c f113488k;

    /* renamed from: l */
    private AbstractC44775d f113489l;

    /* renamed from: m */
    private Context f113490m;

    /* renamed from: n */
    private ImageView f113491n;

    /* renamed from: o */
    private ImageView f113492o;

    /* renamed from: p */
    private ImageView f113493p;

    /* renamed from: q */
    private int f113494q;

    /* renamed from: r */
    private Bitmap f113495r;

    /* renamed from: s */
    private Bitmap f113496s;

    /* renamed from: t */
    private String f113497t;

    /* renamed from: u */
    private int f113498u;

    /* renamed from: v */
    private int f113499v;

    /* renamed from: w */
    private int f113500w;

    /* renamed from: x */
    private int f113501x;

    /* renamed from: y */
    private int f113502y;

    /* renamed from: z */
    private int f113503z;

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // com.ss.android.lark.mediarecorder.view.C44830a.AbstractC44838a
    /* renamed from: a */
    public void mo158610a() {
        C44830a.m177740a().mo158664b(this.f113482e.getHolder(), this.f113487j);
    }

    /* renamed from: c */
    public void mo158618c() {
        C44796g.m177637c("JCameraView onPause");
        mo158621f();
        mo158611a(1);
        C44830a.m177740a().mo158658a(false);
        C44830a.m177740a().mo158663b(this.f113490m);
    }

    /* renamed from: d */
    public void mo158619d() {
        C44796g.m177637c("JCameraView onDestroy");
        this.f113482e.animate().cancel();
        this.f113483f.animate().cancel();
    }

    /* renamed from: e */
    public void mo158620e() {
        VideoView videoView;
        C44780c cVar = this.f113478a;
        if (cVar != null && (videoView = this.f113482e) != null) {
            cVar.mo158531b(videoView.getHolder(), this.f113487j);
        }
    }

    /* renamed from: f */
    public void mo158621f() {
        m177710a(false);
        MediaPlayer mediaPlayer = this.f113486i;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f113486i.stop();
            this.f113486i.release();
            this.f113486i = null;
        }
    }

    /* renamed from: h */
    private void m177712h() {
        int a = C44791d.m177626a(this.f113490m);
        this.f113494q = a;
        this.f113475A = (int) (((float) a) / 16.0f);
        C44796g.m177638d("zoom = " + this.f113475A);
        this.f113478a = new C44780c(getContext(), this, this);
    }

    /* renamed from: b */
    public void mo158615b() {
        C44796g.m177637c("JCameraView onResume");
        mo158611a(4);
        C44830a.m177740a().mo158649a(this.f113490m);
        C44830a.m177740a().mo158653a(this.f113492o, this.f113493p);
        this.f113478a.mo158527a(this.f113482e.getHolder(), this.f113487j);
    }

    /* renamed from: g */
    public void mo158622g() {
        switch (this.f113479b) {
            case 33:
                this.f113493p.setImageResource(R.drawable.recorder_ic_flash_auto);
                this.f113478a.mo158528a("auto");
                return;
            case 34:
                this.f113493p.setImageResource(R.drawable.recorder_ic_flash_on);
                this.f113478a.mo158528a("on");
                return;
            case 35:
                this.f113493p.setImageResource(R.drawable.recorder_ic_flash_off);
                this.f113478a.mo158528a("off");
                return;
            default:
                return;
        }
    }

    /* renamed from: i */
    private void m177713i() {
        setWillNotDraw(false);
        View inflate = LayoutInflater.from(this.f113490m).inflate(R.layout.recorder_camera_view, this);
        this.f113482e = (VideoView) inflate.findViewById(R.id.video_preview);
        this.f113483f = (VideoView) inflate.findViewById(R.id.video_play);
        this.f113491n = (ImageView) inflate.findViewById(R.id.image_photo);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_switch);
        this.f113492o = imageView;
        imageView.setImageResource(this.f113500w);
        this.f113493p = (ImageView) inflate.findViewById(R.id.image_flash);
        mo158622g();
        this.f113493p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.View$OnClickListenerC448181 */

            public void onClick(View view) {
                JCameraView.this.f113479b++;
                if (JCameraView.this.f113479b > 35) {
                    JCameraView.this.f113479b = 33;
                }
                JCameraView.this.mo158622g();
            }
        });
        CaptureLayout captureLayout = (CaptureLayout) inflate.findViewById(R.id.capture_layout);
        this.f113484g = captureLayout;
        captureLayout.setDuration(this.f113503z);
        this.f113484g.mo158588a(this.f113501x, this.f113502y);
        this.f113485h = (FoucsView) inflate.findViewById(R.id.fouce_view);
        this.f113482e.getHolder().addCallback(this);
        this.f113492o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.View$OnClickListenerC448234 */

            public void onClick(View view) {
                JCameraView.this.f113478a.mo158531b(JCameraView.this.f113482e.getHolder(), JCameraView.this.f113487j);
            }
        });
        this.f113484g.setCaptureLisenter(new AbstractC44772a() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448245 */

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158510a() {
                JCameraView.this.f113478a.mo158523a();
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: c */
            public void mo158515c() {
                if (JCameraView.this.f113488k != null) {
                    JCameraView.this.f113488k.mo158518b();
                }
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: b */
            public void mo158513b() {
                JCameraView.this.f113478a.mo158526a(JCameraView.this.f113482e.getHolder().getSurface(), JCameraView.this.f113487j);
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158511a(float f) {
                C44796g.m177638d("recordZoom");
                JCameraView.this.f113478a.mo158525a(f, SmEvents.EVENT_UA_SUCCESS);
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: b */
            public void mo158514b(long j) {
                JCameraView.this.f113478a.mo158529a(false, j);
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158512a(final long j) {
                JCameraView.this.f113484g.setTextWithAnimation(R.string.Lark_MediaPicker_RecordTooShort);
                JCameraView.this.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448245.RunnableC448251 */

                    public void run() {
                        JCameraView.this.f113478a.mo158529a(true, j);
                    }
                }, 1000 - j);
            }
        });
        this.f113484g.setTypeLisenter(new AbstractC44777f() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448266 */

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44777f
            /* renamed from: b */
            public void mo158522b() {
                JCameraView.this.f113478a.mo158530b();
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44777f
            /* renamed from: a */
            public void mo158521a() {
                JCameraView.this.f113478a.mo158532c(JCameraView.this.f113482e.getHolder(), JCameraView.this.f113487j);
            }
        });
        this.f113484g.setLeftClickListener(new AbstractC44773b() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448277 */

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b
            /* renamed from: a */
            public void mo158516a() {
                if (JCameraView.this.f113480c != null) {
                    JCameraView.this.f113480c.mo158516a();
                }
            }
        });
        this.f113484g.setRightClickListener(new AbstractC44773b() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448288 */

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b
            /* renamed from: a */
            public void mo158516a() {
                if (JCameraView.this.f113481d != null) {
                    JCameraView.this.f113481d.mo158516a();
                }
            }
        });
    }

    public void setJCameraLisenter(AbstractC44775d dVar) {
        this.f113489l = dVar;
    }

    public void setLeftClickListener(AbstractC44773b bVar) {
        this.f113480c = bVar;
    }

    public void setRightClickListener(AbstractC44773b bVar) {
        this.f113481d = bVar;
    }

    public JCameraView(Context context) {
        this(context, null);
    }

    public void setFeatures(int i) {
        this.f113484g.setButtonFeatures(i);
    }

    public void setMediaQuality(int i) {
        C44830a.m177740a().mo158648a(i);
    }

    public void setSavePhotoPath(String str) {
        C44830a.m177740a().mo158657a(str);
    }

    public void setSaveVideoPath(String str) {
        C44830a.m177740a().mo158657a(str);
    }

    public void setTip(String str) {
        this.f113484g.setTip(str);
    }

    public void setErrorLisenter(AbstractC44774c cVar) {
        this.f113488k = cVar;
        C44830a.m177740a().mo158654a(cVar);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C44796g.m177637c("JCameraView SurfaceCreated");
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.RunnableC448299 */

            public void run() {
                C44830a.m177740a().mo158655a(JCameraView.this);
            }
        });
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C44796g.m177637c("JCameraView SurfaceDestroyed");
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.AnonymousClass10 */

            public void run() {
                C44830a.m177740a().mo158667d();
            }
        });
    }

    /* renamed from: a */
    private void m177710a(boolean z) {
        VideoView videoView;
        final VideoView videoView2;
        if (z) {
            videoView = this.f113483f;
            videoView2 = this.f113482e;
        } else {
            videoView = this.f113482e;
            videoView2 = this.f113483f;
        }
        videoView.setAlpha(1.0f);
        videoView.setVisibility(0);
        videoView2.animate().setDuration(200).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.C448223 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                videoView2.setVisibility(4);
            }
        });
    }

    @Override // com.ss.android.lark.mediarecorder.view.AbstractC44851c
    /* renamed from: a */
    public void mo158611a(int i) {
        if (i == 1) {
            this.f113491n.setVisibility(4);
        } else if (i == 2) {
            mo158621f();
            C44792e.m177630a(this.f113497t);
            this.f113483f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f113478a.mo158527a(this.f113482e.getHolder(), this.f113487j);
        } else if (i == 4) {
            this.f113483f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.f113484g.mo158590c();
    }

    @Override // com.ss.android.lark.mediarecorder.view.AbstractC44851c
    /* renamed from: b */
    public void mo158617b(int i) {
        if (i == 1) {
            this.f113491n.setVisibility(4);
            AbstractC44775d dVar = this.f113489l;
            if (dVar != null) {
                dVar.mo158519a(this.f113495r);
            }
        } else if (i == 2) {
            mo158621f();
            this.f113483f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f113478a.mo158527a(this.f113482e.getHolder(), this.f113487j);
            AbstractC44775d dVar2 = this.f113489l;
            if (dVar2 != null) {
                dVar2.mo158520a(this.f113497t, this.f113496s);
            }
        }
        this.f113484g.mo158590c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getPointerCount() == 1) {
                m177711c(motionEvent.getX(), motionEvent.getY());
            }
            if (motionEvent.getPointerCount() == 2) {
                C44796g.m177637c("ACTION_DOWN = 2");
            }
        } else if (action == 1) {
            this.f113476B = true;
        } else if (action == 2) {
            if (motionEvent.getPointerCount() == 1) {
                this.f113476B = true;
            }
            if (motionEvent.getPointerCount() == 2) {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float sqrt = (float) Math.sqrt(Math.pow((double) (x - motionEvent.getX(1)), 2.0d) + Math.pow((double) (y - motionEvent.getY(1)), 2.0d));
                if (this.f113476B) {
                    this.f113477C = sqrt;
                    this.f113476B = false;
                }
                float f = this.f113477C;
                if (((int) (sqrt - f)) / this.f113475A != 0) {
                    this.f113476B = true;
                    this.f113478a.mo158525a(sqrt - f, SmEvents.EVENT_UA_ERROR);
                }
            }
        }
        return true;
    }

    public JCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m177711c(float f, float f2) {
        this.f113478a.mo158524a(f, f2, new C44830a.AbstractC44840c() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.AnonymousClass11 */

            @Override // com.ss.android.lark.mediarecorder.view.C44830a.AbstractC44840c
            /* renamed from: a */
            public void mo158639a() {
                JCameraView.this.f113485h.setVisibility(4);
            }
        });
    }

    @Override // com.ss.android.lark.mediarecorder.view.AbstractC44851c
    /* renamed from: a */
    public void mo158612a(Bitmap bitmap, final String str) {
        m177710a(true);
        this.f113497t = str;
        this.f113496s = bitmap;
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mediarecorder.view.JCameraView.RunnableC448192 */

            public void run() {
                try {
                    if (JCameraView.this.f113486i == null) {
                        JCameraView.this.f113486i = new MediaPlayer();
                    } else {
                        JCameraView.this.f113486i.reset();
                    }
                    JCameraView.this.f113486i.setDataSource(str);
                    JCameraView.this.f113486i.setVideoScalingMode(1);
                    JCameraView.this.f113486i.setAudioStreamType(3);
                    JCameraView.this.f113486i.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                        /* class com.ss.android.lark.mediarecorder.view.JCameraView.RunnableC448192.C448201 */

                        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                            JCameraView.this.mo158616b((float) JCameraView.this.f113486i.getVideoWidth(), (float) JCameraView.this.f113486i.getVideoHeight());
                        }
                    });
                    JCameraView.this.f113486i.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        /* class com.ss.android.lark.mediarecorder.view.JCameraView.RunnableC448192.C448212 */

                        public void onPrepared(MediaPlayer mediaPlayer) {
                            Surface surface = JCameraView.this.f113483f.getHolder().getSurface();
                            if (surface != null && surface.isValid()) {
                                JCameraView.this.f113486i.setSurface(surface);
                                JCameraView.this.f113486i.start();
                            }
                        }
                    });
                    JCameraView.this.f113486i.setLooping(true);
                    JCameraView.this.f113486i.prepare();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo158616b(float f, float f2) {
        if (f > f2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((f2 / f) * ((float) getWidth())));
            layoutParams.gravity = 17;
            this.f113483f.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = (float) this.f113482e.getMeasuredWidth();
        float measuredHeight = (float) this.f113482e.getMeasuredHeight();
        if (this.f113487j == BitmapDescriptorFactory.HUE_RED) {
            this.f113487j = measuredHeight / measuredWidth;
        }
    }

    @Override // com.ss.android.lark.mediarecorder.view.AbstractC44851c
    /* renamed from: a */
    public void mo158613a(Bitmap bitmap, boolean z) {
        if (z) {
            this.f113491n.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            this.f113491n.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.f113495r = bitmap;
        this.f113491n.setImageBitmap(bitmap);
        this.f113491n.setVisibility(0);
        this.f113484g.mo158591d();
        this.f113484g.mo158589b();
    }

    @Override // com.ss.android.lark.mediarecorder.view.AbstractC44851c
    /* renamed from: a */
    public boolean mo158614a(float f, float f2) {
        if (f2 > ((float) this.f113484g.getTop())) {
            return false;
        }
        this.f113485h.setVisibility(0);
        if (f < ((float) (this.f113485h.getWidth() / 2))) {
            f = (float) (this.f113485h.getWidth() / 2);
        }
        if (f > ((float) (this.f113494q - (this.f113485h.getWidth() / 2)))) {
            f = (float) (this.f113494q - (this.f113485h.getWidth() / 2));
        }
        if (f2 < ((float) (this.f113485h.getWidth() / 2))) {
            f2 = (float) (this.f113485h.getWidth() / 2);
        }
        if (f2 > ((float) (this.f113484g.getTop() - (this.f113485h.getWidth() / 2)))) {
            f2 = (float) (this.f113484g.getTop() - (this.f113485h.getWidth() / 2));
        }
        FoucsView foucsView = this.f113485h;
        foucsView.setX(f - ((float) (foucsView.getWidth() / 2)));
        FoucsView foucsView2 = this.f113485h;
        foucsView2.setY(f2 - ((float) (foucsView2.getHeight() / 2)));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f113485h, "scaleX", 1.0f, 0.6f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f113485h, "scaleY", 1.0f, 0.6f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f113485h, "alpha", 1.0f, 0.4f, 1.0f, 0.4f, 1.0f, 0.4f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).before(ofFloat3);
        animatorSet.setDuration(400L);
        animatorSet.start();
        return true;
    }

    public JCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113479b = 35;
        this.f113476B = true;
        this.f113490m = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.recorder_duration_max, R.attr.recorder_iconLeft, R.attr.recorder_iconMargin, R.attr.recorder_iconRight, R.attr.recorder_iconSize, R.attr.recorder_iconSrc}, i, 0);
        this.f113498u = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(2, 35.0f, getResources().getDisplayMetrics()));
        this.f113499v = obtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics()));
        this.f113500w = obtainStyledAttributes.getResourceId(5, R.drawable.recorder_ic_camera);
        this.f113501x = obtainStyledAttributes.getResourceId(1, 0);
        this.f113502y = obtainStyledAttributes.getResourceId(3, 0);
        this.f113503z = obtainStyledAttributes.getInteger(0, 15000);
        obtainStyledAttributes.recycle();
        m177712h();
        m177713i();
    }
}
