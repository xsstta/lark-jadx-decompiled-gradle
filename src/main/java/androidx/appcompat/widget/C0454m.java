package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.m */
public class C0454m {

    /* renamed from: a */
    private static final RectF f1671a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1672b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f1673c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f1674d;

    /* renamed from: e */
    private boolean f1675e;

    /* renamed from: f */
    private float f1676f = -1.0f;

    /* renamed from: g */
    private float f1677g = -1.0f;

    /* renamed from: h */
    private float f1678h = -1.0f;

    /* renamed from: i */
    private int[] f1679i = new int[0];

    /* renamed from: j */
    private boolean f1680j;

    /* renamed from: k */
    private TextPaint f1681k;

    /* renamed from: l */
    private final TextView f1682l;

    /* renamed from: m */
    private final Context f1683m;

    /* renamed from: n */
    private final C0455a f1684n;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m$a */
    public static class C0455a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2650a(StaticLayout.Builder builder, TextView textView) {
        }

        C0455a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2651a(TextView textView) {
            return ((Boolean) C0454m.m1983a((Object) textView, "getHorizontallyScrolling", (Object) false)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.m$b */
    private static class C0456b extends C0455a {
        C0456b() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0454m.C0455a
        /* renamed from: a */
        public void mo2650a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0454m.m1983a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.m$c */
    private static class C0457c extends C0456b {
        C0457c() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0454m.C0455a
        /* renamed from: a */
        public boolean mo2651a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0454m.C0455a, androidx.appcompat.widget.C0454m.C0456b
        /* renamed from: a */
        public void mo2650a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2636a() {
        return this.f1674d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo2647e() {
        return this.f1679i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2641a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1683m.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale}, i, 0);
        TextView textView = this.f1682l;
        ViewCompat.m4034a(textView, textView.getContext(), new int[]{16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale}, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f1674d = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1987a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1997k()) {
            this.f1674d = 0;
        } else if (this.f1674d == 1) {
            if (!this.f1680j) {
                DisplayMetrics displayMetrics = this.f1683m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1986a(dimension2, dimension3, dimension);
            }
            m1995i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2638a(int i) {
        if (!m1997k()) {
            return;
        }
        if (i == 0) {
            m1996j();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1683m.getResources().getDisplayMetrics();
            m1986a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1995i()) {
                mo2648f();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2640a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1997k()) {
            DisplayMetrics displayMetrics = this.f1683m.getResources().getDisplayMetrics();
            m1986a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1995i()) {
                mo2648f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2642a(int[] iArr, int i) throws IllegalArgumentException {
        if (m1997k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1683m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1679i = m1989a(iArr2);
                if (!m1994h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1680j = false;
            }
            if (m1995i()) {
                mo2648f();
            }
        }
    }

    /* renamed from: a */
    private int[] m1989a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2639a(int i, float f) {
        Resources resources;
        Context context = this.f1683m;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1985a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StaticLayout mo2637a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m1991b(charSequence, alignment, i, i2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return m1982a(charSequence, alignment, i);
        }
        return m1990b(charSequence, alignment, i);
    }

    /* renamed from: a */
    private boolean m1988a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1682l.getText();
        TransformationMethod transformationMethod = this.f1682l.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1682l)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1682l.getMaxLines() : -1;
        mo2644b(i);
        StaticLayout a = mo2637a(text, (Layout.Alignment) m1983a(this.f1682l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: k */
    private boolean m1997k() {
        return !(this.f1682l instanceof AppCompatEditText);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2643b() {
        return Math.round(this.f1676f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2645c() {
        return Math.round(this.f1677g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2646d() {
        return Math.round(this.f1678h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2649g() {
        if (!m1997k() || this.f1674d == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m1994h() {
        boolean z;
        int[] iArr = this.f1679i;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1680j = z;
        if (z) {
            this.f1674d = 1;
            this.f1677g = (float) iArr[0];
            this.f1678h = (float) iArr[length - 1];
            this.f1676f = -1.0f;
        }
        return z;
    }

    /* renamed from: j */
    private void m1996j() {
        this.f1674d = 0;
        this.f1677g = -1.0f;
        this.f1678h = -1.0f;
        this.f1676f = -1.0f;
        this.f1679i = new int[0];
        this.f1675e = false;
    }

    /* renamed from: i */
    private boolean m1995i() {
        if (!m1997k() || this.f1674d != 1) {
            this.f1675e = false;
        } else {
            if (!this.f1680j || this.f1679i.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1678h - this.f1677g) / this.f1676f))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1677g + (((float) i) * this.f1676f));
                }
                this.f1679i = m1989a(iArr);
            }
            this.f1675e = true;
        }
        return this.f1675e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2648f() {
        int i;
        if (mo2649g()) {
            if (this.f1675e) {
                if (this.f1682l.getMeasuredHeight() > 0 && this.f1682l.getMeasuredWidth() > 0) {
                    if (this.f1684n.mo2651a(this.f1682l)) {
                        i = 1048576;
                    } else {
                        i = (this.f1682l.getMeasuredWidth() - this.f1682l.getTotalPaddingLeft()) - this.f1682l.getTotalPaddingRight();
                    }
                    int height = (this.f1682l.getHeight() - this.f1682l.getCompoundPaddingBottom()) - this.f1682l.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1671a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float a = (float) m1981a(rectF);
                            if (a != this.f1682l.getTextSize()) {
                                mo2639a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1675e = true;
        }
    }

    C0454m(TextView textView) {
        this.f1682l = textView;
        this.f1683m = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1684n = new C0457c();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f1684n = new C0456b();
        } else {
            this.f1684n = new C0455a();
        }
    }

    /* renamed from: a */
    private int m1981a(RectF rectF) {
        int length = this.f1679i.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1988a(this.f1679i[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1679i[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private static Method m1984a(String str) {
        try {
            Method method = f1672b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1672b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1985a(float f) {
        boolean z;
        if (f != this.f1682l.getPaint().getTextSize()) {
            this.f1682l.getPaint().setTextSize(f);
            if (Build.VERSION.SDK_INT >= 18) {
                z = this.f1682l.isInLayout();
            } else {
                z = false;
            }
            if (this.f1682l.getLayout() != null) {
                this.f1675e = false;
                try {
                    Method a = m1984a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1682l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!z) {
                    this.f1682l.requestLayout();
                } else {
                    this.f1682l.forceLayout();
                }
                this.f1682l.invalidate();
            }
        }
    }

    /* renamed from: b */
    private static Field m1993b(String str) {
        try {
            Field field = f1673c.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1673c.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2644b(int i) {
        TextPaint textPaint = this.f1681k;
        if (textPaint == null) {
            this.f1681k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1681k.set(this.f1682l.getPaint());
        this.f1681k.setTextSize((float) i);
    }

    /* renamed from: a */
    private void m1987a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1679i = m1989a(iArr);
            m1994h();
        }
    }

    /* renamed from: a */
    private StaticLayout m1982a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1681k, i, alignment, this.f1682l.getLineSpacingMultiplier(), this.f1682l.getLineSpacingExtra(), this.f1682l.getIncludeFontPadding());
    }

    /* renamed from: b */
    private static <T> T m1992b(Object obj, String str, T t) {
        try {
            Field b = m1993b(str);
            return b == null ? t : (T) b.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: a */
    static <T> T m1983a(Object obj, String str, T t) {
        try {
            return (T) m1984a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: b */
    private StaticLayout m1990b(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1681k, i, alignment, ((Float) m1992b(this.f1682l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1992b(this.f1682l, "mSpacingAdd", Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))).floatValue(), ((Boolean) m1992b((Object) this.f1682l, "mIncludePad", (Object) true)).booleanValue());
    }

    /* renamed from: a */
    private void m1986a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > BitmapDescriptorFactory.HUE_RED) {
            this.f1674d = 1;
            this.f1677g = f;
            this.f1678h = f2;
            this.f1676f = f3;
            this.f1680j = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: b */
    private StaticLayout m1991b(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1681k, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1682l.getLineSpacingExtra(), this.f1682l.getLineSpacingMultiplier()).setIncludePad(this.f1682l.getIncludeFontPadding()).setBreakStrategy(this.f1682l.getBreakStrategy()).setHyphenationFrequency(this.f1682l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1684n.mo2650a(obtain, this.f1682l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
