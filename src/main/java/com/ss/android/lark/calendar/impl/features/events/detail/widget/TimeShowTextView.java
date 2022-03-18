package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class TimeShowTextView extends TextView {

    /* renamed from: a */
    private boolean f79763a;

    /* renamed from: b */
    private String f79764b;

    /* renamed from: c */
    private boolean f79765c;

    /* renamed from: d */
    private float f79766d;

    /* renamed from: e */
    private AbstractC31471a f79767e;

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView$a */
    public interface AbstractC31471a {
        /* renamed from: a */
        void mo114204a();
    }

    /* renamed from: a */
    public int mo114200a() {
        Layout layout = getLayout();
        String charSequence = getText().toString();
        int i = 0;
        int lineEnd = layout.getLineEnd(0);
        int i2 = lineEnd + 0;
        for (int i3 = 1; i3 < getLineCount(); i3++) {
            int i4 = i3 - 1;
            if ((layout.getLineEnd(i3) - layout.getLineEnd(i4)) - 1 > i2) {
                i2 = (layout.getLineEnd(i3) - layout.getLineEnd(i4)) - 1;
                i = layout.getLineEnd(i4) + 1;
                lineEnd = layout.getLineEnd(i3);
            }
        }
        Rect rect = new Rect();
        getPaint().getTextBounds(charSequence, i, lineEnd, rect);
        return rect.width();
    }

    public void setWidthListener(AbstractC31471a aVar) {
        this.f79767e = aVar;
    }

    public TimeShowTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo114201a(String str, boolean z) {
        this.f79763a = z;
        this.f79764b = str;
        if (getWidth() > 0) {
            m118418a(str, getWidth());
        }
    }

    public TimeShowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.33f);
        this.f79764b = "";
        if (attributeSet != null) {
            this.f79765c = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.changeWidth}).getBoolean(0, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            m118418a(this.f79764b, size);
        }
        super.onMeasure(i, i2);
        if (mode != 1073741824) {
            m118418a(this.f79764b, getWidth());
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m118418a(String str, int i) {
        this.f79766d = BitmapDescriptorFactory.HUE_RED;
        if (!TextUtils.isEmpty(str)) {
            String a = m118417a(this, str, i);
            if (!TextUtils.isEmpty(a) && !a.equals(getText().toString())) {
                setText(a);
            }
            if (this.f79765c && this.f79766d > BitmapDescriptorFactory.HUE_RED) {
                getLayoutParams().width = (int) Math.ceil((double) this.f79766d);
                AbstractC31471a aVar = this.f79767e;
                if (aVar != null) {
                    aVar.mo114204a();
                }
            }
        }
    }

    /* renamed from: a */
    private String m118417a(TimeShowTextView timeShowTextView, String str, int i) {
        if (str == null) {
            str = timeShowTextView.getText().toString();
        }
        TextPaint paint = timeShowTextView.getPaint();
        int paddingLeft = (i - timeShowTextView.getPaddingLeft()) - timeShowTextView.getPaddingRight();
        if (this.f79763a) {
            return m118416a(paint, (float) paddingLeft, str, true);
        }
        return m118415a(paint, (float) paddingLeft, str);
    }

    /* renamed from: a */
    private String m118415a(Paint paint, float f, String str) {
        if (paint.measureText(str) <= f || str.contains("\n")) {
            if (paint.measureText(str) <= f) {
                this.f79766d = paint.measureText(str);
            }
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" - ");
        if (split.length != 2) {
            return str;
        }
        sb.append(split[0]);
        sb.append(" -");
        sb.append("\n");
        if (paint.measureText(split[1]) > f) {
            sb.append(m118416a(paint, f, split[1], false));
        } else {
            sb.append(split[1]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m118416a(Paint paint, float f, String str, boolean z) {
        if (paint.measureText(str) <= f || str.contains("\n")) {
            if (paint.measureText(str) <= f && z) {
                this.f79766d = paint.measureText(str);
            }
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            f2 += paint.measureText(str2);
            if (f2 > f) {
                sb.append("\n");
                sb.append(str2);
                f2 = paint.measureText(str2);
            } else {
                sb.append(str2);
            }
            if (i != split.length - 1) {
                f2 += paint.measureText(" ");
                if (f2 > f) {
                    sb.append("\n");
                    f2 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
