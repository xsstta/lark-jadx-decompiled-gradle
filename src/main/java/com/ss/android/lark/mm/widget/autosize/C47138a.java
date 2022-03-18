package com.ss.android.lark.mm.widget.autosize;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.mm.widget.autosize.a */
public class C47138a {

    /* renamed from: a */
    private TextView f118766a;

    /* renamed from: b */
    private TextPaint f118767b;

    /* renamed from: c */
    private float f118768c;

    /* renamed from: d */
    private int f118769d;

    /* renamed from: e */
    private float f118770e;

    /* renamed from: f */
    private float f118771f;

    /* renamed from: g */
    private float f118772g;

    /* renamed from: h */
    private boolean f118773h;

    /* renamed from: i */
    private boolean f118774i;

    /* renamed from: j */
    private ArrayList<AbstractC47142c> f118775j;

    /* renamed from: k */
    private TextWatcher f118776k = new C47141b();

    /* renamed from: l */
    private View.OnLayoutChangeListener f118777l = new View$OnLayoutChangeListenerC47140a();

    /* renamed from: com.ss.android.lark.mm.widget.autosize.a$c */
    public interface AbstractC47142c {
        /* renamed from: a */
        void mo165627a(float f, float f2);
    }

    /* renamed from: a */
    public float mo165639a() {
        return this.f118772g;
    }

    /* renamed from: b */
    public float mo165645b() {
        return this.f118770e;
    }

    /* renamed from: c */
    public float mo165648c() {
        return this.f118771f;
    }

    /* renamed from: a */
    public C47138a mo165643a(AbstractC47142c cVar) {
        if (this.f118775j == null) {
            this.f118775j = new ArrayList<>();
        }
        this.f118775j.add(cVar);
        return this;
    }

    /* renamed from: a */
    public C47138a mo165644a(boolean z) {
        if (this.f118773h != z) {
            this.f118773h = z;
            if (z) {
                this.f118766a.addTextChangedListener(this.f118776k);
                this.f118766a.addOnLayoutChangeListener(this.f118777l);
                mo165650d();
            } else {
                this.f118766a.removeTextChangedListener(this.f118776k);
                this.f118766a.removeOnLayoutChangeListener(this.f118777l);
                this.f118766a.setTextSize(0, this.f118768c);
            }
        }
        return this;
    }

    /* renamed from: d */
    public void mo165650d() {
        float textSize = this.f118766a.getTextSize();
        this.f118774i = true;
        m186671a(this.f118766a, this.f118767b, this.f118770e, this.f118771f, this.f118769d, this.f118772g);
        this.f118774i = false;
        float textSize2 = this.f118766a.getTextSize();
        if (textSize2 != textSize) {
            m186670a(textSize2, textSize);
        }
    }

    /* renamed from: com.ss.android.lark.mm.widget.autosize.a$a */
    private class View$OnLayoutChangeListenerC47140a implements View.OnLayoutChangeListener {
        private View$OnLayoutChangeListenerC47140a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C47138a.this.mo165650d();
        }
    }

    /* renamed from: com.ss.android.lark.mm.widget.autosize.a$b */
    private class C47141b implements TextWatcher {
        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C47141b() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C47138a.this.mo165650d();
        }
    }

    /* renamed from: a */
    public static C47138a m186668a(TextView textView) {
        return m186669a(textView, null, 0);
    }

    /* renamed from: b */
    public C47138a mo165646b(float f) {
        return mo165647b(2, f);
    }

    /* renamed from: c */
    private void m186673c(float f) {
        if (f != this.f118770e) {
            this.f118770e = f;
            mo165650d();
        }
    }

    /* renamed from: d */
    private void m186674d(float f) {
        if (f != this.f118771f) {
            this.f118771f = f;
            mo165650d();
        }
    }

    /* renamed from: e */
    private void m186675e(float f) {
        if (this.f118768c != f) {
            this.f118768c = f;
        }
    }

    /* renamed from: a */
    public C47138a mo165640a(float f) {
        if (this.f118772g != f) {
            this.f118772g = f;
            mo165650d();
        }
        return this;
    }

    /* renamed from: b */
    private static int m186672b(TextView textView) {
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null && (transformationMethod instanceof SingleLineTransformationMethod)) {
            return 1;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        return -1;
    }

    private C47138a(TextView textView) {
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f118766a = textView;
        this.f118767b = new TextPaint();
        m186675e(textView.getTextSize());
        this.f118769d = m186672b(textView);
        this.f118770e = f * 8.0f;
        this.f118771f = this.f118768c;
        this.f118772g = 0.5f;
    }

    /* renamed from: a */
    public C47138a mo165641a(int i) {
        if (this.f118769d != i) {
            this.f118769d = i;
            mo165650d();
        }
        return this;
    }

    /* renamed from: a */
    private void m186670a(float f, float f2) {
        ArrayList<AbstractC47142c> arrayList = this.f118775j;
        if (arrayList != null) {
            Iterator<AbstractC47142c> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo165627a(f, f2);
            }
        }
    }

    /* renamed from: b */
    public C47138a mo165647b(int i, float f) {
        Context context = this.f118766a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        m186674d(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: c */
    public void mo165649c(int i, float f) {
        if (!this.f118774i) {
            Context context = this.f118766a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            m186675e(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        }
    }

    /* renamed from: a */
    public C47138a mo165642a(int i, float f) {
        Context context = this.f118766a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        m186673c(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: a */
    public static C47138a m186669a(TextView textView, AttributeSet attributeSet, int i) {
        C47138a aVar = new C47138a(textView);
        boolean z = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            float a = aVar.mo165639a();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.minTextSize, R.attr.precision, R.attr.sizeToFit}, i, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, (int) aVar.mo165645b());
            float f = obtainStyledAttributes.getFloat(1, a);
            obtainStyledAttributes.recycle();
            aVar.mo165642a(0, (float) dimensionPixelSize).mo165640a(f);
            z = z2;
        }
        aVar.mo165644a(z);
        return aVar;
    }

    /* renamed from: a */
    private static int m186667a(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true).getLineCount();
    }

    /* renamed from: a */
    private static void m186671a(TextView textView, TextPaint textPaint, float f, float f2, int i, float f3) {
        int width;
        float f4;
        if (i > 0 && i != Integer.MAX_VALUE && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView);
            }
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint.set(textView.getPaint());
            textPaint.setTextSize(f2);
            if ((i != 1 || textPaint.measureText(text, 0, text.length()) <= ((float) width)) && m186667a(text, textPaint, f2, (float) width, displayMetrics) <= i) {
                f4 = f2;
            } else {
                f4 = m186666a(text, textPaint, (float) width, i, BitmapDescriptorFactory.HUE_RED, f2, f3, displayMetrics);
            }
            if (f4 < f) {
                f4 = f;
            }
            textView.setTextSize(0, f4);
        }
    }

    /* renamed from: a */
    private static float m186666a(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i2;
        float f5;
        float f6 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f6, displayMetrics));
        if (i != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            i2 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i2 = 1;
        }
        if (i2 > i) {
            if (f3 - f2 < f4) {
                return f2;
            }
            return m186666a(charSequence, textPaint, f, i, f2, f6, f4, displayMetrics);
        } else if (i2 < i) {
            return m186666a(charSequence, textPaint, f, i, f6, f3, f4, displayMetrics);
        } else {
            float f7 = BitmapDescriptorFactory.HUE_RED;
            if (i == 1) {
                f5 = textPaint.measureText(charSequence, 0, charSequence.length());
            } else {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (staticLayout.getLineWidth(i3) > f7) {
                        f7 = staticLayout.getLineWidth(i3);
                    }
                }
                f5 = f7;
            }
            if (f3 - f2 < f4) {
                return f2;
            }
            if (f5 > f) {
                return m186666a(charSequence, textPaint, f, i, f2, f6, f4, displayMetrics);
            }
            if (f5 < f) {
                return m186666a(charSequence, textPaint, f, i, f6, f3, f4, displayMetrics);
            }
            return f6;
        }
    }
}
