package com.ss.android.lark.threadtab.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class ReboundView extends RelativeLayout {

    /* renamed from: a */
    private static final int f138357a = UIHelper.dp2px(32.0f);

    /* renamed from: b */
    private View f138358b;

    /* renamed from: c */
    private LinearLayout f138359c;

    /* renamed from: d */
    private int f138360d;

    /* renamed from: e */
    private Path f138361e;

    /* renamed from: f */
    private Paint f138362f;

    /* renamed from: g */
    private int f138363g;

    /* renamed from: h */
    private int f138364h;

    /* renamed from: a */
    public void mo190824a() {
        this.f138360d = 0;
    }

    /* renamed from: a */
    public void mo190825a(int i) {
        int i2 = this.f138360d + i;
        this.f138360d = i2;
        if (i2 < 0) {
            this.f138360d = 0;
        } else {
            int i3 = f138357a;
            if (i2 > i3) {
                this.f138360d = i3;
            }
        }
        this.f138358b.getLayoutParams().width = this.f138360d;
        this.f138358b.getLayoutParams().height = -1;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f138361e.reset();
        float f = (float) ((this.f138363g - this.f138364h) / 2);
        this.f138361e.moveTo((float) this.f138360d, f);
        Path path = this.f138361e;
        int i = this.f138360d;
        path.quadTo((float) (-i), (float) (this.f138363g / 2), (float) i, ((float) this.f138364h) + f);
        canvas.drawPath(this.f138361e, this.f138362f);
    }

    public ReboundView(Context context) {
        super(context);
        this.f138361e = new Path();
        Paint paint = new Paint();
        this.f138362f = paint;
        paint.setAntiAlias(true);
        this.f138362f.setStyle(Paint.Style.FILL);
        this.f138362f.setColor(UIHelper.getColor(R.color.lkui_N200));
        View inflate = View.inflate(context, R.layout.thread_tab_rebound_view, null);
        this.f138358b = inflate;
        this.f138359c = (LinearLayout) inflate.findViewById(R.id.animator_ll);
        addView(this.f138358b);
    }

    public ReboundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReboundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f138363g = getHeight();
        this.f138364h = this.f138359c.getHeight();
    }
}
