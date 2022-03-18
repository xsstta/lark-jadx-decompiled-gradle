package com.bytedance.ee.bear.p519p;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.p.d */
public class C10464d extends ClickableSpan implements AbstractC10466g {

    /* renamed from: a */
    private Context f28141a;

    /* renamed from: b */
    private String f28142b;

    /* renamed from: c */
    private String f28143c;

    /* renamed from: d */
    private int f28144d = -1;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: o */
    public /* synthetic */ int mo39738o() {
        return AbstractC10466g.CC.$default$o(this);
    }

    public void onClick(View view) {
    }

    /* renamed from: a */
    public String mo39757a() {
        return this.f28142b;
    }

    /* renamed from: b */
    public String mo39758b() {
        return this.f28143c;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.f28144d;
        if (i == -1) {
            i = this.f28141a.getResources().getColor(R.color.space_kit_b500);
        }
        textPaint.setColor(i);
    }

    public C10464d(Context context, String str, String str2) {
        this.f28141a = context;
        this.f28142b = str;
        this.f28143c = str2;
    }
}
