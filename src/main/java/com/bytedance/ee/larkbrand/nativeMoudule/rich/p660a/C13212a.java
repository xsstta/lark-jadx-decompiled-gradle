package com.bytedance.ee.larkbrand.nativeMoudule.rich.p660a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.a.a */
public class C13212a extends ReplacementSpan {

    /* renamed from: a */
    private String f35014a;

    /* renamed from: b */
    private String f35015b;

    /* renamed from: c */
    private Context f35016c;

    /* renamed from: d */
    private String f35017d;

    /* renamed from: e */
    private int f35018e;

    /* renamed from: a */
    public String mo49328a() {
        return this.f35015b;
    }

    /* renamed from: b */
    public String mo49329b() {
        return this.f35014a;
    }

    /* renamed from: c */
    public String mo49330c() {
        return this.f35017d;
    }

    /* renamed from: a */
    private int m53904a(String str) {
        try {
            if (str.startsWith("0x") && str.length() > 2) {
                str = str.substring(2);
            } else if (str.startsWith("#") && str.length() > 1) {
                str = str.substring(1);
            }
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException e) {
            AppBrandLogger.eWithThrowable("AtTagSpan", "number parse error", e);
            return -13203713;
        }
    }

    public C13212a(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, null);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f35015b);
    }

    public C13212a(Context context, String str, String str2, String str3, String str4) {
        this.f35014a = str2;
        this.f35015b = str;
        this.f35016c = context;
        this.f35017d = str3;
        if (TextUtils.isEmpty(str4)) {
            this.f35018e = -13203713;
        } else {
            this.f35018e = m53904a(str4);
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setColor(this.f35018e);
        canvas.drawText(this.f35015b, f, (float) i4, paint);
    }
}
