package com.ss.android.ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.AbstractC27455o;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27333c;
import com.ss.android.ad.splash.core.model.C27338f;
import com.ss.android.ad.splash.core.model.C27344l;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.core.p1252g.C27307c;
import com.ss.android.ad.splash.core.video.AbstractC27388b;
import com.ss.android.ad.splash.core.video.C27401e;
import com.ss.android.ad.splash.core.video.C27404f;
import com.ss.android.ad.splash.core.video2.AbstractC27429b;
import com.ss.android.ad.splash.core.video2.AbstractC27436f;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.C27430c;
import com.ss.android.ad.splash.core.video2.C27433e;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27475e;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.C27481j;
import com.ss.android.ad.splash.utils.C27484l;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public class BDASplashView extends RelativeLayout implements AbstractC27301f, HandlerC27486n.AbstractC27487a {

    /* renamed from: A */
    private TextView f67785A;

    /* renamed from: B */
    private BDASplashVideoView f67786B;

    /* renamed from: C */
    private Timer f67787C;

    /* renamed from: D */
    private int f67788D = -1;

    /* renamed from: E */
    private boolean f67789E = false;

    /* renamed from: a */
    public C27331b f67790a;

    /* renamed from: b */
    public BDASplashImageView f67791b;

    /* renamed from: c */
    public View f67792c;

    /* renamed from: d */
    public C27404f f67793d;

    /* renamed from: e */
    public AbstractC27353n f67794e;

    /* renamed from: f */
    public HandlerC27486n f67795f = new HandlerC27486n(this);

    /* renamed from: g */
    public boolean f67796g = false;

    /* renamed from: h */
    public AbstractC27436f f67797h;

    /* renamed from: i */
    public int f67798i = -1;

    /* renamed from: j */
    private ImageView f67799j;

    /* renamed from: k */
    private Space f67800k;

    /* renamed from: l */
    private ViewGroup f67801l;

    /* renamed from: m */
    private TextView f67802m;

    /* renamed from: n */
    private ImageView f67803n;

    /* renamed from: o */
    private RotateAnimation f67804o;

    /* renamed from: p */
    private ViewGroup f67805p;

    /* renamed from: q */
    private FrameLayout f67806q;

    /* renamed from: r */
    private TextView f67807r;

    /* renamed from: s */
    private TextView f67808s;

    /* renamed from: t */
    private boolean f67809t = false;

    /* renamed from: u */
    private long f67810u = 0;

    /* renamed from: v */
    private long f67811v = 0;

    /* renamed from: w */
    private FrameLayout f67812w;

    /* renamed from: x */
    private TextView f67813x;

    /* renamed from: y */
    private Space f67814y;

    /* renamed from: z */
    private TextView f67815z;

    /* renamed from: a */
    public boolean mo97153a(C27331b bVar) {
        boolean z;
        if (bVar == null) {
            return false;
        }
        if (C27287e.m99280t() != null) {
            this.f67799j.setImageResource(C27287e.m99280t().mo97990a(bVar.ae()));
        }
        int J = bVar.mo97444J();
        if (J == 0) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a pic ad");
            setImageTouchListener(bVar);
            z = m99038f(bVar);
        } else if (J == 2) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a video ad");
            z = m99034d(bVar);
        } else if (J == 3) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a video and pic ad");
            z = m99036e(bVar);
        } else if (J != 4) {
            z = false;
        } else {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a pic-squired ad");
            setImageTouchListener(bVar);
            z = m99040g(bVar);
        }
        if (z) {
            this.f67790a = bVar;
            this.f67809t = true;
            this.f67810u = bVar.mo97486c();
            long v = bVar.mo97509v();
            C27471a.m100285b(v, "binding data success, total show time of ad is " + this.f67810u + " ms");
            boolean ac = bVar.ac();
            this.f67789E = ac;
            if (ac) {
                m99035e();
            }
            C27287e.m99218Q().mo97338a(bVar);
            if (C27287e.aj()) {
                C27287e.m99218Q().mo97337a(this, Arrays.asList(this.f67799j, this.f67815z, this.f67807r, this.f67812w, this.f67801l));
            }
            m99032c(bVar);
            return true;
        }
        C27471a.m100285b(bVar.mo97509v(), "binding data failed, check if there are errors in splash ad json");
        return false;
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        if (message.what == 1) {
            C27477g.m100326a("SplashAdSdk", "display timeout");
            Timer timer = this.f67787C;
            if (timer != null) {
                timer.cancel();
                this.f67787C = null;
            }
            this.f67794e.mo97592a(this.f67790a);
        } else if (message.what == 2) {
            int i = this.f67788D - 1;
            this.f67788D = i;
            C27477g.m100326a("SplashAdSdk", "splash count down. display seconds left: " + i);
            if (i == 0) {
                Timer timer2 = this.f67787C;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f67787C = null;
                    return;
                }
                return;
            }
            String a = m99028a(i);
            this.f67802m.setText(a);
            this.f67813x.setText(a);
        }
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* renamed from: i */
    private void m99044i() {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView.ViewTreeObserver$OnPreDrawListenerC272506 */

            public boolean onPreDraw() {
                BDASplashView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                BDASplashView.this.mo97154b();
                BDASplashView.this.f67794e.mo97596b(BDASplashView.this.f67790a);
                return true;
            }
        });
    }

    /* renamed from: e */
    private void m99035e() {
        int i = (int) (this.f67810u / 1000);
        this.f67788D = i;
        this.f67802m.setText(m99028a(i));
        this.f67813x.setText(m99028a(this.f67788D));
    }

    /* renamed from: f */
    private void m99037f() {
        C27328l.m99425a().mo97421a(System.currentTimeMillis());
        this.f67794e.mo97595b();
    }

    /* renamed from: j */
    private void m99045j() {
        if (this.f67787C == null) {
            Timer timer = new Timer();
            this.f67787C = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.ss.android.ad.splash.core.BDASplashView.C272517 */

                public void run() {
                    Message obtainMessage = BDASplashView.this.f67795f.obtainMessage();
                    obtainMessage.what = 2;
                    BDASplashView.this.f67795f.sendMessage(obtainMessage);
                }
            }, (this.f67810u % 1000) + 1000, 1000);
        }
    }

    /* renamed from: k */
    private void m99046k() {
        if (this.f67791b != null && C27287e.ad() == 1) {
            this.f67791b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: b */
    public void mo97154b() {
        if (this.f67809t) {
            this.f67795f.removeMessages(1);
            this.f67795f.sendEmptyMessageDelayed(1, this.f67810u);
            m99037f();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m99044i();
        if (this.f67789E) {
            m99045j();
        }
        C27477g.m100326a("SplashAdSdk", "onAttachedToWindow");
        C27319h.m99371a().mo97381a(this.f67790a.mo97509v(), 1000);
        if (C27287e.m99269j() != null) {
            C27287e.m99269j().mo97140a(this.f67790a, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27477g.m100326a("SplashAdSdk", "Detached!");
        m99041h();
        C27287e.m99218Q().mo97345f();
        if (C27287e.m99269j() != null) {
            C27287e.m99269j().mo97142b(this.f67790a, this);
        }
    }

    /* renamed from: c */
    private void m99031c() {
        inflate(getContext(), R.layout.splash_ad_view, this);
        if (C27287e.m99281u() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C27287e.m99281u()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Throwable unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        m99033d();
    }

    /* renamed from: g */
    private void m99039g() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int a = (int) C27484l.m100391a(getContext(), 9.0f);
        layoutParams.setMargins(0, (int) C27484l.m100391a(getContext(), 14.0f), a, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(21);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(a);
        } else {
            layoutParams.addRule(11);
        }
        this.f67807r.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    private void m99041h() {
        C27404f fVar = this.f67793d;
        if (fVar != null) {
            fVar.mo97884c();
            this.f67793d = null;
        }
        RotateAnimation rotateAnimation = this.f67804o;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
            this.f67804o = null;
        }
        BDASplashImageView bDASplashImageView = this.f67791b;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f67791b.setImageBitmap(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C27433e.m100134a().mo97979b();
        AbstractC27436f fVar2 = this.f67797h;
        if (fVar2 != null) {
            fVar2.mo97933k();
            this.f67797h = null;
            this.f67786B = null;
        }
        if (this.f67787C != null) {
            C27477g.m100326a("SplashAdSdk", "splash_count_down. detach: timer canceled");
            this.f67787C.cancel();
            this.f67787C = null;
        }
    }

    /* renamed from: d */
    private void m99033d() {
        if (C27484l.m100400c(getContext())) {
            findViewById(R.id.splash_abnormity_bar_stub).setVisibility(0);
        }
        try {
            this.f67791b = (BDASplashImageView) findViewById(R.id.splash_view);
            try {
                this.f67786B = (BDASplashVideoView) findViewById(R.id.splash_video_view);
                this.f67800k = (Space) findViewById(R.id.banner_space);
                this.f67807r = (TextView) findViewById(R.id.ad_splash_has_wifi_loaded_text);
                this.f67792c = findViewById(R.id.splash_open_app_area);
                this.f67808s = (TextView) findViewById(R.id.splash_open_app_text);
                this.f67801l = (ViewGroup) findViewById(R.id.ad_ignore);
                this.f67802m = (TextView) findViewById(R.id.ad_skip_text);
                this.f67799j = (ImageView) findViewById(R.id.ad_splash_logo);
                this.f67812w = (FrameLayout) findViewById(R.id.ad_ab_bottom_skip_root_view);
                this.f67813x = (TextView) findViewById(R.id.ad_ab_bottom_skip_view);
                this.f67814y = (Space) findViewById(R.id.ad_ab_banner_space);
                this.f67815z = (TextView) findViewById(R.id.ad_ab_plash_has_wifi_loaded_text_view);
                this.f67785A = (TextView) findViewById(R.id.ad_ab_mark_view);
                if (C27287e.m99276p() != 0) {
                    this.f67807r.setText(C27287e.m99276p());
                    this.f67815z.setText(C27287e.m99276p());
                } else {
                    this.f67807r.setText(R.string.splash_ad_wifi_loaded_default);
                    this.f67815z.setText(R.string.splash_ad_wifi_loaded_default);
                }
                if (C27287e.m99278r() != 0) {
                    this.f67802m.setText(C27287e.m99278r());
                } else {
                    this.f67802m.setText(R.string.splash_ad_ignore);
                }
                if (C27287e.m99277q() != 0) {
                    this.f67802m.setBackgroundResource(C27287e.m99277q());
                    this.f67813x.setBackgroundResource(C27287e.m99277q());
                }
                this.f67803n = (ImageView) findViewById(R.id.ad_skip_loading);
                if (C27287e.m99279s() != 0) {
                    this.f67803n.setImageResource(C27287e.m99279s());
                } else {
                    this.f67803n.setImageResource(R.drawable.splash_ad_loading);
                }
                this.f67805p = (ViewGroup) findViewById(R.id.splash_video_layout);
                this.f67806q = (FrameLayout) findViewById(R.id.splash_video_frame);
                m99046k();
            } catch (ClassCastException e) {
                throw new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.splash_video_view).getClass().getClassLoader(), e);
            }
        } catch (ClassCastException e2) {
            throw new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.splash_view).getClass().getClassLoader(), e2);
        }
    }

    /* renamed from: a */
    public void mo97151a() {
        this.f67802m.setVisibility(4);
        this.f67803n.setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f67804o = rotateAnimation;
        rotateAnimation.setDuration(800);
        this.f67804o.setRepeatCount(-1);
        this.f67804o.setRepeatMode(1);
        this.f67804o.setInterpolator(new LinearInterpolator());
        this.f67803n.startAnimation(this.f67804o);
    }

    public void setSplashAdInteraction(AbstractC27353n nVar) {
        this.f67794e = nVar;
    }

    /* renamed from: i */
    private AbstractC27429b m99043i(final C27331b bVar) {
        return new C27430c() {
            /* class com.ss.android.ad.splash.core.BDASplashView.C272495 */

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: b */
            public void mo97177b() {
                BDASplashView.this.f67794e.mo97591a();
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: a */
            public void mo97174a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.mo97453S());
                    String str = "not_real_time";
                    if (bVar.mo97499m()) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    int i = 1;
                    jSONObject.putOpt("play_order", 1);
                    if (C27287e.ah() != -1) {
                        if (C27287e.ah() != 1) {
                            i = 2;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject.put("ad_sequence", C27368t.m99732a().mo97695z());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!C27480i.m100385a(bVar.mo97511x())) {
                        jSONObject2.put("log_extra", bVar.mo97511x());
                    }
                    jSONObject2.put("ad_fetch_time", bVar.mo97491f());
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2 = null;
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "play", jSONObject2);
                if (bVar.mo97445K() != null) {
                    C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
                    if (C27287e.m99259e().mo97696a()) {
                        C27287e.m99217P().mo97347a(BDASplashView.this.f67791b, "play", bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
                    } else {
                        C27287e.m99217P().mo97349c(BDASplashView.this.f67791b, bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
                    }
                }
                C27287e.m99218Q().mo97335a((long) BDASplashView.this.f67797h.mo97930h(), BDASplashView.this.f67797h.mo97925c(), BDASplashView.this.f67797h.mo97926d());
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: a */
            public void mo97175a(int i) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("duration", Long.toString((long) i));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo97491f());
                    if (!C27480i.m100385a(bVar.mo97511x())) {
                        jSONObject.put("log_extra", bVar.mo97511x());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "play_over", jSONObject);
                if (bVar.mo97445K() != null) {
                    C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
                    if (C27287e.m99259e().mo97696a()) {
                        C27287e.m99217P().mo97347a(BDASplashView.this.f67791b, "play_over", bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
                    } else {
                        C27287e.m99217P().mo97350d(BDASplashView.this.f67791b, bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
                    }
                }
                C27287e.m99218Q().mo97334a();
                BDASplashView.this.f67794e.mo97592a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: b */
            public void mo97178b(int i, int i2) {
                C27287e.m99218Q().mo97336a((long) i, (long) i2);
                m99057a(i, i2, "first_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: c */
            public void mo97179c(int i, int i2) {
                C27287e.m99218Q().mo97340b((long) i, (long) i2);
                m99057a(i, i2, "midpoint");
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: d */
            public void mo97180d(int i, int i2) {
                C27287e.m99218Q().mo97342c((long) i, (long) i2);
                m99057a(i, i2, "third_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: a */
            public void mo97176a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C27481j.m100386a(j, (long) i2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo97491f());
                    jSONObject.put("break_reason", BDASplashView.this.f67798i);
                    if (!C27480i.m100385a(bVar.mo97511x())) {
                        jSONObject.put("log_extra", bVar.mo97511x());
                    }
                    jSONObject2.put("break_reason", BDASplashView.this.f67798i);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "play_break", jSONObject);
                if (BDASplashView.this.f67798i != 1) {
                    C27287e.m99218Q().mo97343d();
                }
            }

            /* renamed from: a */
            private void m99057a(int i, int i2, String str) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    long j = (long) i2;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C27481j.m100386a((long) i, j));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo97491f());
                    if (!TextUtils.isEmpty(bVar.mo97511x())) {
                        jSONObject.put("log_extra", bVar.mo97511x());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", str, jSONObject);
            }
        };
    }

    private void setImageTouchListener(final C27331b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView.View$OnTouchListenerC272451 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((BDASplashView.this.getTouchDelegate() == null || !BDASplashView.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (BDASplashView.this.f67796g) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    BDASplashView.this.f67794e.mo97594a(bVar, new C27333c.C27334a().mo97523a(0).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97531b(BDASplashView.this.f67796g).mo97526a(str).mo97528a());
                }
                return true;
            }
        });
    }

    private void setSplashAdListener(final C27331b bVar) {
        this.f67793d.mo97880a(new AbstractC27388b.AbstractC27389a() {
            /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass14 */

            @Override // com.ss.android.ad.splash.core.video.AbstractC27388b.AbstractC27389a
            /* renamed from: a */
            public void mo97167a() {
                BDASplashView.this.f67794e.mo97592a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video.AbstractC27388b.AbstractC27389a
            /* renamed from: b */
            public void mo97170b(long j, int i) {
                BDASplashView.this.f67794e.mo97591a();
            }

            @Override // com.ss.android.ad.splash.core.video.AbstractC27388b.AbstractC27389a
            /* renamed from: c */
            public void mo97171c(long j, int i) {
                BDASplashView.this.f67794e.mo97593a(bVar, -1);
            }

            @Override // com.ss.android.ad.splash.core.video.AbstractC27388b.AbstractC27389a
            /* renamed from: a */
            public void mo97168a(long j, int i) {
                C27477g.m100326a("SplashAdSdk", "Video play Complete " + j);
                BDASplashView.this.f67794e.mo97592a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video.AbstractC27388b.AbstractC27389a
            /* renamed from: a */
            public void mo97169a(long j, int i, int i2, int i3) {
                BDASplashView.this.f67794e.mo97597b(bVar, new C27333c.C27334a().mo97527a(true).mo97524a(i2, i3).mo97528a());
            }
        });
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m99041h();
        }
    }

    public BDASplashView(Context context) {
        super(context);
        m99031c();
    }

    private void setSkipClickListener(final C27331b bVar) {
        this.f67812w.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass12 */

            public void onClick(View view) {
                if (BDASplashView.this.f67793d != null) {
                    BDASplashView.this.f67793d.mo97883b();
                }
                if (BDASplashView.this.f67797h != null) {
                    BDASplashView.this.f67798i = 2;
                    BDASplashView.this.f67797h.mo97923b();
                }
                BDASplashView.this.f67794e.mo97593a(bVar, -1);
            }
        });
        this.f67801l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass13 */

            public void onClick(View view) {
                if (BDASplashView.this.f67793d != null) {
                    BDASplashView.this.f67793d.mo97883b();
                }
                if (BDASplashView.this.f67797h != null) {
                    BDASplashView.this.f67798i = 2;
                    BDASplashView.this.f67797h.mo97923b();
                }
                if (C27287e.m99284x()) {
                    BDASplashView.this.mo97151a();
                }
                BDASplashView.this.f67794e.mo97593a(bVar, -1);
            }
        });
    }

    /* renamed from: c */
    private void m99032c(C27331b bVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            boolean a = C27478h.m100356a(getContext());
            C27344l Z = bVar.mo97460Z();
            if (Z != null && Z.mo97556a(2) && !bVar.ah() && a) {
                setLayoutDirection(0);
            }
        }
    }

    /* renamed from: g */
    private boolean m99040g(C27331b bVar) {
        if (!m99042h(bVar)) {
            return false;
        }
        if (bVar.mo97442H() != 1) {
            this.f67801l.setVisibility(8);
        } else if (bVar.ah()) {
            this.f67812w.setVisibility(0);
            setSkipClickListener(bVar);
        } else {
            this.f67801l.setVisibility(0);
            setSkipClickListener(bVar);
        }
        setSplashInfoStyle(bVar);
        m99037f();
        return true;
    }

    private void setSkipAndWifiPreloadLayout(C27331b bVar) {
        if (bVar.ah()) {
            if (bVar.mo97442H() == 1) {
                this.f67812w.setVisibility(0);
            } else {
                this.f67812w.setVisibility(8);
            }
            if (C27287e.m99258d()) {
                this.f67815z.setVisibility(0);
            }
            this.f67785A.setVisibility(0);
            m99030a(bVar.ah(), bVar.mo97497k());
            return;
        }
        if (bVar.mo97442H() == 1) {
            this.f67801l.setVisibility(0);
        } else {
            this.f67801l.setVisibility(8);
            m99039g();
        }
        if (C27287e.m99258d()) {
            this.f67807r.setVisibility(0);
        }
    }

    private void setSplashInfoStyle(C27331b bVar) {
        if (!bVar.ah()) {
            if (!bVar.mo97497k() && C27287e.m99272l() == 1) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                int a = (int) C27484l.m100391a(getContext(), 10.0f);
                layoutParams.setMargins(0, 0, a, (int) C27484l.m100391a(getContext(), 10.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.addRule(21);
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(a);
                } else {
                    layoutParams.addRule(11);
                }
                this.f67801l.setLayoutParams(layoutParams);
                m99039g();
            } else if (bVar != null && bVar.mo97442H() != 1) {
                m99039g();
            }
        }
    }

    /* renamed from: b */
    public void mo97155b(C27331b bVar) {
        float a = C27484l.m100391a(getContext(), (float) (bVar.mo97508u() / 2));
        if (a > C27484l.m100391a(getContext(), 40.0f)) {
            a = C27484l.m100391a(getContext(), 40.0f);
        }
        setTouchDelegate(new C27475e(new Rect(this.f67792c.getLeft(), (int) (((float) this.f67792c.getTop()) - a), this.f67792c.getRight(), (int) (((float) this.f67792c.getBottom()) + a)), this.f67792c));
    }

    /* renamed from: a */
    private String m99028a(int i) {
        if (i < 0) {
            i = 0;
        }
        if (C27287e.m99278r() != 0) {
            return String.format("%ds %s", Integer.valueOf(i), C27287e.m99221T().getResources().getString(C27287e.m99278r()));
        }
        return String.format("%ds %s", Integer.valueOf(i), C27287e.m99221T().getResources().getString(R.string.splash_ad_ignore));
    }

    /* renamed from: f */
    private boolean m99038f(final C27331b bVar) {
        if (!m99042h(bVar)) {
            return false;
        }
        if (bVar.mo97441G() == 3 && bVar.mo97497k()) {
            this.f67796g = true;
            this.f67792c.setVisibility(0);
            this.f67792c.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass15 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        BDASplashView.this.f67794e.mo97594a(bVar, new C27333c.C27334a().mo97523a(-1).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97531b(BDASplashView.this.f67796g).mo97526a("click_open_app_area").mo97528a());
                    }
                    return true;
                }
            });
            if (!C27480i.m100385a(bVar.mo97439E())) {
                this.f67808s.setText(bVar.mo97439E());
            } else if (C27287e.m99275o() != 0) {
                this.f67808s.setText(C27287e.m99275o());
            } else {
                this.f67808s.setText(R.string.splash_ad_app_button_text);
            }
            this.f67792c.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.BDASplashView.RunnableC272462 */

                public void run() {
                    if (BDASplashView.this.f67792c != null) {
                        BDASplashView.this.mo97155b(bVar);
                    }
                }
            });
        }
        if (bVar.mo97442H() != 1) {
            this.f67812w.setVisibility(8);
            this.f67801l.setVisibility(8);
        } else {
            if (bVar.ah()) {
                this.f67812w.setVisibility(0);
            } else {
                this.f67801l.setVisibility(0);
            }
            setSkipClickListener(bVar);
        }
        setSplashInfoStyle(bVar);
        m99037f();
        return true;
    }

    /* renamed from: h */
    private boolean m99042h(final C27331b bVar) {
        int i;
        try {
            boolean k = bVar.mo97497k();
            m99030a(bVar.ah(), k);
            if (k) {
                ViewGroup.LayoutParams layoutParams = this.f67800k.getLayoutParams();
                layoutParams.height = C27478h.m100331a();
                this.f67800k.setLayoutParams(layoutParams);
                this.f67800k.setVisibility(4);
                this.f67799j.setVisibility(8);
            } else {
                this.f67800k.setVisibility(8);
                this.f67799j.setVisibility(0);
            }
            if (C27287e.m99258d() && bVar.mo97440F() == 1) {
                if (bVar.ah()) {
                    this.f67815z.setVisibility(0);
                } else {
                    this.f67807r.setVisibility(0);
                }
            }
            C27338f t = bVar.mo97506t();
            String b = C27478h.m100364b(t);
            if (C27480i.m100385a(b) || C27287e.m99207F() == null) {
                return false;
            }
            if (TextUtils.isEmpty(t.mo97537d())) {
                C27287e.m99207F().mo98084a(this.f67791b, b, bVar.mo97440F(), new AbstractC27455o() {
                    /* class com.ss.android.ad.splash.core.BDASplashView.C272473 */
                });
            } else {
                C27287e.m99207F().mo98085a(this.f67791b, b, bVar.mo97440F(), t.mo97537d(), new AbstractC27455o() {
                    /* class com.ss.android.ad.splash.core.BDASplashView.C272484 */
                });
            }
            if (bVar.mo97444J() == 0 || bVar.mo97444J() == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.mo97453S()));
                String str = "not_real_time";
                if (bVar.mo97499m()) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (C27287e.ah() != -1) {
                    if (C27287e.ah() == 1) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jSONObject.put("awemelaunch", i);
                }
                jSONObject.put("ad_sequence", C27368t.m99732a().mo97695z());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!C27480i.m100385a(bVar.mo97511x())) {
                    jSONObject2.put("log_extra", bVar.mo97511x());
                }
                jSONObject2.put("ad_fetch_time", bVar.mo97491f());
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "show", jSONObject2);
                C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
                if (C27287e.m99259e().mo97696a()) {
                    C27287e.m99217P().mo97347a(this.f67791b, "show", bVar.mo97509v(), bVar.mo97451Q(), bVar.mo97511x(), true, -1, null, a);
                } else {
                    C27287e.m99217P().mo97346a(this.f67791b, bVar.mo97509v(), bVar.mo97451Q(), bVar.mo97511x(), true, -1, null, a);
                }
            }
            this.f67791b.mo97145a(bVar);
            this.f67791b.setInteraction(this.f67794e);
            this.f67791b.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f67794e.mo97591a();
            return false;
        }
    }

    /* renamed from: d */
    private boolean m99034d(final C27331b bVar) {
        boolean z;
        if (bVar.mo97445K() == null) {
            return false;
        }
        this.f67805p.setVisibility(0);
        this.f67793d = new C27404f(C27287e.m99221T(), this.f67806q);
        setSplashAdListener(bVar);
        C27349o K = bVar.mo97445K();
        if (bVar.mo97442H() == 1) {
            z = true;
        } else {
            z = false;
        }
        String b = C27478h.m100365b(K);
        if (C27480i.m100385a(b)) {
            return false;
        }
        if (C27287e.aj()) {
            this.f67800k.setVisibility(8);
            this.f67799j.setVisibility(0);
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            m99030a(bVar.ah(), bVar.mo97497k());
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView.View$OnTouchListenerC272528 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = BDASplashView.this.f67794e.mo97597b(bVar, new C27333c.C27334a().mo97527a(true).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97528a());
                        if (BDASplashView.this.f67797h != null && b) {
                            BDASplashView.this.f67798i = 1;
                            BDASplashView.this.f67797h.mo97923b();
                        }
                    }
                    return true;
                }
            });
            this.f67786B.setVisibility(0);
            AbstractC27436f a = C27478h.m100339a(this.f67786B);
            this.f67797h = a;
            a.mo97918a(m99043i(bVar));
            this.f67786B.setSurfaceLayoutParams(m99027a(bVar.mo97445K().mo97578g(), bVar.mo97445K().mo97577f()));
            boolean b2 = this.f67797h.mo97924b(b, K.mo97579h());
            if (b2) {
                C27433e.m100134a().mo97977a(bVar, C27287e.m99221T());
                C27433e.m100134a().mo97978a(this.f67797h, bVar.ak(), bVar.mo97486c());
            }
            return b2;
        }
        C27401e.C27403a c = new C27401e.C27403a().mo97864a(b).mo97870b(K.mo97575d()).mo97863a(bVar.mo97509v()).mo97862a(this.f67805p.getWidth()).mo97868b(this.f67805p.getHeight()).mo97865a(K.mo97571a()).mo97874c(bVar.mo97511x()).mo97872c(0).mo97866a(true).mo97871b(z).mo97876d(bVar.mo97453S()).mo97875c(bVar.ah()).mo97869b(bVar.mo97491f()).mo97879g(bVar.ae()).mo97873c(C27478h.m100335a((AbstractC27456a) bVar));
        this.f67793d.mo97881a(bVar.mo97499m());
        m99029a(K.mo97578g(), K.mo97577f(), c);
        return this.f67793d.mo97882a(c.mo97867a());
    }

    /* renamed from: e */
    private boolean m99036e(final C27331b bVar) {
        boolean z;
        JSONObject jSONObject;
        Object obj;
        boolean z2;
        JSONObject jSONObject2;
        Object obj2;
        if (bVar.mo97445K() == null || bVar.mo97506t() == null) {
            return false;
        }
        if (C27287e.aj()) {
            this.f67786B.setVisibility(0);
            int i = getResources().getDisplayMetrics().heightPixels;
            if (bVar.mo97497k()) {
                i -= C27478h.m100331a();
                this.f67799j.setVisibility(8);
            } else {
                this.f67799j.setVisibility(0);
            }
            C27349o K = bVar.mo97445K();
            int b = bVar.mo97506t().mo97535b();
            int f = K.mo97577f();
            if (b == 0 || f == 0) {
                return false;
            }
            boolean h = m99042h(bVar);
            AbstractC27436f a = C27478h.m100339a(this.f67786B);
            this.f67797h = a;
            a.mo97918a(m99043i(bVar));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i2 = (i - ((int) (((float) f) * (((float) i) / ((float) b))))) / 2;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
            this.f67786B.setSurfaceLayoutParams(layoutParams);
            String b2 = C27478h.m100365b(K);
            if (C27480i.m100385a(b2)) {
                return false;
            }
            if (!this.f67797h.mo97924b(b2, K.mo97579h()) || !h) {
                z2 = false;
            } else {
                z2 = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView.View$OnTouchListenerC272539 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = BDASplashView.this.f67794e.mo97597b(bVar, new C27333c.C27334a().mo97527a(false).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97528a());
                        if (BDASplashView.this.f67797h != null && b) {
                            BDASplashView.this.f67798i = 1;
                            BDASplashView.this.f67797h.mo97923b();
                        }
                    }
                    return true;
                }
            });
            this.f67786B.setTextureViewOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass10 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = BDASplashView.this.f67794e.mo97597b(bVar, new C27333c.C27334a().mo97527a(true).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97528a());
                        if (BDASplashView.this.f67797h != null && b) {
                            BDASplashView.this.f67798i = 1;
                            BDASplashView.this.f67797h.mo97923b();
                        }
                    }
                    return true;
                }
            });
            if (z2) {
                C27433e.m100134a().mo97977a(bVar, C27287e.m99221T());
                C27433e.m100134a().mo97978a(this.f67797h, bVar.ak(), bVar.mo97486c());
                m99037f();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    if (bVar.mo97499m()) {
                        obj2 = "real_time";
                    } else {
                        obj2 = "not_real_time";
                    }
                    jSONObject3.putOpt("show_type", obj2);
                    jSONObject3.putOpt("show_expected", Integer.valueOf(bVar.mo97453S()));
                    jSONObject4.putOpt("ad_extra_data", jSONObject3);
                    jSONObject4.putOpt("is_ad_event", "1");
                    jSONObject4.putOpt("log_extra", bVar.mo97511x());
                    jSONObject4.putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
                    jSONObject2 = jSONObject4;
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2 = null;
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "banner_show", jSONObject2);
            }
            return z2;
        }
        this.f67805p.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f67805p.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f67805p.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i3 = displayMetrics.heightPixels;
        if (bVar.mo97497k()) {
            i3 -= C27478h.m100331a();
            this.f67799j.setVisibility(8);
        } else {
            this.f67799j.setVisibility(0);
        }
        C27349o K2 = bVar.mo97445K();
        int b3 = bVar.mo97506t().mo97535b();
        int f2 = K2.mo97577f();
        if (b3 == 0 || f2 == 0) {
            return false;
        }
        boolean h2 = m99042h(bVar);
        int i4 = (int) (((float) f2) * (((float) i3) / ((float) b3)));
        this.f67793d = new C27404f(C27287e.m99221T(), this.f67806q);
        setSplashAdListener(bVar);
        String b4 = C27478h.m100365b(K2);
        if (C27480i.m100385a(b4)) {
            return false;
        }
        C27401e a2 = new C27401e.C27403a().mo97864a(b4).mo97870b(K2.mo97575d()).mo97863a(bVar.mo97509v()).mo97862a(displayMetrics.widthPixels).mo97868b(i4).mo97865a(K2.mo97571a()).mo97874c(bVar.mo97511x()).mo97872c((i3 - i4) / 2).mo97876d(bVar.mo97453S()).mo97866a(false).mo97871b(false).mo97875c(bVar.ah()).mo97879g(bVar.ae()).mo97873c(C27478h.m100335a((AbstractC27456a) bVar)).mo97867a();
        this.f67793d.mo97881a(bVar.mo97499m());
        if (!this.f67793d.mo97882a(a2) || !h2) {
            z = false;
        } else {
            z = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView.AnonymousClass11 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (BDASplashView.this.f67793d != null) {
                        BDASplashView.this.f67793d.mo97883b();
                    }
                    BDASplashView.this.f67794e.mo97597b(bVar, new C27333c.C27334a().mo97527a(false).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97528a());
                }
                return true;
            }
        });
        if (z) {
            m99037f();
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = new JSONObject();
            try {
                if (bVar.mo97499m()) {
                    obj = "real_time";
                } else {
                    obj = "not_real_time";
                }
                jSONObject5.putOpt("show_type", obj);
                jSONObject5.putOpt("show_expected", Integer.valueOf(bVar.mo97453S()));
                jSONObject6.putOpt("ad_extra_data", jSONObject5);
                jSONObject6.putOpt("is_ad_event", "1");
                jSONObject6.putOpt("log_extra", bVar.mo97511x());
                jSONObject6.putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
                jSONObject = jSONObject6;
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = null;
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "banner_show", jSONObject);
        }
        return z;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            C27433e.m100134a().mo97980c();
        } else if (i == 25) {
            C27433e.m100134a().mo97980c();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public BDASplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99031c();
    }

    /* renamed from: a */
    private FrameLayout.LayoutParams m99027a(int i, int i2) {
        int i3;
        int i4;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            displayMetrics = C27287e.m99221T().getResources().getDisplayMetrics();
        }
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        float f = ((float) i5) / ((float) i6);
        float f2 = ((float) i) / ((float) i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f2 > f) {
            i4 = (i * i6) / i2;
            i3 = i6;
        } else {
            if (f2 < f) {
                i3 = (i2 * i5) / i;
                i4 = i5;
            }
            return layoutParams;
        }
        int i7 = (-Math.abs(i4 - i5)) / 2;
        int i8 = (-Math.abs(i3 - i6)) / 2;
        layoutParams.setMargins(i7, i8, i7, i8);
        return layoutParams;
    }

    /* renamed from: a */
    private void m99030a(boolean z, boolean z2) {
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f67814y.getLayoutParams();
            layoutParams.height = C27478h.m100382j() - 4;
            this.f67814y.setLayoutParams(layoutParams);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f67812w.setPaddingRelative(4, 4, 0, 4);
            } else {
                this.f67812w.setPadding(4, 4, 0, 4);
            }
            if (!z2) {
                this.f67813x.setBackgroundResource(R.drawable.splash_ad_ab_media_ignore_bg);
                this.f67813x.setTextColor(getResources().getColor(R.color.splash_ad_ab_skip_media_text_color));
            } else {
                this.f67813x.setBackgroundResource(R.drawable.splash_ad_ab_ignore_bg);
                this.f67813x.setTextColor(getResources().getColor(R.color.splash_ad_ab_skip_normal_text_color));
            }
            this.f67785A.setVisibility(0);
        }
    }

    public BDASplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99031c();
    }

    /* renamed from: a */
    private void m99029a(int i, int i2, C27401e.C27403a aVar) {
        if (C27287e.ac() == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                displayMetrics = C27287e.m99221T().getResources().getDisplayMetrics();
            }
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            float f = ((float) i3) / ((float) i4);
            float f2 = ((float) i) / ((float) i2);
            int i5 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
            if (i5 > 0) {
                i = (i * i4) / i2;
                i2 = i4;
            } else if (f2 < f) {
                i2 = (i2 * i3) / i;
                i = i3;
            } else if (i5 == 0) {
                return;
            }
            aVar.mo97877e((-Math.abs(i - i3)) / 2).mo97878f((-Math.abs(i2 - i4)) / 2);
        }
    }
}
