package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27484l;

/* renamed from: com.ss.android.ad.splash.core.video.d */
public class C27396d implements AbstractC27376a {

    /* renamed from: a */
    public ImageView f68425a;

    /* renamed from: b */
    public AbstractC27400a f68426b;

    /* renamed from: c */
    private FrameLayout f68427c;

    /* renamed from: d */
    private TextView f68428d;

    /* renamed from: e */
    private TextView f68429e;

    /* renamed from: f */
    private ImageView f68430f;

    /* renamed from: g */
    private SSRenderSurfaceView f68431g;

    /* renamed from: h */
    private View f68432h;

    /* renamed from: i */
    private int f68433i;

    /* renamed from: j */
    private int f68434j;

    /* renamed from: k */
    private View f68435k;

    /* renamed from: l */
    private Context f68436l;

    /* renamed from: m */
    private boolean f68437m;

    /* renamed from: n */
    private FrameLayout f68438n;

    /* renamed from: o */
    private TextView f68439o;

    /* renamed from: p */
    private Space f68440p;

    /* renamed from: q */
    private TextView f68441q;

    /* renamed from: r */
    private TextView f68442r;

    /* renamed from: s */
    private boolean f68443s;

    /* renamed from: t */
    private View.OnTouchListener f68444t = new View.OnTouchListener() {
        /* class com.ss.android.ad.splash.core.video.C27396d.View$OnTouchListenerC273993 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            C27396d.this.mo97823a(view, motionEvent);
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ad.splash.core.video.d$a */
    public interface AbstractC27400a {
        /* renamed from: a */
        void mo97841a();

        /* renamed from: a */
        void mo97842a(C27396d dVar, SurfaceHolder surfaceHolder);

        /* renamed from: a */
        void mo97843a(C27396d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3);

        /* renamed from: a */
        void mo97844a(C27396d dVar, View view, MotionEvent motionEvent);

        /* renamed from: b */
        void mo97845b(C27396d dVar, SurfaceHolder surfaceHolder);
    }

    /* renamed from: e */
    public boolean mo97836e() {
        return this.f68437m;
    }

    /* renamed from: a */
    public void mo97828a(boolean z, boolean z2) {
        if (this.f68443s) {
            m99952b(z, z2);
            return;
        }
        this.f68432h.setVisibility(8);
        if (z) {
            this.f68430f.setVisibility(0);
            if (C27287e.m99258d()) {
                this.f68428d.setVisibility(0);
            }
        }
        if (z2) {
            this.f68427c.setVisibility(0);
            this.f68429e.setVisibility(0);
        }
        if (z && C27287e.m99272l() == 1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.setMargins(0, 0, (int) C27484l.m100391a(this.f68436l, 10.0f), 0);
            this.f68427c.setLayoutParams(layoutParams);
            this.f68427c.setPadding(0, 0, 0, (int) C27484l.m100391a(this.f68436l, 10.0f));
            m99957i();
        } else if (!z2) {
            m99957i();
        }
    }

    /* renamed from: a */
    public void mo97827a(boolean z) {
        this.f68443s = z;
    }

    /* renamed from: b */
    public void mo97829b() {
        this.f68432h.setVisibility(0);
    }

    /* renamed from: c */
    public void mo97832c() {
        this.f68432h.setVisibility(8);
    }

    /* renamed from: d */
    public boolean mo97835d() {
        if (this.f68426b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m99955g() {
        this.f68438n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.video.C27396d.View$OnClickListenerC273971 */

            public void onClick(View view) {
                if (C27396d.this.mo97835d()) {
                    C27396d.this.f68426b.mo97841a();
                }
            }
        });
        this.f68429e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.video.C27396d.View$OnClickListenerC273982 */

            public void onClick(View view) {
                view.setVisibility(4);
                C27396d.this.f68425a.setVisibility(0);
                RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(800);
                rotateAnimation.setRepeatCount(10);
                rotateAnimation.setRepeatMode(1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                C27396d.this.f68425a.startAnimation(rotateAnimation);
                if (C27396d.this.mo97835d()) {
                    C27396d.this.f68426b.mo97841a();
                }
            }
        });
    }

    /* renamed from: j */
    private void m99958j() {
        if (this.f68443s) {
            this.f68438n.setVisibility(8);
            this.f68441q.setVisibility(8);
            this.f68442r.setVisibility(8);
        }
    }

    /* renamed from: a */
    public FrameLayout.LayoutParams mo97820a() {
        if (this.f68435k.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) this.f68435k.getLayoutParams();
        }
        return null;
    }

    /* renamed from: h */
    private void m99956h() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f68440p.getLayoutParams();
        layoutParams.height = C27478h.m100382j() - 4;
        this.f68440p.setLayoutParams(layoutParams);
        this.f68440p.setVisibility(4);
        this.f68438n.setPadding(4, 4, 0, 4);
    }

    /* renamed from: i */
    private void m99957i() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) C27484l.m100391a(this.f68436l, 14.0f), (int) C27484l.m100391a(this.f68436l, 9.0f), 0);
        this.f68428d.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public void mo97837f() {
        mo97833c(8);
        this.f68429e.setVisibility(4);
        this.f68427c.setVisibility(8);
        this.f68428d.setVisibility(8);
        this.f68430f.setVisibility(8);
        this.f68425a.setVisibility(4);
        m99958j();
    }

    /* renamed from: a */
    public void mo97826a(AbstractC27400a aVar) {
        this.f68426b = aVar;
    }

    /* renamed from: b */
    public void mo97830b(int i) {
        this.f68435k.setVisibility(0);
        SSRenderSurfaceView sSRenderSurfaceView = this.f68431g;
        if (sSRenderSurfaceView != null) {
            sSRenderSurfaceView.setVisibility(i);
        }
    }

    /* renamed from: c */
    public void mo97833c(int i) {
        C27484l.m100394a(this.f68435k, i);
    }

    /* renamed from: d */
    private int m99953d(int i) {
        if (this.f68433i <= 0 || this.f68434j <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f68436l.getResources().getDimensionPixelSize(R.dimen.splash_ad_video_container_maxheight);
        int dimensionPixelSize2 = this.f68436l.getResources().getDimensionPixelSize(R.dimen.splash_ad_video_container_minheight);
        int i2 = (int) (((float) this.f68434j) * ((((float) i) * 1.0f) / ((float) this.f68433i)));
        if (i2 > dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    /* renamed from: a */
    public void mo97821a(int i) {
        if (C27287e.m99280t() != null) {
            this.f68430f.setImageResource(C27287e.m99280t().mo97990a(i));
        }
    }

    @Override // com.ss.android.ad.splash.core.video.AbstractC27376a
    /* renamed from: b */
    public void mo97762b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f68431g.getHolder()) {
            this.f68437m = false;
            if (mo97835d()) {
                this.f68426b.mo97845b(this, surfaceHolder);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.AbstractC27376a
    /* renamed from: a */
    public void mo97760a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f68431g.getHolder()) {
            this.f68437m = true;
            if (mo97835d()) {
                this.f68426b.mo97842a(this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    private void m99951a(View view) {
        if (view != null) {
            this.f68429e = (TextView) view.findViewById(R.id.ad_splash_jump_btn);
            this.f68427c = (FrameLayout) view.findViewById(R.id.ad_splash_ignore);
            this.f68428d = (TextView) view.findViewById(R.id.ad_splash_has_wifi_loaded_text);
            if (C27287e.m99276p() != 0) {
                this.f68428d.setText(C27287e.m99276p());
            } else {
                this.f68428d.setText(R.string.splash_ad_wifi_loaded_default);
            }
            this.f68425a = (ImageView) view.findViewById(R.id.ad_splash_skip_loading);
            this.f68430f = (ImageView) view.findViewById(R.id.ad_splash_logo);
            this.f68439o = (TextView) view.findViewById(R.id.ad_ab_bottom_skip_view);
            this.f68438n = (FrameLayout) view.findViewById(R.id.ad_ab_bottom_skip_root_view);
            this.f68440p = (Space) view.findViewById(R.id.ad_ab_banner_space);
            this.f68441q = (TextView) view.findViewById(R.id.ad_ab_plash_has_wifi_loaded_text_view);
            this.f68442r = (TextView) view.findViewById(R.id.ad_ab_mark_view);
            if (C27287e.m99278r() != 0) {
                this.f68429e.setText(C27287e.m99278r());
            } else {
                this.f68429e.setText(R.string.splash_ad_ignore);
            }
            if (C27287e.m99279s() != 0) {
                this.f68425a.setImageResource(C27287e.m99279s());
            } else {
                this.f68425a.setImageResource(R.drawable.splash_ad_loading);
            }
            if (C27287e.m99277q() != 0) {
                this.f68429e.setBackgroundResource(C27287e.m99277q());
                this.f68439o.setBackgroundResource(C27287e.m99277q());
            }
            SSRenderSurfaceView sSRenderSurfaceView = (SSRenderSurfaceView) view.findViewById(R.id.video_surface);
            this.f68431g = sSRenderSurfaceView;
            sSRenderSurfaceView.mo97754a(this);
            this.f68432h = view.findViewById(R.id.video_loading_progress);
            this.f68427c.setWillNotDraw(false);
            m99955g();
        }
    }

    /* renamed from: a */
    public void mo97824a(ViewGroup viewGroup) {
        if (this.f68435k.getParent() != null) {
            ((ViewGroup) this.f68435k.getParent()).removeView(this.f68435k);
        }
        viewGroup.addView(this.f68435k);
        mo97833c(0);
    }

    /* renamed from: a */
    public void mo97825a(FrameLayout.LayoutParams layoutParams) {
        this.f68435k.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo97822a(int i, int i2) {
        this.f68433i = i;
        this.f68434j = i2;
    }

    /* renamed from: a */
    public void mo97823a(View view, MotionEvent motionEvent) {
        if (mo97835d()) {
            this.f68426b.mo97844a(this, view, motionEvent);
        }
    }

    C27396d(Context context, View view) {
        mo97833c(8);
        this.f68436l = context;
        m99951a(view);
        this.f68435k = view;
        if (view != null) {
            view.setOnTouchListener(this.f68444t);
        }
    }

    /* renamed from: d */
    private void m99954d(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f68435k.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f68435k.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo97831b(int i, int i2) {
        if (i == -1) {
            i = this.f68436l.getResources().getDisplayMetrics().widthPixels;
        }
        if (i > 0) {
            m99954d(i, m99953d(i));
        }
    }

    /* renamed from: c */
    public void mo97834c(int i, int i2) {
        SSRenderSurfaceView sSRenderSurfaceView = this.f68431g;
        if (sSRenderSurfaceView == null) {
            return;
        }
        if (i != 0 || i2 != 0) {
            ((RelativeLayout.LayoutParams) sSRenderSurfaceView.getLayoutParams()).setMargins(i, i2, i, i2);
        }
    }

    /* renamed from: b */
    private void m99952b(boolean z, boolean z2) {
        this.f68432h.setVisibility(8);
        if (z) {
            this.f68430f.setVisibility(0);
            this.f68442r.setVisibility(0);
            if (C27287e.m99258d()) {
                this.f68441q.setVisibility(0);
            }
        }
        if (z2) {
            m99956h();
            this.f68438n.setVisibility(0);
            this.f68439o.setBackgroundResource(R.drawable.splash_ad_ab_media_ignore_bg);
            this.f68439o.setTextColor(this.f68436l.getResources().getColor(R.color.splash_ad_ab_skip_media_text_color));
        }
    }

    @Override // com.ss.android.ad.splash.core.video.AbstractC27376a
    /* renamed from: a */
    public void mo97761a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f68431g.getHolder() && mo97835d()) {
            this.f68426b.mo97843a(this, surfaceHolder, i, i2, i3);
        }
    }
}
