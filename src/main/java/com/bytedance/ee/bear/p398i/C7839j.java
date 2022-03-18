package com.bytedance.ee.bear.p398i;

import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10464d;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/* renamed from: com.bytedance.ee.bear.i.j */
public class C7839j implements Function<C7835g, C7827a> {
    /* renamed from: a */
    public C7827a apply(C7835g gVar) throws Exception {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.f21147a);
        C10462b[] bVarArr = (C10462b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10462b.class);
        for (C10462b bVar : bVarArr) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(bVar), spannableStringBuilder.getSpanEnd(bVar));
        }
        C10468i[] iVarArr = (C10468i[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10468i.class);
        C10464d[] dVarArr = (C10464d[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10464d.class);
        C10463c[] cVarArr = (C10463c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10463c.class);
        HyperLinkSpan[] fVarArr = (HyperLinkSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), HyperLinkSpan.class);
        LinkedList linkedList = new LinkedList();
        for (C10468i iVar : iVarArr) {
            int spanStart = spannableStringBuilder.getSpanStart(iVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(iVar);
            if (spanStart != spanEnd) {
                linkedList.add(new C4517a.C4518a().mo17391a(spanStart).mo17395b(spanEnd).mo17398c(0).mo17392a(iVar.mo39767g()).mo17396b(iVar.mo39768i()).mo17399c(spannableStringBuilder.subSequence(spanStart, spanEnd).toString()).mo17402d(iVar.mo39769j()).mo17404e(iVar.mo39770k()).mo17393a(iVar.mo39771l()).mo17408i(iVar.mo39772m()).mo17400c(iVar.mo39773n()).mo17394a());
            }
        }
        for (C10464d dVar : dVarArr) {
            int spanStart2 = spannableStringBuilder.getSpanStart(dVar);
            int spanEnd2 = spannableStringBuilder.getSpanEnd(dVar);
            if (spanStart2 != spanEnd2) {
                linkedList.add(new C4517a.C4518a().mo17391a(spanStart2).mo17395b(spanEnd2).mo17398c(6).mo17392a(dVar.mo39757a()).mo17396b(dVar.mo39758b()).mo17399c(spannableStringBuilder.subSequence(spanStart2, spanEnd2).toString()).mo17394a());
            }
        }
        for (C10463c cVar : cVarArr) {
            int spanStart3 = spannableStringBuilder.getSpanStart(cVar);
            int spanEnd3 = spannableStringBuilder.getSpanEnd(cVar);
            if (spanStart3 != spanEnd3) {
                linkedList.add(new C4517a.C4518a().mo17391a(spanStart3).mo17395b(spanEnd3).mo17398c(cVar.mo39751j()).mo17392a(cVar.mo39750i()).mo17396b(cVar.mo39749g()).mo17399c(spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString()).mo17403e(cVar.mo39754m()).mo17407h(cVar.mo39753l()).mo17406g(cVar.mo39752k()).mo17394a());
            }
        }
        LinkedList linkedList2 = new LinkedList();
        for (HyperLinkSpan fVar : fVarArr) {
            int spanStart4 = spannableStringBuilder.getSpanStart(fVar);
            int spanEnd4 = spannableStringBuilder.getSpanEnd(fVar);
            if (spanStart4 != spanEnd4) {
                linkedList2.add(new C7838i(spanStart4, spanEnd4, spannableStringBuilder.subSequence(spanStart4, spanEnd4).toString()));
            }
        }
        Collections.sort(linkedList, new Comparator<C4517a>() {
            /* class com.bytedance.ee.bear.p398i.C7839j.C78401 */

            /* renamed from: a */
            public int compare(C4517a aVar, C4517a aVar2) {
                return aVar.f13212a - aVar2.f13212a;
            }
        });
        Collections.sort(linkedList2, new Comparator<C7838i>() {
            /* class com.bytedance.ee.bear.p398i.C7839j.C78412 */

            /* renamed from: a */
            public int compare(C7838i iVar, C7838i iVar2) {
                return iVar.f21154a - iVar2.f21154a;
            }
        });
        C4517a[] aVarArr = new C4517a[linkedList.size()];
        linkedList.toArray(aVarArr);
        C7838i[] iVarArr2 = new C7838i[linkedList2.size()];
        linkedList2.toArray(iVarArr2);
        return new C7827a(spannableStringBuilder.toString(), aVarArr, iVarArr2);
    }
}
