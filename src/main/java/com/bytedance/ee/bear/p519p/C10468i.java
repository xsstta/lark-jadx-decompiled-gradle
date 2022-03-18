package com.bytedance.ee.bear.p519p;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.p.i */
public class C10468i extends AbstractC10460a implements AbstractC10466g {

    /* renamed from: c */
    protected Context f28156c;

    /* renamed from: d */
    private String f28157d;

    /* renamed from: e */
    private String f28158e;

    /* renamed from: f */
    private String f28159f;

    /* renamed from: g */
    private String f28160g;

    /* renamed from: h */
    private boolean f28161h;

    /* renamed from: i */
    private String f28162i;

    /* renamed from: j */
    private boolean f28163j;

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
    public String mo39767g() {
        return this.f28157d;
    }

    /* renamed from: i */
    public String mo39768i() {
        return this.f28158e;
    }

    /* renamed from: j */
    public String mo39769j() {
        return this.f28159f;
    }

    /* renamed from: k */
    public String mo39770k() {
        return this.f28160g;
    }

    /* renamed from: l */
    public boolean mo39771l() {
        return this.f28161h;
    }

    /* renamed from: m */
    public String mo39772m() {
        return this.f28162i;
    }

    /* renamed from: n */
    public boolean mo39773n() {
        return this.f28163j;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10460a
    public void onClick(View view) {
        super.onClick(view);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.f28126b != -1) {
            i = this.f28126b;
        } else {
            i = this.f28156c.getResources().getColor(R.color.primary_pri_500);
        }
        textPaint.setColor(i);
    }

    public C10468i(Context context, String str, String str2, String str3, String str4, boolean z) {
        this(context, str, str2, str3, str4, false, null, z, null);
    }

    public C10468i(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, AbstractC10460a.AbstractC10461a aVar) {
        this.f28156c = context;
        this.f28157d = str;
        this.f28158e = str2;
        this.f28159f = str3;
        this.f28160g = str4;
        this.f28161h = z;
        this.f28162i = str5;
        this.f28163j = z2;
        mo39737a(aVar);
    }
}
