package com.ss.android.lark.widget.searchfilter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class SearchFilterView extends View {

    /* renamed from: a */
    private static final int f146582a = UIHelper.getColor(R.color.function_info_100);

    /* renamed from: b */
    private static final int f146583b = UIHelper.getColor(R.color.function_info_100);

    /* renamed from: c */
    private static final int f146584c = UIHelper.getColor(R.color.bg_float_overlay);

    /* renamed from: d */
    private static final int f146585d = UIHelper.getColor(R.color.bg_float_overlay);

    /* renamed from: e */
    private static final int f146586e = UIHelper.getColor(R.color.primary_pri_500);

    /* renamed from: f */
    private static final int f146587f = UIHelper.getColor(R.color.text_title);

    /* renamed from: g */
    private static final Rect f146588g = new Rect(16, 6, 16, 6);

    /* renamed from: A */
    private float f146589A;

    /* renamed from: B */
    private float f146590B;

    /* renamed from: C */
    private float f146591C;

    /* renamed from: D */
    private String f146592D;

    /* renamed from: E */
    private List<Bitmap> f146593E;

    /* renamed from: F */
    private int f146594F = 3;

    /* renamed from: h */
    private boolean f146595h;

    /* renamed from: i */
    private final int f146596i = UIHelper.getColor(R.color.bg_float_overlay);

    /* renamed from: j */
    private final int f146597j = UIHelper.getColor(R.color.bg_float_overlay);

    /* renamed from: k */
    private final int f146598k = UIHelper.getColor(R.color.function_info_100);

    /* renamed from: l */
    private final int f146599l = UIHelper.getColor(R.color.function_info_100);

    /* renamed from: m */
    private Paint f146600m;

    /* renamed from: n */
    private Paint f146601n;

    /* renamed from: o */
    private Paint f146602o;

    /* renamed from: p */
    private Paint f146603p;

    /* renamed from: q */
    private float f146604q;

    /* renamed from: r */
    private float f146605r;

    /* renamed from: s */
    private final int f146606s = UIHelper.getColor(R.color.text_title);

    /* renamed from: t */
    private final int f146607t = UIHelper.getColor(R.color.primary_pri_500);

    /* renamed from: u */
    private Paint f146608u;

    /* renamed from: v */
    private Paint f146609v;

    /* renamed from: w */
    private Paint f146610w;

    /* renamed from: x */
    private Paint f146611x;

    /* renamed from: y */
    private Rect f146612y;

    /* renamed from: z */
    private float f146613z;

    private int getContentHeight() {
        float f;
        int i = this.f146612y.top + 0 + this.f146612y.bottom;
        if (!TextUtils.isEmpty(this.f146592D)) {
            Paint.FontMetrics fontMetrics = this.f146609v.getFontMetrics();
            f = (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (!CollectionUtils.isEmpty(this.f146593E)) {
            f = Math.max(f, this.f146589A + (this.f146591C * 2.0f));
        }
        return (int) (((float) i) + f);
    }

    private int getContentWidth() {
        int i;
        int i2 = this.f146612y.left + 0 + this.f146612y.right;
        if (!TextUtils.isEmpty(this.f146592D)) {
            i2 = (int) (((float) i2) + this.f146609v.measureText(this.f146592D));
        }
        if (CollectionUtils.isEmpty(this.f146593E) || (i = this.f146594F) <= 0) {
            return i2;
        }
        int min = Math.min(i, this.f146593E.size());
        return (int) (((float) ((int) (((float) i2) + this.f146613z))) + (((this.f146589A + (this.f146591C * 2.0f)) * ((float) min)) - (this.f146590B * ((float) (min - 1)))));
    }

    /* renamed from: a */
    private void m229611a() {
        Context context = getContext();
        Rect rect = f146588g;
        this.f146612y = new Rect(m229610a(context, (float) rect.left), m229610a(getContext(), (float) rect.top), m229610a(getContext(), (float) rect.right), m229610a(getContext(), (float) rect.bottom));
        this.f146613z = (float) m229610a(getContext(), 2.0f);
        this.f146589A = (float) m229610a(getContext(), 16.0f);
        this.f146590B = (float) m229610a(getContext(), 6.0f);
        this.f146591C = (float) m229610a(getContext(), 1.0f);
        this.f146604q = (float) m229610a(getContext(), 6.0f);
        this.f146600m = new Paint();
        this.f146601n = new Paint();
        this.f146602o = new Paint();
        this.f146603p = new Paint();
        this.f146600m.setAntiAlias(true);
        this.f146600m.setStyle(Paint.Style.FILL);
        this.f146600m.setColor(this.f146596i);
        this.f146601n.setAntiAlias(true);
        this.f146601n.setStyle(Paint.Style.STROKE);
        this.f146601n.setStrokeWidth(this.f146591C);
        this.f146601n.setColor(this.f146597j);
        this.f146602o.setAntiAlias(true);
        this.f146602o.setStyle(Paint.Style.FILL);
        this.f146602o.setColor(this.f146598k);
        this.f146603p.setAntiAlias(true);
        this.f146603p.setStyle(Paint.Style.STROKE);
        this.f146603p.setStrokeWidth(this.f146591C);
        this.f146603p.setColor(this.f146599l);
        this.f146608u = new Paint();
        this.f146609v = new Paint();
        this.f146605r = m229613b(getContext(), 14.0f);
        this.f146608u.setAntiAlias(true);
        this.f146608u.setTextSize(this.f146605r);
        this.f146609v.setAntiAlias(true);
        this.f146609v.setTextSize(this.f146605r);
        this.f146608u.setColor(this.f146606s);
        this.f146609v.setColor(this.f146607t);
        this.f146610w = new Paint();
        this.f146611x = new Paint();
        this.f146610w.setColor(this.f146599l);
        this.f146610w.setAntiAlias(true);
        this.f146610w.setStyle(Paint.Style.STROKE);
        this.f146610w.setStrokeWidth(this.f146591C);
        this.f146611x.setAntiAlias(true);
    }

    public void setPaddingRect(Rect rect) {
        this.f146612y = rect;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m229612a(canvas);
        m229614b(canvas);
        m229615c(canvas);
    }

    public void setDisplayIconLimit(int i) {
        this.f146594F = Math.max(0, i);
        requestLayout();
    }

    public void setUnSelectedText(String str) {
        this.f146595h = false;
        this.f146592D = str;
        this.f146593E = null;
        requestLayout();
    }

    public SearchFilterView(Context context) {
        super(context);
        m229611a();
    }

    /* renamed from: a */
    private void m229612a(Canvas canvas) {
        Paint paint;
        Paint paint2;
        if (this.f146595h) {
            paint2 = this.f146603p;
            paint = this.f146602o;
        } else {
            paint2 = this.f146601n;
            paint = this.f146600m;
        }
        float f = this.f146591C;
        RectF rectF = new RectF(f, f, ((float) canvas.getWidth()) - this.f146591C, ((float) canvas.getHeight()) - this.f146591C);
        float f2 = this.f146604q;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float f3 = this.f146604q;
        canvas.drawRoundRect(rectF, f3, f3, paint2);
    }

    /* renamed from: b */
    private void m229614b(Canvas canvas) {
        Paint paint;
        if (!TextUtils.isEmpty(this.f146592D)) {
            if (this.f146595h) {
                paint = this.f146609v;
            } else {
                paint = this.f146608u;
            }
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(this.f146592D, (float) this.f146612y.left, (((float) (canvas.getHeight() / 2)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom, paint);
        }
    }

    /* renamed from: c */
    private void m229615c(Canvas canvas) {
        float f;
        float f2;
        if (!CollectionUtils.isEmpty(this.f146593E)) {
            float width = (((float) (canvas.getWidth() - this.f146612y.right)) - this.f146589A) - (this.f146591C * 2.0f);
            float height = ((float) (canvas.getHeight() / 2)) - ((this.f146589A + this.f146591C) / 2.0f);
            for (int min = Math.min(this.f146593E.size(), 3) - 1; min >= 0; min--) {
                int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
                Bitmap bitmap = this.f146593E.get(min);
                if (bitmap == null) {
                    f2 = this.f146589A + (this.f146591C * 2.0f);
                    f = this.f146590B;
                } else {
                    float f3 = this.f146589A + (this.f146591C * 2.0f);
                    RectF rectF = new RectF(width, height, width + f3, f3 + height);
                    this.f146611x.setXfermode(null);
                    canvas.drawOval(rectF, this.f146611x);
                    this.f146611x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f146611x);
                    this.f146611x.setXfermode(null);
                    canvas.restoreToCount(saveLayer);
                    canvas.drawOval(rectF, this.f146610w);
                    f2 = this.f146589A + (this.f146591C * 2.0f);
                    f = this.f146590B;
                }
                width -= f2 - f;
            }
        }
    }

    /* renamed from: a */
    private int m229610a(Context context, float f) {
        return UIUtils.dp2px(context, f);
    }

    /* renamed from: b */
    private float m229613b(Context context, float f) {
        return UIUtils.sp2px(context, f);
    }

    /* renamed from: a */
    public void mo200827a(String str, List<Bitmap> list) {
        this.f146595h = true;
        this.f146592D = str;
        this.f146593E = list;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(m229609a(mode, size, contentWidth), m229609a(View.MeasureSpec.getMode(i2), size2, contentHeight));
    }

    public SearchFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229611a();
    }

    /* renamed from: a */
    private int m229609a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    public SearchFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229611a();
    }
}
