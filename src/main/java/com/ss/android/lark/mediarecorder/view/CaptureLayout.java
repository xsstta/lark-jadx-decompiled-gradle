package com.ss.android.lark.mediarecorder.view;

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
import com.larksuite.suite.R;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44773b;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44776e;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44777f;
import com.ss.android.lark.mediarecorder.p2245c.C44801j;

public class CaptureLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC44772a f113444a;

    /* renamed from: b */
    public AbstractC44777f f113445b;

    /* renamed from: c */
    public AbstractC44773b f113446c;

    /* renamed from: d */
    public AbstractC44773b f113447d;

    /* renamed from: e */
    public C44853e f113448e;

    /* renamed from: f */
    public C44853e f113449f;

    /* renamed from: g */
    private AbstractC44776e f113450g;

    /* renamed from: h */
    private C44843b f113451h;

    /* renamed from: i */
    private C44852d f113452i;

    /* renamed from: j */
    private ImageView f113453j;

    /* renamed from: k */
    private ImageView f113454k;

    /* renamed from: l */
    private int f113455l;

    /* renamed from: m */
    private TextView f113456m;

    /* renamed from: n */
    private int f113457n;

    /* renamed from: o */
    private int f113458o;

    /* renamed from: p */
    private int f113459p;

    /* renamed from: q */
    private int f113460q;

    /* renamed from: r */
    private int f113461r;

    /* renamed from: s */
    private boolean f113462s;

    /* renamed from: a */
    public void mo158587a() {
        this.f113454k.setVisibility(8);
        this.f113449f.setVisibility(8);
        this.f113448e.setVisibility(8);
    }

    /* renamed from: c */
    public void mo158590c() {
        this.f113451h.mo158680b();
        this.f113449f.setVisibility(8);
        this.f113448e.setVisibility(8);
        this.f113451h.setVisibility(0);
        if (this.f113460q != 0) {
            this.f113453j.setVisibility(0);
        } else {
            this.f113452i.setVisibility(0);
        }
        if (this.f113461r != 0) {
            this.f113454k.setVisibility(0);
        }
    }

    /* renamed from: d */
    public void mo158591d() {
        if (this.f113462s) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f113456m, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
            ofFloat.setDuration(500L);
            ofFloat.start();
            this.f113462s = false;
        }
    }

    /* renamed from: b */
    public void mo158589b() {
        if (this.f113460q != 0) {
            this.f113453j.setVisibility(8);
        } else {
            this.f113452i.setVisibility(8);
        }
        if (this.f113461r != 0) {
            this.f113454k.setVisibility(8);
        }
        this.f113451h.setVisibility(8);
        this.f113449f.setVisibility(0);
        this.f113448e.setVisibility(0);
        this.f113449f.setClickable(false);
        this.f113448e.setClickable(false);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f113449f, "translationX", (float) (this.f113457n / 4), 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f113448e, "translationX", (float) ((-this.f113457n) / 4), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.C448111 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CaptureLayout.this.f113449f.setClickable(true);
                CaptureLayout.this.f113448e.setClickable(true);
            }
        });
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    /* renamed from: e */
    private void m177698e() {
        setWillNotDraw(false);
        this.f113451h = new C44843b(getContext(), this.f113459p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f113451h.setLayoutParams(layoutParams);
        this.f113451h.setCaptureLisenter(new AbstractC44772a() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.C448122 */

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158510a() {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158510a();
                }
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: c */
            public void mo158515c() {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158515c();
                }
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: b */
            public void mo158513b() {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158513b();
                }
                CaptureLayout.this.mo158591d();
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158511a(float f) {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158511a(f);
                }
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: a */
            public void mo158512a(long j) {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158512a(j);
                }
                CaptureLayout.this.mo158591d();
            }

            @Override // com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a
            /* renamed from: b */
            public void mo158514b(long j) {
                if (CaptureLayout.this.f113444a != null) {
                    CaptureLayout.this.f113444a.mo158514b(j);
                }
                CaptureLayout.this.mo158591d();
                CaptureLayout.this.mo158589b();
            }
        });
        this.f113449f = new C44853e(getContext(), 1, this.f113459p);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins((this.f113457n / 4) - (this.f113459p / 2), 0, 0, 0);
        this.f113449f.setLayoutParams(layoutParams2);
        this.f113449f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.View$OnClickListenerC448133 */

            public void onClick(View view) {
                if (CaptureLayout.this.f113445b != null) {
                    CaptureLayout.this.f113445b.mo158521a();
                }
                CaptureLayout.this.mo158591d();
            }
        });
        this.f113448e = new C44853e(getContext(), 2, this.f113459p);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 21;
        layoutParams3.setMargins(0, 0, (this.f113457n / 4) - (this.f113459p / 2), 0);
        this.f113448e.setLayoutParams(layoutParams3);
        this.f113448e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.View$OnClickListenerC448144 */

            public void onClick(View view) {
                if (CaptureLayout.this.f113445b != null) {
                    CaptureLayout.this.f113445b.mo158522b();
                }
                CaptureLayout.this.mo158591d();
            }
        });
        this.f113452i = new C44852d(getContext(), (int) (((float) this.f113459p) / 2.5f));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        layoutParams4.setMargins(this.f113457n / 6, 0, 0, 0);
        this.f113452i.setLayoutParams(layoutParams4);
        this.f113452i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.View$OnClickListenerC448155 */

            public void onClick(View view) {
                if (CaptureLayout.this.f113446c != null) {
                    CaptureLayout.this.f113446c.mo158516a();
                }
            }
        });
        this.f113453j = new ImageView(getContext());
        int i = this.f113459p;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) (((float) i) / 2.5f), (int) (((float) i) / 2.5f));
        layoutParams5.gravity = 16;
        layoutParams5.setMargins(this.f113455l, 0, 0, 0);
        this.f113453j.setLayoutParams(layoutParams5);
        this.f113453j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.View$OnClickListenerC448166 */

            public void onClick(View view) {
                if (CaptureLayout.this.f113446c != null) {
                    CaptureLayout.this.f113446c.mo158516a();
                }
            }
        });
        this.f113454k = new ImageView(getContext());
        int i2 = this.f113459p;
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) (((float) i2) / 2.5f), (int) (((float) i2) / 2.5f));
        layoutParams6.gravity = 21;
        layoutParams6.setMargins(0, 0, this.f113455l, 0);
        this.f113454k.setLayoutParams(layoutParams6);
        this.f113454k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mediarecorder.view.CaptureLayout.View$OnClickListenerC448177 */

            public void onClick(View view) {
                if (CaptureLayout.this.f113447d != null) {
                    CaptureLayout.this.f113447d.mo158516a();
                }
            }
        });
        this.f113456m = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams7.gravity = 1;
        layoutParams7.setMargins(0, 0, 0, C44801j.m177654b(getContext(), 5));
        this.f113456m.setText(R.string.Lark_Legacy_CameraRecordTip);
        this.f113456m.setTextColor(-1);
        this.f113456m.setGravity(49);
        this.f113456m.setLayoutParams(layoutParams7);
        addView(this.f113451h);
        addView(this.f113449f);
        addView(this.f113448e);
        addView(this.f113452i);
        addView(this.f113453j);
        addView(this.f113454k);
        addView(this.f113456m);
    }

    public void setCaptureLisenter(AbstractC44772a aVar) {
        this.f113444a = aVar;
    }

    public void setLeftClickListener(AbstractC44773b bVar) {
        this.f113446c = bVar;
    }

    public void setReturnListener(AbstractC44776e eVar) {
        this.f113450g = eVar;
    }

    public void setRightClickListener(AbstractC44773b bVar) {
        this.f113447d = bVar;
    }

    public void setTypeLisenter(AbstractC44777f fVar) {
        this.f113445b = fVar;
    }

    public CaptureLayout(Context context) {
        this(context, null);
    }

    public void setButtonFeatures(int i) {
        this.f113451h.setButtonFeatures(i);
    }

    public void setDuration(int i) {
        this.f113451h.setDuration(i);
    }

    public void setTip(String str) {
        this.f113456m.setText(str);
    }

    public void setTextWithAnimation(int i) {
        this.f113456m.setText(i);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f113456m, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(2500L);
        ofFloat.start();
    }

    public CaptureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f113457n, this.f113458o);
    }

    /* renamed from: a */
    public void mo158588a(int i, int i2) {
        this.f113460q = i;
        this.f113461r = i2;
        if (i != 0) {
            this.f113453j.setImageResource(i);
            this.f113453j.setVisibility(0);
            this.f113452i.setVisibility(8);
        } else {
            this.f113453j.setVisibility(8);
            this.f113452i.setVisibility(0);
        }
        if (this.f113461r != 0) {
            this.f113454k.setImageResource(i2);
            this.f113454k.setVisibility(0);
            return;
        }
        this.f113454k.setVisibility(8);
    }

    public CaptureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113462s = true;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (getResources().getConfiguration().orientation == 1) {
            this.f113457n = displayMetrics.widthPixels;
        } else {
            this.f113457n = displayMetrics.widthPixels / 2;
        }
        int i2 = (int) (((float) this.f113457n) / 6.0f);
        this.f113459p = i2;
        this.f113458o = i2 + ((i2 / 5) * 2) + C44801j.m177654b(context, 60);
        this.f113455l = (this.f113457n * 2) / 9;
        m177698e();
        mo158587a();
    }
}
