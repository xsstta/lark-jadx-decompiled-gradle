package com.ss.android.lark.cameraview;

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
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.p1588b.AbstractC32752a;
import com.ss.android.lark.cameraview.p1588b.AbstractC32753b;
import com.ss.android.lark.cameraview.p1588b.AbstractC32754c;
import com.ss.android.lark.cameraview.p1588b.AbstractC32755d;
import com.ss.android.lark.cameraview.p1588b.AbstractC32757f;
import com.ss.android.lark.cameraview.p1589c.C32766c;
import com.ss.android.lark.cameraview.p1591e.AbstractC32787a;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class JCameraView extends FrameLayout implements SurfaceHolder.Callback, C32743b.AbstractC32747a, AbstractC32787a {

    /* renamed from: A */
    private int f83958A;

    /* renamed from: B */
    private boolean f83959B;

    /* renamed from: C */
    private float f83960C;

    /* renamed from: a */
    public C32766c f83961a;

    /* renamed from: b */
    public AbstractC32753b f83962b;

    /* renamed from: c */
    public AbstractC32753b f83963c;

    /* renamed from: d */
    public Context f83964d;

    /* renamed from: e */
    public VideoView f83965e;

    /* renamed from: f */
    public VideoView f83966f;

    /* renamed from: g */
    public CaptureLayout f83967g;

    /* renamed from: h */
    public FoucsView f83968h;

    /* renamed from: i */
    public MediaPlayer f83969i;

    /* renamed from: j */
    public float f83970j;

    /* renamed from: k */
    public AbstractC32754c f83971k;

    /* renamed from: l */
    private int f83972l;

    /* renamed from: m */
    private AbstractC32755d f83973m;

    /* renamed from: n */
    private ImageView f83974n;

    /* renamed from: o */
    private ImageView f83975o;

    /* renamed from: p */
    private ImageView f83976p;

    /* renamed from: q */
    private int f83977q;

    /* renamed from: r */
    private Bitmap f83978r;

    /* renamed from: s */
    private Bitmap f83979s;

    /* renamed from: t */
    private String f83980t;

    /* renamed from: u */
    private int f83981u;

    /* renamed from: v */
    private int f83982v;

    /* renamed from: w */
    private int f83983w;

    /* renamed from: x */
    private int f83984x;

    /* renamed from: y */
    private int f83985y;

    /* renamed from: z */
    private int f83986z;

    /* renamed from: a */
    public static Thread m125611a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m125616l() {
        C32771d.m125799a().mo120690a(getContext(), this.f83965e, this);
    }

    @Override // com.ss.android.lark.cameraview.C32743b.AbstractC32747a
    /* renamed from: a */
    public void mo120639a() {
        C32771d.m125799a().mo120700b(this.f83965e.getHolder(), this.f83970j);
    }

    /* renamed from: d */
    public void mo120648d() {
        Log.m165388i("JCameraView onStart");
        C32771d.m125799a().mo120705f();
    }

    /* renamed from: e */
    public void mo120649e() {
        Log.m165388i("JCameraView onStop");
        C32771d.m125799a().mo120706g();
    }

    /* renamed from: i */
    public void mo120653i() {
        C32771d.m125799a().mo120689a(getContext(), this.f83965e);
    }

    /* renamed from: f */
    public void mo120650f() {
        Log.m165388i("JCameraView onDestroy");
        C32771d.m125799a().mo120702c();
        this.f83965e.animate().cancel();
        this.f83966f.animate().cancel();
    }

    /* renamed from: g */
    public void mo120651g() {
        VideoView videoView;
        C32766c cVar = this.f83961a;
        if (cVar != null && (videoView = this.f83965e) != null) {
            cVar.mo120740b(videoView.getHolder(), this.f83970j);
        }
    }

    /* renamed from: h */
    public void mo120652h() {
        m125612a(false);
        MediaPlayer mediaPlayer = this.f83969i;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f83969i.stop();
            this.f83969i.release();
            this.f83969i = null;
        }
    }

    /* renamed from: j */
    private void m125614j() {
        int screenWidth = DeviceUtils.getScreenWidth(this.f83964d);
        this.f83977q = screenWidth;
        this.f83958A = (int) (((float) screenWidth) / 16.0f);
        Log.m165378d("zoom = " + this.f83958A);
        this.f83961a = new C32766c(getContext(), this, this);
    }

    /* renamed from: b */
    public void mo120644b() {
        Log.m165388i("JCameraView onResume");
        mo120641a(4);
        C32771d.m125799a().mo120686a(this.f83964d);
        C32771d.m125799a().mo120693a(this.f83975o, this.f83976p);
        this.f83961a.mo120738a(this.f83965e.getHolder(), this.f83970j);
    }

    /* renamed from: c */
    public void mo120647c() {
        Log.m165388i("JCameraView onPause");
        mo120652h();
        mo120641a(1);
        C32771d.m125799a().mo120701b(false);
        C32771d.m125799a().mo120699b(this.f83964d);
        C32771d.m125799a().mo120704e();
    }

    /* renamed from: k */
    private void m125615k() {
        setWillNotDraw(false);
        View inflate = LayoutInflater.from(this.f83964d).inflate(R.layout.camera_view, this);
        this.f83965e = (VideoView) inflate.findViewById(R.id.video_preview);
        this.f83966f = (VideoView) inflate.findViewById(R.id.video_play);
        this.f83974n = (ImageView) inflate.findViewById(R.id.image_photo);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_switch);
        this.f83975o = imageView;
        imageView.setImageResource(this.f83983w);
        this.f83976p = (ImageView) inflate.findViewById(R.id.image_flash);
        CaptureLayout captureLayout = (CaptureLayout) inflate.findViewById(R.id.capture_layout);
        this.f83967g = captureLayout;
        captureLayout.setDuration(this.f83986z);
        this.f83967g.mo120611a(this.f83984x, this.f83985y);
        this.f83968h = (FoucsView) inflate.findViewById(R.id.fouce_view);
        this.f83965e.getHolder().addCallback(this);
        this.f83975o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.JCameraView.View$OnClickListenerC327311 */

            public void onClick(View view) {
                JCameraView.this.f83961a.mo120740b(JCameraView.this.f83965e.getHolder(), JCameraView.this.f83970j);
            }
        });
        this.f83967g.setCaptureLisenter(new AbstractC32752a() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327322 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: a */
            public void mo120627a() {
                JCameraView.this.f83961a.mo120733a();
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: b */
            public void mo120629b() {
                JCameraView.this.f83961a.mo120736a(JCameraView.this.f83964d, JCameraView.this.f83965e.getHolder().getSurface(), JCameraView.this.f83970j);
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: b */
            public void mo120630b(long j) {
                JCameraView.this.f83961a.mo120737a(JCameraView.this.f83964d, false, j);
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: a */
            public void mo120628a(final long j) {
                JCameraView.this.f83967g.setTextWithAnimation(UIUtils.getString(JCameraView.this.f83964d, R.string.Lark_Legacy_RecordShortTime));
                JCameraView.this.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.cameraview.JCameraView.C327322.RunnableC327331 */

                    public void run() {
                        JCameraView.this.f83961a.mo120737a(JCameraView.this.f83964d, true, j);
                        JCameraView.this.f83967g.mo120615e();
                    }
                }, 1000 - j);
            }
        });
        this.f83967g.setTypeLisenter(new AbstractC32757f() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327343 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32757f
            /* renamed from: b */
            public void mo120671b() {
                JCameraView.this.f83961a.mo120739b();
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32757f
            /* renamed from: a */
            public void mo120670a() {
                JCameraView.this.f83961a.mo120741c(JCameraView.this.f83965e.getHolder(), JCameraView.this.f83970j);
            }
        });
        this.f83967g.setLeftClickListener(new AbstractC32753b() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327354 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32753b
            /* renamed from: a */
            public void mo120672a() {
                if (JCameraView.this.f83962b != null) {
                    JCameraView.this.f83962b.mo120672a();
                }
            }
        });
        this.f83967g.setRightClickListener(new AbstractC32753b() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327365 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32753b
            /* renamed from: a */
            public void mo120672a() {
                if (JCameraView.this.f83963c != null) {
                    JCameraView.this.f83963c.mo120672a();
                }
            }
        });
    }

    public void setJCameraLisenter(AbstractC32755d dVar) {
        this.f83973m = dVar;
    }

    public void setLeftClickListener(AbstractC32753b bVar) {
        this.f83962b = bVar;
    }

    public void setRightClickListener(AbstractC32753b bVar) {
        this.f83963c = bVar;
    }

    public JCameraView(Context context) {
        this(context, null);
    }

    public void setFeatures(int i) {
        this.f83967g.setButtonFeatures(i);
    }

    public void setMaxDuration(int i) {
        if (i > 0) {
            this.f83967g.setDuration(i);
        }
    }

    public void setMediaQuality(int i) {
        C32771d.m125799a().mo120685a(i);
    }

    public void setSaveVideoPath(String str) {
        C32771d.m125799a().mo120696a(str);
    }

    public void setTip(String str) {
        this.f83967g.setTip(str);
    }

    public void setErrorLisenter(AbstractC32754c cVar) {
        this.f83971k = cVar;
        C32771d.m125799a().mo120695a(cVar);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.m165388i("JCameraView SurfaceDestroyed");
        C32771d.m125799a().mo120704e();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.m165388i("JCameraView SurfaceCreated");
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.cameraview.$$Lambda$JCameraView$nalG_2MAYgvJZi0TIAtP_JeS38Q */

            public final void run() {
                JCameraView.lambda$nalG_2MAYgvJZi0TIAtP_JeS38Q(JCameraView.this);
            }
        });
    }

    /* renamed from: a */
    private void m125612a(boolean z) {
        VideoView videoView;
        final VideoView videoView2;
        if (z) {
            videoView = this.f83966f;
        } else {
            videoView = this.f83965e;
        }
        if (z) {
            videoView2 = this.f83965e;
        } else {
            videoView2 = this.f83966f;
        }
        videoView.setAlpha(1.0f);
        videoView.setVisibility(0);
        videoView2.animate().setDuration(200).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327418 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                videoView2.setVisibility(4);
            }
        });
    }

    @Override // com.ss.android.lark.cameraview.p1591e.AbstractC32787a
    /* renamed from: b */
    public void mo120645b(int i) {
        if (i == 1) {
            this.f83974n.setVisibility(4);
            AbstractC32755d dVar = this.f83973m;
            if (dVar != null) {
                dVar.mo120716a(this.f83978r);
            }
        } else if (i == 2) {
            mo120652h();
            this.f83966f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f83961a.mo120738a(this.f83965e.getHolder(), this.f83970j);
            AbstractC32755d dVar2 = this.f83973m;
            if (dVar2 != null) {
                dVar2.mo120717a(this.f83980t, this.f83979s);
            }
        }
        this.f83967g.mo120613c();
    }

    @Override // com.ss.android.lark.cameraview.p1591e.AbstractC32787a
    /* renamed from: a */
    public void mo120641a(int i) {
        if (i == 1) {
            this.f83974n.setVisibility(4);
        } else if (i == 2) {
            mo120652h();
            C26311p.m95291k(this.f83980t);
            this.f83966f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f83961a.mo120738a(this.f83965e.getHolder(), this.f83970j);
        } else if (i == 4) {
            this.f83966f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.f83967g.mo120613c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getPointerCount() == 1) {
                m125613c(motionEvent.getX(), motionEvent.getY());
            }
            if (motionEvent.getPointerCount() == 2) {
                Log.m165389i("JCameraView", "ACTION_DOWN = 2");
            }
        } else if (action == 1) {
            this.f83959B = true;
        } else if (action == 2) {
            if (motionEvent.getPointerCount() == 1) {
                this.f83959B = true;
            }
            if (motionEvent.getPointerCount() == 2) {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float sqrt = (float) Math.sqrt(Math.pow((double) (x - motionEvent.getX(1)), 2.0d) + Math.pow((double) (y - motionEvent.getY(1)), 2.0d));
                if (this.f83959B) {
                    this.f83960C = sqrt;
                    this.f83959B = false;
                }
                float f = this.f83960C;
                int i = this.f83958A;
                if (((int) (sqrt - f)) / i != 0) {
                    this.f83959B = true;
                    this.f83961a.mo120735a((sqrt - f) / ((float) i), SmEvents.EVENT_UA_ERROR);
                }
            }
        }
        return true;
    }

    public JCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m125613c(float f, float f2) {
        this.f83961a.mo120734a(f, f2, this.f83965e.getWidth(), this.f83965e.getHeight(), new C32743b.AbstractC32749c() {
            /* class com.ss.android.lark.cameraview.JCameraView.C327376 */

            @Override // com.ss.android.lark.cameraview.C32743b.AbstractC32749c
            /* renamed from: a */
            public void mo120673a() {
                JCameraView.this.f83968h.setVisibility(4);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = (float) this.f83965e.getMeasuredWidth();
        float measuredHeight = (float) this.f83965e.getMeasuredHeight();
        if (this.f83970j == BitmapDescriptorFactory.HUE_RED) {
            this.f83970j = measuredHeight / measuredWidth;
        }
    }

    /* renamed from: a */
    public void mo120640a(float f, float f2) {
        if (f > f2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((f2 / f) * ((float) getWidth())));
            layoutParams.gravity = 17;
            this.f83966f.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.lark.cameraview.p1591e.AbstractC32787a
    /* renamed from: b */
    public boolean mo120646b(float f, float f2) {
        if (f2 > ((float) this.f83967g.getTop())) {
            return false;
        }
        this.f83968h.setVisibility(0);
        if (f < ((float) (this.f83968h.getWidth() / 2))) {
            f = (float) (this.f83968h.getWidth() / 2);
        }
        if (f > ((float) (this.f83977q - (this.f83968h.getWidth() / 2)))) {
            f = (float) (this.f83977q - (this.f83968h.getWidth() / 2));
        }
        if (f2 < ((float) (this.f83968h.getWidth() / 2))) {
            f2 = (float) (this.f83968h.getWidth() / 2);
        }
        if (f2 > ((float) (this.f83967g.getTop() - (this.f83968h.getWidth() / 2)))) {
            f2 = (float) (this.f83967g.getTop() - (this.f83968h.getWidth() / 2));
        }
        FoucsView foucsView = this.f83968h;
        foucsView.setX(f - ((float) (foucsView.getWidth() / 2)));
        FoucsView foucsView2 = this.f83968h;
        foucsView2.setY(f2 - ((float) (foucsView2.getHeight() / 2)));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83968h, "scaleX", 1.0f, 0.6f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f83968h, "scaleY", 1.0f, 0.6f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f83968h, "alpha", 1.0f, 0.4f, 1.0f, 0.4f, 1.0f, 0.4f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).before(ofFloat3);
        animatorSet.setDuration(400L);
        animatorSet.start();
        return true;
    }

    @Override // com.ss.android.lark.cameraview.p1591e.AbstractC32787a
    /* renamed from: a */
    public void mo120642a(Bitmap bitmap, final String str) {
        m125612a(true);
        this.f83980t = str;
        this.f83979s = bitmap;
        m125611a(new Thread(new Runnable() {
            /* class com.ss.android.lark.cameraview.JCameraView.RunnableC327387 */

            public void run() {
                try {
                    if (JCameraView.this.f83969i == null) {
                        JCameraView.this.f83969i = new MediaPlayer();
                    } else {
                        JCameraView.this.f83969i.reset();
                    }
                    JCameraView.this.f83969i.setDataSource(str);
                    JCameraView.this.f83969i.setVideoScalingMode(1);
                    JCameraView.this.f83969i.setAudioStreamType(3);
                    JCameraView.this.f83969i.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                        /* class com.ss.android.lark.cameraview.JCameraView.RunnableC327387.C327391 */

                        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                            JCameraView.this.mo120640a((float) JCameraView.this.f83969i.getVideoWidth(), (float) JCameraView.this.f83969i.getVideoHeight());
                        }
                    });
                    JCameraView.this.f83969i.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        /* class com.ss.android.lark.cameraview.JCameraView.RunnableC327387.C327402 */

                        public void onPrepared(MediaPlayer mediaPlayer) {
                            Surface surface = JCameraView.this.f83966f.getHolder().getSurface();
                            if (surface != null && surface.isValid()) {
                                JCameraView.this.f83969i.setSurface(surface);
                                JCameraView.this.f83969i.start();
                            }
                        }
                    });
                    JCameraView.this.f83969i.setLooping(true);
                    JCameraView.this.f83969i.prepare();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        })).start();
        this.f83967g.mo120615e();
    }

    @Override // com.ss.android.lark.cameraview.p1591e.AbstractC32787a
    /* renamed from: a */
    public void mo120643a(Bitmap bitmap, boolean z) {
        this.f83978r = bitmap;
        this.f83974n.setImageBitmap(bitmap);
        this.f83974n.setVisibility(0);
        this.f83967g.mo120614d();
        this.f83967g.mo120612b();
        this.f83967g.mo120615e();
    }

    public JCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83972l = 35;
        this.f83959B = true;
        this.f83964d = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.duration_max, R.attr.iconLeft, R.attr.iconMargin, R.attr.iconRight, R.attr.iconSize, R.attr.iconSrc}, i, 0);
        this.f83981u = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(2, 35.0f, getResources().getDisplayMetrics()));
        this.f83982v = obtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics()));
        this.f83983w = obtainStyledAttributes.getResourceId(5, R.drawable.ic_svg_camera);
        this.f83984x = obtainStyledAttributes.getResourceId(1, 0);
        this.f83985y = obtainStyledAttributes.getResourceId(3, 0);
        this.f83986z = obtainStyledAttributes.getInteger(0, 15000);
        obtainStyledAttributes.recycle();
        m125614j();
        m125615k();
    }
}
