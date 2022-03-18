package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

public class HeaderPanelBackground extends View {

    /* renamed from: a */
    private int f79738a;

    /* renamed from: b */
    private int f79739b;

    /* renamed from: c */
    private int f79740c;

    /* renamed from: d */
    private int f79741d;

    /* renamed from: e */
    private int[] f79742e;

    /* renamed from: f */
    private Paint f79743f;

    /* renamed from: g */
    private Drawable f79744g;

    /* renamed from: a */
    private void m118396a() {
        Paint paint = new Paint();
        this.f79743f = paint;
        paint.setAntiAlias(true);
        this.f79743f.setStyle(Paint.Style.FILL);
    }

    public void setRectColor(int[] iArr) {
        if (iArr != this.f79742e) {
            this.f79742e = iArr;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) this.f79738a;
        float f2 = (float) this.f79739b;
        int[] iArr = this.f79742e;
        this.f79743f.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f, f2, iArr[0], iArr[1], Shader.TileMode.MIRROR));
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f79738a, (float) this.f79739b, this.f79743f);
        if (this.f79742e != null) {
            m118398a(canvas);
        }
    }

    /* renamed from: a */
    private void m118398a(Canvas canvas) {
        int i;
        int width = (int) ((((float) this.f79741d) / (((float) this.f79740c) * 1.0f)) * ((float) getWidth()));
        if (getHeight() > width) {
            i = getHeight() - width;
        } else {
            i = 0;
        }
        if (getHeight() <= width) {
            width = getHeight();
        }
        this.f79744g.setBounds(0, i, Math.min(getWidth(), this.f79740c), width + i);
        this.f79744g.draw(canvas);
        this.f79744g.mutate();
        this.f79744g.setTint(C32634ae.m125178a(R.color.cal_detail_header_mask));
        this.f79744g.setTintMode(PorterDuff.Mode.OVERLAY);
    }

    public HeaderPanelBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m118397a(Context context, AttributeSet attributeSet) {
        this.f79744g = UIUtils.getDrawable(context, R.drawable.icon_event_summary_bg);
        m118396a();
        this.f79740c = UIUtils.dp2px(getContext(), 1125.0f);
        this.f79741d = UIUtils.dp2px(getContext(), 480.0f);
    }

    public HeaderPanelBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79742e = CalendarSkinColorTool.m124927b(6);
        m118397a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f79738a = i;
        this.f79739b = i2;
        this.f79740c = i;
        this.f79741d = i2;
    }
}
