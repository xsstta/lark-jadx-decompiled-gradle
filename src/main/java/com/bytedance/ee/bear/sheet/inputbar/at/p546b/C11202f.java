package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.HyperLinkSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.f */
public class C11202f extends HyperLinkSpan implements AbstractC11204h {

    /* renamed from: d */
    private final C11205i f30127d;

    /* renamed from: e */
    private final Context f30128e;

    /* renamed from: f */
    private HyperLinkSegment f30129f;

    /* renamed from: b */
    public HyperLinkSegment mo42803h() {
        return this.f30129f;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11204h
    /* renamed from: a */
    public SegmentStyle mo42792a() {
        return this.f30129f.getStyle();
    }

    /* renamed from: d */
    public C11202f clone() throws CloneNotSupportedException {
        C11202f fVar = (C11202f) super.clone();
        HyperLinkSegment hyperLinkSegment = this.f30129f;
        if (hyperLinkSegment != null) {
            fVar.f30129f = hyperLinkSegment.clone();
        }
        return fVar;
    }

    /* renamed from: a */
    public void mo42811a(HyperLinkSegment hyperLinkSegment) {
        this.f30129f = hyperLinkSegment;
        this.f30127d.mo42821a(hyperLinkSegment);
    }

    /* renamed from: a */
    public void mo42812a(SegmentStyle segmentStyle) {
        this.f30127d.mo42794a(segmentStyle);
    }

    @Override // com.bytedance.ee.bear.span.HyperLinkSpan
    public void updateDrawState(TextPaint textPaint) {
        this.f30127d.updateDrawState(textPaint);
        textPaint.setColor(this.f30128e.getResources().getColor(R.color.space_kit_b500));
    }

    public C11202f(Context context, String str, AbstractC10460a.AbstractC10461a aVar) {
        super(context, str, aVar);
        this.f30128e = context;
        this.f30127d = new C11205i(context);
    }
}
