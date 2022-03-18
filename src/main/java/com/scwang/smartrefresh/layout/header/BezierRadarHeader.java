package com.scwang.smartrefresh.layout.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.bezierradar.C27155a;
import com.scwang.smartrefresh.layout.header.bezierradar.C27158b;
import com.scwang.smartrefresh.layout.header.bezierradar.C27159c;
import com.scwang.smartrefresh.layout.header.bezierradar.WaveView;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.ttm.player.MediaPlayer;

public class BezierRadarHeader extends FrameLayout implements AbstractC27126e {

    /* renamed from: a */
    public WaveView f67500a;

    /* renamed from: b */
    public C27158b f67501b;

    /* renamed from: c */
    public C27159c f67502c;

    /* renamed from: d */
    private C27155a f67503d;

    /* renamed from: e */
    private boolean f67504e;

    /* renamed from: f */
    private boolean f67505f;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Scale;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return this.f67504e;
    }

    /* renamed from: com.scwang.smartrefresh.layout.header.BezierRadarHeader$4 */
    static /* synthetic */ class C271534 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67511a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.f67511a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.f67511a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.f67511a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.f67511a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.f67511a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271534.<clinit>():void");
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public BezierRadarHeader mo96525a(int i) {
        this.f67500a.setWaveColor(i);
        this.f67502c.setBackColor(i);
        return this;
    }

    /* renamed from: b */
    public BezierRadarHeader mo96526b(int i) {
        this.f67501b.setDotColor(i);
        this.f67503d.setFrontColor(i);
        this.f67502c.setFrontColor(i);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            mo96525a(iArr[0]);
        }
        if (iArr.length > 1) {
            mo96526b(iArr[1]);
        }
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f67502c.mo96559b();
        this.f67502c.animate().scaleX(BitmapDescriptorFactory.HUE_RED);
        this.f67502c.animate().scaleY(BitmapDescriptorFactory.HUE_RED);
        this.f67503d.setVisibility(0);
        this.f67503d.mo96548a();
        return MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m98723a(context, attributeSet, i);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
        this.f67500a.setWaveOffsetX(i);
        this.f67500a.invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        int i = C271534.f67511a[refreshState2.ordinal()];
        if (i == 1) {
            this.f67503d.setVisibility(8);
            this.f67501b.setAlpha(1.0f);
            this.f67501b.setVisibility(0);
        } else if (i == 2) {
            this.f67502c.setScaleX(BitmapDescriptorFactory.HUE_RED);
            this.f67502c.setScaleY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: a */
    private void m98723a(Context context, AttributeSet attributeSet, int i) {
        setMinimumHeight(C27144b.m98678a(100.0f));
        this.f67500a = new WaveView(getContext());
        this.f67503d = new C27155a(getContext());
        this.f67501b = new C27158b(getContext());
        this.f67502c = new C27159c(getContext());
        if (isInEditMode()) {
            addView(this.f67500a, -1, -1);
            addView(this.f67502c, -1, -1);
            this.f67500a.setHeadHeight(1000);
        } else {
            addView(this.f67500a, -1, -1);
            addView(this.f67501b, -1, -1);
            addView(this.f67502c, -1, -1);
            addView(this.f67503d, -1, -1);
            this.f67502c.setScaleX(BitmapDescriptorFactory.HUE_RED);
            this.f67502c.setScaleY(BitmapDescriptorFactory.HUE_RED);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.srlAccentColor, R.attr.srlEnableHorizontalDrag, R.attr.srlPrimaryColor});
        this.f67504e = obtainStyledAttributes.getBoolean(1, this.f67504e);
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            mo96525a(color);
        }
        if (color2 != 0) {
            mo96526b(color2);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(final AbstractC27129h hVar, int i, int i2) {
        this.f67505f = true;
        this.f67500a.setHeadHeight(i);
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f67500a.getWaveHeight(), 0, -((int) (((double) this.f67500a.getWaveHeight()) * 0.8d)), 0, -((int) (((float) this.f67500a.getWaveHeight()) * 0.4f)), 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271491 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BezierRadarHeader.this.f67500a.setWaveHeight(((Integer) valueAnimator.getAnimatedValue()).intValue() / 2);
                BezierRadarHeader.this.f67500a.invalidate();
            }
        });
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(800L);
        ofInt.start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271502 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BezierRadarHeader.this.f67501b.setVisibility(4);
                BezierRadarHeader.this.f67502c.animate().scaleX(1.0f);
                BezierRadarHeader.this.f67502c.animate().scaleY(1.0f);
                hVar.getLayout().postDelayed(new Runnable() {
                    /* class com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271502.RunnableC271511 */

                    public void run() {
                        BezierRadarHeader.this.f67502c.mo96558a();
                    }
                }, 200);
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.header.BezierRadarHeader.C271523 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BezierRadarHeader.this.f67501b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.start();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
        a_(f, i, i2, i3);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
        this.f67500a.setHeadHeight(Math.min(i2, i));
        this.f67500a.setWaveHeight((int) (((float) Math.max(0, i - i2)) * 1.9f));
        this.f67501b.setFraction(f);
        if (this.f67505f) {
            this.f67500a.invalidate();
        }
    }
}
