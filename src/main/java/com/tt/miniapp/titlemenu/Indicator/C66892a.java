package com.tt.miniapp.titlemenu.Indicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.tt.miniapp.view.p3348a.C67159a;
import com.tt.miniapphost.util.C67590h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.titlemenu.Indicator.a */
public class C66892a extends View implements AbstractC66897b {

    /* renamed from: a */
    public int f168724a;

    /* renamed from: b */
    public int f168725b;

    /* renamed from: c */
    public int f168726c;

    /* renamed from: d */
    public int f168727d;

    /* renamed from: e */
    public List<C66896a> f168728e = new ArrayList();

    /* renamed from: f */
    private int f168729f;

    /* renamed from: g */
    private int f168730g;

    /* renamed from: h */
    private int f168731h;

    /* renamed from: i */
    private Paint f168732i = new Paint(1);

    /* renamed from: j */
    private ValueAnimator f168733j;

    /* renamed from: k */
    private ValueAnimator f168734k;

    @Override // com.tt.miniapp.titlemenu.Indicator.AbstractC66897b
    /* renamed from: a */
    public void mo232888a() {
    }

    @Override // com.tt.miniapp.titlemenu.Indicator.AbstractC66897b
    /* renamed from: a */
    public void mo232890a(int i, float f, int i2) {
    }

    @Override // com.tt.miniapp.titlemenu.Indicator.AbstractC66897b
    /* renamed from: b */
    public void mo232891b() {
    }

    @Override // com.tt.miniapp.titlemenu.Indicator.AbstractC66897b
    /* renamed from: b */
    public void mo232892b(int i) {
    }

    public int getCircleCount() {
        return this.f168731h;
    }

    public int getCurrentIndex() {
        return this.f168726c;
    }

    public int getRadius() {
        return this.f168729f;
    }

    public int getSelectedColor() {
        return this.f168724a;
    }

    public int getSpacing() {
        return this.f168730g;
    }

    public int getUnselectedColor() {
        return this.f168725b;
    }

    /* renamed from: c */
    private void m260893c() {
        this.f168728e.clear();
        if (this.f168731h > 0) {
            int height = (int) ((((float) getHeight()) / 2.0f) + 0.5f);
            int i = this.f168729f;
            int i2 = (i * 2) + this.f168730g;
            int paddingLeft = i + getPaddingLeft();
            for (int i3 = 0; i3 < this.f168731h; i3++) {
                this.f168728e.add(new C66896a(new PointF((float) paddingLeft, (float) height), this.f168725b));
                paddingLeft += i2;
            }
            this.f168728e.get(this.f168726c).f168739b = this.f168724a;
        }
    }

    /* renamed from: d */
    private void m260895d() {
        if (this.f168733j == null) {
            ValueAnimator ofArgb = ValueAnimator.ofArgb(this.f168724a, this.f168725b);
            this.f168733j = ofArgb;
            ofArgb.setInterpolator(new C67159a(0.25f, 0.1f, 0.25f, 0.1f));
            this.f168733j.setDuration(400L);
            this.f168733j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.tt.miniapp.titlemenu.Indicator.C66892a.C668931 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C66892a.this.f168728e.get(C66892a.this.f168727d).f168739b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
            });
        }
        if (this.f168734k == null) {
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(this.f168725b, this.f168724a);
            this.f168734k = ofArgb2;
            ofArgb2.setInterpolator(new C67159a(0.25d, 0.1d, 0.25d, 0.1d));
            this.f168734k.setDuration(400L);
            this.f168734k.addListener(new AnimatorListenerAdapter() {
                /* class com.tt.miniapp.titlemenu.Indicator.C66892a.C668942 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    for (int i = 0; i < C66892a.this.f168728e.size(); i++) {
                        C66892a.this.f168728e.get(i).f168739b = C66892a.this.f168725b;
                    }
                    C66892a.this.f168728e.get(C66892a.this.f168726c).f168739b = C66892a.this.f168724a;
                    C66892a.this.invalidate();
                }
            });
            this.f168734k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.tt.miniapp.titlemenu.Indicator.C66892a.C668953 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C66892a.this.f168728e.get(C66892a.this.f168726c).f168739b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    C66892a.this.invalidate();
                }
            });
        }
        this.f168733j.start();
        this.f168734k.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m260891a(canvas);
    }

    public void setUnselectedColor(int i) {
        this.f168725b = i;
    }

    @Override // com.tt.miniapp.titlemenu.Indicator.AbstractC66897b
    /* renamed from: a */
    public void mo232889a(int i) {
        setCurrentIndex(i);
    }

    public void setSelectedColor(int i) {
        this.f168724a = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f168731h = i;
        m260893c();
        invalidate();
    }

    public void setCurrentIndex(int i) {
        this.f168727d = this.f168726c;
        this.f168726c = i;
        m260895d();
    }

    public void setRadius(int i) {
        this.f168729f = i;
        m260893c();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f168730g = i;
        m260893c();
        invalidate();
    }

    public C66892a(Context context) {
        super(context);
        m260890a(context);
    }

    /* renamed from: a */
    private void m260890a(Context context) {
        this.f168729f = (int) C67590h.m263065a(context, 3.0f);
        this.f168730g = (int) C67590h.m263065a(context, 6.0f);
        this.f168724a = ContextCompat.getColor(context, R.color.microapp_m_menu_circle_navigator_selected_color);
        this.f168725b = ContextCompat.getColor(context, R.color.microapp_m_menu_circle_navigator_unselected_color);
    }

    /* renamed from: c */
    private int m260892c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = this.f168731h;
            return getPaddingRight() + (this.f168729f * i2 * 2) + ((i2 - 1) * this.f168730g) + getPaddingLeft();
        } else if (mode != 1073741824) {
            return 0;
        } else {
            return size;
        }
    }

    /* renamed from: d */
    private int m260894d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (this.f168729f * 2) + getPaddingTop() + getPaddingBottom();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    /* renamed from: a */
    private void m260891a(Canvas canvas) {
        this.f168732i.setStyle(Paint.Style.FILL);
        int size = this.f168728e.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.f168728e.get(i).f168738a;
            this.f168732i.setColor(this.f168728e.get(i).f168739b);
            canvas.drawCircle(pointF.x, pointF.y, (float) this.f168729f, this.f168732i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m260892c(i), m260894d(i2));
    }

    /* renamed from: com.tt.miniapp.titlemenu.Indicator.a$a */
    public class C66896a {

        /* renamed from: a */
        PointF f168738a;

        /* renamed from: b */
        int f168739b;

        C66896a(PointF pointF, int i) {
            this.f168738a = pointF;
            this.f168739b = i;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m260893c();
    }
}
