package com.ss.android.lark.passport.infra.widget.quick_sidebar.tipsview;

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
    private int f123699a;

    /* renamed from: b */
    private final Path f123700b;

    /* renamed from: c */
    private final RectF f123701c;

    /* renamed from: d */
    private Paint f123702d;

    /* renamed from: e */
    private String f123703e;

    /* renamed from: f */
    private Paint f123704f;

    /* renamed from: g */
    private int f123705g;

    /* renamed from: h */
    private int f123706h;

    /* renamed from: i */
    private float f123707i;

    /* renamed from: j */
    private int f123708j;

    /* renamed from: k */
    private int f123709k;

    /* renamed from: l */
    private int f123710l;

    /* renamed from: m */
    private int f123711m;

    /* renamed from: a */
    public boolean mo171856a() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public QuickSideBarTipsItemView(Context context) {
        this(context, null);
    }

    public void setText(String str) {
        this.f123703e = str;
        Rect rect = new Rect();
        Paint paint = this.f123704f;
        String str2 = this.f123703e;
        paint.getTextBounds(str2, 0, str2.length(), rect);
        this.f123710l = (int) (((double) (this.f123705g - rect.width())) * 0.5d);
        this.f123711m = this.f123706h - rect.height();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f123703e)) {
            canvas.drawColor(getResources().getColor(17170445));
            this.f123701c.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f123705g, (float) this.f123706h);
            if (mo171856a()) {
                int i = this.f123699a;
                fArr = new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, 0.0f, 0.0f};
            } else {
                int i2 = this.f123699a;
                fArr = new float[]{(float) i2, (float) i2, (float) i2, (float) i2, 0.0f, 0.0f, (float) i2, (float) i2};
            }
            this.f123700b.addRoundRect(this.f123701c, fArr, Path.Direction.CW);
            canvas.drawPath(this.f123700b, this.f123702d);
            canvas.drawText(this.f123703e, (float) this.f123710l, (float) this.f123711m, this.f123704f);
        }
    }

    public QuickSideBarTipsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        this.f123705g = measuredWidth;
        this.f123706h = measuredWidth;
        this.f123699a = (int) (((double) measuredWidth) * 0.5d);
    }

    /* renamed from: a */
    private void m194170a(Context context, AttributeSet attributeSet) {
        this.f123708j = context.getResources().getColor(17170444);
        this.f123709k = context.getResources().getColor(17170432);
        this.f123707i = context.getResources().getDimension(R.dimen.signin_sdk_textSize_quicksidebartips);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sidebarBackgroundColor, R.attr.sidebarItemHeight, R.attr.sidebarTextColor, R.attr.sidebarTextColorChoose, R.attr.sidebarTextSize, R.attr.sidebarTextSizeChoose});
            this.f123708j = obtainStyledAttributes.getColor(2, this.f123708j);
            this.f123709k = obtainStyledAttributes.getColor(0, this.f123709k);
            this.f123707i = obtainStyledAttributes.getDimension(4, this.f123707i);
            obtainStyledAttributes.recycle();
        }
        this.f123702d = new Paint(1);
        this.f123704f = new Paint(1);
        this.f123702d.setColor(this.f123709k);
        this.f123704f.setColor(this.f123708j);
        this.f123704f.setTextSize(this.f123707i);
    }

    public QuickSideBarTipsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123700b = new Path();
        this.f123701c = new RectF();
        this.f123703e = "";
        m194170a(context, attributeSet);
    }
}
