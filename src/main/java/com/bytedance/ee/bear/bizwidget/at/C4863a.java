package com.bytedance.ee.bear.bizwidget.at;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bizwidget.at.a */
public class C4863a extends ClickableSpan {

    /* renamed from: a */
    private final Context f14276a;

    /* renamed from: b */
    private final String f14277b;

    /* renamed from: c */
    private final String f14278c;

    /* renamed from: d */
    private AbstractC4864a f14279d;

    /* renamed from: com.bytedance.ee.bear.bizwidget.at.a$a */
    public interface AbstractC4864a {
        void onClick(View view, String str);
    }

    /* renamed from: a */
    public String mo19036a() {
        return this.f14278c;
    }

    public void onClick(View view) {
        AbstractC4864a aVar = this.f14279d;
        if (aVar != null) {
            aVar.onClick(view, this.f14277b);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f14276a.getResources().getColor(R.color.space_kit_b500));
        textPaint.clearShadowLayer();
    }

    public C4863a(Context context, String str, String str2, AbstractC4864a aVar) {
        this.f14276a = context;
        this.f14277b = str;
        this.f14278c = str2;
        this.f14279d = aVar;
    }
}
