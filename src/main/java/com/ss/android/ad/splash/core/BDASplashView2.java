package com.ss.android.ad.splash.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.AbstractC27455o;
import com.ss.android.ad.splash.core.interact.AbstractC27324b;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27333c;
import com.ss.android.ad.splash.core.model.C27338f;
import com.ss.android.ad.splash.core.model.C27339g;
import com.ss.android.ad.splash.core.model.C27344l;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.core.p1246a.AbstractView$OnClickListenerC27267a;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.p1250e.C27293a;
import com.ss.android.ad.splash.core.p1250e.C27294b;
import com.ss.android.ad.splash.core.p1252g.C27307c;
import com.ss.android.ad.splash.core.ui.BDASplashCountDownView;
import com.ss.android.ad.splash.core.ui.BDASplashInteractButton;
import com.ss.android.ad.splash.core.ui.BDASplashInteractVideoView;
import com.ss.android.ad.splash.core.ui.BDASplashSlideGuideView;
import com.ss.android.ad.splash.core.ui.C27374a;
import com.ss.android.ad.splash.core.video2.AbstractC27429b;
import com.ss.android.ad.splash.core.video2.AbstractC27436f;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.C27430c;
import com.ss.android.ad.splash.core.video2.C27433e;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27473c;
import com.ss.android.ad.splash.utils.C27475e;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.C27481j;
import com.ss.android.ad.splash.utils.C27484l;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public class BDASplashView2 extends RelativeLayout implements AbstractC27301f, HandlerC27486n.AbstractC27487a {

    /* renamed from: A */
    private RelativeLayout f67844A;

    /* renamed from: B */
    private Space f67845B;

    /* renamed from: C */
    private ImageView f67846C;

    /* renamed from: D */
    private TextView f67847D;

    /* renamed from: E */
    private BDASplashImageView f67848E;

    /* renamed from: F */
    private RelativeLayout f67849F;

    /* renamed from: G */
    private TextView f67850G;

    /* renamed from: H */
    private ImageView f67851H;

    /* renamed from: I */
    private FrameLayout f67852I;

    /* renamed from: J */
    private TextView f67853J;

    /* renamed from: K */
    private TextView f67854K;

    /* renamed from: L */
    private BDASplashCountDownView f67855L;

    /* renamed from: M */
    private BDASplashInteractButton f67856M;

    /* renamed from: N */
    private View f67857N;

    /* renamed from: O */
    private boolean f67858O;

    /* renamed from: P */
    private boolean f67859P;

    /* renamed from: Q */
    private String f67860Q;

    /* renamed from: R */
    private String f67861R;

    /* renamed from: S */
    private Timer f67862S;

    /* renamed from: T */
    private AlphaAnimation f67863T;

    /* renamed from: U */
    private GestureDetector f67864U;

    /* renamed from: V */
    private GestureDetector f67865V;

    /* renamed from: W */
    private GestureDetector.SimpleOnGestureListener f67866W;

    /* renamed from: a */
    public FrameLayout f67867a;
    private C27293a aa;
    private C27294b ab;
    private Space ac;
    private boolean ad = true;

    /* renamed from: b */
    public BDASplashVideoView f67868b;

    /* renamed from: c */
    public RelativeLayout f67869c;

    /* renamed from: d */
    public LinearLayout f67870d;

    /* renamed from: e */
    public BDASplashInteractVideoView f67871e;

    /* renamed from: f */
    public BDASplashSlideGuideView f67872f;

    /* renamed from: g */
    public ImageView f67873g;

    /* renamed from: h */
    public TextView f67874h;

    /* renamed from: i */
    public View f67875i;

    /* renamed from: j */
    public boolean f67876j;

    /* renamed from: k */
    public long f67877k;

    /* renamed from: l */
    public int f67878l = -1;

    /* renamed from: m */
    public boolean f67879m = true;

    /* renamed from: n */
    public boolean f67880n;

    /* renamed from: o */
    public C27331b f67881o;

    /* renamed from: p */
    public AbstractC27353n f67882p;

    /* renamed from: q */
    public HandlerC27486n f67883q = new HandlerC27486n(this);

    /* renamed from: r */
    public int f67884r = 0;

    /* renamed from: s */
    public int f67885s = 1;

    /* renamed from: t */
    public AnimatorSet f67886t;

    /* renamed from: u */
    public ValueAnimator f67887u;

    /* renamed from: v */
    public AbstractC27436f f67888v;

    /* renamed from: w */
    public boolean f67889w = false;

    /* renamed from: x */
    private final long f67890x = 300;

    /* renamed from: y */
    private LinearLayout f67891y;

    /* renamed from: z */
    private ViewStub f67892z;

    /* renamed from: a */
    public boolean mo97193a(C27331b bVar) {
        boolean z;
        List<View> list;
        if (bVar == null) {
            return false;
        }
        if (C27287e.m99280t() != null) {
            this.f67846C.setImageResource(C27287e.m99280t().mo97990a(bVar.ae()));
        }
        int J = bVar.mo97444J();
        if (J == 0) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a pic ad");
            setImageTouchListener(bVar);
            z = m99073e(bVar);
        } else if (J == 2) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a video ad");
            z = m99079i(bVar);
        } else if (J == 3) {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a video and pic ad");
            z = m99075g(bVar);
        } else if (J != 4) {
            z = false;
        } else {
            C27471a.m100285b(bVar.mo97509v(), "prepare to bind ad data which is a pic-squired ad");
            setImageTouchListener(bVar);
            z = m99074f(bVar);
        }
        if (z) {
            this.f67881o = bVar;
            this.f67877k = bVar.mo97486c();
            long v = bVar.mo97509v();
            C27471a.m100285b(v, "binding data success, total show time of ad is " + this.f67877k + " ms");
            setupUIWidgets(bVar);
            m99072d(bVar);
            m99070c(bVar);
            this.ab = new C27294b(getContext(), bVar, this.f67844A, new C27294b.AbstractC27300a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.C272541 */

                @Override // com.ss.android.ad.splash.core.p1250e.C27294b.AbstractC27300a
                /* renamed from: a */
                public void mo97209a() {
                    BDASplashView2.this.f67880n = true;
                    BDASplashView2.this.f67882p.mo97598c(BDASplashView2.this.f67881o);
                    if (BDASplashView2.this.f67888v != null) {
                        BDASplashView2.this.f67878l = 8;
                        BDASplashView2.this.mo97201g();
                    }
                    C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "swipe_up");
                }
            });
            C27287e.m99218Q().mo97338a(this.f67881o);
            if (this.ab.mo97324a() != null) {
                list = Arrays.asList(this.f67846C, this.f67852I, this.f67847D, this.ab.mo97324a(), this.f67874h, this.f67875i, this.f67857N);
            } else {
                list = Arrays.asList(this.f67846C, this.f67852I, this.f67847D, this.f67874h, this.f67875i, this.f67857N);
            }
            C27287e.m99218Q().mo97337a(this, list);
            return true;
        }
        C27471a.m100285b(bVar.mo97509v(), "binding data failed, check if there are errors in splash ad json");
        return false;
    }

    /* renamed from: a */
    public boolean mo97192a(View view, MotionEvent motionEvent) {
        C27293a aVar;
        C27294b bVar = this.ab;
        if (bVar != null && bVar.mo97325a(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector = this.f67865V;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 || (aVar = this.aa) == null || !aVar.mo97238a(motionEvent)) {
            return this.f67889w;
        }
        return true;
    }

    /* renamed from: a */
    public void mo97188a(C27331b bVar, float f, float f2) {
        C27471a.m100285b(bVar.mo97509v(), "click ad");
        C27333c a = new C27333c.C27334a().mo97523a(0).mo97524a((int) f, (int) f2).mo97531b(this.f67876j).mo97526a(this.f67876j ? "click_normal_area" : "").mo97528a();
        this.f67880n = true;
        this.f67882p.mo97594a(bVar, a);
    }

    /* renamed from: a */
    public void mo97189a(C27331b bVar, float f, float f2, boolean z) {
        mo97190a(bVar, f, f2, z, null);
    }

    /* renamed from: a */
    public void mo97190a(C27331b bVar, float f, float f2, boolean z, String str) {
        BDASplashInteractVideoView bDASplashInteractVideoView;
        C27471a.m100285b(bVar.mo97509v(), "click ad");
        C27333c.C27334a a = new C27333c.C27334a().mo97527a(z).mo97524a((int) f, (int) f2);
        if (!TextUtils.isEmpty(str)) {
            a.mo97530b(str);
        }
        if (this.f67859P) {
            a.mo97529b(this.f67885s);
            BDASplashInteractVideoView bDASplashInteractVideoView2 = this.f67871e;
            if (!(bDASplashInteractVideoView2 == null || bDASplashInteractVideoView2.getBDAVideoController() == null)) {
                a.mo97525a((long) this.f67871e.getBDAVideoController().mo97929g());
            }
        }
        boolean b = this.f67882p.mo97597b(bVar, a.mo97528a());
        if (b) {
            this.f67880n = true;
            this.f67878l = 1;
            if (this.f67888v != null) {
                mo97201g();
            }
        }
        if (b && (bDASplashInteractVideoView = this.f67871e) != null && bDASplashInteractVideoView.getBDAVideoController() != null) {
            this.f67871e.setBreakReason(this.f67878l);
            this.f67871e.getBDAVideoController().mo97923b();
        }
    }

    /* renamed from: a */
    public boolean mo97191a() {
        if (this.f67884r > 1) {
            return true;
        }
        return false;
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* renamed from: i */
    private void m99078i() {
        this.f67870d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass10 */

            /* renamed from: b */
            private int f67895b;

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (BDASplashView2.this.f67870d != null) {
                    this.f67895b++;
                    int[] iArr = {0, 0};
                    BDASplashView2.this.f67870d.getLocationOnScreen(iArr);
                    int i9 = iArr[1];
                    int paddingTop = BDASplashView2.this.f67870d.getPaddingTop();
                    int a = C27473c.m100298a(BDASplashView2.this.f67870d, i9);
                    C27477g.m100326a("SplashAdSdk", "screenY:" + i9 + " paddingTop:" + paddingTop + " safeInsetTop:" + a);
                    if (i9 + paddingTop < a) {
                        int i10 = (a - i9) - paddingTop;
                        C27477g.m100326a("SplashAdSdk", "adjust translationY:" + i10 + ". triedTimes:" + this.f67895b);
                        BDASplashView2.this.f67870d.setTranslationY(BDASplashView2.this.f67870d.getTranslationY() + ((float) i10));
                        BDASplashView2.this.f67870d.removeOnLayoutChangeListener(this);
                    } else {
                        C27477g.m100326a("SplashAdSdk", "no need to adjust translationY. triedTimes:" + this.f67895b);
                    }
                    if (this.f67895b >= 3) {
                        BDASplashView2.this.f67870d.removeOnLayoutChangeListener(this);
                    }
                }
            }
        });
    }

    /* renamed from: k */
    private void m99082k() {
        C27477g.m100326a("SplashAdSdk", "setSplashShowTime: ");
        C27328l.m99425a().mo97421a(System.currentTimeMillis());
        this.f67882p.mo97595b();
    }

    /* renamed from: l */
    private void m99084l() {
        if (this.f67862S == null) {
            Timer timer = new Timer();
            this.f67862S = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass19 */

                public void run() {
                    Message obtainMessage = BDASplashView2.this.f67883q.obtainMessage();
                    obtainMessage.what = 2;
                    BDASplashView2.this.f67883q.sendMessage(obtainMessage);
                }
            }, (this.f67877k % 1000) + 1000, 1000);
        }
    }

    /* renamed from: f */
    public void mo97200f() {
        this.f67883q.removeMessages(1);
        this.f67883q.sendEmptyMessageDelayed(1, this.f67877k);
    }

    /* renamed from: g */
    public void mo97201g() {
        AnonymousClass25 r0 = new Runnable() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass25 */

            public void run() {
                BDASplashView2.this.f67888v.mo97923b();
            }
        };
        if (C27287e.m99259e().mo97705j()) {
            post(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: d */
    public void mo97198d() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setDuration(120);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setFillAfter(true);
        m99068a(this.f67846C, alphaAnimation);
        m99068a(this.f67847D, alphaAnimation);
        m99068a(this.f67854K, alphaAnimation);
    }

    /* renamed from: e */
    public void mo97199e() {
        BDASplashInteractVideoView bDASplashInteractVideoView;
        C27471a.m100285b(this.f67881o.mo97509v(), "skip ad");
        if (!this.f67859P || (bDASplashInteractVideoView = this.f67871e) == null) {
            this.f67882p.mo97593a(this.f67881o, -1);
        } else {
            bDASplashInteractVideoView.setBreakReason(2);
            this.f67871e.mo97722b();
        }
        if (this.f67888v != null) {
            this.f67878l = 2;
            mo97201g();
        }
        this.f67880n = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m99084l();
        m99082k();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass20 */

            public boolean onPreDraw() {
                BDASplashView2.this.getViewTreeObserver().removeOnPreDrawListener(this);
                BDASplashView2.this.mo97200f();
                BDASplashView2.this.f67882p.mo97596b(BDASplashView2.this.f67881o);
                return true;
            }
        });
        C27319h.m99371a().mo97381a(this.f67881o.mo97509v(), 1000);
        if (C27287e.m99269j() != null) {
            C27287e.m99269j().mo97140a(this.f67881o, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27477g.m100326a("SplashAdSdk", "Detached!");
        m99087m();
        C27287e.m99218Q().mo97345f();
        if (C27287e.m99269j() != null) {
            C27287e.m99269j().mo97142b(this.f67881o, this);
        }
    }

    /* renamed from: h */
    private void m99076h() {
        if (C27287e.m99276p() != 0) {
            this.f67847D.setText(C27287e.m99276p());
        } else {
            this.f67847D.setText(R.string.splash_ad_wifi_loaded_default);
        }
        if (C27287e.m99278r() != 0) {
            this.f67853J.setText(C27287e.m99278r());
        } else {
            this.f67853J.setText(R.string.splash_ad_ignore);
        }
        if (C27287e.m99277q() != 0) {
            this.f67853J.setBackgroundResource(C27287e.m99277q());
        }
        if (C27287e.ad() == 1) {
            this.f67848E.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: j */
    private void m99080j() {
        if (this.f67859P) {
            C27471a.m100285b(this.f67881o.mo97509v(), "interactive splash ad, adding volume button");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) C27484l.m100391a(getContext(), 16.0f), (int) C27484l.m100391a(getContext(), 16.0f));
            layoutParams.rightMargin = (int) C27484l.m100391a(getContext(), 15.0f);
            layoutParams.gravity = 15;
            this.f67873g.setLayoutParams(layoutParams);
            C27484l.m100395a(this.f67873g, this.f67870d);
            this.f67873g.setOnClickListener(new AbstractView$OnClickListenerC27267a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass18 */

                @Override // com.ss.android.ad.splash.core.p1246a.AbstractView$OnClickListenerC27267a
                /* renamed from: a */
                public void mo97216a(View view) {
                    BDASplashView2 bDASplashView2 = BDASplashView2.this;
                    bDASplashView2.f67879m = !bDASplashView2.f67879m;
                    if (BDASplashView2.this.f67879m) {
                        BDASplashView2.this.f67873g.setImageResource(R.drawable.splash_ad_mute);
                    } else {
                        BDASplashView2.this.f67873g.setImageResource(R.drawable.splash_ad_unmute);
                    }
                    if (BDASplashView2.this.f67871e != null) {
                        BDASplashView2.this.f67871e.setMute(BDASplashView2.this.f67879m);
                    }
                    HashMap<String, Object> hashMap = new HashMap<>(1);
                    hashMap.put("position", Integer.valueOf(2 - BDASplashView2.this.f67885s));
                    C27278b.m99171a().mo97296a(BDASplashView2.this.f67881o, 0, "click_sound_switch", null, hashMap);
                }
            });
        }
    }

    /* renamed from: m */
    private void m99087m() {
        BDASplashImageView bDASplashImageView = this.f67848E;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f67848E.setImageBitmap(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C27433e.m100134a().mo97979b();
        BDASplashInteractVideoView bDASplashInteractVideoView = this.f67871e;
        if (bDASplashInteractVideoView != null) {
            bDASplashInteractVideoView.mo97723c();
        }
        AbstractC27436f fVar = this.f67888v;
        if (fVar != null) {
            fVar.mo97933k();
            this.f67888v = null;
            this.f67868b = null;
        }
        if (this.f67862S != null) {
            C27477g.m100326a("SplashAdSdk", "splash_count_down. detach: timer canceled");
            this.f67862S.cancel();
            this.f67862S = null;
        }
        AlphaAnimation alphaAnimation = this.f67863T;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.f67863T = null;
        }
        BDASplashSlideGuideView bDASplashSlideGuideView = this.f67872f;
        if (bDASplashSlideGuideView != null) {
            bDASplashSlideGuideView.mo97738b();
        }
        this.f67859P = false;
        AnimatorSet animatorSet = this.f67886t;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f67886t = null;
        }
        ValueAnimator valueAnimator = this.f67887u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f67887u = null;
        }
    }

    /* renamed from: b */
    public void mo97195b() {
        this.f67874h.setVisibility(0);
        this.f67874h.setTextSize(1, 15.0f);
        this.f67874h.setTextColor(-1);
        this.f67874h.setY((float) this.f67844A.getBottom());
        this.f67874h.setGravity(17);
        this.f67874h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f67875i.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f67875i.setVisibility(0);
        this.f67875i.setY(((float) this.f67844A.getBottom()) - C27484l.m100391a(getContext(), 50.0f));
    }

    /* renamed from: c */
    public void mo97197c() {
        String C = this.f67881o.mo97437C();
        if (!TextUtils.isEmpty(C)) {
            this.f67856M.setText(C);
        } else {
            this.f67856M.setText(getContext().getResources().getString(R.string.splash_ad_click_to_see_more));
        }
        this.f67856M.setVisibility(0);
        this.f67856M.setOnClickListener(new AbstractView$OnClickListenerC27267a() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.C272659 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.ad.splash.core.p1246a.AbstractView$OnClickListenerC27267a
            /* renamed from: a */
            public void mo97216a(View view) {
                BDASplashView2 bDASplashView2 = BDASplashView2.this;
                bDASplashView2.mo97190a(bDASplashView2.f67881o, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true, "click_button");
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f67863T = alphaAnimation;
        alphaAnimation.setDuration(400);
        this.f67863T.setStartOffset(2040);
        this.f67863T.setInterpolator(new LinearInterpolator());
        this.f67856M.startAnimation(this.f67863T);
    }

    public void setSplashAdInteraction(AbstractC27353n nVar) {
        this.f67882p = nVar;
    }

    /* renamed from: m */
    private AbstractC27429b m99086m(final C27331b bVar) {
        return new C27430c() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass24 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: c */
            public void mo97226c() {
                mo97966i();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: e */
            public void mo97229e() {
                mo97967j();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: d */
            public void mo97228d() {
                mo97959a(BDASplashView2.this.f67881o);
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: b */
            public void mo97177b() {
                BDASplashView2.this.f67880n = true;
                BDASplashView2.this.f67882p.mo97591a();
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
                        C27287e.m99217P().mo97347a(null, "play", bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
                    } else {
                        C27287e.m99217P().mo97349c(null, bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
                    }
                }
                C27287e.m99218Q().mo97335a((long) BDASplashView2.this.f67888v.mo97930h(), BDASplashView2.this.f67888v.mo97925c(), BDASplashView2.this.f67888v.mo97926d());
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: c */
            public void mo97227c(int i) {
                mo97960a(BDASplashView2.this.f67881o, i);
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: b */
            public void mo97225b(int i) {
                if (C27287e.m99259e().mo97708m()) {
                    BDASplashView2 bDASplashView2 = BDASplashView2.this;
                    bDASplashView2.mo97187a(Math.min((long) i, bDASplashView2.f67877k));
                }
            }

            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: a */
            public void mo97175a(int i) {
                if (!BDASplashView2.this.f67880n || !C27287e.m99259e().mo97706k()) {
                    BDASplashView2.this.f67880n = true;
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
                            C27287e.m99217P().mo97347a(null, "play_over", bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
                        } else {
                            C27287e.m99217P().mo97350d(null, bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
                        }
                    }
                    C27287e.m99218Q().mo97334a();
                    BDASplashView2.this.f67882p.mo97592a(bVar);
                }
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: c */
            public void mo97179c(int i, int i2) {
                C27287e.m99218Q().mo97340b((long) i, (long) i2);
                m99108a(i, i2, "midpoint");
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: d */
            public void mo97180d(int i, int i2) {
                C27287e.m99218Q().mo97342c((long) i, (long) i2);
                m99108a(i, i2, "third_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.C27430c
            /* renamed from: b */
            public void mo97178b(int i, int i2) {
                C27287e.m99218Q().mo97336a((long) i, (long) i2);
                m99108a(i, i2, "first_quartile");
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
                    jSONObject.put("break_reason", BDASplashView2.this.f67878l);
                    if (!C27480i.m100385a(bVar.mo97511x())) {
                        jSONObject.put("log_extra", bVar.mo97511x());
                    }
                    jSONObject2.put("break_reason", BDASplashView2.this.f67878l);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "play_break", jSONObject);
                if (BDASplashView2.this.f67878l != 1) {
                    C27287e.m99218Q().mo97343d();
                }
            }

            /* renamed from: a */
            private void m99108a(int i, int i2, String str) {
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

    /* renamed from: c */
    private boolean m99071c(int i) {
        if (!this.f67859P || this.f67885s != 1 || i <= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m99074f(C27331b bVar) {
        if (!m99083k(bVar)) {
            return false;
        }
        m99078i();
        return true;
    }

    private void setImageTouchListener(final C27331b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass22 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if ((BDASplashView2.this.getTouchDelegate() == null || !BDASplashView2.this.getTouchDelegate().onTouchEvent(motionEvent)) && !BDASplashView2.this.mo97192a(view, motionEvent) && motionEvent.getAction() == 1) {
                    BDASplashView2.this.mo97188a(bVar, motionEvent.getRawX(), motionEvent.getRawY());
                }
                return true;
            }
        });
    }

    private void setSkipClickListener(C27331b bVar) {
        this.f67852I.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass21 */

            public void onClick(View view) {
                BDASplashView2.this.mo97199e();
            }
        });
    }

    private void setupUIWidgets(C27331b bVar) {
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        m99081j(bVar);
        setupSkipButtonHitArea(bVar);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m99087m();
        }
    }

    private void setupWifiPreloadHindLayout(C27331b bVar) {
        String ab2 = bVar.ab();
        if (!TextUtils.isEmpty(ab2)) {
            this.f67847D.setVisibility(0);
            this.f67847D.setText(ab2);
        }
    }

    /* renamed from: b */
    public ObjectAnimator mo97194b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public BDASplashView2(Context context) {
        super(context);
        m99067a(context);
    }

    /* renamed from: c */
    private void m99070c(C27331b bVar) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 17) {
            boolean a = C27478h.m100356a(getContext());
            C27344l Z = bVar.mo97460Z();
            if (bVar.aa() == null || bVar.aa().mo97540b() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (Z != null && Z.mo97556a(2) && z && a) {
                this.f67870d.setLayoutDirection(0);
            }
        }
    }

    /* renamed from: a */
    public ObjectAnimator mo97185a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", view.getY(), view.getY() - C27484l.m100391a(getContext(), 30.0f));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public void onWindowFocusChanged(boolean z) {
        AbstractC27436f fVar;
        super.onWindowFocusChanged(z);
        C27471a.m100287b("hasWindowFocus: " + z);
        if (C27287e.m99259e().mo97706k() && z != this.ad && (fVar = this.f67888v) != null && !this.f67880n) {
            this.ad = z;
            if (z) {
                fVar.mo97932j();
            } else {
                fVar.mo97931i();
            }
        }
    }

    /* renamed from: a */
    private GradientDrawable m99065a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = (float) i;
        gradientDrawable.setCornerRadii(new float[]{C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f), C27484l.m100391a(getContext(), f)});
        return gradientDrawable;
    }

    /* renamed from: d */
    private void m99072d(C27331b bVar) {
        int g = bVar.mo97492g();
        if (g == 1) {
            this.aa = new C27293a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass12 */

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) < Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
                        return false;
                    }
                    C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "slide_up");
                    return false;
                }
            };
        } else if (g == 2) {
            this.aa = new C27293a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass23 */

                public boolean onDown(MotionEvent motionEvent) {
                    BDASplashView2.this.f67889w = false;
                    return true;
                }

                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    BDASplashView2.this.f67889w = true;
                    return true;
                }

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (motionEvent.getRawY() >= motionEvent2.getRawY() && motionEvent.getRawY() - motionEvent2.getRawY() >= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
                        C27471a.m100287b("slide up ad view with speed");
                        BDASplashView2.this.f67880n = true;
                        BDASplashView2.this.f67882p.mo97598c(BDASplashView2.this.f67881o);
                        if (BDASplashView2.this.f67888v != null) {
                            BDASplashView2.this.f67878l = 8;
                            BDASplashView2.this.mo97201g();
                        }
                        C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "swipe_up");
                    }
                    return true;
                }
            };
        } else if (g == 3) {
            this.aa = new C27293a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass26 */

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return true;
                }

                public boolean onDown(MotionEvent motionEvent) {
                    BDASplashView2.this.f67889w = false;
                    return super.onDown(motionEvent);
                }

                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (BDASplashView2.this.f67889w) {
                        return true;
                    }
                    BDASplashView2.this.f67889w = true;
                    if (f2 > BitmapDescriptorFactory.HUE_RED) {
                        C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "slide_up");
                    }
                    return true;
                }
            };
        } else if (g == 4) {
            this.aa = new C27293a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass27 */

                /* renamed from: a */
                public boolean f67918a;

                public boolean onDown(MotionEvent motionEvent) {
                    BDASplashView2.this.f67889w = false;
                    return super.onDown(motionEvent);
                }

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    BDASplashView2.this.f67889w = true;
                    return true;
                }

                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (!BDASplashView2.this.f67889w && f2 > BitmapDescriptorFactory.HUE_RED) {
                        C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "slide_up");
                    }
                    BDASplashView2.this.f67889w = true;
                    if (!this.f67918a && f2 >= BitmapDescriptorFactory.HUE_RED && BDASplashView2.this.mo97191a()) {
                        TextView textView = BDASplashView2.this.f67874h;
                        BDASplashView2 bDASplashView2 = BDASplashView2.this;
                        String h = bDASplashView2.f67881o.mo97493h();
                        textView.setText(bDASplashView2.mo97186a(h, BDASplashView2.this.f67884r + ""));
                        if (BDASplashView2.this.f67874h.getVisibility() != 0) {
                            BDASplashView2.this.mo97195b();
                        }
                        this.f67918a = true;
                        if (BDASplashView2.this.f67886t == null) {
                            BDASplashView2.this.f67886t = new AnimatorSet();
                            C272561 r8 = new AnimatorListenerAdapter() {
                                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass27.C272561 */

                                public void onAnimationEnd(Animator animator) {
                                    AnonymousClass27.this.f67918a = false;
                                }
                            };
                            ObjectAnimator duration = ObjectAnimator.ofFloat(BDASplashView2.this.f67874h, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(300L);
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(BDASplashView2.this.f67875i, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(300L);
                            duration.addListener(r8);
                            duration.setStartDelay(1000);
                            duration2.setStartDelay(1000);
                            AnimatorSet animatorSet = BDASplashView2.this.f67886t;
                            BDASplashView2 bDASplashView22 = BDASplashView2.this;
                            AnimatorSet.Builder play = animatorSet.play(bDASplashView22.mo97185a(bDASplashView22.f67874h));
                            BDASplashView2 bDASplashView23 = BDASplashView2.this;
                            play.with(bDASplashView23.mo97194b(bDASplashView23.f67875i)).before(duration).before(duration2);
                        }
                        BDASplashView2.this.f67886t.start();
                        HashMap<String, Object> hashMap = new HashMap<>(1);
                        hashMap.put("refer", "tips");
                        C27278b.m99171a().mo97296a(BDASplashView2.this.f67881o, 0, "othershow", hashMap, null);
                    }
                    return true;
                }
            };
        } else if (g != 5) {
            this.aa = null;
        } else if (!bVar.mo97497k()) {
            this.f67844A.setBackgroundColor(-16777216);
            this.aa = new C27293a() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass28 */

                /* renamed from: b */
                private boolean f67922b;

                /* renamed from: c */
                private boolean f67923c;

                public boolean onDown(MotionEvent motionEvent) {
                    this.f67922b = false;
                    BDASplashView2.this.f67889w = false;
                    return true;
                }

                @Override // com.ss.android.ad.splash.core.p1250e.C27293a
                /* renamed from: a */
                public boolean mo97238a(MotionEvent motionEvent) {
                    float y = BDASplashView2.this.f67867a.getY();
                    if (this.f67922b || !BDASplashView2.this.f67889w || y >= BitmapDescriptorFactory.HUE_RED) {
                        return super.mo97238a(motionEvent);
                    }
                    this.f67922b = true;
                    m99121a(BDASplashView2.this.f67867a, y);
                    BDASplashView2.this.f67887u.setDuration((long) (((-y) / C27484l.m100391a(BDASplashView2.this.getContext(), 42.0f)) * 300.0f));
                    BDASplashView2.this.f67887u.start();
                    return true;
                }

                /* renamed from: a */
                private void m99121a(View view, float f) {
                    BDASplashView2.this.f67887u = ObjectAnimator.ofFloat(view, "y", f, 0.0f);
                    BDASplashView2.this.f67887u.setInterpolator(new Interpolator() {
                        /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass28.animationInterpolatorC272571 */

                        public float getInterpolation(float f) {
                            float f2 = f - 1.0f;
                            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                        }
                    });
                }

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    float f3;
                    BDASplashView2.this.f67889w = true;
                    if (this.f67922b) {
                        return true;
                    }
                    this.f67922b = true;
                    ObjectAnimator objectAnimator = null;
                    int i = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i < 0) {
                        float a = C27484l.m100391a(BDASplashView2.this.getContext(), 42.0f);
                        long max = Math.max(0L, (long) (a - (BDASplashView2.this.f67867a.getY() / f2)));
                        objectAnimator = ObjectAnimator.ofFloat(BDASplashView2.this.f67867a, "y", BDASplashView2.this.f67867a.getY(), -a);
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        objectAnimator.setDuration(max);
                    }
                    float a2 = C27484l.m100391a(BDASplashView2.this.getContext(), 42.0f);
                    if (i < 0) {
                        f3 = -a2;
                    } else {
                        f3 = BDASplashView2.this.f67867a.getY();
                    }
                    m99121a(BDASplashView2.this.f67867a, f3);
                    BDASplashView2.this.f67887u.setDuration((long) (((-f3) / C27484l.m100391a(BDASplashView2.this.getContext(), 42.0f)) * 300.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (objectAnimator != null) {
                        animatorSet.playSequentially(objectAnimator, BDASplashView2.this.f67887u);
                    } else {
                        animatorSet.play(BDASplashView2.this.f67887u);
                    }
                    animatorSet.start();
                    return true;
                }

                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (!BDASplashView2.this.f67889w && f2 > BitmapDescriptorFactory.HUE_RED) {
                        C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "slide_up");
                    }
                    if (BDASplashView2.this.mo97191a() && !this.f67922b) {
                        float a = C27484l.m100391a(BDASplashView2.this.getContext(), 42.0f);
                        float y = BDASplashView2.this.f67867a.getY() - f2;
                        if (y >= BitmapDescriptorFactory.HUE_RED) {
                            y = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            float f3 = -a;
                            if (y <= f3) {
                                y = f3;
                            }
                        }
                        BDASplashView2.this.f67867a.setY(y);
                        BDASplashView2.this.f67867a.requestLayout();
                        if (f2 > BitmapDescriptorFactory.HUE_RED) {
                            if (BDASplashView2.this.f67874h.getVisibility() != 0) {
                                TextView textView = BDASplashView2.this.f67874h;
                                BDASplashView2 bDASplashView2 = BDASplashView2.this;
                                String h = bDASplashView2.f67881o.mo97493h();
                                textView.setText(bDASplashView2.mo97186a(h, BDASplashView2.this.f67884r + ""));
                                BDASplashView2.this.mo97195b();
                            }
                            if (!this.f67923c) {
                                BDASplashView2.this.f67886t = new AnimatorSet();
                                AnimatorSet animatorSet = BDASplashView2.this.f67886t;
                                BDASplashView2 bDASplashView22 = BDASplashView2.this;
                                AnimatorSet.Builder play = animatorSet.play(bDASplashView22.mo97185a(bDASplashView22.f67874h));
                                BDASplashView2 bDASplashView23 = BDASplashView2.this;
                                play.with(bDASplashView23.mo97194b(bDASplashView23.f67875i));
                                BDASplashView2.this.f67886t.start();
                                this.f67923c = true;
                                HashMap<String, Object> hashMap = new HashMap<>(1);
                                hashMap.put("refer", "tips");
                                C27278b.m99171a().mo97296a(BDASplashView2.this.f67881o, 0, "othershow", hashMap, null);
                            }
                        }
                        BDASplashView2.this.f67889w = true;
                    }
                    return true;
                }
            };
        }
        if (this.aa != null) {
            this.f67865V = new GestureDetector(getContext(), this.aa);
        }
    }

    /* renamed from: e */
    private boolean m99073e(final C27331b bVar) {
        if (!m99083k(bVar)) {
            return false;
        }
        if (bVar.mo97441G() == 3 && bVar.mo97497k()) {
            this.f67876j = true;
            this.f67869c.setVisibility(0);
            this.f67869c.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass29 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        BDASplashView2.this.f67880n = true;
                        BDASplashView2.this.f67882p.mo97594a(bVar, new C27333c.C27334a().mo97523a(-1).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97531b(BDASplashView2.this.f67876j).mo97526a("click_open_app_area").mo97528a());
                    }
                    return true;
                }
            });
            if (!C27480i.m100385a(bVar.mo97439E())) {
                this.f67850G.setText(bVar.mo97439E());
            } else if (C27287e.m99275o() != 0) {
                this.f67850G.setText(C27287e.m99275o());
            } else {
                this.f67850G.setText(R.string.splash_ad_button_text);
            }
            this.f67869c.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass30 */

                public void run() {
                    if (BDASplashView2.this.f67869c != null) {
                        BDASplashView2.this.mo97196b(bVar);
                    }
                }
            });
        }
        m99078i();
        return true;
    }

    private void setupAdLabelLayout(C27331b bVar) {
        C27339g aa2 = bVar.aa();
        if (aa2 != null) {
            if (!TextUtils.isEmpty(aa2.mo97542d())) {
                this.f67854K.setText(aa2.mo97542d());
            }
            if (!TextUtils.isEmpty(aa2.mo97541c())) {
                this.f67854K.setTextColor(C27478h.m100333a(aa2.mo97541c(), "#ffffff"));
            }
            if (!TextUtils.isEmpty(aa2.mo97539a())) {
                GradientDrawable a = m99065a(2);
                a.setColor(C27478h.m100333a(aa2.mo97539a(), "#32222222"));
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f67854K.setBackground(a);
                } else {
                    this.f67854K.setBackgroundDrawable(a);
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m99075g(final C27331b bVar) {
        boolean z = false;
        if (!(bVar.mo97445K() == null || bVar.mo97506t() == null)) {
            this.f67868b.setVisibility(0);
            AbstractC27436f a = C27478h.m100339a(this.f67868b);
            this.f67888v = a;
            a.mo97918a(m99086m(bVar));
            C27349o K = bVar.mo97445K();
            int b = bVar.mo97506t().mo97535b();
            int f = K.mo97577f();
            int g = K.mo97578g();
            if (!(b == 0 || f == 0 || g <= 0)) {
                boolean k = m99083k(bVar);
                String b2 = C27478h.m100365b(K);
                if (C27480i.m100385a(b2)) {
                    return false;
                }
                if (k && this.f67888v.mo97924b(b2, K.mo97579h())) {
                    z = true;
                }
                if (z) {
                    C27433e.m100134a().mo97977a(bVar, C27287e.m99221T());
                    C27433e.m100134a().mo97978a(this.f67888v, bVar.ak(), bVar.mo97486c());
                }
                setOnTouchListener(new View.OnTouchListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass31 */

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (!BDASplashView2.this.mo97192a(view, motionEvent) && motionEvent.getAction() == 1) {
                            BDASplashView2.this.mo97189a(bVar, motionEvent.getRawX(), motionEvent.getRawY(), false);
                        }
                        return true;
                    }
                });
                this.f67868b.setTextureViewOnTouchListener(new View.OnTouchListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.View$OnTouchListenerC272552 */

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            BDASplashView2.this.mo97189a(bVar, motionEvent.getRawX(), motionEvent.getRawY(), true);
                        }
                        return true;
                    }
                });
                if (z) {
                    int i = this.f67868b.getResources().getDisplayMetrics().widthPixels;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f67868b.getLayoutParams();
                    layoutParams.height = (int) ((((float) f) * ((float) i)) / ((float) g));
                    layoutParams.width = i;
                    layoutParams.gravity = 17;
                    this.f67868b.setLayoutParams(layoutParams);
                    m99078i();
                    m99077h(bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: h */
    private static void m99077h(C27331b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "not_real_time";
        try {
            if (bVar.mo97499m()) {
                str = "real_time";
            }
            jSONObject.putOpt("show_type", str);
            jSONObject.putOpt("show_expected", Integer.valueOf(bVar.mo97453S()));
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            jSONObject2.putOpt("log_extra", bVar.mo97511x());
            jSONObject2.putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject2 = null;
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", "banner_show", jSONObject2);
    }

    /* renamed from: i */
    private boolean m99079i(final C27331b bVar) {
        boolean z;
        if (bVar.mo97445K() == null) {
            return false;
        }
        C27349o K = bVar.mo97445K();
        String b = C27478h.m100365b(K);
        if (C27480i.m100385a(b)) {
            return false;
        }
        this.f67845B.setVisibility(8);
        this.f67846C.setVisibility(0);
        if (bVar.mo97456V() == 3) {
            C27471a.m100285b(bVar.mo97509v(), "binding interactive splash ad");
            this.f67871e.setVisibility(0);
            this.f67872f.setVisibility(0);
            this.f67859P = true;
            this.f67871e.setOnPageChangeListener(new AbstractC27324b() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.C272583 */

                @Override // com.ss.android.ad.splash.core.interact.AbstractC27324b
                /* renamed from: a */
                public void mo97244a(int i) {
                    BDASplashView2.this.f67885s = i;
                    if (i == 0) {
                        BDASplashView2.this.f67871e.getBDAVideoController().mo97921a(BDASplashView2.this.f67879m);
                        C27349o L = BDASplashView2.this.f67881o.mo97446L();
                        if (L != null) {
                            BDASplashView2.this.mo97187a(L.mo97576e());
                        }
                        C27484l.m100393a(BDASplashView2.this.f67872f);
                        BDASplashView2.this.mo97198d();
                        BDASplashView2.this.f67871e.setEnabled(false);
                        BDASplashView2.this.setOnClickListener(new AbstractView$OnClickListenerC27267a() {
                            /* class com.ss.android.ad.splash.core.BDASplashView2.C272583.C272591 */

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.p1246a.AbstractView$OnClickListenerC27267a
                            /* renamed from: a */
                            public void mo97216a(View view) {
                            }
                        });
                        BDASplashView2.this.mo97197c();
                        C27278b.m99171a().mo97295a(BDASplashView2.this.f67881o, "enter_loft");
                    }
                }
            });
            this.f67871e.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.RunnableC272604 */

                public void run() {
                    FrameLayout.LayoutParams a;
                    if (BDASplashView2.this.f67871e != null && (a = C27478h.m100337a(BDASplashView2.this.f67871e.getWidth(), BDASplashView2.this.f67871e.getHeight(), bVar.af(), bVar.ad())) != null) {
                        BDASplashView2.this.f67871e.setSurfaceLayoutParams(a);
                    }
                }
            });
            z = this.f67871e.mo97721a(bVar);
            this.f67871e.setSplashAdInteraction(this.f67882p);
            this.f67866W = new GestureDetector.SimpleOnGestureListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.C272615 */

                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    BDASplashView2.this.mo97189a(bVar, motionEvent.getRawX(), motionEvent.getRawY(), true);
                    return true;
                }
            };
            GestureDetector gestureDetector = new GestureDetector(getContext(), this.f67866W);
            this.f67864U = gestureDetector;
            this.f67871e.setGestureDetector(gestureDetector);
        } else {
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.View$OnTouchListenerC272626 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!BDASplashView2.this.mo97192a(view, motionEvent) && motionEvent.getAction() == 1) {
                        BDASplashView2.this.mo97189a(bVar, motionEvent.getRawX(), motionEvent.getRawY(), true);
                    }
                    return true;
                }
            });
            this.f67868b.setVisibility(0);
            AbstractC27436f a = C27478h.m100339a(this.f67868b);
            this.f67888v = a;
            a.mo97918a(m99086m(bVar));
            z = this.f67888v.mo97924b(b, K.mo97579h());
            if (z) {
                C27433e.m100134a().mo97977a(bVar, C27287e.m99221T());
                C27433e.m100134a().mo97978a(this.f67888v, bVar.ak(), bVar.mo97486c());
                this.f67868b.post(new Runnable() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.RunnableC272637 */

                    public void run() {
                        FrameLayout.LayoutParams a;
                        if (BDASplashView2.this.f67868b != null && (a = C27478h.m100337a(BDASplashView2.this.f67868b.getWidth(), BDASplashView2.this.f67868b.getHeight(), bVar.mo97445K().mo97578g(), bVar.mo97445K().mo97577f())) != null) {
                            BDASplashView2.this.f67868b.setSurfaceLayoutParams(a);
                        }
                    }
                });
            }
        }
        if (z) {
            m99078i();
        }
        return z;
    }

    /* renamed from: k */
    private boolean m99083k(final C27331b bVar) {
        if (bVar.mo97497k()) {
            ViewGroup.LayoutParams layoutParams = this.f67845B.getLayoutParams();
            layoutParams.height = C27478h.m100331a();
            this.f67845B.setLayoutParams(layoutParams);
            this.f67845B.setVisibility(4);
            this.f67846C.setVisibility(8);
        } else {
            this.f67845B.setVisibility(8);
            this.f67846C.setVisibility(0);
        }
        C27338f t = bVar.mo97506t();
        String b = C27478h.m100364b(t);
        if (C27480i.m100385a(b) || C27287e.m99207F() == null) {
            return false;
        }
        if (TextUtils.isEmpty(t.mo97537d())) {
            C27287e.m99207F().mo98084a(this.f67848E, b, bVar.mo97440F(), new AbstractC27455o() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass16 */
            });
        } else {
            C27287e.m99207F().mo98085a(this.f67848E, b, bVar.mo97440F(), t.mo97537d(), new AbstractC27455o() {
                /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass17 */
            });
        }
        try {
            if (bVar.mo97444J() == 0 || bVar.mo97444J() == 4) {
                m99085l(bVar);
            }
            this.f67848E.mo97145a(bVar);
            this.f67848E.setInteraction(this.f67882p);
            this.f67848E.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f67880n = true;
            this.f67882p.mo97591a();
            return false;
        }
    }

    /* renamed from: l */
    private static void m99085l(C27331b bVar) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("show_expected", Integer.valueOf(bVar.mo97453S()));
        if (bVar.mo97499m()) {
            str = "real_time";
        } else {
            str = "not_real_time";
        }
        jSONObject.putOpt("show_type", str);
        if (C27287e.ah() != -1) {
            int i = 1;
            if (C27287e.ah() != 1) {
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
            C27287e.m99217P().mo97347a(null, "show", bVar.mo97509v(), bVar.mo97451Q(), bVar.mo97511x(), true, -1, null, a);
        } else {
            C27287e.m99217P().mo97346a(null, bVar.mo97509v(), bVar.mo97451Q(), bVar.mo97511x(), true, -1, null, a);
        }
    }

    private void setupSkipButtonHitArea(C27331b bVar) {
        int i;
        C27344l Z = bVar.mo97460Z();
        boolean z = true;
        int i2 = 0;
        if (Z == null || !Z.mo97556a(1)) {
            z = false;
        }
        if (Z != null && this.f67852I.getVisibility() == 0 && this.f67852I.getParent() != null) {
            if (z) {
                int a = (int) C27484l.m100391a(getContext(), (float) Z.mo97555a());
                int a2 = (int) C27484l.m100391a(getContext(), (float) Z.mo97557b());
                C27478h.m100352a(this.f67853J, a, a, a2, a2);
                this.f67852I.setOnTouchListener(new View.OnTouchListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass11 */

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (BDASplashView2.this.getTouchDelegate() == null || !BDASplashView2.this.getTouchDelegate().onTouchEvent(motionEvent)) {
                            return false;
                        }
                        return true;
                    }
                });
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int a3 = (int) C27484l.m100391a(getContext(), 16.0f);
                if (Z != null) {
                    i = ((int) C27484l.m100391a(getContext(), (float) Z.mo97555a())) + 0;
                    i2 = 0 + ((int) C27484l.m100391a(getContext(), (float) Z.mo97557b()));
                } else {
                    i = 0;
                }
                this.f67852I.setPaddingRelative(i2, (int) C27484l.m100391a(getContext(), 14.0f), a3, i);
                this.f67852I.setLayoutParams(layoutParams);
                this.f67852I.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass13 */

                    public void onClick(View view) {
                    }
                });
                this.f67853J.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass14 */

                    public void onClick(View view) {
                        BDASplashView2.this.mo97199e();
                    }
                });
                return;
            }
            C27478h.m100352a(this.f67852I, Z.mo97555a(), Z.mo97555a(), Z.mo97557b(), Z.mo97557b());
            if (Build.VERSION.SDK_INT >= 16) {
                this.f67870d.setPaddingRelative(0, 0, 0, Z.mo97555a());
            } else {
                this.f67870d.setPadding(0, 0, 0, Z.mo97555a());
            }
        }
    }

    /* renamed from: b */
    public void mo97196b(C27331b bVar) {
        float a = C27484l.m100391a(getContext(), (float) (bVar.mo97508u() / 2));
        if (a > C27484l.m100391a(getContext(), 40.0f)) {
            a = C27484l.m100391a(getContext(), 40.0f);
        }
        setTouchDelegate(new C27475e(new Rect(this.f67869c.getLeft(), (int) (((float) this.f67869c.getTop()) - a), this.f67869c.getRight(), (int) (((float) this.f67869c.getBottom()) + a)), this.f67869c));
    }

    /* renamed from: b */
    private CharSequence m99069b(int i) {
        if (i < 0) {
            i = 0;
        }
        C27339g aa2 = this.f67881o.aa();
        if (aa2 == null || aa2.mo97540b() != 3) {
            if (aa2 == null || aa2.mo97540b() != 2) {
                if (!this.f67858O) {
                    return this.f67860Q;
                }
                if (C27478h.m100356a(getContext())) {
                    return String.format("%s %s%s", this.f67860Q, Integer.valueOf(i), this.f67861R);
                }
                return String.format("%s%s %s", Integer.valueOf(i), this.f67861R, this.f67860Q);
            } else if (!this.f67858O || !m99071c(i)) {
                return this.f67860Q;
            } else {
                String format = String.format("%d%s", Integer.valueOf(i), this.f67861R);
                if (this.f67881o.mo97497k()) {
                    return m99066a(format, 18, " | ", 13, "#66222222", this.f67860Q, 16);
                }
                return m99066a(format, 18, " | ", 13, "#66F8F8F8", this.f67860Q, 16);
            }
        } else if (this.f67881o.mo97513z()) {
            return m99066a(this.f67860Q, 18, " | ", 14, "#4DFFFFFF", String.format("%02d%s", Integer.valueOf(i), this.f67861R), 18);
        } else if (!this.f67881o.mo97435A()) {
            return this.f67860Q;
        } else {
            if (i > ((int) (this.f67877k / 1000)) - this.f67881o.mo97436B()) {
                return m99066a("Ad", 18, " | ", 14, "#4DFFFFFF", String.format("%02d%s", Integer.valueOf(i), this.f67861R), 18);
            }
            return m99066a(this.f67860Q, 18, " | ", 14, "#4DFFFFFF", String.format("%02d%s", Integer.valueOf(i), this.f67861R), 18);
        }
    }

    private void setupSkipLayout(C27331b bVar) {
        this.f67884r = (int) (this.f67877k / 1000);
        BDASplashCountDownView bDASplashCountDownView = this.f67855L;
        bDASplashCountDownView.setText("" + this.f67884r);
        this.f67855L.setDuration(this.f67877k);
        C27344l Z = bVar.mo97460Z();
        if (Z == null || TextUtils.isEmpty(Z.mo97560e())) {
            this.f67852I.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            int a = (int) C27484l.m100391a(getContext(), 16.0f);
            layoutParams.setMargins(0, (int) C27484l.m100391a(getContext(), 16.0f), a, 0);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21, -1);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
            } else {
                layoutParams.addRule(11, -1);
            }
            this.f67847D.setLayoutParams(layoutParams);
            return;
        }
        this.f67852I.setVisibility(0);
        this.f67860Q = Z.mo97560e();
        this.f67858O = Z.mo97562g();
        this.f67861R = Z.mo97558c();
        this.f67853J.setText(m99069b(this.f67884r));
        if (!TextUtils.isEmpty(Z.mo97561f())) {
            this.f67853J.setTextColor(C27478h.m100333a(Z.mo97561f(), "#ffffff"));
            this.f67855L.setTextColor(C27478h.m100333a(Z.mo97561f(), "#ffffff"));
        }
        if (!TextUtils.isEmpty(Z.mo97559d())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            GradientDrawable a2 = m99065a(12);
            int a3 = C27478h.m100333a(Z.mo97559d(), "#32222222");
            a2.setColor(a3);
            gradientDrawable.setColor(a3);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f67853J.setBackground(a2);
                this.f67855L.setBackground(gradientDrawable);
            } else {
                this.f67853J.setBackgroundDrawable(a2);
                this.f67855L.setBackgroundDrawable(gradientDrawable);
            }
        }
        setSkipClickListener(bVar);
    }

    /* renamed from: a */
    public void mo97187a(long j) {
        Timer timer = this.f67862S;
        if (timer != null) {
            timer.cancel();
        }
        this.f67862S = new Timer();
        long n = j + C27287e.m99259e().mo97709n();
        this.f67877k = n;
        int i = (int) (n / 1000);
        this.f67884r = i;
        this.f67853J.setText(m99069b(i));
        mo97200f();
        this.f67862S.scheduleAtFixedRate(new TimerTask() {
            /* class com.ss.android.ad.splash.core.BDASplashView2.C272648 */

            public void run() {
                Message obtainMessage = BDASplashView2.this.f67883q.obtainMessage();
                obtainMessage.what = 2;
                BDASplashView2.this.f67883q.sendMessage(obtainMessage);
            }
        }, (this.f67877k % 1000) + 1000, 1000);
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        if (message.what == 1) {
            C27477g.m100326a("SplashAdSdk", "display timeout");
            Timer timer = this.f67862S;
            if (timer != null) {
                timer.cancel();
                this.f67862S = null;
            }
            this.f67882p.mo97592a(this.f67881o);
            if (!this.f67880n && this.f67888v != null && C27287e.m99259e().mo97706k()) {
                this.f67880n = true;
                HashMap<String, Object> hashMap = new HashMap<>();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap.put("duration", Long.toString((long) this.f67888v.mo97929g()));
                hashMap.put("percent", Integer.valueOf(C27481j.m100386a((long) this.f67888v.mo97929g(), (long) this.f67888v.mo97930h())));
                hashMap.put("break_reason", 9);
                hashMap2.put("break_reason", 9);
                hashMap2.put("play_order", 1);
                C27278b.m99171a().mo97296a(this.f67881o, 0, "play_break", hashMap, hashMap2);
                C27287e.m99218Q().mo97343d();
            }
            this.f67880n = true;
        } else if (message.what == 2) {
            int i = this.f67884r - 1;
            this.f67884r = i;
            C27477g.m100326a("SplashAdSdk", "splash count down. display seconds left: " + this.f67884r);
            if (i == 0) {
                Timer timer2 = this.f67862S;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f67862S = null;
                    return;
                }
                return;
            }
            if (this.f67853J.getVisibility() == 0 && this.f67858O) {
                this.f67853J.setText(m99069b(i));
            }
            if (this.f67855L.getVisibility() == 0) {
                BDASplashCountDownView bDASplashCountDownView = this.f67855L;
                bDASplashCountDownView.setText("" + i);
            }
            if (this.f67874h.getVisibility() == 0 && this.f67881o.ao()) {
                TextView textView = this.f67874h;
                String h = this.f67881o.mo97493h();
                textView.setText(mo97186a(h, i + ""));
            }
        }
    }

    /* renamed from: a */
    private void m99067a(Context context) {
        float f;
        if (C27287e.m99281u() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C27287e.m99281u()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f67891y = linearLayout;
        addView(linearLayout);
        ViewStub viewStub = new ViewStub(context);
        this.f67892z = viewStub;
        viewStub.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.f67892z.setLayoutResource(R.layout.splash_ad_abnormity_bar);
        this.f67892z.setVisibility(8);
        this.f67891y.addView(this.f67892z);
        this.f67844A = new RelativeLayout(context);
        this.f67844A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Space space = new Space(context);
        this.f67845B = space;
        space.setId(R.id.splash_bottom_banner_space);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f67845B.setLayoutParams(layoutParams);
        this.f67845B.setBackgroundColor(getResources().getColor(R.color.splash_ad_white));
        this.f67845B.setVisibility(4);
        this.f67867a = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f67845B.getId());
        this.f67867a.setLayoutParams(layoutParams2);
        this.f67848E = new BDASplashImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.f67848E.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f67848E.setVisibility(8);
        this.f67848E.setLayoutParams(layoutParams3);
        this.f67868b = new BDASplashVideoView(context);
        this.f67868b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f67868b.setVisibility(8);
        this.f67871e = new BDASplashInteractVideoView(context);
        this.f67871e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f67871e.setVisibility(8);
        this.f67872f = new BDASplashSlideGuideView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) C27484l.m100391a(context, 140.0f), (int) C27484l.m100391a(context, 170.0f));
        layoutParams4.bottomMargin = (int) C27484l.m100391a(context, 148.0f);
        layoutParams4.addRule(12);
        layoutParams4.addRule(14);
        this.f67872f.setLayoutParams(layoutParams4);
        this.f67872f.setVisibility(8);
        this.f67869c = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) C27484l.m100391a(context, 60.0f));
        layoutParams5.gravity = 80;
        this.f67869c.setLayoutParams(layoutParams5);
        this.f67869c.setBackgroundColor(getResources().getColor(R.color.splash_ad_app_background));
        this.f67869c.setVisibility(8);
        this.f67849F = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        this.f67849F.setLayoutParams(layoutParams6);
        this.f67850G = new TextView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        this.f67850G.setEllipsize(TextUtils.TruncateAt.END);
        this.f67850G.setLines(1);
        this.f67850G.setMaxWidth((int) C27484l.m100391a(context, 200.0f));
        this.f67850G.setText(R.string.splash_ad_button_text);
        this.f67850G.setTextColor(getResources().getColor(R.color.splash_ad_white));
        this.f67850G.setTextSize(1, 20.0f);
        this.f67850G.setLayoutParams(layoutParams7);
        this.f67850G.setId(R.id.splash_open_app_area_tv);
        this.f67849F.addView(this.f67850G);
        this.f67851H = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15, -1);
        layoutParams8.addRule(1, this.f67850G.getId());
        layoutParams8.setMargins((int) C27484l.m100391a(context, 4.0f), 0, 0, 0);
        this.f67851H.setPadding(0, (int) C27484l.m100391a(context, 1.0f), 0, 0);
        this.f67851H.setImageDrawable(getResources().getDrawable(R.drawable.splash_ad_arrow));
        this.f67851H.setLayoutParams(layoutParams8);
        this.f67849F.addView(this.f67851H);
        this.f67869c.addView(this.f67849F);
        this.f67846C = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams9.addRule(20, -1);
        } else {
            layoutParams9.addRule(9, -1);
        }
        layoutParams9.addRule(10, -1);
        int a = (int) C27484l.m100391a(context, 14.0f);
        layoutParams9.setMargins(a, (int) C27484l.m100391a(context, 14.0f), 0, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams9.setMarginStart(a);
            layoutParams9.setMarginEnd(0);
        }
        this.f67846C.setVisibility(8);
        this.f67846C.setLayoutParams(layoutParams9);
        ImageView imageView = new ImageView(context);
        this.f67873g = imageView;
        imageView.setImageResource(R.drawable.splash_ad_mute);
        this.f67856M = new BDASplashInteractButton(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) C27484l.m100391a(context, 209.0f), (int) C27484l.m100391a(context, 44.0f));
        layoutParams10.bottomMargin = (int) C27484l.m100391a(context, 100.0f);
        layoutParams10.addRule(12);
        layoutParams10.addRule(14);
        this.f67856M.setLayoutParams(layoutParams10);
        this.f67856M.setVisibility(8);
        this.f67870d = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
        this.f67870d.setOrientation(0);
        this.f67870d.setLayoutParams(layoutParams11);
        this.f67870d.setFitsSystemWindows(true);
        this.ac = new Space(context);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, 1);
        layoutParams12.weight = 1.0f;
        this.ac.setLayoutParams(layoutParams12);
        this.f67852I = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, (int) C27484l.m100391a(context, 36.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams13.addRule(21, -1);
        } else {
            layoutParams13.addRule(11, -1);
        }
        layoutParams13.addRule(10, -1);
        if (C27287e.m99259e().mo97698c()) {
            f = C27484l.m100391a(context, 10.0f);
        } else {
            f = C27484l.m100391a(context, 16.0f);
        }
        int i = (int) f;
        layoutParams13.setMargins(0, (int) C27484l.m100391a(context, 8.0f), i, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart(0);
            layoutParams13.setMarginEnd(i);
        }
        this.f67852I.setLayoutParams(layoutParams13);
        this.f67852I.setVisibility(8);
        this.f67852I.setId(R.id.splash_skip_btn_layout);
        this.f67853J = new TextView(context);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, (int) C27484l.m100391a(context, 24.0f));
        this.f67853J.setBackgroundResource(R.drawable.splash_ad_ignore_bg);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f67853J.setPaddingRelative((int) C27484l.m100391a(context, 10.0f), 0, (int) C27484l.m100391a(context, 10.0f), 0);
        } else {
            this.f67853J.setPadding((int) C27484l.m100391a(context, 10.0f), 0, (int) C27484l.m100391a(context, 10.0f), 0);
        }
        layoutParams14.gravity = 17;
        this.f67853J.setGravity(17);
        this.f67853J.setTextSize(1, 12.0f);
        this.f67853J.setLayoutParams(layoutParams14);
        this.f67852I.addView(this.f67853J);
        this.f67847D = new TextView(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        int a2 = (int) C27484l.m100391a(context, 9.0f);
        layoutParams15.setMargins(0, (int) C27484l.m100391a(context, 16.0f), a2, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart(0);
            layoutParams15.setMarginEnd(a2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f67847D.setPaddingRelative(3, 3, 3, 3);
        } else {
            this.f67847D.setPadding(3, 3, 3, 3);
        }
        this.f67847D.setTextColor(Color.parseColor("#ffffff"));
        this.f67847D.setShadowLayer(12.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Color.parseColor("#7f000000"));
        this.f67847D.setTextSize(1, 12.0f);
        this.f67847D.setVisibility(8);
        this.f67847D.setLayoutParams(layoutParams15);
        this.f67855L = new BDASplashCountDownView(context);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) C27484l.m100391a(context, 40.0f), (int) C27484l.m100391a(context, 40.0f));
        int a3 = (int) C27484l.m100391a(context, 44.0f);
        layoutParams16.setMargins(0, (int) C27484l.m100391a(context, 30.0f), a3, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams16.setMarginStart(0);
            layoutParams16.setMarginEnd(a3);
        }
        this.f67855L.setLayoutParams(layoutParams16);
        this.f67855L.setGravity(17);
        this.f67855L.setTextSize(1, 18.0f);
        this.f67855L.setVisibility(8);
        this.f67854K = new TextView(context);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f67854K.setPaddingRelative((int) C27484l.m100391a(context, 4.0f), (int) C27484l.m100391a(context, 2.0f), (int) C27484l.m100391a(context, 4.0f), (int) C27484l.m100391a(context, 2.0f));
        } else {
            this.f67854K.setPadding((int) C27484l.m100391a(context, 4.0f), (int) C27484l.m100391a(context, 2.0f), (int) C27484l.m100391a(context, 4.0f), (int) C27484l.m100391a(context, 2.0f));
        }
        this.f67854K.setTextSize(1, 10.0f);
        this.f67854K.setVisibility(8);
        TextView textView = new TextView(context);
        this.f67874h = textView;
        textView.setVisibility(8);
        View view = new View(context);
        this.f67875i = view;
        view.setBackgroundResource(R.drawable.gradient_bg_for_slide_up_tips);
        this.f67875i.setVisibility(8);
        this.f67875i.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C27484l.m100391a(context, 50.0f)));
        View view2 = new View(getContext());
        this.f67857N = view2;
        view2.setBackgroundResource(R.drawable.splash_ad_bg_swipe_up_top_shadow);
        this.f67857N.setVisibility(8);
        this.f67857N.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C27484l.m100391a(getContext(), 105.0f)));
        this.f67891y.addView(this.f67844A);
        this.f67867a.addView(this.f67871e);
        this.f67867a.addView(this.f67848E);
        this.f67867a.addView(this.f67868b);
        this.f67867a.addView(this.f67869c);
        this.f67844A.addView(this.f67867a);
        this.f67844A.addView(this.f67845B);
        this.f67844A.addView(this.f67857N);
        this.f67870d.addView(this.f67846C);
        this.f67870d.addView(this.ac);
        this.f67844A.addView(this.f67870d);
        this.f67844A.addView(this.f67856M);
        this.f67844A.addView(this.f67872f);
        this.f67844A.addView(this.f67875i);
        this.f67844A.addView(this.f67874h);
        m99076h();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.ad = true;
    }

    /* renamed from: j */
    private void m99081j(C27331b bVar) {
        int i;
        float f;
        int i2;
        float f2;
        C27339g aa2 = bVar.aa();
        if (aa2 != null) {
            C27471a.m100287b("new splash style，position:" + aa2.mo97540b());
            C27484l.m100393a(this.f67847D);
            C27484l.m100393a(this.f67854K);
            C27484l.m100393a(this.f67852I);
            int b = aa2.mo97540b();
            if (b != 0) {
                if (b == 1) {
                    C27484l.m100395a(this.f67847D, this.f67870d);
                    C27484l.m100395a(this.f67852I, this.f67870d);
                    this.f67854K.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    if (bVar.mo97441G() == 3 && this.f67869c.getVisibility() == 0) {
                        i = this.f67869c.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int a = (int) C27484l.m100391a(getContext(), 16.0f);
                    layoutParams.setMargins(0, 0, a, ((int) C27484l.m100391a(getContext(), 20.0f)) + i);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart(0);
                        layoutParams.setMarginEnd(a);
                    }
                    this.f67854K.setLayoutParams(layoutParams);
                    C27484l.m100395a(this.f67854K, this.f67867a);
                } else if (b == 2) {
                    if (!TextUtils.isEmpty(this.f67854K.getText())) {
                        this.f67854K.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) C27484l.m100391a(getContext(), 18.0f));
                        if (this.f67847D.getVisibility() != 0) {
                            if (this.f67859P) {
                                f2 = C27484l.m100391a(getContext(), 12.0f);
                            } else {
                                f2 = C27484l.m100391a(getContext(), 20.0f);
                            }
                            i2 = (int) f2;
                        } else {
                            i2 = 0;
                        }
                        layoutParams2.setMargins(0, 0, i2, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams2.setMarginStart(0);
                            layoutParams2.setMarginEnd(i2);
                        }
                        this.f67854K.setLayoutParams(layoutParams2);
                        this.f67854K.setTextSize(1, 12.0f);
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f67854K.setPaddingRelative((int) C27484l.m100391a(getContext(), 4.0f), 0, (int) C27484l.m100391a(getContext(), (float) BitmapDescriptorFactory.HUE_RED), 0);
                        } else {
                            this.f67854K.setPadding((int) C27484l.m100391a(getContext(), 4.0f), 0, (int) C27484l.m100391a(getContext(), (float) BitmapDescriptorFactory.HUE_RED), 0);
                        }
                        this.f67854K.setBackgroundColor(Color.parseColor("#00222222"));
                        this.f67854K.setShadowLayer(2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, Color.parseColor("#66000000"));
                        C27484l.m100395a(this.f67854K, this.f67870d);
                    }
                    if (this.f67847D.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) C27484l.m100391a(getContext(), 18.0f));
                        if (this.f67859P) {
                            f = C27484l.m100391a(getContext(), 12.0f);
                        } else {
                            f = C27484l.m100391a(getContext(), 20.0f);
                        }
                        int i3 = (int) f;
                        layoutParams3.setMargins(0, 0, i3, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams3.setMarginStart(0);
                            layoutParams3.setMarginEnd(i3);
                        }
                        this.f67847D.setLayoutParams(layoutParams3);
                        this.f67847D.setTextSize(1, 12.0f);
                        this.f67847D.setShadowLayer(2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, Color.parseColor("#66000000"));
                        if (!TextUtils.isEmpty(aa2.mo97541c())) {
                            this.f67847D.setTextColor(C27478h.m100333a(aa2.mo97541c(), "#ffffff"));
                        }
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f67847D.setPaddingRelative((int) C27484l.m100391a(getContext(), 6.0f), 0, (int) C27484l.m100391a(getContext(), (float) BitmapDescriptorFactory.HUE_RED), 0);
                        } else {
                            this.f67847D.setPadding((int) C27484l.m100391a(getContext(), 6.0f), 0, (int) C27484l.m100391a(getContext(), (float) BitmapDescriptorFactory.HUE_RED), 0);
                        }
                        TextView textView = this.f67847D;
                        textView.setText("|  " + ((Object) this.f67847D.getText()));
                        C27484l.m100395a(this.f67847D, this.f67870d);
                    }
                    if (this.f67852I.getVisibility() == 0) {
                        if (!bVar.ac()) {
                            this.f67853J.setTextSize(1, 16.0f);
                        }
                        C27484l.m100395a(this.f67852I, this.f67844A);
                        int j = C27478h.m100382j();
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) C27484l.m100391a(getContext(), 30.0f));
                        layoutParams4.addRule(12, -1);
                        int a2 = (int) C27484l.m100391a(getContext(), 15.0f);
                        if (bVar.mo97497k()) {
                            if (C27287e.m99267i() != null && "13".equals(C27287e.m99267i().mo97272a())) {
                                j += (int) C27484l.m100391a(getContext(), 5.5f);
                            }
                            layoutParams4.setMargins(0, 0, a2, j);
                        } else {
                            layoutParams4.setMargins(0, 0, a2, (int) C27484l.m100391a(getContext(), 35.0f));
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams4.addRule(21, -1);
                            layoutParams4.setMarginStart(0);
                            layoutParams4.setMarginEnd(a2);
                        } else {
                            layoutParams4.addRule(11, -1);
                        }
                        this.f67852I.setLayoutParams(layoutParams4);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
                        this.f67853J.setMinimumWidth((int) C27484l.m100391a(getContext(), 64.0f));
                        this.f67853J.setLayoutParams(layoutParams5);
                        C27344l Z = bVar.mo97460Z();
                        if (Z != null && !TextUtils.isEmpty(Z.mo97559d())) {
                            GradientDrawable a3 = m99065a(16);
                            a3.setColor(C27478h.m100333a(Z.mo97559d(), "#32222222"));
                            if (bVar.mo97497k()) {
                                a3.setStroke((int) C27484l.m100391a(getContext(), 0.5f), Color.parseColor("#66222222"));
                            } else {
                                a3.setStroke((int) C27484l.m100391a(getContext(), 0.5f), Color.parseColor("#99FAFAFA"));
                            }
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f67853J.setBackground(a3);
                            } else {
                                this.f67853J.setBackgroundDrawable(a3);
                            }
                        }
                    }
                    if (this.f67846C.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                        int a4 = (int) C27484l.m100391a(getContext(), 14.0f);
                        layoutParams6.setMargins(a4, 0, 0, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams6.setMarginStart(a4);
                            layoutParams6.setMarginEnd(0);
                        }
                        this.f67846C.setLayoutParams(layoutParams6);
                    }
                    m99080j();
                    if (this.f67870d != null) {
                        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams7.setMargins(0, (int) C27484l.m100391a(getContext(), 35.0f), 0, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams7.setMarginStart(0);
                            layoutParams7.setMarginEnd(0);
                        }
                        this.f67870d.setOrientation(0);
                        this.f67870d.setLayoutParams(layoutParams7);
                    }
                } else if (b != 3) {
                    C27484l.m100395a(this.f67847D, this.f67870d);
                    C27484l.m100395a(this.f67852I, this.f67870d);
                    if (aa2.mo97540b() != 0) {
                        this.f67854K.setVisibility(8);
                    }
                } else {
                    C27471a.m100287b("xigua TV style, is clickable: " + bVar.mo97513z() + ", is skippable: " + bVar.mo97435A());
                    if (bVar.mo97513z() || bVar.mo97435A()) {
                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) C27484l.m100391a(getContext(), 40.0f));
                        int a5 = (int) C27484l.m100391a(getContext(), 44.0f);
                        layoutParams8.setMargins(0, (int) C27484l.m100391a(getContext(), 30.0f), a5, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams8.setMarginStart(0);
                            layoutParams8.setMarginEnd(a5);
                        }
                        this.f67852I.setLayoutParams(layoutParams8);
                        this.f67853J.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        GradientDrawable a6 = m99065a(20);
                        C27344l Z2 = bVar.mo97460Z();
                        if (Z2 == null || TextUtils.isEmpty(Z2.mo97559d())) {
                            a6.setAlpha(153);
                            a6.setColor(-16777216);
                        } else {
                            a6.setColor(C27478h.m100333a(Z2.mo97559d(), "#32222222"));
                        }
                        int a7 = (int) C27484l.m100391a(getContext(), 14.0f);
                        int a8 = (int) C27484l.m100391a(getContext(), 8.0f);
                        int a9 = (int) C27484l.m100391a(getContext(), 14.0f);
                        int a10 = (int) C27484l.m100391a(getContext(), 7.0f);
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f67853J.setPaddingRelative(a7, a8, a9, a10);
                            this.f67853J.setBackground(a6);
                        } else {
                            this.f67853J.setPadding(a7, a8, a9, a10);
                            this.f67853J.setBackgroundDrawable(a6);
                        }
                        this.f67853J.setTextSize(1, 18.0f);
                        C27484l.m100395a(this.f67852I, this.f67870d);
                    } else {
                        this.f67855L.setVisibility(0);
                        C27484l.m100395a(this.f67855L, this.f67870d);
                    }
                    if (TextUtils.isEmpty(aa2.mo97542d())) {
                        return;
                    }
                    if (bVar.mo97513z() || !bVar.mo97435A()) {
                        this.f67854K.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) C27484l.m100391a(getContext(), 40.0f), (int) C27484l.m100391a(getContext(), 22.0f));
                        layoutParams9.gravity = 8388691;
                        int a11 = (int) C27484l.m100391a(getContext(), 8.0f);
                        layoutParams9.setMargins(a11, 0, 0, (int) C27484l.m100391a(getContext(), 8.0f));
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams9.setMarginStart(a11);
                            layoutParams9.setMarginEnd(0);
                        }
                        this.f67854K.setGravity(17);
                        GradientDrawable a12 = m99065a(4);
                        if (!TextUtils.isEmpty(aa2.mo97539a())) {
                            a12.setColor(C27478h.m100333a(aa2.mo97539a(), "#32222222"));
                        } else {
                            a12.setColor(-16777216);
                            a12.setAlpha(153);
                        }
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f67854K.setBackground(a12);
                        } else {
                            this.f67854K.setBackgroundDrawable(a12);
                        }
                        if (!TextUtils.isEmpty(aa2.mo97541c())) {
                            this.f67854K.setTextColor(C27478h.m100333a(aa2.mo97541c(), "#ffffff"));
                        } else {
                            this.f67854K.setTextColor(-1);
                        }
                        this.f67854K.setTextSize(1, 12.0f);
                        this.f67854K.setText(aa2.mo97542d());
                        this.f67854K.setLayoutParams(layoutParams9);
                        C27484l.m100395a(this.f67854K, this.f67867a);
                    }
                }
            } else if (TextUtils.isEmpty(aa2.mo97542d())) {
                C27484l.m100395a(this.f67847D, this.f67870d);
                C27484l.m100395a(this.f67852I, this.f67870d);
            } else {
                C27484l.m100397a(true, this.f67854K);
                C27484l.m100397a(false, this.f67852I, this.f67847D);
                this.f67854K.setTextSize(1, 12.0f);
                this.f67854K.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ad.splash.core.BDASplashView2.AnonymousClass15 */

                    public void onClick(View view) {
                        HashMap<String, Object> hashMap = new HashMap<>(1);
                        hashMap.put("refer", "adtag");
                        C27278b.m99171a().mo97296a(BDASplashView2.this.f67881o, 0, "otherclick", hashMap, null);
                    }
                });
                float a13 = (float) ((int) C27484l.m100391a(getContext(), 1.0f));
                this.f67854K.setShadowLayer(a13, BitmapDescriptorFactory.HUE_RED, a13, Color.argb(31, 0, 0, 0));
                C27484l.m100397a(true, this.f67857N);
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams10.gravity = 16;
                layoutParams10.topMargin = (int) C27484l.m100391a(getContext(), 7.0f);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams10.setMarginEnd((int) C27484l.m100391a(getContext(), 13.0f));
                } else {
                    layoutParams10.rightMargin = (int) C27484l.m100391a(getContext(), 13.0f);
                }
                C27484l.m100396a(this.f67854K, this.f67870d, layoutParams10);
            }
        }
    }

    /* renamed from: a */
    private void m99068a(View view, AlphaAnimation alphaAnimation) {
        if (view != null && alphaAnimation != null && view.getVisibility() == 0) {
            view.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: a */
    public String mo97186a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("%", str2);
    }

    public BDASplashView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99067a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r1 != 4) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.BDASplashView2.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public BDASplashView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99067a(context);
    }

    /* renamed from: a */
    private SpannableString m99066a(String str, int i, String str2, int i2, String str3, String str4, int i3) {
        SpannableString spannableString = new SpannableString(str + str2 + str4);
        spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i3, true), str.length() + str2.length(), spannableString.length(), 33);
        int max = Math.max(i, Math.max(i2, i3));
        spannableString.setSpan(new C27374a((int) C27484l.m100391a(getContext(), (float) ((-Math.abs(max - i)) / 2))), 0, str.length(), 33);
        spannableString.setSpan(new C27374a((int) C27484l.m100391a(getContext(), (float) ((-Math.abs(max - i2)) / 2))), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new C27374a((int) C27484l.m100391a(getContext(), (float) ((-Math.abs(max - i3)) / 2))), str.length() + str2.length(), spannableString.length(), 33);
        return spannableString;
    }
}
