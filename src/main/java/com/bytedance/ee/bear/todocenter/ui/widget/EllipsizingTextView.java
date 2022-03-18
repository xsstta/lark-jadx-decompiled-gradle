package com.bytedance.ee.bear.todocenter.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EllipsizingTextView extends AppCompatTextView {

    /* renamed from: a */
    public static final CharSequence f31559a = "…";

    /* renamed from: g */
    private static final Pattern f31560g = Pattern.compile("[\\.!?,;:…]*$", 32);

    /* renamed from: b */
    public int f31561b;

    /* renamed from: c */
    public float f31562c;

    /* renamed from: e */
    public float f31563e;

    /* renamed from: f */
    public Pattern f31564f;

    /* renamed from: h */
    private final List<AbstractC11742b> f31565h;

    /* renamed from: i */
    private AbstractC11746f f31566i;

    /* renamed from: j */
    private boolean f31567j;

    /* renamed from: k */
    private boolean f31568k;

    /* renamed from: l */
    private boolean f31569l;

    /* renamed from: m */
    private CharSequence f31570m;

    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$b */
    public interface AbstractC11742b {
        /* renamed from: a */
        void mo44959a(boolean z);
    }

    public int getMaxLines() {
        return this.f31561b;
    }

    /* renamed from: a */
    public boolean mo44947a() {
        if (this.f31561b == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$f */
    public abstract class AbstractC11746f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract CharSequence mo44957a(CharSequence charSequence);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo44960a() {
            if (!EllipsizingTextView.this.mo44947a()) {
                return EllipsizingTextView.this.f31561b;
            }
            int b = mo44961b();
            if (b == -1) {
                return 1;
            }
            return b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo44961b() {
            return ((EllipsizingTextView.this.getHeight() - EllipsizingTextView.this.getCompoundPaddingTop()) - EllipsizingTextView.this.getCompoundPaddingBottom()) / mo44964e("").getLineBottom(0);
        }

        private AbstractC11746f() {
        }

        /* renamed from: c */
        public CharSequence mo44962c(CharSequence charSequence) {
            if (!mo44963d(charSequence)) {
                return mo44957a(charSequence);
            }
            return charSequence;
        }

        /* renamed from: d */
        public boolean mo44963d(CharSequence charSequence) {
            if (mo44964e(charSequence).getLineCount() <= mo44960a()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Layout mo44964e(CharSequence charSequence) {
            return new StaticLayout(charSequence, EllipsizingTextView.this.getPaint(), (EllipsizingTextView.this.getMeasuredWidth() - EllipsizingTextView.this.getPaddingLeft()) - EllipsizingTextView.this.getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, EllipsizingTextView.this.f31562c, EllipsizingTextView.this.f31563e, false);
        }

        /* synthetic */ AbstractC11746f(EllipsizingTextView ellipsizingTextView, C117401 r2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$1 */
    public static /* synthetic */ class C117401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f31571a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.text.TextUtils$TruncateAt[] r0 = android.text.TextUtils.TruncateAt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.C117401.f31571a = r0
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.C117401.f31571a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.C117401.f31571a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.C117401.f31571a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.C117401.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m48687b() {
        boolean z;
        int maxLines = getMaxLines();
        CharSequence charSequence = this.f31570m;
        if (maxLines != -1) {
            if (this.f31566i == null) {
                setEllipsize(null);
            }
            charSequence = this.f31566i.mo44962c(this.f31570m);
            z = !this.f31566i.mo44963d(this.f31570m);
        } else {
            z = false;
        }
        if (!charSequence.equals(getText())) {
            this.f31569l = true;
            try {
                setText(charSequence);
            } finally {
                this.f31569l = false;
            }
        }
        this.f31568k = false;
        if (z != this.f31567j) {
            this.f31567j = z;
            for (AbstractC11742b bVar : this.f31565h) {
                bVar.mo44959a(z);
            }
        }
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.f31564f = pattern;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$a */
    public class C11741a extends AbstractC11746f {
        private C11741a() {
            super(EllipsizingTextView.this, null);
        }

        /* renamed from: b */
        public String mo44958b(CharSequence charSequence) {
            return EllipsizingTextView.this.f31564f.matcher(charSequence).replaceFirst("");
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.AbstractC11746f
        /* renamed from: a */
        public CharSequence mo44957a(CharSequence charSequence) {
            int lineEnd = mo44964e(charSequence).getLineEnd(EllipsizingTextView.this.f31561b - 1);
            int length = charSequence.length();
            int i = length - lineEnd;
            if (i < EllipsizingTextView.f31559a.length()) {
                i = EllipsizingTextView.f31559a.length();
            }
            String trim = TextUtils.substring(charSequence, 0, length - i).trim();
            String b = mo44958b(trim);
            while (true) {
                if (mo44963d(b + ((Object) EllipsizingTextView.f31559a)) || trim.lastIndexOf(32) == -1) {
                    String str = b + ((Object) EllipsizingTextView.f31559a);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    trim = trim.substring(0, trim.length() - 1).trim();
                    b = mo44958b(trim);
                }
            }
            String str2 = b + ((Object) EllipsizingTextView.f31559a);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            if (charSequence instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned) charSequence, 0, str2.length(), null, spannableStringBuilder2, 0);
            }
            return spannableStringBuilder2;
        }

        /* synthetic */ C11741a(EllipsizingTextView ellipsizingTextView, C117401 r2) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$c */
    public class C11743c extends AbstractC11746f {
        private C11743c() {
            super(EllipsizingTextView.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.AbstractC11746f
        /* renamed from: a */
        public CharSequence mo44957a(CharSequence charSequence) {
            SpannableStringBuilder spannableStringBuilder;
            int lineEnd = mo44964e(charSequence).getLineEnd(EllipsizingTextView.this.f31561b - 1);
            int length = charSequence.length();
            int i = length - lineEnd;
            if (i < EllipsizingTextView.f31559a.length()) {
                i = EllipsizingTextView.f31559a.length();
            }
            int i2 = i + (lineEnd % 2);
            int i3 = length / 2;
            int i4 = i2 / 2;
            String trim = TextUtils.substring(charSequence, 0, i3 - i4).trim();
            String trim2 = TextUtils.substring(charSequence, i3 + i4, length).trim();
            while (true) {
                if (mo44963d(trim + ((Object) EllipsizingTextView.f31559a) + trim2)) {
                    break;
                }
                int lastIndexOf = trim.lastIndexOf(32);
                int indexOf = trim2.indexOf(32);
                if (lastIndexOf == -1 || indexOf == -1) {
                    break;
                }
                trim = trim.substring(0, lastIndexOf).trim();
                trim2 = trim2.substring(indexOf, trim2.length()).trim();
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(trim);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(trim2);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                TextUtils.copySpansFrom(spanned, 0, trim.length(), null, spannableStringBuilder2, 0);
                spannableStringBuilder = spannableStringBuilder3;
                TextUtils.copySpansFrom(spanned, length - trim2.length(), length, null, spannableStringBuilder3, 0);
            } else {
                spannableStringBuilder = spannableStringBuilder3;
            }
            return TextUtils.concat(spannableStringBuilder2, EllipsizingTextView.f31559a, spannableStringBuilder);
        }

        /* synthetic */ C11743c(EllipsizingTextView ellipsizingTextView, C117401 r2) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$d */
    public class C11744d extends AbstractC11746f {
        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.AbstractC11746f
        /* renamed from: a */
        public CharSequence mo44957a(CharSequence charSequence) {
            return charSequence;
        }

        private C11744d() {
            super(EllipsizingTextView.this, null);
        }

        /* synthetic */ C11744d(EllipsizingTextView ellipsizingTextView, C117401 r2) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView$e */
    public class C11745e extends AbstractC11746f {
        private C11745e() {
            super(EllipsizingTextView.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView.AbstractC11746f
        /* renamed from: a */
        public CharSequence mo44957a(CharSequence charSequence) {
            int indexOf;
            int lineEnd = mo44964e(charSequence).getLineEnd(EllipsizingTextView.this.f31561b - 1);
            int length = charSequence.length();
            int i = length - lineEnd;
            if (i < EllipsizingTextView.f31559a.length()) {
                i = EllipsizingTextView.f31559a.length();
            }
            String trim = TextUtils.substring(charSequence, i, length).trim();
            while (true) {
                if (mo44963d(((Object) EllipsizingTextView.f31559a) + trim) || (indexOf = trim.indexOf(32)) == -1) {
                    String str = ((Object) EllipsizingTextView.f31559a) + trim;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    trim = trim.substring(indexOf, trim.length()).trim();
                }
            }
            String str2 = ((Object) EllipsizingTextView.f31559a) + trim;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            if (charSequence instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned) charSequence, length - str2.length(), length, null, spannableStringBuilder2, 0);
            }
            return spannableStringBuilder2;
        }

        /* synthetic */ C11745e(EllipsizingTextView ellipsizingTextView, C117401 r2) {
            this();
        }
    }

    public EllipsizingTextView(Context context) {
        this(context, null);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f31561b = i;
        this.f31568k = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f31568k && getLayout().getLineCount() > getMaxLines()) {
            m48687b();
        }
        super.onDraw(canvas);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            this.f31566i = new C11744d(this, null);
            return;
        }
        int i = C117401.f31571a[truncateAt.ordinal()];
        if (i == 1) {
            this.f31566i = new C11741a(this, null);
        } else if (i == 2) {
            this.f31566i = new C11745e(this, null);
        } else if (i != 3) {
            if (i == 4) {
                super.setEllipsize(truncateAt);
                this.f31568k = false;
            }
            this.f31566i = new C11744d(this, null);
        } else {
            this.f31566i = new C11743c(this, null);
        }
    }

    public void setLineSpacing(float f, float f2) {
        this.f31563e = f;
        this.f31562c = f2;
        super.setLineSpacing(f, f2);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.f31569l) {
            this.f31570m = charSequence;
            this.f31568k = true;
        }
        super.setText(charSequence, bufferType);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31565h = new ArrayList();
        this.f31562c = 1.0f;
        this.f31563e = BitmapDescriptorFactory.HUE_RED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091}, i, 0);
        setMaxLines(obtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(f31560g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (mo44947a()) {
            this.f31568k = true;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (mo44947a()) {
            this.f31568k = true;
        }
    }
}
