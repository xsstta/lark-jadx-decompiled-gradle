package com.bytedance.ee.bear.sheet.inputbar.at.p545a;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p526r.C10606e;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11200d;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11206j;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.HyperLinkSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextSegment;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.a.d */
public class C11193d implements Function<C7835g, List<BaseSegment>> {

    /* renamed from: a */
    private final C10606e f30114a = new C10606e();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.a.d$a */
    public static class C11194a implements Comparator<AbstractC11200d> {

        /* renamed from: a */
        private final SpannableStringBuilder f30115a;

        public C11194a(SpannableStringBuilder spannableStringBuilder) {
            this.f30115a = spannableStringBuilder;
        }

        /* renamed from: a */
        public int compare(AbstractC11200d dVar, AbstractC11200d dVar2) {
            int spanStart = this.f30115a.getSpanStart(dVar);
            int spanStart2 = this.f30115a.getSpanStart(dVar2);
            if (spanStart != spanStart2) {
                return spanStart - spanStart2;
            }
            if (dVar instanceof HyperLinkSpan) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: a */
    private void m46519a(HyperLinkSegment hyperLinkSegment) {
        String text = hyperLinkSegment.getText();
        if (this.f30114a.mo40085a(text)) {
            Uri parse = Uri.parse(hyperLinkSegment.getLink());
            if (Uri.parse(text).getScheme() != null) {
                hyperLinkSegment.setLink(text);
            } else {
                hyperLinkSegment.setLink(parse.getScheme() + "://" + text);
            }
        }
        C13479a.m54772d("SheetUnFormatFun", "handleHyperLinkSegment: link = " + hyperLinkSegment.getLink());
    }

    /* renamed from: a */
    public List<BaseSegment> apply(C7835g gVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.f21147a);
        C10462b[] bVarArr = (C10462b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10462b.class);
        for (C10462b bVar : bVarArr) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(bVar), spannableStringBuilder.getSpanEnd(bVar));
        }
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList((AbstractC11200d[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AbstractC11200d.class));
        Collections.sort(asList, new C11194a(spannableStringBuilder));
        ListIterator<AbstractC11200d> listIterator = asList.listIterator();
        while (listIterator.hasNext()) {
            AbstractC11200d next = listIterator.next();
            BaseSegment h = next.mo42803h();
            m46518a(spannableStringBuilder, next, h);
            if (h instanceof TextLikeSegment) {
                m46520a(listIterator, spannableStringBuilder, next, (TextLikeSegment) h);
            }
            arrayList.add(h);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m46518a(SpannableStringBuilder spannableStringBuilder, AbstractC11200d dVar, BaseSegment baseSegment) {
        baseSegment.setText(spannableStringBuilder.subSequence(spannableStringBuilder.getSpanStart(dVar), spannableStringBuilder.getSpanEnd(dVar)).toString());
    }

    /* renamed from: a */
    private boolean m46521a(SpannableStringBuilder spannableStringBuilder, Object obj, Object obj2) {
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        int spanStart2 = spannableStringBuilder.getSpanStart(obj2);
        int spanEnd2 = spannableStringBuilder.getSpanEnd(obj2);
        if (spanStart < spanStart2 || spanEnd > spanEnd2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m46520a(ListIterator<AbstractC11200d> listIterator, SpannableStringBuilder spannableStringBuilder, AbstractC11200d dVar, TextLikeSegment textLikeSegment) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Object obj = (AbstractC11200d) listIterator.next();
            if (!(obj instanceof C11206j) || !m46521a(spannableStringBuilder, obj, dVar)) {
                listIterator.previous();
            } else {
                C11206j jVar = (C11206j) obj;
                TextSegment d = jVar.mo42803h();
                m46518a(spannableStringBuilder, (AbstractC11200d) jVar, (BaseSegment) d);
                arrayList.add(d);
            }
        }
        textLikeSegment.setTexts(arrayList);
        if (textLikeSegment instanceof HyperLinkSegment) {
            m46519a((HyperLinkSegment) textLikeSegment);
        }
    }
}
