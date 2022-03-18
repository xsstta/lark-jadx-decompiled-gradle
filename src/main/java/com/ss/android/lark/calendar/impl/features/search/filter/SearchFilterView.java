package com.ss.android.lark.calendar.impl.features.search.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import net.lucode.hackware.magicindicator.buildins.C69618b;

public class SearchFilterView extends View {

    /* renamed from: g */
    private static final Rect f82851g = new Rect(10, 6, 10, 6);

    /* renamed from: A */
    private float f82852A;

    /* renamed from: B */
    private float f82853B;

    /* renamed from: C */
    private float f82854C;

    /* renamed from: D */
    private float f82855D;

    /* renamed from: E */
    private float f82856E;

    /* renamed from: F */
    private Drawable f82857F;

    /* renamed from: G */
    private String f82858G;

    /* renamed from: H */
    private List<Bitmap> f82859H;

    /* renamed from: I */
    private int f82860I;

    /* renamed from: a */
    private final int f82861a;

    /* renamed from: b */
    private final int f82862b;

    /* renamed from: c */
    private final int f82863c;

    /* renamed from: d */
    private final int f82864d;

    /* renamed from: e */
    private final int f82865e;

    /* renamed from: f */
    private final int f82866f;

    /* renamed from: h */
    private boolean f82867h = false;

    /* renamed from: i */
    private int f82868i;

    /* renamed from: j */
    private int f82869j;

    /* renamed from: k */
    private int f82870k;

    /* renamed from: l */
    private int f82871l;

    /* renamed from: m */
    private Paint f82872m;

    /* renamed from: n */
    private Paint f82873n;

    /* renamed from: o */
    private Paint f82874o;

    /* renamed from: p */
    private Paint f82875p;

    /* renamed from: q */
    private float f82876q;

    /* renamed from: r */
    private float f82877r;

    /* renamed from: s */
    private int f82878s;

    /* renamed from: t */
    private int f82879t;

    /* renamed from: u */
    private TextPaint f82880u;

    /* renamed from: v */
    private TextPaint f82881v;

    /* renamed from: w */
    private Paint f82882w;

    /* renamed from: x */
    private Paint f82883x;

    /* renamed from: y */
    private Rect f82884y;

    /* renamed from: z */
    private float f82885z;

    private int getContentHeight() {
        float f;
        int i = this.f82884y.top + 0 + this.f82884y.bottom;
        if (!TextUtils.isEmpty(this.f82858G)) {
            Paint.FontMetrics fontMetrics = this.f82881v.getFontMetrics();
            f = (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (!CollectionUtils.isEmpty(this.f82859H)) {
            f = Math.max(f, this.f82854C + (this.f82856E * 2.0f));
        }
        return (int) (((float) i) + f);
    }

    private int getContentWidth() {
        int i;
        int i2 = this.f82884y.left + 0 + this.f82884y.right;
        if (this.f82857F != null) {
            i2 = (int) (((float) i2) + this.f82885z);
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!TextUtils.isEmpty(this.f82858G)) {
            f = this.f82881v.measureText(this.f82858G);
            if (this.f82857F != null) {
                f += this.f82852A;
            }
        }
        float f2 = (float) i2;
        if (f2 + f > ((float) (C69618b.m267417a(getContext()) / 2))) {
            String charSequence = TextUtils.ellipsize(this.f82858G, this.f82881v, (((float) C69618b.m267417a(getContext())) / 2.0f) - f2, TextUtils.TruncateAt.END).toString();
            this.f82858G = charSequence;
            f = this.f82881v.measureText(charSequence);
        }
        int i3 = (int) (f2 + f);
        if (CollectionUtils.isEmpty(this.f82859H) || (i = this.f82860I) <= 0) {
            return i3;
        }
        int min = Math.min(i, this.f82859H.size());
        return (int) (((float) ((int) (((float) i3) + this.f82853B))) + (((this.f82854C + (this.f82856E * 2.0f)) * ((float) min)) - (this.f82855D * ((float) (min - 1)))));
    }

    /* renamed from: a */
    private void m123482a() {
        Context context = getContext();
        Rect rect = f82851g;
        this.f82884y = new Rect(m123481a(context, (float) rect.left), m123481a(getContext(), (float) rect.top), m123481a(getContext(), (float) rect.right), m123481a(getContext(), (float) rect.bottom));
        this.f82852A = (float) m123481a(getContext(), 8.0f);
        this.f82885z = (float) m123481a(getContext(), 16.0f);
        this.f82853B = (float) m123481a(getContext(), 2.0f);
        this.f82854C = (float) m123481a(getContext(), 16.0f);
        this.f82855D = (float) m123481a(getContext(), 6.0f);
        this.f82856E = (float) m123481a(getContext(), BitmapDescriptorFactory.HUE_RED);
        this.f82876q = (float) m123481a(getContext(), 6.0f);
        this.f82872m = new Paint();
        this.f82873n = new Paint();
        this.f82874o = new Paint();
        this.f82875p = new Paint();
        this.f82872m.setAntiAlias(true);
        this.f82872m.setStyle(Paint.Style.FILL);
        this.f82872m.setColor(this.f82868i);
        this.f82873n.setAntiAlias(true);
        this.f82873n.setStyle(Paint.Style.STROKE);
        this.f82873n.setStrokeWidth(this.f82856E);
        this.f82873n.setColor(this.f82869j);
        this.f82874o.setAntiAlias(true);
        this.f82874o.setStyle(Paint.Style.FILL);
        this.f82874o.setColor(this.f82870k);
        this.f82875p.setAntiAlias(true);
        this.f82875p.setStyle(Paint.Style.STROKE);
        this.f82875p.setStrokeWidth(this.f82856E);
        this.f82875p.setColor(this.f82871l);
        this.f82880u = new TextPaint();
        this.f82881v = new TextPaint();
        this.f82877r = m123484b(getContext(), 14.0f);
        this.f82880u.setAntiAlias(true);
        this.f82880u.setTextSize(this.f82877r);
        this.f82881v.setAntiAlias(true);
        this.f82881v.setTextSize(this.f82877r);
        this.f82880u.setColor(this.f82878s);
        this.f82881v.setColor(this.f82879t);
        this.f82882w = new Paint();
        this.f82883x = new Paint();
        this.f82882w.setColor(this.f82871l);
        this.f82882w.setAntiAlias(true);
        this.f82882w.setStyle(Paint.Style.STROKE);
        this.f82882w.setStrokeWidth(this.f82856E);
        this.f82883x.setAntiAlias(true);
    }

    public void setPaddingRect(Rect rect) {
        this.f82884y = rect;
    }

    public void setLogoIcon(Drawable drawable) {
        this.f82857F = drawable;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m123483a(canvas);
        m123485b(canvas);
        m123486c(canvas);
        m123487d(canvas);
    }

    public void setDisplayIconLimit(int i) {
        this.f82860I = Math.max(0, i);
        requestLayout();
    }

    public void setUnSelectedText(String str) {
        this.f82867h = false;
        this.f82858G = str;
        this.f82859H = null;
        requestLayout();
    }

    /* renamed from: a */
    private void m123483a(Canvas canvas) {
        Paint paint;
        Paint paint2;
        if (this.f82867h) {
            paint2 = this.f82875p;
            paint = this.f82874o;
        } else {
            paint2 = this.f82873n;
            paint = this.f82872m;
        }
        float f = this.f82856E;
        RectF rectF = new RectF(f, f, ((float) canvas.getWidth()) - this.f82856E, ((float) canvas.getHeight()) - this.f82856E);
        float f2 = this.f82876q;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float f3 = this.f82876q;
        canvas.drawRoundRect(rectF, f3, f3, paint2);
    }

    public SearchFilterView(Context context) {
        super(context);
        int color = UIHelper.getColor(R.color.primary_pri_500);
        this.f82861a = color;
        int color2 = UIHelper.getColor(R.color.primary_pri_500);
        this.f82862b = color2;
        int color3 = UIHelper.getColor(R.color.ud_N200);
        this.f82863c = color3;
        int color4 = UIHelper.getColor(R.color.ud_N200);
        this.f82864d = color4;
        int color5 = UIHelper.getColor(R.color.white);
        this.f82865e = color5;
        int color6 = UIHelper.getColor(R.color.ud_N600);
        this.f82866f = color6;
        this.f82868i = color3;
        this.f82869j = color4;
        this.f82870k = color;
        this.f82871l = color2;
        this.f82878s = color6;
        this.f82879t = color5;
        this.f82860I = 3;
        m123482a();
    }

    /* renamed from: b */
    private void m123485b(Canvas canvas) {
        if (this.f82857F != null) {
            float f = ((float) this.f82884y.left) + (this.f82856E * 2.0f);
            float height = ((float) (canvas.getHeight() / 2)) - ((this.f82885z + this.f82856E) / 2.0f);
            int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
            float f2 = this.f82885z + (this.f82856E * 2.0f);
            this.f82857F.setBounds(new Rect((int) f, (int) height, (int) (f + f2), (int) (height + f2)));
            this.f82857F.draw(canvas);
            canvas.restoreToCount(saveLayer);
        }
    }

    /* renamed from: c */
    private void m123486c(Canvas canvas) {
        TextPaint textPaint;
        float f;
        if (!TextUtils.isEmpty(this.f82858G)) {
            if (this.f82867h) {
                textPaint = this.f82881v;
            } else {
                textPaint = this.f82880u;
            }
            if (this.f82857F != null) {
                f = ((float) this.f82884y.left) + this.f82885z + this.f82852A;
            } else {
                f = (float) this.f82884y.left;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(this.f82858G, f, (((float) (canvas.getHeight() / 2)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom, textPaint);
        }
    }

    /* renamed from: d */
    private void m123487d(Canvas canvas) {
        float f;
        float f2;
        if (!CollectionUtils.isEmpty(this.f82859H)) {
            float width = (((float) (canvas.getWidth() - this.f82884y.right)) - this.f82854C) - (this.f82856E * 2.0f);
            float height = ((float) (canvas.getHeight() / 2)) - ((this.f82854C + this.f82856E) / 2.0f);
            for (int min = Math.min(this.f82859H.size(), 3) - 1; min >= 0; min--) {
                int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
                Bitmap bitmap = this.f82859H.get(min);
                if (bitmap == null) {
                    f2 = this.f82854C + (this.f82856E * 2.0f);
                    f = this.f82855D;
                } else {
                    float f3 = this.f82854C + (this.f82856E * 2.0f);
                    RectF rectF = new RectF(width, height, width + f3, f3 + height);
                    this.f82883x.setXfermode(null);
                    canvas.drawOval(rectF, this.f82883x);
                    this.f82883x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f82883x);
                    this.f82883x.setXfermode(null);
                    canvas.restoreToCount(saveLayer);
                    canvas.drawOval(rectF, this.f82882w);
                    f2 = this.f82854C + (this.f82856E * 2.0f);
                    f = this.f82855D;
                }
                width -= f2 - f;
            }
        }
    }

    /* renamed from: a */
    private int m123481a(Context context, float f) {
        return UIUtils.dp2px(context, f);
    }

    /* renamed from: b */
    private float m123484b(Context context, float f) {
        return UIUtils.sp2px(context, f);
    }

    /* renamed from: a */
    public void mo118189a(String str, List<Bitmap> list) {
        this.f82867h = true;
        this.f82858G = str;
        this.f82859H = list;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(m123480a(mode, size, contentWidth), m123480a(View.MeasureSpec.getMode(i2), size2, contentHeight));
    }

    public SearchFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = UIHelper.getColor(R.color.primary_pri_500);
        this.f82861a = color;
        int color2 = UIHelper.getColor(R.color.primary_pri_500);
        this.f82862b = color2;
        int color3 = UIHelper.getColor(R.color.ud_N200);
        this.f82863c = color3;
        int color4 = UIHelper.getColor(R.color.ud_N200);
        this.f82864d = color4;
        int color5 = UIHelper.getColor(R.color.white);
        this.f82865e = color5;
        int color6 = UIHelper.getColor(R.color.ud_N600);
        this.f82866f = color6;
        this.f82868i = color3;
        this.f82869j = color4;
        this.f82870k = color;
        this.f82871l = color2;
        this.f82878s = color6;
        this.f82879t = color5;
        this.f82860I = 3;
        m123482a();
    }

    /* renamed from: a */
    private int m123480a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    public SearchFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color = UIHelper.getColor(R.color.primary_pri_500);
        this.f82861a = color;
        int color2 = UIHelper.getColor(R.color.primary_pri_500);
        this.f82862b = color2;
        int color3 = UIHelper.getColor(R.color.ud_N200);
        this.f82863c = color3;
        int color4 = UIHelper.getColor(R.color.ud_N200);
        this.f82864d = color4;
        int color5 = UIHelper.getColor(R.color.white);
        this.f82865e = color5;
        int color6 = UIHelper.getColor(R.color.ud_N600);
        this.f82866f = color6;
        this.f82868i = color3;
        this.f82869j = color4;
        this.f82870k = color;
        this.f82871l = color2;
        this.f82878s = color6;
        this.f82879t = color5;
        this.f82860I = 3;
        m123482a();
    }
}
