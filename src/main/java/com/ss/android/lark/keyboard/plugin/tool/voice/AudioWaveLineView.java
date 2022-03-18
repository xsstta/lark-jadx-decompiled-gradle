package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.Deque;
import java.util.LinkedList;

public class AudioWaveLineView extends View {

    /* renamed from: b */
    private static final int f104438b = UIHelper.dp2px(4.0f);

    /* renamed from: c */
    private static final int f104439c = UIHelper.dp2px(22.0f);

    /* renamed from: d */
    private static final int f104440d = UIHelper.dp2px(3.0f);

    /* renamed from: e */
    private static final int f104441e = UIHelper.dp2px(3.0f);

    /* renamed from: f */
    private static final int f104442f = UIHelper.dp2px(1.0f);

    /* renamed from: a */
    public Runnable f104443a;

    /* renamed from: g */
    private float f104444g;

    /* renamed from: h */
    private int f104445h;

    /* renamed from: i */
    private int f104446i;

    /* renamed from: j */
    private Paint f104447j;

    /* renamed from: k */
    private int f104448k;

    /* renamed from: l */
    private Deque<Float> f104449l;

    /* renamed from: m */
    private RectF f104450m;

    /* renamed from: c */
    public void mo147899c() {
        removeCallbacks(this.f104443a);
    }

    /* renamed from: b */
    public void mo147898b() {
        this.f104444g = (float) UIHelper.dp2px(10.0f);
        mo147899c();
        postDelayed(this.f104443a, 50);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo147896a() {
        Paint paint = new Paint();
        this.f104447j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f104447j.setAntiAlias(true);
        this.f104447j.setColor(getContext().getResources().getColor(R.color.audio_input_wave_line));
    }

    public AudioWaveLineView(Context context) {
        this(context, null);
    }

    public void setVolume(double d) {
        float min = (float) (((double) f104439c) * (Math.min(1100.0d, Math.max(100.0d, d - 100.0d)) / 1100.0d));
        this.f104444g = min;
        this.f104444g = Math.max((float) (f104438b * 2), min);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) this.f104446i);
        if (this.f104448k == 0) {
            i = this.f104445h - f104440d;
        } else {
            i = 0;
        }
        for (Float f : this.f104449l) {
            int i2 = f104438b;
            int i3 = f104440d;
            this.f104450m.set((float) i, -(((float) i2) + ((this.f104444g - ((float) i2)) * f.floatValue())), (float) (i + i3), BitmapDescriptorFactory.HUE_RED);
            if (this.f104448k == 0) {
                i -= f104441e + i3;
            } else {
                i += f104441e + i3;
            }
            RectF rectF = this.f104450m;
            int i4 = f104442f;
            canvas.drawRoundRect(rectF, (float) i4, (float) i4, this.f104447j);
        }
        Deque<Float> deque = this.f104449l;
        deque.addFirst(deque.removeLast());
        canvas.restore();
    }

    public AudioWaveLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((f104440d + f104441e) * this.f104449l.size(), f104439c);
    }

    public AudioWaveLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104450m = new RectF();
        this.f104443a = new Runnable() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.AudioWaveLineView.RunnableC410251 */

            public void run() {
                AudioWaveLineView.this.postInvalidate();
                AudioWaveLineView audioWaveLineView = AudioWaveLineView.this;
                audioWaveLineView.postDelayed(audioWaveLineView.f104443a, 150);
            }
        };
        mo147897a(context, attributeSet, i);
        mo147896a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo147897a(Context context, AttributeSet attributeSet, int i) {
        LinkedList linkedList = new LinkedList();
        this.f104449l = linkedList;
        Float valueOf = Float.valueOf(0.2f);
        linkedList.add(valueOf);
        Deque<Float> deque = this.f104449l;
        Float valueOf2 = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        deque.add(valueOf2);
        this.f104449l.add(valueOf);
        Deque<Float> deque2 = this.f104449l;
        Float valueOf3 = Float.valueOf(0.4f);
        deque2.add(valueOf3);
        Deque<Float> deque3 = this.f104449l;
        Float valueOf4 = Float.valueOf(0.6f);
        deque3.add(valueOf4);
        Deque<Float> deque4 = this.f104449l;
        Float valueOf5 = Float.valueOf(0.8f);
        deque4.add(valueOf5);
        this.f104449l.add(Float.valueOf(1.0f));
        this.f104449l.add(valueOf5);
        this.f104449l.add(valueOf4);
        this.f104449l.add(valueOf3);
        this.f104449l.add(valueOf);
        this.f104449l.add(valueOf2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation}, i, 0);
        if (obtainStyledAttributes != null) {
            this.f104448k = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f104445h = i;
        this.f104446i = i2;
    }
}
