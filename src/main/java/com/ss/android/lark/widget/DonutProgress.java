package com.ss.android.lark.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class DonutProgress extends View {

    /* renamed from: A */
    private int f143340A;

    /* renamed from: B */
    private int f143341B;

    /* renamed from: C */
    private float f143342C;

    /* renamed from: D */
    private float f143343D;

    /* renamed from: E */
    private int f143344E;

    /* renamed from: F */
    private String f143345F;

    /* renamed from: G */
    private String f143346G;

    /* renamed from: H */
    private String f143347H;

    /* renamed from: I */
    private float f143348I;

    /* renamed from: J */
    private String f143349J;

    /* renamed from: K */
    private float f143350K;

    /* renamed from: a */
    protected Paint f143351a;

    /* renamed from: b */
    protected Paint f143352b;

    /* renamed from: c */
    private final float f143353c;

    /* renamed from: d */
    private final int f143354d;

    /* renamed from: e */
    private final int f143355e;

    /* renamed from: f */
    private final int f143356f;

    /* renamed from: g */
    private final int f143357g;

    /* renamed from: h */
    private final int f143358h;

    /* renamed from: i */
    private final int f143359i;

    /* renamed from: j */
    private final int f143360j;

    /* renamed from: k */
    private final float f143361k;

    /* renamed from: l */
    private final float f143362l;

    /* renamed from: m */
    private final int f143363m;

    /* renamed from: n */
    private Paint f143364n;

    /* renamed from: o */
    private Paint f143365o;

    /* renamed from: p */
    private Paint f143366p;

    /* renamed from: q */
    private RectF f143367q;

    /* renamed from: r */
    private RectF f143368r;

    /* renamed from: s */
    private int f143369s;

    /* renamed from: t */
    private boolean f143370t;

    /* renamed from: u */
    private float f143371u;

    /* renamed from: v */
    private int f143372v;

    /* renamed from: w */
    private int f143373w;

    /* renamed from: x */
    private float f143374x;

    /* renamed from: y */
    private int f143375y;

    /* renamed from: z */
    private int f143376z;

    public int getAttributeResourceId() {
        return this.f143369s;
    }

    public int getFinishedStrokeColor() {
        return this.f143376z;
    }

    public float getFinishedStrokeWidth() {
        return this.f143342C;
    }

    public int getInnerBackgroundColor() {
        return this.f143344E;
    }

    public String getInnerBottomText() {
        return this.f143349J;
    }

    public int getInnerBottomTextColor() {
        return this.f143373w;
    }

    public float getInnerBottomTextSize() {
        return this.f143348I;
    }

    public int getMax() {
        return this.f143375y;
    }

    public String getPrefixText() {
        return this.f143345F;
    }

    public float getProgress() {
        return this.f143374x;
    }

    public int getStartingDegree() {
        return this.f143341B;
    }

    public String getSuffixText() {
        return this.f143346G;
    }

    public String getText() {
        return this.f143347H;
    }

    public int getTextColor() {
        return this.f143372v;
    }

    public float getTextSize() {
        return this.f143371u;
    }

    public int getUnfinishedStrokeColor() {
        return this.f143340A;
    }

    public float getUnfinishedStrokeWidth() {
        return this.f143343D;
    }

    public void invalidate() {
        mo197422a();
        super.invalidate();
    }

    private float getProgressAngle() {
        return (getProgress() / ((float) this.f143375y)) * 360.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo197422a() {
        if (this.f143370t) {
            TextPaint textPaint = new TextPaint();
            this.f143351a = textPaint;
            textPaint.setColor(this.f143372v);
            this.f143351a.setTextSize(this.f143371u);
            this.f143351a.setAntiAlias(true);
            TextPaint textPaint2 = new TextPaint();
            this.f143352b = textPaint2;
            textPaint2.setColor(this.f143373w);
            this.f143352b.setTextSize(this.f143348I);
            this.f143352b.setAntiAlias(true);
        }
        Paint paint = new Paint();
        this.f143364n = paint;
        paint.setColor(this.f143376z);
        this.f143364n.setStyle(Paint.Style.STROKE);
        this.f143364n.setAntiAlias(true);
        this.f143364n.setStrokeWidth(this.f143342C);
        Paint paint2 = new Paint();
        this.f143365o = paint2;
        paint2.setColor(this.f143340A);
        this.f143365o.setStyle(Paint.Style.STROKE);
        this.f143365o.setAntiAlias(true);
        this.f143365o.setStrokeWidth(this.f143343D);
        Paint paint3 = new Paint();
        this.f143366p = paint3;
        paint3.setColor(this.f143344E);
        this.f143366p.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", (float) getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("unfinished_stroke_color", getUnfinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("starting_degree", getStartingDegree());
        bundle.putFloat("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putString("text", getText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putFloat("unfinished_stroke_width", getUnfinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        bundle.putInt("inner_drawable", getAttributeResourceId());
        return bundle;
    }

    public void setAttributeResourceId(int i) {
        this.f143369s = i;
    }

    public void setShowText(boolean z) {
        this.f143370t = z;
    }

    public DonutProgress(Context context) {
        this(context, null);
    }

    public void setFinishedStrokeColor(int i) {
        this.f143376z = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f143342C = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f143344E = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f143349J = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f143373w = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f143348I = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f143375y = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f143345F = str;
        invalidate();
    }

    public void setStartingDegree(int i) {
        this.f143341B = i;
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f143346G = str;
        invalidate();
    }

    public void setText(String str) {
        this.f143347H = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f143372v = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f143371u = f;
        invalidate();
    }

    public void setUnfinishedStrokeColor(int i) {
        this.f143340A = i;
        invalidate();
    }

    public void setUnfinishedStrokeWidth(float f) {
        this.f143343D = f;
        invalidate();
    }

    public void setDonut_progress(String str) {
        if (!TextUtils.isEmpty(str)) {
            setProgress((float) Integer.parseInt(str));
        }
    }

    /* renamed from: a */
    private int m226067a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f143363m;
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        return i2;
    }

    public void setProgress(float f) {
        this.f143374x = f;
        if (f > ((float) getMax())) {
            this.f143374x %= (float) getMax();
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f143372v = bundle.getInt("text_color");
            this.f143371u = bundle.getFloat("text_size");
            this.f143348I = bundle.getFloat("inner_bottom_text_size");
            this.f143349J = bundle.getString("inner_bottom_text");
            this.f143373w = bundle.getInt("inner_bottom_text_color");
            this.f143376z = bundle.getInt("finished_stroke_color");
            this.f143340A = bundle.getInt("unfinished_stroke_color");
            this.f143342C = bundle.getFloat("finished_stroke_width");
            this.f143343D = bundle.getFloat("unfinished_stroke_width");
            this.f143344E = bundle.getInt("inner_background_color");
            this.f143369s = bundle.getInt("inner_drawable");
            mo197422a();
            setMax(bundle.getInt("max"));
            setStartingDegree(bundle.getInt("starting_degree"));
            setProgress(bundle.getFloat("progress"));
            this.f143345F = bundle.getString("prefix");
            this.f143346G = bundle.getString("suffix");
            this.f143347H = bundle.getString("text");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo197423a(TypedArray typedArray) {
        this.f143376z = typedArray.getColor(2, this.f143354d);
        this.f143340A = typedArray.getColor(16, this.f143355e);
        this.f143370t = typedArray.getBoolean(11, true);
        this.f143369s = typedArray.getResourceId(7, 0);
        setMax(typedArray.getInt(8, 100));
        setProgress(typedArray.getFloat(10, BitmapDescriptorFactory.HUE_RED));
        this.f143342C = typedArray.getDimension(3, this.f143353c);
        this.f143343D = typedArray.getDimension(17, this.f143353c);
        if (this.f143370t) {
            if (typedArray.getString(9) != null) {
                this.f143345F = typedArray.getString(9);
            }
            if (typedArray.getString(12) != null) {
                this.f143346G = typedArray.getString(12);
            }
            if (typedArray.getString(13) != null) {
                this.f143347H = typedArray.getString(13);
            }
            this.f143372v = typedArray.getColor(14, this.f143356f);
            this.f143371u = typedArray.getDimension(15, this.f143361k);
            this.f143348I = typedArray.getDimension(6, this.f143362l);
            this.f143373w = typedArray.getColor(5, this.f143357g);
            this.f143349J = typedArray.getString(4);
        }
        this.f143348I = typedArray.getDimension(6, this.f143362l);
        this.f143373w = typedArray.getColor(5, this.f143357g);
        this.f143349J = typedArray.getString(4);
        this.f143341B = typedArray.getInt(1, 0);
        this.f143344E = typedArray.getColor(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max = Math.max(this.f143342C, this.f143343D);
        this.f143367q.set(max, max, ((float) getWidth()) - max, ((float) getHeight()) - max);
        this.f143368r.set(max, max, ((float) getWidth()) - max, ((float) getHeight()) - max);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - Math.min(this.f143342C, this.f143343D)) + Math.abs(this.f143342C - this.f143343D)) / 2.0f, this.f143366p);
        canvas.drawArc(this.f143367q, (float) getStartingDegree(), getProgressAngle(), false, this.f143364n);
        canvas.drawArc(this.f143368r, getProgressAngle() + ((float) getStartingDegree()), 360.0f - getProgressAngle(), false, this.f143365o);
        if (this.f143370t) {
            String str = this.f143347H;
            if (str == null) {
                str = this.f143345F + this.f143374x + this.f143346G;
            }
            if (!TextUtils.isEmpty(str)) {
                canvas.drawText(str, (((float) getWidth()) - this.f143351a.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f143351a.descent() + this.f143351a.ascent())) / 2.0f, this.f143351a);
            }
            if (!TextUtils.isEmpty(getInnerBottomText())) {
                this.f143352b.setTextSize(this.f143348I);
                canvas.drawText(getInnerBottomText(), (((float) getWidth()) - this.f143352b.measureText(getInnerBottomText())) / 2.0f, (((float) getHeight()) - this.f143350K) - ((this.f143351a.descent() + this.f143351a.ascent()) / 2.0f), this.f143352b);
            }
        }
        if (this.f143369s != 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f143369s);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.drawBitmap(decodeResource, ((float) (getWidth() - decodeResource.getWidth())) / 2.0f, ((float) (getHeight() - decodeResource.getHeight())) / 2.0f, (Paint) null);
        }
    }

    public DonutProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m226067a(i), m226067a(i2));
        this.f143350K = (float) (getHeight() - ((getHeight() * 3) / 4));
    }

    public DonutProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143354d = Color.rgb(66, (int) SmEvents.EVENT_UA_ERROR, 241);
        this.f143355e = Color.rgb(204, 204, 204);
        this.f143356f = Color.rgb(66, (int) SmEvents.EVENT_UA_ERROR, 241);
        this.f143357g = Color.rgb(66, (int) SmEvents.EVENT_UA_ERROR, 241);
        this.f143358h = 0;
        this.f143359i = 100;
        this.f143360j = 0;
        this.f143367q = new RectF();
        this.f143368r = new RectF();
        this.f143369s = 0;
        this.f143374x = BitmapDescriptorFactory.HUE_RED;
        this.f143345F = "";
        this.f143346G = "%";
        this.f143347H = null;
        this.f143361k = UIUtils.sp2px(getContext(), 18.0f);
        this.f143363m = UIUtils.dp2px(getContext(), 100.0f);
        this.f143353c = (float) UIUtils.dp2px(getContext(), 10.0f);
        this.f143362l = UIUtils.sp2px(getContext(), 18.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.donut_background_color, R.attr.donut_circle_starting_degree, R.attr.donut_finished_color, R.attr.donut_finished_stroke_width, R.attr.donut_inner_bottom_text, R.attr.donut_inner_bottom_text_color, R.attr.donut_inner_bottom_text_size, R.attr.donut_inner_drawable, R.attr.donut_max, R.attr.donut_prefix_text, R.attr.donut_progress, R.attr.donut_show_text, R.attr.donut_suffix_text, R.attr.donut_text, R.attr.donut_text_color, R.attr.donut_text_size, R.attr.donut_unfinished_color, R.attr.donut_unfinished_stroke_width}, i, 0);
        mo197423a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        mo197422a();
    }
}
