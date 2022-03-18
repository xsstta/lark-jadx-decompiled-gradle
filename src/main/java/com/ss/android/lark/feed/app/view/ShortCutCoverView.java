package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class ShortCutCoverView extends View {

    /* renamed from: a */
    Paint f97407a;

    /* renamed from: b */
    Paint f97408b;

    /* renamed from: c */
    int f97409c;

    /* renamed from: d */
    int f97410d;

    /* renamed from: e */
    boolean f97411e;

    /* renamed from: f */
    private final int f97412f;

    /* renamed from: g */
    private final int f97413g;

    /* renamed from: h */
    private final int f97414h;

    /* renamed from: i */
    private final int f97415i;

    /* renamed from: a */
    private void m149315a() {
        Paint paint = new Paint();
        this.f97407a = paint;
        paint.setColor(getContext().getResources().getColor(R.color.lkui_N400));
        Paint paint2 = new Paint();
        this.f97408b = paint2;
        paint2.setColor(getContext().getResources().getColor(R.color.line_divider_default));
        setBackgroundColor(getContext().getResources().getColor(R.color.bg_base));
    }

    public void setShowCircle(boolean z) {
        this.f97411e = z;
    }

    public ShortCutCoverView(Context context) {
        this(context, null);
    }

    public void setCircleValues(int i) {
        int i2 = this.f97413g;
        if (i < i2) {
            this.f97410d = (int) (((((float) i) * 1.0f) / ((float) i2)) * ((float) UIHelper.dp2px(4.0f)));
            return;
        }
        int i3 = this.f97412f;
        if (i < i2 + i3) {
            this.f97410d = this.f97415i;
            this.f97409c = (int) (((((float) (i - i2)) * 1.0f) / ((float) i3)) * ((float) this.f97414h));
            return;
        }
        this.f97410d = this.f97415i;
        this.f97409c = this.f97414h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f97411e) {
            float min = (float) (Math.min(getHeight(), this.f97413g + this.f97412f) / 2);
            canvas.drawCircle((float) (getWidth() / 2), min, (float) this.f97410d, this.f97407a);
            if (((FrameLayout.LayoutParams) getLayoutParams()).height >= this.f97413g) {
                canvas.drawCircle((float) ((getWidth() / 2) - (this.f97409c / 2)), min, (float) ((this.f97410d * 5) / 7), this.f97407a);
                canvas.drawCircle((float) ((getWidth() / 2) + (this.f97409c / 2)), min, (float) ((this.f97410d * 5) / 7), this.f97407a);
            }
        }
    }

    public ShortCutCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortCutCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f97411e = true;
        this.f97412f = UIHelper.dp2px(50.0f);
        this.f97413g = UIHelper.dp2px(30.0f);
        this.f97414h = UIHelper.dp2px(20.0f);
        this.f97415i = UIHelper.dp2px(4.0f);
        m149315a();
    }
}
