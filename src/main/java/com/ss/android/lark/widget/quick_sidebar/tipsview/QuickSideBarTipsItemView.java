package com.ss.android.lark.widget.quick_sidebar.tipsview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class QuickSideBarTipsItemView extends View {

    /* renamed from: a */
    private int f146063a;

    /* renamed from: b */
    private Path f146064b;

    /* renamed from: c */
    private RectF f146065c;

    /* renamed from: d */
    private Paint f146066d;

    /* renamed from: e */
    private String f146067e;

    /* renamed from: f */
    private Paint f146068f;

    /* renamed from: g */
    private int f146069g;

    /* renamed from: h */
    private int f146070h;

    /* renamed from: i */
    private float f146071i;

    /* renamed from: j */
    private int f146072j;

    /* renamed from: k */
    private int f146073k;

    /* renamed from: l */
    private int f146074l;

    /* renamed from: m */
    private int f146075m;

    /* renamed from: a */
    public boolean mo200032a() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public QuickSideBarTipsItemView(Context context) {
        this(context, null);
    }

    public void setText(String str) {
        this.f146067e = str;
        Rect rect = new Rect();
        Paint paint = this.f146068f;
        String str2 = this.f146067e;
        paint.getTextBounds(str2, 0, str2.length(), rect);
        this.f146074l = (int) (((double) (this.f146069g - rect.width())) * 0.5d);
        this.f146075m = this.f146070h - rect.height();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f146067e)) {
            canvas.drawColor(getResources().getColor(17170445));
            this.f146065c.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f146069g, (float) this.f146070h);
            if (mo200032a()) {
                int i = this.f146063a;
                fArr = new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, 0.0f, 0.0f};
            } else {
                int i2 = this.f146063a;
                fArr = new float[]{(float) i2, (float) i2, (float) i2, (float) i2, 0.0f, 0.0f, (float) i2, (float) i2};
            }
            this.f146064b.addRoundRect(this.f146065c, fArr, Path.Direction.CW);
            canvas.drawPath(this.f146064b, this.f146066d);
            canvas.drawText(this.f146067e, (float) this.f146074l, (float) this.f146075m, this.f146068f);
        }
    }

    public QuickSideBarTipsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        this.f146069g = measuredWidth;
        this.f146070h = measuredWidth;
        this.f146063a = (int) (((double) measuredWidth) * 0.5d);
    }

    /* renamed from: a */
    private void m228849a(Context context, AttributeSet attributeSet) {
        this.f146072j = context.getResources().getColor(17170444);
        this.f146073k = context.getResources().getColor(17170432);
        this.f146071i = context.getResources().getDimension(R.dimen.textSize_quicksidebartips);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sidebarBackgroundColor, R.attr.sidebarItemHeight, R.attr.sidebarTextColor, R.attr.sidebarTextColorChoose, R.attr.sidebarTextSize, R.attr.sidebarTextSizeChoose});
            this.f146072j = obtainStyledAttributes.getColor(2, this.f146072j);
            this.f146073k = obtainStyledAttributes.getColor(0, this.f146073k);
            this.f146071i = obtainStyledAttributes.getDimension(4, this.f146071i);
            obtainStyledAttributes.recycle();
        }
        this.f146066d = new Paint(1);
        this.f146068f = new Paint(1);
        this.f146066d.setColor(this.f146073k);
        this.f146068f.setColor(this.f146072j);
        this.f146068f.setTextSize(this.f146071i);
    }

    public QuickSideBarTipsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146064b = new Path();
        this.f146065c = new RectF();
        this.f146067e = "";
        m228849a(context, attributeSet);
    }
}
