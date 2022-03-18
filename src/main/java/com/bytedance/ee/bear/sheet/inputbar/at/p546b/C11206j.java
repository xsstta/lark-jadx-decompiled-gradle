package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextSegment;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.j */
public class C11206j extends AbstractC11197a {

    /* renamed from: a */
    private TextSegment f30133a;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return true;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return true;
    }

    /* renamed from: d */
    public TextSegment mo42803h() {
        return this.f30133a;
    }

    /* renamed from: g */
    public C11206j clone() throws CloneNotSupportedException {
        C11206j jVar = (C11206j) super.clone();
        TextSegment textSegment = this.f30133a;
        if (textSegment != null) {
            jVar.f30133a = textSegment.clone();
        }
        return jVar;
    }

    public C11206j(Context context, TextSegment textSegment) {
        super(context);
        this.f30133a = textSegment;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11197a
    /* renamed from: c */
    public void mo42798c(TextPaint textPaint, SegmentStyle segmentStyle) {
        if (this.f30133a.getTextLikeSegment() == null) {
            super.mo42798c(textPaint, segmentStyle);
        }
    }
}
