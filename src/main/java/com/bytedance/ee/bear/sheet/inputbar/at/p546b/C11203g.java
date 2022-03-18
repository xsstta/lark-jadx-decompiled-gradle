package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.g */
public class C11203g extends C10468i implements AbstractC11204h {

    /* renamed from: d */
    private final C11205i f30130d;

    /* renamed from: e */
    private MentionSegment f30131e;

    /* renamed from: b */
    public MentionSegment mo42803h() {
        return this.f30131e;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11204h
    /* renamed from: a */
    public SegmentStyle mo42792a() {
        return this.f30131e.getStyle();
    }

    /* renamed from: d */
    public C11203g clone() throws CloneNotSupportedException {
        C11203g gVar = (C11203g) super.clone();
        MentionSegment mentionSegment = this.f30131e;
        if (mentionSegment != null) {
            gVar.f30131e = mentionSegment.clone();
        }
        return gVar;
    }

    /* renamed from: a */
    public void mo42816a(MentionSegment mentionSegment) {
        this.f30131e = mentionSegment;
        this.f30130d.mo42821a(mentionSegment);
    }

    /* renamed from: a */
    public void mo42817a(SegmentStyle segmentStyle) {
        this.f30130d.mo42794a(segmentStyle);
    }

    @Override // com.bytedance.ee.bear.p519p.C10468i
    public void updateDrawState(TextPaint textPaint) {
        this.f30130d.updateDrawState(textPaint);
        textPaint.setColor(this.f28156c.getResources().getColor(R.color.space_kit_b500));
    }

    public C11203g(Context context, String str, String str2, String str3, String str4, boolean z) {
        super(context, str, str2, str3, str4, z);
        this.f30130d = new C11205i(context);
    }

    public C11203g(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, AbstractC10460a.AbstractC10461a aVar) {
        super(context, str, str2, str3, str4, z, str5, z2, aVar);
        this.f30130d = new C11205i(context);
    }
}
