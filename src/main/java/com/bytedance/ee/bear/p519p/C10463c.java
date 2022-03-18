package com.bytedance.ee.bear.p519p;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.p.c */
public class C10463c extends AbstractC10460a implements AbstractC10466g {

    /* renamed from: c */
    protected Context f28133c;

    /* renamed from: d */
    private String f28134d;

    /* renamed from: e */
    private String f28135e;

    /* renamed from: f */
    private int f28136f;

    /* renamed from: g */
    private String f28137g;

    /* renamed from: h */
    private String f28138h;

    /* renamed from: i */
    private int f28139i;

    /* renamed from: j */
    private boolean f28140j;

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

    /* renamed from: g */
    public String mo39749g() {
        return this.f28135e;
    }

    /* renamed from: i */
    public String mo39750i() {
        return this.f28134d;
    }

    /* renamed from: j */
    public int mo39751j() {
        return this.f28136f;
    }

    /* renamed from: k */
    public String mo39752k() {
        return this.f28137g;
    }

    /* renamed from: l */
    public String mo39753l() {
        return this.f28138h;
    }

    /* renamed from: m */
    public int mo39754m() {
        return this.f28139i;
    }

    /* renamed from: n */
    public boolean mo39755n() {
        return this.f28140j;
    }

    /* renamed from: a */
    public void mo39748a(boolean z) {
        this.f28140j = z;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int color = this.f28133c.getResources().getColor(R.color.space_kit_b500);
        if (this.f28126b != -1) {
            color = this.f28126b;
        } else if (mo39755n()) {
            color = this.f28133c.getResources().getColor(R.color.space_kit_n400);
        }
        textPaint.setColor(color);
    }

    public C10463c(Context context, String str, int i, String str2, int i2, String str3, String str4) {
        this(context, str, i, str2, i2, str3, str4, null);
    }

    public C10463c(Context context, String str, int i, String str2, int i2, String str3, String str4, AbstractC10460a.AbstractC10461a aVar) {
        this.f28133c = context;
        this.f28134d = str;
        this.f28136f = i;
        this.f28135e = str2;
        this.f28139i = i2;
        this.f28138h = str3;
        this.f28137g = str4;
        mo39737a(aVar);
    }
}
