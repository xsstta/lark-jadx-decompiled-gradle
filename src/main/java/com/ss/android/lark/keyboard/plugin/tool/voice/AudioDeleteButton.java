package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class AudioDeleteButton extends View {

    /* renamed from: a */
    private Paint f104400a;

    /* renamed from: b */
    private float f104401b;

    /* renamed from: c */
    private Drawable f104402c;

    /* renamed from: d */
    private int f104403d;

    /* renamed from: e */
    private int f104404e;

    /* renamed from: f */
    private int f104405f;

    /* renamed from: g */
    private int f104406g;

    public float getScale() {
        return this.f104401b;
    }

    public AudioDeleteButton(Context context) {
        this(context, null);
    }

    public void setScale(float f) {
        this.f104401b = f;
        invalidate();
    }

    public void setColor(int i) {
        this.f104400a.setColor(i);
        this.f104400a.setAlpha(204);
        invalidate();
    }

    public void setRectWidth(int i) {
        this.f104405f = Math.min(this.f104406g, Math.max(this.f104404e, i));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = this.f104405f;
        float f = (float) (measuredWidth - (i / 2));
        int i2 = this.f104404e;
        int i3 = this.f104403d;
        canvas.drawRoundRect(f, (float) (measuredHeight - (i2 / 2)), (float) ((i / 2) + measuredWidth), (float) ((i2 / 2) + measuredHeight), (float) i3, (float) i3, this.f104400a);
        int intrinsicWidth = ((int) (((float) this.f104402c.getIntrinsicWidth()) * this.f104401b)) / 2;
        int intrinsicHeight = ((int) (((float) this.f104402c.getIntrinsicHeight()) * this.f104401b)) / 2;
        this.f104402c.setBounds(measuredWidth - intrinsicWidth, measuredHeight - intrinsicHeight, measuredWidth + intrinsicWidth, measuredHeight + intrinsicHeight);
        this.f104402c.draw(canvas);
    }

    public AudioDeleteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f104406g, this.f104404e);
    }

    public AudioDeleteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104400a = new Paint(1);
        this.f104401b = 1.0f;
        int dp2px = UIHelper.dp2px(25.0f);
        this.f104403d = dp2px;
        int i2 = dp2px * 2;
        this.f104404e = i2;
        this.f104405f = i2;
        this.f104406g = (int) (((double) i2) * 3.8d);
        this.f104400a.setColor(context.getResources().getColor(R.color.audio_input_delete_bg));
        this.f104400a.setAlpha(204);
        Drawable drawable = UIUtils.getDrawable(getContext(), R.drawable.ud_icon_delete_trash_outlined);
        this.f104402c = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.audio_input_delete_button), PorterDuff.Mode.SRC_ATOP));
    }
}
