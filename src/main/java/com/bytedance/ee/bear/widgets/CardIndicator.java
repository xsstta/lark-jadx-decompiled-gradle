package com.bytedance.ee.bear.widgets;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.reflect.Array;

public class CardIndicator extends View implements FixPageTransformerViewPager.AbstractC11859d {

    /* renamed from: A */
    private boolean f31733A;

    /* renamed from: B */
    private int f31734B;

    /* renamed from: C */
    private float f31735C;

    /* renamed from: D */
    private int f31736D;

    /* renamed from: a */
    public int f31737a;

    /* renamed from: b */
    public int f31738b;

    /* renamed from: c */
    public int f31739c;

    /* renamed from: d */
    public Paint f31740d;

    /* renamed from: e */
    public float f31741e;

    /* renamed from: f */
    public ArgbEvaluator f31742f;

    /* renamed from: g */
    private final int f31743g;

    /* renamed from: h */
    private final int f31744h;

    /* renamed from: i */
    private final int f31745i;

    /* renamed from: j */
    private final int f31746j;

    /* renamed from: k */
    private final int f31747k;

    /* renamed from: l */
    private final int f31748l;

    /* renamed from: m */
    private final int f31749m;

    /* renamed from: n */
    private final int f31750n;

    /* renamed from: o */
    private final int f31751o;

    /* renamed from: p */
    private int f31752p;

    /* renamed from: q */
    private int f31753q;

    /* renamed from: r */
    private int f31754r;

    /* renamed from: s */
    private int f31755s;

    /* renamed from: t */
    private FixPageTransformerViewPager f31756t;

    /* renamed from: u */
    private ViewPager2 f31757u;

    /* renamed from: v */
    private C11808a[] f31758v;

    /* renamed from: w */
    private C11808a[] f31759w;

    /* renamed from: x */
    private C11808a[][] f31760x;

    /* renamed from: y */
    private C11808a[] f31761y;

    /* renamed from: z */
    private int f31762z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m48952a(View view) {
    }

    /* renamed from: d */
    private boolean m48955d() {
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f31756t;
        if (fixPageTransformerViewPager == null || fixPageTransformerViewPager.getAdapter() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m48956e() {
        ViewPager2 viewPager2 = this.f31757u;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo45164b() {
        if (this.f31736D == 11) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m48954c() {
        if (!m48955d() || !m48956e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m48957f() {
        if (getCount() <= 5) {
            m48958g();
        } else if (getCount() == 6) {
            m48959h();
        } else {
            m48960i();
        }
    }

    private int getCurrentItem() {
        if (!m48955d()) {
            return this.f31756t.getCurrentItem();
        }
        if (!m48956e()) {
            return this.f31757u.getCurrentItem();
        }
        return 0;
    }

    /* renamed from: g */
    private void m48958g() {
        int count = ((this.f31752p - (getCount() * this.f31745i)) - ((getCount() - 1) * this.f31749m)) / 2;
        this.f31758v = new C11808a[getCount()];
        for (int i = 0; i < getCount(); i++) {
            this.f31758v[i] = new C11808a(this.f31745i, count);
            count += this.f31745i + this.f31749m;
        }
        this.f31759w = this.f31758v;
    }

    private int getCount() {
        if (!m48955d()) {
            return this.f31756t.getAdapter().mo18476a();
        }
        if (!m48956e()) {
            return this.f31757u.getAdapter().getItemCount();
        }
        return 0;
    }

    private int getHeightLinePos() {
        if (!this.f31733A || this.f31741e == BitmapDescriptorFactory.HUE_RED) {
            int i = this.f31762z;
            if (i < 4) {
                return i;
            }
            if (i >= 4 && i <= getCount() - 3) {
                return 4;
            }
            if (this.f31762z == getCount() - 2) {
                return 5;
            }
            return 6;
        }
        int i2 = this.f31762z;
        if (i2 == 0) {
            return 1;
        }
        if (i2 < 4) {
            return i2 + 1;
        }
        if (i2 < 4 || i2 > getCount() - 3) {
            return 6;
        }
        return 5;
    }

    /* renamed from: a */
    public void mo45163a() {
        int currentItem = getCurrentItem();
        if (currentItem >= getCount()) {
            currentItem = getCount() - 1;
        }
        this.f31762z = currentItem;
        if (getCount() <= 1) {
            setVisibility(8);
            return;
        }
        if (getVisibility() != 4) {
            setVisibility(0);
        }
        m48957f();
        invalidate();
    }

    /* renamed from: h */
    private void m48959h() {
        int count = getCount();
        int[] iArr = new int[2];
        iArr[1] = getCount();
        iArr[0] = count;
        this.f31760x = (C11808a[][]) Array.newInstance(C11808a.class, iArr);
        this.f31758v = new C11808a[getCount()];
        this.f31759w = new C11808a[getCount()];
        this.f31760x[0][0] = new C11808a(this.f31745i, this.f31753q);
        C11808a[][] aVarArr = this.f31760x;
        aVarArr[0][1] = new C11808a(this.f31745i, aVarArr[0][0].f31765c + this.f31749m);
        C11808a[][] aVarArr2 = this.f31760x;
        aVarArr2[0][2] = new C11808a(this.f31745i, aVarArr2[0][1].f31765c + this.f31749m);
        C11808a[][] aVarArr3 = this.f31760x;
        aVarArr3[0][3] = new C11808a(this.f31746j, aVarArr3[0][2].f31765c + this.f31750n);
        C11808a[][] aVarArr4 = this.f31760x;
        aVarArr4[0][4] = new C11808a(this.f31747k, aVarArr4[0][3].f31765c + this.f31751o);
        C11808a[][] aVarArr5 = this.f31760x;
        aVarArr5[0][5] = new C11808a(0, aVarArr5[0][4].f31765c + this.f31751o);
        C11808a[][] aVarArr6 = this.f31760x;
        aVarArr6[1] = aVarArr6[0];
        aVarArr6[2] = aVarArr6[0];
        aVarArr6[3][0] = new C11808a(this.f31746j, this.f31754r);
        C11808a[][] aVarArr7 = this.f31760x;
        aVarArr7[3][1] = new C11808a(this.f31745i, aVarArr7[3][0].f31765c + this.f31750n);
        C11808a[][] aVarArr8 = this.f31760x;
        aVarArr8[3][2] = new C11808a(this.f31745i, aVarArr8[3][1].f31765c + this.f31749m);
        C11808a[][] aVarArr9 = this.f31760x;
        aVarArr9[3][3] = new C11808a(this.f31745i, aVarArr9[3][2].f31765c + this.f31749m);
        C11808a[][] aVarArr10 = this.f31760x;
        aVarArr10[3][4] = new C11808a(this.f31746j, aVarArr10[3][3].f31765c + this.f31750n);
        C11808a[][] aVarArr11 = this.f31760x;
        aVarArr11[3][5] = new C11808a(this.f31747k, aVarArr11[3][4].f31765c + this.f31751o);
        this.f31760x[4][0] = new C11808a(this.f31747k, this.f31754r);
        C11808a[][] aVarArr12 = this.f31760x;
        aVarArr12[4][1] = new C11808a(this.f31746j, aVarArr12[4][0].f31765c + this.f31751o);
        C11808a[][] aVarArr13 = this.f31760x;
        aVarArr13[4][2] = new C11808a(this.f31745i, aVarArr13[4][1].f31765c + this.f31750n);
        C11808a[][] aVarArr14 = this.f31760x;
        aVarArr14[4][3] = new C11808a(this.f31745i, aVarArr14[4][2].f31765c + this.f31749m);
        C11808a[][] aVarArr15 = this.f31760x;
        aVarArr15[4][4] = new C11808a(this.f31745i, aVarArr15[4][3].f31765c + this.f31749m);
        C11808a[][] aVarArr16 = this.f31760x;
        aVarArr16[4][5] = new C11808a(this.f31746j, aVarArr16[4][4].f31765c + this.f31750n);
        this.f31760x[5][0] = new C11808a(0, this.f31754r - this.f31747k);
        this.f31760x[5][1] = new C11808a(this.f31747k, this.f31753q);
        C11808a[][] aVarArr17 = this.f31760x;
        aVarArr17[5][2] = new C11808a(this.f31746j, aVarArr17[5][1].f31765c + this.f31751o);
        C11808a[][] aVarArr18 = this.f31760x;
        aVarArr18[5][3] = new C11808a(this.f31745i, aVarArr18[5][2].f31765c + this.f31750n);
        C11808a[][] aVarArr19 = this.f31760x;
        aVarArr19[5][4] = new C11808a(this.f31745i, aVarArr19[5][3].f31765c + this.f31749m);
        C11808a[][] aVarArr20 = this.f31760x;
        aVarArr20[5][5] = new C11808a(this.f31745i, aVarArr20[5][4].f31765c + this.f31749m);
        C11808a[] aVarArr21 = this.f31760x[this.f31762z];
        this.f31758v = aVarArr21;
        this.f31759w = aVarArr21;
    }

    /* renamed from: i */
    private void m48960i() {
        C11808a[][] aVarArr = (C11808a[][]) Array.newInstance(C11808a.class, 7, 8);
        this.f31760x = aVarArr;
        this.f31758v = new C11808a[8];
        this.f31761y = new C11808a[8];
        aVarArr[0][0] = new C11808a(this.f31745i, this.f31753q);
        C11808a[][] aVarArr2 = this.f31760x;
        aVarArr2[0][1] = new C11808a(this.f31745i, aVarArr2[0][0].f31765c + this.f31749m);
        C11808a[][] aVarArr3 = this.f31760x;
        aVarArr3[0][2] = new C11808a(this.f31745i, aVarArr3[0][1].f31765c + this.f31749m);
        C11808a[][] aVarArr4 = this.f31760x;
        aVarArr4[0][3] = new C11808a(this.f31746j, aVarArr4[0][2].f31765c + this.f31750n);
        C11808a[][] aVarArr5 = this.f31760x;
        aVarArr5[0][4] = new C11808a(this.f31747k, aVarArr5[0][3].f31765c + this.f31751o);
        C11808a[][] aVarArr6 = this.f31760x;
        aVarArr6[0][5] = new C11808a(0, aVarArr6[0][4].f31765c + this.f31751o);
        C11808a[][] aVarArr7 = this.f31760x;
        aVarArr7[0][6] = new C11808a(0, aVarArr7[0][5].f31765c + this.f31751o);
        C11808a[][] aVarArr8 = this.f31760x;
        aVarArr8[0][7] = new C11808a(0, aVarArr8[0][6].f31765c + this.f31751o);
        C11808a[][] aVarArr9 = this.f31760x;
        aVarArr9[1] = aVarArr9[0];
        aVarArr9[2] = aVarArr9[0];
        aVarArr9[3][0] = new C11808a(this.f31746j, this.f31754r);
        C11808a[][] aVarArr10 = this.f31760x;
        aVarArr10[3][1] = new C11808a(this.f31745i, aVarArr10[3][0].f31765c + this.f31750n);
        C11808a[][] aVarArr11 = this.f31760x;
        aVarArr11[3][2] = new C11808a(this.f31745i, aVarArr11[3][1].f31765c + this.f31749m);
        C11808a[][] aVarArr12 = this.f31760x;
        aVarArr12[3][3] = new C11808a(this.f31745i, aVarArr12[3][2].f31765c + this.f31749m);
        C11808a[][] aVarArr13 = this.f31760x;
        aVarArr13[3][4] = new C11808a(this.f31746j, aVarArr13[3][3].f31765c + this.f31750n);
        C11808a[][] aVarArr14 = this.f31760x;
        aVarArr14[3][5] = new C11808a(this.f31747k, aVarArr14[3][4].f31765c + this.f31751o);
        C11808a[][] aVarArr15 = this.f31760x;
        aVarArr15[3][6] = new C11808a(0, aVarArr15[3][5].f31765c + this.f31751o);
        C11808a[][] aVarArr16 = this.f31760x;
        aVarArr16[3][7] = new C11808a(0, aVarArr16[3][6].f31765c + this.f31751o);
        this.f31760x[4][0] = new C11808a(this.f31747k, this.f31755s);
        C11808a[][] aVarArr17 = this.f31760x;
        aVarArr17[4][1] = new C11808a(this.f31746j, aVarArr17[4][0].f31765c + this.f31751o);
        C11808a[][] aVarArr18 = this.f31760x;
        aVarArr18[4][2] = new C11808a(this.f31745i, aVarArr18[4][1].f31765c + this.f31750n);
        C11808a[][] aVarArr19 = this.f31760x;
        aVarArr19[4][3] = new C11808a(this.f31745i, aVarArr19[4][2].f31765c + this.f31749m);
        C11808a[][] aVarArr20 = this.f31760x;
        aVarArr20[4][4] = new C11808a(this.f31745i, aVarArr20[4][3].f31765c + this.f31749m);
        C11808a[][] aVarArr21 = this.f31760x;
        aVarArr21[4][5] = new C11808a(this.f31746j, aVarArr21[4][4].f31765c + this.f31750n);
        C11808a[][] aVarArr22 = this.f31760x;
        aVarArr22[4][6] = new C11808a(this.f31747k, aVarArr22[4][5].f31765c + this.f31751o);
        C11808a[][] aVarArr23 = this.f31760x;
        aVarArr23[4][7] = new C11808a(0, aVarArr23[4][6].f31765c + this.f31751o);
        this.f31760x[5][0] = new C11808a(0, this.f31755s - this.f31747k);
        this.f31760x[5][1] = new C11808a(this.f31747k, this.f31754r);
        C11808a[][] aVarArr24 = this.f31760x;
        aVarArr24[5][2] = new C11808a(this.f31746j, aVarArr24[5][1].f31765c + this.f31751o);
        C11808a[][] aVarArr25 = this.f31760x;
        aVarArr25[5][3] = new C11808a(this.f31745i, aVarArr25[5][2].f31765c + this.f31750n);
        C11808a[][] aVarArr26 = this.f31760x;
        aVarArr26[5][4] = new C11808a(this.f31745i, aVarArr26[5][3].f31765c + this.f31749m);
        C11808a[][] aVarArr27 = this.f31760x;
        aVarArr27[5][5] = new C11808a(this.f31745i, aVarArr27[5][4].f31765c + this.f31749m);
        C11808a[][] aVarArr28 = this.f31760x;
        aVarArr28[5][6] = new C11808a(this.f31746j, aVarArr28[5][5].f31765c + this.f31750n);
        C11808a[][] aVarArr29 = this.f31760x;
        aVarArr29[5][7] = new C11808a(0, aVarArr29[5][6].f31765c + this.f31751o);
        this.f31760x[6][0] = new C11808a(0, this.f31755s - this.f31747k);
        this.f31760x[6][1] = new C11808a(0, this.f31754r - this.f31747k);
        this.f31760x[6][2] = new C11808a(this.f31747k, this.f31753q);
        C11808a[][] aVarArr30 = this.f31760x;
        aVarArr30[6][3] = new C11808a(this.f31746j, aVarArr30[6][2].f31765c + this.f31751o);
        C11808a[][] aVarArr31 = this.f31760x;
        aVarArr31[6][4] = new C11808a(this.f31745i, aVarArr31[6][3].f31765c + this.f31750n);
        C11808a[][] aVarArr32 = this.f31760x;
        aVarArr32[6][5] = new C11808a(this.f31745i, aVarArr32[6][4].f31765c + this.f31749m);
        C11808a[][] aVarArr33 = this.f31760x;
        aVarArr33[6][6] = new C11808a(this.f31745i, aVarArr33[6][5].f31765c + this.f31749m);
        C11808a[][] aVarArr34 = this.f31760x;
        aVarArr34[6][7] = new C11808a(0, aVarArr34[6][6].f31765c + this.f31751o);
        this.f31761y[0] = new C11808a(0, this.f31755s - this.f31745i);
        this.f31761y[1] = new C11808a(this.f31747k, this.f31755s);
        C11808a[] aVarArr35 = this.f31761y;
        aVarArr35[2] = new C11808a(this.f31746j, aVarArr35[1].f31765c + this.f31751o);
        C11808a[] aVarArr36 = this.f31761y;
        aVarArr36[3] = new C11808a(this.f31745i, aVarArr36[2].f31765c + this.f31750n);
        C11808a[] aVarArr37 = this.f31761y;
        aVarArr37[4] = new C11808a(this.f31745i, aVarArr37[3].f31765c + this.f31749m);
        C11808a[] aVarArr38 = this.f31761y;
        aVarArr38[5] = new C11808a(this.f31745i, aVarArr38[4].f31765c + this.f31749m);
        C11808a[] aVarArr39 = this.f31761y;
        aVarArr39[6] = new C11808a(this.f31746j, aVarArr39[5].f31765c + this.f31750n);
        C11808a[] aVarArr40 = this.f31761y;
        aVarArr40[7] = new C11808a(this.f31747k, aVarArr40[6].f31765c + this.f31751o);
        C11808a[] aVarArr41 = this.f31760x[getHeightLinePos()];
        this.f31758v = aVarArr41;
        this.f31759w = aVarArr41;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.CardIndicator$b */
    public class C11809b extends ViewPager2.OnPageChangeCallback {
        private C11809b() {
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            CardIndicator.this.mo18472b(i);
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            CardIndicator.this.mo18470a(i);
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            CardIndicator.this.mo18471a(i, f, i2);
        }
    }

    public CardIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private int m48953c(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: a */
    public void mo18470a(int i) {
        C13479a.m54772d("Indicator", "onPageSelected(),  position:" + i);
        invalidate();
    }

    public void setViewPager(FixPageTransformerViewPager fixPageTransformerViewPager) {
        if (fixPageTransformerViewPager == null || fixPageTransformerViewPager.getAdapter() == null) {
            C13479a.m54758a("Indicator", "setViewPager(), viewPage is null || adapter == null");
            return;
        }
        this.f31756t = fixPageTransformerViewPager;
        fixPageTransformerViewPager.mo45500a((FixPageTransformerViewPager.AbstractC11859d) this);
        mo45163a();
    }

    public void setViewPager2(ViewPager2 viewPager2) {
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            C13479a.m54758a("Indicator", "setViewPager(), viewPage is null || adapter == null");
            return;
        }
        this.f31757u = viewPager2;
        viewPager2.registerOnPageChangeCallback(new C11809b());
        mo45163a();
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: b */
    public void mo18472b(int i) {
        C13479a.m54772d("Indicator", "onPageScrollStateChanged(),  state:" + i);
        if (i == 0) {
            C13479a.m54772d("Indicator", "onPageScrollStateChanged(),  SCROLL_STATE_IDLE");
            if (getCount() == 6) {
                C11808a[] aVarArr = this.f31760x[this.f31762z];
                this.f31759w = aVarArr;
                this.f31758v = aVarArr;
            }
            float f = BitmapDescriptorFactory.HUE_RED;
            this.f31741e = BitmapDescriptorFactory.HUE_RED;
            if (this.f31733A) {
                f = 1.0f;
            }
            this.f31735C = f;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getCount() > 6) {
            this.f31734B = getHeightLinePos();
        }
        if (this.f31758v != null) {
            int i = 0;
            while (true) {
                C11808a[] aVarArr = this.f31758v;
                if (i < aVarArr.length) {
                    if (this.f31733A) {
                        int i2 = this.f31734B;
                        if (i == i2 - 1) {
                            aVarArr[i].f31768f = 1.0f - this.f31735C;
                        } else if (i == i2) {
                            aVarArr[i].f31768f = this.f31735C;
                        } else {
                            aVarArr[i].f31768f = BitmapDescriptorFactory.HUE_RED;
                        }
                    } else {
                        int i3 = this.f31734B;
                        if (i == i3 + 1) {
                            aVarArr[i].f31768f = this.f31735C;
                        } else if (i == i3) {
                            aVarArr[i].f31768f = 1.0f - this.f31735C;
                        } else {
                            aVarArr[i].f31768f = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    this.f31758v[i].f31769g = this.f31759w[i];
                    this.f31758v[i].mo45169a(canvas);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.CardIndicator$a */
    public class C11808a {

        /* renamed from: a */
        int f31763a;

        /* renamed from: b */
        int f31764b;

        /* renamed from: c */
        int f31765c;

        /* renamed from: d */
        int f31766d;

        /* renamed from: e */
        int f31767e;

        /* renamed from: f */
        float f31768f;

        /* renamed from: g */
        C11808a f31769g = this;

        /* renamed from: a */
        public void mo45169a(Canvas canvas) {
            Paint.Cap cap;
            int i = this.f31764b;
            float f = ((float) i) + (((float) (this.f31769g.f31764b - i)) * CardIndicator.this.f31741e);
            int i2 = this.f31763a;
            float f2 = ((float) i2) + (((float) (this.f31769g.f31763a - i2)) * CardIndicator.this.f31741e);
            Paint paint = CardIndicator.this.f31740d;
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                cap = Paint.Cap.BUTT;
            } else {
                cap = Paint.Cap.ROUND;
            }
            paint.setStrokeCap(cap);
            CardIndicator.this.f31740d.setColor(((Integer) CardIndicator.this.f31742f.evaluate(this.f31768f, Integer.valueOf(CardIndicator.this.f31738b), Integer.valueOf(CardIndicator.this.f31737a))).intValue());
            if (CardIndicator.this.mo45164b()) {
                int i3 = this.f31766d;
                canvas.drawLine(f, (float) i3, f2 + f, (float) i3, CardIndicator.this.f31740d);
                return;
            }
            int i4 = this.f31766d;
            canvas.drawLine((float) i4, f, (float) i4, f + f2, CardIndicator.this.f31740d);
        }

        public C11808a(int i, int i2) {
            this.f31763a = i;
            this.f31764b = i2;
            this.f31765c = i2 + i;
            this.f31766d = CardIndicator.this.f31739c / 2;
            this.f31767e = CardIndicator.this.f31738b;
        }
    }

    public CardIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    private void m48951a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f31740d = paint;
        paint.setAntiAlias(true);
        this.f31740d.setDither(true);
        this.f31742f = new ArgbEvaluator();
        setOnClickListener($$Lambda$CardIndicator$f4nUNQWjrSmuHtRWIznaALaC9aI.INSTANCE);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.defaultColor, R.attr.dividerWidth, R.attr.highLightColor, R.attr.indicator_orientation});
        this.f31737a = obtainStyledAttributes.getColor(2, this.f31743g);
        this.f31738b = obtainStyledAttributes.getColor(0, this.f31744h);
        int i = obtainStyledAttributes.getInt(3, this.f31748l);
        this.f31736D = obtainStyledAttributes.getInt(3, 11);
        obtainStyledAttributes.recycle();
        this.f31740d.setColor(this.f31738b);
        this.f31740d.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (mo45164b()) {
            i3 = getMeasuredWidth();
        } else {
            i3 = getMeasuredHeight();
        }
        this.f31752p = i3;
        if (mo45164b()) {
            i4 = getMeasuredHeight();
        } else {
            i4 = getMeasuredWidth();
        }
        this.f31739c = i4;
        int i5 = this.f31752p;
        int i6 = this.f31745i;
        int i7 = this.f31746j;
        int i8 = this.f31747k;
        int i9 = this.f31749m;
        int i10 = this.f31750n;
        int i11 = this.f31751o;
        this.f31753q = ((i5 - (((i6 * 3) + i7) + i8)) - (((i9 * 2) + i10) + i11)) / 2;
        this.f31754r = ((i5 - (((i6 * 3) + (i7 * 2)) + i8)) - (((i9 + i10) * 2) + i11)) / 2;
        this.f31755s = ((i5 - (((i6 * 3) + (i7 * 2)) + (i8 * 2))) - (((i9 + i10) + i11) * 2)) / 2;
        if (m48954c()) {
            this.f31762z = 0;
            m48957f();
            return;
        }
        mo45163a();
    }

    public CardIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31743g = C13615c.f35773a.getResources().getColor(R.color.text_title);
        this.f31744h = C13615c.f35773a.getResources().getColor(R.color.text_disable);
        this.f31745i = m48953c(10);
        this.f31746j = m48953c(6);
        this.f31747k = m48953c(3);
        this.f31748l = m48953c(2);
        this.f31749m = m48953c(8);
        this.f31750n = m48953c(13);
        this.f31751o = m48953c(13);
        this.f31733A = false;
        this.f31735C = BitmapDescriptorFactory.HUE_RED;
        this.f31736D = 11;
        m48951a(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18471a(int r6, float r7, int r8) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.CardIndicator.mo18471a(int, float, int):void");
    }
}
