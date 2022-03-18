package com.bytedance.ee.bear.sheet.inputbar.at.p545a;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11198b;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11199c;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11201e;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11202f;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11203g;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11206j;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.AttachmentSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.EmbedImageSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.HyperLinkSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.PanoSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextSegment;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.a.c */
public class C11192c extends C7836h<C11190a> {

    /* renamed from: d */
    private SegmentStyle f30113d;

    /* renamed from: a */
    public void mo42781a(SegmentStyle segmentStyle) {
        this.f30113d = segmentStyle;
    }

    /* renamed from: a */
    public C7835g apply(C11190a aVar) throws Exception {
        C7835g a = super.apply((C7827a) aVar);
        SpannableStringBuilder spannableStringBuilder = a.f21147a;
        int i = 0;
        int i2 = 0;
        for (BaseSegment baseSegment : aVar.mo42775b()) {
            int[] a2 = m46508a(i, i2, baseSegment.getText());
            int i3 = a2[0];
            int i4 = a2[1];
            if (!(baseSegment instanceof EmbedImageSegment)) {
                if (baseSegment instanceof TextLikeSegment) {
                    m46506a(i3, i3, (TextLikeSegment) baseSegment, spannableStringBuilder);
                } else if (baseSegment instanceof AttachmentSegment) {
                    C10462b bVar = new C10462b(this.f21148a, R.drawable.ic_icon_attachment_outlined);
                    spannableStringBuilder.insert(i3, "<doc.at.~#_%=`>");
                    spannableStringBuilder.setSpan(bVar, i3, i3 + 15, bVar.mo39738o());
                    i4 += 15;
                    C11198b bVar2 = new C11198b(this.f21148a, (AttachmentSegment) baseSegment);
                    bVar2.mo42794a(this.f30113d);
                    spannableStringBuilder.setSpan(bVar2, i3, i4, bVar2.mo39738o());
                } else if (baseSegment instanceof MentionSegment) {
                    if (((MentionSegment) baseSegment).isMentionDocument()) {
                        i4 += 15;
                    }
                } else if (baseSegment instanceof TextSegment) {
                    m46507a(spannableStringBuilder, (TextSegment) baseSegment, i3, i4);
                } else if (baseSegment instanceof PanoSegment) {
                    C11199c cVar = new C11199c(this.f21148a, (PanoSegment) baseSegment);
                    cVar.mo42794a(this.f30113d);
                    spannableStringBuilder.setSpan(cVar, i3, i4, cVar.mo39738o());
                }
            }
            i2 = i4;
            i = i3;
        }
        return a;
    }

    public C11192c(TextView textView, SegmentStyle segmentStyle) {
        super(textView);
        this.f30113d = segmentStyle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10463c mo30620b(C11190a aVar, C4517a aVar2) {
        BaseSegment baseSegment = aVar.mo42776c().get(aVar2);
        if (!(baseSegment instanceof MentionSegment)) {
            return super.mo30620b((C7827a) aVar, aVar2);
        }
        C11201e eVar = new C11201e(this.f21148a, aVar2.f13215d, aVar2.f13214c, aVar2.f13216e, aVar2.f13224m, aVar2.f13223l, aVar2.f13222k, this.f21149b);
        eVar.mo42807a(this.f30113d);
        eVar.mo42806a((MentionSegment) baseSegment);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HyperLinkSpan mo30617a(C11190a aVar, C7838i iVar) {
        BaseSegment baseSegment = aVar.mo42776c().get(iVar);
        if (!(baseSegment instanceof HyperLinkSegment)) {
            return super.mo30617a((C7827a) aVar, iVar);
        }
        C11202f fVar = new C11202f(this.f21148a, iVar.f21157d, this.f21149b);
        fVar.mo42812a(this.f30113d);
        fVar.mo42811a((HyperLinkSegment) baseSegment);
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10468i mo30618a(C11190a aVar, C4517a aVar2) {
        BaseSegment baseSegment = aVar.mo42776c().get(aVar2);
        if (!(baseSegment instanceof MentionSegment)) {
            return super.mo30618a((C7827a) aVar, aVar2);
        }
        C11203g gVar = new C11203g(this.f21148a, aVar2.f13215d, null, aVar2.f13218g, aVar2.f13219h, aVar2.f13225n, aVar2.f13226o, aVar2.f13228q, this.f21149b);
        gVar.mo42817a(this.f30113d);
        gVar.mo42816a((MentionSegment) baseSegment);
        return gVar;
    }

    /* renamed from: a */
    private int[] m46508a(int i, int i2, String str) {
        if (str != null) {
            i2 = str.length() + i2;
            i = i2;
        }
        return new int[]{i, i2};
    }

    /* renamed from: a */
    private void m46507a(SpannableStringBuilder spannableStringBuilder, TextSegment textSegment, int i, int i2) {
        C11206j jVar = new C11206j(this.f21148a, textSegment);
        jVar.mo42794a(this.f30113d);
        spannableStringBuilder.setSpan(jVar, i, i2, jVar.mo39738o());
    }

    /* renamed from: a */
    private void m46506a(int i, int i2, TextLikeSegment textLikeSegment, SpannableStringBuilder spannableStringBuilder) {
        List<TextSegment> texts = textLikeSegment.getTexts();
        if (texts != null) {
            for (TextSegment textSegment : texts) {
                int[] a = m46508a(i, i2, textSegment.getText());
                int i3 = a[0];
                int i4 = a[1];
                m46507a(spannableStringBuilder, textSegment, i3, i4);
                textSegment.setTextLikeSegment(textLikeSegment);
                i2 = i4;
                i = i3;
            }
        }
    }
}
