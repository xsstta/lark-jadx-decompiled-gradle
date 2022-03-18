package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class IndexBar extends View {

    /* renamed from: a */
    private float f91576a;

    /* renamed from: b */
    private AbstractC35425a f91577b;

    /* renamed from: c */
    private List<String> f91578c;

    /* renamed from: d */
    private int f91579d;

    /* renamed from: e */
    private Paint f91580e;

    /* renamed from: f */
    private Paint f91581f;

    /* renamed from: g */
    private float f91582g;

    /* renamed from: com.ss.android.lark.contact.feat.common.IndexBar$a */
    public interface AbstractC35425a {
        /* renamed from: a */
        void mo130745a(String str);

        /* renamed from: b */
        void mo130746b(String str);

        /* renamed from: c */
        void mo130747c(String str);
    }

    private AbstractC35425a getDummyListener() {
        return new AbstractC35425a() {
            /* class com.ss.android.lark.contact.feat.common.IndexBar.C354241 */

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: a */
            public void mo130745a(String str) {
            }

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: b */
            public void mo130746b(String str) {
            }

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: c */
            public void mo130747c(String str) {
            }
        };
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f91578c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return (int) (((double) this.f91580e.measureText(str)) + 0.5d);
    }

    public IndexBar(Context context) {
        super(context);
    }

    public void setOnTouchingLetterChangedListener(AbstractC35425a aVar) {
        this.f91577b = aVar;
    }

    public void setFocusIndex(int i) {
        this.f91579d = i;
        invalidate();
    }

    public void setNavigators(List<String> list) {
        this.f91578c = list;
        invalidate();
        requestLayout();
    }

    /* renamed from: a */
    private int m138553a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinWidth = getSuggestedMinWidth();
        if (mode == Integer.MIN_VALUE) {
            return Math.min(suggestedMinWidth, size);
        }
        return suggestedMinWidth;
    }

    /* renamed from: a */
    private int m138552a(float f) {
        int height = (int) ((f / ((float) getHeight())) * ((float) this.f91578c.size()));
        if (height >= this.f91578c.size()) {
            return this.f91578c.size() - 1;
        }
        if (height < 0) {
            return 0;
        }
        return height;
    }

    /* renamed from: b */
    private int m138555b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        Paint.FontMetrics fontMetrics = this.f91580e.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f91582g = fontMetrics.bottom * this.f91576a;
        int size2 = (int) (((float) this.f91578c.size()) * f * this.f91576a);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size2, size);
        }
        return size2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        int i = this.f91579d;
        AbstractC35425a aVar = this.f91577b;
        int a = m138552a(y);
        int action = motionEvent.getAction();
        if (action == 0) {
            aVar.mo130746b(this.f91578c.get(a));
        } else if (action == 1 || action == 3) {
            invalidate();
            aVar.mo130747c(this.f91578c.get(a));
            return true;
        }
        if (i != a && a >= 0 && a < this.f91578c.size()) {
            aVar.mo130745a(this.f91578c.get(a));
            this.f91579d = a;
            invalidate();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        if (height != 0) {
            int size = height / this.f91578c.size();
            int i = 0;
            while (i < this.f91578c.size()) {
                float measureText = ((float) (width / 2)) - (this.f91580e.measureText(this.f91578c.get(i)) / 2.0f);
                int i2 = i + 1;
                float f = (float) (size * i2);
                if (i == this.f91579d) {
                    canvas.drawText(this.f91578c.get(i), measureText, f - this.f91582g, this.f91581f);
                } else {
                    canvas.drawText(this.f91578c.get(i), measureText, f - this.f91582g, this.f91580e);
                }
                i = i2;
            }
        }
    }

    public IndexBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m138554a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m138553a(i), m138555b(i2));
    }

    /* renamed from: a */
    private void m138554a(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        this.f91577b = getDummyListener();
        this.f91578c = new ArrayList(0);
        this.f91579d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bold, R.attr.focusLetterColor, R.attr.letterColor, R.attr.letterSize, R.attr.letterSpacingExtra});
        float dimension = obtainStyledAttributes.getDimension(3, 8.0f);
        int color = obtainStyledAttributes.getColor(2, ContextCompat.getColor(getContext(), 17170443));
        this.f91576a = obtainStyledAttributes.getFloat(4, 1.4f);
        int color2 = obtainStyledAttributes.getColor(1, ContextCompat.getColor(getContext(), 17170443));
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        Paint paint = new Paint();
        this.f91580e = paint;
        paint.setTypeface(typeface);
        this.f91580e.setAntiAlias(true);
        this.f91580e.setColor(color);
        this.f91580e.setTextSize(dimension);
        Paint paint2 = new Paint();
        this.f91581f = paint2;
        paint2.setTypeface(typeface);
        this.f91581f.setAntiAlias(true);
        this.f91581f.setFakeBoldText(true);
        this.f91581f.setTextSize(dimension);
        this.f91581f.setColor(color2);
    }

    public IndexBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m138554a(context, attributeSet);
    }
}
