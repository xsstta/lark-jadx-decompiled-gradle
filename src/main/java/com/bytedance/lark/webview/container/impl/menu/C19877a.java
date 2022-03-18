package com.bytedance.lark.webview.container.impl.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.p3481a.AbstractC69614a;

/* renamed from: com.bytedance.lark.webview.container.impl.menu.a */
public class C19877a extends View implements AbstractC69614a {

    /* renamed from: a */
    public int f48552a;

    /* renamed from: b */
    public int f48553b;

    /* renamed from: c */
    public int f48554c;

    /* renamed from: d */
    public List<C19879a> f48555d = new ArrayList();

    /* renamed from: e */
    private int f48556e;

    /* renamed from: f */
    private int f48557f;

    /* renamed from: g */
    private int f48558g;

    /* renamed from: h */
    private int f48559h;

    /* renamed from: i */
    private Paint f48560i = new Paint(1);

    /* renamed from: j */
    private ValueAnimator f48561j;

    /* renamed from: k */
    private ValueAnimator f48562k;

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67365a() {
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67367a(int i, float f, int i2) {
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67368b() {
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67369b(int i) {
    }

    public int getCircleCount() {
        return this.f48559h;
    }

    public int getCurrentIndex() {
        return this.f48554c;
    }

    public int getRadius() {
        return this.f48556e;
    }

    public int getSelectedColor() {
        return this.f48552a;
    }

    public int getSpacing() {
        return this.f48557f;
    }

    public int getUnselectedColor() {
        return this.f48553b;
    }

    /* renamed from: c */
    private void m72557c() {
        this.f48555d.clear();
        if (this.f48559h > 0) {
            int height = (int) ((((float) getHeight()) / 2.0f) + 0.5f);
            int i = this.f48556e;
            int i2 = (i * 2) + this.f48557f;
            int paddingLeft = i + getPaddingLeft();
            for (int i3 = 0; i3 < this.f48559h; i3++) {
                this.f48555d.add(new C19879a(new PointF((float) paddingLeft, (float) height), this.f48553b));
                paddingLeft += i2;
            }
            this.f48555d.get(this.f48554c).f48565b = this.f48552a;
        }
    }

    /* renamed from: d */
    private void m72559d() {
        if (this.f48561j == null) {
            ValueAnimator ofArgb = ValueAnimator.ofArgb(this.f48552a, this.f48553b);
            this.f48561j = ofArgb;
            ofArgb.setDuration(400L);
            this.f48561j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.lark.webview.container.impl.menu.$$Lambda$a$_rQ2a7QQlgzpSmwmtVUKlw24kr4 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C19877a.lambda$_rQ2a7QQlgzpSmwmtVUKlw24kr4(C19877a.this, valueAnimator);
                }
            });
        }
        if (this.f48562k == null) {
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(this.f48553b, this.f48552a);
            this.f48562k = ofArgb2;
            ofArgb2.setDuration(400L);
            this.f48562k.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.lark.webview.container.impl.menu.C19877a.C198781 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    for (int i = 0; i < C19877a.this.f48555d.size(); i++) {
                        C19877a.this.f48555d.get(i).f48565b = C19877a.this.f48553b;
                    }
                    C19877a.this.f48555d.get(C19877a.this.f48554c).f48565b = C19877a.this.f48552a;
                    C19877a.this.invalidate();
                }
            });
            this.f48562k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.lark.webview.container.impl.menu.$$Lambda$a$TCDExpgKp5grONSKYmI8QmDw8 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C19877a.m270155lambda$TCDExpgKp5grONSKYmI8QmDw8(C19877a.this, valueAnimator);
                }
            });
        }
        this.f48561j.start();
        this.f48562k.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m72554a(canvas);
    }

    public void setUnselectedColor(int i) {
        this.f48553b = i;
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67366a(int i) {
        setCurrentIndex(i);
    }

    public void setSelectedColor(int i) {
        this.f48552a = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f48559h = i;
        m72557c();
        invalidate();
    }

    public void setCurrentIndex(int i) {
        this.f48558g = this.f48554c;
        this.f48554c = i;
        m72559d();
    }

    public void setRadius(int i) {
        this.f48556e = i;
        m72557c();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f48557f = i;
        m72557c();
        invalidate();
    }

    public C19877a(Context context) {
        super(context);
        m72553a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m72552a(ValueAnimator valueAnimator) {
        this.f48555d.get(this.f48554c).f48565b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m72555b(ValueAnimator valueAnimator) {
        this.f48555d.get(this.f48558g).f48565b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    /* renamed from: a */
    private void m72553a(Context context) {
        this.f48556e = (int) UIUtils.dip2Px(context, 3.0f);
        this.f48557f = (int) UIUtils.dip2Px(context, 6.0f);
        this.f48552a = C57582a.m223616d(context, R.color.primary_pri_500);
        this.f48553b = C57582a.m223616d(context, R.color.icon_disable);
    }

    /* renamed from: c */
    private int m72556c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = this.f48559h;
            return getPaddingRight() + (this.f48556e * i2 * 2) + ((i2 - 1) * this.f48557f) + getPaddingLeft();
        } else if (mode != 1073741824) {
            return 0;
        } else {
            return size;
        }
    }

    /* renamed from: d */
    private int m72558d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (this.f48556e * 2) + getPaddingTop() + getPaddingBottom();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    /* renamed from: a */
    private void m72554a(Canvas canvas) {
        this.f48560i.setStyle(Paint.Style.FILL);
        int size = this.f48555d.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.f48555d.get(i).f48564a;
            this.f48560i.setColor(this.f48555d.get(i).f48565b);
            canvas.drawCircle(pointF.x, pointF.y, (float) this.f48556e, this.f48560i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m72556c(i), m72558d(i2));
    }

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.a$a */
    public class C19879a {

        /* renamed from: a */
        PointF f48564a;

        /* renamed from: b */
        int f48565b;

        C19879a(PointF pointF, int i) {
            this.f48564a = pointF;
            this.f48565b = i;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m72557c();
    }
}
