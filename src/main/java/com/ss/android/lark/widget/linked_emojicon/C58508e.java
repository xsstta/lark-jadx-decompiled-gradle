package com.ss.android.lark.widget.linked_emojicon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.e */
public class C58508e extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: a */
    private static final int f144374a = UIHelper.dp2px(10.0f);

    /* renamed from: m */
    private static Paint f144375m = new Paint();

    /* renamed from: b */
    private Context f144376b;

    /* renamed from: c */
    private String f144377c;

    /* renamed from: d */
    private Bitmap f144378d;

    /* renamed from: e */
    private Drawable f144379e;

    /* renamed from: f */
    private int f144380f;

    /* renamed from: g */
    private int f144381g;

    /* renamed from: h */
    private C58511b f144382h;

    /* renamed from: i */
    private int f144383i;

    /* renamed from: j */
    private int f144384j;

    /* renamed from: k */
    private boolean[] f144385k;

    /* renamed from: l */
    private float f144386l;

    /* renamed from: b */
    public C58511b mo198323b() {
        return this.f144382h;
    }

    /* renamed from: d */
    public String mo198326d() {
        return this.f144377c;
    }

    /* renamed from: e */
    public Drawable mo198328e() {
        return this.f144379e;
    }

    /* renamed from: f */
    public Bitmap mo198330f() {
        return this.f144378d;
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.e$b */
    public static class C58511b {

        /* renamed from: a */
        public final int f144396a;

        /* renamed from: b */
        public final CharSequence f144397b;

        /* renamed from: c */
        public final int f144398c;

        /* renamed from: d */
        private boolean f144399d;

        /* renamed from: a */
        public boolean mo198341a() {
            return this.f144399d;
        }

        /* renamed from: a */
        public void mo198340a(boolean z) {
            this.f144399d = z;
        }

        public C58511b(CharSequence charSequence) {
            this(0, charSequence);
        }

        public C58511b(int i, CharSequence charSequence) {
            this.f144399d = true;
            this.f144396a = i;
            this.f144397b = charSequence;
            if (charSequence != null) {
                this.f144398c = charSequence.length();
            } else {
                this.f144398c = 0;
            }
        }
    }

    /* renamed from: c */
    public CharSequence mo198324c() {
        return this.f144382h.f144397b;
    }

    /* renamed from: a */
    public C58508e mo198320a() {
        return new C58508e(this.f144376b, this.f144382h, this.f144377c, this.f144378d, this.f144379e, this.f144380f, this.f144384j, this.f144383i, this.f144385k);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.e$a */
    public static class C58510a {

        /* renamed from: a */
        private Context f144387a;

        /* renamed from: b */
        private C58511b f144388b;

        /* renamed from: c */
        private String f144389c;

        /* renamed from: d */
        private Bitmap f144390d;

        /* renamed from: e */
        private int f144391e = -1;

        /* renamed from: f */
        private int f144392f = this.f144387a.getResources().getColor(R.color.text_link_hover);

        /* renamed from: g */
        private int f144393g = this.f144387a.getResources().getColor(R.color.text_link_hover);

        /* renamed from: h */
        private boolean[] f144394h;

        /* renamed from: i */
        private Drawable f144395i;

        /* renamed from: a */
        public C58508e mo198337a() {
            return new C58508e(this.f144387a, this.f144388b, this.f144389c, this.f144390d, this.f144395i, this.f144391e, this.f144393g, this.f144392f, this.f144394h);
        }

        /* renamed from: a */
        public C58510a mo198334a(Bitmap bitmap) {
            this.f144390d = bitmap;
            return this;
        }

        /* renamed from: b */
        public C58510a mo198338b(int i) {
            this.f144391e = i;
            return this;
        }

        /* renamed from: c */
        public C58510a mo198339c(int i) {
            this.f144392f = i;
            return this;
        }

        /* renamed from: a */
        public C58510a mo198335a(Drawable drawable) {
            this.f144395i = drawable;
            return this;
        }

        /* renamed from: a */
        public C58510a mo198333a(int i) {
            if (i != 0) {
                this.f144390d = C57820d.m224428a(this.f144387a, i);
            }
            return this;
        }

        /* renamed from: a */
        public C58510a mo198336a(String str) {
            if (this.f144394h != null) {
                Log.m165383e("IconTitleSpan", "can not set displayName after setHighLightText");
                this.f144394h = null;
            }
            this.f144389c = str;
            return this;
        }

        public C58510a(Context context, C58511b bVar) {
            this.f144387a = context;
            this.f144388b = bVar;
            this.f144389c = bVar.f144397b.toString();
        }
    }

    public int hashCode() {
        return (Objects.hash(this.f144377c, this.f144378d, this.f144379e, Integer.valueOf(this.f144380f), Integer.valueOf(this.f144381g), this.f144382h, Integer.valueOf(this.f144383i), Integer.valueOf(this.f144384j)) * 31) + Arrays.hashCode(this.f144385k);
    }

    /* renamed from: a */
    public void mo198321a(Bitmap bitmap) {
        this.f144378d = bitmap;
    }

    /* renamed from: a */
    public void mo198322a(Drawable.Callback callback) {
        Drawable drawable = this.f144379e;
        if (drawable != null) {
            drawable.setCallback(callback);
        }
    }

    /* renamed from: a */
    private int m226982a(Paint.FontMetricsInt fontMetricsInt) {
        int i = fontMetricsInt.bottom - fontMetricsInt.top;
        float f = this.f144386l;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        f144375m.setTextSize(f);
        Paint.FontMetrics fontMetrics = f144375m.getFontMetrics();
        if (((float) i) > (fontMetrics.bottom - fontMetrics.top) + ((float) f144374a)) {
            Log.m165389i("IconTitleSpan", "targetFM is, top:" + fontMetrics.top + ", bottom:" + fontMetrics.bottom);
            return (int) Math.ceil((double) (fontMetrics.bottom - fontMetrics.top));
        }
        Log.m165389i("IconTitleSpan", "No need adjust, current fm is:" + fontMetricsInt);
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58508e)) {
            return false;
        }
        C58508e eVar = (C58508e) obj;
        if (this.f144380f != eVar.f144380f || this.f144381g != eVar.f144381g || this.f144383i != eVar.f144383i || this.f144384j != eVar.f144384j || !Objects.equals(this.f144377c, eVar.f144377c) || !Objects.equals(this.f144378d, eVar.f144378d) || !Objects.equals(this.f144379e, eVar.f144379e) || !Objects.equals(this.f144382h, eVar.f144382h) || !Arrays.equals(this.f144385k, eVar.f144385k)) {
            return false;
        }
        return true;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f144386l = paint.getTextSize();
        if (this.f144378d == null && this.f144379e == null) {
            return (int) paint.measureText(this.f144377c);
        }
        if (this.f144380f == -1) {
            this.f144380f = (int) paint.getTextSize();
        }
        if (TextUtils.isEmpty(this.f144377c)) {
            int i3 = this.f144381g;
            return this.f144380f + i3 + i3;
        }
        int i4 = this.f144381g;
        return this.f144380f + i4 + i4 + ((int) paint.measureText(this.f144377c)) + this.f144381g;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.bottom - fontMetricsInt.top;
        int a = m226982a(fontMetricsInt);
        if (i5 > a) {
            Log.m165389i("IconTitleSpan", "Current fm is:" + fontMetricsInt + ", targetHeight is:" + a);
            int i6 = fontMetricsInt.bottom - a;
            fontMetricsInt.ascent = i6;
            fontMetricsInt.top = i6;
            Log.m165389i("IconTitleSpan", "fm after adjust is:" + fontMetricsInt);
        }
    }

    private C58508e(Context context, C58511b bVar, String str, Bitmap bitmap, Drawable drawable, int i, int i2, int i3, boolean[] zArr) {
        this.f144376b = context;
        this.f144382h = bVar;
        this.f144377c = str;
        this.f144378d = bitmap;
        this.f144379e = drawable;
        this.f144380f = i;
        this.f144384j = i2;
        this.f144383i = i3;
        this.f144385k = zArr;
        if (bitmap != null || drawable != null) {
            this.f144381g = UIUtils.dp2px(context, 3.0f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.linked_emojicon.C58508e.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
