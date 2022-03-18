package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.PanoSegment;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.c */
public class C11199c extends AbstractC11197a {

    /* renamed from: a */
    private final Context f30123a;

    /* renamed from: b */
    private PanoSegment f30124b;

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

    /* renamed from: d */
    public PanoSegment mo42803h() {
        return this.f30124b;
    }

    /* renamed from: g */
    public C11199c clone() throws CloneNotSupportedException {
        C11199c cVar = (C11199c) super.clone();
        PanoSegment panoSegment = this.f30124b;
        if (panoSegment != null) {
            cVar.f30124b = panoSegment.clone();
        }
        return cVar;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11197a
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f30123a.getResources().getColor(R.color.space_kit_b500));
    }

    public C11199c(Context context, PanoSegment panoSegment) {
        super(context);
        this.f30123a = context;
        this.f30124b = panoSegment;
    }
}
