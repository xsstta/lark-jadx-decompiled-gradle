package com.ss.android.lark.keyboard.plugin.tool.voice.legacy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.Deque;
import java.util.LinkedList;

public class LarkVoiceLineView extends View {

    /* renamed from: b */
    private static final int f104568b = UIHelper.dp2px(2.0f);

    /* renamed from: c */
    private static final int f104569c = UIHelper.dp2px(25.0f);

    /* renamed from: d */
    private static final int f104570d = UIHelper.dp2px(2.0f);

    /* renamed from: e */
    private static final int f104571e = UIHelper.dp2px(2.0f);

    /* renamed from: f */
    private static final int f104572f = UIHelper.dp2px(50.0f);

    /* renamed from: a */
    Runnable f104573a;

    /* renamed from: g */
    private float f104574g;

    /* renamed from: h */
    private float f104575h;

    /* renamed from: i */
    private int f104576i;

    /* renamed from: j */
    private int f104577j;

    /* renamed from: k */
    private Paint f104578k;

    /* renamed from: l */
    private int f104579l;

    /* renamed from: m */
    private Deque<Float> f104580m;

    /* renamed from: n */
    private Context f104581n;

    /* renamed from: c */
    public void mo148022c() {
        removeCallbacks(this.f104573a);
    }

    /* renamed from: b */
    public void mo148021b() {
        this.f104575h = (float) f104568b;
        postDelayed(this.f104573a, 50);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148019a() {
        Paint paint = new Paint();
        this.f104578k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f104578k.setAntiAlias(true);
        this.f104578k.setColor(C57582a.m223616d(getContext(), R.color.function_info_400));
    }

    public LarkVoiceLineView(Context context) {
        this(context, null);
    }

    public void setVolume(double d) {
        Log.m165379d("MarcusTest", "setVolume: " + d);
        if (d < 0.0d) {
            d = 0.0d;
        }
        float f = (float) (((double) f104569c) * (d / 2000.0d));
        this.f104575h = f;
        float f2 = this.f104574g;
        if (f < f2) {
            this.f104575h = f2;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (this.f104577j / 2));
        if (this.f104579l == 0) {
            i = this.f104576i - f104570d;
        } else {
            i = 0;
        }
        for (Float f : this.f104580m) {
            float f2 = this.f104574g;
            float floatValue = f2 + ((this.f104575h - f2) * f.floatValue());
            int i2 = f104570d;
            RectF rectF = new RectF((float) i, (-floatValue) / 2.0f, (float) (i + i2), floatValue / 2.0f);
            if (this.f104579l == 0) {
                i -= f104571e + i2;
            } else {
                i += f104571e + i2;
            }
            int i3 = f104572f;
            canvas.drawRoundRect(rectF, (float) i3, (float) i3, this.f104578k);
        }
        Deque<Float> deque = this.f104580m;
        deque.addFirst(deque.removeLast());
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public LarkVoiceLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LarkVoiceLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104573a = new Runnable() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkVoiceLineView.RunnableC410611 */

            public void run() {
                LarkVoiceLineView.this.postInvalidate();
                LarkVoiceLineView larkVoiceLineView = LarkVoiceLineView.this;
                larkVoiceLineView.postDelayed(larkVoiceLineView.f104573a, 50);
            }
        };
        int i2 = f104568b;
        this.f104574g = (float) i2;
        this.f104575h = (float) i2;
        mo148020a(context, attributeSet, i);
        mo148019a();
        this.f104581n = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148020a(Context context, AttributeSet attributeSet, int i) {
        LinkedList linkedList = new LinkedList();
        this.f104580m = linkedList;
        Float valueOf = Float.valueOf(0.78f);
        linkedList.add(valueOf);
        this.f104580m.add(Float.valueOf(1.0f));
        this.f104580m.add(valueOf);
        this.f104580m.add(Float.valueOf(0.3f));
        this.f104580m.add(Float.valueOf(0.09f));
        this.f104580m.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        this.f104580m.add(Float.valueOf(0.24f));
        this.f104580m.add(Float.valueOf(0.61f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation}, i, 0);
        if (obtainStyledAttributes != null) {
            this.f104579l = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f104576i = i;
        this.f104577j = i2;
    }
}
