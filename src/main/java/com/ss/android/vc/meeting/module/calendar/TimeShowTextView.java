package com.ss.android.vc.meeting.module.calendar;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class TimeShowTextView extends TextView {

    /* renamed from: a */
    private boolean f154402a;

    /* renamed from: b */
    private String f154403b = "";

    public TimeShowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo213332a(String str, boolean z) {
        this.f154402a = z;
        this.f154403b = str;
        if (getWidth() > 0) {
            m240247a(str, getWidth());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            m240247a(this.f154403b, size);
        }
        super.onMeasure(i, i2);
        if (mode != 1073741824) {
            m240247a(this.f154403b, getWidth());
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m240247a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            String a = m240246a(this, str, i);
            if (!TextUtils.isEmpty(a) && !a.equals(getText().toString())) {
                setText(a);
            }
        }
    }

    /* renamed from: a */
    private String m240246a(TimeShowTextView timeShowTextView, String str, int i) {
        if (str == null) {
            str = timeShowTextView.getText().toString();
        }
        TextPaint paint = timeShowTextView.getPaint();
        int paddingLeft = (i - timeShowTextView.getPaddingLeft()) - timeShowTextView.getPaddingRight();
        if (this.f154402a) {
            return m240245a(paint, (float) paddingLeft, str);
        }
        return m240248b(paint, (float) paddingLeft, str);
    }

    /* renamed from: a */
    private String m240245a(Paint paint, float f, String str) {
        if (paint.measureText(str) <= f || str.contains("\n")) {
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

    /* renamed from: b */
    private String m240248b(Paint paint, float f, String str) {
        if (paint.measureText(str) <= f || str.contains("\n")) {
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
            sb.append(m240245a(paint, f, split[1]));
        } else {
            sb.append(split[1]);
        }
        return sb.toString();
    }
}
