package com.ss.android.lark.cameraview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.cameraview.p1588b.AbstractC32752a;
import com.ss.android.lark.cameraview.p1588b.AbstractC32753b;
import com.ss.android.lark.cameraview.p1588b.AbstractC32756e;
import com.ss.android.lark.cameraview.p1588b.AbstractC32757f;

public class CaptureLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC32752a f83926a;

    /* renamed from: b */
    public AbstractC32757f f83927b;

    /* renamed from: c */
    public AbstractC32753b f83928c;

    /* renamed from: d */
    public AbstractC32753b f83929d;

    /* renamed from: e */
    public C32788f f83930e;

    /* renamed from: f */
    public C32800l f83931f;

    /* renamed from: g */
    public C32800l f83932g;

    /* renamed from: h */
    private AbstractC32756e f83933h;

    /* renamed from: i */
    private C32799j f83934i;

    /* renamed from: j */
    private ImageView f83935j;

    /* renamed from: k */
    private ImageView f83936k;

    /* renamed from: l */
    private int f83937l;

    /* renamed from: m */
    private TextView f83938m;

    /* renamed from: n */
    private int f83939n;

    /* renamed from: o */
    private int f83940o;

    /* renamed from: p */
    private int f83941p;

    /* renamed from: q */
    private int f83942q;

    /* renamed from: r */
    private int f83943r;

    /* renamed from: s */
    private boolean f83944s;

    /* renamed from: e */
    public void mo120615e() {
        postDelayed(new Runnable() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.RunnableC327308 */

            public void run() {
                CaptureLayout.this.f83930e.setEnabled(true);
            }
        }, 300);
    }

    /* renamed from: a */
    public void mo120610a() {
        this.f83936k.setVisibility(8);
        this.f83932g.setVisibility(8);
        this.f83931f.setVisibility(8);
    }

    /* renamed from: c */
    public void mo120613c() {
        this.f83930e.mo120764c();
        this.f83932g.setVisibility(8);
        this.f83931f.setVisibility(8);
        this.f83930e.setVisibility(0);
        if (this.f83942q != 0) {
            this.f83935j.setVisibility(0);
        } else {
            this.f83934i.setVisibility(0);
        }
        if (this.f83943r != 0) {
            this.f83936k.setVisibility(0);
        }
    }

    /* renamed from: d */
    public void mo120614d() {
        if (this.f83944s) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83938m, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
            ofFloat.setDuration(500L);
            ofFloat.start();
            this.f83944s = false;
        }
    }

    /* renamed from: b */
    public void mo120612b() {
        if (this.f83942q != 0) {
            this.f83935j.setVisibility(8);
        } else {
            this.f83934i.setVisibility(8);
        }
        if (this.f83943r != 0) {
            this.f83936k.setVisibility(8);
        }
        this.f83930e.setVisibility(8);
        this.f83932g.setVisibility(0);
        this.f83931f.setVisibility(0);
        this.f83932g.setClickable(false);
        this.f83931f.setClickable(false);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83932g, "translationX", (float) (this.f83939n / 4), 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f83931f, "translationX", (float) ((-this.f83939n) / 4), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.C327231 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CaptureLayout.this.f83932g.setClickable(true);
                CaptureLayout.this.f83931f.setClickable(true);
            }
        });
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    /* renamed from: f */
    private void m125600f() {
        setWillNotDraw(false);
        this.f83930e = new C32788f(getContext(), this.f83941p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f83930e.setLayoutParams(layoutParams);
        this.f83930e.setCaptureLisenter(new AbstractC32752a() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.C327242 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: a */
            public void mo120627a() {
                if (CaptureLayout.this.f83926a != null) {
                    CaptureLayout.this.f83926a.mo120627a();
                }
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: b */
            public void mo120629b() {
                if (CaptureLayout.this.f83926a != null) {
                    CaptureLayout.this.f83926a.mo120629b();
                }
                CaptureLayout.this.mo120614d();
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: a */
            public void mo120628a(long j) {
                if (CaptureLayout.this.f83926a != null) {
                    CaptureLayout.this.f83926a.mo120628a(j);
                }
                CaptureLayout.this.mo120614d();
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32752a
            /* renamed from: b */
            public void mo120630b(long j) {
                if (CaptureLayout.this.f83926a != null) {
                    CaptureLayout.this.f83926a.mo120630b(j);
                }
                CaptureLayout.this.mo120614d();
                CaptureLayout.this.mo120612b();
            }
        });
        this.f83932g = new C32800l(getContext(), 1, this.f83941p);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins((this.f83939n / 4) - (this.f83941p / 2), 0, 0, 0);
        this.f83932g.setLayoutParams(layoutParams2);
        this.f83932g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.View$OnClickListenerC327253 */

            public void onClick(View view) {
                if (CaptureLayout.this.f83927b != null) {
                    CaptureLayout.this.f83927b.mo120670a();
                }
                CaptureLayout.this.mo120614d();
            }
        });
        this.f83931f = new C32800l(getContext(), 2, this.f83941p);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 21;
        layoutParams3.setMargins(0, 0, (this.f83939n / 4) - (this.f83941p / 2), 0);
        this.f83931f.setLayoutParams(layoutParams3);
        this.f83931f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.View$OnClickListenerC327264 */

            public void onClick(View view) {
                if (CaptureLayout.this.f83927b != null) {
                    CaptureLayout.this.f83927b.mo120671b();
                }
                CaptureLayout.this.mo120614d();
            }
        });
        this.f83934i = new C32799j(getContext(), (int) (((float) this.f83941p) / 2.5f));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        layoutParams4.setMargins(this.f83939n / 6, 0, 0, 0);
        this.f83934i.setLayoutParams(layoutParams4);
        this.f83934i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.View$OnClickListenerC327275 */

            public void onClick(View view) {
                if (CaptureLayout.this.f83928c != null) {
                    CaptureLayout.this.f83928c.mo120672a();
                }
            }
        });
        this.f83935j = new ImageView(getContext());
        int i = this.f83941p;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) (((float) i) / 2.5f), (int) (((float) i) / 2.5f));
        layoutParams5.gravity = 16;
        layoutParams5.setMargins(this.f83937l, 0, 0, 0);
        this.f83935j.setLayoutParams(layoutParams5);
        this.f83935j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.View$OnClickListenerC327286 */

            public void onClick(View view) {
                if (CaptureLayout.this.f83928c != null) {
                    CaptureLayout.this.f83928c.mo120672a();
                }
            }
        });
        this.f83936k = new ImageView(getContext());
        int i2 = this.f83941p;
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) (((float) i2) / 2.5f), (int) (((float) i2) / 2.5f));
        layoutParams6.gravity = 21;
        layoutParams6.setMargins(0, 0, this.f83937l, 0);
        this.f83936k.setLayoutParams(layoutParams6);
        this.f83936k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.cameraview.CaptureLayout.View$OnClickListenerC327297 */

            public void onClick(View view) {
                if (CaptureLayout.this.f83929d != null) {
                    CaptureLayout.this.f83929d.mo120672a();
                }
            }
        });
        this.f83938m = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams7.gravity = 1;
        layoutParams7.setMargins(0, 0, 0, UIUtils.dp2px(getContext(), 5.0f));
        this.f83938m.setText(UIUtils.getString(getContext(), R.string.Lark_Legacy_CameraRecordTip));
        this.f83938m.setTextColor(-1);
        this.f83938m.setGravity(49);
        this.f83938m.setLayoutParams(layoutParams7);
        addView(this.f83930e);
        addView(this.f83932g);
        addView(this.f83931f);
        addView(this.f83934i);
        addView(this.f83935j);
        addView(this.f83936k);
        addView(this.f83938m);
    }

    public void setCaptureLisenter(AbstractC32752a aVar) {
        this.f83926a = aVar;
    }

    public void setLeftClickListener(AbstractC32753b bVar) {
        this.f83928c = bVar;
    }

    public void setReturnListener(AbstractC32756e eVar) {
        this.f83933h = eVar;
    }

    public void setRightClickListener(AbstractC32753b bVar) {
        this.f83929d = bVar;
    }

    public void setTypeLisenter(AbstractC32757f fVar) {
        this.f83927b = fVar;
    }

    public CaptureLayout(Context context) {
        this(context, null);
    }

    public void setButtonFeatures(int i) {
        this.f83930e.setButtonFeatures(i);
    }

    public void setDuration(int i) {
        this.f83930e.setDuration(i);
    }

    public void setTip(String str) {
        this.f83938m.setText(str);
    }

    public void setTextWithAnimation(String str) {
        this.f83938m.setText(str);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83938m, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(2500L);
        ofFloat.start();
    }

    public CaptureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f83939n, this.f83940o);
    }

    /* renamed from: a */
    public void mo120611a(int i, int i2) {
        this.f83942q = i;
        this.f83943r = i2;
        if (i != 0) {
            this.f83935j.setImageResource(i);
            this.f83935j.setVisibility(0);
            this.f83934i.setVisibility(8);
        } else {
            this.f83935j.setVisibility(8);
            this.f83934i.setVisibility(0);
        }
        if (this.f83943r != 0) {
            this.f83936k.setImageResource(i2);
            this.f83936k.setVisibility(0);
            return;
        }
        this.f83936k.setVisibility(8);
    }

    public CaptureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83944s = true;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (getResources().getConfiguration().orientation == 1) {
            this.f83939n = displayMetrics.widthPixels;
        } else {
            this.f83939n = displayMetrics.widthPixels / 2;
        }
        int i2 = (int) (((float) this.f83939n) / 6.0f);
        this.f83941p = i2;
        this.f83940o = i2 + ((i2 / 5) * 2) + UIUtils.dp2px(context, 60.0f);
        this.f83937l = (this.f83939n * 2) / 9;
        m125600f();
        mo120610a();
    }
}
