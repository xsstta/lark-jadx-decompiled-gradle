package com.ss.android.bytedcert.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.bytedance.common.utility.Logger;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.config.AbstractC28346e;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28396a;
import com.ss.android.bytedcert.utils.C28441g;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public volatile float f71519a;

    /* renamed from: b */
    private Context f71520b;

    /* renamed from: c */
    private float f71521c;

    /* renamed from: e */
    private int f71522e;

    /* renamed from: f */
    private int f71523f;

    /* renamed from: g */
    private float f71524g;

    /* renamed from: h */
    private int f71525h;

    /* renamed from: i */
    private final float f71526i;

    /* renamed from: j */
    private int f71527j;

    /* renamed from: k */
    private int f71528k;

    /* renamed from: l */
    private Paint f71529l;

    /* renamed from: m */
    private Paint f71530m;

    /* renamed from: n */
    private Timer f71531n;

    /* renamed from: o */
    private Rect f71532o;

    /* renamed from: p */
    private RectF f71533p;

    /* renamed from: q */
    private int f71534q;

    /* renamed from: a */
    public void mo101238a() {
        Timer timer = this.f71531n;
        if (timer != null) {
            timer.cancel();
            this.f71531n = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.bytedcert.view.CountDownButton$a */
    public static class C28442a extends TimerTask {

        /* renamed from: a */
        private WeakReference<CountDownButton> f71535a;

        public void run() {
            CountDownButton countDownButton;
            WeakReference<CountDownButton> weakReference = this.f71535a;
            if (weakReference != null) {
                countDownButton = weakReference.get();
            } else {
                countDownButton = null;
            }
            if (countDownButton != null) {
                countDownButton.f71519a -= 0.01f;
                countDownButton.postInvalidate();
            }
        }

        C28442a(CountDownButton countDownButton) {
            this.f71535a = new WeakReference<>(countDownButton);
        }
    }

    public CountDownButton(Context context) {
        this(context, null, 0);
    }

    /* renamed from: b */
    public void mo101240b(int i) {
        this.f71519a = (float) i;
        postInvalidate();
    }

    /* renamed from: c */
    public void mo101241c(int i) {
        float f = (float) (i - 1);
        this.f71521c = f;
        this.f71519a = f;
        postInvalidate();
    }

    /* renamed from: a */
    public void mo101239a(int i) {
        if (this.f71534q == i) {
            Logger.m15170e("count down run", "yyy mcurTime:" + this.f71534q + " a:" + i);
            return;
        }
        this.f71534q = i;
        Logger.m15170e("count down run", "xxx mcurTime:" + this.f71534q + " a:" + i);
        this.f71519a = (float) i;
        Timer timer = this.f71531n;
        if (timer != null) {
            timer.cancel();
            this.f71531n = null;
        }
        Timer timer2 = new Timer();
        this.f71531n = timer2;
        timer2.schedule(new C28442a(this), 0, 10);
        postInvalidate();
    }

    /* renamed from: a */
    private void m104241a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.byted_circleBgColr, R.attr.byted_circleEndColor, R.attr.byted_delayTime, R.attr.byted_progressBgColor, R.attr.byted_progressColor, R.attr.byted_progressLineWidth, R.attr.byted_totalTime});
        AbstractC28346e themeConfig = BytedCertManager.getInstance().getThemeConfig();
        this.f71522e = obtainStyledAttributes.getColor(3, themeConfig.mo100955b());
        this.f71523f = obtainStyledAttributes.getColor(4, themeConfig.mo100953a());
        if (themeConfig.mo100956c() > BitmapDescriptorFactory.HUE_RED) {
            this.f71524g = themeConfig.mo100956c();
        } else {
            this.f71524g = C28441g.m104234a(this.f71520b, 4.0f);
        }
        this.f71525h = obtainStyledAttributes.getColor(0, -12303292);
        obtainStyledAttributes.recycle();
        this.f71531n = new Timer();
        this.f71532o = new Rect();
        this.f71533p = new RectF();
        this.f71529l = new Paint();
        Paint paint = new Paint();
        this.f71530m = paint;
        paint.setAntiAlias(true);
        this.f71530m.setAlpha(0);
        this.f71530m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        getDrawingRect(this.f71532o);
        this.f71527j = this.f71532o.centerX();
        this.f71528k = this.f71532o.centerY();
        if (C28396a.m104125a().mo101170b()) {
            this.f71528k = (int) (((double) this.f71532o.centerY()) * 0.74d);
        }
        AbstractC28346e themeConfig = BytedCertManager.getInstance().getThemeConfig();
        this.f71529l.setAntiAlias(true);
        this.f71529l.setColor(themeConfig.mo100958e());
        this.f71529l.setStyle(Paint.Style.STROKE);
        this.f71529l.setStrokeWidth(this.f71524g);
        float b = C28441g.m104239b(getContext());
        this.f71529l.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 23) {
            Path path = new Path();
            path.addCircle((float) this.f71527j, (float) this.f71528k, b, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f71532o, this.f71529l);
        } else {
            canvas.drawRect(this.f71532o, this.f71529l);
            canvas.drawCircle((float) this.f71527j, (float) this.f71528k, b, this.f71530m);
        }
        this.f71529l.setAntiAlias(true);
        this.f71529l.setColor(this.f71522e);
        this.f71529l.setStyle(Paint.Style.STROKE);
        this.f71529l.setStrokeWidth(this.f71524g);
        float a = C28441g.m104234a(this.f71520b, 4.0f);
        if (themeConfig.mo100957d() > BitmapDescriptorFactory.HUE_RED) {
            a = themeConfig.mo100957d();
        }
        float f = b + (this.f71524g / 2.0f) + a;
        int i = this.f71527j;
        int i2 = this.f71528k;
        RectF rectF = new RectF(((float) i) - f, ((float) i2) - f, ((float) i) + f, ((float) i2) + f);
        canvas.drawArc(rectF, -255.0f, 330.0f, false, this.f71529l);
        this.f71529l.setColor(this.f71523f);
        this.f71529l.setStrokeWidth(this.f71524g);
        this.f71529l.setStrokeCap(Paint.Cap.ROUND);
        float f2 = this.f71519a;
        float f3 = this.f71521c;
        if (f2 > f3) {
            this.f71519a = f3;
        }
        if (this.f71519a < BitmapDescriptorFactory.HUE_RED) {
            this.f71519a = BitmapDescriptorFactory.HUE_RED;
        }
        canvas.drawArc(rectF, 75.0f, -((float) (((((double) this.f71519a) / 1.0d) / ((double) this.f71521c)) * 330.0d)), false, this.f71529l);
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredHeight = measuredWidth;
        } else if (measuredWidth < measuredHeight) {
            measuredWidth = measuredHeight;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public CountDownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71521c = 9.0f;
        this.f71524g = 2.0f;
        this.f71525h = -12303292;
        this.f71526i = 0.01f;
        this.f71519a = 9.0f;
        this.f71534q = -1;
        this.f71520b = context;
        m104241a(attributeSet);
    }
}
