package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.e */
public class C11201e extends C10463c implements AbstractC11204h {

    /* renamed from: d */
    private final C11205i f30125d;

    /* renamed from: e */
    private MentionSegment f30126e;

    /* renamed from: b */
    public MentionSegment mo42803h() {
        return this.f30126e;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11204h
    /* renamed from: a */
    public SegmentStyle mo42792a() {
        return this.f30126e.getStyle();
    }

    /* renamed from: d */
    public C11201e clone() throws CloneNotSupportedException {
        C11201e eVar = (C11201e) super.clone();
        MentionSegment mentionSegment = this.f30126e;
        if (mentionSegment != null) {
            eVar.f30126e = mentionSegment.clone();
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo42806a(MentionSegment mentionSegment) {
        this.f30126e = mentionSegment;
        this.f30125d.mo42821a(mentionSegment);
    }

    /* renamed from: a */
    public void mo42807a(SegmentStyle segmentStyle) {
        this.f30125d.mo42794a(segmentStyle);
    }

    @Override // com.bytedance.ee.bear.p519p.C10463c
    public void updateDrawState(TextPaint textPaint) {
        this.f30125d.updateDrawState(textPaint);
        textPaint.setColor(this.f28133c.getResources().getColor(R.color.space_kit_b500));
    }

    public C11201e(Context context, String str, int i, String str2, int i2, String str3, String str4) {
        super(context, str, i, str2, i2, str3, str4);
        this.f30125d = new C11205i(context);
    }

    public C11201e(Context context, String str, int i, String str2, int i2, String str3, String str4, AbstractC10460a.AbstractC10461a aVar) {
        super(context, str, i, str2, i2, str3, str4, aVar);
        this.f30125d = new C11205i(context);
    }
}
