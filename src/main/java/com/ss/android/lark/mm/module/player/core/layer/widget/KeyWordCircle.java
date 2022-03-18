package com.ss.android.lark.mm.module.player.core.layer.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.search.model.FindTimeline;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;

public class KeyWordCircle extends View {

    /* renamed from: e */
    private static final int f117421e = C57582a.m223600a(2);

    /* renamed from: a */
    private Paint f117422a;

    /* renamed from: b */
    private Paint f117423b;

    /* renamed from: c */
    private Paint f117424c;

    /* renamed from: d */
    private float f117425d;

    /* renamed from: f */
    private List<Integer> f117426f;

    /* renamed from: g */
    private int f117427g;

    /* renamed from: h */
    private Long f117428h;

    /* renamed from: a */
    public void mo163938a() {
        this.f117426f.clear();
    }

    /* renamed from: b */
    private void m184657b() {
        Paint paint = new Paint();
        this.f117422a = paint;
        paint.setColor(UDColorUtils.getColor(getContext(), R.color.mm_ud_seekbar_keyword));
        this.f117422a.setStyle(Paint.Style.FILL);
        this.f117422a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f117423b = paint2;
        paint2.setColor(UDColorUtils.getColor(getContext(), R.color.mm_ud_seekbar_keyword_higlight));
        this.f117423b.setStyle(Paint.Style.FILL);
        this.f117423b.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f117424c = paint3;
        paint3.setColor(UDColorUtils.getColor(getContext(), R.color.bg_float_overlay));
        this.f117424c.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        this.f117424c.setStyle(Paint.Style.STROKE);
        this.f117424c.setAntiAlias(true);
    }

    public void setCirclePos(FindResponse findResponse) {
        m184656a(findResponse);
    }

    public void setHighLightIndex(int i) {
        this.f117427g = i;
    }

    public void setWholeWidth(Long l) {
        this.f117428h = l;
    }

    public KeyWordCircle(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m184656a(FindResponse findResponse) {
        post(new Runnable(findResponse) {
            /* class com.ss.android.lark.mm.module.player.core.layer.widget.$$Lambda$KeyWordCircle$xDWXzxfbCJYEC4MuLhfLlygpnZs */
            public final /* synthetic */ FindResponse f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                KeyWordCircle.lambda$xDWXzxfbCJYEC4MuLhfLlygpnZs(KeyWordCircle.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m184658b(FindResponse findResponse) {
        if (findResponse == null || CollectionUtils.isEmpty(findResponse.getTimeline())) {
            this.f117426f.clear();
        } else {
            for (FindTimeline findTimeline : findResponse.getTimeline()) {
                if (findTimeline.getStartTime() != null) {
                    this.f117426f.add(Integer.valueOf((int) (((float) Math.round((findTimeline.getStartTime().floatValue() / this.f117428h.floatValue()) * (((float) getWidth()) - (this.f117425d * 2.0f)))) + this.f117425d)));
                }
            }
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f117426f.size() != 0) {
            for (int i = 0; i < this.f117426f.size(); i++) {
                if (i != this.f117427g) {
                    canvas.drawCircle((float) this.f117426f.get(i).intValue(), ((float) getHeight()) / 2.0f, this.f117425d, this.f117422a);
                    canvas.drawCircle((float) this.f117426f.get(i).intValue(), ((float) getHeight()) / 2.0f, this.f117425d, this.f117424c);
                }
            }
            if (this.f117427g < this.f117426f.size()) {
                canvas.drawCircle((float) this.f117426f.get(this.f117427g).intValue(), ((float) getHeight()) / 2.0f, this.f117425d, this.f117423b);
                canvas.drawCircle((float) this.f117426f.get(this.f117427g).intValue(), ((float) getHeight()) / 2.0f, this.f117425d, this.f117424c);
            }
        }
    }

    public KeyWordCircle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyWordCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = f117421e;
        this.f117425d = (float) i2;
        this.f117426f = new ArrayList();
        this.f117427g = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.circle_color, R.attr.radius});
            this.f117425d = (float) obtainStyledAttributes.getDimensionPixelSize(1, i2);
            obtainStyledAttributes.recycle();
        }
        m184657b();
    }
}
